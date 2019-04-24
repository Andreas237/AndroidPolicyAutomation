.class final Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;
    .locals 1

    .line 146
    new-array v0, p1, [Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 138
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice$2;->e(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;
    .locals 1

    .line 141
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;

    invoke-direct {v0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 138
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice$2;->a(I)[Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;

    move-result-object v0

    return-object v0
.end method
