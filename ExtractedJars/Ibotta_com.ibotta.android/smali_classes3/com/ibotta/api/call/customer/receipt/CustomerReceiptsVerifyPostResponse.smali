.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerReceiptsVerifyPostResponse.java"


# instance fields
.field private receipt:Lcom/ibotta/api/model/receipt/Receipt;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getReceipt()Lcom/ibotta/api/model/receipt/Receipt;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    return-object v0
.end method

.method public setReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    return-void
.end method
