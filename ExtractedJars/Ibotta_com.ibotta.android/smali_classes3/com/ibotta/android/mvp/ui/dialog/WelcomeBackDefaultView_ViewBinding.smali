.class public Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_ViewBinding;
.super Ljava/lang/Object;
.source "WelcomeBackDefaultView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;

    const-string v0, "field \'lavLoading\'"

    .line 28
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902e8

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->lavLoading:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "field \'ivRetailerLogo\'"

    .line 29
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b4

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->ivRetailerLogo:Landroid/widget/ImageView;

    const-string v0, "field \'tvWelcomeBackTitle\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09059b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->tvWelcomeBackTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvDescription\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->tvDescription:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->lavLoading:Lcom/airbnb/lottie/LottieAnimationView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->ivRetailerLogo:Landroid/widget/ImageView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->tvWelcomeBackTitle:Landroid/widget/TextView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/dialog/WelcomeBackDefaultView;->tvDescription:Landroid/widget/TextView;

    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
