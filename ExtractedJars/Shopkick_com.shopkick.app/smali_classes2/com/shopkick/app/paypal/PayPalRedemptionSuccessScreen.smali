.class public Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "PayPalRedemptionSuccessScreen.java"


# static fields
.field public static final PayPalRedemptionSuccessScreenParamsEmail:Ljava/lang/String; = "email"


# instance fields
.field private denominationId:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private toolbarDefaultTextSize:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->denominationId:Ljava/lang/String;

    .line 34
    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->email:Ljava/lang/String;

    return-void
.end method

.method public static synthetic lambda$createScreen$183(Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;Landroid/view/View;)V
    .locals 1

    .line 88
    const-class p1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic lambda$createScreen$184(Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;Landroid/view/View;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->launchHomeActivity()V

    return-void
.end method

.method private launchHomeActivity()V
    .locals 3

    .line 123
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/activities/HomeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x4000000

    .line 124
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 125
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->startActivity(Landroid/content/Intent;)V

    .line 126
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    const/4 p3, 0x0

    const v0, 0x7f0c0151

    .line 57
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 61
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p2

    const-string v0, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {p2, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2

    .line 63
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTextSize()F

    move-result v0

    iput v0, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->toolbarDefaultTextSize:F

    const-string v0, ""

    .line 66
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->setAppScreenTitle(Ljava/lang/String;)V

    const v0, 0x7f080233

    .line 69
    invoke-virtual {p0, v0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->setHomeAsUpIndicator(I)V

    const v0, 0x7f090767

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 73
    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 74
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f110490

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    .line 75
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->email:Ljava/lang/String;

    aput-object v4, v3, p3

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v0, 0x7f0901e6

    .line 78
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 79
    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f11048c

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x2

    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "$"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->denominationId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, p3

    iget-object p3, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->email:Ljava/lang/String;

    aput-object p3, v1, v2

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const p2, 0x7f09065d

    .line 84
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    .line 86
    new-instance p3, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionSuccessScreen$rGWBenCoSSyFJ1QqINtRKJy-y1k;

    invoke-direct {p3, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionSuccessScreen$rGWBenCoSSyFJ1QqINtRKJy-y1k;-><init>(Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090224

    .line 92
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    .line 94
    new-instance p3, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionSuccessScreen$3q1s1crb3b6UhubYgGgCsAGMtlA;

    invoke-direct {p3, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionSuccessScreen$3q1s1crb3b6UhubYgGgCsAGMtlA;-><init>(Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    const-string p1, "denomination_id"

    .line 45
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->denominationId:Ljava/lang/String;

    const-string p1, "email"

    .line 46
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->email:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 118
    invoke-direct {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->launchHomeActivity()V

    .line 119
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onPause()V
    .locals 3

    .line 112
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onPause()V

    .line 113
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->toolbarDefaultTextSize:F

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTextSize(IF)V

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 104
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onResume()V

    .line 107
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionSuccessScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x2

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTextSize(IF)V

    return-void
.end method
