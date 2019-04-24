.class public Lcom/huawei/health/sns/server/im/message/impl/provider/GroupInfoChangeExtensionProvider;
.super Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;-><init>()V

    .line 31
    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 37
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;

    const-string v0, "data"

    const-string v1, "notify-groupinfo"

    invoke-direct {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    const/4 v3, 0x0

    .line 40
    :goto_0
    if-nez v3, :cond_5

    .line 42
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 43
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 44
    const/4 v0, 0x2

    if-ne v4, v0, :cond_3

    .line 46
    const-string v0, "group"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    const-string v0, ""

    const-string v1, "id"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setGroupId(Ljava/lang/String;)V

    .line 49
    const-string v0, ""

    const-string v1, "type"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setType(Ljava/lang/String;)V

    .line 50
    const-string v0, ""

    const-string v1, "op"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setOp(Ljava/lang/String;)V

    .line 51
    const-string v0, ""

    const-string v1, "operatorid"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setOperatorId(Ljava/lang/String;)V

    .line 52
    const-string v0, ""

    const-string v1, "operatorname"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setOperatorName(Ljava/lang/String;)V

    .line 53
    const-string v0, ""

    const-string v1, "managerid"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setManagerId(Ljava/lang/String;)V

    .line 54
    const-string v0, ""

    const-string v1, "managername"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setManagerName(Ljava/lang/String;)V

    goto :goto_1

    .line 56
    :cond_0
    const-string v0, "name"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setGroupName(Ljava/lang/String;)V

    goto :goto_1

    .line 60
    :cond_1
    const-string v0, "image_url"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setGroupImageUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 64
    :cond_2
    const-string v0, "download_url"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 66
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->setDownloadUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 69
    :cond_3
    const/4 v0, 0x3

    if-ne v4, v0, :cond_4

    .line 71
    const-string v0, "data"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 73
    const/4 v3, 0x1

    .line 76
    :cond_4
    :goto_1
    goto/16 :goto_0

    .line 77
    :cond_5
    return-object v2
.end method

.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 22
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/provider/GroupInfoChangeExtensionProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;

    move-result-object v0

    return-object v0
.end method
