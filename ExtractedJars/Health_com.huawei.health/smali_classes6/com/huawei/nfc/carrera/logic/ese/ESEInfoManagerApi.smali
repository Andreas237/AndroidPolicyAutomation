.class public interface abstract Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final OPERATION_QUERY_BALANCE:I = 0x65

.field public static final OPERATION_QUERY_CARD_NUM:I = 0x64

.field public static final OPERATION_QUERY_TRADE_RECORDS:I = 0x66

.field public static final READ_CARD_BALANCE:I = 0x2

.field public static final READ_CARD_NUM:I = 0x1

.field public static final READ_CARD_VALIDITY_DATE:I = 0x4

.field public static final RESULT_FAILED_CARD_BALANCE_ERROR:I = -0x4

.field public static final RESULT_FAILED_CARD_STATUS_AFTER_EXPIRE_DATE_ERROR:I = -0x7

.field public static final RESULT_FAILED_CARD_STATUS_BEFORE_ENABLE_DATE_ERROR:I = -0x6

.field public static final RESULT_FAILED_CARD_STATUS_DATE_ERROR:I = -0x5

.field public static final RESULT_FAILED_CARD_STATUS_DISABLED:I = -0x2

.field public static final RESULT_FAILED_CARD_STATUS_IN_BLACKLIST:I = -0x3

.field public static final RESULT_FAILED_CARD_STATUS_OVERDRAFT_ERROR:I = -0x8

.field public static final RESULT_FAILED_COMMAND_EXCUTE_FAILED:I = -0x1

.field public static final RESULT_FAILED_OTHER:I = -0x63

.field public static final RESULT_SUCCESS:I = 0x0


# virtual methods
.method public abstract addBusCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public abstract esePowerOff()Z
.end method

.method public abstract esePowerOn()Z
.end method

.method public abstract getBusChipManu()Ljava/lang/String;
.end method

.method public abstract getDeviceBTVersion()Ljava/lang/String;
.end method

.method public abstract getDeviceModel()Ljava/lang/String;
.end method

.method public abstract getDeviceSN()Ljava/lang/String;
.end method

.method public abstract getDeviceSoftVersion()Ljava/lang/String;
.end method

.method public abstract getSupportList()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end method

.method public abstract getWalletAbility()Lcom/huawei/nfc/carrera/logic/cardinfo/model/WalletSupportInfo;
.end method

.method public abstract queryCardNum(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract queryCplc()Ljava/lang/String;
.end method

.method public abstract queryOpenMobileChannel()I
.end method

.method public abstract querySeid()[B
.end method

.method public abstract queryTrafficCardTradeRecord(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ese/response/QueryTradeRecordsResponse;
.end method

.method public abstract setSupportList(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation
.end method
