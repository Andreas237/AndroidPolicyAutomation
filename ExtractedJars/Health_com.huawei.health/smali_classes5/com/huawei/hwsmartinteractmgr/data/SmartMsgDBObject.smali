.class public Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;>;"
        }
    .end annotation
.end field


# instance fields
.field Id:I

.field createTime:J

.field expireTime:J

.field huid:Ljava/lang/String;

.field msgContent:Ljava/lang/String;

.field msgContentType:I

.field msgId:I

.field msgSrc:I

.field msgType:I

.field priority:I

.field showCount:I

.field showMethod:Ljava/lang/String;

.field showTime:Ljava/lang/String;

.field status:I

.field updateTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 242
    new-instance v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject$1;

    invoke-direct {v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject$1;-><init>()V

    sput-object v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 254
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 259
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->Id:I

    .line 260
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgId:I

    .line 261
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgType:I

    .line 262
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgSrc:I

    .line 263
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContentType:I

    .line 264
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContent:Ljava/lang/String;

    .line 265
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showMethod:Ljava/lang/String;

    .line 266
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->createTime:J

    .line 267
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->updateTime:J

    .line 268
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->expireTime:J

    .line 269
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->status:I

    .line 270
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->huid:Ljava/lang/String;

    .line 272
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 239
    const/4 v0, 0x0

    return v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 136
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->createTime:J

    return-wide v0
.end method

.method public getExpireTime()J
    .locals 2

    .line 152
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->expireTime:J

    return-wide v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->Id:I

    return v0
.end method

.method public getMsgContent()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContent:Ljava/lang/String;

    return-object v0
.end method

.method public getMsgContentType()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContentType:I

    return v0
.end method

.method public getMsgId()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgId:I

    return v0
.end method

.method public getMsgSrc()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgSrc:I

    return v0
.end method

.method public getMsgType()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgType:I

    return v0
.end method

.method public getPriority()I
    .locals 1

    .line 185
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->priority:I

    return v0
.end method

.method public getShowCount()I
    .locals 1

    .line 193
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showCount:I

    return v0
.end method

.method public getShowMethod()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showMethod:Ljava/lang/String;

    return-object v0
.end method

.method public getShowTime()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showTime:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .line 168
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->status:I

    return v0
.end method

.method public getUpdateTime()J
    .locals 2

    .line 144
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->updateTime:J

    return-wide v0
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 140
    iput-wide p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->createTime:J

    .line 141
    return-void
.end method

.method public setExpireTime(J)V
    .locals 0

    .line 156
    iput-wide p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->expireTime:J

    .line 157
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->huid:Ljava/lang/String;

    .line 181
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->Id:I

    .line 86
    return-void
.end method

.method public setMsgContent(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContent:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setMsgContentType(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContentType:I

    .line 117
    return-void
.end method

.method public setMsgId(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgId:I

    .line 93
    return-void
.end method

.method public setMsgSrc(I)V
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgSrc:I

    .line 109
    return-void
.end method

.method public setMsgType(I)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgType:I

    .line 101
    return-void
.end method

.method public setPriority(I)V
    .locals 0

    .line 189
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->priority:I

    .line 190
    return-void
.end method

.method public setShowCount(I)V
    .locals 0

    .line 197
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showCount:I

    .line 198
    return-void
.end method

.method public setShowMethod(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showMethod:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setShowTime(Ljava/lang/String;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showTime:Ljava/lang/String;

    .line 165
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 172
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->status:I

    .line 173
    return-void
.end method

.method public setUpdateTime(J)V
    .locals 0

    .line 148
    iput-wide p1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->updateTime:J

    .line 149
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 202
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SmartMsgDBObject{Id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->Id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgSrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgSrc:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContentType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showMethod=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showMethod:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", createTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->updateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->expireTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->huid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->priority:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 277
    return-void
.end method

.method public uadpDC10()V
    .locals 0

    .line 313
    return-void
.end method

.method public uadpDC11()V
    .locals 0

    .line 317
    return-void
.end method

.method public uadpDC12()V
    .locals 0

    .line 321
    return-void
.end method

.method public uadpDC13()V
    .locals 0

    .line 325
    return-void
.end method

.method public uadpDC14()V
    .locals 0

    .line 329
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 281
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 285
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 289
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 293
    return-void
.end method

.method public uadpDC6()V
    .locals 0

    .line 297
    return-void
.end method

.method public uadpDC7()V
    .locals 0

    .line 301
    return-void
.end method

.method public uadpDC8()V
    .locals 0

    .line 305
    return-void
.end method

.method public uadpDC9()V
    .locals 0

    .line 309
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 223
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->Id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 224
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 225
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgSrc:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 227
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContentType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 228
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->msgContent:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->showMethod:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 230
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->createTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 231
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->updateTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 232
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->expireTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 233
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->status:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->huid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 235
    return-void
.end method
