.class public Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;
.super Ljava/lang/Object;
.source "VerifyDeviceCompleteActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;

.field private view7f090086:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;Landroid/view/View;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;

    const-string v0, "method \'onDoneClicked\'"

    const v1, 0x7f090086

    .line 30
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;->view7f090086:Landroid/view/View;

    .line 32
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity;

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;->view7f090086:Landroid/view/View;

    instance-of v2, v1, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 48
    :goto_0
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/verify/VerifyDeviceCompleteActivity_ViewBinding;->view7f090086:Landroid/view/View;

    return-void

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
