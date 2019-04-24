.class public Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerLoyaltiesPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private customerId:I

.field private retailerId:I

.field private retailerPassword:Ljava/lang/String;

.field private retailerUsername:Ljava/lang/String;

.field private shareHistory:Z

.field private type:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerId()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->retailerId:I

    return v0
.end method

.method public getRetailerPassword()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->retailerPassword:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerUsername()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->retailerUsername:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->type:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->value:Ljava/lang/String;

    return-object v0
.end method

.method public isShareHistory()Z
    .locals 1

    .line 120
    iget-boolean v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->shareHistory:Z

    return v0
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->retailerId:I

    return-void
.end method

.method public setRetailerPassword(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->retailerPassword:Ljava/lang/String;

    return-void
.end method

.method public setRetailerUsername(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->retailerUsername:Ljava/lang/String;

    return-void
.end method

.method public setShareHistory(Z)V
    .locals 0

    .line 124
    iput-boolean p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->shareHistory:Z

    return-void
.end method

.method public setType(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->type:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->value:Ljava/lang/String;

    return-void
.end method
