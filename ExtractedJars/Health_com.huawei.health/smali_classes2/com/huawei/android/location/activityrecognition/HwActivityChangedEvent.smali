.class public Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;>;"
        }
    .end annotation
.end field


# instance fields
.field private final mActivityRecognitionEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent$3;

    invoke-direct {v0}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent$3;-><init>()V

    sput-object v0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 47
    return-void
.end method

.method public constructor <init>([Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    if-nez p1, :cond_0

    .line 20
    new-instance v0, Ljava/security/InvalidParameterException;

    .line 21
    const-string v1, "Parameter \'activityRecognitionEvents\' must not be null."

    .line 20
    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 25
    :cond_0
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->mActivityRecognitionEvents:Ljava/util/List;

    .line 26
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 51
    const/4 v0, 0x0

    return v0
.end method

.method public getActivityRecognitionEvents()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/lang/Iterable<Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->mActivityRecognitionEvents:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "[ ActivityChangedEvent:"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->mActivityRecognitionEvents:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 67
    const-string v0, "\n    "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {v2}, Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    const-string v0, "\n]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 56
    iget-object v0, p0, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->mActivityRecognitionEvents:Ljava/util/List;

    .line 57
    const/4 v1, 0x0

    new-array v1, v1, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, [Lcom/huawei/android/location/activityrecognition/HwActivityRecognitionEvent;

    .line 56
    .line 58
    array-length v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 59
    invoke-virtual {p1, v2, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    .line 60
    return-void
.end method
