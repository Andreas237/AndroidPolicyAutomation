.class public Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/data/MeasureResult;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;>;"
        }
    .end annotation
.end field


# instance fields
.field private mDataTypes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private mRecords:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;>;"
        }
    .end annotation
.end field

.field private mUnits:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/hihealth/device/indoor/MeasureResultImpl$1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    .line 20
    invoke-virtual {p2}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mUnits:Ljava/util/ArrayList;

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mRecords:Ljava/util/ArrayList;

    .line 22
    return-void
.end method


# virtual methods
.method public createAndJoinRecord()Lcom/huawei/hihealth/device/open/data/MeasureRecord;
    .locals 2

    .line 74
    new-instance v1, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;

    invoke-direct {v1, p0}, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;-><init>(Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;)V

    .line 75
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mRecords:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    return-object v1
.end method

.method public createRecord()Lcom/huawei/hihealth/device/open/data/MeasureRecord;
    .locals 1

    .line 62
    new-instance v0, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;

    invoke-direct {v0, p0}, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;-><init>(Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 47
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getDataTypes()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getFieldNum()I
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getRecords()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/data/MeasureRecord;>;"
        }
    .end annotation

    .line 81
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mRecords:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;

    .line 83
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    return-object v1
.end method

.method public getUnit(I)Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mUnits:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mUnits:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mUnits:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 108
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getUnit(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->getUnit(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 57
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public indexOfDataType(Ljava/lang/String;)I
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mDataTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0

    .line 101
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public joinRecord(Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 2

    .line 67
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mRecords:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;->mRecords:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lcom/huawei/hihealth/device/indoor/MeasureRecordImpl;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 43
    return-void
.end method
