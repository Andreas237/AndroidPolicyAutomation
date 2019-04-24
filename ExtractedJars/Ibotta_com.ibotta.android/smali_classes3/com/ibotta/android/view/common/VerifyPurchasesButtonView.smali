.class public Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;
.super Landroid/widget/FrameLayout;
.source "VerifyPurchasesButtonView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;
    }
.end annotation


# instance fields
.field protected ivBottom:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090299
    .end annotation
.end field

.field protected ivButton:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09029b
    .end annotation
.end field

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field private style:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

.field protected tvLabel:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090539
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 51
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 21
    sget-object v0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    iput-object v0, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->style:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->inflateLayout(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    sget-object p2, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    iput-object p2, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->style:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 57
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->inflateLayout(Landroid/content/Context;)V

    return-void
.end method

.method private inflateLayout(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x1

    .line 88
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->setClickable(Z)V

    .line 89
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->setFocusable(Z)V

    const/4 v1, 0x0

    .line 90
    invoke-virtual {p0, v1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->setWillNotDraw(Z)V

    const-string v1, "layout_inflater"

    .line 92
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const v1, 0x7f0c01f3

    .line 93
    invoke-virtual {p1, v1, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 95
    invoke-static {p0, p0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->initUI()V

    return-void
.end method

.method private initUI()V
    .locals 2

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->tvLabel:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->style:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    invoke-virtual {v1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->getLabelId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->ivIcon:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->style:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    invoke-virtual {v1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->getDrawableId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public setStyle(Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->style:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->initUI()V

    return-void
.end method

.method public setStyleForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    if-eqz p1, :cond_3

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isPhysicalReceipt()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    sget-object p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isOnline()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 72
    sget-object p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->ONLINE:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    sget-object p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->LOYALTY:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne p1, v0, :cond_3

    .line 76
    sget-object p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->APP:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_4

    .line 81
    sget-object p1, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;->RECEIPT:Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;

    .line 84
    :cond_4
    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/common/VerifyPurchasesButtonView;->setStyle(Lcom/ibotta/android/view/common/VerifyPurchasesButtonView$Style;)V

    return-void
.end method
