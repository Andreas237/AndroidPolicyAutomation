.class public Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;
.super Lcom/usebutton/sdk/purchasepath/Card;
.source "HowIbottaWorksCustomCard.java"


# instance fields
.field private ivDollarCircle:Landroid/widget/ImageView;

.field private tvMakeAPurchase:Landroid/widget/TextView;

.field private tvOrderProcessedShipped:Landroid/widget/TextView;

.field private tvRetailerPendingPeriod:Landroid/widget/TextView;

.field private tvTitle:Landroid/widget/TextView;

.field private final viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/CallToAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 29
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/purchasepath/Card;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    return-void
.end method

.method private initDollarCircle(Landroid/content/Context;)V
    .locals 2

    .line 77
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f080223

    const/4 v1, 0x0

    .line 76
    invoke-static {p1, v0, v1}, Landroid/support/graphics/drawable/VectorDrawableCompat;->create(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/support/graphics/drawable/VectorDrawableCompat;

    move-result-object p1

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->ivDollarCircle:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private initMakeAPurchase(Ljava/lang/String;)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvMakeAPurchase:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initOrderProcessedShipped(Ljava/lang/String;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvOrderProcessedShipped:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initRetailerPendingPeriod(Ljava/lang/String;)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvRetailerPendingPeriod:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTitle(Ljava/lang/String;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setup(Landroid/content/Context;)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->initTitle(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->getMakeAPurchaseMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->initMakeAPurchase(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->getOrderIsProcessedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->initOrderProcessedShipped(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCardViewModel;->getPendingPeriodMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->initRetailerPendingPeriod(Ljava/lang/String;)V

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->initDollarCircle(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f090478

    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvTitle:Landroid/widget/TextView;

    const v0, 0x7f090545

    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvMakeAPurchase:Landroid/widget/TextView;

    const v0, 0x7f090557

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvOrderProcessedShipped:Landroid/widget/TextView;

    const v0, 0x7f09056b

    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->tvRetailerPendingPeriod:Landroid/widget/TextView;

    const v0, 0x7f0902ce

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->ivDollarCircle:Landroid/widget/ImageView;

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/buttonsdk/card/customcard/HowIbottaWorksCustomCard;->setup(Landroid/content/Context;)V

    return-void
.end method

.method protected onCreateView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 36
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0144

    const/4 v2, 0x0

    .line 37
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
