.class public Lcom/huawei/hihealth/HiDeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field private static final BAND_PRODUCT:[Ljava/lang/Integer;

.field private static final BLOOD_SUGAR_PRODUCT:[Ljava/lang/Integer;

.field private static final BODY_FAT_PRODUCT:[Ljava/lang/Integer;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiDeviceInfo;>;"
        }
    .end annotation
.end field

.field private static final EARPHONE_PRODUCT:[Ljava/lang/Integer;

.field public static final MODEL_KEY:Ljava/lang/String; = "model"

.field private static final WATCH_PRODUCT:[Ljava/lang/Integer;


# instance fields
.field private deviceID:I

.field private deviceMac:Ljava/lang/String;

.field private deviceName:Ljava/lang/String;

.field private deviceSN:Ljava/lang/String;

.field private deviceType:I

.field private deviceUniqueCode:Ljava/lang/String;

.field private firmwareVersion:Ljava/lang/String;

.field private hardwareVersion:Ljava/lang/String;

.field private manufacturer:Ljava/lang/String;

.field private model:Ljava/lang/String;

.field private modifyTime:J

.field private priority:I

.field private softwareVersion:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 101
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    .line 102
    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 103
    const/16 v1, 0x4f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 104
    const/16 v1, 0x50

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 105
    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->WATCH_PRODUCT:[Ljava/lang/Integer;

    .line 106
    const/16 v0, 0xd

    new-array v0, v0, [Ljava/lang/Integer;

    .line 107
    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 108
    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 109
    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 110
    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 111
    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 112
    const/16 v1, 0x3d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 113
    const/16 v1, 0x3e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 114
    const/16 v1, 0x4d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 115
    const/16 v1, 0x51

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 116
    const/16 v1, 0x53

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 117
    const/16 v1, 0x4a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 118
    const/16 v1, 0x4c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    .line 119
    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->BAND_PRODUCT:[Ljava/lang/Integer;

    .line 120
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x34

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/16 v1, 0x4b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->EARPHONE_PRODUCT:[Ljava/lang/Integer;

    .line 121
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Integer;

    .line 122
    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 123
    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 124
    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 125
    const/16 v1, 0x38

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 126
    const/16 v1, 0x39

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 127
    const/16 v1, 0x49

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 128
    const/16 v1, 0x52

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->BODY_FAT_PRODUCT:[Ljava/lang/Integer;

    .line 130
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Integer;

    .line 131
    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 132
    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 133
    const/16 v1, 0x47

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 134
    const/16 v1, 0x48

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->BLOOD_SUGAR_PRODUCT:[Ljava/lang/Integer;

    .line 154
    new-instance v0, Lcom/huawei/hihealth/HiDeviceInfo$3;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDeviceInfo$3;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    .line 137
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    .line 140
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceID:I

    .line 141
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceUniqueCode:Ljava/lang/String;

    .line 142
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceName:Ljava/lang/String;

    .line 143
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    .line 144
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->firmwareVersion:Ljava/lang/String;

    .line 145
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->hardwareVersion:Ljava/lang/String;

    .line 146
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->softwareVersion:Ljava/lang/String;

    .line 147
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->manufacturer:Ljava/lang/String;

    .line 148
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->model:Ljava/lang/String;

    .line 149
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceSN:Ljava/lang/String;

    .line 150
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceMac:Ljava/lang/String;

    .line 151
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->priority:I

    .line 152
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 309
    const/4 v0, 0x0

    return v0
.end method

.method public getDeviceID()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceID:I

    return v0
.end method

.method public getDeviceInfoToODMF()Ljava/lang/String;
    .locals 5

    .line 221
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 223
    const-string v0, "DeviceName"

    :try_start_0
    iget-object v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 224
    const-string v0, "DeviceID"

    iget-object v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceUniqueCode:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    const-string v0, "DeviceType"

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 226
    const-string v0, "DeviceActiveTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 227
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 228
    :catch_0
    move-exception v4

    .line 229
    invoke-virtual {v4}, Lorg/json/JSONException;->printStackTrace()V

    .line 232
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceMac()Ljava/lang/String;
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceMac:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceSN()Ljava/lang/String;
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceSN:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()I
    .locals 1

    .line 191
    iget v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    return v0
.end method

.method public getDeviceTypeMapping()I
    .locals 2

    .line 205
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->WATCH_PRODUCT:[Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    const/4 v0, 0x0

    return v0

    .line 207
    :cond_0
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->BAND_PRODUCT:[Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    const/4 v0, 0x1

    return v0

    .line 209
    :cond_1
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->EARPHONE_PRODUCT:[Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 210
    const/4 v0, 0x2

    return v0

    .line 211
    :cond_2
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->BODY_FAT_PRODUCT:[Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 212
    const/4 v0, 0x3

    return v0

    .line 213
    :cond_3
    sget-object v0, Lcom/huawei/hihealth/HiDeviceInfo;->BLOOD_SUGAR_PRODUCT:[Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 214
    const/4 v0, 0x4

    return v0

    .line 216
    :cond_4
    const/4 v0, -0x1

    return v0
.end method

.method public getDeviceUniqueCode()Ljava/lang/String;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceUniqueCode:Ljava/lang/String;

    return-object v0
.end method

.method public getFirmwareVersion()Ljava/lang/String;
    .locals 1

    .line 236
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->firmwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getHardwareVersion()Ljava/lang/String;
    .locals 1

    .line 244
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getManufacturer()Ljava/lang/String;
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->manufacturer:Ljava/lang/String;

    return-object v0
.end method

.method public getModel()Ljava/lang/String;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->model:Ljava/lang/String;

    return-object v0
.end method

.method public getModifyTime()J
    .locals 2

    .line 304
    iget-wide v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->modifyTime:J

    return-wide v0
.end method

.method public getPriority()I
    .locals 1

    .line 292
    iget v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->priority:I

    return v0
.end method

.method public getSoftwareVersion()Ljava/lang/String;
    .locals 1

    .line 252
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->softwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 343
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 347
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 351
    return-void
.end method

.method public initFunctionD()V
    .locals 0

    .line 355
    return-void
.end method

.method public setDeviceID(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceID:I

    .line 172
    return-void
.end method

.method public setDeviceMac(Ljava/lang/String;)V
    .locals 0

    .line 288
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceMac:Ljava/lang/String;

    .line 289
    return-void
.end method

.method public setDeviceName(Ljava/lang/String;)V
    .locals 1

    .line 187
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceName:Ljava/lang/String;

    .line 188
    return-void
.end method

.method public setDeviceSN(Ljava/lang/String;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceSN:Ljava/lang/String;

    .line 281
    return-void
.end method

.method public setDeviceType(I)V
    .locals 1

    .line 195
    const/4 v0, 0x1

    if-ge p1, v0, :cond_0

    .line 196
    return-void

    .line 198
    :cond_0
    iput p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    .line 199
    return-void
.end method

.method public setDeviceUniqueCode(Ljava/lang/String;)V
    .locals 1

    .line 179
    invoke-static {p1}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceUniqueCode:Ljava/lang/String;

    .line 180
    return-void
.end method

.method public setFirmwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->firmwareVersion:Ljava/lang/String;

    .line 241
    return-void
.end method

.method public setHardwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->hardwareVersion:Ljava/lang/String;

    .line 249
    return-void
.end method

.method public setManufacturer(Ljava/lang/String;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->manufacturer:Ljava/lang/String;

    .line 265
    return-void
.end method

.method public setModel(Ljava/lang/String;)V
    .locals 0

    .line 272
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->model:Ljava/lang/String;

    .line 273
    return-void
.end method

.method public setModifyTime(J)V
    .locals 0

    .line 300
    iput-wide p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->modifyTime:J

    .line 301
    return-void
.end method

.method public setPriority(I)V
    .locals 0

    .line 296
    iput p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->priority:I

    .line 297
    return-void
.end method

.method public setSoftwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->softwareVersion:Ljava/lang/String;

    .line 257
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 314
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiDeviceInfo{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 315
    const-string v0, ", deviceName=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 316
    const-string v0, ", deviceType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 317
    const-string v0, ", priority="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiDeviceInfo;->priority:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 318
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 319
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 324
    iget v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 325
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceUniqueCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 326
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 327
    iget v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 328
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->firmwareVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->hardwareVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->softwareVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 331
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->manufacturer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->model:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceSN:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->deviceMac:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 335
    iget v0, p0, Lcom/huawei/hihealth/HiDeviceInfo;->priority:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 336
    return-void
.end method
