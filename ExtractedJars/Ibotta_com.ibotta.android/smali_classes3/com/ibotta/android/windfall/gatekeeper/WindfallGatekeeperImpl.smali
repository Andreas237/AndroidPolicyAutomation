.class public Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;
.super Ljava/lang/Object;
.source "WindfallGatekeeperImpl.java"

# interfaces
.implements Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final blacklistEngine:Lcom/ibotta/android/blacklist/BlacklistEngine;

.field private final windfallReceiptSdk:Lcom/ibotta/android/windfall/WindfallReceiptSdk;

.field private final windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/windfall/WindfallReceiptSdk;Lcom/ibotta/android/blacklist/BlacklistEngine;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallReceiptSdk:Lcom/ibotta/android/windfall/WindfallReceiptSdk;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->blacklistEngine:Lcom/ibotta/android/blacklist/BlacklistEngine;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    return-void
.end method


# virtual methods
.method public isOcrEnabled()Z
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->isOcrEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->blacklistEngine:Lcom/ibotta/android/blacklist/BlacklistEngine;

    invoke-interface {v0}, Lcom/ibotta/android/blacklist/BlacklistEngine;->isBlacklisted()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSupported(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallReceiptSdk:Lcom/ibotta/android/windfall/WindfallReceiptSdk;

    .line 57
    invoke-interface {v0}, Lcom/ibotta/android/windfall/WindfallReceiptSdk;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->isOcrEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isDeviceOcrEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    .line 60
    invoke-interface {v0, p1}, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;->isWindfallRetailerMapping(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isWalmartQrCodeSupported(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 1

    .line 65
    invoke-virtual {p0, p1}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->isSupported(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallRetailerSupport:Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;

    invoke-interface {v0, p1}, Lcom/ibotta/android/windfall/retailer/WindfallRetailerSupport;->isWalmartQr(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public prepareForRedemption()V
    .locals 2

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->isOcrEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Skipping Windfall SDK initialization. OCR not enabled."

    .line 37
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallReceiptSdk:Lcom/ibotta/android/windfall/WindfallReceiptSdk;

    invoke-interface {v0}, Lcom/ibotta/android/windfall/WindfallReceiptSdk;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Windfall SDK already initialized."

    .line 42
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 46
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeperImpl;->windfallReceiptSdk:Lcom/ibotta/android/windfall/WindfallReceiptSdk;

    invoke-interface {v0}, Lcom/ibotta/android/windfall/WindfallReceiptSdk;->initialize()V

    return-void
.end method
