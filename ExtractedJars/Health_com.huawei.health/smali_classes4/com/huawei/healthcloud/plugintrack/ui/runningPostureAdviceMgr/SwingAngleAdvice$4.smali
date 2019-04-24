.class final Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;
    .locals 1

    .line 102
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;

    invoke-direct {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public c(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;
    .locals 1

    .line 107
    new-array v0, p1, [Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 99
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice$4;->c(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 99
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice$4;->c(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;

    move-result-object v0

    return-object v0
.end method
