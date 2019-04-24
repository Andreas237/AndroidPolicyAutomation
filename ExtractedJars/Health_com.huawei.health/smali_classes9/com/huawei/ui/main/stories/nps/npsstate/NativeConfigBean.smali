.class public Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private expireTime:J

.field private huidStr:Ljava/lang/String;

.field private isHasNativeConfig:Z

.field private isNeedShowNpsEnter:Z

.field private isNeedSurvey:Z

.field private questionContent:Ljava/lang/String;

.field private showTime:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey:Z

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->questionContent:Ljava/lang/String;

    .line 14
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->showTime:J

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->huidStr:Ljava/lang/String;

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isHasNativeConfig:Z

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->expireTime:J

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedShowNpsEnter:Z

    return-void
.end method


# virtual methods
.method public getExpireTime()J
    .locals 2

    .line 34
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->expireTime:J

    return-wide v0
.end method

.method public getHuidStr()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->huidStr:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestionContent()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->questionContent:Ljava/lang/String;

    return-object v0
.end method

.method public getShowTime()J
    .locals 2

    .line 74
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->showTime:J

    return-wide v0
.end method

.method public isHasNativeConfig()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isHasNativeConfig:Z

    return v0
.end method

.method public isNeedShowNpsEnter()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedShowNpsEnter:Z

    return v0
.end method

.method public isNeedSurvey()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey:Z

    return v0
.end method

.method public setExpireTime(J)V
    .locals 0

    .line 38
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->expireTime:J

    .line 39
    return-void
.end method

.method public setHasNativeConfig(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isHasNativeConfig:Z

    .line 47
    return-void
.end method

.method public setHuidStr(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->huidStr:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setNeedShowNpsEnter(Z)V
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedShowNpsEnter:Z

    .line 31
    return-void
.end method

.method public setNeedSurvey(Z)V
    .locals 0

    .line 62
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->isNeedSurvey:Z

    .line 63
    return-void
.end method

.method public setQuestionContent(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->questionContent:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setShowTime(J)V
    .locals 0

    .line 78
    iput-wide p1, p0, Lcom/huawei/ui/main/stories/nps/npsstate/NativeConfigBean;->showTime:J

    .line 79
    return-void
.end method
