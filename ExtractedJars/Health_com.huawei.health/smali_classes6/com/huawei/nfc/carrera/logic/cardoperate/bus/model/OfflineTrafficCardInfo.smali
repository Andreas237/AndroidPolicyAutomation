.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private balance:Ljava/lang/String;

.field private cardNo:Ljava/lang/String;

.field private expireDate:Ljava/lang/String;

.field private startdate:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->balance:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->balance:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNo()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->cardNo:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireDate()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->expireDate:Ljava/lang/String;

    return-object v0
.end method

.method public getStartdate()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->startdate:Ljava/lang/String;

    return-object v0
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->balance:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public setCardNo(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->cardNo:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setExpireDate(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->expireDate:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public setStartdate(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;->startdate:Ljava/lang/String;

    .line 59
    return-void
.end method
