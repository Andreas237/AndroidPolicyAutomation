.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo$WalletSupportInfoSai6;,
        Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo$WalletSupportInfoSai5;,
        Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo$WalletSupportInfoSai4;,
        Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo$WalletSupportInfoSai3;,
        Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo$WalletSupportInfoSai2;,
        Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo$WalletSupportInfoSai1;
    }
.end annotation


# static fields
.field public static final JSON_KEY_SUPPORTBUSINESS:Ljava/lang/String; = "supportBusiness"

.field public static final JSON_KEY_SUPPORTDEFAUTCARD:Ljava/lang/String; = "supportDefautcard"

.field public static final JSON_KEY_SUPPORTISSUERS:Ljava/lang/String; = "supportIssuers"

.field private static final TAG:Ljava/lang/String; = "WalletSupportInfo"


# instance fields
.field private supportBusiness:Ljava/lang/String;

.field private supportDefautcard:I

.field private supportIssuers:Ljava/lang/String;

.field private supportList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportBusiness:Ljava/lang/String;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportDefautcard:I

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportList:Ljava/util/ArrayList;

    .line 34
    const-string v0, "WalletSupportInfo"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WalletSupportInfo jsonStr: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 36
    return-void

    .line 39
    :cond_0
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 41
    const-string v0, "supportBusiness"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 42
    const-string v0, "supportBusiness"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportBusiness:Ljava/lang/String;

    .line 45
    :cond_1
    const-string v0, "supportIssuers"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    const-string v0, "supportIssuers"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    const-string v1, "\\|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 49
    const/4 v6, 0x0

    :goto_0
    array-length v0, v5

    if-ge v6, v0, :cond_2

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportList:Ljava/util/ArrayList;

    aget-object v1, v5, v6

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 55
    :cond_2
    const-string v0, "supportDefautcard"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 56
    const-string v0, "supportDefautcard"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportDefautcard:I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    :cond_3
    goto :goto_1

    .line 59
    :catch_0
    move-exception v4

    .line 60
    const-string v0, "WalletSupportInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "create WalletSupportInfo failed: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :goto_1
    return-void
.end method


# virtual methods
.method public getSupportBusiness()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportBusiness:Ljava/lang/String;

    return-object v0
.end method

.method public getSupportDefautcard()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportDefautcard:I

    return v0
.end method

.method public getSupportIssuers()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    return-object v0
.end method

.method public getSupportList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public setSupportBusiness(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportBusiness:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setSupportDefautcard(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportDefautcard:I

    .line 95
    return-void
.end method

.method public setSupportIssuers(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setSupportList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 102
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportList:Ljava/util/ArrayList;

    .line 103
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WalletSupportInfo{supportBusiness=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportBusiness:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", supportIssuers=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportIssuers:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", supportDefautcard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;->supportDefautcard:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public walletSupportInfoSAI1()V
    .locals 0

    .line 105
    return-void
.end method

.method public walletSupportInfoSAI2()V
    .locals 0

    .line 106
    return-void
.end method

.method public walletSupportInfoSAI3()V
    .locals 0

    .line 107
    return-void
.end method

.method public walletSupportInfoSAI4()V
    .locals 0

    .line 108
    return-void
.end method

.method public walletSupportInfoSAI5()V
    .locals 0

    .line 109
    return-void
.end method
