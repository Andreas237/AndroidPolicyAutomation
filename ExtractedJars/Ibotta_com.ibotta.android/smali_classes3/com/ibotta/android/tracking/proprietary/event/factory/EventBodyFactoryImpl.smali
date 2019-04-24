.class public Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;
.super Ljava/lang/Object;
.source "EventBodyFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;


# instance fields
.field private final appVersionSupplier:Lcom/ibotta/android/abstractions/AppVersionSupplier;

.field private final currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

.field private final customerIdSupplier:Lcom/ibotta/android/abstractions/CustomerIdSupplier;

.field private final eventIdCounter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

.field private final ipAddressSupplier:Lcom/ibotta/android/abstractions/IpAddressSupplier;

.field private final sessionIdSupplier:Lcom/ibotta/android/abstractions/SessionIdSupplier;

.field private final telephonyManager:Landroid/telephony/TelephonyManager;

.field private final uniqueDeviceIdSupplier:Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;

.field private final userLastLocationSupplier:Lcom/ibotta/android/abstractions/UserLastLocationSupplier;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/abstractions/CustomerIdSupplier;Lcom/ibotta/android/abstractions/CurrentTimeSupplier;Lcom/ibotta/android/abstractions/UserLastLocationSupplier;Lcom/ibotta/android/abstractions/SessionIdSupplier;Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;Lcom/ibotta/android/abstractions/IpAddressSupplier;Lcom/ibotta/android/abstractions/AppVersionSupplier;Lcom/ibotta/android/abstractions/GoogleAidSupplier;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->customerIdSupplier:Lcom/ibotta/android/abstractions/CustomerIdSupplier;

    .line 46
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    .line 47
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->userLastLocationSupplier:Lcom/ibotta/android/abstractions/UserLastLocationSupplier;

    .line 48
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->sessionIdSupplier:Lcom/ibotta/android/abstractions/SessionIdSupplier;

    .line 49
    iput-object p5, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->uniqueDeviceIdSupplier:Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;

    .line 50
    iput-object p6, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->ipAddressSupplier:Lcom/ibotta/android/abstractions/IpAddressSupplier;

    .line 51
    iput-object p7, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->appVersionSupplier:Lcom/ibotta/android/abstractions/AppVersionSupplier;

    .line 52
    iput-object p8, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

    .line 53
    iput-object p9, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    .line 54
    iput-object p10, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->eventIdCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public createEventBody(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 1

    .line 59
    invoke-static {}, Ljava9/util/Maps;->of()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->createEventBody(Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    return-object p1
.end method

.method public createEventBody(Ljava/lang/String;JZLjava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JZ",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 71
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->telephonyManager:Landroid/telephony/TelephonyManager;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    const-string v1, ""

    .line 73
    :goto_1
    new-instance v2, Lcom/ibotta/tracking/generated/model/Body;

    invoke-direct {v2}, Lcom/ibotta/tracking/generated/model/Body;-><init>()V

    iget-object v3, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->customerIdSupplier:Lcom/ibotta/android/abstractions/CustomerIdSupplier;

    .line 74
    invoke-interface {v3}, Lcom/ibotta/android/abstractions/CustomerIdSupplier;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/ibotta/tracking/generated/model/Body;->userId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->uniqueDeviceIdSupplier:Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;

    .line 75
    invoke-interface {v3}, Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/ibotta/tracking/generated/model/Body;->deviceId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object v2

    .line 76
    invoke-virtual {v2, p1}, Lcom/ibotta/tracking/generated/model/Body;->eventType(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    .line 77
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->time(Ljava/lang/Long;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->appVersionSupplier:Lcom/ibotta/android/abstractions/AppVersionSupplier;

    .line 78
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/AppVersionSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->appVersion(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    sget-object p2, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->ANDROID:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    .line 79
    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->platform(Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    sget-object p2, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->ANDROID:Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    .line 80
    invoke-virtual {p2}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->osName(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    sget-object p2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 81
    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->osVersion(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    sget-object p2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 82
    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->deviceBrand(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 83
    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->deviceManufacturer(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    sget-object p2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 84
    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->deviceModel(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    .line 85
    invoke-virtual {p1, v0}, Lcom/ibotta/tracking/generated/model/Body;->carrier(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    .line 86
    invoke-virtual {p1, v1}, Lcom/ibotta/tracking/generated/model/Body;->country(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    .line 87
    invoke-virtual {p1, p5}, Lcom/ibotta/tracking/generated/model/Body;->eventProperties(Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->eventIdCounter:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 88
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->eventId(Ljava/lang/Integer;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->sessionIdSupplier:Lcom/ibotta/android/abstractions/SessionIdSupplier;

    .line 89
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/SessionIdSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->sessionId(Ljava/lang/Long;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->uniqueDeviceIdSupplier:Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;

    .line 90
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/UniqueDeviceIdSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->androidId(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

    .line 91
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/GoogleAidSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->adid(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    .line 92
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Locale;->getISO3Language()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->language(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->userLastLocationSupplier:Lcom/ibotta/android/abstractions/UserLastLocationSupplier;

    .line 93
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/UserLastLocationSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->locationLat(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->userLastLocationSupplier:Lcom/ibotta/android/abstractions/UserLastLocationSupplier;

    .line 94
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/UserLastLocationSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->locationLng(Ljava/lang/Float;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->ipAddressSupplier:Lcom/ibotta/android/abstractions/IpAddressSupplier;

    .line 95
    invoke-interface {p2}, Lcom/ibotta/android/abstractions/IpAddressSupplier;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->ip(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    .line 96
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/tracking/generated/model/Body;->fake(Ljava/lang/Boolean;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    return-object p1
.end method

.method public createEventBody(Ljava/lang/String;Ljava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/ibotta/tracking/generated/model/Body;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->currentTimeSupplier:Lcom/ibotta/android/abstractions/CurrentTimeSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/abstractions/CurrentTimeSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v6, p2

    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactoryImpl;->createEventBody(Ljava/lang/String;JZLjava/util/Map;)Lcom/ibotta/tracking/generated/model/Body;

    move-result-object p1

    return-object p1
.end method
