.class public interface abstract Lcom/huawei/nfc/carrera/logic/cardoperate/cup/operation/CardOperateListener;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final OPERATE_RESULT_DEAL:I = -0x62

.field public static final OPERATE_RESULT_FAILED:I = -0x63

.field public static final OPERATE_RESULT_FAILED_DATA_OUT_OF_USE:I = -0x1

.field public static final OPERATE_RESULT_SUCCESS:I = 0x0


# virtual methods
.method public abstract operateFinished(Ljava/lang/String;Ljava/lang/String;I)V
.end method

.method public abstract operateStart(Ljava/lang/String;Ljava/lang/String;)V
.end method
