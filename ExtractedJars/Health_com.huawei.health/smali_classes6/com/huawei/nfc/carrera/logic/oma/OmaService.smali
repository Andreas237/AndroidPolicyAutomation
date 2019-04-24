.class public Lcom/huawei/nfc/carrera/logic/oma/OmaService;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CHANNELID:Ljava/lang/String; = "00"

.field private static final CHANNELID_0:I = 0x0

.field private static final SELECT_COMMANDER:Ljava/lang/String; = "00A40400"

.field private static final TAG:Ljava/lang/String; = "OmaService"

.field private static pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter; = null


# instance fields
.field private channels:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private channelsEx:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->channelsEx:Ljava/util/HashMap;

    .line 44
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->channels:Ljava/util/HashMap;

    .line 47
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v1

    .line 48
    invoke-virtual {v1}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    sput-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 49
    return-void
.end method

.method private excuteApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;
        }
    .end annotation

    .line 252
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/PluginPayAdapter;->sendApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private resetApduCommondStatus(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;)V"
        }
    .end annotation

    .line 237
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 238
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setRapdu(Ljava/lang/String;)V

    .line 239
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setSw(Ljava/lang/String;)V

    .line 240
    goto :goto_0

    .line 241
    :cond_0
    return-void
.end method

.method private setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation

    .line 229
    invoke-virtual {p1, p2}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setData(Ljava/lang/Object;)V

    .line 230
    invoke-virtual {p1, p3}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setResultCode(I)V

    .line 231
    invoke-virtual {p1, p4}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setMsg(Ljava/lang/String;)V

    .line 232
    return-object p1
.end method


# virtual methods
.method public closeChannel()V
    .locals 2

    .line 277
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 278
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->closeChannel()V

    .line 280
    :cond_0
    return-void
.end method

.method excuteApduList(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation

    .line 60
    new-instance v4, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;-><init>()V

    .line 61
    const/4 v5, 0x0

    .line 62
    const-string v6, "Success"

    .line 63
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    :cond_0
    const/16 v5, 0x3ec

    .line 65
    const-string v6, "OmaService excuteApduList failed.capdu is empty"

    .line 66
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 69
    :cond_1
    if-nez p2, :cond_2

    .line 70
    new-instance p2, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-direct/range {p2 .. p2}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;-><init>()V

    .line 73
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->resetApduCommondStatus(Ljava/util/List;)V

    .line 75
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->getAid()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->channels:Ljava/util/HashMap;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 77
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 78
    invoke-virtual {v4, v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setLastExcutedCommand(Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;)V

    .line 79
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v10

    .line 80
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    const/16 v5, 0x3e9

    .line 82
    const-string v6, "OmaService apdu of command is null"

    .line 83
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 85
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "00A40400"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 87
    const-string v0, "00A40400"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    .line 88
    add-int/lit8 v0, v11, 0x2

    invoke-virtual {v10, v11, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 89
    const/16 v0, 0x10

    invoke-static {v12, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 90
    add-int/lit8 v11, v11, 0x2

    .line 91
    mul-int/lit8 v0, v13, 0x2

    add-int/2addr v0, v11

    invoke-virtual {v10, v11, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 93
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->closeChannel()V

    .line 96
    :cond_4
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->setAid(Ljava/lang/String;)V

    .line 97
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl excuteApduListEx aid\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->getChannelType()I

    move-result v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v14, v0}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v15

    .line 99
    const/4 v0, 0x0

    if-eq v0, v15, :cond_5

    .line 100
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const-string v0, "apdu"

    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/String;

    .line 101
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const-string v0, "channelID"

    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessServiceImpl excuteApduListEx selectResp\u3000\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    move-object/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->parseRapduAndSw(Ljava/lang/String;)V

    .line 104
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->channels:Ljava/util/HashMap;

    move-object/from16 v1, p2

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    goto/16 :goto_0

    .line 111
    :cond_5
    const-string v0, "00"

    move-object/from16 v1, p0

    :try_start_0
    invoke-direct {v1, v0, v10}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->excuteApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 112
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "excuteApduList requs : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; resp : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    goto :goto_1

    .line 113
    :catch_0
    move-exception v12

    .line 114
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->getErrorCode()I

    move-result v5

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteApduList excuteApdu failed. apdu index : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 116
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 118
    :goto_1
    const/4 v0, 0x1

    invoke-static {v11, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_7

    .line 119
    :cond_6
    invoke-virtual {v9, v11}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setRapdu(Ljava/lang/String;)V

    .line 120
    const/16 v5, 0xfa1

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteApduList excuteApdu failed. rapdu is small. resp : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 122
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 124
    :cond_7
    invoke-virtual {v9, v11}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->parseRapduAndSw(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v12

    .line 127
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    .line 128
    if-eqz v12, :cond_8

    const/4 v14, 0x1

    goto :goto_2

    :cond_8
    const/4 v14, 0x0

    .line 129
    :goto_2
    if-eqz v14, :cond_9

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 130
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "excuteApduList \u6267\u884c\u7ed3\u679c\u72b6\u6001\u5b57\u548c\u9884\u671f\u4e0d\u7b26\uff0c\u7ec8\u6b62\u540e\u7eed\u6307\u4ee4\u7684\u6267\u884c\uff0c\u8fd4\u56de "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-virtual {v4, v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setLastExcutedCommand(Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;)V

    .line 133
    const/16 v5, 0xfa2

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteApduList excuteApdu failed. sw is not matched. sw : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " checker : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 135
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " apdu index : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 136
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 138
    :cond_9
    goto/16 :goto_0

    .line 139
    :cond_a
    move-object/from16 v0, p2

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setData(Ljava/lang/Object;)V

    .line 140
    return-object v4
.end method

.method public excuteApduListEx(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult<Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;>;"
        }
    .end annotation

    .line 144
    new-instance v4, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;-><init>()V

    .line 145
    const/4 v5, 0x0

    .line 146
    const-string v6, "Success"

    .line 147
    if-eqz p1, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 148
    :cond_0
    const/16 v5, 0x3ec

    .line 149
    const-string v6, "OmaService excuteApduListEx failed.capdu is empty"

    .line 150
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 153
    :cond_1
    if-nez p2, :cond_2

    .line 154
    new-instance p2, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    invoke-direct/range {p2 .. p2}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;-><init>()V

    .line 156
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->channelsEx:Ljava/util/HashMap;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 157
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl excuteApduList nfcChannel\u3000\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->resetApduCommondStatus(Ljava/util/List;)V

    .line 160
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 161
    invoke-virtual {v4, v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setLastExcutedCommand(Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;)V

    .line 162
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v10

    .line 163
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 164
    const/16 v5, 0x3e9

    .line 165
    const-string v6, "OmaService excuteApduListEx apdu of command is null"

    .line 166
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 168
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "00A40400"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 170
    const-string v0, "00A40400"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    .line 171
    add-int/lit8 v0, v11, 0x2

    invoke-virtual {v10, v11, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    .line 172
    const/16 v0, 0x10

    invoke-static {v12, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 173
    add-int/lit8 v11, v11, 0x2

    .line 174
    mul-int/lit8 v0, v13, 0x2

    add-int/2addr v0, v11

    invoke-virtual {v10, v11, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 176
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 177
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->closeChannel()V

    .line 179
    :cond_4
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->setAid(Ljava/lang/String;)V

    .line 180
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl excuteApduListEx aid\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->getChannelType()I

    move-result v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v14, v0}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v15

    .line 182
    const/4 v0, 0x0

    if-eq v0, v15, :cond_5

    .line 183
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const-string v0, "apdu"

    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/lang/String;

    .line 184
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const-string v0, "channelID"

    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/String;

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessServiceImpl excuteApduListEx selectResp\u3000\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    move-object/from16 v0, v16

    invoke-virtual {v9, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->parseRapduAndSw(Ljava/lang/String;)V

    .line 187
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->channelsEx:Ljava/util/HashMap;

    move-object/from16 v1, p2

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    goto/16 :goto_0

    .line 191
    :cond_5
    const/4 v11, 0x0

    .line 195
    const-string v0, "00"

    move-object/from16 v1, p0

    :try_start_0
    invoke-direct {v1, v0, v10}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->excuteApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 196
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "excuteApduListEx requs : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; resp : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    goto :goto_1

    .line 197
    :catch_0
    move-exception v12

    .line 198
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->getErrorCode()I

    move-result v5

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteApduListEx excuteApdu failed. apdu index : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 200
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 203
    :goto_1
    const/4 v0, 0x1

    invoke-static {v11, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_7

    .line 204
    :cond_6
    invoke-virtual {v9, v11}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setRapdu(Ljava/lang/String;)V

    .line 205
    const/16 v5, 0xfa1

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteApduListEx excuteApdu failed. rapdu is small. resp : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 207
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 209
    :cond_7
    invoke-virtual {v9, v11}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->parseRapduAndSw(Ljava/lang/String;)V

    .line 211
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v12

    .line 212
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v13

    .line 213
    if-eqz v12, :cond_8

    const/4 v14, 0x1

    goto :goto_2

    :cond_8
    const/4 v14, 0x0

    .line 214
    :goto_2
    if-eqz v14, :cond_9

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 216
    invoke-virtual {v4, v9}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setLastExcutedCommand(Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;)V

    .line 217
    const/16 v5, 0xfa2

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excuteApduListEx excuteApdu failed. sw is not matched. sw : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " checker : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 219
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " apdu index : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 220
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v4, v1, v5, v6}, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->setResult(Lcom/huawei/nfc/carrera/logic/oma/TaskResult;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v0

    return-object v0

    .line 222
    :cond_9
    goto/16 :goto_0

    .line 223
    :cond_a
    move-object/from16 v0, p2

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->setData(Ljava/lang/Object;)V

    .line 224
    return-object v4
.end method

.method public openChannel(Ljava/lang/String;I)Ljava/util/Map;
    .locals 4

    .line 262
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " NfcChannel open channel for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 264
    sget-object v0, Lcom/huawei/nfc/carrera/logic/oma/OmaService;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/PluginPayAdapter;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 266
    :cond_0
    const-string v0, "OmaService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " NfcChannel open pluginPayAdapter =null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v0, 0x0

    return-object v0
.end method
