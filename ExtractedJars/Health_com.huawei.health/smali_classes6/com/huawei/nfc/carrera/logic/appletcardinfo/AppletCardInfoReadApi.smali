.class public interface abstract Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final READ_CARD_BALANCE:I = 0x2

.field public static final READ_CARD_NUM:I = 0x1

.field public static final READ_CARD_VALIDITY_DATE:I = 0x4


# virtual methods
.method public abstract readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;>;"
        }
    .end annotation
.end method

.method public abstract readTrafficCardTransactionRecord(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult<Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;>;>;"
        }
    .end annotation
.end method
