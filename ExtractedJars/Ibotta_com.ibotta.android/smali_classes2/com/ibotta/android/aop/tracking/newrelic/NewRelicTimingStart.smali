.class public interface abstract annotation Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStart;
.super Ljava/lang/Object;
.source "NewRelicTimingStart.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingStart;
        value = .enum Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract value()Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;
.end method
