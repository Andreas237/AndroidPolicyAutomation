.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;
.super Ljava/lang/Object;
.source "CustomerReceiptsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ProductGroupData"
.end annotation


# instance fields
.field private productGroupId:I

.field private upcs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 292
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 294
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->upcs:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getProductGroupId()I
    .locals 1

    .line 297
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->productGroupId:I

    return v0
.end method

.method public getUpcs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 305
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->upcs:Ljava/util/List;

    return-object v0
.end method

.method public setProductGroupId(I)V
    .locals 0

    .line 301
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->productGroupId:I

    return-void
.end method

.method public setUpcs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 309
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->upcs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 311
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->upcs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method
