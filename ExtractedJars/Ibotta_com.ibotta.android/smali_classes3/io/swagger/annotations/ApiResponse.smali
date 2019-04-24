.class public interface abstract annotation Lio/swagger/annotations/ApiResponse;
.super Ljava/lang/Object;
.source "ApiResponse.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/ApiResponse;
        reference = ""
        response = Ljava/lang/Void;
        responseContainer = ""
        responseHeaders = {
            .subannotation Lio/swagger/annotations/ResponseHeader;
                name = ""
                response = Ljava/lang/Void;
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
.method public abstract code()I
.end method

.method public abstract message()Ljava/lang/String;
.end method

.method public abstract reference()Ljava/lang/String;
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
