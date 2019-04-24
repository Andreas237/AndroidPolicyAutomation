.class Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;
.super Landroid/animation/AnimatorListenerAdapter;
.source "FastBubbleScroller.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AnimationCompletionListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$1;)V
    .locals 0

    .line 237
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;-><init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;)V

    return-void
.end method

.method private completed()V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;->this$0:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->access$402(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 246
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 247
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;->completed()V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 240
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 241
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;->completed()V

    return-void
.end method
