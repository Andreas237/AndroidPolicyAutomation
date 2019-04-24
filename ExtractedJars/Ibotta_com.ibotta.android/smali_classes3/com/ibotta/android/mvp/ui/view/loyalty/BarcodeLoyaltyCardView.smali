.class public Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;
.super Landroid/widget/LinearLayout;
.source "BarcodeLoyaltyCardView.java"


# instance fields
.field private barcode:Ljava/lang/String;

.field protected bivBarcode:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900b8
    .end annotation
.end field

.field private cardName:Ljava/lang/String;

.field private cardNumberName:Ljava/lang/String;

.field private displayValue:Ljava/lang/String;

.field private format:Lcom/ibotta/android/barcode/Format;

.field protected tvCardName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090504
    .end annotation
.end field

.field protected tvCardNumber:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090505
    .end annotation
.end field

.field protected tvCardNumberName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090506
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initLayout()V

    return-void
.end method

.method private initBarcode()V
    .locals 3

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->bivBarcode:Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->barcode:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->format:Lcom/ibotta/android/barcode/Format;

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeImageView;->setup(Ljava/lang/String;Lcom/ibotta/android/barcode/Format;)V

    return-void
.end method

.method private initCardName()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->cardName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initCardNumber()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->displayValue:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->displayValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initCardNumberName()V
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->cardNumberName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumberName:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumberName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->cardNumberName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->tvCardNumberName:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 72
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->setOrientation(I)V

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0134

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 75
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initCardName()V

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initBarcode()V

    .line 81
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initCardNumber()V

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->initCardNumberName()V

    return-void
.end method


# virtual methods
.method public setup(Lcom/ibotta/android/barcode/Format;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->format:Lcom/ibotta/android/barcode/Format;

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->barcode:Ljava/lang/String;

    .line 60
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->displayValue:Ljava/lang/String;

    .line 61
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->cardName:Ljava/lang/String;

    .line 62
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->cardNumberName:Ljava/lang/String;

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->format:Lcom/ibotta/android/barcode/Format;

    if-nez p1, :cond_0

    .line 65
    sget-object p1, Lcom/ibotta/android/barcode/Format;->UPCA:Lcom/ibotta/android/barcode/Format;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->format:Lcom/ibotta/android/barcode/Format;

    .line 68
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/BarcodeLoyaltyCardView;->onSetup()V

    return-void
.end method
