.class public interface abstract annotation Lcom/newrelic/agent/android/instrumentation/Trace;
.super Ljava/lang/Object;
.source "Trace.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/newrelic/agent/android/instrumentation/Trace;
        category = .enum Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;
        metricName = ""
        skipTransactionTrace = false
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# static fields
.field public static final NULL:Ljava/lang/String; = ""


# virtual methods
.method public abstract category()Lcom/newrelic/agent/android/instrumentation/MetricCategory;
.end method

.method public abstract metricName()Ljava/lang/String;
.end method

.method public abstract skipTransactionTrace()Z
.end method
