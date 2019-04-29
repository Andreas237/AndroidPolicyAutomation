.class public Lorg/webrtc/TurnCustomizer;
.super Ljava/lang/Object;
.source "TurnCustomizer.java"


# instance fields
.field final nativeTurnCustomizer:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lorg/webrtc/TurnCustomizer;->nativeTurnCustomizer:J

    return-void
.end method

.method private static native nativeFreeTurnCustomizer(J)V
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 22
    iget-wide v0, p0, Lorg/webrtc/TurnCustomizer;->nativeTurnCustomizer:J

    invoke-static {v0, v1}, Lorg/webrtc/TurnCustomizer;->nativeFreeTurnCustomizer(J)V

    return-void
.end method

.method getNativeTurnCustomizer()J
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 29
    iget-wide v0, p0, Lorg/webrtc/TurnCustomizer;->nativeTurnCustomizer:J

    return-wide v0
.end method
