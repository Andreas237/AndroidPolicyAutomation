.class final Lo/apu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apu;->a(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic d:Lo/apu;

.field final synthetic e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;


# direct methods
.method constructor <init>(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/apu$1;->d:Lo/apu;

    iput-object p2, p0, Lo/apu$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/apu$1;->e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 242
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/awr;

    invoke-direct {v1}, Lo/awr;-><init>()V

    iget-object v2, p0, Lo/apu$1;->d:Lo/apu;

    iget-object v3, p0, Lo/apu$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v4, p0, Lo/apu$1;->e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-static {v2, v3, v4}, Lo/apu;->d(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/brc;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 244
    return-void
.end method

.method public e(II)V
    .locals 4

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unFollow assist msgId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/apu$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",getFrdList failed.code=("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 251
    const-string v0, "IfSingleChatImpl"

    invoke-static {v0, v3}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 254
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 253
    const/4 v1, 0x4

    invoke-static {v1, v0}, Lo/bpj;->e(ILjava/lang/String;)V

    .line 255
    return-void
.end method
