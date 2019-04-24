.class Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;
.super Landroid/animation/AnimatorListenerAdapter;
.source "WidgetItemAnimator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->animateChangeImpl(Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

.field final synthetic val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

.field final synthetic val$newView:Landroid/view/View;

.field final synthetic val$newViewAnimation:Landroid/view/ViewPropertyAnimator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/feed/animate/WidgetItemAnimator;Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .locals 0

    .line 382
    iput-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iput-object p2, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iput-object p3, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$newViewAnimation:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$newView:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 390
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$newViewAnimation:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 391
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$newView:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 392
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$newView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 393
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iget-object v0, v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;->newHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchChangeFinished(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V

    .line 394
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object p1, p1, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->mChangeAnimations:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iget-object v0, v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;->newHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 395
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 385
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$8;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iget-object v0, v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;->newHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchChangeStarting(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V

    return-void
.end method
