.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerReceiptsVerifyPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private customerId:I

.field private data:Ljava/lang/String;

.field private retailerId:I

.field private signature:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private submissionId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerId()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->retailerId:I

    return v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getSource()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->source:Ljava/lang/String;

    return-object v0
.end method

.method public getSubmissionId()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->submissionId:Ljava/lang/String;

    return-object v0
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->data:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 97
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->retailerId:I

    return-void
.end method

.method public setSignature(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->signature:Ljava/lang/String;

    return-void
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->source:Ljava/lang/String;

    return-void
.end method

.method public setSubmissionId(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall$CallParams;->submissionId:Ljava/lang/String;

    return-void
.end method
