.class public Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;
.super Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;>;"
        }
    .end annotation
.end field

.field private static final GroundContactTimeThresh:I = 0x12c


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice$1;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice$1;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 25
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->initData(I)V

    .line 26
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mValue:I

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevel:I

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelShortTip:I

    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelLongTip:I

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mAdvice:I

    .line 70
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mActionList:Ljava/util/List;

    .line 71
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 87
    const/4 v0, 0x0

    return v0
.end method

.method public initActionList()V
    .locals 2

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mActionList:Ljava/util/List;

    .line 43
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mActionList:Ljava/util/List;

    const-string v1, "109"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mActionList:Ljava/util/List;

    const-string v1, "066A"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    return-void
.end method

.method public judgeAdvices(I)V
    .locals 1

    .line 53
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 54
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_details_sleep_grade_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelShortTip:I

    .line 55
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_contact_time_normal:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelLongTip:I

    .line 56
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_how_improve_muscle:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mAdvice:I

    goto :goto_0

    .line 58
    :cond_0
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_runningstyle_longer:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelShortTip:I

    .line 59
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_chudishijian_long_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelLongTip:I

    .line 60
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_how_landing_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mAdvice:I

    .line 62
    :goto_0
    return-void
.end method

.method public judgeLevel(I)I
    .locals 1

    .line 30
    const/16 v0, 0x12c

    if-gt p1, v0, :cond_0

    .line 31
    const/4 v0, 0x1

    return v0

    .line 33
    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelShortTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mLevelLongTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mAdvice:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/GroundContactTimeAdvice;->mActionList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 98
    return-void
.end method
