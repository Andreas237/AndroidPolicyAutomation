.class public Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse$GetFullCardNoResponseSAI4;,
        Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse$GetFullCardNoResponseSAI3;,
        Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse$GetFullCardNoResponseSAI2;,
        Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse$GetFullCardNoResponseSAI1;
    }
.end annotation


# instance fields
.field public cardInfo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;-><init>()V

    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;-><init>()V

    .line 19
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse;->cardInfo:Ljava/lang/String;

    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/GetFullCardNoResponse;->returnCd:I

    .line 21
    return-void
.end method
