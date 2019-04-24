.class public Lcom/ibotta/api/model/customer/CustomerAccount;
.super Ljava/lang/Object;
.source "CustomerAccount.java"


# annotations
.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/customer/CustomerAccount$Type;
    }
.end annotation


# instance fields
.field private accountHolder:Ljava/lang/String;

.field private accountNumber:Ljava/lang/String;

.field private cashoutTotal:F

.field private destinationId:I

.field private id:I

.field private isServiceEnabled:Z

.field private latestTransactions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Transaction;",
            ">;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->latestTransactions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAccountHolder()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->accountHolder:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountNumber()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->accountNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCashoutTotal()F
    .locals 1

    .line 83
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->cashoutTotal:F

    return v0
.end method

.method public getDestinationId()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->destinationId:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->id:I

    return v0
.end method

.method public getLatestTransactions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Transaction;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->latestTransactions:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeEnum()Lcom/ibotta/api/model/customer/CustomerAccount$Type;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->type:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/CustomerAccount$Type;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    move-result-object v0

    return-object v0
.end method

.method public isServiceEnabled()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->isServiceEnabled:Z

    return v0
.end method

.method public setAccountHolder(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->accountHolder:Ljava/lang/String;

    return-void
.end method

.method public setAccountNumber(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->accountNumber:Ljava/lang/String;

    return-void
.end method

.method public setCashoutTotal(F)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->cashoutTotal:F

    return-void
.end method

.method public setDestinationId(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->destinationId:I

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->id:I

    return-void
.end method

.method public setLatestTransactions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/Transaction;",
            ">;)V"
        }
    .end annotation

    .line 103
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->latestTransactions:Ljava/util/List;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->name:Ljava/lang/String;

    return-void
.end method

.method public setServiceEnabled(Z)V
    .locals 0

    .line 111
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->isServiceEnabled:Z

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerAccount;->type:Ljava/lang/String;

    return-void
.end method
