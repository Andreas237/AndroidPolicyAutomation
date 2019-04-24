.class public interface abstract annotation Lio/swagger/annotations/ApiKeyAuthDefinition;
.super Ljava/lang/Object;
.source "ApiKeyAuthDefinition.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/ApiKeyAuthDefinition;
        description = ""
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;
    }
.end annotation


# virtual methods
.method public abstract description()Ljava/lang/String;
.end method

.method public abstract in()Lio/swagger/annotations/ApiKeyAuthDefinition$ApiKeyLocation;
.end method

.method public abstract key()Ljava/lang/String;
.end method

.method public abstract name()Ljava/lang/String;
.end method
