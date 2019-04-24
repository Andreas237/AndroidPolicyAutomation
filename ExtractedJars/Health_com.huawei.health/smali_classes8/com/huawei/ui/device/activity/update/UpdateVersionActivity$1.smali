.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 1222
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;->d:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1225
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showAppIsLowdialog, user click Positive button!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1226
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;->d:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->o(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1227
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;->d:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Lo/egv;)Lo/egv;

    .line 1228
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$1;->d:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    .line 1229
    return-void
.end method
