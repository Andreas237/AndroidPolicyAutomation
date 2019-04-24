.class Lcom/shopkick/app/view/FinderView$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "FinderView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/view/FinderView;->startAnimation(FFJLandroid/animation/TimeInterpolator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/view/FinderView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/view/FinderView;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/shopkick/app/view/FinderView$2;->this$0:Lcom/shopkick/app/view/FinderView;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 91
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/view/FinderView$2;->this$0:Lcom/shopkick/app/view/FinderView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/view/FinderView;->access$402(Lcom/shopkick/app/view/FinderView;Landroid/animation/ValueAnimator;)Landroid/animation/ValueAnimator;

    return-void
.end method
