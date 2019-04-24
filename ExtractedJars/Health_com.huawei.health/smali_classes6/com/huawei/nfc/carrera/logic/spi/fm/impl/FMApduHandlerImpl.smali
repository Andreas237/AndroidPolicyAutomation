.class public Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcn/com/fmsh/script/ApduHandler;


# static fields
.field private static final APDU_LOCK:Ljava/lang/Object;

.field private static final DEVICE_CONNECTED:I = 0x2

.field private static final DEVICE_CONNECTING:I = 0x1

.field private static final DEVICE_CONNECT_FAILED:I = 0x4

.field private static final DEVICE_DISCONNECTED:I = 0x3

.field private static final DEVICE_UNAVAILABLE:I = 0x5

.field private static final DEVICE_UNKNOWN:I = 0x0

.field private static final OPEN_LOCK:Ljava/lang/Object;

.field private static final STPC_AID_SH:[B


# instance fields
.field private final STPC_AID_LNT:[B

.field private final TAG:Ljava/lang/String;

.field private volatile currentAid:[B

.field private volatile isOpen:Z

.field private pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    const/16 v0, 0x9

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->STPC_AID_SH:[B

    .line 65
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->APDU_LOCK:Ljava/lang/Object;

    .line 68
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->OPEN_LOCK:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 1
        -0x60t
        0x0t
        0x0t
        0x0t
        0x3t
        -0x7at
        -0x68t
        0x7t
        0x1t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v0, "FMServiceImpl"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->TAG:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    .line 62
    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->STPC_AID_LNT:[B

    .line 72
    invoke-static {p1}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 74
    return-void

    nop

    :array_0
    .array-data 1
        0x59t
        0x43t
        0x54t
        0x2et
        0x55t
        0x53t
        0x45t
        0x52t
    .end array-data
.end method

.method private getAidByte()[B
    .locals 3

    .line 190
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMAIDUtil;->getAid()Ljava/lang/String;

    move-result-object v2

    .line 191
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    :cond_0
    const-string v0, "getAidByte enter aid is null "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 193
    const/4 v0, 0x0

    return-object v0

    .line 195
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getAidByte aid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 196
    const-string v0, "A00000000386980701"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 197
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->STPC_AID_SH:[B

    return-object v0

    .line 198
    :cond_2
    const-string v0, "5943542E55534552"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->STPC_AID_LNT:[B

    return-object v0

    .line 201
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->STPC_AID_SH:[B

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 95
    const-string v0, "FMServiceImpl"

    const-string v1, "FMApduHandlerImpl close"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    .line 98
    const-string v0, "FMServiceImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl close pluginPayAdapter : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 100
    return-void

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->closeChannel()V

    .line 103
    return-void
.end method

.method public connect()Z
    .locals 2

    .line 86
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->close()V

    .line 88
    const-string v0, "FMServiceImpl"

    const-string v1, "FMApduHandlerImpl connect"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->open([B)Z

    move-result v0

    return v0
.end method

.method public getApduHandlerType()Lcn/com/fmsh/script/ApduHandler$ApduHandlerType;
    .locals 3

    .line 109
    const-string v0, "FMServiceImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl getApduHandlerType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lcn/com/fmsh/script/ApduHandler$ApduHandlerType;->BLUETOOTH:Lcn/com/fmsh/script/ApduHandler$ApduHandlerType;

    .line 110
    invoke-virtual {v2}, Lcn/com/fmsh/script/ApduHandler$ApduHandlerType;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    sget-object v0, Lcn/com/fmsh/script/ApduHandler$ApduHandlerType;->BLUETOOTH:Lcn/com/fmsh/script/ApduHandler$ApduHandlerType;

    return-object v0
.end method

.method public isBTConnect()Z
    .locals 4

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 172
    const-string v0, "FMServiceImpl"

    const-string v1, "isBTConnect pluginPayAdapter is null "

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const/4 v0, 0x0

    return v0

    .line 175
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v3

    .line 176
    const-string v0, "FMServiceImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl isBTConnect connectState = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x2

    if-eq v0, v3, :cond_1

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    .line 179
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    .line 180
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMAIDUtil;->setAid(Ljava/lang/String;)V

    .line 182
    const/4 v0, 0x0

    return v0

    .line 185
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public isConnect()Z
    .locals 3

    .line 79
    const-string v0, "FMServiceImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl isConnect : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    return v0
.end method

.method public open([B)Z
    .locals 5

    .line 118
    sget-object v3, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->OPEN_LOCK:Ljava/lang/Object;

    monitor-enter v3

    .line 119
    const-string v0, "FMServiceImpl"

    const-string v1, "FMApduHandlerImpl open"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 121
    const-string v0, "FMServiceImpl"

    const-string v1, "pluginPayAdapter is null "

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    monitor-exit v3

    const/4 v0, 0x0

    return v0

    .line 125
    :cond_0
    if-eqz p1, :cond_1

    :try_start_1
    array-length v0, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->getAidByte()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/PluginPayAdapter;->openChannelSNB([BI)[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    .line 127
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->getAidByte()[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    goto :goto_2

    .line 130
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/huawei/nfc/PluginPayAdapter;->openChannelSNB([BI)[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    .line 131
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    .line 134
    :goto_2
    const-string v0, "FMServiceImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl open"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    return v0

    .line 136
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public transceive([B)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcn/com/fmsh/script/exception/FMScriptHandleException;
        }
    .end annotation

    .line 144
    sget-object v3, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->APDU_LOCK:Ljava/lang/Object;

    monitor-enter v3

    .line 145
    const-string v0, "FMServiceImpl"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl transceive apdu = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isBTConnect()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 147
    :cond_0
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 150
    :cond_1
    const/4 v4, 0x0

    .line 151
    :try_start_1
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    if-nez v0, :cond_5

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    array-length v0, v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    .line 153
    :cond_2
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->getAidByte()[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    .line 155
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->currentAid:[B

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/PluginPayAdapter;->openChannelSNB([BI)[B

    move-result-object v4

    .line 156
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z

    .line 158
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->isOpen:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_5

    .line 159
    monitor-exit v3

    const/4 v0, 0x0

    return-object v0

    .line 162
    :cond_5
    :try_start_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMApduHandlerImpl;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, p1}, Lcom/huawei/nfc/PluginPayAdapter;->transmitSNB([B)[B

    move-result-object v4

    .line 163
    const-string v0, "FMServiceImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "FMApduHandlerImpl transceive apdu response = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v4}, Lcn/com/fmsh/util/FM_Bytes;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    monitor-exit v3

    return-object v4

    .line 165
    :catchall_0
    move-exception v5

    monitor-exit v3

    throw v5
.end method
