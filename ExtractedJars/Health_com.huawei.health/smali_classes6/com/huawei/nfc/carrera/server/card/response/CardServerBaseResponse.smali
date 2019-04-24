.class public Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESPONSE_CODE_CANNOT_BE_RESOLVED:I = -0x62

.field public static final RESPONSE_CODE_CONNECTION_FAILED:I = -0x2

.field public static final RESPONSE_CODE_INTERNAL_ERROR:I = 0x3

.field public static final RESPONSE_CODE_NO_ACCESS_AUTHORITY:I = 0x4

.field public static final RESPONSE_CODE_NO_NETWORK_FAILED:I = -0x1

.field public static final RESPONSE_CODE_OPERATION_FAILED:I = 0x5

.field public static final RESPONSE_CODE_OTHER_ERRORS:I = -0x63

.field public static final RESPONSE_CODE_PARAMS_ERROR:I = 0x1

.field public static final RESPONSE_CODE_SERVER_OVERLOAD_ERROR:I = -0x4

.field public static final RESPONSE_CODE_SIGNATURE_ERROR:I = 0x2

.field public static final RESPONSE_CODE_SUCCESS:I = 0x0


# instance fields
.field private resultDesc:Ljava/lang/String;

.field public returnCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const/16 v0, -0x63

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->resultDesc:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    const/16 v0, -0x63

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->resultDesc:Ljava/lang/String;

    .line 95
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    .line 96
    return-void
.end method


# virtual methods
.method public getResultDesc()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->resultDesc:Ljava/lang/String;

    return-object v0
.end method

.method public setResultDesc(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->resultDesc:Ljava/lang/String;

    .line 86
    return-void
.end method
