.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 0

    .line 820
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 823
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 824
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 825
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 827
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$10;->a:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->finish()V

    .line 830
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
