.class Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginmessagecenter/service/MessagePuller;->pullMessage(Landroid/content/Context;JLo/eak;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pluginmessagecenter/service/MessagePuller;

.field final synthetic val$callback:Lo/eak;

.field final synthetic val$mContext:Landroid/content/Context;

.field final synthetic val$time:J


# direct methods
.method constructor <init>(Lcom/huawei/pluginmessagecenter/service/MessagePuller;Landroid/content/Context;JLo/eak;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->this$0:Lcom/huawei/pluginmessagecenter/service/MessagePuller;

    iput-object p2, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$mContext:Landroid/content/Context;

    iput-wide p3, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$time:J

    iput-object p5, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$callback:Lo/eak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 169
    const-string v0, "UIDV_MessagePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCallBackFail i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 6

    .line 136
    const-string v0, "UIDV_MessagePuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_CENTER_KEY SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/messageCenter/getMessages"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 138
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->this$0:Lcom/huawei/pluginmessagecenter/service/MessagePuller;

    iget-object v2, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$mContext:Landroid/content/Context;

    iget-wide v3, p0, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;->val$time:J

    invoke-static {v1, v2, v3, v4}, Lcom/huawei/pluginmessagecenter/service/MessagePuller;->access$000(Lcom/huawei/pluginmessagecenter/service/MessagePuller;Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;

    invoke-direct {v2, p0}, Lcom/huawei/pluginmessagecenter/service/MessagePuller$1$1;-><init>(Lcom/huawei/pluginmessagecenter/service/MessagePuller$1;)V

    invoke-static {v0, v5, v1, v2}, Lo/eam;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V

    .line 165
    return-void
.end method
