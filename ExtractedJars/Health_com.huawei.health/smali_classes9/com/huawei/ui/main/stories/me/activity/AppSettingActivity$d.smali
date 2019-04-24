.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 967
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .line 970
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    if-nez p2, :cond_0

    .line 972
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive mReceiver intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    return-void

    .line 975
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 976
    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 977
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;

    move-result-object v0

    const/16 v1, 0x65

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 978
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;->sendMessage(Landroid/os/Message;)Z

    .line 984
    :cond_1
    return-void
.end method
