package org.skywalking.apm.agent.test.helper;

import java.util.Collections;
import java.util.List;
import org.skywalking.apm.agent.core.context.trace.AbstractSpan;
import org.skywalking.apm.agent.core.context.trace.LogDataEntity;
import org.skywalking.apm.agent.core.context.trace.SpanLayer;
import org.skywalking.apm.agent.core.context.util.KeyValuePair;

public class SpanHelper {
    public static int getParentSpanId(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "parentSpanId");
        } catch (Exception e) {
        }

        return -9999;
    }

    public static List<LogDataEntity> getLogs(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "logs");
        } catch (Exception e) {
        }

        return Collections.emptyList();
    }

    public static List<KeyValuePair> getTags(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "tags");
        } catch (Exception e) {
        }

        return Collections.emptyList();
    }

    public static SpanLayer getLayer(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "layer");
        } catch (Exception e) {
        }

        return null;
    }

    public static String getComponentName(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "componentName");
        } catch (Exception e) {
        }

        return null;
    }

    public static int getComponentId(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "componentId");
        } catch (Exception e) {
        }

        return -1;
    }

    public static boolean getErrorOccurred(AbstractSpan tracingSpan) {
        try {
            return FieldGetter.getParentFieldValue(tracingSpan, "errorOccurred");
        } catch (Exception e) {
        }

        return false;
    }
}
