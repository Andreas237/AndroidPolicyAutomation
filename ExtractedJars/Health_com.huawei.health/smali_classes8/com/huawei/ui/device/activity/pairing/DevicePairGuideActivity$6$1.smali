.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;)V
    .locals 0

    .line 749
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 752
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showunBindDialog onclick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 754
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1$5;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;)V

    invoke-virtual {v0, v1}, Lo/env;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 761
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 762
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 763
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;->c:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 766
    :cond_0
    return-void
.end method
