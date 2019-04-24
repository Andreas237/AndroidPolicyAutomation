.class public Lcom/shopkick/app/application/AppDebugFlags;
.super Ljava/lang/Object;
.source "AppDebugFlags.java"


# static fields
.field public static final CRASHLYTICS_TOAST:Ljava/lang/String; = "DEBUG_FLAG_CRASHLYTICS_TOAST"

.field public static DEBUG_ACCURACY:Ljava/lang/String; = "Debug accuracy"

.field public static final DEBUG_DEFAULT_ACCURACY:I = 0xa

.field public static final DEBUG_DEFAULT_LAT:F = 37.446613f

.field public static final DEBUG_DEFAULT_LNG:F = -122.15972f

.field public static final DEBUG_FLAG_ENABLE_OFFLINE:Ljava/lang/String; = "DEBUG_FLAG_ENABLE_OFFLINE"

.field public static final DEBUG_FLAG_IGNORE_TRANSMITTER:Ljava/lang/String; = "DEBUG_FLAG_IGNORE_TRANSMITTER"

.field public static final DEBUG_FLAG_SIMULATE_GERMAN_SIM:Ljava/lang/String; = "DEBUG_FLAG_SIMULATE_GERMAN_SIM"

.field public static final DEBUG_FLAG_SIMULATE_NO_LOCATION:Ljava/lang/String; = "DEBUG_FLAG_SIMULATE_NO_LOCATION"

.field public static final DEBUG_FLAG_SIMULATE_NO_SIM:Ljava/lang/String; = "DEBUG_FLAG_SIMULATE_NO_SIM"

.field public static final DEBUG_FLAG_SIMULATE_US_SIM:Ljava/lang/String; = "DEBUG_FLAG_SIMULATE_US_SIM"

.field public static final DEBUG_FLAG_SKIP_LOCATION_FINDER:Ljava/lang/String; = "DEBUG_FLAG_SKIP_LOCATION_FINDER"

.field public static final DEBUG_FLAG_USE_PROVIDED_GPS:Ljava/lang/String; = "DEBUG_FLAG_USE_PROVIDED_GPS"

.field public static DEBUG_LAT:Ljava/lang/String; = "Debug latitude"

.field public static DEBUG_LNG:Ljava/lang/String; = "Debug longitude"


# instance fields
.field private skFlags:Lcom/shopkick/app/flags/SKFlags;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerFlags(Lcom/shopkick/app/flags/SKFlags;)V
    .locals 3

    const-string v0, "DEBUG_FLAG_SIMULATE_US_SIM"

    const-string v1, "Simulate US SIM"

    const/4 v2, 0x0

    .line 39
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_SIMULATE_GERMAN_SIM"

    const-string v1, "Simulate German SIM"

    .line 40
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_SIMULATE_NO_SIM"

    const-string v1, "Simulate no SIM"

    .line 41
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_USE_PROVIDED_GPS"

    const-string v1, "Use provided GPS"

    .line 42
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_SIMULATE_NO_LOCATION"

    const-string v1, "Simulate no location"

    .line 43
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_ENABLE_OFFLINE"

    const-string v1, "Enable Offline"

    .line 44
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_IGNORE_TRANSMITTER"

    const-string v1, "Ignore Transmitter"

    .line 45
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_SKIP_LOCATION_FINDER"

    const-string v1, "Skip Location Finder"

    .line 46
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v0, "DEBUG_FLAG_CRASHLYTICS_TOAST"

    const-string v1, "Show crashlytics toast"

    .line 47
    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/flags/SKFlags;->registerFlag(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
