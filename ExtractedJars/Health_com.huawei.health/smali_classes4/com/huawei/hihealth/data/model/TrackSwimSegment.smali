.class public Lcom/huawei/hihealth/data/model/TrackSwimSegment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private mDistance:I

.field private mDuration:I

.field private mLocationIndex:I

.field private mPace:I

.field private mPullTimes:I

.field private mSegmentIndex:I

.field private mStrokeType:I

.field private mSwolf:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public requestDistance()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mDistance:I

    return v0
.end method

.method public requestDuration()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mDuration:I

    return v0
.end method

.method public requestLocationIndex()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mLocationIndex:I

    return v0
.end method

.method public requestPace()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mPace:I

    return v0
.end method

.method public requestPullTimes()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mPullTimes:I

    return v0
.end method

.method public requestSegmentIndex()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mSegmentIndex:I

    return v0
.end method

.method public requestStrokeType()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mStrokeType:I

    return v0
.end method

.method public requestSwolf()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mSwolf:I

    return v0
.end method

.method public saveDistance(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mDistance:I

    .line 44
    return-void
.end method

.method public saveDuration(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mDuration:I

    .line 52
    return-void
.end method

.method public saveLocationIndex(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mLocationIndex:I

    .line 92
    return-void
.end method

.method public savePace(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mPace:I

    .line 60
    return-void
.end method

.method public savePullTimes(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mPullTimes:I

    .line 68
    return-void
.end method

.method public saveSegmentIndex(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mSegmentIndex:I

    .line 36
    return-void
.end method

.method public saveStrokeType(I)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mStrokeType:I

    .line 84
    return-void
.end method

.method public saveSwolf(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/hihealth/data/model/TrackSwimSegment;->mSwolf:I

    .line 76
    return-void
.end method
