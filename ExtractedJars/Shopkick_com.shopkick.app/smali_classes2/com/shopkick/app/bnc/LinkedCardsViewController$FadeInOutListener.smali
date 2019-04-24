.class Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;
.super Ljava/lang/Object;
.source "LinkedCardsViewController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/LinkedCardsViewController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FadeInOutListener"
.end annotation


# instance fields
.field private fadeInView:Landroid/view/View;

.field private fadeOutView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 737
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 738
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;->fadeOutView:Landroid/view/View;

    .line 739
    iput-object p2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;->fadeInView:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 749
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;->fadeOutView:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 750
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;->fadeInView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 751
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p1, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v0, 0x12c

    .line 752
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 753
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;->fadeInView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 744
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;->fadeInView:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
