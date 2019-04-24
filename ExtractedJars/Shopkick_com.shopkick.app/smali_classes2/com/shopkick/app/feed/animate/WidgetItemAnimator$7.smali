.class Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;
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

.field final synthetic val$oldViewAnim:Landroid/view/ViewPropertyAnimator;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/feed/animate/WidgetItemAnimator;Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .locals 0

    .line 358
    iput-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iput-object p2, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iput-object p3, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$oldViewAnim:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$view:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 366
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$oldViewAnim:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 367
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$view:Landroid/view/View;

    instance-of v0, p1, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 368
    check-cast p1, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/CutoutAnimUserEventConstraintLayout;->setCutoutRadius(F)V

    .line 370
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$view:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 371
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$view:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 372
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iget-object v0, v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;->oldHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchChangeFinished(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V

    .line 373
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object p1, p1, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->mChangeAnimations:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iget-object v0, v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;->oldHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 374
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$7;->val$changeInfo:Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;

    iget-object v0, v0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$ChangeInfo;->oldHolder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchChangeStarting(Landroid/support/v7/widget/RecyclerView$ViewHolder;Z)V

    return-void
.end method
