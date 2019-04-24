.class public Lcom/huawei/nfc/carrera/server/card/response/IdentifyCUPCardResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# static fields
.field public static final ERR_APPLET_IS_NOT_EXIST:I = 0x515

.field public static final ERR_CHECK_CARD_BIN_FAIL:I = 0x456

.field public static final ERR_NO_BANK_INFO:I = 0x652

.field public static final ERR_NO_ISSUER_INFO:I = 0x545

.field public static final ERR_UNSUPPORTED_CARD_TYPE:I = 0x651


# instance fields
.field public cardType:I

.field public issuerId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method
