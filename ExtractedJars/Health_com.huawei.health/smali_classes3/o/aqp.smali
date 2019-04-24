.class public final Lo/aqp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UseSparseArrays"
    }
.end annotation


# static fields
.field private static e:Lo/aqp;


# instance fields
.field private d:Lo/aqk;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 51
    new-instance v0, Lo/aqk;

    invoke-direct {v0, v1}, Lo/aqk;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/aqp;->d:Lo/aqk;

    .line 52
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 11

    .line 160
    new-instance v3, Lo/axs;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v3}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 162
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 164
    :cond_0
    return-void

    .line 166
    :cond_1
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    .line 167
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 166
    invoke-virtual {v0, v1}, Lo/bbh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 170
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/axq;

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bbj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 174
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/bpk;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 176
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 179
    invoke-static {v7}, Lo/bot;->e(Ljava/io/File;)Z

    move-result v10

    .line 180
    if-nez v10, :cond_2

    .line 182
    const-string v0, "ChatHelper"

    const-string v1, "ChatHelper assistant mediaCacheFile delete fail"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    :cond_2
    goto :goto_0

    .line 187
    :cond_3
    return-void
.end method

.method static synthetic b(Lo/aqp;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lo/aqp;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-void
.end method

.method public static declared-synchronized c()Lo/aqp;
    .locals 4

    const-class v2, Lo/aqp;

    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v0, Lo/aqp;->e:Lo/aqp;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 63
    new-instance v0, Lo/aqp;

    invoke-direct {v0}, Lo/aqp;-><init>()V

    sput-object v0, Lo/aqp;->e:Lo/aqp;

    .line 65
    :cond_0
    sget-object v0, Lo/aqp;->e:Lo/aqp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public c(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 194
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 196
    :cond_0
    return-void

    .line 198
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 199
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/aqp$4;

    invoke-direct {v1, p0, v2}, Lo/aqp$4;-><init>(Lo/aqp;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 221
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/Assistant;Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 4

    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getDefaultMsg()Ljava/lang/String;

    move-result-object v3

    .line 75
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 78
    invoke-virtual {v2, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 80
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 81
    invoke-virtual {v2, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 83
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 84
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 85
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 86
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 87
    iget-object v0, p0, Lo/aqp;->d:Lo/aqk;

    invoke-virtual {v0, v2}, Lo/aqk;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 89
    :cond_0
    return-object v2
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 7

    .line 99
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    if-nez v0, :cond_1

    .line 101
    :cond_0
    return-void

    .line 104
    :cond_1
    const/4 v2, 0x0

    .line 106
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 108
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 109
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 111
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 113
    new-instance v6, Ljava/io/File;

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 114
    invoke-static {v6}, Lo/bot;->e(Ljava/io/File;)Z

    move-result v2

    .line 115
    if-nez v2, :cond_2

    .line 117
    const-string v0, "ChatHelper"

    const-string v1, "SNSLinkMessage imageFile delete failed"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :cond_2
    goto :goto_0

    .line 122
    :cond_3
    return-void
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 131
    if-nez p1, :cond_0

    .line 133
    return-void

    .line 135
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 137
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 138
    invoke-static {v2}, Lo/bot;->e(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    const-string v0, "ChatHelper"

    const-string v1, "deleteMediaMessageImage MediaThumbnail fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 145
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    invoke-static {v2}, Lo/bot;->e(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 148
    const-string v0, "ChatHelper"

    const-string v1, "deleteMediaMessageImage MediaUrl fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    :cond_2
    return-void
.end method
