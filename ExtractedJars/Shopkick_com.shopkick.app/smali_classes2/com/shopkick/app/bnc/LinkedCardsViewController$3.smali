.class Lcom/shopkick/app/bnc/LinkedCardsViewController$3;
.super Lcom/shopkick/app/animation/AnimationEndListener;
.source "LinkedCardsViewController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/bnc/LinkedCardsViewController;->shrinkLinkedCardsWidget()V
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

    .line 445
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$3;->this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    invoke-direct {p0, p2}, Lcom/shopkick/app/animation/AnimationEndListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onAnimationEnded(Landroid/view/animation/Animation;)V
    .locals 0

    .line 448
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController$3;->this$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    invoke-static {p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->access$100(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    return-void
.end method
