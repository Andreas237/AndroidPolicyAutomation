.class public Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "SaveStoryResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public errorHeader:Ljava/lang/String;

.field public errorMessage:Ljava/lang/String;

.field public storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;
    .locals 2

    .line 37
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;

    if-eqz p1, :cond_0

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->postProcess()V
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

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;
    .locals 1

    .line 32
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/SaveStoryResponse;->storyUserData:Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/StoryUserData;->postProcess()V

    :cond_1
    return-void
.end method
