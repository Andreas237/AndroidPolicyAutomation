.class Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)V
    .locals 0

    .line 705
    iput-object p1, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;->d:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 708
    invoke-static {}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showUpgradeDialog cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;->d:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->b(Ljava/lang/Boolean;)V

    .line 710
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;->d:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->t(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;->dismiss()V

    .line 711
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity$1;->d:Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;->d(Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;)Lcom/huawei/ui/commonui/dialog/CustomAlertDialog;

    .line 712
    return-void
.end method
