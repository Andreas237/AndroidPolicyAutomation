.class public final Lo/apw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 8

    .line 222
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 223
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v3

    .line 224
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 226
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 228
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 231
    const/4 v7, 0x0

    .line 232
    const-string v0, "link"

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    const/16 v0, 0x1e

    invoke-static {v6, v0}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v7

    goto :goto_1

    .line 236
    :cond_0
    const-string v0, "app"

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 238
    const/4 v0, 0x4

    invoke-static {v6, v0}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v7

    .line 240
    :cond_1
    :goto_1
    invoke-static {v7}, Lo/bae;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobData(Ljava/lang/String;)V

    .line 242
    :cond_2
    goto :goto_0

    .line 244
    :cond_3
    return-void
.end method

.method public static b(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;Ljava/lang/String;)V
    .locals 6

    .line 77
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 79
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobData()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 80
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {v0, p1, v1}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 82
    const-string v0, "app"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_linkApp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setLocalBlobDataPath(Ljava/lang/String;)V

    goto :goto_0

    .line 88
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_link"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setLocalBlobDataPath(Ljava/lang/String;)V

    .line 91
    :goto_0
    const/4 v4, 0x0

    .line 92
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobData()Ljava/lang/String;

    move-result-object v5

    .line 93
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    const/4 v0, 0x0

    invoke-static {v5, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    .line 98
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/apw;->b([BLjava/lang/String;)V

    .line 100
    :cond_2
    return-void
.end method

.method private static b([BLjava/lang/String;)V
    .locals 5

    .line 181
    if-eqz p0, :cond_2

    array-length v0, p0

    if-lez v0, :cond_2

    .line 183
    const/4 v2, 0x0

    .line 184
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 186
    return-void

    .line 189
    :cond_0
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bpk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    return-void

    .line 195
    :cond_1
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    .line 196
    invoke-virtual {v2, p0}, Ljava/io/FileOutputStream;->write([B)V

    .line 197
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 209
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 210
    goto :goto_0

    .line 199
    :catch_0
    move-exception v3

    .line 201
    const-string v0, "MessageItemHelper"

    const-string v1, "writeBitmapFile meet FileNotFoundException!!"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 210
    goto :goto_0

    .line 203
    :catch_1
    move-exception v3

    .line 205
    const-string v0, "MessageItemHelper"

    const-string v1, "writeBitmapFile meet IOException!!"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 209
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 210
    goto :goto_0

    .line 209
    :catchall_0
    move-exception v4

    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 210
    throw v4

    .line 212
    :cond_2
    :goto_0
    return-void
.end method

.method private static c(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;Ljava/lang/String;)V
    .locals 8

    .line 140
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 143
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {v0, p1, v1}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 144
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 145
    const/4 v4, 0x0

    .line 147
    const/4 v5, 0x0

    .line 148
    const-string v0, "app"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    const/4 v0, 0x4

    invoke-static {v3, v0}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v4

    .line 151
    const-string v5, "_linkApp"

    goto :goto_0

    .line 153
    :cond_0
    const-string v0, "link"

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getBlobPosition()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    const/16 v0, 0x1e

    invoke-static {v3, v0}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v4

    .line 156
    const-string v5, "_link"

    .line 159
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    array-length v0, v4

    if-lez v0, :cond_2

    .line 161
    invoke-static {v4}, Lo/bae;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 162
    invoke-static {v6}, Lo/boe;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setLocalBlobDataPath(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0, v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobData(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->getLocalBlobDataPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/apw;->b([BLjava/lang/String;)V

    .line 171
    :cond_2
    return-void
.end method

.method public static d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 6

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    if-nez v0, :cond_0

    .line 47
    return-object v2

    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_1

    .line 51
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 53
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkMessageTip()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v3

    .line 56
    if-eqz v3, :cond_1

    .line 58
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 61
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/apw;->b(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;Ljava/lang/String;)V

    .line 62
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 66
    return-object v2
.end method

.method public static e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 6

    .line 110
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    if-nez v0, :cond_0

    .line 112
    return-void

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_1

    .line 117
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 119
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkMessageTip()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v3

    .line 121
    if-eqz v3, :cond_1

    .line 123
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    .line 126
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/apw;->c(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;Ljava/lang/String;)V

    .line 127
    goto :goto_0

    .line 130
    :cond_1
    return-void
.end method
