.class public Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;
.super Lorg/jivesoftware/smack/provider/IQProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/IQProvider<Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "IQProvider"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/IQProvider;-><init>()V

    return-void
.end method

.method private static parseHeartbeat(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V
    .locals 5

    .line 69
    const-string v0, ""

    const-string v1, "interval"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 70
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 74
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setHeartBeatInterval(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    goto :goto_0

    .line 76
    :catch_0
    move-exception v3

    .line 78
    const-string v0, "IQProvider"

    const-string v1, "parser config interval NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_0
    :goto_0
    const-string v0, ""

    const-string v1, "times"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 87
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setHearBeatFailedTry(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 92
    goto :goto_1

    .line 89
    :catch_1
    move-exception v4

    .line 91
    const-string v0, "IQProvider"

    const-string v1, "parser config times NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :cond_1
    :goto_1
    return-void
.end method

.method private static parseMsg(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V
    .locals 4

    .line 101
    const-string v0, ""

    const-string v1, "length"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 102
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 106
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setMessageLength(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    goto :goto_0

    .line 108
    :catch_0
    move-exception v3

    .line 110
    const-string v0, "IQProvider"

    const-string v1, "parser config msg length NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :cond_0
    :goto_0
    return-void
.end method

.method private static parseOnline(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V
    .locals 5

    .line 121
    const-string v0, ""

    const-string v1, "background"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 122
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setOfflineTime(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_0

    .line 128
    :catch_0
    move-exception v3

    .line 130
    const-string v0, "IQProvider"

    const-string v1, "parser config online background NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_0
    :goto_0
    const-string v0, ""

    const-string v1, "auto_connect"

    invoke-interface {p0, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 136
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setLoginInterval(I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 145
    goto :goto_1

    .line 142
    :catch_1
    move-exception v4

    .line 144
    const-string v0, "IQProvider"

    const-string v1, "parser config online auto_connect NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    :cond_1
    :goto_1
    return-void
.end method

.method private parseStartTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V
    .locals 2

    .line 182
    const-string v0, "heartbeat"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    invoke-static {p1, p2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;->parseHeartbeat(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V

    goto :goto_0

    .line 186
    :cond_0
    const-string v0, "msg"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    invoke-static {p1, p2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;->parseMsg(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V

    goto :goto_0

    .line 190
    :cond_1
    const-string v0, "online"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 192
    invoke-static {p1, p2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;->parseOnline(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V

    goto :goto_0

    .line 194
    :cond_2
    const-string v0, "student_whitelist"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 196
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;->parseWhiteList(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V

    .line 198
    :cond_3
    :goto_0
    return-void
.end method

.method private parseWhiteList(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V
    .locals 4

    .line 154
    const/4 v2, 0x0

    .line 157
    :try_start_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 166
    goto :goto_0

    .line 159
    :catch_0
    move-exception v3

    .line 161
    const-string v0, "IQProvider"

    const-string v1, "parseWhiteList got XmlPullParserException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    goto :goto_0

    .line 163
    :catch_1
    move-exception v3

    .line 165
    const-string v0, "IQProvider"

    const-string v1, "parseWhiteList got IOException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    invoke-virtual {p2, v2}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setWhiteList(Ljava/lang/String;)V

    .line 170
    invoke-static {}, Lo/bcg;->a()Lo/bcg;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/bcg;->d(Ljava/lang/String;)V

    .line 172
    :cond_0
    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 34
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 36
    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    new-instance v2, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;-><init>()V

    .line 42
    invoke-static {}, Lo/bcg;->a()Lo/bcg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bcg;->b(Ljava/lang/String;)V

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_0
    if-nez v3, :cond_3

    .line 47
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 48
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 50
    invoke-direct {p0, p1, v2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;->parseStartTag(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;)V

    goto :goto_1

    .line 52
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 54
    const-string v0, "config"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 56
    const/4 v3, 0x1

    .line 59
    :cond_2
    :goto_1
    goto :goto_0

    .line 61
    :cond_3
    return-object v2
.end method

.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 26
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/login/impl/provider/SNSConfigProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    move-result-object v0

    return-object v0
.end method
