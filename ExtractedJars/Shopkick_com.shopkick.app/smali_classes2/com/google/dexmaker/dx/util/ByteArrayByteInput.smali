.class public final Lcom/google/dexmaker/dx/util/ByteArrayByteInput;
.super Ljava/lang/Object;
.source "ByteArrayByteInput.java"

# interfaces
.implements Lcom/google/dexmaker/dx/util/ByteInput;


# instance fields
.field private final bytes:[B

.field private position:I


# direct methods
.method public varargs constructor <init>([B)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/google/dexmaker/dx/util/ByteArrayByteInput;->bytes:[B

    return-void
.end method


# virtual methods
.method public readByte()B
    .locals 3

    .line 29
    iget-object v0, p0, Lcom/google/dexmaker/dx/util/ByteArrayByteInput;->bytes:[B

    iget v1, p0, Lcom/google/dexmaker/dx/util/ByteArrayByteInput;->position:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/dexmaker/dx/util/ByteArrayByteInput;->position:I

    aget-byte v0, v0, v1

    return v0
.end method
