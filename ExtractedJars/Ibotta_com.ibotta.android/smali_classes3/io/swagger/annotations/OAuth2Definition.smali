.class public interface abstract annotation Lio/swagger/annotations/OAuth2Definition;
.super Ljava/lang/Object;
.source "OAuth2Definition.java"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lio/swagger/annotations/OAuth2Definition;
        authorizationUrl = ""
        description = ""
        scopes = {}
        tokenUrl = ""
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/swagger/annotations/OAuth2Definition$Flow;
    }
.end annotation


# virtual methods
.method public abstract authorizationUrl()Ljava/lang/String;
.end method

.method public abstract description()Ljava/lang/String;
.end method

.method public abstract flow()Lio/swagger/annotations/OAuth2Definition$Flow;
.end method

.method public abstract key()Ljava/lang/String;
.end method

.method public abstract scopes()[Lio/swagger/annotations/Scope;
.end method

.method public abstract tokenUrl()Ljava/lang/String;
.end method
