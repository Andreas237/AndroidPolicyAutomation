.class public Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected returnCd:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getReturnCd()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;->returnCd:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setReturnCd(I)V
    .locals 1

    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/spi/snb/response/SNBBaseResponse;->returnCd:I

    .line 18
    return-void
.end method
