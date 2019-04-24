.class public Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "AddressNameMgr"


# instance fields
.field private addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

.field private conditionKey:Ljava/lang/String;

.field private conditionValue:Ljava/lang/String;

.field private moduleAddressNameCfgList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;"
        }
    .end annotation
.end field

.field private moduleName:Ljava/lang/String;

.field private serverAddressCfgMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleName:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->conditionKey:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->conditionValue:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    .line 37
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->serverAddressCfgMap:Ljava/util/Map;

    return-void
.end method

.method private parseEndTag(Landroid/content/res/XmlResourceParser;)V
    .locals 3

    .line 123
    const-string v0, "Module"

    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->serverAddressCfgMap:Ljava/util/Map;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleName:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    .line 129
    :cond_0
    const-string v0, "Param"

    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->conditionKey:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->conditionValue:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/config/AddressName;->addCondition(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    :cond_1
    const-string v0, "Address"

    invoke-interface {p1}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 139
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    .line 145
    :cond_3
    return-void
.end method

.method private parseStartTag(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 4

    .line 150
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 151
    const-string v0, "parseStartTag,xmlParser is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 152
    return-void

    .line 155
    :cond_0
    const-string v0, "Module"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    const-string v0, "name"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleName:Ljava/lang/String;

    .line 158
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleAddressNameCfgList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 162
    const-string v0, "Address"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 164
    const-string v0, "name"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 165
    const-string v0, "serverAddressName"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 166
    new-instance v0, Lcom/huawei/nfc/carrera/server/config/AddressName;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->moduleName:Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/server/config/AddressName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    .line 167
    goto :goto_0

    .line 169
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->addressNameCfg:Lcom/huawei/nfc/carrera/server/config/AddressName;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 171
    const-string v0, "Param"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 173
    const-string v0, "name"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->conditionKey:Ljava/lang/String;

    .line 174
    const-string v0, "value"

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->conditionValue:Ljava/lang/String;

    .line 177
    :cond_3
    :goto_0
    return-void
.end method

.method private parseXml(Landroid/content/Context;Ljava/util/Map;Landroid/content/res/XmlResourceParser;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;>;Landroid/content/res/XmlResourceParser;)V"
        }
    .end annotation

    .line 68
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->serverAddressCfgMap:Ljava/util/Map;

    .line 72
    if-nez p3, :cond_1

    .line 106
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    .line 109
    :try_start_0
    invoke-interface {p3}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    goto :goto_0

    .line 111
    :catch_0
    move-exception v3

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close Exception"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 75
    :cond_0
    :goto_0
    return-void

    .line 78
    :cond_1
    :try_start_1
    invoke-interface {p3}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v3

    .line 80
    :goto_1
    const/4 v0, 0x1

    if-eq v3, v0, :cond_2

    .line 82
    packed-switch v3, :pswitch_data_0

    goto :goto_2

    .line 85
    :pswitch_0
    goto :goto_2

    .line 87
    :pswitch_1
    invoke-direct {p0, p3}, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->parseStartTag(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 88
    goto :goto_2

    .line 90
    :pswitch_2
    invoke-direct {p0, p3}, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->parseEndTag(Landroid/content/res/XmlResourceParser;)V

    .line 91
    .line 95
    :goto_2
    :pswitch_3
    invoke-interface {p3}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v3

    goto :goto_1

    .line 106
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p3, :cond_4

    .line 109
    :try_start_2
    invoke-interface {p3}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 114
    goto/16 :goto_4

    .line 111
    :catch_1
    move-exception v3

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close Exception"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 114
    goto :goto_4

    .line 98
    :catch_2
    move-exception v3

    .line 100
    const-string v0, " Process address mapping xml file failed."

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_3
    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    const/4 v0, 0x0

    if-eq v0, p3, :cond_4

    .line 109
    :try_start_4
    invoke-interface {p3}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 114
    goto :goto_4

    .line 111
    :catch_3
    move-exception v3

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close Exception"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 114
    goto :goto_4

    .line 106
    :catchall_0
    move-exception v4

    const/4 v0, 0x0

    if-eq v0, p3, :cond_3

    .line 109
    :try_start_5
    invoke-interface {p3}, Landroid/content/res/XmlResourceParser;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 114
    goto :goto_3

    .line 111
    :catch_4
    move-exception v5

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close Exception"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 116
    :cond_3
    :goto_3
    throw v4

    .line 117
    :cond_4
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public parseXml(Landroid/content/Context;Ljava/util/Map;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;>;I)V"
        }
    .end annotation

    .line 43
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    .line 44
    invoke-direct {p0, p1, p2, v2}, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->parseXml(Landroid/content/Context;Ljava/util/Map;Landroid/content/res/XmlResourceParser;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    goto :goto_0

    .line 46
    :catch_0
    move-exception v2

    .line 48
    const-string v0, "XmlParseUtil,parseXml-xmlRes exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 51
    :goto_0
    return-void
.end method

.method public parseXml(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 57
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/AssetManager;->openXmlResourceParser(Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v2

    .line 58
    invoke-direct {p0, p1, p2, v2}, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->parseXml(Landroid/content/Context;Ljava/util/Map;Landroid/content/res/XmlResourceParser;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    goto :goto_0

    .line 60
    :catch_0
    move-exception v2

    .line 62
    const-string v0, "XmlParseUtil,parseXml-xmlPath exception"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 64
    :goto_0
    return-void
.end method
