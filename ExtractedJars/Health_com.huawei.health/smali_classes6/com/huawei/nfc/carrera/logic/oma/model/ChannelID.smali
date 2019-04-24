.class public Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aid:Ljava/lang/String;

.field private channelType:I

.field private mediaType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->channelType:I

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->mediaType:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 59
    if-ne p0, p1, :cond_0

    .line 61
    const/4 v0, 0x1

    return v0

    .line 63
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 65
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 68
    :cond_2
    move-object v2, p1

    check-cast v2, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 70
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->channelType:I

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->channelType:I

    if-eq v0, v1, :cond_3

    .line 72
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_3
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->mediaType:I

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->mediaType:I

    if-eq v0, v1, :cond_4

    .line 76
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 80
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_5
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getAid()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getChannelType()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->channelType:I

    return v0
.end method

.method public getMediaType()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->mediaType:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 90
    :goto_0
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->channelType:I

    add-int v2, v0, v1

    .line 91
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->mediaType:I

    add-int v2, v0, v1

    .line 92
    return v2
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->aid:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public setChannelType(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->channelType:I

    .line 44
    return-void
.end method

.method public setMediaType(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;->mediaType:I

    .line 54
    return-void
.end method
