.class public Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RETURN_NETWORK_ERROR:I = 0x186aa

.field public static final RETURN_REQUESTPARAM_CONN_UNAVAILABLE:I = 0x186a5

.field public static final RETURN_REQUESTPARAM_CPLC_IS_NULL:I = 0x186a2

.field public static final RETURN_REQUESTPARAM_FUNCALLID_IS_NULL:I = 0x186a4

.field public static final RETURN_REQUESTPARAM_NO_NETWORK:I = 0x186a6

.field public static final RETURN_REQUESTPARAM_SERVICEID_IS_NULL:I = 0x186a3

.field public static final RETURN_REQUESTPARAM_ST_INVALID:I = 0x186a7

.field public static final RETURN_REQUEST_PARAMS_IS_NULL:I = 0x186a1

.field public static final RETURN_RESPONSE_PARSE_ERROR:I = 0x186ac

.field public static final RETURN_SERVER_ERROR:I = 0x186ad

.field public static final RETURN_UNKNOW_ERROR:I = 0x186ab

.field public static final TSM_OPERATE_RESULT_SUCCESS:I = 0x186a0


# instance fields
.field private msg:Ljava/lang/String;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-string v0, "Success"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->msg:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const-string v0, "Success"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->msg:Ljava/lang/String;

    .line 43
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->resultCode:I

    .line 44
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->msg:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method public getMsg()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getPrintMsg()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->resultCode:I

    return v0
.end method

.method public setMsg(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->msg:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/tsm/TSMOperateResponse;->resultCode:I

    .line 55
    return-void
.end method
