.class public Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;
.super Lorg/jivesoftware/smack/provider/ExtensionElementProvider;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jivesoftware/smack/provider/ExtensionElementProvider<Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "IQProvider"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lorg/jivesoftware/smack/provider/ExtensionElementProvider;-><init>()V

    return-void
.end method

.method private parseAudioItem(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 126
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    .line 129
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 130
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 131
    const/4 v0, 0x2

    if-ne v3, v0, :cond_0

    .line 133
    const-string v0, "bob"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v5

    .line 136
    invoke-virtual {p2, v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setBob_xmlns(Ljava/lang/String;)V

    .line 137
    const-string v0, ""

    const-string v1, "jid"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setJid(Ljava/lang/String;)V

    .line 138
    const-string v0, ""

    const-string v1, "url"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setFileUrl(Ljava/lang/String;)V

    .line 139
    const-string v0, ""

    const-string v1, "max-age"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setMaxAge(Ljava/lang/String;)V

    .line 140
    const-string v0, ""

    const-string v1, "type"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setFileType(Ljava/lang/String;)V

    .line 141
    goto :goto_1

    .line 143
    :cond_0
    const/4 v0, 0x3

    if-ne v3, v0, :cond_1

    .line 145
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 147
    goto :goto_2

    .line 150
    :cond_1
    :goto_1
    goto :goto_0

    .line 151
    :goto_2
    return-void
.end method

.method private parseItem(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 107
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Image:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseMultiPicItem(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;)V

    goto :goto_0

    .line 112
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Link:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseMultiLinkItem(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;)V

    goto :goto_0

    .line 117
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->Audio:Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension$MultiType;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 120
    move-object v0, p3

    check-cast v0, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseAudioItem(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;)V

    .line 122
    :cond_2
    :goto_0
    return-void
.end method

.method private parseMultiLinkExtension(Lorg/xmlpull/v1/XmlPullParser;)Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 278
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;

    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-direct {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 282
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 283
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 284
    const/4 v0, 0x2

    if-ne v4, v0, :cond_4

    .line 286
    const-string v0, "title"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkTitle(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 290
    :cond_0
    const-string v0, "brief"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 292
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkBrief(Ljava/lang/String;)V

    goto :goto_1

    .line 294
    :cond_1
    const-string v0, "url"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 296
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 298
    :cond_2
    const-string v0, "appname"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 300
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkAppName(Ljava/lang/String;)V

    goto :goto_1

    .line 302
    :cond_3
    const-string v0, "check"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 305
    const-string v0, ""

    const-string v1, "appid"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkAppID(Ljava/lang/String;)V

    .line 306
    const-string v0, ""

    const-string v1, "package"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkAppPackage(Ljava/lang/String;)V

    .line 307
    const-string v0, ""

    const-string v1, "require_version"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setLinkReqVerCode(Ljava/lang/String;)V

    goto :goto_1

    .line 310
    :cond_4
    const/4 v0, 0x3

    if-ne v4, v0, :cond_5

    .line 312
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_5

    .line 314
    goto :goto_2

    .line 317
    :cond_5
    :goto_1
    goto/16 :goto_0

    .line 318
    :goto_2
    return-object v2
.end method

.method private parseMultiLinkItem(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 332
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 335
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 336
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 337
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 339
    const-string v0, "blob"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 341
    new-instance v6, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    invoke-direct {v6}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;-><init>()V

    .line 342
    const-string v0, ""

    const-string v1, "position"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const-string v2, "type"

    invoke-interface {p1, v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobTypeInfo(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    const-string v0, ""

    const-string v1, "length"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parserInt(Ljava/lang/String;)I

    move-result v7

    .line 344
    const-string v0, ""

    const-string v1, "width"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parserInt(Ljava/lang/String;)I

    move-result v8

    .line 345
    invoke-virtual {v6, v7, v8}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobSize(II)V

    .line 346
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobData(Ljava/lang/String;)V

    .line 349
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 352
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 353
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    invoke-virtual {p2, v9}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->setBlobItemList(Ljava/util/ArrayList;)V

    .line 355
    goto :goto_1

    .line 358
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;->getBlobItemList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    :goto_1
    goto :goto_2

    .line 362
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 364
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 366
    goto :goto_3

    .line 369
    :cond_2
    :goto_2
    goto/16 :goto_0

    .line 370
    :goto_3
    return-void
.end method

.method private parseMultiPicExtension(Lorg/xmlpull/v1/XmlPullParser;)Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 164
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;

    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-direct {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 168
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 169
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 170
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 172
    const-string v0, "size"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setSize(Ljava/lang/String;)V

    goto :goto_1

    .line 176
    :cond_0
    const-string v0, "length-width"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 178
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setLengthWidth(Ljava/lang/String;)V

    goto :goto_1

    .line 181
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 183
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 185
    goto :goto_2

    .line 188
    :cond_2
    :goto_1
    goto :goto_0

    .line 189
    :goto_2
    return-object v2
.end method

.method private parseMultiPicItem(Lorg/xmlpull/v1/XmlPullParser;Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 240
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    .line 243
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    .line 244
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 245
    const/4 v0, 0x2

    if-ne v3, v0, :cond_0

    .line 247
    const-string v0, "bob"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 249
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v5

    .line 250
    invoke-virtual {p2, v5}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setBob_xmlns(Ljava/lang/String;)V

    .line 251
    const-string v0, ""

    const-string v1, "jid"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setJid(Ljava/lang/String;)V

    .line 252
    const-string v0, ""

    const-string v1, "url"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setFileUrl(Ljava/lang/String;)V

    .line 253
    const-string v0, ""

    const-string v1, "max-age"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setMaxAge(Ljava/lang/String;)V

    .line 254
    const-string v0, ""

    const-string v1, "type"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setFileType(Ljava/lang/String;)V

    .line 255
    const-string v0, ""

    const-string v1, "thumbFlag"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;->setThumbFlag(Ljava/lang/String;)V

    .line 256
    goto :goto_1

    .line 258
    :cond_0
    const/4 v0, 0x3

    if-ne v3, v0, :cond_1

    .line 260
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v2, :cond_1

    .line 262
    goto :goto_2

    .line 265
    :cond_1
    :goto_1
    goto/16 :goto_0

    .line 266
    :goto_2
    return-void
.end method

.method private parseVoiceExtension(Lorg/xmlpull/v1/XmlPullParser;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 202
    new-instance v2, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;

    const-string v0, "data"

    const-string v1, "socialim-mutimedia"

    invoke-direct {v2, v0, v1}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    .line 206
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    .line 207
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    .line 208
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 210
    const-string v0, "time"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setTime(Ljava/lang/String;)V

    .line 214
    :cond_0
    const-string v0, "size"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 216
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;->setSize(Ljava/lang/String;)V

    goto :goto_1

    .line 219
    :cond_1
    const/4 v0, 0x3

    if-ne v4, v0, :cond_2

    .line 221
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    if-ne v0, v3, :cond_2

    .line 223
    goto :goto_2

    .line 226
    :cond_2
    :goto_1
    goto :goto_0

    .line 227
    :goto_2
    return-object v2
.end method

.method private parserInt(Ljava/lang/String;)I
    .locals 4

    .line 380
    const/4 v2, 0x0

    .line 381
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 390
    goto :goto_0

    .line 387
    :catch_0
    move-exception v3

    .line 389
    const-string v0, "IQProvider"

    const-string v1, "parse Link message blob item meet NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    :cond_0
    :goto_0
    return v2
.end method


# virtual methods
.method public parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;,
            Lorg/jivesoftware/smack/SmackException;
        }
    .end annotation

    .line 41
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 43
    const-string v0, "IQProvider"

    const-string v1, "parseExtension, but parser is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_0
    const/4 v2, 0x0

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    :goto_0
    if-nez v4, :cond_7

    .line 51
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    .line 52
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v6

    .line 53
    const/4 v0, 0x2

    if-ne v5, v0, :cond_5

    .line 55
    const-string v0, "info"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 57
    const-string v0, ""

    const-string v1, "type"

    invoke-interface {p1, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 58
    const-string v0, "image"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseMultiPicExtension(Lorg/xmlpull/v1/XmlPullParser;)Lcom/huawei/health/sns/server/im/message/impl/packet/MultiPicExtension;

    move-result-object v2

    goto :goto_1

    .line 63
    :cond_1
    const-string v0, "video"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 67
    :cond_2
    const-string v0, "audio"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseVoiceExtension(Lorg/xmlpull/v1/XmlPullParser;)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSVoiceExtension;

    move-result-object v2

    goto :goto_1

    .line 71
    :cond_3
    const-string v0, "link"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 74
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseMultiLinkExtension(Lorg/xmlpull/v1/XmlPullParser;)Lcom/huawei/health/sns/server/im/message/impl/packet/MultiLinkExtension;

    move-result-object v2

    goto :goto_1

    .line 77
    :cond_4
    const-string v0, "item"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 80
    invoke-direct {p0, p1, v3, v2}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parseItem(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;)V

    goto :goto_1

    .line 83
    :cond_5
    const/4 v0, 0x3

    if-ne v5, v0, :cond_6

    .line 85
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 87
    const/4 v4, 0x1

    .line 90
    :cond_6
    :goto_1
    goto/16 :goto_0

    .line 91
    :cond_7
    return-object v2
.end method

.method public bridge synthetic parse(Lorg/xmlpull/v1/XmlPullParser;I)Lorg/jivesoftware/smack/packet/Element;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/huawei/health/sns/server/im/message/impl/provider/SNSMultimediaExtensionProvider;->parse(Lorg/xmlpull/v1/XmlPullParser;I)Lcom/huawei/health/sns/server/im/message/impl/packet/SNSMultimediaExtension;

    move-result-object v0

    return-object v0
.end method
