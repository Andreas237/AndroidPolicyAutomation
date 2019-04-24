.class final Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;
    .locals 1

    .line 79
    new-array v0, p1, [Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;

    return-object v0
.end method

.method public b(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;

    invoke-direct {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 71
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice$4;->b(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 71
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice$4;->a(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;

    move-result-object v0

    return-object v0
.end method
