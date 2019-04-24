.class public Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BANKCARD_SERVER_URL:Ljava/lang/String; = "https://nfcws.hicloud.com/Wallet/wallet/gateway.action"

.field public static final MODULE_NAME_BANKCARD:Ljava/lang/String; = "BankCard"

.field public static final MODULE_NAME_TRANSPORTATIONCARD:Ljava/lang/String; = "TransportationCard"

.field public static final SERVER_NAME_BANKCARD:Ljava/lang/String; = "BANKCARD"

.field public static final SERVER_NAME_TRANSPORTATIONCARD:Ljava/lang/String; = "TRANSPORTATIONCARD"

.field private static final SYNC_LOCK:[B

.field private static final TRANSPORTATION_SERVER_URL:Ljava/lang/String; = "https://trans-drcn.wallet.hicloud.com/WalletTransCardService/app/gateway"

.field private static final XMLPATH:Ljava/lang/String; = "server_address.xml"

.field private static volatile instance:Lcom/huawei/nfc/carrera/server/config/AddressNameMgr; = null


# instance fields
.field private serverAddressCfgMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->serverAddressCfgMap:Ljava/util/Map;

    .line 42
    return-void
.end method

.method private static getGrsUrlSync(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 95
    invoke-static {p0}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/server/overseas/OverSeasManager;->getGrsUrlSync(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 96
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 98
    const-string v0, "AddressNameMgr,getGrsUrlSync(),check empty"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 99
    const-string v0, "TRANSPORTATIONCARD"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    const-string v2, "https://trans-drcn.wallet.hicloud.com/WalletTransCardService/app/gateway"

    goto :goto_0

    .line 103
    :cond_0
    const-string v0, "BANKCARD"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    const-string v2, "https://nfcws.hicloud.com/Wallet/wallet/gateway.action"

    goto :goto_0

    .line 109
    :cond_1
    const-string v0, "AddressNameMgr,getGrsUrlSync(),not transportation or bank card."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 112
    :cond_2
    :goto_0
    return-object v2
.end method

.method public static getInstance()Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;
    .locals 3

    .line 46
    sget-object v0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->instance:Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    if-nez v0, :cond_1

    .line 48
    sget-object v1, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->SYNC_LOCK:[B

    monitor-enter v1

    .line 50
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->instance:Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    if-nez v0, :cond_0

    .line 52
    new-instance v0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->instance:Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 57
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->instance:Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    return-object v0
.end method

.method private getServerAddressCfgMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;>;"
        }
    .end annotation

    .line 161
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->serverAddressCfgMap:Ljava/util/Map;

    return-object v0
.end method

.method private getServerAddressName(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Lcom/huawei/nfc/carrera/server/config/AddressName;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 142
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 144
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 146
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/server/config/AddressName;

    .line 148
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/server/config/AddressName;->getAddressName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 150
    invoke-virtual {v2, p2}, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMatch(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/server/config/AddressName;->getServerAddressName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 155
    :cond_2
    goto :goto_0

    .line 156
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public getAddress(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 88
    invoke-static {p2}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v2

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p2, p1}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getGrsUrlSync(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?clientVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 90
    return-object v3
.end method

.method public getAddress(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Landroid/content/Context;)Ljava/lang/String;"
        }
    .end annotation

    .line 71
    const-string v2, ""

    .line 72
    const-string v3, ""

    .line 73
    const-string v0, "TransportationCard"

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    const-string v0, "TransportationCard"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getAddressName(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 77
    :cond_0
    const-string v0, "BankCard"

    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    const-string v0, "BankCard"

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getAddressName(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    .line 81
    :cond_1
    :goto_0
    invoke-static {p4}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v4

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p4, v3}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getGrsUrlSync(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?clientVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 83
    return-object v2
.end method

.method public getAddressName(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 117
    const/4 v1, 0x0

    .line 119
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getServerAddressCfgMap()Ljava/util/Map;

    move-result-object v2

    .line 122
    invoke-interface {v2, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, p1, p3, v0}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getServerAddressName(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 127
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    .line 129
    const-string v0, "Default"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, p1, p3, v0}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getServerAddressName(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    .line 132
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v1, :cond_2

    .line 134
    return-object p1

    .line 137
    :cond_2
    return-object v1
.end method

.method public initConfig(Landroid/content/Context;)V
    .locals 3

    .line 64
    new-instance v2, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;-><init>()V

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->serverAddressCfgMap:Ljava/util/Map;

    sget v1, Lcom/huawei/wallet/R$xml;->server_address:I

    invoke-virtual {v2, p1, v0, v1}, Lcom/huawei/nfc/carrera/server/config/XmlParseUtil;->parseXml(Landroid/content/Context;Ljava/util/Map;I)V

    .line 66
    return-void
.end method
