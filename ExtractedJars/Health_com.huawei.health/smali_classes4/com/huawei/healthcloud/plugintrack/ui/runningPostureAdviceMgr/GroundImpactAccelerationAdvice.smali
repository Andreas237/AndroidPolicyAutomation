.class public Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;
.super Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice$4;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice$4;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 24
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->initData(I)V

    .line 25
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mValue:I

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevel:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelShortTip:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelLongTip:I

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mAdvice:I

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mActionList:Ljava/util/List;

    .line 69
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 85
    const/4 v0, 0x0

    return v0
.end method

.method public initActionList()V
    .locals 2

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mActionList:Ljava/util/List;

    .line 41
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mActionList:Ljava/util/List;

    const-string v1, "050A"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mActionList:Ljava/util/List;

    const-string v1, "003"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    return-void
.end method

.method public judgeAdvices(I)V
    .locals 1

    .line 51
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 52
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_details_sleep_grade_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelShortTip:I

    .line 53
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_landing_impact_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelLongTip:I

    .line 54
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_lower_limb_training_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mAdvice:I

    goto :goto_0

    .line 56
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_runningstyle_larger:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelShortTip:I

    .line 57
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodichongji_greater_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelLongTip:I

    .line 58
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_move_softly_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mAdvice:I

    .line 60
    :goto_0
    return-void
.end method

.method public judgeLevel(I)I
    .locals 1

    .line 28
    const/16 v0, 0x14

    if-gt p1, v0, :cond_0

    .line 29
    const/4 v0, 0x1

    return v0

    .line 31
    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelShortTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mLevelLongTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mAdvice:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundImpactAccelerationAdvice;->mActionList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 96
    return-void
.end method
