.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ReceiptCaptureActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;

    const-string v0, "field \'rcvCamera\'"

    .line 29
    const-class v1, Lcom/ibotta/android/view/camera/ReceiptCameraView;

    const v2, 0x7f0903c3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/camera/ReceiptCameraView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    const-string v0, "field \'flGuideHolder\'"

    .line 30
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901f0

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->flGuideHolder:Landroid/widget/FrameLayout;

    const-string v0, "field \'tvReceiptCount\'"

    .line 31
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090567

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    const-string v0, "field \'tvWarning\'"

    .line 32
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09059a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    const-string v0, "field \'rcbvButtons\'"

    .line 33
    const-class v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    const v2, 0x7f0903c2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcvCamera:Lcom/ibotta/android/view/camera/ReceiptCameraView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->flGuideHolder:Landroid/widget/FrameLayout;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvReceiptCount:Landroid/widget/TextView;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->tvWarning:Landroid/widget/TextView;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureActivity;->rcbvButtons:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;

    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
