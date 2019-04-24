.class public Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private errorCode:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 14
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->errorCode:I

    .line 15
    return-void
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->errorCode:I

    return v0
.end method

.method public setErrorCode(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/internal/OmaException;->errorCode:I

    .line 25
    return-void
.end method
