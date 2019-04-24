.class public Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;
.super Ljava/lang/Object;


# instance fields
.field private channelId:Ljava/lang/String;

.field private channelName:Ljava/lang/String;

.field private slotId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->channelId:Ljava/lang/String;

    return-object v0
.end method

.method public getChannelName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->channelName:Ljava/lang/String;

    return-object v0
.end method

.method public getSlotId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->slotId:Ljava/lang/String;

    return-object v0
.end method

.method public setChannelId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->channelId:Ljava/lang/String;

    return-void
.end method

.method public setChannelName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->channelName:Ljava/lang/String;

    return-void
.end method

.method public setSlotId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->slotId:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ChannelInfo [channelId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->channelId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", channelName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->channelName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", slotId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/data/ChannelInfo;->slotId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
