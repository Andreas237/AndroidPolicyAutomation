.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "CardInfoRead"


# instance fields
.field private channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

.field private configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

.field private omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    .line 42
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    .line 43
    return-void
.end method

.method private readBalance(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 155
    new-instance v2, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardBalanceInfoReader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    invoke-direct {v2, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardBalanceInfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->setChannelID(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V

    .line 157
    const/4 v0, 0x3

    invoke-direct {p0, p1, v0, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardInfoImpl(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/Integer;

    .line 159
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getChannelID()Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 160
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    array-length v0, v3

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 161
    const/4 v0, 0x0

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->setOverdraftAmount(I)V

    .line 162
    const/4 v0, 0x1

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->setAmount(I)V

    .line 165
    :cond_0
    return-void
.end method

.method private readCardDate(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;->isSameApduNumAndDate(Ljava/lang/String;)Z

    move-result v2

    .line 118
    const/4 v3, 0x0

    .line 119
    const/4 v4, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    if-eqz v2, :cond_1

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;->getApudList(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v6

    .line 125
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 126
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getRapdu()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 127
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;->getApudList(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v6

    .line 128
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 129
    instance-of v0, v7, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    if-eqz v0, :cond_1

    .line 131
    move-object v0, v7

    check-cast v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getOperations()Ljava/util/List;

    move-result-object v4

    .line 134
    :cond_1
    new-instance v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardDateInfoReader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    invoke-direct {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardDateInfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V

    .line 135
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v4, :cond_2

    .line 137
    invoke-virtual {v6, v3, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->readInfoFromData(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [Ljava/lang/String;

    .line 139
    :cond_2
    if-nez v5, :cond_3

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->setChannelID(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V

    .line 142
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardInfoImpl(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [Ljava/lang/String;

    .line 144
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getChannelID()Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 146
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    array-length v0, v5

    const/4 v1, 0x1

    if-le v0, v1, :cond_4

    .line 147
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->setEnableDate(Ljava/lang/String;)V

    .line 148
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->setExpireDate(Ljava/lang/String;)V

    .line 151
    :cond_4
    return-void
.end method

.method private readCardInfoImpl(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader<TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 169
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readCardInfoImpl"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->configData:Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/configdata/ConfigData;->getApudList(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    .line 172
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 173
    :cond_0
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readCardInfoImpl apdus is null or size = 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    return-object v0

    .line 177
    :cond_1
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 178
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " APDU "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 181
    :cond_2
    invoke-virtual {p3, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->setCommandList(Ljava/util/List;)V

    .line 182
    const/4 v5, 0x0

    .line 185
    :try_start_0
    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->readInfo()Ljava/lang/Object;

    move-result-object v5

    .line 186
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readCardInfoImpl data : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    goto :goto_1

    .line 188
    :catch_0
    move-exception v6

    .line 190
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    invoke-virtual {p3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getChannelID()Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/oma/IOmaService;->closeChannel(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V

    .line 191
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getErrCode()I

    move-result v1

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 193
    :goto_1
    return-object v5
.end method

.method private readCardNum(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 105
    new-instance v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardNumInfoReader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    invoke-direct {v4, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardNumInfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->setChannelID(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V

    .line 107
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardInfoImpl(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 108
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readCardNum cardNum : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getChannelID()Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 111
    invoke-virtual {p2, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->setCardNum(Ljava/lang/String;)V

    .line 112
    return-void
.end method


# virtual methods
.method public closeChannel()V
    .locals 2

    .line 198
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/oma/IOmaService;->closeChannel(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 200
    return-void
.end method

.method public readCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 47
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readCardInfo AID : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; productId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; dataType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;-><init>()V

    .line 49
    new-instance v0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->setAid(Ljava/lang/String;)V

    .line 53
    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 55
    invoke-direct {p0, p2, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardNum(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;)V

    .line 58
    :cond_0
    and-int/lit8 v0, p3, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 60
    invoke-direct {p0, p2, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardDate(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;)V

    .line 63
    :cond_1
    and-int/lit8 v0, p3, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 65
    invoke-direct {p0, p2, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readBalance(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;)V

    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->closeChannel()V

    .line 68
    return-object v4
.end method

.method public readTransactionRecords(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 73
    new-instance v0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->setAid(Ljava/lang/String;)V

    .line 75
    new-instance v4, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardRecordInfoReader;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    invoke-direct {v4, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/CardRecordInfoReader;-><init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->setChannelID(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V

    .line 77
    const/4 v0, 0x4

    invoke-direct {p0, p2, v0, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardInfoImpl(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 79
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getChannelID()Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz p2, :cond_3

    const-string v0, "p_xian_01"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 82
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "begin read consume_records ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    const/16 v0, 0xb

    invoke-direct {p0, p2, v0, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->readCardInfoImpl(Ljava/lang/String;ILcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 84
    if-nez v6, :cond_0

    .line 85
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "consume_records = null le"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 86
    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 87
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;

    .line 88
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tr: type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getRecordType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ammount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 89
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getRecordAmount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " time = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 90
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getRecordTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 88
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    goto :goto_0

    :cond_1
    goto :goto_1

    .line 93
    :cond_2
    const-string v0, "CardInfoRead"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "consume_records.size is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/TrafficCardInfoReader;->closeChannel()V

    .line 97
    if-eqz v6, :cond_4

    .line 98
    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 100
    :cond_4
    return-object v5
.end method
