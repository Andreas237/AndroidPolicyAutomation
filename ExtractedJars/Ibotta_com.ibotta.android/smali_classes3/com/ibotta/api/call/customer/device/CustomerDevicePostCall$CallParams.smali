.class public Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerDevicePostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private customerId:I

.field private deviceGlobalId:Ljava/lang/String;

.field private deviceInfo:Ljava/lang/String;

.field private deviceType:Lcom/ibotta/api/call/customer/device/DeviceType;

.field private deviceUdid:Ljava/lang/String;

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerId()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->customerId:I

    return v0
.end method

.method public getDeviceGlobalId()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceGlobalId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceInfo()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()Lcom/ibotta/api/call/customer/device/DeviceType;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceType:Lcom/ibotta/api/call/customer/device/DeviceType;

    return-object v0
.end method

.method public getDeviceUdid()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceUdid:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->token:Ljava/lang/String;

    return-object v0
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 80
    iput p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->customerId:I

    return-void
.end method

.method public setDeviceGlobalId(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceGlobalId:Ljava/lang/String;

    return-void
.end method

.method public setDeviceInfo(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceInfo:Ljava/lang/String;

    return-void
.end method

.method public setDeviceType(Lcom/ibotta/api/call/customer/device/DeviceType;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceType:Lcom/ibotta/api/call/customer/device/DeviceType;

    return-void
.end method

.method public setDeviceUdid(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->deviceUdid:Ljava/lang/String;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->token:Ljava/lang/String;

    return-void
.end method
