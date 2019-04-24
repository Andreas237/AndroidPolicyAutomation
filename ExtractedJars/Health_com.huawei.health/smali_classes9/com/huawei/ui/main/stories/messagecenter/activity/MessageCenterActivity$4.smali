.class Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->updateMessageList()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;->d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;->d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->d()Ljava/util/List;

    move-result-object v4

    .line 282
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onChange() getMessageList.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;->d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 284
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;->d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;->d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;->d:Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 290
    :cond_1
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "messageCenterHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    :goto_0
    return-void
.end method
