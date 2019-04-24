.class public Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;>;"
        }
    .end annotation
.end field


# instance fields
.field private maxHeartRate:I

.field private minHeartRate:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->maxHeartRate:I

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->minHeartRate:I

    .line 50
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 35
    const/4 v0, 0x0

    return v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->maxHeartRate:I

    return v0
.end method

.method public getMinHeartRate()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->minHeartRate:I

    return v0
.end method

.method public setMaxHeartRate(I)V
    .locals 1

    .line 22
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->maxHeartRate:I

    .line 23
    return-void
.end method

.method public setMinHeartRate(I)V
    .locals 1

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->minHeartRate:I

    .line 31
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->maxHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    iget v0, p0, Lcom/huawei/hihealth/data/model/HiHearRateUpMetaData;->minHeartRate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 42
    return-void
.end method
