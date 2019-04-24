.class public Lcom/huawei/health/sns/server/im/message/impl/provider/GroupMemChangeExtensionProvider;
.super Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;-><init>()V

    .line 33
    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 39
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;

    const-string v0, "data"

    const-string v1, "notify-groupmember"

    invoke-direct {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    const/4 v3, 0x0

    .line 42
    :goto_0
    if-nez v3, :cond_3

    .line 44
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 45
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 46
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 48
    const-string v0, "group"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    const-string v0, ""

    const-string v1, "id"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->setGroupId(Ljava/lang/String;)V

    .line 51
    const-string v0, ""

    const-string v1, "type"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->setType(Ljava/lang/String;)V

    .line 52
    const-string v0, ""

    const-string v1, "version"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->setVersion(Ljava/lang/String;)V

    .line 53
    const-string v0, ""

    const-string v1, "op"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->setOp(Ljava/lang/String;)V

    .line 54
    const-string v0, ""

    const-string v1, "operatorid"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->setOperatorId(Ljava/lang/String;)V

    .line 55
    const-string v0, ""

    const-string v1, "operatorname"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->setOperatorName(Ljava/lang/String;)V

    goto :goto_2

    .line 57
    :cond_0
    const-string v0, "user"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    new-instance v6, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;-><init>()V

    .line 62
    const-string v0, ""

    const-string v1, "id"

    :try_start_0
    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->setUserId(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_1

    .line 64
    :catch_0
    move-exception v7

    .line 66
    const-string v0, "GroupMemChangeExtensionProvider"

    const-string v1, "GroupMemChangeExtensionProvider parseExtension() uid exception!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    :goto_1
    const-string v0, ""

    const-string v1, "nickname"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->setNickName(Ljava/lang/String;)V

    .line 69
    const-string v0, ""

    const-string v1, "noFriend"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;->setNoFriend(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v2, v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->addMemInfo(Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;)V

    .line 71
    goto :goto_2

    .line 73
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 75
    const-string v0, "data"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    const/4 v3, 0x1

    .line 80
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 81
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

    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/provider/GroupMemChangeExtensionProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;

    move-result-object v0

    return-object v0
.end method
