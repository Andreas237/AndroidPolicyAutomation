.class public Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;
.super Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 99
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice$4;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice$4;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 28
    invoke-direct {p0, p1, p2}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->initData(IF)V

    .line 29
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mValue:I

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevel:I

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelShortTip:I

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelLongTip:I

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mAdvice:I

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mActionList:Ljava/util/List;

    .line 97
    return-void
.end method

.method private initData(IF)V
    .locals 1

    .line 39
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mValue:I

    .line 40
    const/16 v0, 0x46

    if-ge p1, v0, :cond_0

    const/high16 v0, 0x41200000    # 10.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevel:I

    goto :goto_0

    .line 42
    :cond_0
    const/16 v0, 0x8c

    if-le p1, v0, :cond_1

    const/high16 v0, 0x41600000    # 14.0f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    .line 43
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevel:I

    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevel:I

    .line 49
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->initActionList()V

    .line 50
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevel:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->judgeAdvices(I)V

    .line 51
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 113
    const/4 v0, 0x0

    return v0
.end method

.method public initActionList()V
    .locals 2

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mActionList:Ljava/util/List;

    .line 65
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "002"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "014A"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    return-void
.end method

.method public judgeAdvices(I)V
    .locals 1

    .line 75
    if-nez p1, :cond_0

    .line 76
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_runningstyle_smaller:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelShortTip:I

    .line 77
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_swing_angle_small:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelLongTip:I

    .line 78
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_leg_folding_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mAdvice:I

    goto :goto_0

    .line 79
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 80
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_details_sleep_grade_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelShortTip:I

    .line 81
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_swing_angle_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelLongTip:I

    .line 82
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_running_leg_folding:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mAdvice:I

    goto :goto_0

    .line 84
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_runningstyle_larger:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelShortTip:I

    .line 85
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_swing_angle_large:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelLongTip:I

    .line 86
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_swing_angle_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mAdvice:I

    .line 88
    :goto_0
    return-void
.end method

.method public judgeLevel(I)I
    .locals 1

    .line 56
    const/4 v0, 0x1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 119
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelShortTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mLevelLongTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mAdvice:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/SwingAngleAdvice;->mActionList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 124
    return-void
.end method
