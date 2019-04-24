.class public interface abstract annotation Lio/swagger/annotations/ApiOperation;
.super Ljava/lang/Object;
.source "ApiOperation.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/ApiOperation;
        authorizations = {
            .subannotation Lio/swagger/annotations/Authorization;
                value = ""
            .end subannotation
        }
        code = 0xc8
        consumes = ""
        extensions = {
            .subannotation Lio/swagger/annotations/Extension;
                properties = {
                    .subannotation Lio/swagger/annotations/ExtensionProperty;
                        name = ""
                        value = ""
                    .end subannotation
                }
            .end subannotation
        }
        hidden = false
        httpMethod = ""
        nickname = ""
        notes = ""
        position = 0x0
        produces = ""
        protocols = ""
        response = Ljava/lang/Void;
        responseContainer = ""
        responseHeaders = {
            .subannotation Lio/swagger/annotations/ResponseHeader;
                name = ""
                response = Ljava/lang/Void;
            .end subannotation
        }
        responseReference = ""
        tags = {
            ""
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
.method public abstract authorizations()[Lio/swagger/annotations/Authorization;
.end method

.method public abstract code()I
.end method

.method public abstract consumes()Ljava/lang/String;
.end method

.method public abstract extensions()[Lio/swagger/annotations/Extension;
.end method

.method public abstract hidden()Z
.end method

.method public abstract httpMethod()Ljava/lang/String;
.end method

.method public abstract nickname()Ljava/lang/String;
.end method

.method public abstract notes()Ljava/lang/String;
.end method

.method public abstract position()I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract produces()Ljava/lang/String;
.end method

.method public abstract protocols()Ljava/lang/String;
.end method

.method public abstract response()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract responseContainer()Ljava/lang/String;
.end method

.method public abstract responseHeaders()[Lio/swagger/annotations/ResponseHeader;
.end method

.method public abstract responseReference()Ljava/lang/String;
.end method

.method public abstract tags()[Ljava/lang/String;
.end method

.method public abstract value()Ljava/lang/String;
.end method
