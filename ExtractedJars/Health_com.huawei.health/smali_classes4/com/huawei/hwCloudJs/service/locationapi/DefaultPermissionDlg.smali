.class public Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/api/ILocDialog;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Landroid/app/Dialog;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "DefaultPermissionDlg"

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->a:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;)Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->b:Landroid/app/Dialog;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;Landroid/app/Dialog;)Landroid/app/Dialog;
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->b:Landroid/app/Dialog;

    return-object p1
.end method


# virtual methods
.method public genDialog(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;)Landroid/app/Dialog;
    .locals 6

    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v0, "jssdk_permission_location_title"

    invoke-static {p1, v0}, Lcom/huawei/hwCloudJs/d/e;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "jssdk_permission_location_msg"

    invoke-static {p1, v1}, Lcom/huawei/hwCloudJs/d/e;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object v4, p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const-string v0, "jssdk_permission_allow"

    invoke-static {p1, v0}, Lcom/huawei/hwCloudJs/d/e;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$1;

    invoke-direct {v1, p0, p3}, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$1;-><init>(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const-string v0, "jssdk_permission_forbidden"

    invoke-static {p1, v0}, Lcom/huawei/hwCloudJs/d/e;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;

    invoke-direct {v1, p0, p3}, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg$2;-><init>(Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;Lcom/huawei/hwCloudJs/api/ILocDialog$DialogResult;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->b:Landroid/app/Dialog;

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/DefaultPermissionDlg;->b:Landroid/app/Dialog;

    return-object v0
.end method
