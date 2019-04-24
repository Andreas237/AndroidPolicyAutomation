.class public Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;>;"
        }
    .end annotation
.end field


# instance fields
.field private final mActivity:Ljava/lang/String;

.field private final mEventType:I

.field private final mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

.field private final mTimestampNs:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent$4;

    invoke-direct {v0}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent$4;-><init>()V

    sput-object v0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 62
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLcom/huawei/android/location/activityrecognition/OtherParameters;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mActivity:Ljava/lang/String;

    .line 19
    iput p2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mEventType:I

    .line 20
    iput-wide p3, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mTimestampNs:J

    .line 21
    iput-object p5, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    .line 22
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 66
    const/4 v0, 0x0

    return v0
.end method

.method public getActivity()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mActivity:Ljava/lang/String;

    return-object v0
.end method

.method public getEventType()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mEventType:I

    return v0
.end method

.method public getOtherParams()Lcom/huawei/android/location/activityrecognition/OtherParameters;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    return-object v0
.end method

.method public getTimestampNs()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mTimestampNs:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 82
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    if-eqz v0, :cond_0

    .line 84
    const-string v0, "Activity=\'%s\', EventType=%s, TimestampNs=%s, Param1=%s, Param2=%s, Param3=%s, Param4=%s, Param5=%s"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    .line 85
    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mActivity:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mEventType:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mTimestampNs:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 86
    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {v2}, Lcom/huawei/android/location/activityrecognition/OtherParameters;->getmParam1()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {v2}, Lcom/huawei/android/location/activityrecognition/OtherParameters;->getmParam2()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 87
    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {v2}, Lcom/huawei/android/location/activityrecognition/OtherParameters;->getmParam3()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {v2}, Lcom/huawei/android/location/activityrecognition/OtherParameters;->getmParam4()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 88
    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {v2}, Lcom/huawei/android/location/activityrecognition/OtherParameters;->getmParam5()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 84
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 83
    return-object v0

    .line 91
    :cond_0
    const-string v0, "Activity=\'%s\', EventType=%s, TimestampNs=%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 92
    iget-object v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mActivity:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mEventType:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mTimestampNs:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 91
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 90
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 71
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mActivity:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    iget v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mEventType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    iget-wide v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mTimestampNs:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 74
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionExtendEvent;->mOtherParams:Lcom/huawei/android/location/activityrecognition/OtherParameters;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 75
    return-void
.end method
