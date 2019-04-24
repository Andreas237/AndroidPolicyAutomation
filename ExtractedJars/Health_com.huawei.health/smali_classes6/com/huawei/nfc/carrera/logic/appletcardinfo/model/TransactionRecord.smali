.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RECORD_TYPE_CONSUME:Ljava/lang/String; = "2"

.field public static final RECORD_TYPE_RECHARGE:Ljava/lang/String; = "1"


# instance fields
.field private recordAmount:I

.field private recordTime:Ljava/lang/String;

.field private recordType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmountByYuanUint()Ljava/lang/String;
    .locals 2

    .line 63
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordAmount:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertFenToYuan(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRecordAmount()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordAmount:I

    return v0
.end method

.method public getRecordTime()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordTime:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordType()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordType:Ljava/lang/String;

    return-object v0
.end method

.method public setRecordAmount(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordAmount:I

    .line 44
    return-void
.end method

.method public setRecordTime(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordTime:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setRecordType(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->recordType:Ljava/lang/String;

    .line 59
    return-void
.end method
