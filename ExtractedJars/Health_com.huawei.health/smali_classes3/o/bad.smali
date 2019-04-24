.class public final Lo/bad;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
    .locals 4

    .line 126
    if-nez p0, :cond_0

    .line 128
    const/4 v0, 0x0

    return-object v0

    .line 130
    :cond_0
    const/4 v2, 0x0

    .line 131
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-eqz v0, :cond_1

    .line 133
    move-object v2, p0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 135
    :cond_1
    if-eqz v2, :cond_2

    .line 137
    new-instance v3, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;

    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-direct {v3, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkTitle(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkBrief()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkBrief(Ljava/lang/String;)V

    .line 141
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkUrl(Ljava/lang/String;)V

    .line 142
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkAppName(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkAppID(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkAppPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkAppPackage(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkReqVerCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkReqVerCode(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setBlobItemList(Ljava/util/ArrayList;)V

    .line 150
    return-object v3

    .line 152
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;
    .locals 5

    .line 214
    invoke-static {}, Lo/azk;->e()Ljava/lang/String;

    move-result-object v3

    .line 215
    invoke-static {v3, p0, p1}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->newInstance(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;

    move-result-object v4

    .line 216
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request IMServer OfflineMsgReq PacketIQ id:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",ids:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    return-object v4
.end method

.method public static b(Lorg/jivesoftware/smack/packet/Message;)Lorg/jivesoftware/smack/packet/AnReport;
    .locals 3

    .line 192
    if-nez p0, :cond_0

    .line 194
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_0
    new-instance v2, Lorg/jivesoftware/smack/packet/AnReport;

    invoke-direct {v2}, Lorg/jivesoftware/smack/packet/AnReport;-><init>()V

    .line 198
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setSeq(Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setStanzaId(Ljava/lang/String;)V

    .line 201
    sget-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->ToServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/AnReport;->setReportType(Lorg/jivesoftware/smack/packet/AnReport$ReportType;)V

    .line 202
    return-object v2
.end method

.method private static c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
    .locals 4

    .line 48
    if-nez p0, :cond_0

    .line 50
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    const/4 v2, 0x0

    .line 53
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    if-eqz v0, :cond_1

    .line 55
    move-object v2, p0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    .line 57
    :cond_1
    if-eqz v2, :cond_2

    .line 59
    new-instance v3, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;

    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-direct {v3, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getSize()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setSize(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getJid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setJid(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setFileUrl(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getFileType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setFileType(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getAge()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setMaxAge(Ljava/lang/String;)V

    .line 71
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getLengthWidth()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setLengthWidth(Ljava/lang/String;)V

    .line 73
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getThumbFlag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setThumbFlag(Ljava/lang/String;)V

    .line 75
    return-object v3

    .line 77
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private static d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;
    .locals 4

    .line 164
    if-nez p0, :cond_0

    .line 166
    const/4 v0, 0x0

    return-object v0

    .line 168
    :cond_0
    const/4 v2, 0x0

    .line 169
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    if-eqz v0, :cond_1

    .line 171
    move-object v2, p0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    .line 173
    :cond_1
    if-eqz v2, :cond_2

    .line 175
    new-instance v3, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;

    const-string v0, "data"

    const-string v1, "vcard-temp"

    invoke-direct {v3, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->getvCardJid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->setVcardOwnerJid(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->getvCardName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->setVcardOwnerName(Ljava/lang/String;)V

    .line 179
    return-object v3

    .line 181
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Lorg/jivesoftware/smack/packet/AnReport;)Lo/bac;
    .locals 4

    .line 305
    if-nez p0, :cond_0

    .line 307
    const/4 v0, 0x0

    return-object v0

    .line 310
    :cond_0
    const/4 v3, 0x0

    .line 312
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getReportType()Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->FromServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    if-ne v0, v1, :cond_2

    .line 315
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getErrCode()I

    move-result v0

    if-eqz v0, :cond_1

    .line 317
    new-instance v3, Lo/bac;

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v3, v0, v1}, Lo/bac;-><init>(Ljava/lang/String;I)V

    .line 318
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Send Message Report:Failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",errCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getErrCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 322
    :cond_1
    new-instance v3, Lo/bac;

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v3, v0, v1}, Lo/bac;-><init>(Ljava/lang/String;I)V

    .line 323
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Send Message Report:Success:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 326
    :cond_2
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getReportType()Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->ToServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    if-ne v0, v1, :cond_3

    .line 330
    const-string v0, "MessageTrace"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Report Server AnReport failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    :cond_3
    :goto_0
    return-object v3
.end method

.method public static d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message;
    .locals 4

    .line 229
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 235
    :cond_1
    new-instance v2, Lorg/jivesoftware/smack/packet/Message;

    invoke-direct {v2}, Lorg/jivesoftware/smack/packet/Message;-><init>()V

    .line 236
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSender()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/Message;->setFrom(Ljava/lang/String;)V

    .line 237
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/Message;->setTo(Ljava/lang/String;)V

    .line 238
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReferTo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/Message;->setRefer(Ljava/lang/String;)V

    .line 239
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/Message;->setType(Lorg/jivesoftware/smack/packet/Message$Type;)V

    .line 241
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 243
    invoke-virtual {v2, p1}, Lorg/jivesoftware/smack/packet/Message;->setGroupVersion(Ljava/lang/String;)V

    .line 247
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChannel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 249
    const v0, 0x2aea541

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/jivesoftware/smack/packet/Message;->setChannel(Ljava/lang/String;)V

    .line 252
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->c:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_5

    .line 255
    const-string v3, ""

    .line 256
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;

    if-eqz v0, :cond_4

    .line 258
    move-object v0, p0

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->getTextContent()Ljava/lang/String;

    move-result-object v3

    .line 260
    :cond_4
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/packet/Message;->setBody(Ljava/lang/String;)V

    .line 261
    goto :goto_0

    .line 262
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->d:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_6

    .line 264
    invoke-static {p0}, Lo/bad;->c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;

    move-result-object v3

    .line 266
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/packet/Message;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 267
    goto :goto_0

    .line 268
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_7

    .line 270
    invoke-static {p0}, Lo/bad;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;

    move-result-object v3

    .line 271
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/packet/Message;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 272
    goto :goto_0

    .line 273
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_8

    .line 275
    invoke-static {p0}, Lo/bad;->d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;

    move-result-object v3

    .line 277
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/packet/Message;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 278
    goto :goto_0

    .line 279
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_9

    .line 281
    invoke-static {p0}, Lo/bad;->e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;

    move-result-object v3

    .line 283
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/packet/Message;->addExtension(Lorg/jivesoftware/smack/packet/ExtensionElement;)V

    .line 284
    goto :goto_0

    .line 288
    :cond_9
    const/4 v0, 0x0

    return-object v0

    .line 292
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPacketID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bak;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 293
    invoke-virtual {v2, v3}, Lorg/jivesoftware/smack/packet/Message;->setStanzaId(Ljava/lang/String;)V

    .line 294
    return-object v2
.end method

.method private static e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
    .locals 4

    .line 88
    if-nez p0, :cond_0

    .line 90
    const/4 v0, 0x0

    return-object v0

    .line 92
    :cond_0
    const/4 v2, 0x0

    .line 93
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    if-eqz v0, :cond_1

    .line 95
    move-object v2, p0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    .line 97
    :cond_1
    if-eqz v2, :cond_2

    .line 99
    new-instance v3, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;

    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-direct {v3, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getSize()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setSize(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getJid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setJid(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setFileUrl(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getFileType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setFileType(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getAge()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setMaxAge(Ljava/lang/String;)V

    .line 110
    return-object v3

    .line 112
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
