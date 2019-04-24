.class public Lcom/huawei/nfc/carrera/server/card/response/ApplyUPCardResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# static fields
.field public static final ERR_ACCOUNT_INFO_INVALID:I = 0xe19

.field public static final ERR_ACCOUNT_IN_BLACK_LIST:I = 0xe1b

.field public static final ERR_ACCOUNT_UNEXIST:I = 0xe14

.field public static final ERR_ALREADY_ASSOCIATED_CARD:I = 0x525

.field public static final ERR_ALREADY_ASSOCIATED_CARD2:I = 0xcf5

.field public static final ERR_APPLY_EXCEED_LIMIT1:I = 0x51d

.field public static final ERR_APPLY_EXCEED_LIMIT2:I = 0xe13

.field public static final ERR_APPLY_EXCEED_LIMIT3:I = 0xe15

.field public static final ERR_APPLY_EXCEED_LIMIT4:I = 0xced

.field public static final ERR_BANK_SYSTEM_ERR:I = 0xc1e

.field public static final ERR_INFORMATION_CHECK_FAILED:I = 0xe11

.field public static final ERR_INFORMATION_CHECK_FAILED2:I = 0xe12

.field public static final ERR_NO_APPLICATION_PERMISSION:I = 0xe18

.field public static final ERR_NO_PHONE:I = 0xe1a

.field public static final ERR_ON_RISK:I = 0x76d


# instance fields
.field public cardMetadata:Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;

.field public virtualCardMetadata:Lcom/huawei/nfc/carrera/server/card/model/VirtualCardMetadata;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method
