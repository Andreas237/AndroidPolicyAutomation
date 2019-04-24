.class public Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# instance fields
.field public issuersString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;->issuersString:Ljava/lang/String;

    return-void
.end method
