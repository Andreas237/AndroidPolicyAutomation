.class public interface abstract annotation Lio/swagger/annotations/Authorization;
.super Ljava/lang/Object;
.source "Authorization.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/Authorization;
        scopes = {
            .subannotation Lio/swagger/annotations/AuthorizationScope;
                description = ""
                scope = ""
            .end subannotation
        }
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
.method public abstract scopes()[Lio/swagger/annotations/AuthorizationScope;
.end method

.method public abstract value()Ljava/lang/String;
.end method
