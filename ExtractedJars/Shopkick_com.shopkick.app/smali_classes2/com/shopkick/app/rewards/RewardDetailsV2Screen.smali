.class public Lcom/shopkick/app/rewards/RewardDetailsV2Screen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RewardDetailsV2Screen.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "RewardDetailsV2Screen"

.field private static final TOAST_ANIM_HIDE_DURATION_MS:J = 0xc8L

.field private static final TOAST_ANIM_SHOW_DURATION_MS:J = 0xc8L

.field private static final TOAST_STAY_DURATION_MS:J = 0x640L


# instance fields
.field private btnRedeem:Lcom/shopkick/app/widget/SKTextView;

.field private buttonColorAnimator:Landroid/animation/ValueAnimator;

.field private denominationsList:Landroid/widget/LinearLayout;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private denominationsSection:Landroid/widget/HorizontalScrollView;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private isWebViewScreenCalled:Z

.field private kicksAmount:Lcom/shopkick/app/widget/SKTextView;

.field private kicksLabel:Lcom/shopkick/app/widget/SKTextView;

.field private kicksLayout:Landroid/view/View;

.field private lastCoinsBalance:I

.field private myRewardCheckmark:Landroid/widget/ImageView;

.field private myRewardLayout:Lcom/shopkick/app/widget/UserEventRelativeLayout;

.field private myRewardText:Lcom/shopkick/app/widget/SKTextView;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

.field private pageIndicatorContainer:Landroid/widget/RelativeLayout;

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field private promptBtnRedeem:Lcom/shopkick/app/widget/SKTextView;

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private redeemingDialog:Landroid/app/ProgressDialog;

.field private reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

.field private rewardCarousel:Landroid/support/v4/view/ViewPager;

.field private rewardCarouselAdapter:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

.field private rewardCarouselSection:Landroid/widget/RelativeLayout;

.field private rewardDescription:Landroid/widget/TextView;

.field private rewardDetailsHeader:Landroid/widget/TextView;

.field private rewardId:Ljava/lang/String;

.field private rewardTitle:Landroid/widget/TextView;

.field private rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field private selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

.field private selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

.field private slideAnimationSet:Landroid/view/animation/AnimationSet;

.field private toastLayout:Landroid/view/View;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)Landroid/view/View;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->toastLayout:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupBtnStateEnabled()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupBtnStateDisabled()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onClickDenomination(Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V

    return-void
.end method

.method private adjustAlpha(IF)I
    .locals 2

    .line 731
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p2

    .line 732
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    .line 733
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    .line 734
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    .line 735
    invoke-static {p2, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private adjustScrollForSelectedDenomination()V
    .locals 4

    .line 798
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    if-nez v0, :cond_0

    return-void

    .line 801
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v0

    .line 803
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    .line 804
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v1}, Landroid/widget/HorizontalScrollView;->getWidth()I

    move-result v1

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v3}, Landroid/widget/HorizontalScrollView;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v1, v3

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    .line 805
    invoke-virtual {v3}, Landroid/widget/HorizontalScrollView;->getPaddingRight()I

    move-result v3

    sub-int/2addr v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    .line 807
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    invoke-virtual {v3}, Lcom/shopkick/app/widget/RewardDenominationView;->getRight()I

    move-result v3

    sub-int/2addr v3, v0

    sub-int/2addr v3, v1

    .line 808
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/RewardDenominationView;->getLeft()I

    move-result v1

    if-ge v1, v0, :cond_2

    .line 809
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/RewardDenominationView;->getLeft()I

    move-result v1

    invoke-virtual {v0, v1, v2}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    goto :goto_1

    :cond_2
    if-lez v3, :cond_3

    .line 811
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    add-int/2addr v0, v3

    invoke-virtual {v1, v0, v2}, Landroid/widget/HorizontalScrollView;->smoothScrollTo(II)V

    :cond_3
    :goto_1
    return-void
.end method

.method private animateButtonColor(Z)V
    .locals 3

    .line 693
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 694
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 698
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 699
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_1

    const v0, 0x7f060120

    goto :goto_0

    :cond_1
    const v0, 0x7f0600c6

    .line 702
    :goto_0
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getResourceColor(I)I

    move-result v0

    const/4 v1, 0x2

    .line 703
    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ObjectAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    .line 704
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$tBYEwNE7TS8AZBRHI48e3zNyUrM;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 712
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$2;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Z)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 726
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 727
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private animateToast()V
    .locals 20

    move-object/from16 v0, p0

    .line 436
    new-instance v10, Landroid/view/animation/TranslateAnimation;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/high16 v9, -0x40800000    # -1.0f

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 440
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v10, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    const-wide/16 v1, 0xc8

    .line 441
    invoke-virtual {v10, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 442
    new-instance v3, Landroid/view/animation/TranslateAnimation;

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x1

    const/high16 v19, 0x3f800000    # 1.0f

    move-object v11, v3

    invoke-direct/range {v11 .. v19}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    const-wide/16 v4, 0x708

    .line 446
    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 447
    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v4}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v3, v4}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 448
    invoke-virtual {v3, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 450
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->clearToastAnimation()V

    .line 451
    new-instance v1, Landroid/view/animation/AnimationSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    iput-object v1, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    .line 452
    iget-object v1, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {v1, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 453
    iget-object v1, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {v1, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 454
    iget-object v1, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    new-instance v3, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$1;

    invoke-direct {v3, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$1;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    invoke-virtual {v1, v3}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 467
    iget-object v1, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->toastLayout:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 468
    iget-object v1, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->toastLayout:Landroid/view/View;

    iget-object v2, v0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {v1, v2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private clearToastAnimation()V
    .locals 1

    .line 429
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/animation/AnimationSet;->hasEnded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0}, Landroid/view/animation/AnimationSet;->cancel()V

    const/4 v0, 0x0

    .line 431
    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->slideAnimationSet:Landroid/view/animation/AnimationSet;

    :cond_0
    return-void
.end method

.method private confirmPhoneVerification()V
    .locals 9

    .line 576
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f1105d1

    .line 577
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v1, 0x7f1105dc

    .line 578
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f1105db

    .line 579
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$njcmDs7Gbp_thsQOAEzXDU3p7YY;

    invoke-direct {v5, p0}, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$njcmDs7Gbp_thsQOAEzXDU3p7YY;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    const v1, 0x7f1105ca

    .line 584
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v1, 0x0

    const/4 v8, 0x0

    .line 576
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private confirmRedemption()V
    .locals 9

    .line 590
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f1105d3

    .line 591
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v1, 0x7f1105d2

    .line 592
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f11016f

    .line 593
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$GxCw-63_NEeF5jZeLOjq1uHDviM;

    invoke-direct {v5, p0}, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$GxCw-63_NEeF5jZeLOjq1uHDviM;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    const v1, 0x7f11015b

    .line 598
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v1, 0x0

    const/4 v8, 0x0

    .line 590
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private confirmRegistration()V
    .locals 9

    .line 555
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f1105d1

    .line 556
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v1, 0x7f1105da

    .line 557
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v1, 0x7f1105d9

    .line 558
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$sFKouDF_IU-QH8GF8AB8mMrNUjg;

    invoke-direct {v5, p0}, Lcom/shopkick/app/rewards/-$$Lambda$RewardDetailsV2Screen$sFKouDF_IU-QH8GF8AB8mMrNUjg;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    const v1, 0x7f1105ca

    .line 563
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v1, 0x0

    const/4 v8, 0x0

    .line 555
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private goToRegistration()V
    .locals 3

    .line 569
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_screen"

    const/16 v2, 0x83

    .line 570
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "LaunchPhoneVerificationPostRegistration"

    const/4 v2, 0x1

    .line 571
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    const-class v1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v2, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private instantiateViews(Landroid/view/ViewGroup;)V
    .locals 1

    const v0, 0x7f0905ca

    .line 194
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardLayout:Lcom/shopkick/app/widget/UserEventRelativeLayout;

    const v0, 0x7f0905c8

    .line 195
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardCheckmark:Landroid/widget/ImageView;

    const v0, 0x7f0905c9

    .line 196
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardText:Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f0905be

    .line 199
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarouselSection:Landroid/widget/RelativeLayout;

    const v0, 0x7f0905bd

    .line 200
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarousel:Landroid/support/v4/view/ViewPager;

    const v0, 0x7f0904ff

    .line 201
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->pageIndicatorContainer:Landroid/widget/RelativeLayout;

    const v0, 0x7f0905e0

    .line 204
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardTitle:Landroid/widget/TextView;

    const v0, 0x7f0903ee

    .line 207
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksLayout:Landroid/view/View;

    const v0, 0x7f090384

    .line 208
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f0903e7

    .line 209
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksLabel:Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f0901e3

    .line 212
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    const v0, 0x7f0901e2

    .line 213
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsList:Landroid/widget/LinearLayout;

    const v0, 0x7f0905c6

    .line 216
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardDetailsHeader:Landroid/widget/TextView;

    const v0, 0x7f0905c4

    .line 217
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardDescription:Landroid/widget/TextView;

    const v0, 0x7f0900c0

    .line 220
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->promptBtnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f0905c7

    .line 221
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v0, 0x7f09076f

    .line 224
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->toastLayout:Landroid/view/View;

    return-void
.end method

.method private isRewardSelectable()Z
    .locals 2

    .line 519
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardsDataController;->getSelectableRewardIds()Ljava/util/LinkedHashSet;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 520
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic lambda$animateButtonColor$220(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;ILandroid/animation/ValueAnimator;)V
    .locals 1

    .line 705
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    .line 706
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->adjustAlpha(IF)I

    move-result p1

    .line 707
    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p2}, Lcom/shopkick/app/widget/SKTextView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    .line 710
    :cond_0
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p2, p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static synthetic lambda$confirmPhoneVerification$218(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 581
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    .line 582
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$confirmRedemption$219(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 595
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeem()V

    .line 596
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$confirmRegistration$217(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 560
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->goToRegistration()V

    .line 561
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private logRedeemClicked()V
    .locals 4

    .line 551
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xb0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x33

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private onClickDenomination(Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V
    .locals 2

    .line 643
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 644
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->animateToast()V

    .line 647
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onDenominationSelected(Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V

    .line 648
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->adjustScrollForSelectedDenomination()V

    return-void
.end method

.method private onDenominationChanged()V
    .locals 6

    .line 397
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    if-nez v0, :cond_0

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 399
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupBtnStateSoldOut()V

    goto :goto_0

    .line 401
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-static {v0}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 402
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    .line 403
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f060120

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 404
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 406
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->promptBtnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f1105ec

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 407
    invoke-direct {p0, v2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->animateButtonColor(Z)V

    goto :goto_0

    .line 409
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksAmount:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f0600c7

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->kicksLabel:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->promptBtnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f1105e5

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 414
    invoke-virtual {v4}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    .line 415
    invoke-static {v4}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    .line 413
    invoke-virtual {p0, v1, v3}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 412
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 417
    invoke-direct {p0, v5}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->animateButtonColor(Z)V

    :goto_0
    return-void
.end method

.method private onDenominationSelected(Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V
    .locals 2

    .line 653
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    if-eqz v0, :cond_0

    .line 654
    invoke-virtual {v0}, Lcom/shopkick/app/widget/RewardDenominationView;->markAsNotSelected()V

    .line 656
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    .line 657
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/RewardDenominationView;->markAsSelected()V

    .line 658
    iput-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 660
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onDenominationChanged()V

    .line 663
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 664
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/application/ProfileInfo;->setSelectedRewardId(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_1
    return-void
.end method

.method private onEventProfilePointsChanged()V
    .locals 2

    .line 789
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    iget v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->lastCoinsBalance:I

    if-eq v0, v1, :cond_0

    .line 790
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v0}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->lastCoinsBalance:I

    .line 791
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupDenominationViews()V

    :cond_0
    return-void
.end method

.method private onEventRewardRedemptionFailure(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 780
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeemingDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 781
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 782
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v0, "REWARD_REDEMPTION_RESPONSE"

    .line 784
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/fetchers/DataResponse;

    .line 785
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

.method private onEventRewardRedemptionSuccess(Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 756
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeemingDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 757
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 758
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string v0, "REWARD_REDEMPTION_WEBVIEW_URL"

    .line 761
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x6

    const v2, 0x7f1105ce

    .line 768
    invoke-virtual {p0, v2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 765
    invoke-static {p1, v0, v1, v2}, Lcom/shopkick/app/webview/WebViewScreen;->skParams(Ljava/lang/String;ZILjava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    .line 769
    const-class v0, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    const/4 p1, 0x1

    .line 770
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->isWebViewScreenCalled:Z

    goto :goto_0

    .line 773
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const-string v0, ""

    const v1, 0x7f110156

    .line 775
    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 773
    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_0
    return-void
.end method

.method private redeem()V
    .locals 5

    .line 605
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->denominationId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 606
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->denominationId:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 608
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardRedeemAction:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 610
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, ""

    const v3, 0x7f1105d4

    .line 612
    invoke-virtual {p0, v3}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 610
    invoke-static {v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeemingDialog:Landroid/app/ProgressDialog;

    .line 613
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->redeemReward(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 614
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardRedeemAction:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    .line 616
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "reward_id"

    .line 617
    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "denomination_id"

    .line 618
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 619
    const-class v0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_1

    .line 620
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardRedeemAction:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    .line 622
    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    if-eqz v2, :cond_3

    .line 623
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 625
    :cond_3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "reward_id"

    .line 626
    iget-object v4, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "denomination_id"

    .line 627
    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "quantity"

    .line 628
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    const-class v0, Lcom/shopkick/app/paypal/PayPalEnterEmailScreen;

    invoke-virtual {p0, v0, v2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private setMyRewardBtnChecked()V
    .locals 3

    .line 634
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardCheckmark:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 635
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardText:Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f1105e4

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 636
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardLayout:Lcom/shopkick/app/widget/UserEventRelativeLayout;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setClickable(Z)V

    return-void
.end method

.method private setupBtnMyReward()V
    .locals 4

    .line 240
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x1a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 241
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardLayout:Lcom/shopkick/app/widget/UserEventRelativeLayout;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->myRewardLayout:Lcom/shopkick/app/widget/UserEventRelativeLayout;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->isRewardSelectable()Z

    move-result v0

    if-nez v0, :cond_1

    .line 245
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setMyRewardBtnChecked()V

    :cond_1
    return-void
.end method

.method private setupBtnStateDisabled()V
    .locals 2

    .line 677
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f1105e8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 678
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f06015d

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 679
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f08026b

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    .line 680
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 681
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupBtnStateEnabled()V
    .locals 2

    .line 669
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f1105e8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 670
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f06015d

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 671
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f08026a

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    .line 672
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 673
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupBtnStateSoldOut()V
    .locals 2

    .line 685
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f1105e6

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 686
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f060121

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColorResource(I)V

    .line 687
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f0800c5

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setBackgroundResource(I)V

    .line 688
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setClickable(Z)V

    .line 689
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->btnRedeem:Lcom/shopkick/app/widget/SKTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupCarousalViews()V
    .locals 9

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    const/16 v1, 0x8

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarouselSection:Landroid/widget/RelativeLayout;

    const/16 v2, 0x140

    invoke-static {v0, v2, v2}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 263
    new-instance v0, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarousel:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v6, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->thumbnailImageUrl:Ljava/lang/String;

    move-object v3, v0

    move-object v8, p0

    invoke-direct/range {v3 .. v8}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;-><init>(Landroid/content/Context;Landroid/support/v4/view/ViewPager;Ljava/util/List;Ljava/lang/String;Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter$IRewardDetailsV2ViewPagerAdapterCallback;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarouselAdapter:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarousel:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarouselAdapter:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarousel:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarousel:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->clearOnPageChangeListeners()V

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarousel:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_1

    .line 274
    new-instance v0, Lcom/shopkick/app/widget/PageIndicator;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/widget/PageIndicator;-><init>(Landroid/content/Context;)V

    const v1, 0x7f080271

    .line 275
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/PageIndicator;->setActiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v0

    const v1, 0x7f080272

    .line 276
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/PageIndicator;->setInactiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->pageIndicatorContainer:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailImageUrls:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/widget/PageIndicator;->configureIndicators(Landroid/widget/RelativeLayout;II)V

    goto :goto_0

    .line 279
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->pageIndicatorContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_0
    return-void

    .line 251
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarouselSection:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 252
    sget-object v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    .line 253
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "RewardDetailsV2Screen"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Selected reward, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v3}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " does not have any "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "detailImageUrls. Carousel should be hidden."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Reward: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "has either null or 0 detailImage URLs. This is wrong."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private setupDenominationViews()V
    .locals 11

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    const/16 v1, 0x8

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 308
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    .line 309
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 311
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onDenominationChanged()V

    return-void

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsList:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, -0x1

    move v4, v0

    move v5, v4

    move v2, v3

    .line 325
    :goto_0
    iget-object v6, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v2, v6, :cond_5

    .line 330
    iget-object v6, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 331
    new-instance v7, Lcom/shopkick/app/widget/RewardDenominationView;

    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getContext()Landroid/content/Context;

    move-result-object v8

    iget-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->displayName:Ljava/lang/String;

    invoke-direct {v7, v8, v9}, Lcom/shopkick/app/widget/RewardDenominationView;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 332
    new-instance v8, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;

    invoke-direct {v8, p0, v6}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen$DenominationOnClickListener;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V

    invoke-virtual {v7, v8}, Lcom/shopkick/app/widget/RewardDenominationView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-gez v4, :cond_2

    .line 338
    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 339
    invoke-virtual {v8}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_2

    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 340
    invoke-virtual {v8}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v8, v8, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->rewardMallItemId:Ljava/lang/String;

    iget-object v9, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 341
    invoke-virtual {v9}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 342
    invoke-virtual {v8}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardDenominationInKicks()Ljava/lang/Long;

    move-result-object v8

    iget-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->longValue()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    if-gez v4, :cond_3

    .line 344
    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 345
    invoke-virtual {v8}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v8

    iget-object v9, v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lt v8, v9, :cond_3

    move v5, v2

    .line 349
    :cond_3
    :goto_1
    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {v8}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result v8

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-lt v8, v6, :cond_4

    .line 350
    invoke-virtual {v7}, Lcom/shopkick/app/widget/RewardDenominationView;->markAsRedeemable()V

    .line 354
    :cond_4
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x2

    invoke-direct {v6, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v8, 0xa

    .line 358
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v8

    invoke-virtual {v6, v3, v3, v8, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 359
    iget-object v8, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsList:Landroid/widget/LinearLayout;

    invoke-virtual {v8, v7, v2, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    if-le v4, v0, :cond_6

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsList:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RewardDenominationView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    .line 365
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    goto :goto_2

    :cond_6
    if-le v5, v0, :cond_7

    .line 368
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsList:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RewardDenominationView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    .line 369
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    goto :goto_2

    .line 371
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsList:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RewardDenominationView;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    .line 372
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    .line 375
    :goto_2
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RewardDenominationView;->markAsSelected()V

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->denominationId:Ljava/lang/Integer;

    if-nez v0, :cond_8

    goto :goto_3

    .line 383
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenominationView:Lcom/shopkick/app/widget/RewardDenominationView;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onDenominationSelected(Lcom/shopkick/app/widget/RewardDenominationView;Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;)V

    goto :goto_4

    .line 381
    :cond_9
    :goto_3
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    :goto_4
    return-void

    .line 302
    :cond_a
    :goto_5
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->denominationsSection:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 303
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onDenominationChanged()V

    return-void
.end method

.method private setupObservers()V
    .locals 3

    .line 423
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ProfilePointsChangedEvent"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 424
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 425
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method private setupRewardDetailsViews()V
    .locals 2

    .line 388
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailDescription:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardDescription:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailDescription:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 391
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardDetailsHeader:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardDescription:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupTitleViews()V
    .locals 4

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 285
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "RewardDetailsV2Screen"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Reward: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v3}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " with id: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " has no detailTitle."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    const-string v1, "RewardDetailsV2Screen"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Selected reward, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v3}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " does not have any "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "detailImageUrls. Carousel should be hidden."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Reward is null. ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". This is a problem."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 292
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardTitle:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->detailTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setupViews()V
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-nez v0, :cond_0

    return-void

    .line 232
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupBtnMyReward()V

    .line 233
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupCarousalViews()V

    .line 234
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupTitleViews()V

    .line 235
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupDenominationViews()V

    .line 236
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupRewardDetailsViews()V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0187

    const/4 v0, 0x0

    .line 171
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 173
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->instantiateViews(Landroid/view/ViewGroup;)V

    .line 174
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupViews()V

    .line 176
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setupObservers()V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    .line 147
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 148
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 149
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 150
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 151
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 152
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 153
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 154
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const-string p1, "reward_id"

    .line 156
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    if-nez p1, :cond_0

    .line 158
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    const-string p2, "RewardDetailsV2Screen"

    const-string v0, "RewardId is null, as passed in by screen params."

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RewardsDataController;->getReward(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    invoke-virtual {p1}, Lcom/shopkick/app/points/ProfilePoints;->getCoinsBalance()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->lastCoinsBalance:I

    .line 164
    sget-object p1, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->addResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 527
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0905c7

    if-eq p1, v0, :cond_1

    const v0, 0x7f0905ca

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 541
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/ProfileInfo;->getSelectedRewardId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 542
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardId:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->selectedDenomination:Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->costInKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/ProfileInfo;->setSelectedRewardId(Ljava/lang/String;Ljava/lang/Long;)V

    .line 543
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->setMyRewardBtnChecked()V

    .line 544
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->animateToast()V

    goto :goto_0

    .line 529
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->logRedeemClicked()V

    .line 531
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result p1

    if-nez p1, :cond_2

    .line 532
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->confirmRegistration()V

    goto :goto_0

    .line 533
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result p1

    if-nez p1, :cond_3

    .line 534
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->confirmPhoneVerification()V

    goto :goto_0

    .line 536
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->confirmRedemption()V

    :cond_4
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 511
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->rewardCarouselAdapter:Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;

    if-eqz v0, :cond_0

    .line 512
    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RewardDetailsV2ViewPagerAdapter;->destroy()V

    .line 514
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 515
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 742
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x601ea89f

    if-eq v0, v1, :cond_2

    const v1, 0x4aa9e71a    # 5567373.0f

    if-eq v0, v1, :cond_1

    const v1, 0x783d1232

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "ProfilePointsChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_1
    const-string v0, "REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const-string v0, "REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 750
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onEventProfilePointsChanged()V

    goto :goto_2

    .line 747
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onEventRewardRedemptionFailure(Ljava/util/HashMap;)V

    goto :goto_2

    .line 744
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->onEventRewardRedemptionSuccess(Ljava/util/HashMap;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFirstImageLoadSucceded()V
    .locals 1

    .line 854
    sget-object v0, Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;->DYNAMIC_CONTENT_SHOWN_CONSTRAINT:Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->removeResponsiveScreenConstraint(Lcom/shopkick/app/logging/ScreenTransitionPerformanceLogger$ResponsiveScreenConstraints;)V

    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 843
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/PageIndicator;->selectIndicator(I)V

    return-void
.end method

.method protected onScreenDidShow()V
    .locals 8

    .line 475
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 476
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->adjustScrollForSelectedDenomination()V

    .line 479
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->isWebViewScreenCalled:Z

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->maybeSyncOnRedemption()V

    const/4 v0, 0x0

    .line 481
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->isWebViewScreenCalled:Z

    .line 485
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->reward:Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-nez v0, :cond_1

    .line 486
    iget-object v1, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v2, 0x0

    const v0, 0x7f110155

    .line 487
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v0, 0x7f110142

    .line 488
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x7f11014f

    .line 489
    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->getString(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/rewards/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    new-instance v7, Lcom/shopkick/app/rewards/-$$Lambda$DcJkj-41dw4aFKf76s1wm96lrHk;

    invoke-direct {v7, p0}, Lcom/shopkick/app/rewards/-$$Lambda$DcJkj-41dw4aFKf76s1wm96lrHk;-><init>(Lcom/shopkick/app/rewards/RewardDetailsV2Screen;)V

    .line 486
    invoke-virtual/range {v1 .. v7}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_1
    return-void
.end method

.method protected onScreenWillHide()V
    .locals 2

    .line 497
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillHide()V

    .line 500
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->clearToastAnimation()V

    .line 501
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->toastLayout:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 503
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;->buttonColorAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    .line 504
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 183
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/screens/AppScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 188
    invoke-static {p1}, Lcom/shopkick/app/activities/BaseActivity;->setOnApplyWindowInsetListener(Landroid/view/View;)V

    .line 189
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->requestApplyInsets(Landroid/view/View;)V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
