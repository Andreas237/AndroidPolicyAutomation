.class Lcom/shopkick/app/bnc/LinkedCardsViewController$1;
.super Lcom/shopkick/app/animation/AnimationEndListener;
.source "LinkedCardsViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureLinkAnotherCardButton()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$1;->this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    invoke-direct {p0, p2}, Lcom/shopkick/app/animation/AnimationEndListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnded(Landroid/view/animation/Animation;)V
    .locals 1

    .line 292
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$1;->this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    invoke-static {p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->access$000(Lcom/shopkick/app/bnc/LinkedCardsViewController;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
