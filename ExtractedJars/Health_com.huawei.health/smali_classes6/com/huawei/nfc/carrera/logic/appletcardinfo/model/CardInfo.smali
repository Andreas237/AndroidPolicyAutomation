.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private amount:I

.field private cardNum:Ljava/lang/String;

.field private enableDate:Ljava/lang/String;

.field private expireDate:Ljava/lang/String;

.field private overdraftAmount:I

.field private records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->amount:I

    return v0
.end method

.method public getBalanceByFenUnit()I
    .locals 2

    .line 91
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->amount:I

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->overdraftAmount:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public getCardNum()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->cardNum:Ljava/lang/String;

    return-object v0
.end method

.method public getEnableDate()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->enableDate:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireDate()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->expireDate:Ljava/lang/String;

    return-object v0
.end method

.method public getFormatedBalanceByYuanUnit()Ljava/lang/String;
    .locals 2

    .line 96
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getBalanceByFenUnit()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertFenToYuan(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFormatedExpireDate(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->expireDate:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const/4 v0, 0x0

    return-object v0

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->expireDate:Ljava/lang/String;

    const-string v1, "yyyyMMdd"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/TimeUtil;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/wallet/utils/TimeUtil;->d(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOverdraftAmount()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->overdraftAmount:I

    return v0
.end method

.method public getRecords()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;"
        }
    .end annotation

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->records:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public setAmount(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->amount:I

    .line 77
    return-void
.end method

.method public setCardNum(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->cardNum:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setEnableDate(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->enableDate:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setExpireDate(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->expireDate:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public setOverdraftAmount(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->overdraftAmount:I

    .line 87
    return-void
.end method

.method public setRecords(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;)V"
        }
    .end annotation

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->records:Ljava/util/List;

    .line 37
    return-void
.end method
