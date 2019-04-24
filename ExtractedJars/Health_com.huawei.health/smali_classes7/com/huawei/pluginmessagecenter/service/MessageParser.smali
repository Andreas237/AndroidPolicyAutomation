.class public Lcom/huawei/pluginmessagecenter/service/MessageParser;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DEFAULT_POSITION:I = 0x0

.field private static final TAG:Ljava/lang/String; = "MessageParser"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static getPosition(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    .line 97
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 98
    :catch_0
    move-exception v4

    .line 99
    const-string v0, "MessageParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPosition() NumberFormatException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static parseMessageArray(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonSyntaxException;
        }
    .end annotation

    .line 37
    const-string v0, "MessageParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseMessageArray() ==> json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-static {p0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dzz;

    .line 39
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "getLoginInfo"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "getPhoneInfo"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-interface {v4, v0}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 40
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 42
    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    .line 43
    const-class v0, [Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;

    invoke-virtual {v7, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;

    .line 44
    if-eqz v8, :cond_2

    .line 45
    const/4 v9, 0x0

    :goto_0
    array-length v0, v8

    if-ge v9, v0, :cond_2

    .line 46
    aget-object v0, v8, v9

    if-eqz v0, :cond_1

    .line 47
    new-instance v10, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v10}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 48
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 49
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgType()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 50
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 52
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getExpireTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/eae;->d(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 53
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgContext()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 54
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getFlag()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 55
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getWeight()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 56
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 57
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getImgBigUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgBigUri(Ljava/lang/String;)V

    .line 58
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 59
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getFrom()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgFrom(Ljava/lang/String;)V

    .line 60
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 61
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getPosition()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/pluginmessagecenter/service/MessageParser;->getPosition(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 62
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgDevice()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImei(Ljava/lang/String;)V

    .line 63
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgPosition()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 64
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getInfoClassify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoClassify(Ljava/lang/String;)V

    .line 65
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getHeatMapCity()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHeatMapCity(Ljava/lang/String;)V

    .line 66
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getInfoRecommend()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoRecommend(I)V

    .line 67
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgUserLable()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgUserLable(Ljava/lang/String;)V

    .line 68
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgMaterial()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 69
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getLayout()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setLayout(I)V

    .line 70
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMessageExtList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMessageExtList(Ljava/util/List;)V

    .line 71
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getPageType()I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPageType(I)V

    .line 74
    aget-object v0, v8, v9

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v11

    .line 75
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {v11, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v11

    .line 76
    const/4 v0, 0x0

    if-eq v0, v11, :cond_0

    const-string v0, "S"

    invoke-virtual {v11, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const-string v0, "huid"

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 79
    :cond_0
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 83
    :cond_2
    const-string v0, "MessageParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseMessageArray:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-object v6
.end method

.method public static parseRevokeIdArray(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonSyntaxException;
        }
    .end annotation

    .line 88
    const-string v0, "MessageParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseRevokeIdArray json = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 90
    new-instance v0, Lcom/huawei/pluginmessagecenter/service/MessageParser$1;

    invoke-direct {v0}, Lcom/huawei/pluginmessagecenter/service/MessageParser$1;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/service/MessageParser$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 91
    return-object v5
.end method
