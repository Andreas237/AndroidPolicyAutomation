.class public Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/data/MeasureRecord;


# instance fields
.field private MeasureTime:Ljava/util/Date;

.field private mValues:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/util/ArrayList<Ljava/lang/Number;>;>;"
        }
    .end annotation
.end field

.field private resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;


# direct methods
.method public constructor <init>(Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;)V
    .locals 3

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->MeasureTime:Ljava/util/Date;

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    .line 15
    iput-object p1, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    .line 16
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-eqz v0, :cond_0

    .line 17
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->getFieldNum()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 21
    :cond_0
    return-void
.end method


# virtual methods
.method public getDataTypes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->getDataTypes()Ljava/util/ArrayList;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getFieldNum()I
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->getFieldNum()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getMeasureTime()Ljava/util/Date;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->MeasureTime:Ljava/util/Date;

    if-nez v0, :cond_0

    .line 35
    const/4 v0, 0x0

    return-object v0

    .line 37
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->MeasureTime:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    return-object v0
.end method

.method public getUnit(I)Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->getUnit(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getUnit(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->getUnit(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getValue(I)Ljava/lang/Number;
    .locals 2

    .line 79
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getValue(Ljava/lang/String;)Ljava/lang/Number;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->indexOfDataType(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->getValue(I)Ljava/lang/Number;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getValueList(I)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Ljava/lang/Number;>;"
        }
    .end annotation

    .line 100
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getValueList(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/Number;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->indexOfDataType(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->getValueList(I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    .line 95
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public setMeasureTime(Ljava/util/Date;)V
    .locals 1

    .line 25
    if-nez p1, :cond_0

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->MeasureTime:Ljava/util/Date;

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1}, Ljava/util/Date;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->MeasureTime:Ljava/util/Date;

    .line 30
    :goto_0
    return-void
.end method

.method public setValue(ILjava/lang/Number;)Z
    .locals 2

    .line 42
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 43
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 46
    const/4 v0, 0x1

    return v0

    .line 48
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setValue(Ljava/lang/String;Ljava/lang/Number;)Z
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->indexOfDataType(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->setValue(ILjava/lang/Number;)Z

    move-result v0

    return v0

    .line 56
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setValueList(ILjava/util/ArrayList;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Ljava/lang/Number;>;)Z"
        }
    .end annotation

    .line 61
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->mValues:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 63
    const/4 v0, 0x1

    return v0

    .line 65
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setValueList(Ljava/lang/String;Ljava/util/ArrayList;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Number;>;)Z"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->resultHolder:Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->indexOfDataType(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0, p2}, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;->setValueList(ILjava/util/ArrayList;)Z

    move-result v0

    return v0

    .line 73
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
