.class public Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field createTime:J

.field detailUri:Ljava/lang/String;

.field expireTime:Ljava/lang/String;

.field flag:I

.field from:Ljava/lang/String;

.field heatMapCity:Ljava/lang/String;

.field imgBigUri:Ljava/lang/String;

.field imgIosBigScreenUri:Ljava/lang/String;

.field imgIosSmallScreenUri:Ljava/lang/String;

.field imgUri:Ljava/lang/String;

.field infoClassify:Ljava/lang/String;

.field infoRecommend:I

.field layout:I

.field messageExtList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation
.end field

.field msgContext:Ljava/lang/String;

.field msgDevice:Ljava/lang/String;

.field msgId:Ljava/lang/String;

.field msgMaterial:I

.field msgPosition:I

.field msgTitle:Ljava/lang/String;

.field msgType:I

.field msgUserLable:Ljava/lang/String;

.field pageType:I

.field position:Ljava/lang/String;

.field readFlag:I

.field weight:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/16 v0, 0xb

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgPosition:I

    .line 85
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgId:Ljava/lang/String;

    .line 86
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgType:I

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->flag:I

    .line 88
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->weight:I

    .line 89
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgTitle:Ljava/lang/String;

    .line 90
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgContext:Ljava/lang/String;

    .line 91
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->createTime:J

    .line 92
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->expireTime:Ljava/lang/String;

    .line 93
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgUri:Ljava/lang/String;

    .line 94
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgBigUri:Ljava/lang/String;

    .line 95
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->detailUri:Ljava/lang/String;

    .line 96
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->from:Ljava/lang/String;

    .line 97
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->position:Ljava/lang/String;

    .line 98
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgDevice:Ljava/lang/String;

    .line 99
    const/16 v0, 0xb

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgPosition:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgMaterial:I

    .line 101
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoClassify:Ljava/lang/String;

    .line 102
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->heatMapCity:Ljava/lang/String;

    .line 103
    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 226
    iget-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->createTime:J

    return-wide v0
.end method

.method public getDetailUri()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->detailUri:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireTime()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->expireTime:Ljava/lang/String;

    return-object v0
.end method

.method public getFlag()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->flag:I

    return v0
.end method

.method public getFrom()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->from:Ljava/lang/String;

    return-object v0
.end method

.method public getHeatMapCity()Ljava/lang/String;
    .locals 1

    .line 275
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->heatMapCity:Ljava/lang/String;

    return-object v0
.end method

.method public getImgBigUri()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgBigUri:Ljava/lang/String;

    return-object v0
.end method

.method public getImgIosBigScreenUri()Ljava/lang/String;
    .locals 1

    .line 178
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgIosBigScreenUri:Ljava/lang/String;

    return-object v0
.end method

.method public getImgIosSmallScreenUri()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgIosSmallScreenUri:Ljava/lang/String;

    return-object v0
.end method

.method public getImgUri()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgUri:Ljava/lang/String;

    return-object v0
.end method

.method public getInfoClassify()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoClassify:Ljava/lang/String;

    return-object v0
.end method

.method public getInfoRecommend()I
    .locals 1

    .line 259
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoRecommend:I

    return v0
.end method

.method public getLayout()I
    .locals 1

    .line 299
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->layout:I

    return v0
.end method

.method public getMessageExtList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->messageExtList:Ljava/util/List;

    return-object v0
.end method

.method public getMsgContext()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgContext:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgDevice()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgDevice:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgId()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgId:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgMaterial()I
    .locals 1

    .line 267
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgMaterial:I

    return v0
.end method

.method public getMsgPosition()I
    .locals 1

    .line 251
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgPosition:I

    return v0
.end method

.method public getMsgTitle()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgType()I
    .locals 1

    .line 114
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgType:I

    return v0
.end method

.method public getMsgUserLable()Ljava/lang/String;
    .locals 1

    .line 283
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgUserLable:Ljava/lang/String;

    return-object v0
.end method

.method public getPageType()I
    .locals 1

    .line 307
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->pageType:I

    return v0
.end method

.method public getPosition()Ljava/lang/String;
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->position:Ljava/lang/String;

    return-object v0
.end method

.method public getReadFlag()I
    .locals 1

    .line 210
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->readFlag:I

    return v0
.end method

.method public getWeight()I
    .locals 1

    .line 154
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->weight:I

    return v0
.end method

.method public init()V
    .locals 0

    .line 347
    return-void
.end method

.method public init1()V
    .locals 0

    .line 348
    return-void
.end method

.method public init2()V
    .locals 0

    .line 349
    return-void
.end method

.method public init3()V
    .locals 0

    .line 350
    return-void
.end method

.method public init4()V
    .locals 0

    .line 351
    return-void
.end method

.method public init5()V
    .locals 0

    .line 352
    return-void
.end method

.method public init6()V
    .locals 0

    .line 353
    return-void
.end method

.method public init7()V
    .locals 0

    .line 354
    return-void
.end method

.method public init8()V
    .locals 0

    .line 355
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 230
    iput-wide p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->createTime:J

    .line 231
    return-void
.end method

.method public setDetailUri(Ljava/lang/String;)V
    .locals 0

    .line 206
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->detailUri:Ljava/lang/String;

    .line 207
    return-void
.end method

.method public setExpireTime(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->expireTime:Ljava/lang/String;

    .line 135
    return-void
.end method

.method public setFlag(I)V
    .locals 0

    .line 142
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->flag:I

    .line 143
    return-void
.end method

.method public setFrom(Ljava/lang/String;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->from:Ljava/lang/String;

    .line 199
    return-void
.end method

.method public setHeatMapCity(Ljava/lang/String;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->heatMapCity:Ljava/lang/String;

    .line 280
    return-void
.end method

.method public setImgBigUri(Ljava/lang/String;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgBigUri:Ljava/lang/String;

    .line 191
    return-void
.end method

.method public setImgIosBigScreenUri(Ljava/lang/String;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgIosBigScreenUri:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setImgIosSmallScreenUri(Ljava/lang/String;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgIosSmallScreenUri:Ljava/lang/String;

    .line 175
    return-void
.end method

.method public setImgUri(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgUri:Ljava/lang/String;

    .line 167
    return-void
.end method

.method public setInfoClassify(Ljava/lang/String;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoClassify:Ljava/lang/String;

    .line 223
    return-void
.end method

.method public setInfoRecommend(I)V
    .locals 0

    .line 263
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoRecommend:I

    .line 264
    return-void
.end method

.method public setLayout(I)V
    .locals 0

    .line 303
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->layout:I

    .line 304
    return-void
.end method

.method public setMessageExtList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;)V"
        }
    .end annotation

    .line 295
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->messageExtList:Ljava/util/List;

    .line 296
    return-void
.end method

.method public setMsgContext(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgContext:Ljava/lang/String;

    .line 151
    return-void
.end method

.method public setMsgDevice(Ljava/lang/String;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgDevice:Ljava/lang/String;

    .line 247
    return-void
.end method

.method public setMsgId(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgId:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setMsgMaterial(I)V
    .locals 0

    .line 271
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgMaterial:I

    .line 272
    return-void
.end method

.method public setMsgPosition(I)V
    .locals 0

    .line 255
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgPosition:I

    .line 256
    return-void
.end method

.method public setMsgTitle(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgTitle:Ljava/lang/String;

    .line 127
    return-void
.end method

.method public setMsgType(I)V
    .locals 0

    .line 118
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgType:I

    .line 119
    return-void
.end method

.method public setMsgUserLable(Ljava/lang/String;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgUserLable:Ljava/lang/String;

    .line 288
    return-void
.end method

.method public setPageType(I)V
    .locals 0

    .line 311
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->pageType:I

    .line 312
    return-void
.end method

.method public setPosition(Ljava/lang/String;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->position:Ljava/lang/String;

    .line 239
    return-void
.end method

.method public setReadFlag(I)V
    .locals 0

    .line 214
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->readFlag:I

    .line 215
    return-void
.end method

.method public setWeight(I)V
    .locals 0

    .line 158
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->weight:I

    .line 159
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CloudMessageObject{msgId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->expireTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContext=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->weight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgBigUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgBigUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgIosBigScreenUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgIosBigScreenUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgIosSmallScreenUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->imgIosSmallScreenUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detailUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->detailUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", from=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->from:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", readFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->readFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", position=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->position:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgDevice=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgDevice:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgPosition:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgMaterial="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgMaterial:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", infoClassify=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoClassify:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", heatMapCity=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->heatMapCity:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", infoRecommend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->infoRecommend:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgUserLable=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->msgUserLable:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", layout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->layout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", messageExtList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->messageExtList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pageType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/CloudMessageObject;->pageType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
