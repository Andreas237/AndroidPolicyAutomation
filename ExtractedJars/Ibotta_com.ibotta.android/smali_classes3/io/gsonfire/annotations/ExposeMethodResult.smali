.class public interface abstract annotation Lio/gsonfire/annotations/ExposeMethodResult;
.super Ljava/lang/Object;
.source "ExposeMethodResult.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/gsonfire/annotations/ExposeMethodResult;
        conflictResolution = .enum Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;->OVERWRITE:Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;
    }
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
.method public abstract conflictResolution()Lio/gsonfire/annotations/ExposeMethodResult$ConflictResolutionStrategy;
.end method

.method public abstract value()Ljava/lang/String;
.end method
