.class public Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;
.super Lcom/leisen/wallet/sdk/business/Business;
.source "SourceFile"


# instance fields
.field private capduList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/leisen/wallet/sdk/business/ApduBean;>;"
        }
    .end annotation
.end field

.field private finishFlag:I

.field private operationDes:Ljava/lang/String;

.field private operationResult:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/leisen/wallet/sdk/business/Business;-><init>()V

    return-void
.end method


# virtual methods
.method public getCapduList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/leisen/wallet/sdk/business/ApduBean;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->capduList:Ljava/util/List;

    return-object v0
.end method

.method public getFinishFlag()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->finishFlag:I

    return v0
.end method

.method public getOperationDes()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->operationDes:Ljava/lang/String;

    return-object v0
.end method

.method public getOperationResult()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->operationResult:I

    return v0
.end method

.method public setCapduList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/leisen/wallet/sdk/business/ApduBean;>;)V"
        }
    .end annotation

    .line 53
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->capduList:Ljava/util/List;

    .line 54
    return-void
.end method

.method public setFinishFlag(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->finishFlag:I

    .line 46
    return-void
.end method

.method public setOperationDes(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->operationDes:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setOperationResult(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/leisen/wallet/sdk/business/BaseBusinessForResp;->operationResult:I

    .line 30
    return-void
.end method
