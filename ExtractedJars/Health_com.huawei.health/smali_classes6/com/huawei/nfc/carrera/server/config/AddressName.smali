.class public Lcom/huawei/nfc/carrera/server/config/AddressName;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private addressName:Ljava/lang/String;

.field private conditionMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private moduleName:Ljava/lang/String;

.field private serverAddressName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->addressName:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->serverAddressName:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->moduleName:Ljava/lang/String;

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    .line 26
    return-void
.end method


# virtual methods
.method public addCondition(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public conditionMatch(Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 56
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    const/4 v0, 0x1

    return v0

    .line 64
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 69
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 71
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 73
    :cond_4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 77
    const/4 v0, 0x0

    return v0

    .line 79
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->conditionMap:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_6
    goto :goto_0

    .line 85
    :cond_7
    const/4 v0, 0x1

    return v0
.end method

.method public getAddressName()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->addressName:Ljava/lang/String;

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->moduleName:Ljava/lang/String;

    return-object v0
.end method

.method public getServerAddressName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/config/AddressName;->serverAddressName:Ljava/lang/String;

    return-object v0
.end method
