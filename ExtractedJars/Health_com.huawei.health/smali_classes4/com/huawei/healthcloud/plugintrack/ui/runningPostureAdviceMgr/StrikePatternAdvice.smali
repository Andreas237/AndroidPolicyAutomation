.class public Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;
.super Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;>;"
        }
    .end annotation
.end field


# instance fields
.field private mForeFoot:I

.field private mHindFoot:I

.field private mWholeFoot:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 138
    new-instance v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice$2;

    invoke-direct {v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice$2;-><init>()V

    sput-object v0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->initData(III)V

    .line 44
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 126
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;-><init>()V

    .line 127
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mValue:I

    .line 128
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    .line 129
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelShortTip:I

    .line 130
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelLongTip:I

    .line 131
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mAdvice:I

    .line 132
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    .line 133
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mForeFoot:I

    .line 134
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mWholeFoot:I

    .line 135
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mHindFoot:I

    .line 136
    return-void
.end method

.method private initData(III)V
    .locals 1

    .line 49
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mForeFoot:I

    .line 50
    iput p2, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mWholeFoot:I

    .line 51
    iput p3, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mHindFoot:I

    .line 52
    if-lt p1, p2, :cond_0

    if-lt p1, p3, :cond_0

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    goto :goto_0

    .line 54
    :cond_0
    if-lt p2, p1, :cond_1

    if-lt p2, p3, :cond_1

    .line 55
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    .line 59
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->initActionList()V

    .line 60
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->judgeAdvices(I)V

    .line 61
    return-void
.end method


# virtual methods
.method public acquireValueList()[I
    .locals 3

    .line 113
    const/4 v0, 0x3

    new-array v0, v0, [I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mForeFoot:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mWholeFoot:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mHindFoot:I

    const/4 v2, 0x2

    aput v1, v0, v2

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 152
    const/4 v0, 0x0

    return v0
.end method

.method public initActionList()V
    .locals 2

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    .line 76
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "095"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "096"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "233"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "234"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_0
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 82
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "041A"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "003"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "003"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    const-string v1, "050A"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :goto_0
    return-void
.end method

.method public judgeAdvices(I)V
    .locals 1

    .line 96
    if-nez p1, :cond_0

    .line 97
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_qianjiaozhang_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelShortTip:I

    .line 98
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_qianjiaozhang_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelLongTip:I

    .line 99
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_cushion_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mAdvice:I

    goto :goto_0

    .line 100
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 101
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_quanjiaozhang_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelShortTip:I

    .line 102
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_quanjiaozhang_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelLongTip:I

    .line 103
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_landing_recommendation:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mAdvice:I

    goto :goto_0

    .line 105
    :cond_1
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_houjiaogen_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelShortTip:I

    .line 106
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_houjiaogen_title:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelLongTip:I

    .line 107
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hwh_improve_landing:I

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mAdvice:I

    .line 109
    :goto_0
    return-void
.end method

.method public judgeLevel(I)I
    .locals 1

    .line 66
    const/4 v0, 0x1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mForeFoot:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mWholeFoot:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mHindFoot:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 157
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mValue:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelShortTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mLevelLongTip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mAdvice:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mActionList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 163
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mForeFoot:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mWholeFoot:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/StrikePatternAdvice;->mHindFoot:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    return-void
.end method
