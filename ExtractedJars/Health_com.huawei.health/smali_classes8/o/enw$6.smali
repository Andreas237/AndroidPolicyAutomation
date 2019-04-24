.class Lo/enw$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enw;->a(Landroid/content/Context;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/enw;

.field final synthetic b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field final synthetic c:Z

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/enw;Landroid/content/Context;ZLcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 519
    iput-object p1, p0, Lo/enw$6;->a:Lo/enw;

    iput-object p2, p0, Lo/enw$6;->e:Landroid/content/Context;

    iput-boolean p3, p0, Lo/enw$6;->c:Z

    iput-object p4, p0, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 522
    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_start_paring_title:I

    .line 523
    sget v4, Lcom/huawei/ui/device/R$string;->IDS_device_auto_scan_cancel_button:I

    .line 524
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lo/enw$6;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 525
    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v5

    .line 526
    new-instance v0, Lo/enw$6$2;

    invoke-direct {v0, p0}, Lo/enw$6$2;-><init>(Lo/enw$6;)V

    invoke-virtual {v5, v3, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 560
    new-instance v0, Lo/enw$6$1;

    invoke-direct {v0, p0}, Lo/enw$6$1;-><init>(Lo/enw$6;)V

    invoke-virtual {v5, v4, v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 570
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->dialog_migrate_low_version:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 571
    sget v0, Lcom/huawei/ui/device/R$id;->compatibility_remind:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/CheckBox;

    .line 572
    sget v0, Lcom/huawei/ui/device/R$id;->compatibility_content:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 573
    const-string v9, ""

    .line 574
    iget-object v0, p0, Lo/enw$6;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_compatibility_note_mig_to_health_new:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 575
    iget-object v0, p0, Lo/enw$6;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_app_name_health:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 576
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v11, v0, v1

    iget-object v1, p0, Lo/enw$6;->b:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v10, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 577
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 578
    new-instance v0, Lo/enw$6$3;

    invoke-direct {v0, p0}, Lo/enw$6$3;-><init>(Lo/enw$6;)V

    invoke-virtual {v7, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 593
    invoke-virtual {v5, v6}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 594
    iget-object v0, p0, Lo/enw$6;->a:Lo/enw;

    invoke-static {v0}, Lo/enw;->b(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 595
    iget-object v0, p0, Lo/enw$6;->a:Lo/enw;

    invoke-virtual {v5}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v1

    invoke-static {v0, v1}, Lo/enw;->b(Lo/enw;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 596
    iget-object v0, p0, Lo/enw$6;->a:Lo/enw;

    invoke-static {v0}, Lo/enw;->b(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 598
    iget-object v0, p0, Lo/enw$6;->a:Lo/enw;

    invoke-static {v0}, Lo/enw;->b(Lo/enw;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 600
    :cond_0
    return-void
.end method
