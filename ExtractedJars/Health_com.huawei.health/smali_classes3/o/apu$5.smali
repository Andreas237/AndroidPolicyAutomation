.class final Lo/apu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apu;->a(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/apu;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/apu;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p2, p0, Lo/apu$5;->b:Lo/apu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 487
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    .line 488
    if-nez v3, :cond_0

    .line 490
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No friend,get frd list, no result.discard msgID:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 492
    const-string v0, "IfSingleChatImpl"

    invoke-static {v0, v4}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 494
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 493
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lo/bpj;->e(ILjava/lang/String;)V

    .line 495
    return-void

    .line 498
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v1, 0xdac1

    if-ne v1, v0, :cond_2

    .line 500
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 501
    iget-object v0, p0, Lo/apu$5;->b:Lo/apu;

    invoke-static {v0, v4}, Lo/apu;->c(Lo/apu;Lcom/huawei/health/sns/model/user/User;)Z

    move-result v5

    .line 503
    if-nez v5, :cond_1

    .line 506
    iget-object v0, p0, Lo/apu$5;->b:Lo/apu;

    iget-object v1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/apu;->e(Lo/apu;J)Ljava/lang/String;

    .line 507
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no friend message, reject msgID:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 508
    const-string v0, "IfSingleChatImpl"

    invoke-static {v0, v6}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 510
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 509
    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/bpj;->e(ILjava/lang/String;)V

    .line 511
    goto :goto_0

    .line 515
    :cond_1
    iget-object v0, p0, Lo/apu$5;->b:Lo/apu;

    iget-object v1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-static {v0, v1, v4}, Lo/apu;->b(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;)V

    .line 517
    :goto_0
    goto :goto_1

    .line 520
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No friend,get frd list failed,discard msgID:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/apu$5;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 522
    const-string v0, "IfSingleChatImpl"

    invoke-static {v0, v4}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 524
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 523
    const/4 v1, 0x5

    invoke-static {v1, v0}, Lo/bpj;->e(ILjava/lang/String;)V

    .line 526
    :goto_1
    return-void
.end method
