.class public Lcom/huawei/nfc/carrera/logic/oma/TaskResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private lastExcutedCommand:Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

.field private msg:Ljava/lang/String;

.field private resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->resultCode:I

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getLastExcutedCommand()Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->lastExcutedCommand:Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    return-object v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getPrintMsg()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " resultCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->resultCode:I

    return v0
.end method

.method public setData(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->data:Ljava/lang/Object;

    .line 49
    return-void
.end method

.method public setLastExcutedCommand(Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->lastExcutedCommand:Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 69
    return-void
.end method

.method public setMsg(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->msg:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->resultCode:I

    .line 39
    return-void
.end method
