.class Lcom/huawei/health/sns/ui/user/UserNotifyFragment$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/user/UserNotifyFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$2;->b:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 150
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 151
    const-string v0, "com.huawei.health.sns.local_action_read_notify"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$2;->b:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    const-string v1, "readNotifyUserId"

    const-wide/16 v2, 0x0

    invoke-virtual {p2, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->a(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;J)V

    goto :goto_0

    .line 156
    :cond_0
    const-string v0, "com.huawei.health.sns.local_action_unread_notify"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$2;->b:Lcom/huawei/health/sns/ui/user/UserNotifyFragment;

    const-string v1, "unReadNotifyUserIdArray"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getLongArrayExtra(Ljava/lang/String;)[J

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->e(Lcom/huawei/health/sns/ui/user/UserNotifyFragment;[J)V

    .line 161
    :cond_1
    :goto_0
    return-void
.end method
