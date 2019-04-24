.class public Lcom/huawei/nfc/carrera/logic/spi/unionpay/response/CUPBaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESPONSE_CODE_FAILED_CANNOT_BIND_CUP_SERVICE:I = -0x5

.field public static final RESPONSE_CODE_FAILED_CUP_SERVICE_EXCEPTION:I = -0x4

.field public static final RESPONSE_CODE_FAILED_CUP_TSM_SERVICE_UNREACHABLE:I = -0x3

.field public static final RESPONSE_CODE_FAILED_NOT_INSTALLED:I = -0x1

.field public static final RESPONSE_CODE_FAILED_OPERATION_ERR:I = -0x6

.field public static final RESPONSE_CODE_FAILED_OPERATION_FATAL_ERR:I = -0x7

.field public static final RESPONSE_CODE_FAILED_PARAMS_ILLEGAL:I = -0x2

.field public static final RESPONSE_CODE_FAILED_UNKNOWN_ERRORS:I = -0x63

.field public static final RESPONSE_CODE_SUCCESS:I = 0x0


# instance fields
.field public responseCode:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
