.class public abstract Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final LEVEL_HIGH:I = 0x2

.field public static final LEVEL_LOW:I = 0x0

.field public static final LEVEL_NORMAL:I = 0x1


# instance fields
.field protected mActionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field protected mAdvice:I

.field protected mLevel:I

.field protected mLevelLongTip:I

.field protected mLevelShortTip:I

.field protected mValue:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireActionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mActionList:Ljava/util/List;

    return-object v0
.end method

.method public acquireAdvice()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mAdvice:I

    return v0
.end method

.method public acquireLevel()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mLevel:I

    return v0
.end method

.method public acquireLevelLongTip()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mLevelLongTip:I

    return v0
.end method

.method public acquireLevelShortTip()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mLevelShortTip:I

    return v0
.end method

.method public acquireValueList()[I
    .locals 3

    .line 56
    const/4 v0, 0x1

    new-array v0, v0, [I

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mValue:I

    const/4 v2, 0x0

    aput v1, v0, v2

    return-object v0
.end method

.method public abstract initActionList()V
.end method

.method protected initData(I)V
    .locals 1

    .line 26
    iput p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mValue:I

    .line 27
    invoke-virtual {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->judgeLevel(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mLevel:I

    .line 28
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->initActionList()V

    .line 29
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mLevel:I

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->judgeAdvices(I)V

    .line 30
    return-void
.end method

.method public abstract judgeAdvices(I)V
.end method

.method public abstract judgeLevel(I)I
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    iget v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mValue:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mLevel:I

    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/runningPostureAdviceMgr/RunningPostureAdviceBase;->mActionList:Ljava/util/List;

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
