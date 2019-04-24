.class Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->genDialog(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;

.field final synthetic b:Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;->b:Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;->a:Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    const-string v0, "DefaultPermissionDlg"

    const-string v1, "NOTAllowUseLocatioListener onClick"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;->b:Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->a(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;)Landroid/app/Dialog;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;->b:Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->a(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;->b:Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->a(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;Landroid/app/Dialog;)Landroid/app/Dialog;

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;->a:Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;

    invoke-interface {v0}, Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;->onNeg()V

    return-void
.end method
