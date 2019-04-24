.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$5;
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
.field final synthetic b:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;)V
    .locals 0

    .line 725
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$5;->b:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 728
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start mNeedSyncDialog, user click Negative button!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 729
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6$5;->b:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$6;->a:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V

    .line 730
    return-void
.end method
