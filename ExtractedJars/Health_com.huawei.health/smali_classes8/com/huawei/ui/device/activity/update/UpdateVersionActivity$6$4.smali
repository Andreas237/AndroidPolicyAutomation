.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;)V
    .locals 0

    .line 713
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$4;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 716
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start mNeedSyncDialog, user click Positive button! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 718
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 719
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.MainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 720
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 721
    const-string v0, "from_update_version"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$4;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->startActivity(Landroid/content/Intent;)V

    .line 723
    return-void
.end method
