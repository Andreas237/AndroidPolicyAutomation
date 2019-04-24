.class public Lcom/huawei/login/ui/login/util/LoginInfoData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private accoutName:Ljava/lang/String;

.field private countryCode:Ljava/lang/String;

.field private deviceId:Ljava/lang/String;

.field private deviceType:Ljava/lang/String;

.field private serviceCountryCode:Ljava/lang/String;

.field private siteId:I

.field private strServiceToken:Ljava/lang/String;

.field private strUserId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configAccoutName(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->accoutName:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public configCountryCode(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->countryCode:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public configDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->deviceId:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public configDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->deviceType:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public configServiceCountryCode(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->serviceCountryCode:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public configSiteId(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->siteId:I

    .line 37
    return-void
.end method

.method public configStrServiceToken(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->strServiceToken:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public configStrUserId(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->strUserId:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public fetchAccoutName()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->accoutName:Ljava/lang/String;

    return-object v0
.end method

.method public fetchCountryCode()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public fetchDeviceId()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public fetchDeviceType()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->deviceType:Ljava/lang/String;

    return-object v0
.end method

.method public fetchServiceCountryCode()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->serviceCountryCode:Ljava/lang/String;

    return-object v0
.end method

.method public fetchSiteid()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->siteId:I

    return v0
.end method

.method public fetchStrServiceToken()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->strServiceToken:Ljava/lang/String;

    return-object v0
.end method

.method public fetchStrUserId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/login/ui/login/util/LoginInfoData;->strUserId:Ljava/lang/String;

    return-object v0
.end method
