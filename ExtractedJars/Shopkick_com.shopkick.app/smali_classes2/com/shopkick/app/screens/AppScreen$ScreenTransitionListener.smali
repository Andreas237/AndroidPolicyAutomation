.class Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;
.super Ljava/lang/Object;
.source "AppScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/screens/AppScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ScreenTransitionListener"
.end annotation


# instance fields
.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private enter:Z


# direct methods
.method public constructor <init>(ZLcom/shopkick/app/screens/AppScreen;)V
    .locals 0

    .line 579
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 580
    iput-boolean p1, p0, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;->enter:Z

    .line 581
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 590
    iget-object p1, p0, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_2

    .line 592
    iget-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;->enter:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    if-eqz v0, :cond_0

    .line 593
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/MultiScreenActivity;

    invoke-virtual {v0}, Lcom/shopkick/app/activities/MultiScreenActivity;->onScreenTransitionEnd()V

    .line 595
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/screens/AppScreen$ScreenTransitionListener;->enter:Z

    if-eqz v0, :cond_1

    .line 596
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->screenDidShow()V

    goto :goto_0

    .line 598
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->screenDidHide()V

    :cond_2
    :goto_0
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
