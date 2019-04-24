.class public Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "FTUEDiscoverTabOverlay2.java"


# static fields
.field private static final JEAN_ANIMATION_START_DELAY:I = 0x64

.field public static final START_DELAY:I = 0x64


# instance fields
.field private animatedSentences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/SpannableString;",
            ">;"
        }
    .end annotation
.end field

.field private animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private blueGradient:Landroid/widget/LinearLayout;

.field private button:Lcom/shopkick/app/widget/SKTextView;

.field private closeListener:Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

.field private closeOverlayClickListener:Landroid/view/View$OnClickListener;

.field private context:Landroid/content/Context;

.field private continueToStage2ClickListener:Landroid/view/View$OnClickListener;

.field private continueToStage3ClickListener:Landroid/view/View$OnClickListener;

.field private continueToStage4ClickListener:Landroid/view/View$OnClickListener;

.field private dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

.field private finishLessonClickListener:Landroid/view/View$OnClickListener;

.field private finishSubtitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

.field private finishSubtitleListenerStage2:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

.field private finishSubtitleListenerStage3:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

.field private finishSubtitleListenerStage4:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

.field private finishTitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private mainView:Landroid/view/ViewGroup;

.field private onLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

.field private parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

.field private roundImageView:Lcom/shopkick/app/widget/RoundImageView;

.field private roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicator:Landroid/widget/RelativeLayout;

.field private tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

.field private tapView:Landroid/view/View;

.field private textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

.field private textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

.field private textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

.field private textViewTitle:Lcom/shopkick/app/widget/SKTextView;

.field private textViewTitleHidden:Lcom/shopkick/app/widget/SKTextView;

.field private titleContainer:Landroid/widget/RelativeLayout;

.field private transparentDragView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    .line 151
    new-instance v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$1;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->onLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    .line 289
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$jdyYHBzuzo_HzZXSOa8LZjVj7N4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$jdyYHBzuzo_HzZXSOa8LZjVj7N4;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->closeListener:Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    .line 291
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$yiv_O1YyWbiIIvkOTXdooTZKcHc;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$yiv_O1YyWbiIIvkOTXdooTZKcHc;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->closeOverlayClickListener:Landroid/view/View$OnClickListener;

    .line 293
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$7cf89eMnrazTMrDbRHUXN59ztD0;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$7cf89eMnrazTMrDbRHUXN59ztD0;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    .line 340
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$wtFizXxJxbqorGbXCH859WamSis;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$wtFizXxJxbqorGbXCH859WamSis;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishTitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    .line 342
    new-instance v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$2;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    .line 349
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$FGkOaRbRcZ5cfYfSHp0izRulnTA;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$FGkOaRbRcZ5cfYfSHp0izRulnTA;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage2ClickListener:Landroid/view/View$OnClickListener;

    .line 392
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$fdItgZtpyC3EZzPz9SbyKsv4Gco;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$fdItgZtpyC3EZzPz9SbyKsv4Gco;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage2:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    .line 394
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$f5j0NXXno6c4oSvfRQyczKPpXPg;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$f5j0NXXno6c4oSvfRQyczKPpXPg;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage3ClickListener:Landroid/view/View$OnClickListener;

    .line 420
    new-instance v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$3;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage3:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    .line 427
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$UF95JT9FcsdDCuSqduXOHoeNgQE;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$UF95JT9FcsdDCuSqduXOHoeNgQE;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage4ClickListener:Landroid/view/View$OnClickListener;

    .line 456
    new-instance v0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2$4;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage4:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    .line 463
    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$L-b0RoW_ahXpmNt6RUXtwu9uYck;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$L-b0RoW_ahXpmNt6RUXtwu9uYck;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishLessonClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)Lcom/shopkick/app/ftue/DragConstraintLayout;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method private disableClose()V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setCloseListener(Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;)V

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->blueGradient:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->transparentDragView:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private hidePauseIcon()V
    .locals 2

    .line 275
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_0

    .line 276
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/browse/BrowseScreen;

    .line 277
    invoke-virtual {v0}, Lcom/shopkick/app/browse/BrowseScreen;->getPauseIcon()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private isCarouselDisplayed()Z
    .locals 1

    .line 240
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_0

    .line 241
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/browse/BrowseScreen;

    .line 242
    invoke-virtual {v0}, Lcom/shopkick/app/browse/BrowseScreen;->getIsCarouselVisible()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic lambda$fdItgZtpyC3EZzPz9SbyKsv4Gco(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->smoothScrollToPositionZero()V

    return-void
.end method

.method public static synthetic lambda$new$86(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V

    return-void
.end method

.method public static synthetic lambda$new$87(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;Landroid/view/View;)V
    .locals 1

    .line 291
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V

    return-void
.end method

.method public static synthetic lambda$new$88(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;Landroid/view/View;)V
    .locals 0

    .line 350
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForSubtitleStage2()V

    .line 351
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logDiscoveryLessonCompleteTheStepOne()V

    return-void
.end method

.method public static synthetic lambda$new$89(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;Landroid/view/View;)V
    .locals 1

    .line 395
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 396
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    .line 397
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToEndPosition(Z)V

    return-void
.end method

.method public static synthetic lambda$new$90(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;Landroid/view/View;)V
    .locals 1

    .line 428
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage3Completed(Z)V

    .line 429
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForSubtitleStage4()V

    .line 430
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logDiscoveryLessonCompleteTheStepThree()V

    return-void
.end method

.method public static synthetic lambda$new$91(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;Landroid/view/View;)V
    .locals 1

    .line 464
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage4Completed(Z)V

    .line 465
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonCompleted(Z)V

    .line 466
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logDiscoveryLessonCompleteTheStepFour()V

    .line 467
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logDiscoveryLessonComplete()V

    .line 468
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$onOverlayShown$85(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V
    .locals 3

    .line 130
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/RoundImageView;->getX()F

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/RoundImageView;->getX()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageViewLeftMargin(F)V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/RoundImageView;->getY()F

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/RoundImageView;->getY()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageViewTopMargin(F)V

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->setVisibility(I)V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateJeanIconToStartPosition()V

    return-void
.end method

.method public static synthetic lambda$wtFizXxJxbqorGbXCH859WamSis(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForSubtitleStage1()V

    return-void
.end method

.method private logDiscoveryLessonComplete()V
    .locals 2

    .line 477
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x65

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 478
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logDiscoveryLessonCompleteTheStepFour()V
    .locals 2

    .line 472
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 473
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logDiscoveryLessonCompleteTheStepOne()V
    .locals 2

    .line 355
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x61

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 356
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logDiscoveryLessonCompleteTheStepThree()V
    .locals 2

    .line 434
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x63

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 435
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private repositionTapIndicatorVertically()V
    .locals 5

    .line 182
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->isCarouselDisplayed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    const/high16 v3, 0x42c80000    # 100.0f

    .line 185
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    .line 186
    iget v2, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->leftMargin:I

    iget v3, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->rightMargin:I

    iget v4, v0, Landroid/support/constraint/ConstraintLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/support/constraint/ConstraintLayout$LayoutParams;->setMargins(IIII)V

    .line 187
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method private resetAnimationManager()V
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->cleanFTUEAnimationManager()V

    :cond_0
    return-void
.end method

.method private resetLayout()V
    .locals 5

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v2, 0x7f060139

    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setBackgroundColor(I)V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->transparentDragView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->titleContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    const-string v4, ""

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitleHidden:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitleHidden:Lcom/shopkick/app/widget/SKTextView;

    const-string v4, ""

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    const-string v4, ""

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    .line 210
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetAnimationManager()V

    return-void
.end method

.method private runAnimationManagerForSubtitleStage1()V
    .locals 4

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 330
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v1, 0x7f110309

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 332
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v0

    .line 333
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    .line 334
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 335
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetAnimationManager()V

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 337
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage2ClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private runAnimationManagerForSubtitleStage2()V
    .locals 5

    .line 364
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetLayout()V

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v1, 0x7f11031e

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 366
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v0

    .line 367
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetAnimationManager()V

    .line 368
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getFtueSkipAnimations()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 369
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage2:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v4, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v1, v4, v3}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    goto :goto_0

    .line 373
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    .line 374
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage2:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v4, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v1, v4, v2}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 378
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicator(Landroid/widget/RelativeLayout;)V

    .line 379
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicatorCircle1(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicatorCircle2(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 381
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicatorCircle3(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 382
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage3ClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage1Completed(Z)V

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFtueSkipAnimations()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 385
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 386
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->startAnimateTapIndicator()V

    .line 387
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->smoothScrollToPositionZero()V

    :cond_1
    return-void
.end method

.method private runAnimationManagerForSubtitleStage3()V
    .locals 4

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage3Completed(Z)V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage4Completed(Z)V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonCompleted(Z)V

    .line 407
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetLayout()V

    .line 408
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->disableClose()V

    .line 409
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v3, 0x7f110306

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 411
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 412
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v0

    .line 413
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    .line 414
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetAnimationManager()V

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage3:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v2, v3, v1}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage4ClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private runAnimationManagerForSubtitleStage4()V
    .locals 4

    .line 442
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetLayout()V

    .line 443
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->disableClose()V

    .line 444
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 445
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v2, 0x7f110312

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 446
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 447
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v0

    .line 448
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    .line 449
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 450
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetAnimationManager()V

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishSubtitleListenerStage4:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 452
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v2, 0x7f11031d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 453
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishLessonClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private runAnimationManagerForTitleStage1()V
    .locals 7

    .line 300
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetLayout()V

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v2, 0x7f0600c4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setBackgroundColor(I)V

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v1, 0x7f11031f

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 303
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v1

    .line 304
    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->titleContainer:Landroid/widget/RelativeLayout;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 305
    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v3, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 306
    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    const v5, 0x7f110309

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 307
    iget-object v5, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v3, v5, v6}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;

    move-result-object v3

    .line 308
    iget-object v5, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v5}, Lcom/shopkick/app/application/AppPreferences;->getFtueSkipAnimations()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 309
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->continueToStage2ClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishTitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v1, v2, v4}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonPaused(Z)V

    .line 317
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/application/AppPreferences;->setFtueSkipAnimations(Z)V

    goto :goto_0

    .line 319
    :cond_0
    iget-object v4, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitleHidden:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v4, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitleHidden:Lcom/shopkick/app/widget/SKTextView;

    const/4 v4, 0x4

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setVisibility(I)V

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->finishTitleListenerStage1:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->dismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    invoke-direct {p0, v0, v1, v3, v2}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V

    :goto_0
    return-void
.end method

.method private setRecyclerViewOverlayInvisible()V
    .locals 2

    .line 268
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_0

    .line 269
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/browse/BrowseScreen;

    const/16 v1, 0x8

    .line 270
    invoke-virtual {v0, v1}, Lcom/shopkick/app/browse/BrowseScreen;->setRecyclerViewOverlayVisibility(I)V

    :cond_0
    return-void
.end method

.method private setTabLayoutVisible()V
    .locals 2

    .line 261
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_0

    .line 262
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/browse/BrowseScreen;

    const/4 v1, 0x0

    .line 263
    invoke-virtual {v0, v1}, Lcom/shopkick/app/browse/BrowseScreen;->setTabLayoutVisibility(I)V

    :cond_0
    return-void
.end method

.method private setupAnimationManager(Lcom/shopkick/app/widget/SKTextView;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;Z)V
    .locals 2

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    new-instance v0, Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageViewAnimated(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageView(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setAnimatedSentences(Ljava/util/List;)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTextView(Lcom/shopkick/app/widget/SKTextView;)V

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTextAnimationFinishListener(Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;)V

    .line 231
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setOverlayDismissListener(Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;)V

    .line 232
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object p2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setOverlayLayout(Lcom/shopkick/app/ftue/DragConstraintLayout;)V

    if-eqz p4, :cond_1

    .line 234
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/16 p2, 0x258

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->startTextViewAnimation(I)V

    :cond_1
    return-void
.end method

.method private setupOverlay()V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage1Completed()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 165
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage2Completed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 166
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForSubtitleStage2()V

    goto :goto_0

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage1Completed()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 168
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage2Completed()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 169
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage3Completed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForSubtitleStage3()V

    goto :goto_0

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage1Completed()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 172
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage2Completed()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 173
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage3Completed()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 174
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage4Completed()Z

    move-result v0

    if-nez v0, :cond_2

    .line 175
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForSubtitleStage3()V

    goto :goto_0

    .line 177
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->runAnimationManagerForTitleStage1()V

    :goto_0
    return-void
.end method

.method private smoothScrollToPositionZero()V
    .locals 2

    .line 248
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    .line 250
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 251
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    .line 252
    instance-of v0, v0, Lcom/shopkick/app/browse/BrowseScreen;

    if-eqz v0, :cond_0

    .line 253
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/browse/BrowseScreen;

    .line 254
    invoke-virtual {v0}, Lcom/shopkick/app/browse/BrowseScreen;->smoothScrollToPositionZero()V

    :cond_0
    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 74
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    .line 75
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->context:Landroid/content/Context;

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090505

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/ftue/DragConstraintLayout;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->closeListener:Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setCloseListener(Lcom/shopkick/app/ftue/DragConstraintLayout$DragConstraintLayoutCloseListener;)V

    .line 78
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->parentLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->closeOverlayClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f09045f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    .line 80
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->onLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090088

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->blueGradient:Landroid/widget/LinearLayout;

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->blueGradient:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->closeOverlayClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090728

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090729

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09072a

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    .line 87
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09072b

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    .line 88
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->repositionTapIndicatorVertically()V

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f0907b3

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->transparentDragView:Landroid/view/View;

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09072d

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->tapView:Landroid/view/View;

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f0905f1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/RoundImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f0905f2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/RoundImageView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090769

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->titleContainer:Landroid/widget/RelativeLayout;

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090750

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitle:Lcom/shopkick/app/widget/SKTextView;

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f090751

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewTitleHidden:Lcom/shopkick/app/widget/SKTextView;

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f09074d

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitle:Lcom/shopkick/app/widget/SKTextView;

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f09074f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleMedium:Lcom/shopkick/app/widget/SKTextView;

    .line 99
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f09074e

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->textViewSubtitleHidden:Lcom/shopkick/app/widget/SKTextView;

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v0, 0x7f0900b8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKTextView;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->button:Lcom/shopkick/app/widget/SKTextView;

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12016c

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c00cb

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->mainView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 67
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 68
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p2, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 69
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method

.method public isCancelable()Z
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage2Completed()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->cleanFTUEAnimationManager()V

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->animationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    .line 143
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 2

    .line 121
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 122
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setTabLayoutVisible()V

    .line 123
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setRecyclerViewOverlayInvisible()V

    .line 124
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->hidePauseIcon()V

    .line 125
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->resetLayout()V

    .line 126
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;->setupOverlay()V

    .line 128
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 129
    new-instance p2, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$1Yxpyij_iFzAd9SV6xVgSRWeWF4;

    invoke-direct {p2, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEDiscoverTabOverlay2$1Yxpyij_iFzAd9SV6xVgSRWeWF4;-><init>(Lcom/shopkick/app/ftue/FTUEDiscoverTabOverlay2;)V

    const-wide/16 v0, 0x64

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
