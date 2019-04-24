.class public Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "DetailScreenDetails.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public detailDescription:Ljava/lang/String;

.field public detailTeaserTextStyle:Lcom/shopkick/app/fetchers/api/skapi/View;

.field public detailTitle:Ljava/lang/String;

.field public detailWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

.field public rewardInfoHyperlinkText:Ljava/lang/String;

.field public rewardInfoWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

.field public teaserView:Lcom/shopkick/app/fetchers/api/skapi/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;
    .locals 2

    .line 39
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    if-eqz p1, :cond_0

    .line 40
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->postProcess()V

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->rewardInfoWebviewData:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->postProcess()V

    :cond_1
    return-void
.end method
