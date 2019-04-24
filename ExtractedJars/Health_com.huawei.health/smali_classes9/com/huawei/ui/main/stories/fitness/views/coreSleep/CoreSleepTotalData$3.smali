.class final Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;
    .locals 1

    .line 1168
    new-array v0, p1, [Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;
    .locals 1

    .line 1163
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    invoke-direct {v0, p1}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1160
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$3;->c(Landroid/os/Parcel;)Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1160
    invoke-virtual {p0, p1}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$3;->a(I)[Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    move-result-object v0

    return-object v0
.end method
