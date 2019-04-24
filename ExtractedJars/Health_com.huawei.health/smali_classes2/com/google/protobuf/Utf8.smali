.class final Lcom/google/protobuf/Utf8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/Utf8$UnsafeProcessor;,
        Lcom/google/protobuf/Utf8$SafeProcessor;,
        Lcom/google/protobuf/Utf8$Processor;,
        Lcom/google/protobuf/Utf8$UnpairedSurrogateException;
    }
.end annotation


# static fields
.field private static final ASCII_MASK_LONG:J = -0x7f7f7f7f7f7f7f80L

.field public static final COMPLETE:I = 0x0

.field public static final MALFORMED:I = -0x1

.field static final MAX_BYTES_PER_CHAR:I = 0x3

.field private static final UNSAFE_COUNT_ASCII_THRESHOLD:I = 0x10

.field private static final processor:Lcom/google/protobuf/Utf8$Processor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 86
    invoke-static {}, Lcom/google/protobuf/Utf8$UnsafeProcessor;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/protobuf/Utf8$UnsafeProcessor;

    invoke-direct {v0}, Lcom/google/protobuf/Utf8$UnsafeProcessor;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/protobuf/Utf8$SafeProcessor;

    invoke-direct {v0}, Lcom/google/protobuf/Utf8$SafeProcessor;-><init>()V

    :goto_0
    sput-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    .line 85
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1557
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(II)I
    .locals 1

    .line 78
    invoke-static {p0, p1}, Lcom/google/protobuf/Utf8;->incompleteStateFor(II)I

    move-result v0

    return v0
.end method

.method static synthetic access$100(III)I
    .locals 1

    .line 78
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8;->incompleteStateFor(III)I

    move-result v0

    return v0
.end method

.method static synthetic access$200(Ljava/nio/ByteBuffer;II)I
    .locals 1

    .line 78
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8;->estimateConsecutiveAscii(Ljava/nio/ByteBuffer;II)I

    move-result v0

    return v0
.end method

.method static synthetic access$300(Ljava/nio/ByteBuffer;III)I
    .locals 1

    .line 78
    invoke-static {p0, p1, p2, p3}, Lcom/google/protobuf/Utf8;->incompleteStateFor(Ljava/nio/ByteBuffer;III)I

    move-result v0

    return v0
.end method

.method static synthetic access$400([BII)I
    .locals 1

    .line 78
    invoke-static {p0, p1, p2}, Lcom/google/protobuf/Utf8;->incompleteStateFor([BII)I

    move-result v0

    return v0
.end method

.method static synthetic access$500(I)I
    .locals 1

    .line 78
    invoke-static {p0}, Lcom/google/protobuf/Utf8;->incompleteStateFor(I)I

    move-result v0

    return v0
.end method

.method static encode(Ljava/lang/CharSequence;[BII)I
    .locals 1

    .line 303
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/Utf8$Processor;->encodeUtf8(Ljava/lang/CharSequence;[BII)I

    move-result v0

    return v0
.end method

.method static encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 344
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    invoke-virtual {v0, p0, p1}, Lcom/google/protobuf/Utf8$Processor;->encodeUtf8(Ljava/lang/CharSequence;Ljava/nio/ByteBuffer;)V

    .line 345
    return-void
.end method

.method static encodedLength(Ljava/lang/CharSequence;)I
    .locals 10

    .line 251
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v6

    .line 252
    move v7, v6

    .line 253
    const/4 v8, 0x0

    .line 256
    :goto_0
    if-ge v8, v6, :cond_0

    invoke-interface {p0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_0

    .line 257
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 261
    :cond_0
    :goto_1
    if-ge v8, v6, :cond_2

    .line 262
    invoke-interface {p0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    .line 263
    const/16 v0, 0x800

    if-ge v9, v0, :cond_1

    .line 264
    rsub-int/lit8 v0, v9, 0x7f

    ushr-int/lit8 v0, v0, 0x1f

    add-int/2addr v7, v0

    goto :goto_2

    .line 266
    :cond_1
    invoke-static {p0, v8}, Lcom/google/protobuf/Utf8;->encodedLengthGeneral(Ljava/lang/CharSequence;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 267
    goto :goto_3

    .line 261
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 271
    :cond_2
    :goto_3
    if-ge v7, v6, :cond_3

    .line 273
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UTF-8 length does not fit in int: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    int-to-long v2, v7

    const-wide v4, 0x100000000L

    add-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 276
    :cond_3
    return v7
.end method

.method private static encodedLengthGeneral(Ljava/lang/CharSequence;I)I
    .locals 7

    .line 280
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 281
    const/4 v3, 0x0

    .line 282
    move v4, p1

    :goto_0
    if-ge v4, v2, :cond_3

    .line 283
    invoke-interface {p0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    .line 284
    const/16 v0, 0x800

    if-ge v5, v0, :cond_0

    .line 285
    rsub-int/lit8 v0, v5, 0x7f

    ushr-int/lit8 v0, v0, 0x1f

    add-int/2addr v3, v0

    goto :goto_1

    .line 287
    :cond_0
    add-int/lit8 v3, v3, 0x2

    .line 289
    const v0, 0xd800

    if-gt v0, v5, :cond_2

    const v0, 0xdfff

    if-gt v5, v0, :cond_2

    .line 291
    invoke-static {p0, v4}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    .line 292
    const/high16 v0, 0x10000

    if-ge v6, v0, :cond_1

    .line 293
    new-instance v0, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;

    invoke-direct {v0, v4, v2}, Lcom/google/protobuf/Utf8$UnpairedSurrogateException;-><init>(II)V

    throw v0

    .line 295
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 282
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 299
    :cond_3
    return v3
.end method

.method private static estimateConsecutiveAscii(Ljava/nio/ByteBuffer;II)I
    .locals 6

    .line 359
    move v4, p1

    .line 360
    add-int/lit8 v5, p2, -0x7

    .line 364
    :goto_0
    if-ge v4, v5, :cond_0

    invoke-virtual {p0, v4}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    add-int/lit8 v4, v4, 0x8

    goto :goto_0

    .line 365
    :cond_0
    sub-int v0, v4, p1

    return v0
.end method

.method private static incompleteStateFor(I)I
    .locals 1

    .line 190
    const/16 v0, -0xc

    if-le p0, v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    return v0
.end method

.method private static incompleteStateFor(II)I
    .locals 1

    .line 195
    const/16 v0, -0xc

    if-gt p0, v0, :cond_0

    const/16 v0, -0x41

    if-le p1, v0, :cond_1

    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    shl-int/lit8 v0, p1, 0x8

    xor-int/2addr v0, p0

    :goto_0
    return v0
.end method

.method private static incompleteStateFor(III)I
    .locals 2

    .line 201
    const/16 v0, -0xc

    if-gt p0, v0, :cond_0

    const/16 v0, -0x41

    if-gt p1, v0, :cond_0

    const/16 v0, -0x41

    if-le p2, v0, :cond_1

    :cond_0
    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    shl-int/lit8 v0, p1, 0x8

    xor-int/2addr v0, p0

    shl-int/lit8 v1, p2, 0x10

    xor-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method private static incompleteStateFor(Ljava/nio/ByteBuffer;III)I
    .locals 2

    .line 219
    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 221
    :pswitch_0
    invoke-static {p1}, Lcom/google/protobuf/Utf8;->incompleteStateFor(I)I

    move-result v0

    return v0

    .line 223
    :pswitch_1
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {p1, v0}, Lcom/google/protobuf/Utf8;->incompleteStateFor(II)I

    move-result v0

    return v0

    .line 225
    :pswitch_2
    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    add-int/lit8 v1, p2, 0x1

    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/google/protobuf/Utf8;->incompleteStateFor(III)I

    move-result v0

    return v0

    .line 227
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static incompleteStateFor([BII)I
    .locals 3

    .line 208
    add-int/lit8 v0, p1, -0x1

    aget-byte v2, p0, v0

    .line 209
    sub-int v0, p2, p1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 210
    :pswitch_0
    invoke-static {v2}, Lcom/google/protobuf/Utf8;->incompleteStateFor(I)I

    move-result v0

    return v0

    .line 211
    :pswitch_1
    aget-byte v0, p0, p1

    invoke-static {v2, v0}, Lcom/google/protobuf/Utf8;->incompleteStateFor(II)I

    move-result v0

    return v0

    .line 212
    :pswitch_2
    aget-byte v0, p0, p1

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    invoke-static {v2, v0, v1}, Lcom/google/protobuf/Utf8;->incompleteStateFor(III)I

    move-result v0

    return v0

    .line 213
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static isValidUtf8(Ljava/nio/ByteBuffer;)Z
    .locals 3

    .line 317
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/google/protobuf/Utf8$Processor;->isValidUtf8(Ljava/nio/ByteBuffer;II)Z

    move-result v0

    return v0
.end method

.method public static isValidUtf8([B)Z
    .locals 3

    .line 151
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    array-length v1, p0

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Lcom/google/protobuf/Utf8$Processor;->isValidUtf8([BII)Z

    move-result v0

    return v0
.end method

.method public static isValidUtf8([BII)Z
    .locals 1

    .line 164
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/Utf8$Processor;->isValidUtf8([BII)Z

    move-result v0

    return v0
.end method

.method static partialIsValidUtf8(ILjava/nio/ByteBuffer;II)I
    .locals 1

    .line 330
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8(ILjava/nio/ByteBuffer;II)I

    move-result v0

    return v0
.end method

.method public static partialIsValidUtf8(I[BII)I
    .locals 1

    .line 186
    sget-object v0, Lcom/google/protobuf/Utf8;->processor:Lcom/google/protobuf/Utf8$Processor;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/Utf8$Processor;->partialIsValidUtf8(I[BII)I

    move-result v0

    return v0
.end method
