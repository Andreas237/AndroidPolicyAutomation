.class public abstract Lo/apn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bab;


# instance fields
.field protected final a:Landroid/content/Context;

.field protected b:J

.field private c:I


# direct methods
.method protected constructor <init>(I)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/apn;->b:J

    .line 52
    iput p1, p0, Lo/apn;->c:I

    .line 53
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/apn;->a:Landroid/content/Context;

    .line 54
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 131
    iget v0, p0, Lo/apn;->c:I

    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 132
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    .line 135
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bap;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 137
    :cond_0
    return-void
.end method


# virtual methods
.method abstract a()Lo/auu$b;
.end method

.method protected a(J)Z
    .locals 3

    .line 148
    const/4 v2, 0x0

    .line 150
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {p0}, Lo/apn;->a()Lo/auu$b;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/aut;->a(Lo/auu$b;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    const/4 v2, 0x1

    .line 154
    :cond_0
    return v2
.end method

.method protected a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 1

    .line 165
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    return v0
.end method

.method protected b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 4

    .line 101
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 104
    invoke-static {p1}, Lo/apw;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 107
    :cond_0
    if-eqz p2, :cond_1

    .line 109
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 111
    :cond_1
    const/4 v3, -0x1

    .line 113
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    .line 115
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v3

    .line 116
    invoke-virtual {p1, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 118
    :cond_2
    invoke-direct {p0, p1}, Lo/apn;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 119
    invoke-static {}, Lo/aob;->c()V

    .line 120
    const-string v0, "IfCommonChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealNewMessageItem.handle the new message result{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-lez v3, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "}"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void
.end method

.method abstract c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
.end method

.method public d(Lo/bac;)V
    .locals 4

    .line 61
    if-nez p1, :cond_0

    .line 63
    return-void

    .line 65
    :cond_0
    invoke-virtual {p1}, Lo/bac;->d()Ljava/lang/String;

    move-result-object v2

    .line 66
    invoke-virtual {p1}, Lo/bac;->e()I

    move-result v3

    .line 67
    iget v0, p0, Lo/apn;->c:I

    const/16 v1, 0x7e1

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 68
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 70
    const/4 v3, 0x3

    goto :goto_0

    .line 72
    :cond_1
    const/4 v0, 0x1

    if-ne v0, v3, :cond_2

    .line 74
    const/4 v3, 0x2

    .line 76
    :cond_2
    :goto_0
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lo/apm;->d(Ljava/lang/String;I)V

    .line 77
    return-void
.end method

.method protected e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V
    .locals 4

    .line 177
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v1

    .line 178
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v2

    .line 177
    invoke-virtual {v0, p2, p3, v1, v2}, Lo/awk;->b(JII)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    iget-wide v1, p0, Lo/apn;->b:J

    invoke-virtual {v0, v1, v2}, Lo/awk;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/apn;->b:J

    .line 184
    iget-object v0, p0, Lo/apn;->a:Landroid/content/Context;

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/Vibrator;

    .line 185
    const/4 v0, 0x4

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    const/4 v1, -0x1

    invoke-virtual {v3, v0, v1}, Landroid/os/Vibrator;->vibrate([JI)V

    .line 189
    :cond_0
    return-void

    :array_0
    .array-data 8
        0x64
        0x12c
        0x1f4
        0x12c
    .end array-data
.end method
