.class public Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;
.super Landroid/widget/LinearLayout;
.source "NumericLoyaltyCardView.java"


# instance fields
.field private cardName:Ljava/lang/String;

.field private cardNumber:Ljava/lang/String;

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


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->initLayout()V

    return-void
.end method

.method private initCardName()V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->cardName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->tvCardName:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->tvCardName:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->cardName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->tvCardName:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initCardNumber()V
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->cardNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->cardNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->tvCardNumber:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->setOrientation(I)V

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c0187

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 62
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private onSetup()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->initCardName()V

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->initCardNumber()V

    return-void
.end method


# virtual methods
.method public setup(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->cardName:Ljava/lang/String;

    .line 53
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->cardNumber:Ljava/lang/String;

    .line 55
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/loyalty/NumericLoyaltyCardView;->onSetup()V

    return-void
.end method
