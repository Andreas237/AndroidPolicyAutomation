.class public Lo/apt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 193
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification  this message type is UnKnowMsgNotification!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 195
    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 196
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;)V
    .locals 2

    .line 164
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification.  the type of message received is pic."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 166
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getSize()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 169
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getThumbFlag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getLengthWidth()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 171
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V
    .locals 2

    .line 181
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification.  the type of message received is link."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    invoke-virtual {p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 183
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 184
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;)V
    .locals 2

    .line 221
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification.  the type of message received is send voice."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const/16 v0, 0xf

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 223
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 224
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 225
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getSize()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 226
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 141
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification.   the type of message received is card"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 143
    const-string v4, ""

    .line 144
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 145
    if-eqz v5, :cond_0

    .line 147
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 149
    :cond_0
    invoke-static {p2}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p1, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 151
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 152
    sget v0, Lcom/huawei/android/sns/R$string;->sns_friend_recommend:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 153
    invoke-static {v4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 152
    invoke-virtual {v6, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 154
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 118
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification.  the type of message received is text."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 120
    invoke-virtual {p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 123
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setIsRefferedSelf(I)V

    .line 130
    :cond_0
    return-void
.end method


# virtual methods
.method c(I)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 205
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 207
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 209
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 210
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 211
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 212
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 213
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 215
    const-string v0, "m"

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v2, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 217
    return-object v2
.end method

.method c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 14

    .line 43
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v4

    .line 44
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->a(Ljava/lang/String;)J

    move-result-wide v6

    .line 45
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v8

    .line 46
    new-instance v10, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 47
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPacketID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 48
    invoke-virtual {v10, v4, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 49
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 50
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 51
    invoke-virtual {v10, v6, v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 52
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 53
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSendTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSeq(J)V

    .line 54
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPreseq()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setPreviousSeq(J)V

    .line 56
    const/4 v0, 0x1

    invoke-static {v4, v5, v6, v7, v0}, Lo/apq;->a(JJZ)Ljava/lang/String;

    move-result-object v11

    .line 57
    invoke-virtual {v10, v11}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderName(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->c:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_0

    .line 62
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->getTextContent()Ljava/lang/String;

    move-result-object v12

    .line 63
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReferTo()Ljava/lang/String;

    move-result-object v13

    .line 64
    invoke-direct {p0, v10, v12, v13}, Lo/apt;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    goto/16 :goto_0

    .line 66
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_1

    .line 69
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->getvCardJid()Ljava/lang/String;

    move-result-object v12

    .line 70
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->getvCardName()Ljava/lang/String;

    move-result-object v13

    .line 71
    invoke-direct {p0, v10, v12, v13}, Lo/apt;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->d:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_2

    .line 76
    move-object v12, p1

    check-cast v12, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    .line 77
    invoke-direct {p0, v10, v12}, Lo/apt;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;)V

    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_3

    .line 81
    move-object v12, p1

    check-cast v12, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    .line 82
    invoke-direct {p0, v10, v12}, Lo/apt;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;)V

    .line 83
    goto :goto_0

    .line 85
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_4

    .line 88
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-direct {p0, v10, v0}, Lo/apt;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;)V

    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->a:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_5

    .line 93
    invoke-direct {p0, v10}, Lo/apt;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 97
    :cond_5
    const/4 v10, 0x0

    .line 98
    const-string v0, "MessageBuilder"

    const-string v1, "getMessageItemFromNotification  this message type is unkown!"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    :goto_0
    if-eqz v10, :cond_7

    .line 103
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSendTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSendTime()J

    move-result-wide v0

    goto :goto_1

    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_1
    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 105
    :cond_7
    return-object v10
.end method
