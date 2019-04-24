.class public abstract Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;
    }
.end annotation


# static fields
.field public static final NOTIFY_ON:I = 0x1


# instance fields
.field private channel:Ljava/lang/String;

.field private chatType:Lorg/jivesoftware/smack/packet/Message$Type;

.field private msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

.field private notify:I

.field private packetID:Ljava/lang/String;

.field private preseq:J

.field private receiver:Ljava/lang/String;

.field private referTo:Ljava/lang/String;

.field private sendTime:J

.field private sender:Ljava/lang/String;

.field private seq:J


# direct methods
.method protected constructor <init>()V
    .locals 2

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    .line 70
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    .line 75
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    .line 90
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->notify:I

    .line 215
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 223
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    .line 70
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    .line 75
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    .line 90
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->notify:I

    .line 224
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sender:Ljava/lang/String;

    .line 225
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->receiver:Ljava/lang/String;

    .line 226
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/jivesoftware/smack/packet/Message$Type;->fromString(Ljava/lang/String;)Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 230
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->packetID:Ljava/lang/String;

    .line 231
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sendTime:J

    .line 232
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    .line 233
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    .line 234
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->referTo:Ljava/lang/String;

    .line 236
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->b(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    .line 237
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 270
    const/4 v0, 0x0

    return v0
.end method

.method public getChannel()Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    .line 127
    return-object v0
.end method

.method public getChatType()Lorg/jivesoftware/smack/packet/Message$Type;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 138
    return-object v0
.end method

.method public getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    .line 193
    return-object v0
.end method

.method public getNotify()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->notify:I

    return v0
.end method

.method public getPacketID()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->packetID:Ljava/lang/String;

    .line 149
    return-object v0
.end method

.method public getPreseq()J
    .locals 2

    .line 170
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    .line 171
    return-wide v0
.end method

.method public getReceiver()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->receiver:Ljava/lang/String;

    .line 116
    return-object v0
.end method

.method public getReferTo()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->referTo:Ljava/lang/String;

    .line 182
    return-object v0
.end method

.method public getSendTime()J
    .locals 2

    .line 203
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sendTime:J

    .line 204
    return-wide v0
.end method

.method public getSender()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sender:Ljava/lang/String;

    .line 105
    return-object v0
.end method

.method public getSeq()J
    .locals 2

    .line 159
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    .line 160
    return-wide v0
.end method

.method public setChannel(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setChatType(Lorg/jivesoftware/smack/packet/Message$Type;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 144
    return-void
.end method

.method public setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    .line 199
    return-void
.end method

.method public setNotify(I)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->notify:I

    .line 100
    return-void
.end method

.method public setPacketID(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->packetID:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public setPreseq(J)V
    .locals 0

    .line 176
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    .line 177
    return-void
.end method

.method public setReceiver(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->receiver:Ljava/lang/String;

    .line 122
    return-void
.end method

.method public setReferTo(Ljava/lang/String;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->referTo:Ljava/lang/String;

    .line 188
    return-void
.end method

.method public setSendTime(J)V
    .locals 0

    .line 209
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sendTime:J

    .line 210
    return-void
.end method

.method public setSender(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sender:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setSeq(J)V
    .locals 0

    .line 165
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    .line 166
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 275
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SNSMessageBase{sender=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sender:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", receiver=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->receiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", channel=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chatType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", packetID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->packetID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sendTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sendTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", preseq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", referTo=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->referTo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", notify="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->notify:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sender:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->receiver:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->channel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    if-nez v0, :cond_0

    sget-object v0, Lorg/jivesoftware/smack/packet/Message$Type;->error:Lorg/jivesoftware/smack/packet/Message$Type;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    :goto_0
    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    .line 254
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->chatType:Lorg/jivesoftware/smack/packet/Message$Type;

    invoke-virtual {v0}, Lorg/jivesoftware/smack/packet/Message$Type;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 256
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->packetID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 257
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->sendTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 258
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->seq:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 259
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->preseq:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->referTo:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-nez v0, :cond_1

    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->a:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    :goto_1
    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    .line 264
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->msgType:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 265
    return-void
.end method
