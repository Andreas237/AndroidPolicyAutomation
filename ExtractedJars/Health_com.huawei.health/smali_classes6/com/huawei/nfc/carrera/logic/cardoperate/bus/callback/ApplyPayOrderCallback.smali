.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/ApplyPayOrderCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RETURN_FAILED_APPLY_ORDER_INNER_ERROR:I = 0x44b

.field public static final RETURN_FAILED_BALANCE_IS_MINUS:I = 0x3eb

.field public static final RETURN_FAILED_BALANCE_REACH_LIMIT:I = 0x3e9

.field public static final RETURN_FAILED_CARD_AFTER_EXPIRE_DATE_ERROR:I = 0x3ed

.field public static final RETURN_FAILED_CARD_BEFORE_ENABLE_DATE_ERROR:I = 0x3ec

.field public static final RETURN_FAILED_CARD_DATE_ERROR:I = 0x3ee

.field public static final RETURN_FAILED_CARD_RECHARGE_AMOUNT_ILLEGAL_ERROR:I = 0x3ef

.field public static final RETURN_FAILED_CITYCODE_ILLEGAL:I = 0x3f0

.field public static final RETURN_FAILED_NO_ENOUGH_CARD_RESOURCE:I = 0x3f1

.field public static final RETURN_FAILED_OVER_DAILY_RECHARGE_COUNT_LIMIT:I = 0x405

.field public static final RETURN_FAILED_OVER_DAILY_RECHARGE_LIMIT:I = 0x404

.field public static final RETURN_FAILED_SP_SERVICE_STOPPED:I = 0x3f2

.field public static final RETURN_FAILED_UNFINISHED_ORDERS_EXIST:I = 0x3ea


# virtual methods
.method public abstract applyPayOrderCallback(ILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;)V
.end method
