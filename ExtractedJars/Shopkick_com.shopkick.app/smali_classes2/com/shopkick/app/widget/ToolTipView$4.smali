.class Lcom/shopkick/app/widget/ToolTipView$4;
.super Ljava/lang/Object;
.source "ToolTipView.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/widget/ToolTipView;->dismiss()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/widget/ToolTipView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/ToolTipView;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$4;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 279
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$4;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/ToolTipView;->destroy()V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 273
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$4;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/ToolTipView;->destroy()V

    .line 274
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$4;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-virtual {p1, p1}, Lcom/shopkick/app/widget/ToolTipView;->after(Lcom/shopkick/app/widget/ToolTipView;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
