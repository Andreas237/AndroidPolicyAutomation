.class public final Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;


# static fields
.field private static final CHIP_MANU_NXP:Ljava/lang/String; = "01"

.field private static final FORTUNA_MODLE:Ljava/lang/String; = "Fortuna-B19"

.field private static final TAG:Ljava/lang/String; = "ESEInfoManager"

.field private static final TALOS_MODLE:Ljava/lang/String; = "Talos-B19"

.field private static instance:Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager; = null

.field private static final lock:Ljava/lang/Object;

.field private static pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter; = null


# instance fields
.field getFullCardNoResponseCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse;>;"
        }
    .end annotation
.end field

.field getFullCardNoTimeCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field responseCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/ese/response/CardQueryResponse;>;"
        }
    .end annotation
.end field

.field private supportList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field timeCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Long;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->lock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->responseCache:Ljava/util/Map;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getFullCardNoResponseCache:Ljava/util/Map;

    .line 68
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->timeCache:Ljava/util/Map;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getFullCardNoTimeCache:Ljava/util/Map;

    .line 92
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->mContext:Landroid/content/Context;

    .line 93
    return-void
.end method

.method private getCplcFromESE()Ljava/lang/String;
    .locals 4

    .line 112
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->lock:Ljava/lang/Object;

    monitor-enter v2

    .line 114
    const-string v0, "cache cplc is null, getCplcFromESE"

    :try_start_0
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 115
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 116
    const-string v0, ""

    monitor-exit v2

    return-object v0

    .line 118
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getCplc()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 119
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;
    .locals 5

    .line 78
    sget-object v2, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->lock:Ljava/lang/Object;

    monitor-enter v2

    .line 79
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->instance:Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 80
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->instance:Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    .line 82
    :cond_0
    invoke-static {p0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v3

    .line 83
    invoke-virtual {v3}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/PluginPayAdapter;

    sput-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    .line 84
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->instance:Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 85
    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method private getNewDeviceModel(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 216
    move-object v1, p1

    .line 217
    const-string v0, "Talos-B19"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 218
    const-string v1, "Talos-B19"

    goto :goto_0

    .line 219
    :cond_0
    const-string v0, "Fortuna-B19"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 220
    const-string v1, "Fortuna-B19"

    .line 222
    :cond_1
    :goto_0
    return-object v1
.end method


# virtual methods
.method public addBusCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 227
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 228
    const/4 v0, 0x0

    return v0

    .line 230
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/nfc/PluginPayAdapter;->addBusCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public esePowerOff()Z
    .locals 1

    .line 143
    const-string v0, "esePowerOff begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 144
    const/4 v0, 0x0

    return v0
.end method

.method public esePowerOn()Z
    .locals 1

    .line 136
    const-string v0, "esePowerOn begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 137
    const/4 v0, 0x0

    return v0
.end method

.method public getBusChipManu()Ljava/lang/String;
    .locals 1

    .line 287
    const-string v0, "01"

    return-object v0
.end method

.method public getDeviceBTVersion()Ljava/lang/String;
    .locals 3

    .line 235
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 236
    const-string v0, ""

    return-object v0

    .line 238
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceInfo()Ljava/util/Map;

    move-result-object v0

    const-string v1, "BT_version"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 239
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    const-string v0, ""

    return-object v0

    .line 242
    :cond_1
    return-object v2
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 3

    .line 204
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 205
    const-string v0, ""

    return-object v0

    .line 207
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceInfo()Ljava/util/Map;

    move-result-object v0

    const-string v1, "device_model"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 208
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 209
    const-string v0, ""

    return-object v0

    .line 212
    :cond_1
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getNewDeviceModel(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceSN()Ljava/lang/String;
    .locals 3

    .line 180
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 181
    const-string v0, ""

    return-object v0

    .line 183
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceInfo()Ljava/util/Map;

    move-result-object v0

    const-string v1, "device_sn"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 184
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    const-string v0, ""

    return-object v0

    .line 187
    :cond_1
    return-object v2
.end method

.method public getDeviceSoftVersion()Ljava/lang/String;
    .locals 3

    .line 192
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 193
    const-string v0, ""

    return-object v0

    .line 195
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceInfo()Ljava/util/Map;

    move-result-object v0

    const-string v1, "soft_version"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 196
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    const-string v0, ""

    return-object v0

    .line 199
    :cond_1
    return-object v2
.end method

.method public getSupportList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 259
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->supportList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getWalletAbility()Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;
    .locals 4

    .line 247
    const/4 v2, 0x0

    .line 248
    const-string v3, ""

    .line 249
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 250
    sget-object v0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getWalletAbility()Ljava/lang/String;

    move-result-object v3

    .line 251
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;

    invoke-direct {v2, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;-><init>(Ljava/lang/String;)V

    .line 253
    :cond_0
    return-object v2
.end method

.method public queryCardNum(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 128
    const-string v0, "queryCardNum begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 130
    const-string v0, ""

    return-object v0
.end method

.method public queryCplc()Ljava/lang/String;
    .locals 1

    .line 101
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getCplcFromESE()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public queryOpenMobileChannel()I
    .locals 1

    .line 166
    const-string v0, "queryOpenMobileChannel begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 167
    const/4 v0, -0x1

    return v0
.end method

.method public querySeid()[B
    .locals 5

    .line 150
    const/4 v0, 0x0

    new-array v2, v0, [B

    .line 151
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v3

    .line 152
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    const-string v0, "querySeid, illegal cplc"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 155
    return-object v2

    .line 157
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x14

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 158
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    const/16 v0, 0x14

    const/16 v1, 0x24

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/HexByteHelper;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public queryTrafficCardTradeRecord(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;
    .locals 2

    .line 173
    const-string v0, "queryTrafficCardTradeRecord begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 174
    new-instance v1, Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;-><init>()V

    .line 175
    return-object v1
.end method

.method public setSupportList(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 265
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 266
    const-string v0, "ESEInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSupportList mSupportList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->supportList:Ljava/util/ArrayList;

    .line 268
    return-void

    .line 270
    :cond_0
    const-string v0, "ESEInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSupportList mSupportList is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->supportList:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 273
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 274
    iput-object v4, p0, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->supportList:Ljava/util/ArrayList;

    .line 275
    return-void
.end method
