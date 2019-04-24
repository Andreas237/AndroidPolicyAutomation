.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryOfflineTrafficCardInfoCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_AMOUNT_ABNORMAL:I = 0x57b

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_DATE_FORMAT_ERROR:I = 0x57e

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_ENABLE_DATE_ABNORMAL:I = 0x57c

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_OUT_OF_EXPIRE_DATE:I = 0x57d

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_OVERDRAFT_AMOUNT_ABNORMAL:I = 0x57a

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_PIN_LOCKED:I = 0x580

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_READ_FAILED:I = 0x5db

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_STATUS_ABNORMAL:I = 0x579

.field public static final RESULT_FAILED_TRAFFIC_CARD_INFO_VERIFY_PIN_FAILED:I = 0x57f


# virtual methods
.method public abstract queryOfflineTrafficCardInfoCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OfflineTrafficCardInfo;)V
.end method
