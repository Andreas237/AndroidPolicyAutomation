.class Lcom/shopkick/app/ftue/FTUEAnimationManager$4;
.super Ljava/lang/Object;
.source "FTUEAnimationManager.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/ftue/FTUEAnimationManager;->prepareOverlayFadeOutAnimation()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$4;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 396
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager$4;->this$0:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->access$300(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/ftue/DragConstraintLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->setVisibility(I)V

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
