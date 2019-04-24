.class public Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;>;"
        }
    .end annotation
.end field

.field public static final DEVICE_TYPE_ESIM:I = 0x2

.field public static final DEVICE_TYPE_INVALID:I = 0x0

.field public static final DEVICE_TYPE_NO_MODEM:I = 0x3

.field public static final DEVICE_TYPE_SIM:I = 0x1

.field public static final RESULT_CODE_NOT_CONNECT:I = -0x2

.field public static final RESULT_CODE_NOT_SUPPORT:I = -0x3

.field public static final RESULT_CODE_SUCCESS:I = 0x1

.field public static final RESULT_CODE_UNKNOW:I = 0x0

.field public static final RESULT_CODE_USER_REJECT:I = -0x1


# instance fields
.field private mDeviceIMEI:Ljava/lang/String;

.field private mDeviceSerialNumber:Ljava/lang/String;

.field private mDeviceType:I

.field private mEID:Ljava/lang/String;

.field private mProductName:Ljava/lang/String;

.field private mResultCode:I

.field private mSimInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 153
    new-instance v0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo$5;

    invoke-direct {v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mProductName:Ljava/lang/String;

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mEID:Ljava/lang/String;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    .line 31
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    .line 32
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mProductName:Ljava/lang/String;

    .line 34
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mEID:Ljava/lang/String;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mResultCode:I

    .line 44
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    .line 45
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mProductName:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mEID:Ljava/lang/String;

    .line 49
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    sget-object v1, Lcom/huawei/multisimservice/model/SimInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readTypedList(Ljava/util/List;Landroid/os/Parcelable$Creator;)V

    .line 53
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 139
    const/4 v0, 0x0

    return v0
.end method

.method public getActiveSimProfileInfo()Lcom/huawei/multisimservice/model/SimInfo;
    .locals 6

    .line 122
    const/4 v2, 0x0

    .line 124
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 126
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 127
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/multisimservice/model/SimInfo;

    .line 128
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/multisimservice/model/SimInfo;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    move-object v2, v3

    .line 130
    goto :goto_1

    .line 126
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 134
    :cond_1
    :goto_1
    return-object v2
.end method

.method public getDeviceID()Ljava/lang/String;
    .locals 2

    .line 112
    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    return-object v0

    .line 114
    :cond_1
    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 115
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    return-object v0

    .line 117
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceIMEI()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceSerialNumber()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    return v0
.end method

.method public getEID()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mEID:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mProductName:Ljava/lang/String;

    return-object v0
.end method

.method public getResultCode()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mResultCode:I

    return v0
.end method

.method public getSimInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    return-object v0
.end method

.method public setDeviceIMEI(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setDeviceSerialNumber(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public setDeviceType(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    .line 69
    return-void
.end method

.method public setEID(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mEID:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mProductName:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setResultCode(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mResultCode:I

    .line 61
    return-void
.end method

.method public setSimInfoList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .line 108
    iput-object p1, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    .line 109
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 144
    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mResultCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 145
    iget v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 146
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceIMEI:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mDeviceSerialNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mProductName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mEID:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->mSimInfoList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 151
    return-void
.end method
