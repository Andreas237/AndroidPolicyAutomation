.class final Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;
    .locals 1

    .line 81
    new-array v0, p1, [Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;

    return-object v0
.end method

.method public b(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;
    .locals 1

    .line 76
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;

    invoke-direct {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 73
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice$1;->b(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 73
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice$1;->a(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;

    move-result-object v0

    return-object v0
.end method
