.class Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;->c:Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 106
    invoke-static {}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 108
    const-string v0, "com.huawei.bone.action.CLOUD_SWITCH_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    invoke-static {}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_CLOUD_SWITCH_CHANGED "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;->c:Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;->c:Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;)Lo/etx;

    move-result-object v1

    invoke-virtual {v1}, Lo/etx;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->c(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;->c:Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity$2;->c:Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->e(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;->b(Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;Ljava/lang/String;)V

    .line 116
    :cond_0
    return-void
.end method
