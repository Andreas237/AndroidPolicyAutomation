.class public Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;>;"
        }
    .end annotation
.end field


# instance fields
.field private mCommandID:I

.field private mDataContent:[B

.field private mDataLen:I

.field private mIdentify:Ljava/lang/String;

.field private mNeedAck:Z

.field private mNeedEncrypt:Z

.field private mPriority:I

.field private mServiceID:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 134
    new-instance v0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand$5;

    invoke-direct {v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand$5;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mPriority:I

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedAck:Z

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedEncrypt:Z

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 106
    const/4 v0, 0x0

    return v0
.end method

.method public getCommandID()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mCommandID:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDataContent()[B
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    iget-object v1, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    array-length v1, v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0

    .line 68
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDataLen()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataLen:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getNeedAck()Z
    .locals 1

    .line 85
    iget-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedAck:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getNeedEncrypt()Z
    .locals 1

    .line 93
    iget-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedEncrypt:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getPriority()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mPriority:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getServiceID()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mServiceID:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getmIdentify()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mIdentify:Ljava/lang/String;

    return-object v0
.end method

.method public procDeviceCommand1()V
    .locals 0

    .line 187
    return-void
.end method

.method public procDeviceCommand2()V
    .locals 0

    .line 188
    return-void
.end method

.method public procDeviceCommand3()V
    .locals 0

    .line 189
    return-void
.end method

.method public procDeviceCommand4()V
    .locals 0

    .line 190
    return-void
.end method

.method public procDeviceCommand5()V
    .locals 0

    .line 191
    return-void
.end method

.method public procDeviceCommand6()V
    .locals 0

    .line 192
    return-void
.end method

.method public procDeviceCommand7()V
    .locals 0

    .line 193
    return-void
.end method

.method public procDeviceCommand8()V
    .locals 0

    .line 194
    return-void
.end method

.method public procDeviceCommand9()V
    .locals 0

    .line 195
    return-void
.end method

.method public setCommandID(I)V
    .locals 1

    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mCommandID:I

    .line 44
    return-void
.end method

.method public setDataContent([B)V
    .locals 1

    .line 59
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 60
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    .line 62
    :cond_0
    return-void
.end method

.method public setDataLen(I)V
    .locals 1

    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataLen:I

    .line 52
    return-void
.end method

.method public setNeedAck(Z)V
    .locals 1

    .line 81
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedAck:Z

    .line 82
    return-void
.end method

.method public setNeedEncrypt(Z)V
    .locals 1

    .line 89
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedEncrypt:Z

    .line 90
    return-void
.end method

.method public setPriority(I)V
    .locals 1

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mPriority:I

    .line 74
    return-void
.end method

.method public setServiceID(I)V
    .locals 1

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mServiceID:I

    .line 36
    return-void
.end method

.method public setmIdentify(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mIdentify:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceCommand{serviceID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mServiceID:I

    .line 179
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", commandID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mCommandID:I

    .line 180
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataLen=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataLen:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    .line 182
    invoke-static {v1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 178
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 113
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mServiceID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mCommandID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataLen:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mIdentify:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 119
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 126
    iget-object v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mDataContent:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 129
    :cond_1
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mPriority:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    iget-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedAck:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 131
    iget-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->mNeedEncrypt:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 132
    return-void
.end method
