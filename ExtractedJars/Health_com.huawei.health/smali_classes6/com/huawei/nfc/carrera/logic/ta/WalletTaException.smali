.class public Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaItemNotExistException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdMismatchException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaAccountNotExistException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdNotExistException;,
        Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
    }
.end annotation


# static fields
.field protected static final WALLET_TA_ERR_ACCESS_DENIED:J = 0xffff0001L

.field protected static final WALLET_TA_ERR_ACCOUNT_MISMATCH:J = 0xfffd0005L

.field protected static final WALLET_TA_ERR_ACCOUNT_NOT_EXIST:J = 0xfffd0010L

.field protected static final WALLET_TA_ERR_APDU_APP_UNEXIST_OR_NON_ACTIVATABLE:J = 0xfffd0007L

.field protected static final WALLET_TA_ERR_APDU_CONFLICT_APPLICATION:J = 0xfffd0008L

.field protected static final WALLET_TA_ERR_APDU_CONFLICT_PROTOCOL_PARAM:J = 0xfffd0009L

.field protected static final WALLET_TA_ERR_APDU_FAIL_GENERIC:J = 0xfffd000fL

.field protected static final WALLET_TA_ERR_APDU_WRONG_LENGTH_IN_LC:J = 0xfffd000eL

.field protected static final WALLET_TA_ERR_BAD_PARAMETERS:J = 0xffff0006L

.field protected static final WALLET_TA_ERR_CARD_ALREADY_EXIST:J = 0xfffd000bL

.field protected static final WALLET_TA_ERR_CARD_NOT_EXIST:J = 0xfffd000aL

.field protected static final WALLET_TA_ERR_CARD_NUM_REACH_MAX:J = 0xfffd000cL

.field protected static final WALLET_TA_ERR_CA_LIB_LOAD_ERROR:J = 0xfffd0010L

.field protected static final WALLET_TA_ERR_DEFAULT_CARD_NOT_EXIST:J = 0xfffd0013L

.field protected static final WALLET_TA_ERR_FID_MISMATCHING:J = 0xfffd0004L

.field protected static final WALLET_TA_ERR_FID_NOT_EXIST:J = 0xfffd0002L

.field protected static final WALLET_TA_ERR_GENERIC:J = 0xffff0000L

.field protected static final WALLET_TA_ERR_INVALID_CMD:J = 0x1L

.field protected static final WALLET_TA_ERR_ITEM_NOT_FOUND:J = 0xffff0008L

.field protected static final WALLET_TA_ERR_LEN_INCORRECT:J = 0xfffd0006L

.field protected static final WALLET_TA_ERR_OP_DEFAULT_CARD_REPEATED:J = 0xfffd000dL

.field protected static final WALLET_TA_ERR_REQUEST_TIMEOUT:J = 0xffff3001L

.field protected static final WALLET_TA_ERR_SHORT_BUFFER:J = 0xffff0010L

.field protected static final WALLET_TA_ERR_STORAGE_NO_SPACE:J = 0xffff3041L

.field protected static final WALLET_TA_ERR_SYSTEM_BUSY:J = 0xffff000dL

.field protected static final WALLET_TA_ERR_TARGET_DEAD:J = 0xffff3024L

.field protected static final WALLET_TA_ERR_TEE_ERROR_OUT_OF_MEMORY:J = 0xffff000cL

.field protected static final WALLET_TA_ERR_TEE_UNINITED:J = 0xfffd0001L

.field protected static final WALLET_TA_ERR_TRUSTED_APP_LOAD_ERROR:J = 0xdL

.field protected static final WALLET_TA_ERR_UNSUPPORTED_ENCODING:J = 0xfffd0012L

.field protected static final WALLET_TA_SUCCESS:J = 0x0L


# instance fields
.field private code:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 172
    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 176
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->code:J

    .line 177
    return-void
.end method


# virtual methods
.method public getCode()J
    .locals 2

    .line 181
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException;->code:J

    return-wide v0
.end method

.method public newWalletTaAccountNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaAccountNotExistException;
    .locals 1

    .line 196
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaAccountNotExistException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaAccountNotExistException;-><init>()V

    return-object v0
.end method

.method public newWalletTaBadParammeterException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;
    .locals 1

    .line 201
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaBadParammeterException;-><init>()V

    return-object v0
.end method

.method public newWalletTaCardAlreadyExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException;
    .locals 1

    .line 216
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardAlreadyExistException;-><init>()V

    return-object v0
.end method

.method public newWalletTaCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;
    .locals 1

    .line 211
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException;-><init>()V

    return-object v0
.end method

.method public newWalletTaCardNumReachMaxException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException;
    .locals 1

    .line 221
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNumReachMaxException;-><init>()V

    return-object v0
.end method

.method public newWalletTaDefaultCardNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException;
    .locals 1

    .line 206
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaDefaultCardNotExistException;-><init>()V

    return-object v0
.end method

.method public newWalletTaFingerIdMismatchException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdMismatchException;
    .locals 1

    .line 226
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdMismatchException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdMismatchException;-><init>()V

    return-object v0
.end method

.method public newWalletTaFingerIdNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdNotExistException;
    .locals 1

    .line 191
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdNotExistException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaFingerIdNotExistException;-><init>()V

    return-object v0
.end method

.method public newWalletTaItemNotExistException()Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaItemNotExistException;
    .locals 1

    .line 231
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaItemNotExistException;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaItemNotExistException;-><init>()V

    return-object v0
.end method

.method public newWalletTaSystemErrorException(J)Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;
    .locals 1

    .line 186
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;

    invoke-direct {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException;-><init>(J)V

    return-object v0
.end method
