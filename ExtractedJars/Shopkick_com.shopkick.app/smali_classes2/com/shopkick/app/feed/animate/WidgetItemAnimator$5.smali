.class Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;
.super Landroid/animation/AnimatorListenerAdapter;
.source "WidgetItemAnimator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->animateAddImpl(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

.field final synthetic val$animation:Landroid/view/ViewPropertyAnimator;

.field final synthetic val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

.field final synthetic val$view:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/shopkick/app/feed/animate/WidgetItemAnimator;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iput-object p2, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iput-object p3, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$view:Landroid/view/View;

    iput-object p4, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$animation:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$view:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    .line 236
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$view:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 241
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$animation:Landroid/view/ViewPropertyAnimator;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 242
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$animation:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 243
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchAddFinished(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object p1, p1, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->mAddAnimations:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 245
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 230
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$5;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchAddStarting(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method
