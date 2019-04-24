.class public Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.source "SourceFile"


# instance fields
.field public orderList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    return-void
.end method
