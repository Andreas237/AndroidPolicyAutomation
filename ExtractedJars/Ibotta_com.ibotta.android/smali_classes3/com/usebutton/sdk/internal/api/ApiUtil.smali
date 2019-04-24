.class public Lcom/usebutton/sdk/internal/api/ApiUtil;
.super Ljava/lang/Object;
.source "ApiUtil.java"


# instance fields
.field private final mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/HostInformation;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    return-void
.end method


# virtual methods
.method public getUserAgent()Ljava/lang/String;
    .locals 7

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.usebutton.sdk/"

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/api/HostInformation;->getSdkVersionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/HostInformation;->getSdkVersionCode()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, "(Android "

    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/api/HostInformation;->getAndroidVersionName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; "

    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/api/HostInformation;->getDeviceManufacturer()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/HostInformation;->getDeviceModel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "; "

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/HostInformation;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/HostInformation;->getVersionName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/HostInformation;->getVersionCode()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; "

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "Scale/%.1f; "

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v5}, Lcom/usebutton/sdk/internal/api/HostInformation;->getScreenDensity()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ApiUtil;->mHostInformation:Lcom/usebutton/sdk/internal/api/HostInformation;

    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/api/HostInformation;->getLocale()Ljava/util/Locale;

    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
