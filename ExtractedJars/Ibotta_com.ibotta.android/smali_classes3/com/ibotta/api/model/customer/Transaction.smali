.class public Lcom/ibotta/api/model/customer/Transaction;
.super Ljava/lang/Object;
.source "Transaction.java"


# instance fields
.field private amount:F

.field private createdAt:Ljava/util/Date;

.field private destination:Ljava/lang/String;

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 12
    iget v0, p0, Lcom/ibotta/api/model/customer/Transaction;->amount:F

    return v0
.end method

.method public getCreatedAt()Ljava/util/Date;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Transaction;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public getDestination()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Transaction;->destination:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/api/model/customer/Transaction;->status:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 16
    iput p1, p0, Lcom/ibotta/api/model/customer/Transaction;->amount:F

    return-void
.end method

.method public setCreatedAt(Ljava/util/Date;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Transaction;->createdAt:Ljava/util/Date;

    return-void
.end method

.method public setDestination(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Transaction;->destination:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/api/model/customer/Transaction;->status:Ljava/lang/String;

    return-void
.end method
