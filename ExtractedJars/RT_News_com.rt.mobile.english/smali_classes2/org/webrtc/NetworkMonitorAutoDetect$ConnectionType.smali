.class public final enum Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;
.super Ljava/lang/Enum;
.source "NetworkMonitorAutoDetect.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/NetworkMonitorAutoDetect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ConnectionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_2G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_3G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_4G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_BLUETOOTH:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_ETHERNET:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_NONE:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_UNKNOWN:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_UNKNOWN_CELLULAR:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_VPN:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public static final enum CONNECTION_WIFI:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 50
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_UNKNOWN:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 51
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_ETHERNET"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_ETHERNET:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 52
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_WIFI"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_WIFI:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 53
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_4G"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_4G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 54
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_3G"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_3G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 55
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_2G"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_2G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 56
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_UNKNOWN_CELLULAR"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_UNKNOWN_CELLULAR:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 57
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_BLUETOOTH"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_BLUETOOTH:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 58
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_VPN"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_VPN:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 59
    new-instance v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const-string v1, "CONNECTION_NONE"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_NONE:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    const/16 v0, 0xa

    .line 49
    new-array v0, v0, [Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_UNKNOWN:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_ETHERNET:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_WIFI:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_4G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v5

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_3G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v6

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_2G:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v7

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_UNKNOWN_CELLULAR:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v8

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_BLUETOOTH:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v9

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_VPN:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v10

    sget-object v1, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->CONNECTION_NONE:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    aput-object v1, v0, v11

    sput-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->$VALUES:[Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;
    .locals 1

    .line 49
    const-class v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;
    .locals 1

    .line 49
    sget-object v0, Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->$VALUES:[Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    invoke-virtual {v0}, [Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    return-object v0
.end method
