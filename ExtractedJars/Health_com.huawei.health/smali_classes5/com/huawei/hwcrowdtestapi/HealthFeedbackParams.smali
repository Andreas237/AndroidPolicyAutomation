.class public Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;>;"
        }
    .end annotation
.end field


# instance fields
.field private deviceId:Ljava/lang/String;

.field private hardwareVersion:Ljava/lang/String;

.field private productName:Ljava/lang/String;

.field private productVersion:Ljava/lang/String;

.field private romVersion:Ljava/lang/String;

.field private routerBrand:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams$3;

    invoke-direct {v0}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams$3;-><init>()V

    sput-object v0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->deviceId:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productName:Ljava/lang/String;

    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productVersion:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->routerBrand:Ljava/lang/String;

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->hardwareVersion:Ljava/lang/String;

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->romVersion:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 88
    const/4 v0, 0x0

    return v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getHardwareVersion()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->hardwareVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getProductName()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productName:Ljava/lang/String;

    return-object v0
.end method

.method public getProductVersion()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getRomVersion()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->romVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getRouterBrand()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->routerBrand:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->deviceId:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setHardwareVersion(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->hardwareVersion:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setProductName(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productName:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setProductVersion(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productVersion:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setRomVersion(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->romVersion:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setRouterBrand(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->routerBrand:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->deviceId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->productVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->routerBrand:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->hardwareVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;->romVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 99
    return-void
.end method
