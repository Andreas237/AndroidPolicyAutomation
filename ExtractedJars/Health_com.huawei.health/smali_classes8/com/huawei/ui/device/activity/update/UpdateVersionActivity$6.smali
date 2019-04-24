.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 705
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 707
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 708
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNeedSyncDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->dialog_sync_before_ota:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 711
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->b(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 712
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_ota_update_goto_home:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$4;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;)V

    .line 713
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_app_update_now_ios_btn:I

    new-instance v2, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$5;-><init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;)V

    .line 725
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v6

    .line 732
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 733
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 735
    :cond_0
    return-void
.end method
