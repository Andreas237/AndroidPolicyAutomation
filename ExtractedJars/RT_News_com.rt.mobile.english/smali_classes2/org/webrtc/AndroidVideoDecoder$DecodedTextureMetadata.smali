.class Lorg/webrtc/AndroidVideoDecoder$DecodedTextureMetadata;
.super Ljava/lang/Object;
.source "AndroidVideoDecoder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/AndroidVideoDecoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DecodedTextureMetadata"
.end annotation


# instance fields
.field final decodeTimeMs:Ljava/lang/Integer;

.field final presentationTimestampUs:J


# direct methods
.method constructor <init>(JLjava/lang/Integer;)V
    .locals 0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    iput-wide p1, p0, Lorg/webrtc/AndroidVideoDecoder$DecodedTextureMetadata;->presentationTimestampUs:J

    .line 118
    iput-object p3, p0, Lorg/webrtc/AndroidVideoDecoder$DecodedTextureMetadata;->decodeTimeMs:Ljava/lang/Integer;

    return-void
.end method
