.class public Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# static fields
.field public static final RESPONSE_CODE_AID_NOT_EXISTED:I = -0x3

.field public static final RESPONSE_CODE_CARD_UNSTARTED_OR_DELETEED:I = -0x5


# instance fields
.field public aid:Ljava/lang/String;

.field public virtualCardRefID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method
