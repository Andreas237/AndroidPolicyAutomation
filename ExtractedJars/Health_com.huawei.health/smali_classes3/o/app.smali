.class public final Lo/app;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/app;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    new-instance v0, Lo/app;

    invoke-direct {v0}, Lo/app;-><init>()V

    sput-object v0, Lo/app;->e:Lo/app;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 3

    .line 156
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 158
    const-string v0, "IfChatSendImpl"

    const-string v1, "sendVoiceMessage the param mi is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    return-void

    .line 161
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 162
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 164
    :cond_2
    const-string v0, "IfChatSendImpl"

    const-string v1, "sendVoiceMessage the param mi.mediaId and mi.mediaUrl is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    return-void

    .line 167
    :cond_3
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;-><init>()V

    .line 168
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaSize()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setSize(J)V

    .line 169
    const-string v0, "audio/amr"

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setFileType(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setUrl(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setTime(Ljava/lang/String;)V

    .line 172
    if-eqz p2, :cond_4

    .line 174
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bpd;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setJid(Ljava/lang/String;)V

    goto :goto_0

    .line 178
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bpd;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setJid(Ljava/lang/String;)V

    .line 180
    :goto_0
    invoke-direct {p0, v2, p1, p2}, Lo/app;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 181
    return-void
.end method

.method private a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 4

    .line 102
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setPacketID(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderSiteId()I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/bpd;->c(JI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setSender(Ljava/lang/String;)V

    .line 104
    if-eqz p3, :cond_1

    .line 106
    sget-object v3, Lorg/jivesoftware/smack/packet/Message$Type;->chat:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 107
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->isSysChat()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    sget-object v3, Lorg/jivesoftware/smack/packet/Message$Type;->syschat:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 111
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bpd;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setReceiver(Ljava/lang/String;)V

    .line 112
    invoke-virtual {p1, v3}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setChatType(Lorg/jivesoftware/smack/packet/Message$Type;)V

    .line 113
    invoke-static {}, Lo/apu;->b()Lo/apu;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apu;->c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 114
    goto :goto_0

    .line 117
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bpd;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setReceiver(Ljava/lang/String;)V

    .line 118
    sget-object v0, Lorg/jivesoftware/smack/packet/Message$Type;->groupchat:Lorg/jivesoftware/smack/packet/Message$Type;

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setChatType(Lorg/jivesoftware/smack/packet/Message$Type;)V

    .line 119
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 122
    invoke-direct {p0, p2}, Lo/app;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->setReferTo(Ljava/lang/String;)V

    .line 124
    :cond_2
    invoke-static {}, Lo/apv;->e()Lo/apv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apv;->c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 126
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 303
    const/4 v2, 0x0

    .line 304
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 308
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {p2, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 310
    const/4 v0, 0x1

    return v0

    .line 312
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;)Ljava/lang/String;
    .locals 9

    .line 250
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 252
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v4

    .line 253
    const/4 v5, 0x0

    .line 254
    const-string v0, "@"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 256
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    .line 257
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v1

    .line 256
    invoke-virtual {v0, v1, v2}, Lo/ath;->f(J)Ljava/util/ArrayList;

    move-result-object v6

    .line 258
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 259
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 262
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lo/app;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    goto :goto_0

    .line 269
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lo/app;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 271
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    goto :goto_0

    .line 276
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lo/app;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 278
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    goto :goto_0

    .line 281
    :cond_2
    goto :goto_0

    .line 284
    :cond_3
    if-eqz v5, :cond_4

    .line 286
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Long;

    .line 288
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 289
    goto :goto_1

    .line 291
    :cond_4
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 3

    .line 191
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 193
    const-string v0, "IfChatSendImpl"

    const-string v1, "the param mi is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return-void

    .line 197
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 198
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 200
    :cond_2
    const-string v0, "IfChatSendImpl"

    const-string v1, "the param mi.mediaId and mi.mediaUrl is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    return-void

    .line 204
    :cond_3
    new-instance v2, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;-><init>()V

    .line 206
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaSize()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setSize(J)V

    .line 207
    const-string v0, "image/jpg"

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setFileType(Ljava/lang/String;)V

    .line 208
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setUrl(Ljava/lang/String;)V

    .line 209
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbFlag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setThumbFlag(Ljava/lang/String;)V

    .line 211
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setLengthWidth(Ljava/lang/String;)V

    .line 213
    if-eqz p2, :cond_4

    .line 215
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bpd;->b(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setJid(Ljava/lang/String;)V

    goto :goto_0

    .line 219
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bpd;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setJid(Ljava/lang/String;)V

    .line 222
    :goto_0
    invoke-direct {p0, v2, p1, p2}, Lo/app;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 223
    return-void
.end method

.method public static d()Lo/app;
    .locals 1

    .line 50
    sget-object v0, Lo/app;->e:Lo/app;

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 2

    .line 136
    new-instance v1, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;-><init>()V

    .line 137
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->setTextContent(Ljava/lang/String;)V

    .line 138
    invoke-direct {p0, v1, p1, p2}, Lo/app;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 139
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 2

    .line 149
    new-instance v1, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;-><init>()V

    .line 150
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->setvCardJid(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->setvCardName(Ljava/lang/String;)V

    .line 152
    invoke-direct {p0, v1, p1, p2}, Lo/app;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 153
    return-void
.end method

.method private f(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 3

    .line 233
    if-nez p1, :cond_0

    .line 235
    const-string v0, "IfChatSendImpl"

    const-string v1, "the param mi is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    return-void

    .line 238
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 239
    invoke-direct {p0, v2, p1, p2}, Lo/app;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 240
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 1

    .line 61
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 65
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lo/app;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 66
    goto :goto_0

    .line 70
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lo/app;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 71
    goto :goto_0

    .line 75
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lo/app;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 76
    goto :goto_0

    .line 80
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lo/app;->f(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 81
    goto :goto_0

    .line 85
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lo/app;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 86
    .line 91
    :goto_0
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
