.class public Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerLoyaltiesPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private customerId:I

.field private id:I

.field private type:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerId()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->customerId:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->id:I

    return v0
.end method

.method public getType()Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->type:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->value:Ljava/lang/String;

    return-object v0
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->customerId:I

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->id:I

    return-void
.end method

.method public setType(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->type:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPutCall$CallParams;->value:Ljava/lang/String;

    return-void
.end method
