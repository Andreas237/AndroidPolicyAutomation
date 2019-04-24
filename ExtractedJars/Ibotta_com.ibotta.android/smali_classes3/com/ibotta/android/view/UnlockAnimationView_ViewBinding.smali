.class public Lcom/ibotta/android/view/UnlockAnimationView_ViewBinding;
.super Ljava/lang/Object;
.source "UnlockAnimationView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/view/UnlockAnimationView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/UnlockAnimationView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/view/UnlockAnimationView_ViewBinding;-><init>(Lcom/ibotta/android/view/UnlockAnimationView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/view/UnlockAnimationView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/view/UnlockAnimationView_ViewBinding;->target:Lcom/ibotta/android/view/UnlockAnimationView;

    const-string v0, "field \'lavAnimation\'"

    .line 26
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902e5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p2, p1, Lcom/ibotta/android/view/UnlockAnimationView;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/view/UnlockAnimationView_ViewBinding;->target:Lcom/ibotta/android/view/UnlockAnimationView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/ibotta/android/view/UnlockAnimationView_ViewBinding;->target:Lcom/ibotta/android/view/UnlockAnimationView;

    .line 36
    iput-object v1, v0, Lcom/ibotta/android/view/UnlockAnimationView;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    return-void

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
