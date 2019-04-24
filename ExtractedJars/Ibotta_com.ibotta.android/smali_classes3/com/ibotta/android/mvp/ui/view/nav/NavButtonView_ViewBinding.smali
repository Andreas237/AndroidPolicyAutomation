.class public Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_ViewBinding;
.super Ljava/lang/Object;
.source "NavButtonView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    const-string v0, "field \'ivNavIcon\'"

    .line 28
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f0902b7

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->ivNavIcon:Landroid/widget/ImageView;

    const-string v0, "field \'tvNavLabel\'"

    .line 29
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09054e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->tvNavLabel:Landroid/widget/TextView;

    const-string v0, "field \'lavNavBeaconAnimation\'"

    .line 30
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902e6

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->lavNavBeaconAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->ivNavIcon:Landroid/widget/ImageView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->tvNavLabel:Landroid/widget/TextView;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/nav/NavButtonView;->lavNavBeaconAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
