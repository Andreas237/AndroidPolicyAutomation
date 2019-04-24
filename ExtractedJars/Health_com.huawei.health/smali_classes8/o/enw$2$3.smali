.class Lo/enw$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/enw$2;


# direct methods
.method constructor <init>(Lo/enw$2;)V
    .locals 0

    .line 426
    iput-object p1, p0, Lo/enw$2$3;->a:Lo/enw$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    .line 429
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogToMigrate setPositiveButton onclick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 431
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v1

    iget-object v2, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v2, v2, Lo/enw$2;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-virtual {v1, v2}, Lo/akt;->c(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/env;->a(I)Ljava/lang/String;

    move-result-object v4

    .line 432
    const-string v0, "CompatibilityInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "productName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 433
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    .line 434
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 435
    const-string v0, "device_type"

    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v1

    iget-object v2, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v2, v2, Lo/enw$2;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v2

    invoke-virtual {v1, v2}, Lo/akt;->c(I)I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 436
    const-string v0, "dname"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 437
    const-string v0, "isPorc"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 438
    const-string v0, "isFromWear"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 440
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/adddevice/AddDeviceIntroActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 441
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->d:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 444
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->j(Landroid/content/Context;)V

    .line 446
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->c:Lo/enw;

    invoke-static {v0}, Lo/enw;->e(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 447
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->c:Lo/enw;

    invoke-static {v0}, Lo/enw;->e(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 448
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->c:Lo/enw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enw;->e(Lo/enw;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 450
    :cond_1
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 451
    iget-object v0, p0, Lo/enw$2$3;->a:Lo/enw$2;

    iget-object v0, v0, Lo/enw$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "SURE"

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 453
    :cond_2
    return-void
.end method
