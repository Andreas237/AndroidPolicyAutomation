.class public Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;>;"
        }
    .end annotation
.end field


# instance fields
.field private final mActivity:Ljava/lang/String;

.field private final mEventType:I

.field private final mTimestampNs:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent$5;

    invoke-direct {v0}, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent$5;-><init>()V

    .line 33
    sput-object v0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mActivity:Ljava/lang/String;

    .line 17
    iput p2, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mEventType:I

    .line 18
    iput-wide p3, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mTimestampNs:J

    .line 19
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 52
    const/4 v0, 0x0

    return v0
.end method

.method public getActivity()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mActivity:Ljava/lang/String;

    return-object v0
.end method

.method public getEventType()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mEventType:I

    return v0
.end method

.method public getTimestampNs()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mTimestampNs:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 65
    const-string v0, "Activity=\'%s\', EventType=%s, TimestampNs=%s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    iget-object v2, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mActivity:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 67
    iget v2, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mEventType:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 68
    iget-wide v2, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mTimestampNs:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 64
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mActivity:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 58
    iget v0, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mEventType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    iget-wide v0, p0, Lcom/huawei/systemserver/activityrecognition/HwActivityRecognitionEvent;->mTimestampNs:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 60
    return-void
.end method
