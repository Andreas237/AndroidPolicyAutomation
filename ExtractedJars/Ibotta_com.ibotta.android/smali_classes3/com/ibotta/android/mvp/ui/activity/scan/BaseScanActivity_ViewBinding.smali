.class public Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;
.super Ljava/lang/Object;
.source "BaseScanActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

.field private view7f0901f6:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

    const-string v0, "field \'flScanditContainer\'"

    .line 31
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901f7

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flScanditContainer:Landroid/widget/FrameLayout;

    const-string v0, "field \'flTopHalf\'"

    .line 32
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901fb

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flTopHalf:Landroid/widget/FrameLayout;

    const-string v0, "field \'spvScanPortal\'"

    .line 33
    const-class v1, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;

    const v2, 0x7f090422

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->spvScanPortal:Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;

    const-string v0, "field \'flBottomHalf\'"

    .line 34
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901ea

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    const-string v0, "method \'onRootClicked\'"

    const v1, 0x7f0901f6

    .line 35
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;->view7f0901f6:Landroid/view/View;

    .line 37
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;)V

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

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 50
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;

    .line 52
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flScanditContainer:Landroid/widget/FrameLayout;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flTopHalf:Landroid/widget/FrameLayout;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->spvScanPortal:Lcom/ibotta/android/mvp/ui/view/scan/ScanPortalView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity;->flBottomHalf:Landroid/widget/FrameLayout;

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;->view7f0901f6:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 58
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/BaseScanActivity_ViewBinding;->view7f0901f6:Landroid/view/View;

    return-void

    .line 49
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
