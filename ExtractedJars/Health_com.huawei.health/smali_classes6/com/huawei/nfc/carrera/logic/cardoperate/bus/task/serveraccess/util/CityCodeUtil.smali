.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final cityCodeMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    .line 16
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "00"

    const-string v2, "9000"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "01"

    const-string v2, "0020"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "11"

    const-string v2, "0757"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "20"

    const-string v2, "0755"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "25"

    const-string v2, "0756"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "30"

    const-string v2, "0660"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "35"

    const-string v2, "0750"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "40"

    const-string v2, "0758"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "42"

    const-string v2, "0760"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "45"

    const-string v2, "0769"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "48"

    const-string v2, "0752"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "50"

    const-string v2, "0759"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "51"

    const-string v2, "0754"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "52"

    const-string v2, "0751"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "53"

    const-string v2, "0762"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "54"

    const-string v2, "0662"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "55"

    const-string v2, "0763"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "56"

    const-string v2, "0668"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "57"

    const-string v2, "0753"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "58"

    const-string v2, "0768"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "59"

    const-string v2, "0663"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    const-string v1, "60"

    const-string v2, "9000"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static transferServerCityCode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 42
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/util/CityCodeUtil;->cityCodeMap:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 48
    :cond_0
    return-object p0
.end method
