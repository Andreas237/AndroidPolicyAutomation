.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity_ViewBinding;
.super Ljava/lang/Object;
.source "VerifyDeviceActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;

    const-string v0, "field \'tvDescription\'"

    .line 27
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->tvDescription:Landroid/widget/TextView;

    const-string v0, "field \'bStartVerification\'"

    .line 28
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f0900aa

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->bStartVerification:Landroid/widget/Button;

    const-string v0, "field \'bWhyDoThis\'"

    .line 29
    const-class v1, Landroid/widget/Button;

    const v2, 0x7f0900b3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->bWhyDoThis:Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->tvDescription:Landroid/widget/TextView;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->bStartVerification:Landroid/widget/Button;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceActivity;->bWhyDoThis:Landroid/widget/Button;

    return-void

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
