.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/NfcCityCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final FM_CZ:Ljava/lang/String; = "58"

.field private static final FM_DG:Ljava/lang/String; = "45"

.field private static final FM_FS:Ljava/lang/String; = "11"

.field private static final FM_GZ:Ljava/lang/String; = "01"

.field private static final FM_HY:Ljava/lang/String; = "53"

.field private static final FM_HZ:Ljava/lang/String; = "48"

.field private static final FM_JM:Ljava/lang/String; = "35"

.field private static final FM_JY:Ljava/lang/String; = "59"

.field private static final FM_MM:Ljava/lang/String; = "56"

.field private static final FM_MZ:Ljava/lang/String; = "57"

.field private static final FM_QY:Ljava/lang/String; = "55"

.field private static final FM_SG:Ljava/lang/String; = "52"

.field private static final FM_ST:Ljava/lang/String; = "51"

.field private static final FM_SW:Ljava/lang/String; = "30"

.field private static final FM_SZ:Ljava/lang/String; = "20"

.field private static final FM_YF:Ljava/lang/String; = "60"

.field private static final FM_YJ:Ljava/lang/String; = "54"

.field private static final FM_ZH:Ljava/lang/String; = "25"

.field private static final FM_ZJ:Ljava/lang/String; = "50"

.field private static final FM_ZQ:Ljava/lang/String; = "40"

.field private static final FM_ZS:Ljava/lang/String; = "42"

.field private static final MAP_CZ:Ljava/lang/String; = "0768"

.field private static final MAP_DG:Ljava/lang/String; = "0769"

.field private static final MAP_FS:Ljava/lang/String; = "0757"

.field private static final MAP_GZ:Ljava/lang/String; = "020"

.field private static final MAP_HY:Ljava/lang/String; = "0762"

.field private static final MAP_HZ:Ljava/lang/String; = "0752"

.field private static final MAP_JM:Ljava/lang/String; = "0750"

.field private static final MAP_JY:Ljava/lang/String; = "0663"

.field private static final MAP_MM:Ljava/lang/String; = "0668"

.field private static final MAP_MZ:Ljava/lang/String; = "0753"

.field private static final MAP_QY:Ljava/lang/String; = "0763"

.field private static final MAP_SG:Ljava/lang/String; = "0751"

.field private static final MAP_ST:Ljava/lang/String; = "0754"

.field private static final MAP_SW:Ljava/lang/String; = "0660"

.field private static final MAP_SZ:Ljava/lang/String; = "0755"

.field private static final MAP_YF:Ljava/lang/String; = "0766"

.field private static final MAP_YJ:Ljava/lang/String; = "0662"

.field private static final MAP_ZH:Ljava/lang/String; = "0756"

.field private static final MAP_ZJ:Ljava/lang/String; = "0759"

.field private static final MAP_ZQ:Ljava/lang/String; = "0758"

.field private static final MAP_ZS:Ljava/lang/String; = "0760"

.field public static final mFmcitys:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 59
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 60
    const-string v0, "020"

    const-string v1, "01"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    const-string v0, "0757"

    const-string v1, "11"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const-string v0, "0755"

    const-string v1, "20"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    const-string v0, "0756"

    const-string v1, "25"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "0660"

    const-string v1, "30"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    const-string v0, "0750"

    const-string v1, "35"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    const-string v0, "0758"

    const-string v1, "40"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    const-string v0, "0760"

    const-string v1, "42"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v0, "0769"

    const-string v1, "45"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    const-string v0, "0752"

    const-string v1, "48"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    const-string v0, "0759"

    const-string v1, "50"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    const-string v0, "0754"

    const-string v1, "51"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    const-string v0, "0751"

    const-string v1, "52"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v0, "0762"

    const-string v1, "53"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const-string v0, "0662"

    const-string v1, "54"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v0, "0763"

    const-string v1, "55"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    const-string v0, "0668"

    const-string v1, "56"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    const-string v0, "0753"

    const-string v1, "57"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    const-string v0, "0768"

    const-string v1, "58"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    const-string v0, "0663"

    const-string v1, "59"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    const-string v0, "0766"

    const-string v1, "60"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sput-object v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/NfcCityCode;->mFmcitys:Ljava/util/Map;

    .line 82
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFMCityCode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 90
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/util/NfcCityCode;->mFmcitys:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
