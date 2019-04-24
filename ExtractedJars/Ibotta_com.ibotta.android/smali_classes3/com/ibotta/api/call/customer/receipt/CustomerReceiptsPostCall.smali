.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;
.super Lcom/ibotta/api/FileUploadApiCall;
.source "CustomerReceiptsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;,
        Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;,
        Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;,
        Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/FileUploadApiCall<",
        "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/FileUploadApiCall;-><init>()V

    const/4 v0, 0x1

    .line 19
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->setRequiresAuthToken(Z)V

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    return-void
.end method

.method private groupUpcs(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 107
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;

    .line 108
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->getProductGroupId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    .line 110
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 111
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->getProductGroupId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_1
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->getUpcs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    .line 129
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v0, 0x0

    .line 130
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 131
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    const-string v1, ","

    .line 134
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 138
    :cond_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public buildParams()V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 40
    invoke-super {p0}, Lcom/ibotta/api/FileUploadApiCall;->buildParams()V

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v1, "customer_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getCustomerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v1, "submission_id"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getSubmissionId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v1, "receipt[retailer_id]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getRetailerId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceiptScanContent()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v1, "receipt[receipt_scan_content]"

    iget-object v2, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceiptScanContent()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceipts()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceipts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 52
    :goto_0
    iget-object v3, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceipts()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 53
    iget-object v3, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceipts()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "receipt[receipt_images_attributes][%1$d][receipt_image]"

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-interface {v4, v5, v6}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "image/jpeg"

    const/4 v6, 0x0

    .line 55
    invoke-virtual {p0, v4, v3, v5, v6}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->addFilePart(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceiptData()Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v3, "receipt_data[source]"

    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceiptData()Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v3, "receipt_data[data]"

    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceiptData()Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->getData()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    const-string v3, "receipt_data[signature]"

    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceiptData()Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->getSignature()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getOfferDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;

    .line 68
    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v5

    const-string v6, "offers[%1$d][checked]"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getOfferId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-interface {v5, v6, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "1"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v5

    const-string v6, "offers[%1$d][submitted_count]"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getOfferId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-interface {v5, v6, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 71
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getSubmittedCount()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    .line 69
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->isVerified()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 74
    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v5

    const-string v6, "offers[%1$d][verified]"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getOfferId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-interface {v5, v6, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "1"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    :cond_4
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    .line 78
    iget-object v4, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v5

    const-string v6, "offers[%1$d][upc]"

    new-array v7, v1, [Ljava/lang/Object;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getOfferId()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-interface {v5, v6, v7}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 80
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v6

    const-string v7, ","

    invoke-static {v6, v7}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 78
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    :cond_5
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getProductGroupDataList()Ljava/util/List;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->groupUpcs(Ljava/util/List;)Ljava/util/Map;

    move-result-object v4

    .line 85
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    .line 86
    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getOfferId()I

    move-result v6

    .line 87
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 89
    iget-object v8, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v9

    const-string v10, "offer[%1$d][groups][%2$d][checked]"

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v12, v1

    invoke-interface {v9, v10, v12}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "1"

    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_6

    .line 92
    iget-object v8, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->params:Ljava/util/Map;

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v9

    const-string v10, "offers[%1$d][groups][%2$d][upc]"

    new-array v11, v11, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v11, v1

    invoke-interface {v9, v10, v11}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 94
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    const-string v7, ","

    invoke-static {v5, v7}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 92
    invoke-interface {v8, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 121
    const-class v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/receipts.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->callParams:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-virtual {v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getCustomerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 30
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->POST:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;",
            ">;"
        }
    .end annotation

    .line 25
    const-class v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;

    return-object v0
.end method
