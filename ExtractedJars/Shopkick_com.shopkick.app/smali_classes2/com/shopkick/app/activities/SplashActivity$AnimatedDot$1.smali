.class Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;
.super Ljava/lang/Object;
.source "SplashActivity.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupZoomInAnimationListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V
    .locals 0

    .line 648
    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 662
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$800(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 663
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$900(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)I

    move-result p1

    if-nez p1, :cond_0

    .line 664
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$700(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {v0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$1000(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Landroid/view/animation/AnimationSet;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 667
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$1100(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 668
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$1100(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->startZoomInAnimation()V

    :cond_1
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 651
    iget-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;->this$1:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    invoke-static {p1}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->access$700(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
