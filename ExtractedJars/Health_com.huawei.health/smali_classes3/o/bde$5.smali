.class final Lo/bde$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bde;->d(Ljava/lang/String;ILandroid/os/Handler;JZZ)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic k:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ljava/lang/String;ZIJZLandroid/os/Handler;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/bde$5;->c:Ljava/lang/String;

    iput-boolean p2, p0, Lo/bde$5;->e:Z

    iput p3, p0, Lo/bde$5;->a:I

    iput-wide p4, p0, Lo/bde$5;->b:J

    iput-boolean p6, p0, Lo/bde$5;->d:Z

    iput-object p7, p0, Lo/bde$5;->k:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 99
    invoke-virtual {p0, p1}, Lo/bde$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 103
    const-string v0, "ChatCommonLogic"

    const-string v1, "getVoiceJob() use thread to execute"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lo/bde$5;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 106
    const-string v0, "ChatCommonLogic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getResultData() use thread to execute original voice Path="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bde$5;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-static {}, Lo/bde;->a()Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 110
    iget-boolean v0, p0, Lo/bde$5;->e:Z

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    .line 111
    :goto_0
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 113
    iget-object v0, p0, Lo/bde$5;->c:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 114
    iget v0, p0, Lo/bde$5;->a:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaTime(Ljava/lang/String;)V

    .line 115
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lo/bde$5;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 116
    iget-wide v0, p0, Lo/bde$5;->b:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 117
    iget-wide v0, p0, Lo/bde$5;->b:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 118
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 119
    iget-boolean v0, p0, Lo/bde$5;->d:Z

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSysChat(Z)V

    .line 121
    iget-object v0, p0, Lo/bde$5;->k:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 123
    iget-object v0, p0, Lo/bde$5;->k:Landroid/os/Handler;

    iget-object v1, p0, Lo/bde$5;->k:Landroid/os/Handler;

    const v2, 0x310dc

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 125
    :cond_1
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/aus;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 128
    :cond_2
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
