.class public interface abstract annotation Lio/swagger/annotations/SecurityDefinition;
.super Ljava/lang/Object;
.source "SecurityDefinition.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/SecurityDefinition;
        apiKeyAuthDefinitions = {}
        apiKeyAuthDefintions = {}
        basicAuthDefinions = {}
        basicAuthDefinitions = {}
        oAuth2Definitions = {}
    .end subannotation
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract apiKeyAuthDefinitions()[Lio/swagger/annotations/ApiKeyAuthDefinition;
.end method

.method public abstract apiKeyAuthDefintions()[Lio/swagger/annotations/ApiKeyAuthDefinition;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract basicAuthDefinions()[Lio/swagger/annotations/BasicAuthDefinition;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract basicAuthDefinitions()[Lio/swagger/annotations/BasicAuthDefinition;
.end method

.method public abstract oAuth2Definitions()[Lio/swagger/annotations/OAuth2Definition;
.end method
