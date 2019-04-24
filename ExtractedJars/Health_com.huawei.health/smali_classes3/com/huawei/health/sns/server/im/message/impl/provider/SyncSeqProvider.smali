.class public Lcom/huawei/health/sns/server/im/message/impl/provider/SyncSeqProvider;
.super Lorg/jivesoftware/smack/provider/IQProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/IQProvider<Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/IQProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 34
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;-><init>()V

    .line 37
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    invoke-virtual {v2, v3}, Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;->setUnReadMsgList(Ljava/util/List;)V

    .line 40
    const/4 v4, 0x0

    .line 41
    :goto_0
    if-nez v4, :cond_2

    .line 43
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    .line 44
    const/4 v0, 0x2

    if-ne v5, v0, :cond_0

    .line 46
    const-string v0, "message"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    invoke-static {p1}, Lorg/jivesoftware/smack/util/PacketParserUtils;->parseMessage(Lorg/xmlpull/v1/XmlPullParser;)Lorg/jivesoftware/smack/packet/Message;

    move-result-object v6

    .line 50
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lorg/jivesoftware/smack/packet/Message;->setUnRead(Z)V

    .line 51
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    goto :goto_1

    .line 54
    :cond_0
    const/4 v0, 0x3

    if-ne v5, v0, :cond_1

    .line 56
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "messages"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    const/4 v4, 0x1

    .line 61
    :cond_1
    :goto_1
    goto :goto_0

    .line 62
    :cond_2
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
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/provider/SyncSeqProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/UnReadMessage;

    move-result-object v0

    return-object v0
.end method
