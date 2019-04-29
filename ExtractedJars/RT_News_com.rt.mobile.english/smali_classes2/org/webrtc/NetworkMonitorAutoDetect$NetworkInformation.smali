.class public Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;
.super Ljava/lang/Object;
.source "NetworkMonitorAutoDetect.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/NetworkMonitorAutoDetect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "NetworkInformation"
.end annotation


# instance fields
.field public final handle:J

.field public final ipAddresses:[Lorg/webrtc/NetworkMonitorAutoDetect$IPAddress;

.field public final name:Ljava/lang/String;

.field public final type:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

.field public final underlyingTypeForVpn:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;J[Lorg/webrtc/NetworkMonitorAutoDetect$IPAddress;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->name:Ljava/lang/String;

    .line 85
    iput-object p2, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->type:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 86
    iput-object p3, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->underlyingTypeForVpn:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    .line 87
    iput-wide p4, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->handle:J

    .line 88
    iput-object p6, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->ipAddresses:[Lorg/webrtc/NetworkMonitorAutoDetect$IPAddress;

    return-void
.end method

.method private getConnectionType()Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "NetworkInformation"
    .end annotation

    .line 98
    iget-object v0, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->type:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    return-object v0
.end method

.method private getHandle()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
        value = "NetworkInformation"
    .end annotation

    .line 108
    iget-wide v0, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->handle:J

    return-wide v0
.end method

.method private getIpAddresses()[Lorg/webrtc/NetworkMonitorAutoDetect$IPAddress;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "NetworkInformation"
    .end annotation

    .line 93
    iget-object v0, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->ipAddresses:[Lorg/webrtc/NetworkMonitorAutoDetect$IPAddress;

    return-object v0
.end method

.method private getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "NetworkInformation"
    .end annotation

    .line 113
    iget-object v0, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->name:Ljava/lang/String;

    return-object v0
.end method

.method private getUnderlyingConnectionTypeForVpn()Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "NetworkInformation"
    .end annotation

    .line 103
    iget-object v0, p0, Lorg/webrtc/NetworkMonitorAutoDetect$NetworkInformation;->underlyingTypeForVpn:Lorg/webrtc/NetworkMonitorAutoDetect$ConnectionType;

    return-object v0
.end method
