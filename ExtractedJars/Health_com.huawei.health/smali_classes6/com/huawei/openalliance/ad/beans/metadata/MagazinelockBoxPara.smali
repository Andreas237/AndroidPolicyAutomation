.class public Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;
.super Ljava/lang/Object;


# instance fields
.field private boxRequestTimeInterval__:I

.field private boxScreenSaverPoolSize__:I

.field private boxScreenSaverSerialAdCount__:I

.field private boxScreenSaverSerialNoadCount__:I

.field private boxStartupPoolSize__:I

.field private channelInfo__:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/InnerChannelInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBoxRequestTimeInterval__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxRequestTimeInterval__:I

    return v0
.end method

.method public getBoxScreenSaverPoolSize__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxScreenSaverPoolSize__:I

    return v0
.end method

.method public getBoxScreenSaverSerialAdCount__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxScreenSaverSerialAdCount__:I

    return v0
.end method

.method public getBoxScreenSaverSerialNoadCount__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxScreenSaverSerialNoadCount__:I

    return v0
.end method

.method public getBoxStartupPoolSize__()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxStartupPoolSize__:I

    return v0
.end method

.method public getChannelInfo__()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/InnerChannelInfo;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->channelInfo__:Ljava/util/List;

    return-object v0
.end method

.method public setBoxRequestTimeInterval__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxRequestTimeInterval__:I

    return-void
.end method

.method public setBoxScreenSaverPoolSize__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxScreenSaverPoolSize__:I

    return-void
.end method

.method public setBoxScreenSaverSerialAdCount__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxScreenSaverSerialAdCount__:I

    return-void
.end method

.method public setBoxScreenSaverSerialNoadCount__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxScreenSaverSerialNoadCount__:I

    return-void
.end method

.method public setBoxStartupPoolSize__(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->boxStartupPoolSize__:I

    return-void
.end method

.method public setChannelInfo__(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/InnerChannelInfo;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/beans/metadata/MagazinelockBoxPara;->channelInfo__:Ljava/util/List;

    return-void
.end method
