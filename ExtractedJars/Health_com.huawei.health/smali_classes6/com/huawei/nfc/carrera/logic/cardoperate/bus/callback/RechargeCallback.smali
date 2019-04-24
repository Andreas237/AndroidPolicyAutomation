.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/RechargeCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RETURN_RECHARGE_FAILED:I = 0x515

.field public static final RETURN_RECHARGE_FAILED_REFUNDABLE:I = 0x518

.field public static final RETURN_RECHARGE_FAILED_REFUNDABLE_RETRYABLE:I = 0x517

.field public static final RETURN_RECHARGE_FAILED_RETRYABLE:I = 0x516

.field public static final RETURN_RECHARGE_INNER_FAILED:I = 0x577

.field public static final RETURN_RECHARGE_REACH_LIMIT_REFUNDABLE:I = 0x519


# virtual methods
.method public abstract rechargeCallback(I)V
.end method
