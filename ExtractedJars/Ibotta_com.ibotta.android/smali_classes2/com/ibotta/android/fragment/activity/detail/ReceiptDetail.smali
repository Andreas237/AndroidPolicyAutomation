.class public Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;
.super Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;
.source "ReceiptDetail.java"


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private home:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private itemized:Z

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private lvItems:Landroid/widget/ListView;

.field private receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private subtitle:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p5}, Lcom/ibotta/android/fragment/activity/detail/BaseActivityDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;)V

    const/4 p1, 0x0

    .line 49
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->itemized:Z

    .line 61
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 62
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 63
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 64
    iput-object p6, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 65
    iput-object p7, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 66
    iput-object p8, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method private getRetailerRedemptionFormat(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/util/RedemptionFormat;
    .locals 2

    if-eqz p1, :cond_0

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object p1

    goto :goto_0

    .line 266
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private onReceiptLoaded(Lcom/ibotta/api/model/receipt/Receipt;)V
    .locals 4

    .line 171
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getProcessingStateEnum()Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    move-result-object v0

    .line 172
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 173
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    .line 175
    :goto_1
    sget-object v3, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->PENDING:Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    if-ne v0, v3, :cond_2

    .line 176
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->updateForPendingReceipt()V

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    if-nez v2, :cond_3

    .line 178
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->updateForOtherReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V

    goto :goto_2

    :cond_3
    if-nez v1, :cond_4

    if-lez v2, :cond_4

    .line 180
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->updateForCompletedReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    if-lt v1, v0, :cond_5

    .line 182
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->updateForPendingVerificationReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private onRetailerLoaded(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 5

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 253
    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->getRetailerRedemptionFormat(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v0

    .line 254
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const v2, 0x7f110476

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    .line 255
    invoke-virtual {v0}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameCaps()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v4

    .line 254
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    :cond_0
    if-eqz p1, :cond_1

    .line 259
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->subtitle:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method private updateForCompletedReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 222
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->itemized:Z

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const v1, 0x7f110475

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    .line 225
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 226
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 229
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 231
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->lvItems:Landroid/widget/ListView;

    new-instance v0, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method private updateForOtherReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V
    .locals 6

    const/4 v0, 0x0

    .line 235
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->itemized:Z

    .line 237
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    const v2, 0x7f110487

    invoke-virtual {v1, v2}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(I)V

    .line 239
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->getRetailerRedemptionFormat(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object p1

    .line 243
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object p1

    .line 244
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, p1, v0}, Lcom/ibotta/android/util/Formatting;->prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    .line 245
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const v4, 0x7f110486

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v0

    const/4 p1, 0x1

    aput-object v1, v5, p1

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private updateForPendingReceipt()V
    .locals 7

    .line 210
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const v1, 0x7f11047a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    const/4 v0, 0x0

    .line 212
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->itemized:Z

    .line 213
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->getRetailerRedemptionFormat(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v1

    .line 214
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    .line 215
    invoke-virtual {v1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameCaps()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    const v6, 0x7f110479

    invoke-virtual {v3, v6, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 214
    invoke-virtual {v2, v3}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(Ljava/lang/String;)V

    .line 216
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->tcvParent:Lcom/ibotta/android/view/common/TextContainerView;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    new-array v4, v4, [Ljava/lang/Object;

    .line 217
    invoke-virtual {v1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v0

    const v0, 0x7f110478

    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 216
    invoke-virtual {v2, v0}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    return-void
.end method

.method private updateForPendingVerificationReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    .line 188
    iput-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->itemized:Z

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const v1, 0x7f11047a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    .line 191
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    .line 192
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 195
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 197
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    const-string v2, "layout_inflater"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v2, 0x7f0c012e

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 199
    invoke-virtual {v0, v2, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f09055c

    .line 200
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 202
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->lvItems:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v4, v3}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 206
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->lvItems:Landroid/widget/ListView;

    new-instance v0, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v4, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method


# virtual methods
.method public getActionBarSubtitle()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public getActionBarTitle()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getApiJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 108
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->activity:Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-virtual {v2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayId()I

    move-result v2

    .line 107
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerReceiptByIdJob(II)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v0, :cond_1

    .line 111
    new-instance v0, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 114
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 115
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getReceiptUrls()[Ljava/lang/String;
    .locals 4

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;

    .line 144
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/receipt/Receipt;->getReceiptImages()Ljava/util/List;

    move-result-object v0

    .line 145
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    .line 146
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 147
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/receipt/ReceiptImage;

    invoke-virtual {v3}, Lcom/ibotta/api/model/receipt/ReceiptImage;->getUrl()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 3

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;

    .line 159
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/receipt/Receipt;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 161
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 162
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v1}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, v1, v0}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected initView()V
    .locals 1

    const-string v0, ""

    .line 167
    iput-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->title:Ljava/lang/String;

    return-void
.end method

.method public isItemized()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->itemized:Z

    return v0
.end method

.method protected isStatusSelfManaged()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isViewReceipt()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isVisitSupport()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onApiJobsFinished()V
    .locals 3

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->receiptById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;

    .line 126
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/receipt/Receipt;->getRetailerId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 127
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->onReceiptLoaded(Lcom/ibotta/api/model/receipt/Receipt;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->home:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 131
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 132
    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 131
    invoke-interface {v2, v0, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    .line 133
    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->onRetailerLoaded(Lcom/ibotta/api/model/RetailerModel;)V

    :cond_1
    return-void
.end method

.method public setItemsView(Landroid/widget/ListView;Landroid/widget/TextView;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;->lvItems:Landroid/widget/ListView;

    return-void
.end method
