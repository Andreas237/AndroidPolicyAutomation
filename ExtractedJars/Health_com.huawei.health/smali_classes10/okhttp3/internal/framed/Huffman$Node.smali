.class final Lokhttp3/internal/framed/Huffman$Node;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/framed/Huffman;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Node"
.end annotation


# instance fields
.field private final children:[Lokhttp3/internal/framed/Huffman$Node;

.field private final symbol:I

.field private final terminalBits:I


# direct methods
.method constructor <init>()V
    .locals 1

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    const/16 v0, 0x100

    new-array v0, v0, [Lokhttp3/internal/framed/Huffman$Node;

    iput-object v0, p0, Lokhttp3/internal/framed/Huffman$Node;->children:[Lokhttp3/internal/framed/Huffman$Node;

    .line 209
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/framed/Huffman$Node;->symbol:I

    .line 210
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/framed/Huffman$Node;->terminalBits:I

    .line 211
    return-void
.end method

.method constructor <init>(II)V
    .locals 2

    .line 219
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 220
    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/internal/framed/Huffman$Node;->children:[Lokhttp3/internal/framed/Huffman$Node;

    .line 221
    iput p1, p0, Lokhttp3/internal/framed/Huffman$Node;->symbol:I

    .line 222
    and-int/lit8 v1, p2, 0x7

    .line 223
    if-nez v1, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput v0, p0, Lokhttp3/internal/framed/Huffman$Node;->terminalBits:I

    .line 224
    return-void
.end method

.method static synthetic access$000(Lokhttp3/internal/framed/Huffman$Node;)[Lokhttp3/internal/framed/Huffman$Node;
    .locals 1

    .line 195
    iget-object v0, p0, Lokhttp3/internal/framed/Huffman$Node;->children:[Lokhttp3/internal/framed/Huffman$Node;

    return-object v0
.end method

.method static synthetic access$100(Lokhttp3/internal/framed/Huffman$Node;)I
    .locals 1

    .line 195
    iget v0, p0, Lokhttp3/internal/framed/Huffman$Node;->symbol:I

    return v0
.end method

.method static synthetic access$200(Lokhttp3/internal/framed/Huffman$Node;)I
    .locals 1

    .line 195
    iget v0, p0, Lokhttp3/internal/framed/Huffman$Node;->terminalBits:I

    return v0
.end method
