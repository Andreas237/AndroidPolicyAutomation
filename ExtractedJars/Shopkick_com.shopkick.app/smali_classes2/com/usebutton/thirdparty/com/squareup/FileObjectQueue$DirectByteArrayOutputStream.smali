.class Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;
.super Ljava/io/ByteArrayOutputStream;
.source "FileObjectQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DirectByteArrayOutputStream"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 163
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public getArray()[B
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/squareup/FileObjectQueue$DirectByteArrayOutputStream;->buf:[B

    return-object v0
.end method
