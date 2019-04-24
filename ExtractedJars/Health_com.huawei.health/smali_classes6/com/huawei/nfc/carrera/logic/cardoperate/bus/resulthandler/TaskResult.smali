.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private arg:I

.field private data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private extraDataBundle:Landroid/os/Bundle;

.field private resultCd:I

.field private resultMsg:Ljava/lang/String;

.field private spiResultCd:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 27
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 54
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 55
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 56
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/lang/String;TT;)V"
        }
    .end annotation

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 68
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 69
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 70
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 71
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->data:Ljava/lang/Object;

    .line 72
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 61
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 62
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 63
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 47
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 48
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 49
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 33
    const-string v0, "SUCCESS"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 34
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->data:Ljava/lang/Object;

    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Ljava/lang/String;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 41
    const-string v0, "SUCCESS"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->data:Ljava/lang/Object;

    .line 43
    return-void
.end method


# virtual methods
.method public getArg()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->arg:I

    return v0
.end method

.method public getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getExtraDataBundle()Landroid/os/Bundle;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    return-object v0
.end method

.method public getResultCd()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    return v0
.end method

.method public getResultMsg()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getSpiResultCd()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    return v0
.end method

.method public setArg(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->arg:I

    .line 92
    return-void
.end method

.method public setData(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 121
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->data:Ljava/lang/Object;

    .line 122
    return-void
.end method

.method public setExtraDataBundle(Landroid/os/Bundle;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->extraDataBundle:Landroid/os/Bundle;

    .line 131
    return-void
.end method

.method public setResultCd(I)V
    .locals 0

    .line 101
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultCd:I

    .line 102
    return-void
.end method

.method public setResultMsg(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->resultMsg:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public setSpiResultCd(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/TaskResult;->spiResultCd:I

    .line 82
    return-void
.end method
