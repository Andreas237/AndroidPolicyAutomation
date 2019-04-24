.class public Lcom/huawei/nfc/carrera/logic/spi/fm/response/MainOrderResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.source "SourceFile"


# static fields
.field public static final EXIST_HAS_PAIED_ORDER:I = 0x1


# instance fields
.field public order:Lcn/com/fmsh/nfcos/client/service/huawei/NfcosMainOrder;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    return-void
.end method
