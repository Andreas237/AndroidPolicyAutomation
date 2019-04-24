.class public Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;
.super Landroid/widget/LinearLayout;
.source "GiftCardView.java"


# instance fields
.field private belowMinimumBalance:Ljava/lang/Boolean;

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivLogo:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902b4
    .end annotation
.end field

.field private logoUrl:Ljava/lang/String;

.field private minimum:F

.field private name:Ljava/lang/String;

.field protected tvMinimum:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090549
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected vDisabledOverlay:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b6
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 47
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 51
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 56
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 60
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;)V

    const/4 v0, 0x1

    .line 62
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->setOrientation(I)V

    .line 63
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->setClickable(Z)V

    const/4 v1, 0x0

    .line 64
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->setFocusable(Z)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c015f

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initLogo()V
    .locals 5

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->logoUrl:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 97
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->belowMinimumBalance:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->logoUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->ivLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->CARD_SMALL_DISABLED:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_0

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->logoUrl:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->ivLogo:Landroid/widget/ImageView;

    sget-object v4, Lcom/ibotta/android/views/images/Sizes;->CARD_SMALL:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :cond_1
    :goto_0
    return-void
.end method

.method private initMinimum()V
    .locals 5

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->minimum:F

    float-to-double v1, v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->tvMinimum:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f1100f0

    invoke-virtual {v2, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initName()V
    .locals 2

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->tvName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public setBelowMinimumBalance(Z)V
    .locals 1

    .line 86
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->belowMinimumBalance:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 88
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->vDisabledOverlay:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 90
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->vDisabledOverlay:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 92
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->initLogo()V

    return-void
.end method

.method public setLogoUrl(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->logoUrl:Ljava/lang/String;

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->initLogo()V

    return-void
.end method

.method public setMinimum(F)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->minimum:F

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->initMinimum()V

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->name:Ljava/lang/String;

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/account/withdraw/GiftCardView;->initName()V

    return-void
.end method
