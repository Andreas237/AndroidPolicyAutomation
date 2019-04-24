.class public final Lo/baj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;
    .locals 2

    .line 252
    new-instance v1, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>()V

    .line 254
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkTitle(Ljava/lang/String;)V

    .line 255
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkBrief()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkBrief(Ljava/lang/String;)V

    .line 256
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkUrl(Ljava/lang/String;)V

    .line 257
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkAppName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppName(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkAppID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppID(Ljava/lang/String;)V

    .line 260
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkAppPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkAppPackage(Ljava/lang/String;)V

    .line 261
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getLinkReqVerCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkReqVerCode(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setBlobItemList(Ljava/util/ArrayList;)V

    .line 265
    return-object v1
.end method

.method private static a(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 5

    .line 103
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getBody()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 106
    new-instance v4, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;-><init>()V

    .line 107
    invoke-static {v4, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 108
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->setTextContent(Ljava/lang/String;)V

    .line 109
    move-object v3, v4

    .line 110
    return-object v3

    .line 114
    :cond_0
    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 116
    invoke-static {p0}, Lo/baj;->d(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 118
    :cond_1
    const-string v0, "data"

    const-string v1, "vcard-temp"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 120
    invoke-static {p0}, Lo/baj;->b(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 122
    :cond_2
    const-string v0, "data"

    const-string v1, "notify-groupmember"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 124
    invoke-static {p0}, Lo/baj;->h(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 126
    :cond_3
    const-string v0, "data"

    const-string v1, "notify-groupinfo"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 128
    invoke-static {p0}, Lo/baj;->c(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 130
    :cond_4
    const-string v0, "data"

    const-string v1, "notify-assistant"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 132
    invoke-static {p0}, Lo/baj;->f(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 136
    :cond_5
    new-instance v4, Lcom/huawei/health/sns/server/im/message/base/SNSUnknowMessage;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSUnknowMessage;-><init>()V

    .line 137
    invoke-static {v4, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 138
    move-object v3, v4

    .line 139
    const-string v0, "MessageAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MessageTrace:Warning!receive unKnow Message data type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 140
    invoke-static {p0}, Lo/bak;->c(Lorg/jivesoftware/smack/packet/Message;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 139
    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    :goto_0
    return-object v3
.end method

.method private static a(Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;
    .locals 4

    .line 226
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;-><init>()V

    .line 227
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getFileType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setFileType(Ljava/lang/String;)V

    .line 228
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getFileUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setUrl(Ljava/lang/String;)V

    .line 229
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getJid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setJid(Ljava/lang/String;)V

    .line 230
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setTime(Ljava/lang/String;)V

    .line 234
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getSize()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setSize(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    goto :goto_0

    .line 236
    :catch_0
    move-exception v3

    .line 238
    const-string v0, "MessageAdapter"

    const-string v1, "handleVoiceExt() receive image message, size invalid"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->getMaxAge()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setAge(Ljava/lang/String;)V

    .line 241
    return-object v2
.end method

.method private static b(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 5

    .line 276
    const/4 v2, 0x0

    .line 277
    const-string v0, "data"

    const-string v1, "vcard-temp"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;

    .line 278
    if-eqz v3, :cond_0

    .line 281
    new-instance v4, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;-><init>()V

    .line 282
    invoke-static {v4, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 284
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->getVcardOwnerJid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->setvCardJid(Ljava/lang/String;)V

    .line 285
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->getVcardOwnerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->setvCardName(Ljava/lang/String;)V

    .line 286
    move-object v2, v4

    .line 288
    :cond_0
    return-object v2
.end method

.method private static b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V
    .locals 2

    .line 78
    if-eqz p0, :cond_0

    .line 80
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSender()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setSender(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setReceiver(Ljava/lang/String;)V

    .line 82
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setPacketID(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setChatType(Lorg/jivesoftware/smack/packet/Message$Type;)V

    .line 85
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getTs()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setSendTime(J)V

    .line 86
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setSeq(J)V

    .line 87
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setPreseq(J)V

    .line 88
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/Message;->getRefer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setReferTo(Ljava/lang/String;)V

    .line 90
    :cond_0
    return-void
.end method

.method private static c(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 6

    .line 299
    const/4 v2, 0x0

    .line 300
    const-string v0, "data"

    const-string v1, "notify-groupinfo"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;

    .line 302
    if-eqz v3, :cond_0

    .line 304
    new-instance v4, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;-><init>()V

    .line 305
    invoke-static {v4, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 308
    :try_start_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getGroupId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setGroupId(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 313
    goto :goto_0

    .line 310
    :catch_0
    move-exception v5

    .line 312
    const-string v0, "MessageAdapter"

    const-string v1, "GroupInfoChangeNotification groudID error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    :goto_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getOp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setOp(Ljava/lang/String;)V

    .line 315
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setType(Ljava/lang/String;)V

    .line 318
    :try_start_1
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getOperatorId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setOperatorId(J)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 323
    goto :goto_1

    .line 320
    :catch_1
    move-exception v5

    .line 322
    const-string v0, "MessageAdapter"

    const-string v1, "GroupInfoChangeNotification OperatorId error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    :goto_1
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getOperatorName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setOperatorName(Ljava/lang/String;)V

    .line 328
    :try_start_2
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getManagerId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setManagerId(J)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 333
    goto :goto_2

    .line 330
    :catch_2
    move-exception v5

    .line 332
    const-string v0, "MessageAdapter"

    const-string v1, "GroupInfoChangeNotification ManagerId error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    :goto_2
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getManagerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setManagerName(Ljava/lang/String;)V

    .line 335
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setGroupName(Ljava/lang/String;)V

    .line 336
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setGroupImageUrl(Ljava/lang/String;)V

    .line 337
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;->setDownloadUrl(Ljava/lang/String;)V

    .line 338
    move-object v2, v4

    .line 340
    :cond_0
    return-object v2
.end method

.method private static d(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 7

    .line 153
    const/4 v3, 0x0

    .line 154
    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;

    .line 156
    if-eqz v4, :cond_3

    .line 158
    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;->getInfoType()Ljava/lang/String;

    move-result-object v5

    .line 159
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Image:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    move-object v0, v4

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;

    invoke-static {v0}, Lo/baj;->e(Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    move-result-object v6

    .line 162
    invoke-static {v6, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 163
    move-object v3, v6

    .line 164
    goto :goto_0

    .line 165
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Link:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    move-object v0, v4

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;

    invoke-static {v0}, Lo/baj;->a(Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v6

    .line 168
    invoke-static {v6, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 169
    move-object v3, v6

    .line 170
    goto :goto_0

    .line 171
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Audio:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    move-object v0, v4

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;

    invoke-static {v0}, Lo/baj;->a(Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    move-result-object v6

    .line 174
    invoke-static {v6, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 175
    move-object v3, v6

    .line 176
    goto :goto_0

    .line 180
    :cond_2
    new-instance v6, Lcom/huawei/health/sns/server/im/message/base/SNSUnknowMessage;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSUnknowMessage;-><init>()V

    .line 181
    invoke-static {v6, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 182
    move-object v3, v6

    .line 183
    const-string v0, "MessageAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MessageTrace:Warning!receive unKnow Message MultiType type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 185
    invoke-static {p0}, Lo/bak;->c(Lorg/jivesoftware/smack/packet/Message;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 183
    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :cond_3
    :goto_0
    return-object v3
.end method

.method private static e(Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;
    .locals 4

    .line 199
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;-><init>()V

    .line 200
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getFileType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setFileType(Ljava/lang/String;)V

    .line 201
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getFileUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setUrl(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getJid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setJid(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getLengthWidth()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setLengthWidth(Ljava/lang/String;)V

    .line 207
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getSize()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setSize(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    goto :goto_0

    .line 209
    :catch_0
    move-exception v3

    .line 211
    const-string v0, "MessageAdapter"

    const-string v1, "handlePicExt() receive image message, size invalid"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getMaxAge()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setAge(Ljava/lang/String;)V

    .line 214
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->getThumbFlag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setThumbFlag(Ljava/lang/String;)V

    .line 215
    return-object v2
.end method

.method public static e(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 4

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->chat:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_0

    .line 50
    invoke-static {p0}, Lo/baj;->a(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->groupchat:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_1

    .line 55
    invoke-static {p0}, Lo/baj;->a(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->normal:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_2

    .line 60
    invoke-static {p0}, Lo/baj;->a(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v3

    goto :goto_0

    .line 65
    :cond_2
    const-string v0, "MessageAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MessageTrace:Warning!receive unKnow Message type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0}, Lo/bak;->c(Lorg/jivesoftware/smack/packet/Message;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    :goto_0
    return-object v3
.end method

.method private static f(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 5

    .line 351
    const/4 v2, 0x0

    .line 352
    const-string v0, "data"

    const-string v1, "notify-assistant"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;

    .line 354
    if-eqz v3, :cond_0

    .line 356
    new-instance v4, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;-><init>()V

    .line 357
    invoke-static {v4, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 358
    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/AssistantPacketExtension;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;->setAssistantContent(Ljava/lang/String;)V

    .line 359
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getNotify()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;->setNotify(I)V

    .line 360
    move-object v2, v4

    .line 362
    :cond_0
    return-object v2
.end method

.method private static h(Lorg/jivesoftware/smack/packet/Message;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
    .locals 5

    .line 373
    const/4 v2, 0x0

    .line 374
    const-string v0, "data"

    const-string v1, "notify-groupmember"

    invoke-virtual {p0, v0, v1}, Lorg/jivesoftware/smack/packet/Message;->getExtension(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/ExtensionElement;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;

    .line 376
    invoke-static {v3}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->buildWithExtension(Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;)Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;

    move-result-object v4

    .line 377
    invoke-static {v4, p0}, Lo/baj;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lorg/jivesoftware/smack/packet/Message;)V

    .line 378
    move-object v2, v4

    .line 379
    return-object v2
.end method
