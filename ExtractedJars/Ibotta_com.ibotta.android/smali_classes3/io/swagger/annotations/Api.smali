.class public interface abstract annotation Lio/swagger/annotations/Api;
.super Ljava/lang/Object;
.source "Api.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/Api;
        authorizations = {
            .subannotation Lio/swagger/annotations/Authorization;
                value = ""
            .end subannotation
        }
        basePath = ""
        consumes = ""
        description = ""
        hidden = false
        position = 0x0
        produces = ""
        protocols = ""
        tags = {
            ""
        }
        value = ""
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Inherited;
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract authorizations()[Lio/swagger/annotations/Authorization;
.end method

.method public abstract basePath()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract consumes()Ljava/lang/String;
.end method

.method public abstract description()Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract hidden()Z
.end method

.method public abstract position()I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract produces()Ljava/lang/String;
.end method

.method public abstract protocols()Ljava/lang/String;
.end method

.method public abstract tags()[Ljava/lang/String;
.end method

.method public abstract value()Ljava/lang/String;
.end method
