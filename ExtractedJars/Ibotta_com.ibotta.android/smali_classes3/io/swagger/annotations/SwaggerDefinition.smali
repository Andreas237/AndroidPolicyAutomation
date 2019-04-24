.class public interface abstract annotation Lio/swagger/annotations/SwaggerDefinition;
.super Ljava/lang/Object;
.source "SwaggerDefinition.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/SwaggerDefinition;
        basePath = ""
        consumes = {
            ""
        }
        externalDocs = .subannotation Lio/swagger/annotations/ExternalDocs;
            url = ""
        .end subannotation
        host = ""
        info = .subannotation Lio/swagger/annotations/Info;
            title = ""
            version = ""
        .end subannotation
        produces = {
            ""
        }
        schemes = {
            .enum Lio/swagger/annotations/SwaggerDefinition$Scheme;->DEFAULT:Lio/swagger/annotations/SwaggerDefinition$Scheme;
        }
        securityDefinition = .subannotation Lio/swagger/annotations/SecurityDefinition;
        .end subannotation
        tags = {
            .subannotation Lio/swagger/annotations/Tag;
                name = ""
            .end subannotation
        }
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/swagger/annotations/SwaggerDefinition$Scheme;
    }
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
.method public abstract basePath()Ljava/lang/String;
.end method

.method public abstract consumes()[Ljava/lang/String;
.end method

.method public abstract externalDocs()Lio/swagger/annotations/ExternalDocs;
.end method

.method public abstract host()Ljava/lang/String;
.end method

.method public abstract info()Lio/swagger/annotations/Info;
.end method

.method public abstract produces()[Ljava/lang/String;
.end method

.method public abstract schemes()[Lio/swagger/annotations/SwaggerDefinition$Scheme;
.end method

.method public abstract securityDefinition()Lio/swagger/annotations/SecurityDefinition;
.end method

.method public abstract tags()[Lio/swagger/annotations/Tag;
.end method
