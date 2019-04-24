.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RESULT_CODE_FAILED_CANNOT_BIND_CUP_SERVICE:I = -0x5

.field public static final RESULT_CODE_FAILED_CONN_EXCEPTION:I = -0x3

.field public static final RESULT_CODE_FAILED_NOT_INSTALLED:I = -0x1

.field public static final RESULT_CODE_FAILED_NO_NETWORK:I = -0x2

.field public static final RESULT_CODE_FAILED_UNKNOWN_ERROR:I = -0x63

.field public static final RESULT_CODE_FAILED_UNSUPPORTED_CARD:I = -0x4

.field public static final RESULT_CODE_SUCCESS:I = 0x0


# instance fields
.field private bankCardType:I

.field private issuerId:Ljava/lang/String;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/16 v0, -0x63

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->resultCode:I

    return-void
.end method


# virtual methods
.method public getBankCardType()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->bankCardType:I

    return v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 73
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->resultCode:I

    return v0
.end method

.method public setBankCardType(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->bankCardType:I

    .line 94
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->issuerId:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/identifycard/IdentifyCardResult;->resultCode:I

    .line 78
    return-void
.end method
