.class Lo/enw$6$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/enw$6;


# direct methods
.method constructor <init>(Lo/enw$6;)V
    .locals 0

    .line 526
    iput-object p1, p0, Lo/enw$6$2;->b:Lo/enw$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .line 529
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogToMigrate setPositiveButton onclick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 532
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ix:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 535
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-boolean v0, v0, Lo/enw$6;->c:Z

    if-eqz v0, :cond_3

    .line 536
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 537
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    iget-object v1, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v1, v1, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/akt;->c(I)I

    move-result v6

    .line 538
    const-string v0, "pairGuideProductType"

    invoke-virtual {v5, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 539
    const-string v0, "pairGuideProductName"

    iget-object v1, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v1, v1, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 540
    const/16 v0, 0xa

    if-eq v0, v6, :cond_0

    const/4 v0, 0x3

    if-ne v0, v6, :cond_1

    .line 541
    :cond_0
    const-string v0, "pairGuideFromScanList"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto :goto_0

    .line 543
    :cond_1
    const-string v0, "pairGuideFromScanList"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 546
    :goto_0
    const-string v0, "pairGuideSelectName"

    iget-object v1, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v1, v1, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 547
    const-string v0, "pairGuideSelectAddress"

    iget-object v1, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v1, v1, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 548
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v0, v0, Lo/enw$6;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 549
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v0, v0, Lo/enw$6;->e:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 550
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v0, v0, Lo/enw$6;->a:Lo/enw;

    invoke-static {v0}, Lo/enw;->b(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 551
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v0, v0, Lo/enw$6;->a:Lo/enw;

    invoke-static {v0}, Lo/enw;->b(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 552
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v0, v0, Lo/enw$6;->a:Lo/enw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enw;->b(Lo/enw;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 554
    :cond_2
    goto :goto_1

    .line 555
    :cond_3
    iget-object v0, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v0, v0, Lo/enw$6;->a:Lo/enw;

    iget-object v1, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v1, v1, Lo/enw$6;->e:Landroid/content/Context;

    iget-object v2, p0, Lo/enw$6$2;->b:Lo/enw$6;

    iget-object v2, v2, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/enw;->d(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 558
    :goto_1
    return-void
.end method
