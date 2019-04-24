.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/bus/callback/QueryAndHandleUnfinishedOrderCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/bus/TrafficCardBaseCallback;


# static fields
.field public static final RESULT_FAILED_UNFINISHED_ORDERS_AMOUNT_LIMITED:I = 0x4b1

.field public static final RESULT_TYPE_EXISTS_UNFINISHED_ORDERS:I = 0x2711

.field public static final RESULT_TYPE_HANDLED_UNFINISHED_ORDERS:I = 0x2712

.field public static final RESULT_TYPE_NO_UNFINISHED_ORDERS:I = 0x2710


# virtual methods
.method public abstract queryAndHandleUnfinishedOrderCallback(IILcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;)V
.end method
