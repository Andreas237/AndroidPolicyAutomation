.class public Lorg/webrtc/PeerConnectionFactory$Options;
.super Ljava/lang/Object;
.source "PeerConnectionFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Options"
.end annotation


# static fields
.field static final ADAPTER_TYPE_ANY:I = 0x20

.field static final ADAPTER_TYPE_CELLULAR:I = 0x4

.field static final ADAPTER_TYPE_ETHERNET:I = 0x1

.field static final ADAPTER_TYPE_LOOPBACK:I = 0x10

.field static final ADAPTER_TYPE_UNKNOWN:I = 0x0

.field static final ADAPTER_TYPE_VPN:I = 0x8

.field static final ADAPTER_TYPE_WIFI:I = 0x2


# instance fields
.field public disableEncryption:Z

.field public disableNetworkMonitor:Z

.field public enableAes128Sha1_32CryptoCipher:Z

.field public enableGcmCryptoSuites:Z

.field public networkIgnoreMask:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method getDisableEncryption()Z
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Options"
    .end annotation

    .line 135
    iget-boolean v0, p0, Lorg/webrtc/PeerConnectionFactory$Options;->disableEncryption:Z

    return v0
.end method

.method getDisableNetworkMonitor()Z
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Options"
    .end annotation

    .line 140
    iget-boolean v0, p0, Lorg/webrtc/PeerConnectionFactory$Options;->disableNetworkMonitor:Z

    return v0
.end method

.method getEnableAes128Sha1_32CryptoCipher()Z
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Options"
    .end annotation

    .line 145
    iget-boolean v0, p0, Lorg/webrtc/PeerConnectionFactory$Options;->enableAes128Sha1_32CryptoCipher:Z

    return v0
.end method

.method getEnableGcmCryptoSuites()Z
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Options"
    .end annotation

    .line 150
    iget-boolean v0, p0, Lorg/webrtc/PeerConnectionFactory$Options;->enableGcmCryptoSuites:Z

    return v0
.end method

.method getNetworkIgnoreMask()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Options"
    .end annotation

    .line 130
    iget v0, p0, Lorg/webrtc/PeerConnectionFactory$Options;->networkIgnoreMask:I

    return v0
.end method
