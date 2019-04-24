.class public Lcom/huawei/openalliance/ad/inter/data/CubeConfig;
.super Ljava/lang/Object;


# instance fields
.field private channelInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;>;"
        }
    .end annotation
.end field

.field private requestTimeInterval:I

.field private screenSaverPoolSize:I

.field private serialAdCount:I

.field private serialNoAdCount:I

.field private startUpPoolSize:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getChannelInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->channelInfo:Ljava/util/List;

    return-object v0
.end method

.method public getRequestTimeInterval()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->requestTimeInterval:I

    return v0
.end method

.method public getScreenSaverPoolSize()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->screenSaverPoolSize:I

    return v0
.end method

.method public getSerialAdCount()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->serialAdCount:I

    return v0
.end method

.method public getSerialNoAdCount()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->serialNoAdCount:I

    return v0
.end method

.method public getStartUpPoolSize()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->startUpPoolSize:I

    return v0
.end method

.method public setChannelInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->channelInfo:Ljava/util/List;

    return-void
.end method

.method public setRequestTimeInterval(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->requestTimeInterval:I

    return-void
.end method

.method public setScreenSaverPoolSize(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->screenSaverPoolSize:I

    return-void
.end method

.method public setSerialAdCount(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->serialAdCount:I

    return-void
.end method

.method public setSerialNoAdCount(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->serialNoAdCount:I

    return-void
.end method

.method public setStartUpPoolSize(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->startUpPoolSize:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CubeConfig [channelInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->channelInfo:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startUpPoolSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->startUpPoolSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", screenSaverPoolSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->screenSaverPoolSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serialNoAdCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->serialNoAdCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", serialAdCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->serialAdCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", requestTimeInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/openalliance/ad/inter/data/CubeConfig;->requestTimeInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
