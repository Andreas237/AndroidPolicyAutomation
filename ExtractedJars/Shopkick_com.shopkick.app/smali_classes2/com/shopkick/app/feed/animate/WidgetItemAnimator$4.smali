.class Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;
.super Landroid/animation/AnimatorListenerAdapter;
.source "WidgetItemAnimator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->animateRemoveImpl(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
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
.method constructor <init>(Lcom/shopkick/app/feed/animate/WidgetItemAnimator;Landroid/support/v7/widget/RecyclerView$ViewHolder;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iput-object p2, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iput-object p3, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$animation:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$view:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 199
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$animation:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$view:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchRemoveFinished(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    .line 202
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object p1, p1, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->mRemoveAnimations:Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 203
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchFinishedWhenDone()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 194
    iget-object p1, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->this$0:Lcom/shopkick/app/feed/animate/WidgetItemAnimator;

    iget-object v0, p0, Lcom/shopkick/app/feed/animate/WidgetItemAnimator$4;->val$holder:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/feed/animate/WidgetItemAnimator;->dispatchRemoveStarting(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    return-void
.end method
