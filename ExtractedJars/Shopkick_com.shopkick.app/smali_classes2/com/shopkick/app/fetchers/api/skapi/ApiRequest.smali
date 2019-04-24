.class public Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ApiRequest.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public contentType:Ljava/lang/String;

.field public headers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;",
            ">;"
        }
    .end annotation
.end field

.field public requestBody:Ljava/lang/String;

.field public requestPath:Ljava/lang/String;

.field public usePost:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;
    .locals 2

    .line 37
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->usePost:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->usePost:Ljava/lang/Boolean;

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ApiRequest;->headers:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ApiHeader;->postProcess()V

    goto :goto_0

    :cond_1
    return-void
.end method
