.class public Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private expireTime:J

.field private isHadNativeConfig:Z

.field private isNeedSurvey:Z

.field private npsHuid:Ljava/lang/String;

.field private questionContent:Ljava/lang/String;

.field private showTime:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->questionContent:Ljava/lang/String;

    .line 16
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->showTime:J

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isHadNativeConfig:Z

    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isNeedSurvey:Z

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->expireTime:J

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->npsHuid:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getExpireTime()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->expireTime:J

    return-wide v0
.end method

.method public getNpsHuid()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->npsHuid:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionContent()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->questionContent:Ljava/lang/String;

    return-object v0
.end method

.method public getShowTime()J
    .locals 2

    .line 48
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->showTime:J

    return-wide v0
.end method

.method public isHadNativeConfig()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isHadNativeConfig:Z

    return v0
.end method

.method public isNeedSurvey()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isNeedSurvey:Z

    return v0
.end method

.method public setExpireTime(J)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->expireTime:J

    .line 45
    return-void
.end method

.method public setHadConfig(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isHadNativeConfig:Z

    .line 61
    return-void
.end method

.method public setHadNativeConfig(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isHadNativeConfig:Z

    .line 37
    return-void
.end method

.method public setNeedSurvey(Z)V
    .locals 0

    .line 68
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->isNeedSurvey:Z

    .line 69
    return-void
.end method

.method public setNpsHuid(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->npsHuid:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setQuestionContent(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->questionContent:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setShowTime(J)V
    .locals 0

    .line 52
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/nps/component/NpsConfigBean;->showTime:J

    .line 53
    return-void
.end method
