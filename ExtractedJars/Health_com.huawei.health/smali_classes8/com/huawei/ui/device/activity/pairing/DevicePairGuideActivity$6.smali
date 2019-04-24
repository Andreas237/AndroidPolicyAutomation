.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Landroid/content/Context;)V
    .locals 0

    .line 744
    iput-object p1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    iput-object p2, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 747
    new-instance v0, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-direct {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_service_area_notice_title:I

    .line 748
    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(I)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    move-result-object v4

    .line 749
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$1;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->d(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 768
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6$4;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;)V

    invoke-virtual {v4, v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 781
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->c()Ljava/util/List;

    move-result-object v5

    .line 782
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 783
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogToMigrate deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    return-void

    .line 786
    :cond_0
    const-string v6, ""

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_compatibility_note_unbind_new_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 788
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 789
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 790
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 791
    invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 792
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 793
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/enw;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 794
    const-string v0, "\n"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 795
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 797
    :cond_1
    goto :goto_0

    .line 799
    :cond_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->dialog_migrate_low_version:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    .line 800
    sget v0, Lcom/huawei/ui/device/R$id;->compatibility_remind:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/CheckBox;

    .line 801
    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 802
    sget v0, Lcom/huawei/ui/device/R$id;->compatibility_content:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 803
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 805
    invoke-virtual {v4, v10}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->a(Landroid/view/View;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_4

    .line 807
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-virtual {v4}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog$d;->e()Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->b(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 809
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setCancelable(Z)V

    .line 810
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->show()V

    .line 811
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->q(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$6;->e:Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->r(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/content/DialogInterface$OnKeyListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 813
    :cond_4
    return-void
.end method
