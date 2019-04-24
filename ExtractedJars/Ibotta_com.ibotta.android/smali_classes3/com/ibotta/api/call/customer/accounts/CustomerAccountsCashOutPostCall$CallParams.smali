.class public Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerAccountsCashOutPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private accountId:I

.field private actionCounter:I

.field private amount:F

.field private customerId:I

.field private destination:Ljava/lang/String;

.field private password:Ljava/lang/String;

.field private referenceId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccountId()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->accountId:I

    return v0
.end method

.method public getActionCounter()I
    .locals 1

    .line 125
    iget v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->actionCounter:I

    return v0
.end method

.method public getAmount()F
    .locals 1

    .line 111
    iget v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->amount:F

    return v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getDestination()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->destination:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getReferenceId()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->referenceId:Ljava/lang/String;

    return-object v0
.end method

.method public setAccountId(I)V
    .locals 0

    .line 107
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->accountId:I

    return-void
.end method

.method public setActionCounter(I)V
    .locals 0

    .line 134
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->actionCounter:I

    return-void
.end method

.method public setAmount(F)V
    .locals 0

    .line 115
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->amount:F

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setDestination(Ljava/lang/String;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->destination:Ljava/lang/String;

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setReferenceId(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/CustomerAccountsCashOutPostCall$CallParams;->referenceId:Ljava/lang/String;

    return-void
.end method
