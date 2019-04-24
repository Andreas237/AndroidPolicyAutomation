.class Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;
.super Lcom/shopkick/app/animation/AnimationEndListener;
.source "LinkedCardsViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/LinkedCardsViewController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TextOutListener"
.end annotation


# instance fields
.field private resultingText:Ljava/lang/String;

.field private textView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 0

    .line 712
    invoke-direct {p0, p1}, Lcom/shopkick/app/animation/AnimationEndListener;-><init>(Landroid/view/View;)V

    .line 713
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->textView:Landroid/widget/TextView;

    .line 714
    iput-object p2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->resultingText:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;)Landroid/widget/TextView;
    .locals 0

    .line 706
    iget-object p0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->textView:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public onAnimationEnded(Landroid/view/animation/Animation;)V
    .locals 2

    .line 719
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->textView:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->resultingText:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 720
    new-instance p1, Landroid/view/animation/AlphaAnimation;

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p1, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v0, 0x12c

    .line 721
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 722
    new-instance v0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener$1;

    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->textView:Landroid/widget/TextView;

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener$1;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 728
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->textView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method
