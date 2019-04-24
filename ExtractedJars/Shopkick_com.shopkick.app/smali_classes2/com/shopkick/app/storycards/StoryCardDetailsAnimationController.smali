.class public Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;
.super Ljava/lang/Object;
.source "StoryCardDetailsAnimationController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;
    }
.end annotation


# static fields
.field private static final DETAILS_TRANSLATE_ANIM_DURATION:I = 0x320


# instance fields
.field private callback:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;

.field private closeAnim:Landroid/view/animation/TranslateAnimation;

.field private openAnim:Landroid/view/animation/TranslateAnimation;

.field private viewToAnimate:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public contract(Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;Landroid/widget/RelativeLayout;I)V
    .locals 9

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->callback:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;

    .line 61
    iput-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    .line 63
    new-instance p1, Landroid/view/animation/TranslateAnimation;

    int-to-float v8, p3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    const-wide/16 p2, 0x320

    invoke-virtual {p1, p2, p3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 72
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    new-instance p2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, p0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 25
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->clearAnimation()V

    .line 27
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    if-eqz v0, :cond_1

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 31
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    if-eqz v0, :cond_2

    .line 34
    invoke-virtual {v0, v1}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 35
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    :cond_2
    return-void
.end method

.method public expand(Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;Landroid/widget/RelativeLayout;I)V
    .locals 9

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->callback:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;

    .line 41
    iput-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    .line 43
    new-instance p1, Landroid/view/animation/TranslateAnimation;

    int-to-float v6, p3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    .line 51
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    const-wide/16 p2, 0x320

    invoke-virtual {p1, p2, p3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    new-instance p2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, p0}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 55
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 56
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    iget-object p2, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 82
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->openAnim:Landroid/view/animation/TranslateAnimation;

    .line 83
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->callback:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;

    invoke-interface {p1}, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;->viewDoneExpanding()V

    .line 85
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->callback:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    if-ne p1, v0, :cond_1

    .line 87
    iput-object v1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->closeAnim:Landroid/view/animation/TranslateAnimation;

    .line 88
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->viewToAnimate:Landroid/widget/RelativeLayout;

    if-eqz p1, :cond_1

    const/16 v0, 0x8

    .line 89
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController;->callback:Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;

    invoke-interface {p1}, Lcom/shopkick/app/storycards/StoryCardDetailsAnimationController$IOfferDescAnimCallback;->viewDoneContracting()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
