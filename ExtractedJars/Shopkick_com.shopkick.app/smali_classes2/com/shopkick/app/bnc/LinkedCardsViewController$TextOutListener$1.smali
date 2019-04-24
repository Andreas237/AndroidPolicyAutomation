.class Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener$1;
.super Lcom/shopkick/app/animation/AnimationEndListener;
.source "LinkedCardsViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->onAnimationEnded(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;


# direct methods
.method constructor <init>(Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;Landroid/view/View;)V
    .locals 0

    .line 722
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener$1;->this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;

    invoke-direct {p0, p2}, Lcom/shopkick/app/animation/AnimationEndListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnded(Landroid/view/animation/Animation;)V
    .locals 1

    .line 725
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener$1;->this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;

    invoke-static {p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;->access$400(Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;)Landroid/widget/TextView;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setClickable(Z)V

    return-void
.end method
