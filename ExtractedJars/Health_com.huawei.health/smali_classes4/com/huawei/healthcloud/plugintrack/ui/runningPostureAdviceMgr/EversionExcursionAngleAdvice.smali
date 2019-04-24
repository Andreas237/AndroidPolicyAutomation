.class public Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;
.super Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 84
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice$2;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice$2;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 42
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->initData(I)V

    .line 43
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mValue:I

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevel:I

    .line 78
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelShortTip:I

    .line 79
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelLongTip:I

    .line 80
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mAdvice:I

    .line 81
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    .line 82
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public initActionList()V
    .locals 3

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    .line 62
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mValue:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->judgeLevel(I)I

    move-result v2

    .line 63
    if-nez v2, :cond_0

    .line 64
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "239"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "272"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 66
    :cond_0
    const/4 v0, 0x1

    if-ne v2, v0, :cond_1

    .line 67
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "239"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "274"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "239"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    const-string v1, "273"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    :goto_0
    return-void
.end method

.method public judgeAdvices(I)V
    .locals 1

    .line 118
    if-nez p1, :cond_0

    .line 119
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_runningstyle_smaller:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelShortTip:I

    .line 120
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_eversion_excursion_small:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelLongTip:I

    .line 121
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_ankle_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mAdvice:I

    goto :goto_0

    .line 122
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 123
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_details_sleep_grade_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelShortTip:I

    .line 124
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_eversion_excursion_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelLongTip:I

    .line 125
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_eversion_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mAdvice:I

    goto :goto_0

    .line 127
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_runningstyle_larger:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelShortTip:I

    .line 128
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_eversion_excursion_large:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelLongTip:I

    .line 129
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_stable_sneakers_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mAdvice:I

    .line 131
    :goto_0
    return-void
.end method

.method public judgeLevel(I)I
    .locals 1

    .line 47
    const/4 v0, 0x5

    if-ge p1, v0, :cond_0

    .line 48
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_0
    const/16 v0, 0x14

    if-le p1, v0, :cond_1

    .line 50
    const/4 v0, 0x2

    return v0

    .line 52
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelShortTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 106
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mLevelLongTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mAdvice:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/EversionExcursionAngleAdvice;->mActionList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 109
    return-void
.end method
