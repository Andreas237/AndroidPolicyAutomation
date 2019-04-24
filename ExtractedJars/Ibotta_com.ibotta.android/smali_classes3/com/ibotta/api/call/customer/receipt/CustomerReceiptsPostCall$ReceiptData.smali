.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;
.super Ljava/lang/Object;
.source "CustomerReceiptsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReceiptData"
.end annotation


# instance fields
.field private data:Ljava/lang/String;

.field private signature:Ljava/lang/String;

.field private source:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getSource()Ljava/lang/String;
    .locals 1

    .line 217
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->source:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->data:Ljava/lang/String;

    return-void
.end method

.method public setSignature(Ljava/lang/String;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->signature:Ljava/lang/String;

    return-void
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->source:Ljava/lang/String;

    return-void
.end method
