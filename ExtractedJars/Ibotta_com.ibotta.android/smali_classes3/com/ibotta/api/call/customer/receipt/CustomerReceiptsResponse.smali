.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerReceiptsResponse.java"


# instance fields
.field private receipts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/receipt/Receipt;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getReceipts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/receipt/Receipt;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;->receipts:Ljava/util/List;

    return-object v0
.end method

.method public setReceipts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/receipt/Receipt;",
            ">;)V"
        }
    .end annotation

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsResponse;->receipts:Ljava/util/List;

    return-void
.end method
