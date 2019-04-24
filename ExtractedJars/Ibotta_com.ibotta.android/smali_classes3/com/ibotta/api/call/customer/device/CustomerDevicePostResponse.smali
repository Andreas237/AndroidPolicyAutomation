.class public Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerDevicePostResponse.java"


# instance fields
.field private device:Lcom/ibotta/api/model/customer/Device;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getDevice()Lcom/ibotta/api/model/customer/Device;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;->device:Lcom/ibotta/api/model/customer/Device;

    return-object v0
.end method

.method public setDevice(Lcom/ibotta/api/model/customer/Device;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;->device:Lcom/ibotta/api/model/customer/Device;

    return-void
.end method
