.class Lcom/shopkick/app/widget/ToolTipView$3;
.super Ljava/lang/Object;
.source "ToolTipView.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/widget/ToolTipView;->show()V
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

    .line 238
    iput-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$3;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/widget/ToolTipView$3;->this$0:Lcom/shopkick/app/widget/ToolTipView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/widget/ToolTipView;->access$302(Lcom/shopkick/app/widget/ToolTipView;J)J

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
