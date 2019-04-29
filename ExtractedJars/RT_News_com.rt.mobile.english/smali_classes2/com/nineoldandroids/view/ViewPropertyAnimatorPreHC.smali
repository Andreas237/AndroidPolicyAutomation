.class Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;
.super Lcom/nineoldandroids/view/ViewPropertyAnimator;
.source "ViewPropertyAnimatorPreHC.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;,
        Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;,
        Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;
    }
.end annotation


# static fields
.field private static final ALPHA:I = 0x200

.field private static final NONE:I = 0x0

.field private static final ROTATION:I = 0x10

.field private static final ROTATION_X:I = 0x20

.field private static final ROTATION_Y:I = 0x40

.field private static final SCALE_X:I = 0x4

.field private static final SCALE_Y:I = 0x8

.field private static final TRANSFORM_MASK:I = 0x1ff

.field private static final TRANSLATION_X:I = 0x1

.field private static final TRANSLATION_Y:I = 0x2

.field private static final X:I = 0x80

.field private static final Y:I = 0x100


# instance fields
.field private mAnimationStarter:Ljava/lang/Runnable;

.field private mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;

.field private mAnimatorMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/nineoldandroids/animation/Animator;",
            "Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;",
            ">;"
        }
    .end annotation
.end field

.field private mDuration:J

.field private mDurationSet:Z

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mInterpolatorSet:Z

.field private mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

.field mPendingAnimations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

.field private mStartDelay:J

.field private mStartDelaySet:Z

.field private final mView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 212
    invoke-direct {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimator;-><init>()V

    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z

    const-wide/16 v1, 0x0

    .line 60
    iput-wide v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J

    .line 66
    iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z

    .line 79
    iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolatorSet:Z

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    .line 91
    new-instance v1, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;

    invoke-direct {v1, p0, v0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;-><init>(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;)V

    iput-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;

    .line 130
    new-instance v0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;

    invoke-direct {v0, p0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$1;-><init>(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)V

    iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;

    .line 186
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    .line 213
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;

    .line 214
    invoke-static {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->wrap(Landroid/view/View;)Lcom/nineoldandroids/view/animation/AnimatorProxy;

    move-result-object p1

    iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    return-void
.end method

.method static synthetic access$100(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->startAnimation()V

    return-void
.end method

.method static synthetic access$200(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)Lcom/nineoldandroids/animation/Animator$AnimatorListener;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    return-object p0
.end method

.method static synthetic access$202(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;Lcom/nineoldandroids/animation/Animator$AnimatorListener;)Lcom/nineoldandroids/animation/Animator$AnimatorListener;
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    return-object p1
.end method

.method static synthetic access$300(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)Ljava/util/HashMap;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic access$400(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$500(Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;IF)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->setValue(IF)V

    return-void
.end method

.method private animateProperty(IF)V
    .locals 1

    .line 474
    invoke-direct {p0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->getValue(I)F

    move-result v0

    sub-float/2addr p2, v0

    .line 476
    invoke-direct {p0, p1, v0, p2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IFF)V

    return-void
.end method

.method private animatePropertyBy(IF)V
    .locals 1

    .line 488
    invoke-direct {p0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->getValue(I)F

    move-result v0

    .line 489
    invoke-direct {p0, p1, v0, p2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IFF)V

    return-void
.end method

.method private animatePropertyBy(IFF)V
    .locals 5

    .line 502
    iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    .line 504
    iget-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    .line 505
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nineoldandroids/animation/Animator;

    .line 506
    iget-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;

    .line 507
    invoke-virtual {v3, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->cancel(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 512
    iget v3, v3, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;->mPropertyMask:I

    if-nez v3, :cond_0

    move-object v0, v2

    :cond_1
    if-eqz v0, :cond_2

    .line 520
    invoke-virtual {v0}, Lcom/nineoldandroids/animation/Animator;->cancel()V

    .line 524
    :cond_2
    new-instance v0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;

    invoke-direct {v0, p1, p2, p3}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;-><init>(IFF)V

    .line 525
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 526
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eqz p1, :cond_3

    .line 528
    iget-object p2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 529
    iget-object p2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_3
    return-void
.end method

.method private getValue(I)F
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_7

    const/16 v0, 0x8

    if-eq p1, v0, :cond_6

    const/16 v0, 0x10

    if-eq p1, v0, :cond_5

    const/16 v0, 0x20

    if-eq p1, v0, :cond_4

    const/16 v0, 0x40

    if-eq p1, v0, :cond_3

    const/16 v0, 0x80

    if-eq p1, v0, :cond_2

    const/16 v0, 0x100

    if-eq p1, v0, :cond_1

    const/16 v0, 0x200

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    .line 601
    :pswitch_0
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationY()F

    move-result p1

    return p1

    .line 598
    :pswitch_1
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getTranslationX()F

    move-result p1

    return p1

    .line 625
    :cond_0
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getAlpha()F

    move-result p1

    return p1

    .line 622
    :cond_1
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getY()F

    move-result p1

    return p1

    .line 619
    :cond_2
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getX()F

    move-result p1

    return p1

    .line 610
    :cond_3
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationY()F

    move-result p1

    return p1

    .line 607
    :cond_4
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotationX()F

    move-result p1

    return p1

    .line 604
    :cond_5
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getRotation()F

    move-result p1

    return p1

    .line 616
    :cond_6
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleY()F

    move-result p1

    return p1

    .line 613
    :cond_7
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->getScaleX()F

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setValue(IF)V
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_7

    const/16 v0, 0x8

    if-eq p1, v0, :cond_6

    const/16 v0, 0x10

    if-eq p1, v0, :cond_5

    const/16 v0, 0x20

    if-eq p1, v0, :cond_4

    const/16 v0, 0x40

    if-eq p1, v0, :cond_3

    const/16 v0, 0x80

    if-eq p1, v0, :cond_2

    const/16 v0, 0x100

    if-eq p1, v0, :cond_1

    const/16 v0, 0x200

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 550
    :pswitch_0
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationY(F)V

    goto :goto_0

    .line 546
    :pswitch_1
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setTranslationX(F)V

    goto :goto_0

    .line 582
    :cond_0
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setAlpha(F)V

    goto :goto_0

    .line 578
    :cond_1
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setY(F)V

    goto :goto_0

    .line 574
    :cond_2
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setX(F)V

    goto :goto_0

    .line 562
    :cond_3
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationY(F)V

    goto :goto_0

    .line 558
    :cond_4
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotationX(F)V

    goto :goto_0

    .line 554
    :cond_5
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setRotation(F)V

    goto :goto_0

    .line 570
    :cond_6
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleY(F)V

    goto :goto_0

    .line 566
    :cond_7
    iget-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mProxy:Lcom/nineoldandroids/view/animation/AnimatorProxy;

    invoke-virtual {p1, p2}, Lcom/nineoldandroids/view/animation/AnimatorProxy;->setScaleX(F)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private startAnimation()V
    .locals 6

    const/4 v0, 0x1

    .line 436
    new-array v0, v0, [F

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    aput v2, v0, v1

    invoke-static {v0}, Lcom/nineoldandroids/animation/ValueAnimator;->ofFloat([F)Lcom/nineoldandroids/animation/ValueAnimator;

    move-result-object v0

    .line 437
    iget-object v2, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 439
    iget-object v3, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 441
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v1

    :goto_0
    if-ge v1, v3, :cond_0

    .line 443
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;

    .line 444
    iget v5, v5, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$NameValuesHolder;->mNameConstant:I

    or-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 446
    :cond_0
    iget-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    new-instance v3, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;

    invoke-direct {v3, v4, v2}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$PropertyBundle;-><init>(ILjava/util/ArrayList;)V

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    iget-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->addUpdateListener(Lcom/nineoldandroids/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 448
    iget-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorEventListener:Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC$AnimatorEventListener;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->addListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)V

    .line 449
    iget-boolean v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z

    if-eqz v1, :cond_1

    .line 450
    iget-wide v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J

    invoke-virtual {v0, v1, v2}, Lcom/nineoldandroids/animation/ValueAnimator;->setStartDelay(J)V

    .line 452
    :cond_1
    iget-boolean v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z

    if-eqz v1, :cond_2

    .line 453
    iget-wide v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDuration:J

    invoke-virtual {v0, v1, v2}, Lcom/nineoldandroids/animation/ValueAnimator;->setDuration(J)Lcom/nineoldandroids/animation/ValueAnimator;

    .line 455
    :cond_2
    iget-boolean v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolatorSet:Z

    if-eqz v1, :cond_3

    .line 456
    iget-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolator:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/ValueAnimator;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 458
    :cond_3
    invoke-virtual {v0}, Lcom/nineoldandroids/animation/ValueAnimator;->start()V

    return-void
.end method


# virtual methods
.method public alpha(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x200

    .line 420
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public alphaBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x200

    .line 426
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public cancel()V
    .locals 2

    .line 295
    iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 296
    iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimatorMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 298
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 299
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nineoldandroids/animation/Animator;

    .line 300
    invoke-virtual {v1}, Lcom/nineoldandroids/animation/Animator;->cancel()V

    goto :goto_0

    .line 303
    :cond_0
    iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mPendingAnimations:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 304
    iget-object v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 306
    iget-object v1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mAnimationStarter:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public getDuration()J
    .locals 2

    .line 244
    iget-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z

    if-eqz v0, :cond_0

    .line 245
    iget-wide v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDuration:J

    return-wide v0

    .line 249
    :cond_0
    new-instance v0, Lcom/nineoldandroids/animation/ValueAnimator;

    invoke-direct {v0}, Lcom/nineoldandroids/animation/ValueAnimator;-><init>()V

    invoke-virtual {v0}, Lcom/nineoldandroids/animation/ValueAnimator;->getDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public getStartDelay()J
    .locals 2

    .line 255
    iget-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z

    if-eqz v0, :cond_0

    .line 256
    iget-wide v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public rotation(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x10

    .line 336
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public rotationBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x10

    .line 342
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public rotationX(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x20

    .line 348
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public rotationXBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x20

    .line 354
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public rotationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x40

    .line 360
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public rotationYBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x40

    .line 366
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public scaleX(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x4

    .line 396
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public scaleXBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x4

    .line 402
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public scaleY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x8

    .line 408
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public scaleYBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x8

    .line 414
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public setDuration(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    .line 227
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Animators cannot have negative duration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    .line 230
    iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDurationSet:Z

    .line 231
    iput-wide p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mDuration:J

    return-object p0
.end method

.method public setInterpolator(Landroid/view/animation/Interpolator;)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x1

    .line 277
    iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolatorSet:Z

    .line 278
    iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mInterpolator:Landroid/view/animation/Interpolator;

    return-object p0
.end method

.method public setListener(Lcom/nineoldandroids/animation/Animator$AnimatorListener;)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mListener:Lcom/nineoldandroids/animation/Animator$AnimatorListener;

    return-object p0
.end method

.method public setStartDelay(J)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    .line 267
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Animators cannot have negative duration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    .line 270
    iput-boolean v0, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelaySet:Z

    .line 271
    iput-wide p1, p0, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->mStartDelay:J

    return-object p0
.end method

.method public start()V
    .locals 0

    .line 290
    invoke-direct {p0}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->startAnimation()V

    return-void
.end method

.method public translationX(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x1

    .line 372
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public translationXBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x1

    .line 378
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public translationY(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x2

    .line 384
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public translationYBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/4 v0, 0x2

    .line 390
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public x(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x80

    .line 312
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public xBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x80

    .line 318
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method

.method public y(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x100

    .line 324
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animateProperty(IF)V

    return-object p0
.end method

.method public yBy(F)Lcom/nineoldandroids/view/ViewPropertyAnimator;
    .locals 1

    const/16 v0, 0x100

    .line 330
    invoke-direct {p0, v0, p1}, Lcom/nineoldandroids/view/ViewPropertyAnimatorPreHC;->animatePropertyBy(IF)V

    return-object p0
.end method
