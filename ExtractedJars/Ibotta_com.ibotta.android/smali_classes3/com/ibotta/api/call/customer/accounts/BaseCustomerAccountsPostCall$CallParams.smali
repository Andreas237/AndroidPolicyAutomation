.class public Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;
.super Ljava/lang/Object;
.source "BaseCustomerAccountsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;
    }
.end annotation


# instance fields
.field private accountDate:Ljava/lang/String;

.field private accountHolder:Ljava/lang/String;

.field private accountNumber:Ljava/lang/String;

.field private accountSecret:Ljava/lang/String;

.field private accountType:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

.field private bankNumber:Ljava/lang/String;

.field private customerId:I

.field private destinationId:I

.field private password:Ljava/lang/String;

.field private type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccountDate()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountDate:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountHolder()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountHolder:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountNumber()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountSecret()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountSecret:Ljava/lang/String;

    return-object v0
.end method

.method public getAccountType()Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountType:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    return-object v0
.end method

.method public getBankNumber()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->bankNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getDestinationId()I
    .locals 1

    .line 163
    iget v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->destinationId:I

    return v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/ibotta/api/model/customer/CustomerAccount$Type;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    return-object v0
.end method

.method public setAccountDate(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountDate:Ljava/lang/String;

    return-void
.end method

.method public setAccountHolder(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountHolder:Ljava/lang/String;

    return-void
.end method

.method public setAccountNumber(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountNumber:Ljava/lang/String;

    return-void
.end method

.method public setAccountSecret(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountSecret:Ljava/lang/String;

    return-void
.end method

.method public setAccountType(Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->accountType:Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams$AccountType;

    return-void
.end method

.method public setBankNumber(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->bankNumber:Ljava/lang/String;

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setDestinationId(I)V
    .locals 0

    .line 167
    iput p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->destinationId:I

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setType(Lcom/ibotta/api/model/customer/CustomerAccount$Type;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/ibotta/api/call/customer/accounts/BaseCustomerAccountsPostCall$CallParams;->type:Lcom/ibotta/api/model/customer/CustomerAccount$Type;

    return-void
.end method
