.class public final Lcom/google/protobuf/UnsafeByteOperations;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static unsafeWrap(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 97
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->wrap(Ljava/nio/ByteBuffer;)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public static unsafeWrap([B)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 74
    invoke-static {p0}, Lcom/google/protobuf/ByteString;->wrap([B)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public static unsafeWrap([BII)Lcom/google/protobuf/ByteString;
    .locals 1

    .line 87
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/ByteString;->wrap([BII)Lcom/google/protobuf/ByteString;

    move-result-object v0

    return-object v0
.end method

.method public static unsafeWriteTo(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteOutput;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    invoke-virtual {p0, p1}, Lcom/google/protobuf/ByteString;->writeTo(Lcom/google/protobuf/ByteOutput;)V

    .line 118
    return-void
.end method
