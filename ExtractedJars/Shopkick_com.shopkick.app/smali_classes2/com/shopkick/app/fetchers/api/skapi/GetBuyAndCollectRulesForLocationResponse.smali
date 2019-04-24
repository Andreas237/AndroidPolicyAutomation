.class public Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "GetBuyAndCollectRulesForLocationResponse.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public affiliateBarcodeImageUrl:Ljava/lang/String;

.field public affiliateBarcodeText:Ljava/lang/String;

.field public bestBuyShowBarcodeFlow:Ljava/lang/Boolean;

.field public chainLogoImageUrl:Ljava/lang/String;

.field public chainName:Ljava/lang/String;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public enrolledCards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;",
            ">;"
        }
    .end annotation
.end field

.field public escrowPeriodDays:Ljava/lang/Integer;

.field public inStorePerTransactionRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

.field public inStoreRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

.field public inStoreThresholdRules:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;",
            ">;"
        }
    .end annotation
.end field

.field public isBestBuyLocation:Ljava/lang/Boolean;

.field public isVisaOnlyLocation:Ljava/lang/Boolean;

.field public learnMoreWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

.field public mcommerceRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

.field public qrCodeLine_1:Ljava/lang/String;

.field public qrCodeLine_2:Ljava/lang/String;

.field public restrictionsText:Ljava/lang/String;

.field public userBarcodeImageUrl:Ljava/lang/String;

.field public userBarcodeText:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;
    .locals 2

    .line 53
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    if-eqz p1, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;
    .locals 1

    .line 48
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isBestBuyLocation:Ljava/lang/Boolean;

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->postProcess()V

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->mcommerceRateRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->postProcess()V

    .line 69
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStoreThresholdRules:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->postProcess()V

    goto :goto_0

    .line 71
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->enrolledCards:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->postProcess()V

    goto :goto_1

    .line 72
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->learnMoreWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->postProcess()V

    .line 73
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->bestBuyShowBarcodeFlow:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->bestBuyShowBarcodeFlow:Ljava/lang/Boolean;

    .line 74
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isVisaOnlyLocation:Ljava/lang/Boolean;

    if-nez v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->isVisaOnlyLocation:Ljava/lang/Boolean;

    .line 75
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/GetBuyAndCollectRulesForLocationResponse;->inStorePerTransactionRule:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectRuleDescription;->postProcess()V

    :cond_9
    return-void
.end method
