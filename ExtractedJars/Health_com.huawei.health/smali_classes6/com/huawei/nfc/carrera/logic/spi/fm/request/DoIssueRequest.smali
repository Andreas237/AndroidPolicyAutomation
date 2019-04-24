.class public Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;
.source "SourceFile"


# instance fields
.field public order:[B

.field public seid:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;-><init>()V

    return-void
.end method

.method public static build([B[B)Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;
    .locals 1

    .line 36
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;-><init>()V

    .line 37
    iput-object p0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->order:[B

    .line 38
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->seid:[B

    .line 40
    return-object v0
.end method
