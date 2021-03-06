.class public Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "BuyAndCollectProgram.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public cardholderConsentString:Ljava/lang/String;

.field public enrollWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

.field public loyaltyProgramId:Ljava/lang/Integer;

.field public maxCards:Ljava/lang/Integer;

.field public numCardsCurrentlyEnrolled:Ljava/lang/Integer;

.field public termsAndConditionsWebviewSkUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;
    .locals 2

    .line 38
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->enrollWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->postProcess()V

    :cond_0
    return-void
.end method
