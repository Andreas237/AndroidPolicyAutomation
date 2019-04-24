.class public Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "RedeemedRewardInfo.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public balanceDate:Ljava/lang/String;

.field public balanceInCents:Ljava/lang/Integer;

.field public barcodeImageUrl:Ljava/lang/String;

.field public cardNumber:Ljava/lang/String;

.field public chainsSpendableAt:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public code:Ljava/lang/String;

.field public companyInformation:Lcom/shopkick/app/fetchers/api/skapi/CompanyInformation;

.field public emailAddress:Ljava/lang/String;

.field public entityKey:Ljava/lang/String;

.field public eventNumber:Ljava/lang/String;

.field public expirationDate:Ljava/lang/String;

.field public externalLink:Ljava/lang/String;

.field public giftCardImageUrl:Ljava/lang/String;

.field public giftCardTileImageUrl:Ljava/lang/String;

.field public orderNumber:Ljava/lang/String;

.field public pinNumber:Ljava/lang/String;

.field public redeemedRewardId:Ljava/lang/String;

.field public redemptionDate:Ljava/lang/String;

.field public redemptionDateMs:Ljava/lang/Long;

.field public redemptionInstructions:Ljava/lang/String;

.field public resendUrl:Ljava/lang/String;

.field public skLink:Ljava/lang/String;

.field public specialInstructions:Ljava/lang/String;

.field public status:Ljava/lang/Integer;

.field public statusBannerText:Ljava/lang/String;

.field public termsAndConditions:Ljava/lang/String;

.field public title:Ljava/lang/String;

.field public transactionId:Ljava/lang/String;

.field public used:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;
    .locals 2

    .line 61
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;
    .locals 1

    .line 56
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->companyInformation:Lcom/shopkick/app/fetchers/api/skapi/CompanyInformation;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CompanyInformation;->postProcess()V

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method
