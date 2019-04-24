.class public Lcom/ibotta/api/model/customer/CustomerHistory;
.super Ljava/lang/Object;
.source "CustomerHistory.java"


# instance fields
.field private amount:F

.field private createdAt:Ljava/util/Date;

.field private itemId:I

.field private itemType:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private reportId:I

.field private reportType:Ljava/lang/String;

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->amount:F

    return v0
.end method

.method public getCreatedAt()Ljava/util/Date;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public getItemId()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->itemId:I

    return v0
.end method

.method public getItemType()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->itemType:Ljava/lang/String;

    return-object v0
.end method

.method public getItemTypeEnum()Lcom/ibotta/api/model/customer/HistoryItemType;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->itemType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/HistoryItemType;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryItemType;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getReportId()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->reportId:I

    return v0
.end method

.method public getReportType()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->reportType:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusEnum()Lcom/ibotta/api/model/customer/HistoryStatus;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->status:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/customer/HistoryStatus;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/customer/HistoryStatus;

    move-result-object v0

    return-object v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 56
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->amount:F

    return-void
.end method

.method public setCreatedAt(Ljava/util/Date;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->createdAt:Ljava/util/Date;

    return-void
.end method

.method public setItemId(I)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->itemId:I

    return-void
.end method

.method public setItemType(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->itemType:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->name:Ljava/lang/String;

    return-void
.end method

.method public setReportId(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->reportId:I

    return-void
.end method

.method public setReportType(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->reportType:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerHistory;->status:Ljava/lang/String;

    return-void
.end method
