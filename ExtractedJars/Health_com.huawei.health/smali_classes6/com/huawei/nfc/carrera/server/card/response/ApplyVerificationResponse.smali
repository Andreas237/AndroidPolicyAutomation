.class public Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# static fields
.field public static final RESULT_CODE_ALLREAD_VERIFYIED:I = 0x64d

.field public static final RESULT_CODE_ALLREAD_VERIFYIED2:I = 0xe1d

.field public static final RESULT_CODE_BANK_SERVICE_UNREACHABLE:I = 0xc21

.field public static final RESULT_CODE_BANK_SYSTEM_ERR:I = 0xc1e

.field public static final RESULT_CODE_CARD_ALLREAD_DELETED:I = 0xd0f

.field public static final RESULT_CODE_CARD_ALLREAD_DELETED2:I = 0x53e

.field public static final RESULT_CODE_CARD_ALLREAD_DELETED3:I = 0x53f

.field public static final RESULT_CODE_CARD_ALLREAD_DELETED4:I = 0xe19

.field public static final RESULT_CODE_REACH_LIMIT:I = 0xe13

.field public static final RESULT_CODE_REACH_LIMIT2:I = 0xe15


# instance fields
.field public currTime:Ljava/lang/String;

.field public expiry:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method
