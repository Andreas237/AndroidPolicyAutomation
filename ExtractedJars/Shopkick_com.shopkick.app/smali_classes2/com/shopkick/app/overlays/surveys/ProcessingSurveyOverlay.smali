.class public Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "ProcessingSurveyOverlay.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ANIM_MAX_DURATION_10:I = 0x64

.field private static final ANIM_MAX_DURATION_100:I = 0x320

.field private static final ANIM_MAX_DURATION_25:I = 0xc8

.field private static final ANIM_MAX_DURATION_50:I = 0x190

.field private static final ANIM_MAX_DURATION_75:I = 0x258

.field private static final ANIM_SURFACE_MAX_TRANS_Y:I = 0x80


# instance fields
.field private animatorBGAlpha:Landroid/animation/ValueAnimator;

.field private animatorSet:Landroid/animation/AnimatorSet;

.field private animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

.field private animatorSurfaceTransY:Landroid/animation/ValueAnimator;

.field private background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

.field private btnPositive:Lcom/shopkick/app/widget/SKButton;

.field private contentAnimatorAlpha:Landroid/animation/ValueAnimator;

.field private contentSurface:Landroid/view/View;

.field private desc:Lcom/shopkick/app/widget/SKTextView;

.field private isHiding:Z

.field private layout:Landroid/view/View;

.field private mainImg:Lcom/shopkick/app/logging/UserEventImageView;

.field private maxSurfaceTransY:F

.field private minSurfaceTransY:F

.field private title:Lcom/shopkick/app/widget/SKTextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->isHiding:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)Lcom/shopkick/app/activities/BaseActivity;
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)Lcom/shopkick/app/activities/BaseActivity;
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p0

    return-object p0
.end method

.method private instantiateAnimVars()V
    .locals 3

    const/4 v0, 0x2

    .line 106
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/shopkick/app/overlays/surveys/-$$Lambda$ProcessingSurveyOverlay$03N3820o-aoT2PFwsUrH8entR6Q;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/surveys/-$$Lambda$ProcessingSurveyOverlay$03N3820o-aoT2PFwsUrH8entR6Q;-><init>(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private instantiateViews()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    const v1, 0x7f090200

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/UserEventConstraintLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    const v1, 0x7f090202

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentSurface:Landroid/view/View;

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    const v1, 0x7f090204

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/logging/UserEventImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->mainImg:Lcom/shopkick/app/logging/UserEventImageView;

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    const v1, 0x7f090205

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->title:Lcom/shopkick/app/widget/SKTextView;

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    const v1, 0x7f090203

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->desc:Lcom/shopkick/app/widget/SKTextView;

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    const v1, 0x7f090201

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    return-void
.end method

.method public static synthetic lambda$instantiateAnimVars$164(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 109
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->mainImg:Lcom/shopkick/app/logging/UserEventImageView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventImageView;->setAlpha(F)V

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->title:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->desc:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setAlpha(F)V

    return-void
.end method

.method private setupLoggingOnViews()V
    .locals 6

    .line 124
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x81

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x4f

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const/16 v2, 0x20

    .line 125
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    .line 126
    iget-object v3, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

    iget-object v4, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v5, 0x0

    invoke-virtual {v3, v0, v4, v5}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 133
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v3, 0x26

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 134
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOverlay(Ljava/lang/Integer;)V

    .line 135
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v2, v5}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method

.method private setupViewDimens(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 100
    iput v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->minSurfaceTransY:F

    const/16 v0, 0x80

    .line 101
    invoke-static {v0, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->maxSurfaceTransY:F

    return-void
.end method

.method private setupViews()V
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->btnPositive:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private startAnimsForHide()V
    .locals 4

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 209
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    const/4 v1, 0x3

    new-array v1, v1, [Landroid/animation/Animator;

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    new-instance v1, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay$1;-><init>(Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->reverse()V

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method private startAnimsForReveal()V
    .locals 4

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x190

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 171
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    const/4 v1, 0x4

    new-array v1, v1, [Landroid/animation/Animator;

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method

.method private stopAllCurrAnimsBeforeHide()V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 249
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    .line 253
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->pause()V

    :cond_3
    return-void
.end method


# virtual methods
.method protected animateForHide()V
    .locals 7

    .line 182
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->stopAllCurrAnimsBeforeHide()V

    .line 184
    iget-boolean v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->isHiding:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 187
    iput-boolean v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->isHiding:Z

    .line 190
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

    const-string v2, "alpha"

    const/4 v3, 0x2

    new-array v4, v3, [F

    invoke-virtual {v1}, Lcom/shopkick/app/widget/UserEventConstraintLayout;->getAlpha()F

    move-result v5

    const/4 v6, 0x0

    aput v5, v4, v6

    const/4 v5, 0x0

    aput v5, v4, v0

    invoke-static {v1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    .line 191
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentSurface:Landroid/view/View;

    const-string/jumbo v2, "translationY"

    new-array v4, v3, [F

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v5

    aput v5, v4, v6

    iget v5, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->maxSurfaceTransY:F

    aput v5, v4, v0

    invoke-static {v1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    .line 192
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentSurface:Landroid/view/View;

    const-string v2, "alpha"

    new-array v3, v3, [F

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v4

    aput v4, v3, v6

    const/high16 v4, 0x40000000    # 2.0f

    aput v4, v3, v0

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    .line 194
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->startAnimsForHide()V

    return-void
.end method

.method protected animateForReveal()V
    .locals 6

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->background:Lcom/shopkick/app/widget/UserEventConstraintLayout;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v3, v2, [F

    fill-array-data v3, :array_0

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentSurface:Landroid/view/View;

    const-string/jumbo v1, "translationY"

    new-array v3, v2, [F

    iget v4, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->maxSurfaceTransY:F

    const/4 v5, 0x0

    aput v4, v3, v5

    iget v4, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->minSurfaceTransY:F

    const/4 v5, 0x1

    aput v4, v3, v5

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentSurface:Landroid/view/View;

    const-string v1, "alpha"

    new-array v2, v2, [F

    fill-array-data v2, :array_1

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    .line 156
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->startAnimsForReveal()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 78
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    .line 80
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->instantiateViews()V

    .line 81
    invoke-direct {p0, p1}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->setupViewDimens(Landroid/content/Context;)V

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->instantiateAnimVars()V

    .line 83
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->setupViews()V

    .line 84
    invoke-direct {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->setupLoggingOnViews()V

    .line 86
    iget-object p1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    return-object p1
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c014a

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->layout:Landroid/view/View;

    return-object v0
.end method

.method protected obliterateAnimators()V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    const/4 v0, 0x0

    .line 277
    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorBGAlpha:Landroid/animation/ValueAnimator;

    .line 279
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 280
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 282
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceAlpha:Landroid/animation/ValueAnimator;

    .line 284
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 285
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 287
    :cond_2
    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animatorSurfaceTransY:Landroid/animation/ValueAnimator;

    .line 289
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 290
    iget-object v1, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->end()V

    .line 292
    :cond_3
    iput-object v0, p0, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->contentAnimatorAlpha:Landroid/animation/ValueAnimator;

    .line 294
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->obliterateAnimators()V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 262
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 265
    :pswitch_0
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animateForHide()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x7f090200
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 146
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 147
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/surveys/ProcessingSurveyOverlay;->animateForReveal()V

    return-void
.end method
