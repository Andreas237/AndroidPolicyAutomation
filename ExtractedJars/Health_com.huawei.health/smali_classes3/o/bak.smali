.class public final Lo/bak;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lorg/jivesoftware/smack/packet/Stanza;Ljava/lang/StringBuilder;)Z
    .locals 2

    .line 83
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    .line 84
    instance-of v0, p0, Lorg/jivesoftware/smack/packet/Message;

    if-eqz v0, :cond_0

    .line 86
    const-string v0, ",Message]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 88
    :cond_0
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/MCode;

    if-eqz v0, :cond_1

    .line 90
    const-string v0, ",MCode]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 92
    :cond_1
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/SyncSeq;

    if-eqz v0, :cond_2

    .line 94
    const-string v0, ",SyncSeq]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 96
    :cond_2
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    if-eqz v0, :cond_3

    .line 98
    const-string v0, ",SNSConfig]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 100
    :cond_3
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgReq;

    if-eqz v0, :cond_4

    .line 102
    const-string v0, ",OfflineMsgReq]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 104
    :cond_4
    instance-of v0, p0, Lorg/jivesoftware/smack/packet/AnReport;

    if-eqz v0, :cond_5

    .line 106
    const-string v0, ",AnReport]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 108
    :cond_5
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/UnReadMsgReport;

    if-eqz v0, :cond_6

    .line 110
    const-string v0, ",UnReadMsgReport]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    :cond_6
    :goto_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-le v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 162
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Lorg/jivesoftware/smack/packet/Stanza;)Ljava/lang/String;
    .locals 4

    .line 46
    const-string v2, "unknow"

    .line 47
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    :cond_0
    return-object v2

    .line 51
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Stanza;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-static {p0, v3}, Lo/bak;->d(Lorg/jivesoftware/smack/packet/Stanza;Ljava/lang/StringBuilder;)V

    .line 56
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Lorg/jivesoftware/smack/packet/Stanza;Ljava/lang/StringBuilder;)V
    .locals 2

    .line 124
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/OfflineMsgRange;

    if-eqz v0, :cond_0

    .line 126
    const-string v0, ",OfflineMsgRange]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 128
    :cond_0
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;

    if-eqz v0, :cond_1

    .line 130
    const-string v0, ",UnReadMessage]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 132
    :cond_1
    instance-of v0, p0, Lorg/jivesoftware/smackx/ping/packet/Ping;

    if-eqz v0, :cond_2

    .line 134
    const-string v0, ",Ping]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 136
    :cond_2
    instance-of v0, p0, Lorg/jivesoftware/smack/packet/EmptyResultIQ;

    if-eqz v0, :cond_3

    .line 138
    const-string v0, ",EmptyResultIQ]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 140
    :cond_3
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/PushToken;

    if-eqz v0, :cond_4

    .line 142
    const-string v0, ",PushToken]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 144
    :cond_4
    instance-of v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/RejectMessage;

    if-eqz v0, :cond_5

    .line 146
    const-string v0, ",RejectMessage]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 150
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",unknow Packet:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lo/bpj;->c(ILjava/lang/String;)V

    .line 153
    :goto_0
    return-void
.end method

.method public static c(Lorg/jivesoftware/smack/packet/Message;)Ljava/lang/String;
    .locals 4

    .line 193
    if-eqz p0, :cond_0

    .line 195
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 196
    const-string v0, "[Message id:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 197
    const-string v0, " pre:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getPreSeq()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 198
    const-string v0, " seq:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getSeq()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 199
    const-string v0, " Type:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/Message;->getType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 200
    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 201
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 203
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 174
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 180
    :cond_0
    move-object v1, p0

    .line 182
    :goto_0
    return-object v1
.end method

.method private static d(Lorg/jivesoftware/smack/packet/Stanza;Ljava/lang/StringBuilder;)V
    .locals 1

    .line 67
    invoke-static {p0, p1}, Lo/bak;->a(Lorg/jivesoftware/smack/packet/Stanza;Ljava/lang/StringBuilder;)Z

    move-result v0

    .line 68
    if-nez v0, :cond_0

    .line 71
    invoke-static {p0, p1}, Lo/bak;->b(Lorg/jivesoftware/smack/packet/Stanza;Ljava/lang/StringBuilder;)V

    .line 73
    :cond_0
    return-void
.end method
