.class public interface abstract annotation Lio/radar/shadow/javax/inject/Named;
.super Ljava/lang/Object;
.source "Named.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/radar/shadow/javax/inject/Named;
        value = ""
    .end subannotation
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Qualifier;
.end annotation

.annotation runtime Ljava/lang/annotation/Documented;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation


# virtual methods
.method public abstract value()Ljava/lang/String;
.end method
