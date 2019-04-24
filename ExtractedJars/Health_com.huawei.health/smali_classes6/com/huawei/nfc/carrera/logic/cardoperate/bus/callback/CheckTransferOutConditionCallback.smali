.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/CheckTransferOutConditionCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RESULT_FAILED_TRAFFIC_CARD_RECORDS_READ_FAILED:I = 0x6f4

.field public static final RESULT_HAS_UNFINISHED_ORDER:I = 0x6f5

.field public static final RETURN_CARD_ACCOUT_CONFRIM_FAILED:I = 0x6f9

.field public static final RETURN_CARD_BALANCE_OVERDRAWN:I = 0x6f7

.field public static final RETURN_CARD_QUERY_BALANCE_FAILED:I = 0x6f6

.field public static final RETURN_CARD_VERIFY_SHIFT_FAILED:I = 0x6f8


# virtual methods
.method public abstract checkTransferOutConditionCallback(I)V
.end method
