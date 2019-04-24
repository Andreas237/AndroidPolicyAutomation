.class public Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;
.super Lcom/usebutton/sdk/purchasepath/Card;
.source "SpecialConditionsCustomCard.java"


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private tvBody:Landroid/widget/TextView;

.field private tvTitle:Landroid/widget/TextView;

.field private final viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/purchasepath/CallToAction;Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/CallToAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/purchasepath/Card;-><init>(Lcom/usebutton/sdk/purchasepath/CallToAction;)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private initBody(Ljava/lang/String;)V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->tvBody:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v1, p1}, Lcom/ibotta/android/util/AppHelper;->getHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initTitle(Ljava/lang/String;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setup()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->initTitle(Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->viewModel:Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;

    invoke-virtual {v0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCardViewModel;->getSpecialConditions()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->initBody(Ljava/lang/String;)V

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

    iput-object v0, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->tvTitle:Landroid/widget/TextView;

    const v0, 0x7f0900bb

    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->tvBody:Landroid/widget/TextView;

    .line 45
    invoke-direct {p0}, Lcom/ibotta/android/buttonsdk/card/customcard/SpecialConditionsCustomCard;->setup()V

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

    const v1, 0x7f0c0145

    const/4 v2, 0x0

    .line 37
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
