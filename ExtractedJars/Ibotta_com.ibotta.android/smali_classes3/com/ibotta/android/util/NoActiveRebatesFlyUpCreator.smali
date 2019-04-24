.class public Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;
.source "NoActiveRebatesFlyUpCreator.java"


# instance fields
.field private final retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f0c00e8

    .line 21
    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;I)V

    .line 22
    iput-object p2, p0, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method


# virtual methods
.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 5

    const v0, 0x7f090450

    .line 27
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TextContainerView;

    .line 31
    iget-object v1, p0, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v2, -0x1

    const v3, 0x7f1102ec

    if-eqz v1, :cond_3

    .line 32
    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/common/VerificationType;->isPhysicalReceipt()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f1102ee

    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f1102ec

    goto :goto_0

    .line 36
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    sget-object v4, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v1, v4, :cond_2

    const v1, 0x7f1102eb

    goto :goto_0

    .line 38
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/common/VerificationType;->isOnline()Z

    move-result v1

    if-eqz v1, :cond_4

    const v1, 0x7f1102ed

    goto :goto_0

    .line 43
    :cond_3
    invoke-virtual {v0, v3}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(I)V

    :cond_4
    const/4 v1, -0x1

    :goto_0
    if-ne v1, v2, :cond_5

    const v1, 0x7f1102ec

    .line 50
    :cond_5
    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(I)V

    .line 52
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    return-object p1
.end method
