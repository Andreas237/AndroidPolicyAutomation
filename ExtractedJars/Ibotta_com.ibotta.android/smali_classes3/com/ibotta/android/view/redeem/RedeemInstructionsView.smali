.class public Lcom/ibotta/android/view/redeem/RedeemInstructionsView;
.super Landroid/widget/LinearLayout;
.source "RedeemInstructionsView.java"


# static fields
.field private static final DEFAULT_MAX_RECEIPT_AGE:I = 0x7

.field private static final ONE_DAY:J = 0x5265c00L


# instance fields
.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->initLayout()V

    return-void
.end method

.method private initInstructionViews(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->removeAllViews()V

    const/4 v0, 0x0

    .line 106
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 107
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070187

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 112
    new-instance v2, Lcom/ibotta/android/view/redeem/RedeemInstructionView;

    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;-><init>(Landroid/content/Context;)V

    .line 114
    invoke-virtual {p0, v2, v1}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v1, v0, 0x1

    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionView;->setup(ILjava/lang/String;)V

    move v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private initLayout()V
    .locals 2

    .line 57
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/redeem/RedeemInstructionsView;)V

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->setOrientation(I)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "First instruction"

    .line 63
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "Second instruction"

    .line 64
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "Third instruction"

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->initInstructionViews(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method private insertStandardInstructions(Lcom/ibotta/android/util/RedemptionFormat;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/util/RedemptionFormat;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 85
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v1, v0}, Lcom/ibotta/android/util/Formatting;->date4(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getMaxReceiptAgeDays()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getMaxReceiptAgeDays()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x7

    :goto_0
    const-wide/32 v3, 0x5265c00

    int-to-long v5, v2

    mul-long v5, v5, v3

    .line 91
    new-instance v2, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v3, v5

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, v2}, Lcom/ibotta/android/util/Formatting;->date4(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1102f0

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    .line 95
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    iget-object v6, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v6}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    .line 94
    invoke-virtual {v2, v3, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f1102f1

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    .line 97
    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v6, v7

    aput-object v0, v6, v8

    aput-object v1, v6, v4

    .line 96
    invoke-virtual {v3, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 99
    invoke-interface {p2, v7, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 100
    invoke-interface {p2, v7, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method private onRetailerParcelSet()V
    .locals 3

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    .line 74
    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->POS_RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_1

    .line 76
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v2

    .line 75
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v0

    .line 77
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/ibotta/android/util/RedemptionFormat;->getAdditionalRedemptionInstructions()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 79
    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->insertStandardInstructions(Lcom/ibotta/android/util/RedemptionFormat;Ljava/util/List;)V

    .line 80
    invoke-direct {p0, v1}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->initInstructionViews(Ljava/util/List;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/view/redeem/RedeemInstructionsView;->onRetailerParcelSet()V

    return-void
.end method
