.class Lcom/shopkick/app/animation/FlipViews$1;
.super Ljava/lang/Object;
.source "FlipViews.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/animation/FlipViews;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/animation/FlipViews;


# direct methods
.method constructor <init>(Lcom/shopkick/app/animation/FlipViews;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/shopkick/app/animation/FlipViews$1;->this$0:Lcom/shopkick/app/animation/FlipViews;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 46
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews$1;->this$0:Lcom/shopkick/app/animation/FlipViews;

    invoke-static {p1}, Lcom/shopkick/app/animation/FlipViews;->access$000(Lcom/shopkick/app/animation/FlipViews;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews$1;->this$0:Lcom/shopkick/app/animation/FlipViews;

    invoke-static {p1}, Lcom/shopkick/app/animation/FlipViews;->access$200(Lcom/shopkick/app/animation/FlipViews;)Landroid/widget/RelativeLayout;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/animation/FlipViews$1;->this$0:Lcom/shopkick/app/animation/FlipViews;

    invoke-static {v0}, Lcom/shopkick/app/animation/FlipViews;->access$100(Lcom/shopkick/app/animation/FlipViews;)Landroid/view/animation/ScaleAnimation;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews$1;->this$0:Lcom/shopkick/app/animation/FlipViews;

    invoke-static {p1}, Lcom/shopkick/app/animation/FlipViews;->access$200(Lcom/shopkick/app/animation/FlipViews;)Landroid/widget/RelativeLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

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
