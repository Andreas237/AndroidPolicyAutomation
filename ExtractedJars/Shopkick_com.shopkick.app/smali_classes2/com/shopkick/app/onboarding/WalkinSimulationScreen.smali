.class public Lcom/shopkick/app/onboarding/WalkinSimulationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "WalkinSimulationScreen.java"


# instance fields
.field private final APP_EVENT_PAUSE_DURATION:I

.field private COACHMARK_ALIGN_WEIGHT:F

.field private final FADE_DURATION:I

.field private final GLOW_DURATION:I

.field private final PAUSE_DURATION:I

.field private final PHONE_SLIDE_DURATION:I

.field private final WALK_IN_DURATION:I

.field private backgroundFlipper:Landroid/widget/ViewFlipper;

.field private blinkAnimation:Landroid/view/animation/AlphaAnimation;

.field private coachmarkHolder:Landroid/widget/LinearLayout;

.field displayMetrics:Landroid/util/DisplayMetrics;

.field private glowView:Landroid/widget/ImageView;

.field private handler:Landroid/os/Handler;

.field private kickBubbleClickListener:Landroid/view/View$OnClickListener;

.field private phoneButtonClickListener:Landroid/view/View$OnClickListener;

.field private phoneView:Landroid/widget/ViewFlipper;

.field private screenText:Landroid/widget/TextView;

.field private startButtonClickListener:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/16 v0, 0x3e8

    .line 42
    iput v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->GLOW_DURATION:I

    const/16 v1, 0xc8

    .line 43
    iput v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->FADE_DURATION:I

    const/16 v1, 0x258

    .line 44
    iput v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->PHONE_SLIDE_DURATION:I

    .line 45
    iput v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->WALK_IN_DURATION:I

    const/16 v0, 0x320

    .line 46
    iput v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->APP_EVENT_PAUSE_DURATION:I

    const/16 v0, 0xfa

    .line 47
    iput v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->PAUSE_DURATION:I

    const v0, 0x3f63d70a    # 0.89f

    .line 48
    iput v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->COACHMARK_ALIGN_WEIGHT:F

    .line 157
    new-instance v0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$1;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->startButtonClickListener:Landroid/view/View$OnClickListener;

    .line 221
    new-instance v0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen$2;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneButtonClickListener:Landroid/view/View$OnClickListener;

    .line 280
    new-instance v0, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$jFBqdjl0wP2Dd3KSS02-r4D_VRc;

    invoke-direct {v0, p0}, Lcom/shopkick/app/onboarding/-$$Lambda$WalkinSimulationScreen$jFBqdjl0wP2Dd3KSS02-r4D_VRc;-><init>(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->kickBubbleClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->fadeOutCoachMarkAndText()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/os/Handler;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/animation/AlphaAnimation;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/animation/AlphaAnimation;
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getFadeOutAnimation()Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/View$OnClickListener;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->kickBubbleClickListener:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;I)Landroid/view/animation/AlphaAnimation;
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getFadeInAnimation(I)Landroid/view/animation/AlphaAnimation;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/TextView;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->screenText:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneView:Landroid/widget/ViewFlipper;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/view/View$OnClickListener;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneButtonClickListener:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ViewFlipper;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)F
    .locals 0

    .line 31
    iget p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->COACHMARK_ALIGN_WEIGHT:F

    return p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/LinearLayout;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->coachmarkHolder:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;)Landroid/widget/ImageView;
    .locals 0

    .line 31
    iget-object p0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    return-object p0
.end method

.method private fadeOutCoachMarkAndText()V
    .locals 2

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    .line 285
    invoke-direct {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getFadeOutAnimation()Landroid/view/animation/AlphaAnimation;

    move-result-object v0

    .line 286
    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->screenText:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 287
    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private getFadeInAnimation(I)Landroid/view/animation/AlphaAnimation;
    .locals 3

    .line 291
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0xc8

    .line 292
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 v1, 0x1

    .line 293
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    int-to-long v1, p1

    .line 294
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    return-object v0
.end method

.method private getFadeOutAnimation()Landroid/view/animation/AlphaAnimation;
    .locals 3

    .line 299
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0xc8

    .line 300
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    const/4 v1, 0x1

    .line 301
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V

    return-object v0
.end method

.method public static synthetic lambda$new$141(Lcom/shopkick/app/onboarding/WalkinSimulationScreen;Landroid/view/View;)V
    .locals 0

    .line 280
    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->popScreen()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    const/4 p3, 0x0

    const v0, 0x7f0c01ee

    .line 60
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 62
    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    const p2, 0x7f090115

    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    const p2, 0x7f090528

    .line 65
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ViewFlipper;

    iput-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneView:Landroid/widget/ViewFlipper;

    const p2, 0x7f090631

    .line 66
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->screenText:Landroid/widget/TextView;

    const p2, 0x7f090057

    .line 67
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ViewFlipper;

    iput-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    const p2, 0x7f090116

    .line 68
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->coachmarkHolder:Landroid/widget/LinearLayout;

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float p2, p2

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p2, v0

    const/high16 v0, 0x43a00000    # 320.0f

    cmpg-float p2, p2, v0

    if-gtz p2, :cond_0

    .line 72
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->coachmarkHolder:Landroid/widget/LinearLayout;

    new-instance v0, Landroid/widget/TableLayout$LayoutParams;

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, -0x1

    invoke-direct {v0, v2, v2, v1}, Landroid/widget/TableLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const p2, 0x3f30a3d7    # 0.69f

    .line 75
    iput p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->COACHMARK_ALIGN_WEIGHT:F

    goto :goto_0

    .line 76
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float p2, p2

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p2, v0

    const/high16 v0, 0x43c80000    # 400.0f

    cmpl-float p2, p2, v0

    if-lez p2, :cond_1

    const p2, 0x3f933333    # 1.15f

    .line 78
    iput p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->COACHMARK_ALIGN_WEIGHT:F

    .line 81
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->startButtonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 84
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, p2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 86
    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080326

    invoke-static {v0, v1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 89
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f080327

    invoke-static {v0, v2, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 94
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 96
    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f080328

    invoke-static {v0, v3, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 99
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v0, v3, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 101
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    invoke-virtual {p2, p3}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    iget-object p2, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    const/4 p3, 0x2

    invoke-virtual {p2, p3}, Landroid/widget/ViewFlipper;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p1
.end method

.method public getPopExitAnimationRes(Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    const p1, 0x7f01002b

    return p1
.end method

.method public getPushEnterAnimationRes(Ljava/lang/Class;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;)I"
        }
    .end annotation

    const p1, 0x7f010027

    return p1
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

    .line 54
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->displayMetrics:Landroid/util/DisplayMetrics;

    iput-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 55
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->handler:Landroid/os/Handler;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 146
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 6

    .line 111
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v3, 0xc8

    .line 112
    invoke-virtual {v0, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 113
    new-instance v5, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v5, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 114
    invoke-virtual {v5, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 116
    iget-object v3, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneView:Landroid/widget/ViewFlipper;

    invoke-virtual {v3, v0}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneView:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v5}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    .line 119
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v3, 0x1f4

    .line 120
    invoke-virtual {v0, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 121
    new-instance v5, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v5, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 122
    invoke-virtual {v5, v3, v4}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 124
    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v1, v0}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v5}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V

    .line 128
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-direct {v0, v2, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    iput-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatCount(I)V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatMode(I)V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->blinkAnimation:Landroid/view/animation/AlphaAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onScreenWillHide()V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->phoneView:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->clearAnimation()V

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->backgroundFlipper:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->clearAnimation()V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/onboarding/WalkinSimulationScreen;->glowView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V

    return-void
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
