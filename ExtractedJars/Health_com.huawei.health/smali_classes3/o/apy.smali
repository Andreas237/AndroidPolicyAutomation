.class public final Lo/apy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    return-void
.end method

.method private a(Z)V
    .locals 1

    .line 206
    if-eqz p1, :cond_0

    .line 208
    invoke-static {}, Lo/azx;->e()Lo/azx;

    move-result-object v0

    invoke-virtual {v0}, Lo/azx;->d()V

    .line 210
    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 2

    .line 308
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 310
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aus;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 314
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 316
    invoke-static {p1}, Lo/apw;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 319
    :cond_1
    if-eqz p2, :cond_2

    .line 321
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    goto :goto_0

    .line 325
    :cond_2
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 328
    :goto_0
    return-void
.end method

.method private d(JZZZ)V
    .locals 1

    .line 86
    if-nez p3, :cond_1

    .line 88
    if-eqz p4, :cond_0

    .line 91
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/aqj;->e(J)V

    goto :goto_0

    .line 95
    :cond_0
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/aqj;->c(J)V

    goto :goto_0

    .line 98
    :cond_1
    if-nez p5, :cond_2

    .line 101
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {v0, p1, p2}, Lo/aqj;->a(J)V

    .line 103
    :cond_2
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;ZZZZ)V
    .locals 2

    .line 152
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->d()V

    .line 158
    :cond_0
    if-nez p2, :cond_1

    .line 161
    invoke-static {}, Lo/aop;->h()V

    .line 164
    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getCanSend()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    if-eqz p2, :cond_3

    if-eqz p4, :cond_3

    if-eqz p5, :cond_4

    .line 166
    :cond_3
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    goto :goto_0

    .line 171
    :cond_4
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 175
    :goto_0
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 178
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 181
    if-eqz p3, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x2

    :goto_1
    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 183
    return-void
.end method

.method private e()Z
    .locals 4

    .line 192
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isAccountInvalid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v3

    .line 193
    if-eqz v3, :cond_0

    .line 195
    const-string v0, "MessageSendImpl"

    const-string v1, "send message isAccountInvalid false"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    :cond_0
    return v3
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z
    .locals 2

    .line 243
    const/4 v1, 0x1

    .line 244
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 246
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v1

    .line 248
    :cond_0
    return v1
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 9

    .line 113
    const/4 v6, 0x1

    .line 114
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v6

    .line 119
    :cond_0
    invoke-direct {p0, p1}, Lo/apy;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v7

    .line 120
    invoke-direct {p0}, Lo/apy;->e()Z

    move-result v8

    .line 122
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 124
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v4, v7

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/apy;->e(Lcom/huawei/health/sns/model/chat/MessageItem;ZZZZ)V

    goto :goto_0

    .line 128
    :cond_1
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 130
    :goto_0
    invoke-direct {p0, v8}, Lo/apy;->a(Z)V

    .line 133
    if-eqz v6, :cond_2

    if-eqz v7, :cond_2

    if-nez v8, :cond_2

    .line 136
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 138
    :cond_2
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 338
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 340
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/apm;->d(Ljava/lang/String;I)V

    .line 342
    invoke-static {}, Lo/aob;->c()V

    .line 344
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 9

    .line 46
    const/4 v6, 0x1

    .line 47
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-nez v0, :cond_0

    .line 49
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v6

    .line 52
    :cond_0
    invoke-direct {p0, p1}, Lo/apy;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v7

    .line 53
    invoke-direct {p0}, Lo/apy;->e()Z

    move-result v8

    .line 56
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 58
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move v4, v7

    move v5, v8

    const/4 v3, 0x1

    invoke-direct/range {v0 .. v5}, Lo/apy;->e(Lcom/huawei/health/sns/model/chat/MessageItem;ZZZZ)V

    .line 61
    :cond_1
    invoke-direct {p0, v8}, Lo/apy;->a(Z)V

    .line 64
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getCanSend()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v6, :cond_2

    if-eqz v7, :cond_2

    if-nez v8, :cond_2

    .line 67
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 71
    :cond_2
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getCanSend()Z

    move-result v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v4

    move v5, v7

    invoke-direct/range {v0 .. v5}, Lo/apy;->d(JZZZ)V

    .line 72
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 221
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 224
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 226
    invoke-direct {p0, p1}, Lo/apy;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v2

    .line 228
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getCanSend()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    .line 231
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 233
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 5

    .line 259
    const/4 v3, 0x1

    .line 260
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->d()V

    .line 265
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v3

    .line 268
    :cond_0
    if-nez v3, :cond_1

    .line 271
    invoke-static {}, Lo/aop;->h()V

    .line 273
    :cond_1
    invoke-direct {p0, p1}, Lo/apy;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v4

    .line 275
    if-eqz v3, :cond_3

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getCanSend()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    if-nez v4, :cond_5

    .line 278
    :cond_3
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 280
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lo/apm;->d(Ljava/lang/String;I)V

    .line 281
    if-eqz p2, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    :goto_0
    const/16 v1, 0x7e2

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 283
    return-void

    .line 287
    :cond_5
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 289
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/apm;->d(Ljava/lang/String;I)V

    .line 292
    invoke-direct {p0, p1, p2}, Lo/apy;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 295
    if-eqz p2, :cond_6

    const/4 v0, 0x1

    goto :goto_1

    :cond_6
    const/4 v0, 0x2

    :goto_1
    const/16 v1, 0x7e2

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 297
    return-void
.end method
