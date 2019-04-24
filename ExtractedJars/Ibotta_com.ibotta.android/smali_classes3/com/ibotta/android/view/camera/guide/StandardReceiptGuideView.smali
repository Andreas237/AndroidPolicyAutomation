.class public Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;
.super Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;
.source "StandardReceiptGuideView.java"


# instance fields
.field private bPrevReceipt:Landroid/graphics/Bitmap;

.field private bReceipt:Landroid/graphics/Bitmap;

.field private bdPrevReceipt:Landroid/graphics/drawable/BitmapDrawable;

.field private bdReceipt:Landroid/graphics/drawable/BitmapDrawable;

.field protected flGuide:Landroid/widget/FrameLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901ef
    .end annotation
.end field

.field protected ivPrevReceipt:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902bb
    .end annotation
.end field

.field protected ivReceipt:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902bf
    .end annotation
.end field

.field protected llDynamicWidthContent:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090306
    .end annotation
.end field

.field protected llLeftMargin:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090310
    .end annotation
.end field

.field protected llMiddle:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090318
    .end annotation
.end field

.field protected llRightMargin:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090326
    .end annotation
.end field

.field protected tvBottomTip:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090501
    .end annotation
.end field

.field protected tvTapToFocus:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090583
    .end annotation
.end field

.field protected tvTopOfReceipt:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09058a
    .end annotation
.end field

.field protected vDashes:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905ae
    .end annotation
.end field

.field protected vtvLeftEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905ce
    .end annotation
.end field

.field protected vtvRightEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905cf
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 61
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 66
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;I)V
    .locals 0

    .line 32
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->positionDashes(I)V

    return-void
.end method

.method private initBottomTooltip(Z)V
    .locals 1

    if-nez p1, :cond_1

    .line 117
    iget p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->captureCount:I

    if-gtz p1, :cond_0

    .line 118
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    const v0, 0x7f11056d

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    const v0, 0x7f11056e

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 123
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    const v0, 0x7f11056a

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 126
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private initReceiptEdgeMessage(Lcom/ibotta/android/util/RedemptionFormat;)V
    .locals 2

    const/4 v0, 0x1

    .line 99
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameCaps()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f1101dc

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvLeftEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    const/high16 v1, 0x43340000    # 180.0f

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->setRotation(F)V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvLeftEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvRightEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->setRotation(F)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vtvRightEdge:Lcom/ibotta/android/commons/view/text/VerticalTextView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/view/text/VerticalTextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTopOfReceiptMessage(Lcom/ibotta/android/util/RedemptionFormat;)V
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTopOfReceipt:Landroid/widget/TextView;

    iget v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->captureCount:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTopOfReceipt:Landroid/widget/TextView;

    const v1, 0x7f110600

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameCaps()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v3, v2

    invoke-virtual {p0, v1, v3}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initViewWidths()V
    .locals 5

    .line 130
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0a001b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    .line 131
    iget-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v2}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->x:I

    int-to-double v3, v2

    mul-double v0, v0, v3

    double-to-int v0, v0

    .line 134
    rem-int/lit8 v1, v0, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    sub-int/2addr v2, v0

    .line 139
    div-int/lit8 v2, v2, 0x2

    .line 142
    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llMiddle:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 143
    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llMiddle:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llLeftMargin:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 148
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 149
    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llLeftMargin:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llRightMargin:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 153
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 154
    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llRightMargin:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->llDynamicWidthContent:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private positionDashes(I)V
    .locals 3

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 283
    new-array v0, v0, [I

    .line 284
    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->getLocationInWindow([I)V

    .line 285
    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vDashes:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, 0x1

    aget v0, v0, v2

    add-int/2addr p1, v0

    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 286
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vDashes:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 287
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vDashes:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private setPrevReceiptBottomLineLocation(I)V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 267
    :cond_0
    new-instance v0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;

    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    invoke-direct {v0, p0, v1, p1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;-><init>(Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;Landroid/view/View;I)V

    .line 274
    invoke-virtual {v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView$1;->attach()V

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected getGuideView()Landroid/view/View;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->flGuide:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public init(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 0

    .line 78
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->init(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->initLayout()V

    return-void
.end method

.method protected initLayout()V
    .locals 3

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01d4

    const/4 v2, 0x1

    .line 85
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 86
    invoke-static {p0, p0}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v0

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v0

    .line 92
    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->initTopOfReceiptMessage(Lcom/ibotta/android/util/RedemptionFormat;)V

    const/4 v1, 0x0

    .line 93
    invoke-direct {p0, v1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->initBottomTooltip(Z)V

    .line 94
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->initReceiptEdgeMessage(Lcom/ibotta/android/util/RedemptionFormat;)V

    .line 95
    invoke-direct {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->initViewWidths()V

    return-void
.end method

.method public isPreviousReceiptApplicable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public pause()V
    .locals 2

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvBottomTip:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public previewStarted(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 72
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->tvTapToFocus:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public releaseCapturedReceipt()V
    .locals 3

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivReceipt:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdReceipt:Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bReceipt:Landroid/graphics/Bitmap;

    invoke-super {p0, v0, v1, v2}, Lcom/ibotta/android/view/camera/guide/AbstractReceiptGuideView;->releaseCapturedReceipt(Landroid/widget/ImageView;Landroid/graphics/drawable/BitmapDrawable;Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    .line 242
    iput-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdReceipt:Landroid/graphics/drawable/BitmapDrawable;

    .line 243
    iput-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bReceipt:Landroid/graphics/Bitmap;

    return-void
.end method

.method public releasePreviousReceipt()V
    .locals 2

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 225
    :cond_0
    iput-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdPrevReceipt:Landroid/graphics/drawable/BitmapDrawable;

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bPrevReceipt:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 227
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bPrevReceipt:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 230
    :cond_1
    iput-object v1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bPrevReceipt:Landroid/graphics/Bitmap;

    .line 231
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 234
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->vDashes:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setCapturedReceiptBitmap(Landroid/graphics/Bitmap;)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 203
    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bReceipt:Landroid/graphics/Bitmap;

    .line 204
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bReceipt:Landroid/graphics/Bitmap;

    invoke-direct {p1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdReceipt:Landroid/graphics/drawable/BitmapDrawable;

    .line 205
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivReceipt:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdReceipt:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 206
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivReceipt:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 208
    invoke-direct {p0, v0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->initBottomTooltip(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to set captured receipt image."

    .line 210
    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bReceipt:Landroid/graphics/Bitmap;

    if-nez p1, :cond_0

    const-string p1, "Failed to load receipt image."

    .line 214
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f1104bb

    invoke-static {p1, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method public setPreviousReceiptBitmap(Landroid/graphics/Bitmap;)V
    .locals 11

    const/4 v0, 0x0

    .line 161
    iput-object v0, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdPrevReceipt:Landroid/graphics/drawable/BitmapDrawable;

    const/4 v0, 0x0

    .line 164
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07015f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-eqz p1, :cond_0

    .line 167
    iget-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v2}, Lcom/ibotta/android/hardware/Hardware;->getScreenSize()Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->x:I

    .line 171
    iget-object v3, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 172
    iget v3, v10, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    sub-int/2addr v2, v3

    iget v3, v10, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    sub-int/2addr v2, v3

    int-to-float v2, v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 173
    new-instance v8, Landroid/graphics/Matrix;

    invoke-direct {v8}, Landroid/graphics/Matrix;-><init>()V

    .line 174
    invoke-virtual {v8, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 177
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int v5, v2, v1

    const/4 v4, 0x0

    .line 179
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    const/4 v9, 0x0

    move-object v3, p1

    move v7, v1

    .line 178
    invoke-static/range {v3 .. v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bPrevReceipt:Landroid/graphics/Bitmap;

    .line 180
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 182
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 184
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bPrevReceipt:Landroid/graphics/Bitmap;

    invoke-direct {p1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iput-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdPrevReceipt:Landroid/graphics/drawable/BitmapDrawable;

    .line 185
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdPrevReceipt:Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 186
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->ivPrevReceipt:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 187
    iget p1, v10, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    sub-int p1, v1, p1

    iput p1, v10, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 190
    :cond_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->setPrevReceiptBottomLineLocation(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to set previous receipt bitmap."

    .line 192
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/view/camera/guide/StandardReceiptGuideView;->bdPrevReceipt:Landroid/graphics/drawable/BitmapDrawable;

    if-nez p1, :cond_1

    const-string p1, "Failed to load previous receipt image."

    .line 196
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
