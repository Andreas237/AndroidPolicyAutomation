.class public Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pluginmessagecenter/provider/data/IMessageObject;


# instance fields
.field createTime:J

.field detailUri:Ljava/lang/String;

.field detailUriExt:Ljava/lang/String;

.field expireTime:J

.field flag:I

.field heatMapCity:Ljava/lang/String;

.field huid:Ljava/lang/String;

.field imei:Ljava/lang/String;

.field imgBigUri:Ljava/lang/String;

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

.field metadata:Ljava/lang/String;

.field module:Ljava/lang/String;

.field msgContent:Ljava/lang/String;

.field msgFrom:Ljava/lang/String;

.field msgId:Ljava/lang/String;

.field msgPosition:I

.field msgTitle:Ljava/lang/String;

.field msgType:I

.field msgUserLable:Ljava/lang/String;

.field notified:I

.field pageType:I

.field position:I

.field readFlag:I

.field receiveTime:J

.field type:Ljava/lang/String;

.field weight:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgId:Ljava/lang/String;

    .line 98
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->module:Ljava/lang/String;

    .line 99
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->type:Ljava/lang/String;

    .line 100
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->metadata:Ljava/lang/String;

    .line 101
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgType:I

    .line 102
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->flag:I

    .line 103
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->weight:I

    .line 104
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgTitle:Ljava/lang/String;

    .line 105
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgContent:Ljava/lang/String;

    .line 106
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->createTime:J

    .line 107
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/32 v2, 0x57b12c00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->expireTime:J

    .line 108
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgUri:Ljava/lang/String;

    .line 109
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgBigUri:Ljava/lang/String;

    .line 110
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUri:Ljava/lang/String;

    .line 111
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUriExt:Ljava/lang/String;

    .line 112
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgFrom:Ljava/lang/String;

    .line 113
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->position:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgPosition:I

    .line 115
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->huid:Ljava/lang/String;

    .line 116
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imei:Ljava/lang/String;

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->notified:I

    .line 118
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoClassify:Ljava/lang/String;

    .line 119
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->heatMapCity:Ljava/lang/String;

    .line 120
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoRecommend:I

    .line 121
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgUserLable:Ljava/lang/String;

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->pageType:I

    .line 123
    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 199
    iget-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->createTime:J

    return-wide v0
.end method

.method public getDetailUri()Ljava/lang/String;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUri:Ljava/lang/String;

    return-object v0
.end method

.method public getDetailUriExt()Ljava/lang/String;
    .locals 1

    .line 248
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUriExt:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireTime()J
    .locals 2

    .line 208
    iget-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->expireTime:J

    return-wide v0
.end method

.method public getFlag()I
    .locals 1

    .line 158
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->flag:I

    return v0
.end method

.method public getHeatMapCity()Ljava/lang/String;
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->heatMapCity:Ljava/lang/String;

    return-object v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imei:Ljava/lang/String;

    return-object v0
.end method

.method public getImgBigUri()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgBigUri:Ljava/lang/String;

    return-object v0
.end method

.method public getImgUri()Ljava/lang/String;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgUri:Ljava/lang/String;

    return-object v0
.end method

.method public getInfoClassify()Ljava/lang/String;
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoClassify:Ljava/lang/String;

    return-object v0
.end method

.method public getInfoRecommend()I
    .locals 1

    .line 336
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoRecommend:I

    return v0
.end method

.method public getLayout()I
    .locals 1

    .line 344
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->layout:I

    return v0
.end method

.method public getMessageExtList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation

    .line 352
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->messageExtList:Ljava/util/List;

    return-object v0
.end method

.method public getMetadata()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->metadata:Ljava/lang/String;

    return-object v0
.end method

.method public getModule()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->module:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgContent()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgContent:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgFrom()Ljava/lang/String;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgFrom:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgId()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgId:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgPosition()I
    .locals 1

    .line 272
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgPosition:I

    return v0
.end method

.method public getMsgTitle()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgType()I
    .locals 1

    .line 166
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgType:I

    return v0
.end method

.method public getMsgUserLable()Ljava/lang/String;
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgUserLable:Ljava/lang/String;

    return-object v0
.end method

.method public getNotified()I
    .locals 1

    .line 304
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->notified:I

    return v0
.end method

.method public getPageType()I
    .locals 1

    .line 359
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->pageType:I

    return v0
.end method

.method public getPosition()I
    .locals 1

    .line 264
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->position:I

    return v0
.end method

.method public getReadFlag()I
    .locals 1

    .line 296
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->readFlag:I

    return v0
.end method

.method public getReceiveTime()J
    .locals 2

    .line 216
    iget-wide v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->receiveTime:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getWeight()I
    .locals 1

    .line 182
    iget v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->weight:I

    return v0
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 203
    iput-wide p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->createTime:J

    .line 204
    return-void
.end method

.method public setDetailUri(Ljava/lang/String;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUri:Ljava/lang/String;

    .line 245
    return-void
.end method

.method public setDetailUriExt(Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUriExt:Ljava/lang/String;

    .line 253
    return-void
.end method

.method public setExpireTime(J)V
    .locals 0

    .line 212
    iput-wide p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->expireTime:J

    .line 213
    return-void
.end method

.method public setFlag(I)V
    .locals 0

    .line 162
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->flag:I

    .line 163
    return-void
.end method

.method public setHeatMapCity(Ljava/lang/String;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->heatMapCity:Ljava/lang/String;

    .line 325
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->huid:Ljava/lang/String;

    .line 285
    return-void
.end method

.method public setImei(Ljava/lang/String;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imei:Ljava/lang/String;

    .line 293
    return-void
.end method

.method public setImgBigUri(Ljava/lang/String;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgBigUri:Ljava/lang/String;

    .line 237
    return-void
.end method

.method public setImgUri(Ljava/lang/String;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgUri:Ljava/lang/String;

    .line 229
    return-void
.end method

.method public setInfoClassify(Ljava/lang/String;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoClassify:Ljava/lang/String;

    .line 317
    return-void
.end method

.method public setInfoRecommend(I)V
    .locals 0

    .line 340
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoRecommend:I

    .line 341
    return-void
.end method

.method public setLayout(I)V
    .locals 0

    .line 348
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->layout:I

    .line 349
    return-void
.end method

.method public setMessageExtList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;)V"
        }
    .end annotation

    .line 356
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->messageExtList:Ljava/util/List;

    .line 357
    return-void
.end method

.method public setMetadata(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->metadata:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public setModule(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->module:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public setMsgContent(Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgContent:Ljava/lang/String;

    .line 195
    return-void
.end method

.method public setMsgFrom(Ljava/lang/String;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgFrom:Ljava/lang/String;

    .line 261
    return-void
.end method

.method public setMsgId(Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgId:Ljava/lang/String;

    .line 131
    return-void
.end method

.method public setMsgPosition(I)V
    .locals 0

    .line 276
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgPosition:I

    .line 277
    return-void
.end method

.method public setMsgTitle(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgTitle:Ljava/lang/String;

    .line 179
    return-void
.end method

.method public setMsgType(I)V
    .locals 0

    .line 170
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgType:I

    .line 171
    return-void
.end method

.method public setMsgUserLable(Ljava/lang/String;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgUserLable:Ljava/lang/String;

    .line 333
    return-void
.end method

.method public setNotified(I)V
    .locals 0

    .line 308
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->notified:I

    .line 309
    return-void
.end method

.method public setPageType(I)V
    .locals 0

    .line 363
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->pageType:I

    .line 364
    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 268
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->position:I

    .line 269
    return-void
.end method

.method public setReadFlag(I)V
    .locals 0

    .line 300
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->readFlag:I

    .line 301
    return-void
.end method

.method public setReceiveTime(J)V
    .locals 0

    .line 220
    iput-wide p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->receiveTime:J

    .line 221
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->type:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public setWeight(I)V
    .locals 0

    .line 186
    iput p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->weight:I

    .line 187
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MessageObject{msgId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", module=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->module:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metadata=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->metadata:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->weight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->expireTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", receiveTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->receiveTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgBigUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->imgBigUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detailUri=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detailUriExt=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->detailUriExt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgFrom=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgFrom:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->position:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgPosition:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", readFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->readFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", notified="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->notified:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", infoClassify=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoClassify:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", heatMapCity=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->heatMapCity:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", infoRecommend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->infoRecommend:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgUserLable=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->msgUserLable:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", layout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->layout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", messageExtList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->messageExtList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pageType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->pageType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
