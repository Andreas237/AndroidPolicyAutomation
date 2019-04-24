.class public Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEVICE_CONNECTED:I = 0x2

.field public static final DEVICE_CONNECTING:I = 0x1

.field public static final DEVICE_DISCONNECTED:I = 0x3


# instance fields
.field private mBatteryLevel:I

.field private mConnectionStatus:I

.field private mDeviceID:Ljava/lang/String;

.field private mDeviceType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBatteryLevel()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mBatteryLevel:I

    return v0
.end method

.method public getConnectionStatus()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mConnectionStatus:I

    return v0
.end method

.method public getDeviceID()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mDeviceID:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mDeviceType:I

    return v0
.end method

.method public procWearDeviceInfo1()V
    .locals 0

    .line 86
    return-void
.end method

.method public procWearDeviceInfo2()V
    .locals 0

    .line 88
    return-void
.end method

.method public procWearDeviceInfo3()V
    .locals 0

    .line 90
    return-void
.end method

.method public procWearDeviceInfo4()V
    .locals 0

    .line 92
    return-void
.end method

.method public procWearDeviceInfo5()V
    .locals 0

    .line 94
    return-void
.end method

.method public setBatteryLevel(I)V
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mBatteryLevel:I

    .line 51
    return-void
.end method

.method public setConnectionStatus(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mConnectionStatus:I

    .line 37
    return-void
.end method

.method public setDeviceID(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mDeviceID:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setDeviceType(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->mDeviceType:I

    .line 79
    return-void
.end method

.method public toJsonString()Ljava/lang/String;
    .locals 1

    .line 82
    const-string v0, "TODO"

    return-object v0
.end method
