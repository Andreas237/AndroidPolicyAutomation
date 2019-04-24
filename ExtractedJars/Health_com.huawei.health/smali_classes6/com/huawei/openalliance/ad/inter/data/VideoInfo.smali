.class public Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1d015dcL


# instance fields
.field private autoPlayAreaRatio:I

.field private autoPlayNetwork:I

.field private autoStopPlayAreaRatio:I

.field private backFromFullScreen:Z

.field private checkSha256:Z

.field private downloadNetwork:I

.field private needContinueAutoPlay:Z

.field private playProgress:I

.field private sha256:Ljava/lang/String;

.field private soundSwitch:Ljava/lang/String;

.field private timeBeforeVideoAutoPlay:I

.field private videoAutoPlay:Ljava/lang/String;

.field private videoAutoPlayWithSound:Ljava/lang/String;

.field private videoDownloadUrl:Ljava/lang/String;

.field private videoDuration:I

.field private videoFileSize:I

.field private videoPlayMode:I

.field private videoRatio:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "y"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlay:Ljava/lang/String;

    const-string v0, "n"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlayWithSound:Ljava/lang/String;

    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->timeBeforeVideoAutoPlay:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->playProgress:I

    const-string v0, "n"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->soundSwitch:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->needContinueAutoPlay:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->backFromFullScreen:Z

    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayAreaRatio:I

    const/16 v0, 0x5a

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoStopPlayAreaRatio:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->downloadNetwork:I

    return-void
.end method

.method public constructor <init>(Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "y"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlay:Ljava/lang/String;

    const-string v0, "n"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlayWithSound:Ljava/lang/String;

    const/16 v0, 0xc8

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->timeBeforeVideoAutoPlay:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->playProgress:I

    const-string v0, "n"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->soundSwitch:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->needContinueAutoPlay:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->backFromFullScreen:Z

    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayAreaRatio:I

    const/16 v0, 0x5a

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoStopPlayAreaRatio:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->downloadNetwork:I

    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoDownloadUrl__()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoDuration__()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDuration:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoFileSize__()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoFileSize:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoAutoPlayOnWifi()Ljava/lang/String;

    move-result-object v0

    const-string v1, "y"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoAutoPlayOnWifi()Ljava/lang/String;

    move-result-object v0

    const-string v1, "a"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "y"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlay:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const-string v0, "n"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlay:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoAutoPlayWithSound__()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlayWithSound:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getTimeBeforeVideoAutoPlay__()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->timeBeforeVideoAutoPlay:I

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getSha256__()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->sha256:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoPlayMode__()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlayWithSound:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->soundSwitch:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getCheckSha256Flag()I

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->checkSha256:Z

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getAutoPlayAreaRatio()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getAutoPlayAreaRatio()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayAreaRatio:I

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getAutoStopPlayAreaRatio()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getAutoStopPlayAreaRatio()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoStopPlayAreaRatio:I

    :cond_4
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getDownloadNetwork()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setDownloadNetwork(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoAutoPlayOnWifi()Ljava/lang/String;

    move-result-object v0

    const-string v1, "a"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayNetwork:I

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayNetwork:I

    :goto_2
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;->getVideoRatio()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setVideoRatio(Ljava/lang/Float;)V

    :cond_6
    return-void
.end method


# virtual methods
.method public checkHash()Z
    .locals 3

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDownloadUrl:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getFileSizeToCheck()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->checkSha256:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDownloadUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->sha256:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public getAutoPlayAreaRatio()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayAreaRatio:I

    return v0
.end method

.method public getAutoPlayNetwork()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayNetwork:I

    return v0
.end method

.method public getAutoStopPlayAreaRatio()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoStopPlayAreaRatio:I

    return v0
.end method

.method public getDownloadNetwork()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->downloadNetwork:I

    return v0
.end method

.method public getFileSizeToCheck()I
    .locals 1

    const/high16 v0, 0xc800000

    return v0
.end method

.method public getPlayProgress()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->playProgress:I

    return v0
.end method

.method public getSha256()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->sha256:Ljava/lang/String;

    return-object v0
.end method

.method public getSoundSwitch()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->soundSwitch:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeBeforeVideoAutoPlay()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->timeBeforeVideoAutoPlay:I

    return v0
.end method

.method public getVideoAutoPlay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlay:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoAutoPlayWithSound()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlayWithSound:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoDownloadUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoDuration()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDuration:I

    return v0
.end method

.method public getVideoFileSize()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoFileSize:I

    return v0
.end method

.method public getVideoPlayMode()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    return v0
.end method

.method public getVideoRatio()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoRatio:Ljava/lang/Float;

    return-object v0
.end method

.method public isBackFromFullScreen()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->backFromFullScreen:Z

    return v0
.end method

.method public isCheckSha256()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->checkSha256:Z

    return v0
.end method

.method public isNeedContinueAutoPlay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->needContinueAutoPlay:Z

    return v0
.end method

.method public isValid()Z
    .locals 3

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDownloadUrl:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getFileSizeToCheck()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/al;->a(Ljava/lang/String;J)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public setAutoPlayAreaRatio(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayAreaRatio:I

    return-void
.end method

.method public setAutoPlayNetwork(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoPlayNetwork:I

    return-void
.end method

.method public setAutoStopPlayAreaRatio(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->autoStopPlayAreaRatio:I

    return-void
.end method

.method public setBackFromFullScreen(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->backFromFullScreen:Z

    return-void
.end method

.method public setCheckSha256(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->checkSha256:Z

    return-void
.end method

.method public setDownloadNetwork(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->downloadNetwork:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->downloadNetwork:I

    :goto_0
    return-void
.end method

.method public setNeedContinueAutoPlay(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->needContinueAutoPlay:Z

    return-void
.end method

.method public setPlayProgress(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->playProgress:I

    return-void
.end method

.method public setSha256(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->sha256:Ljava/lang/String;

    return-void
.end method

.method public setSoundSwitch(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->soundSwitch:Ljava/lang/String;

    return-void
.end method

.method public setTimeBeforeVideoAutoPlay(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->timeBeforeVideoAutoPlay:I

    return-void
.end method

.method public setVideoAutoPlay(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlay:Ljava/lang/String;

    return-void
.end method

.method public setVideoAutoPlayWithSound(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoAutoPlayWithSound:Ljava/lang/String;

    return-void
.end method

.method public setVideoDownloadUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDownloadUrl:Ljava/lang/String;

    return-void
.end method

.method public setVideoDuration(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoDuration:I

    return-void
.end method

.method public setVideoFileSize(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoFileSize:I

    return-void
.end method

.method public setVideoPlayMode(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoPlayMode:I

    return-void
.end method

.method public setVideoRatio(Ljava/lang/Float;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoRatio:Ljava/lang/Float;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoRatio:Ljava/lang/Float;

    goto :goto_0

    :cond_1
    const v0, 0x3fe38e39

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->videoRatio:Ljava/lang/Float;

    :goto_0
    return-void
.end method
