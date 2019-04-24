.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;
.super Ljava/lang/Object;
.source "GalleryHeaderReducer.java"


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private final loyaltyLinkVariant:Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

.field private final pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/features/variant/pwi/PwiVariant;Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->loyaltyLinkVariant:Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    return-void
.end method

.method private getImButtonText(Ljava/lang/String;Lcom/ibotta/api/model/im/ImConnectionStatus;)Ljava/lang/String;
    .locals 3

    .line 90
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer$1;->$SwitchMap$com$ibotta$api$model$im$ImConnectionStatus:[I

    invoke-virtual {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p2, :pswitch_data_0

    .line 108
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v2, 0x7f11039b

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-interface {p2, v2, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 103
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const p2, 0x7f110399

    new-array v0, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 98
    :pswitch_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v2, 0x7f11039a

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    invoke-interface {p2, v2, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 92
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const p2, 0x7f110397

    new-array v0, v1, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private getLinkLoyaltyCardText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 4

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getLoyaltyQrCodeRetailers()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 146
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f1105a6

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 147
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isCardLinked()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v3, 0x7f110599

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-interface {v0, v3, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v3, 0x7f110598

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-interface {v0, v3, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getPwiButtonText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f11052d

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getRedeemText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 4

    .line 120
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v1, 0x7f1105e2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-interface {v0, v1, v3}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f110650

    new-array v1, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getWaysToEarn(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/im/ImConnectionStatus;)I
    .locals 1

    .line 186
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowImData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 190
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowRedeemButton(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/im/ImConnectionStatus;)Z

    move-result p2

    if-eqz p2, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 194
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowLinkLoyaltyCardButton(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    :cond_2
    return v0
.end method

.method private getWaysToEarnText(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le p1, v2, :cond_0

    .line 173
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f11041c

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v1

    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v4, v2

    .line 173
    invoke-interface {p1, v0, v4}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-ne p1, v2, :cond_1

    .line 176
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    const v0, 0x7f1105d7

    new-array v2, v2, [Ljava/lang/Object;

    .line 177
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v2, v1

    .line 176
    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/util/AppHelper;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method private shouldShowBuyIgcButton(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)Z"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->pwiVariant:Lcom/ibotta/android/features/variant/pwi/PwiVariant;

    invoke-interface {v0, p1}, Lcom/ibotta/android/features/variant/pwi/PwiVariant;->shouldShowRetailerHeaderButton(Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method private shouldShowImData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 0

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isAuxiliaryLoyaltyEnabled()Z

    move-result p1

    return p1
.end method

.method private shouldShowLinkLoyaltyCardButton(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 1

    .line 166
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isCredentialIntegration()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private shouldShowRedeemButton(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/im/ImConnectionStatus;)Z
    .locals 4

    .line 131
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->POS:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 132
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isAuxiliaryLoyaltyEnabled()Z

    move-result p1

    .line 133
    sget-object v1, Lcom/ibotta/api/model/im/ImConnectionStatus;->UNDEFINED:Lcom/ibotta/api/model/im/ImConnectionStatus;

    if-eq p2, v1, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-eqz p1, :cond_3

    if-nez p2, :cond_2

    if-nez v0, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2

    :cond_3
    xor-int/lit8 p1, v0, 0x1

    return p1
.end method


# virtual methods
.method public create(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/customer/Customer;Ljava/util/List;ZZ)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/customer/Customer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Lcom/ibotta/api/model/customer/Customer;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;ZZ)",
            "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 53
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object p2

    .line 55
    new-instance v0, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;-><init>()V

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->retailerName(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object v0

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->retailerLogoUrl(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object v0

    .line 58
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->getRedeemText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->redeemButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p4, :cond_1

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowRedeemButton(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/im/ImConnectionStatus;)Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    goto :goto_0

    :cond_1
    const/4 p4, 0x0

    .line 59
    :goto_0
    invoke-virtual {v0, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->redeemButtonVisible(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p4

    .line 62
    invoke-direct {p0, p3}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowBuyIgcButton(Ljava/util/List;)Z

    move-result p3

    invoke-virtual {p4, p3}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->buyIgcButtonVisible(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    .line 63
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->getPwiButtonText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->pwiButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->getLinkLoyaltyCardText(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->linkLoyaltyCardButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowLinkLoyaltyCardButton(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result p4

    invoke-virtual {p3, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->linkLoyaltyCardButtonVisible(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->getWaysToEarn(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/api/model/im/ImConnectionStatus;)I

    move-result p4

    invoke-direct {p0, p4, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->getWaysToEarnText(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->waysToEarnText(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    .line 67
    invoke-virtual {p3, p5}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->useIconRes(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    if-eqz p5, :cond_2

    const v1, 0x7f080252

    .line 68
    :cond_2
    invoke-virtual {p3, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->iconRes(I)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->loyaltyLinkVariant:Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;

    .line 69
    invoke-interface {p4}, Lcom/ibotta/android/features/variant/registerandactivate/loyaltylinkcta/LoyaltyLinkVariant;->enabled()Z

    move-result p4

    invoke-virtual {p3, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->isLoyaltyLinkVariantEnabled(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p3

    .line 70
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->shouldShowImData(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result p4

    if-eqz p4, :cond_3

    .line 73
    invoke-static {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->isImUndefined(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z

    move-result p4

    invoke-virtual {p3, p4}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->imStateUndefined(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p4

    .line 74
    invoke-static {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->isImVerified(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z

    move-result p5

    invoke-virtual {p4, p5}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->imStateVerified(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p4

    .line 75
    invoke-static {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->isImPending(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z

    move-result p5

    invoke-virtual {p4, p5}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->imStatePending(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p4

    .line 76
    invoke-static {p2}, Lcom/ibotta/api/model/im/ImConnectionStatus;->isImError(Lcom/ibotta/api/model/im/ImConnectionStatus;)Z

    move-result p5

    invoke-virtual {p4, p5}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->imStateError(Z)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    move-result-object p4

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryHeaderReducer;->getImButtonText(Ljava/lang/String;Lcom/ibotta/api/model/im/ImConnectionStatus;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->imButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;

    .line 80
    :cond_3
    invoke-virtual {p3}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState$Builder;->build()Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    move-result-object p1

    return-object p1

    .line 49
    :cond_4
    :goto_1
    sget-object p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->EMPTY:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    return-object p1
.end method
