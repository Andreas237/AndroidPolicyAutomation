.class public Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog_ViewBinding;
.super Ljava/lang/Object;
.source "AnimatedDialog_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    const-string v0, "field \'ibDismiss\'"

    .line 29
    const-class v1, Landroid/widget/ImageButton;

    const v2, 0x7f090233

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->ibDismiss:Landroid/widget/ImageButton;

    const-string v0, "field \'lavAnimation\'"

    .line 30
    const-class v1, Lcom/airbnb/lottie/LottieAnimationView;

    const v2, 0x7f0902e5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/airbnb/lottie/LottieAnimationView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "field \'tvTitle\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090587

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvDescription\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'bAction\'"

    .line 33
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f090079

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->bAction:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->ibDismiss:Landroid/widget/ImageButton;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->lavAnimation:Lcom/airbnb/lottie/LottieAnimationView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvTitle:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->tvDescription:Landroid/widget/TextView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/dialog/AnimatedDialog;->bAction:Landroid/widget/Button;

    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
