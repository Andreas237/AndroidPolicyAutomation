.class public Lcom/huawei/health/sns/server/im/message/impl/provider/VCardPacketExtensionProvider;
.super Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;-><init>()V

    .line 27
    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 33
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;

    const-string v0, "data"

    const-string v1, "vcard-temp"

    invoke-direct {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    const/4 v3, 0x0

    .line 35
    :goto_0
    if-nez v3, :cond_3

    .line 37
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 38
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 39
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 41
    const-string v0, "jabberid"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->setVcardOwnerJid(Ljava/lang/String;)V

    .line 45
    :cond_0
    const-string v0, "nickname"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 47
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;->setVcardOwnerName(Ljava/lang/String;)V

    goto :goto_1

    .line 50
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 52
    const-string v0, "data"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    const/4 v3, 0x1

    .line 57
    :cond_2
    :goto_1
    goto :goto_0

    .line 58
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

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/provider/VCardPacketExtensionProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/VCardPacketExtension;

    move-result-object v0

    return-object v0
.end method
