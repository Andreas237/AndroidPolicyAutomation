.class public abstract Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

.field private commandList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation
.end field

.field private omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;


# direct methods
.method protected constructor <init>(Lcom/huawei/nfc/carrera/logic/oma/IOmaService;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    .line 32
    return-void
.end method

.method private checkVerifyPinSW(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 127
    const-string v0, "00200000"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    const/16 v0, 0x9

    return v0

    .line 132
    :cond_0
    const-string v0, "63C"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    const/16 v0, 0xcf

    return v0

    .line 137
    :cond_1
    const-string v0, "6983"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 139
    const/16 v0, 0xd0

    return v0

    .line 141
    :cond_2
    const/16 v0, 0x9

    return v0
.end method

.method private handlerRespData(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 167
    if-nez p2, :cond_0

    .line 169
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, "handlerRespData param is illegal"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 173
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 174
    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 178
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;

    .line 179
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->isNeedChangeParamWithData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    invoke-virtual {v5, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->changeParamWithData(Ljava/util/List;)V

    .line 183
    :cond_1
    invoke-virtual {v5, v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;->checkAndHandleData(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 185
    :cond_2
    return-object v3
.end method


# virtual methods
.method protected checkData(Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 190
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " the data is empty"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3e7

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 195
    :cond_1
    return-void
.end method

.method public getChannelID()Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    return-object v0
.end method

.method protected getNextStep(Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;II)I
    .locals 0

    .line 121
    add-int/lit8 p2, p2, 0x1

    return p2
.end method

.method protected abstract handleResult(Ljava/util/List;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation
.end method

.method public readInfo()Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->commandList:Ljava/util/List;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, "readInfo commandList is null"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 44
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 45
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->commandList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 48
    instance-of v0, v6, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    if-nez v0, :cond_1

    .line 50
    goto :goto_0

    .line 52
    :cond_1
    move-object v7, v6

    check-cast v7, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    .line 54
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getOperations()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 57
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 60
    :cond_2
    goto :goto_0

    .line 62
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    .line 64
    if-gtz v6, :cond_4

    .line 66
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, "readInfo no operation exists in any APDU command."

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 69
    :cond_4
    const/4 v7, 0x0

    .line 70
    :goto_1
    if-ge v7, v6, :cond_9

    .line 72
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .line 73
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-interface {v0, v8, v1}, Lcom/huawei/nfc/carrera/logic/oma/IOmaService;->excuteApduList(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v9

    .line 74
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 75
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_8

    .line 77
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getMsg()Ljava/lang/String;

    move-result-object v10

    .line 78
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getResultCode()I

    move-result v11

    .line 79
    const/16 v0, 0x7d5

    if-ne v11, v0, :cond_5

    .line 81
    const/4 v11, 0x3

    goto :goto_2

    .line 83
    :cond_5
    const/16 v0, 0xfa2

    if-ne v11, v0, :cond_6

    .line 85
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getLastExcutedCommand()Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v12

    .line 86
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getLastExcutedCommand()Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v13

    .line 87
    invoke-direct {p0, v12, v13}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->checkVerifyPinSW(Ljava/lang/String;Ljava/lang/String;)I

    move-result v11

    .line 88
    goto :goto_2

    .line 89
    :cond_6
    const/16 v0, 0xfa1

    if-ne v11, v0, :cond_7

    .line 91
    const/16 v11, 0x9

    goto :goto_2

    .line 95
    :cond_7
    const/4 v11, 0x6

    .line 97
    :goto_2
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "readInfo excuteApduList failed. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v11, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 100
    :cond_8
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;

    .line 102
    const/4 v11, 0x0

    .line 105
    :try_start_0
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getRapdu()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->getOperations()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->handlerRespData(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v11, v0

    .line 111
    goto :goto_3

    .line 107
    :catch_0
    move-exception v12

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readInfo step "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " failed. msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " apdu info "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 110
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 112
    :goto_3
    invoke-virtual {p0, v10, v7, v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->getNextStep(Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/ApduCommandInfo;II)I

    move-result v7

    .line 113
    invoke-interface {v5, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    goto/16 :goto_1

    .line 115
    :cond_9
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->handleResult(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public readInfoFromData(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 146
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 148
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, "readInfoFromData param is illegal"

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 151
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->handlerRespData(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 152
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 153
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 154
    invoke-virtual {p0, v4}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->handleResult(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public setChannelID(Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->channelID:Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 214
    return-void
.end method

.method public setCommandList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;)V"
        }
    .end annotation

    .line 218
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/traffic/readers/InfoReader;->commandList:Ljava/util/List;

    .line 219
    return-void
.end method
