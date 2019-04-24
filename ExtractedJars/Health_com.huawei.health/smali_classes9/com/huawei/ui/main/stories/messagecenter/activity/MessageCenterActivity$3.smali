.class Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;->c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 205
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 206
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Start messageCenterRunnable!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;->c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    .line 208
    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->d()Ljava/util/List;

    move-result-object v4

    .line 209
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dorefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;->c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->k()V

    .line 212
    return-void

    .line 215
    :cond_0
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "messageObjectList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;->c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;->c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;->c:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 219
    :cond_1
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave messageCenterRunnable!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    :cond_2
    return-void
.end method
