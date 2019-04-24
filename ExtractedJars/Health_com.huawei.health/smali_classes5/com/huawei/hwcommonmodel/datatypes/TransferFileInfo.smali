.class public Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private callback:Ljava/lang/Object;

.field private deviceMac:Ljava/lang/String;

.field private deviceType:I

.field private deviceVersion:Ljava/lang/String;

.field private dfxLogType:I

.field private endTime:I

.field private gpsType:I

.field private isFromAbout:I

.field private isUploadAppLog:I

.field private level:I

.field private priority:I

.field private recordId:[I

.field private startTime:I

.field private suspend:I

.field private taskType:I

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 197
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo$1;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo$1;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->dfxLogType:I

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isFromAbout:I

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isUploadAppLog:I

    .line 30
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->priority:I

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->suspend:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->taskType:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 174
    const/4 v0, 0x0

    return v0
.end method

.method public getCallback()Ljava/lang/Object;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->callback:Ljava/lang/Object;

    return-object v0
.end method

.method public getDeviceMac()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceMac:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()I
    .locals 1

    .line 109
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceType:I

    return v0
.end method

.method public getDeviceVersion()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getDfxLogType()I
    .locals 1

    .line 117
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->dfxLogType:I

    return v0
.end method

.method public getEndTime()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->endTime:I

    return v0
.end method

.method public getGpsType()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->gpsType:I

    return v0
.end method

.method public getIsFromAbout()I
    .locals 1

    .line 125
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isFromAbout:I

    return v0
.end method

.method public getIsUploadAppLog()I
    .locals 1

    .line 133
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isUploadAppLog:I

    return v0
.end method

.method public getLevel()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->level:I

    return v0
.end method

.method public getPriority()I
    .locals 1

    .line 141
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->priority:I

    return v0
.end method

.method public getRecordId()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 45
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->recordId:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->recordId:[I

    aget v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 49
    :cond_0
    return-object v1
.end method

.method public getStartTime()I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->startTime:I

    return v0
.end method

.method public getSuspend()I
    .locals 1

    .line 149
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->suspend:I

    return v0
.end method

.method public getTaskType()I
    .locals 1

    .line 157
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->taskType:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->type:I

    return v0
.end method

.method public setCallback(Ljava/lang/Object;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->callback:Ljava/lang/Object;

    .line 170
    return-void
.end method

.method public setDeviceMac(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceMac:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public setDeviceType(I)V
    .locals 0

    .line 113
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceType:I

    .line 114
    return-void
.end method

.method public setDeviceVersion(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceVersion:Ljava/lang/String;

    .line 106
    return-void
.end method

.method public setDfxLogType(I)V
    .locals 0

    .line 121
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->dfxLogType:I

    .line 122
    return-void
.end method

.method public setEndTime(I)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->endTime:I

    .line 82
    return-void
.end method

.method public setGpsType(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->gpsType:I

    .line 66
    return-void
.end method

.method public setIsFromAbout(I)V
    .locals 0

    .line 129
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isFromAbout:I

    .line 130
    return-void
.end method

.method public setIsUploadAppLog(I)V
    .locals 0

    .line 137
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isUploadAppLog:I

    .line 138
    return-void
.end method

.method public setLevel(I)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->level:I

    .line 90
    return-void
.end method

.method public setPriority(I)V
    .locals 0

    .line 145
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->priority:I

    .line 146
    return-void
.end method

.method public setRecordId(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 53
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    .line 54
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 55
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v1, v2

    .line 54
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_0
    iput-object v1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->recordId:[I

    .line 58
    return-void
.end method

.method public setStartTime(I)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->startTime:I

    .line 74
    return-void
.end method

.method public setSuspend(I)V
    .locals 0

    .line 153
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->suspend:I

    .line 154
    return-void
.end method

.method public setTaskType(I)V
    .locals 0

    .line 161
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->taskType:I

    .line 162
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->type:I

    .line 42
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 179
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 180
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->recordId:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 181
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->gpsType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 182
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->startTime:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 183
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->endTime:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 184
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->level:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 185
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceMac:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 187
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->deviceType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 188
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->dfxLogType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 189
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isFromAbout:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 190
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->isUploadAppLog:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 191
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->priority:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 192
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->suspend:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->taskType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 195
    return-void
.end method
