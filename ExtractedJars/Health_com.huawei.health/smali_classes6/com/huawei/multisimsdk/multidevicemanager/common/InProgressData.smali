.class public Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;>;"
        }
    .end annotation
.end field


# instance fields
.field private deviceid:Ljava/lang/String;

.field private mWebViewData:Lo/drw;

.field private multiSIMServiceInfo:Lo/dqy;

.field private nikename:Ljava/lang/String;

.field private postdata:Ljava/lang/String;

.field private primary:Ljava/lang/String;

.field private primaryIDtype:Ljava/lang/String;

.field private resultcode:I

.field private rsn:I

.field private secondaryDeviceId:Lo/drc;

.field private secondaryID:Ljava/lang/String;

.field private secondarytype:Ljava/lang/String;

.field private serviceType:Ljava/lang/String;

.field private time:I

.field private type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 164
    new-instance v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;

    invoke-direct {v0}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;-><init>()V

    sput-object v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->multiSIMServiceInfo:Lo/dqy;

    .line 148
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->multiSIMServiceInfo:Lo/dqy;

    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primary:Ljava/lang/String;

    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondaryID:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondarytype:Ljava/lang/String;

    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->nikename:Ljava/lang/String;

    .line 155
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->type:I

    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->rsn:I

    .line 157
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->serviceType:Ljava/lang/String;

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->deviceid:Ljava/lang/String;

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primaryIDtype:Ljava/lang/String;

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->time:I

    .line 161
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->postdata:Ljava/lang/String;

    .line 162
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData$2;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 129
    const/4 v0, 0x0

    return v0
.end method

.method public getDeviceid()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->deviceid:Ljava/lang/String;

    return-object v0
.end method

.method public getMultiSIMServiceInfo()Lo/dqy;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->multiSIMServiceInfo:Lo/dqy;

    return-object v0
.end method

.method public getNikename()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->nikename:Ljava/lang/String;

    return-object v0
.end method

.method public getPostdata()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->postdata:Ljava/lang/String;

    return-object v0
.end method

.method public getPrimary()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primary:Ljava/lang/String;

    return-object v0
.end method

.method public getPrimaryIDtype()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primaryIDtype:Ljava/lang/String;

    return-object v0
.end method

.method public getResultcode()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->resultcode:I

    return v0
.end method

.method public getRsn()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->rsn:I

    return v0
.end method

.method public getSecondaryDeviceId()Lo/drc;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondaryDeviceId:Lo/drc;

    return-object v0
.end method

.method public getSecondaryID()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondaryID:Ljava/lang/String;

    return-object v0
.end method

.method public getSecondarytype()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondarytype:Ljava/lang/String;

    return-object v0
.end method

.method public getServiceType()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->serviceType:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()I
    .locals 1

    .line 177
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->time:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->type:I

    return v0
.end method

.method public getWebViewData()Lo/drw;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->mWebViewData:Lo/drw;

    return-object v0
.end method

.method public setDeviceid(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->deviceid:Ljava/lang/String;

    .line 117
    return-void
.end method

.method public setMultiSIMServiceInfo(Lo/dqy;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->multiSIMServiceInfo:Lo/dqy;

    .line 93
    return-void
.end method

.method public setNikename(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->nikename:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setPostdata(Ljava/lang/String;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->postdata:Ljava/lang/String;

    .line 190
    return-void
.end method

.method public setPrimary(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primary:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setPrimaryIDtype(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primaryIDtype:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setResultcode(I)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->resultcode:I

    .line 101
    return-void
.end method

.method public setRsn(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->rsn:I

    .line 85
    return-void
.end method

.method public setSecondaryDeviceId(Lo/drc;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondaryDeviceId:Lo/drc;

    .line 29
    return-void
.end method

.method public setSecondaryID(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondaryID:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public setSecondarytype(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondarytype:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setServiceType(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->serviceType:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setTime(I)V
    .locals 0

    .line 181
    iput p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->time:I

    .line 182
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->type:I

    .line 77
    return-void
.end method

.method public setWebViewData(Lo/drw;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->mWebViewData:Lo/drw;

    .line 37
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primary:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondaryID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->secondarytype:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->nikename:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 139
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->rsn:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->serviceType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->deviceid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->primaryIDtype:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 143
    iget v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 144
    iget-object v0, p0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;->postdata:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    return-void
.end method
