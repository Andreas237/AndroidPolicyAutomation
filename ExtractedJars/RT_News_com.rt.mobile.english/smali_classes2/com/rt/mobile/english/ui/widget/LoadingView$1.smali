.class Lcom/rt/mobile/english/ui/widget/LoadingView$1;
.super Ljava/lang/Object;
.source "LoadingView.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/LoadingView;->onLoaded()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/LoadingView;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/LoadingView;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView$1;->this$0:Lcom/rt/mobile/english/ui/widget/LoadingView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 86
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/LoadingView$1;->this$0:Lcom/rt/mobile/english/ui/widget/LoadingView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/rt/mobile/english/ui/widget/LoadingView;->setVisibility(I)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
