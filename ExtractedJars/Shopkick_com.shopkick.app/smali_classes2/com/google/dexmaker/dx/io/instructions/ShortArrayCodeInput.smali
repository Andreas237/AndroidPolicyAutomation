.class public final Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;
.super Lcom/google/dexmaker/dx/io/instructions/BaseCodeCursor;
.source "ShortArrayCodeInput.java"

# interfaces
.implements Lcom/google/dexmaker/dx/io/instructions/CodeInput;


# instance fields
.field private final array:[S


# direct methods
.method public constructor <init>([S)V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/google/dexmaker/dx/io/instructions/BaseCodeCursor;-><init>()V

    if-eqz p1, :cond_0

    .line 37
    iput-object p1, p0, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->array:[S

    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "array == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public hasMore()Z
    .locals 2

    .line 42
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->cursor()I

    move-result v0

    iget-object v1, p0, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->array:[S

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public read()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->array:[S

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->cursor()I

    move-result v1

    aget-short v0, v0, v1

    const/4 v1, 0x1

    .line 49
    invoke-virtual {p0, v1}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->advance(I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0

    .line 52
    :catch_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public readInt()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->read()I

    move-result v0

    .line 59
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->read()I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    return v0
.end method

.method public readLong()J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/EOFException;
        }
    .end annotation

    .line 66
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->read()I

    move-result v0

    int-to-long v0, v0

    .line 67
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->read()I

    move-result v2

    int-to-long v2, v2

    .line 68
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->read()I

    move-result v4

    int-to-long v4, v4

    .line 69
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/io/instructions/ShortArrayCodeInput;->read()I

    move-result v6

    int-to-long v6, v6

    const/16 v8, 0x10

    shl-long/2addr v2, v8

    or-long/2addr v0, v2

    const/16 v2, 0x20

    shl-long v2, v4, v2

    or-long/2addr v0, v2

    const/16 v2, 0x30

    shl-long v2, v6, v2

    or-long/2addr v0, v2

    return-wide v0
.end method
