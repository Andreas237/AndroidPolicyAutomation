.class final Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;
.super Ljava/lang/Object;
.source "Http20Draft14.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http20Draft14;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "FrameLogger"
.end annotation


# static fields
.field private static final BINARY:[Ljava/lang/String;

.field private static final FLAGS:[Ljava/lang/String;

.field private static final TYPES:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const-string v0, "DATA"

    const-string v1, "HEADERS"

    const-string v2, "PRIORITY"

    const-string v3, "RST_STREAM"

    const-string v4, "SETTINGS"

    const-string v5, "PUSH_PROMISE"

    const-string v6, "PING"

    const-string v7, "GOAWAY"

    const-string v8, "WINDOW_UPDATE"

    const-string v9, "CONTINUATION"

    .line 705
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->TYPES:[Ljava/lang/String;

    const/16 v0, 0x40

    .line 722
    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    const/16 v0, 0x100

    .line 723
    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->BINARY:[Ljava/lang/String;

    const/4 v0, 0x0

    move v1, v0

    .line 726
    :goto_0
    sget-object v2, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->BINARY:[Ljava/lang/String;

    array-length v3, v2

    const/16 v4, 0x20

    const/4 v5, 0x1

    if-ge v1, v3, :cond_0

    const-string v3, "%8s"

    .line 727
    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x30

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 730
    :cond_0
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v2, ""

    aput-object v2, v1, v0

    const-string v2, "END_STREAM"

    .line 731
    aput-object v2, v1, v5

    .line 733
    new-array v2, v5, [I

    aput v5, v2, v0

    const-string v3, "PADDED"

    const/16 v5, 0x8

    .line 735
    aput-object v3, v1, v5

    .line 736
    array-length v1, v2

    move v3, v0

    :goto_1
    if-ge v3, v1, :cond_1

    aget v6, v2, v3

    .line 737
    sget-object v7, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int/lit8 v8, v6, 0x8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v10, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v6, v10, v6

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v6, "|PADDED"

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v7, v8

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 740
    :cond_1
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    const/4 v3, 0x4

    const-string v6, "END_HEADERS"

    aput-object v6, v1, v3

    const-string v3, "PRIORITY"

    .line 741
    aput-object v3, v1, v4

    const/16 v3, 0x24

    const-string v4, "END_HEADERS|PRIORITY"

    .line 742
    aput-object v4, v1, v3

    const/4 v1, 0x3

    .line 743
    new-array v1, v1, [I

    fill-array-data v1, :array_0

    .line 746
    array-length v3, v1

    move v4, v0

    :goto_2
    if-ge v4, v3, :cond_3

    aget v6, v1, v4

    .line 747
    array-length v7, v2

    move v8, v0

    :goto_3
    if-ge v8, v7, :cond_2

    aget v9, v2, v8

    .line 748
    sget-object v10, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int v11, v9, v6

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v13, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v13, v13, v9

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v13, 0x7c

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v14, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v14, v14, v6

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v10, v11

    .line 749
    sget-object v10, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int/2addr v11, v5

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v9, v14, v9

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v9, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v9, v9, v6

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v9, "|PADDED"

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v10, v11

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 754
    :cond_3
    :goto_4
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_5

    .line 755
    aget-object v2, v1, v0

    if-nez v2, :cond_4

    sget-object v2, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v2, v2, v0

    aput-object v2, v1, v0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    return-void

    nop

    :array_0
    .array-data 4
        0x4
        0x20
        0x24
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    .line 668
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static formatFlags(BB)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    packed-switch p0, :pswitch_data_0

    .line 694
    :pswitch_0
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->FLAGS:[Ljava/lang/String;

    array-length v1, v0

    if-ge p1, v1, :cond_2

    aget-object v0, v0, p1

    goto :goto_1

    :pswitch_1
    const/4 p0, 0x1

    if-ne p1, p0, :cond_1

    const-string p0, "ACK"

    goto :goto_0

    .line 687
    :cond_1
    sget-object p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object p0, p0, p1

    :goto_0
    return-object p0

    .line 692
    :pswitch_2
    sget-object p0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object p0, p0, p1

    return-object p0

    .line 694
    :cond_2
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v0, v0, p1

    :goto_1
    const/4 v1, 0x5

    if-ne p0, v1, :cond_3

    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_3

    const-string p0, "HEADERS"

    const-string p1, "PUSH_PROMISE"

    .line 697
    invoke-virtual {v0, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    if-nez p0, :cond_4

    and-int/lit8 p0, p1, 0x20

    if-eqz p0, :cond_4

    const-string p0, "PRIORITY"

    const-string p1, "COMPRESSED"

    .line 699
    invoke-virtual {v0, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method static formatHeader(ZIIBB)Ljava/lang/String;
    .locals 5

    .line 671
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->TYPES:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge p3, v1, :cond_0

    aget-object v0, v0, p3

    goto :goto_0

    :cond_0
    const-string v0, "0x%02x"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 672
    :goto_0
    invoke-static {p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http20Draft14$FrameLogger;->formatFlags(BB)Ljava/lang/String;

    move-result-object p3

    const-string p4, "%s 0x%08x %5d %-13s %s"

    const/4 v1, 0x5

    .line 673
    new-array v1, v1, [Ljava/lang/Object;

    if-eqz p0, :cond_1

    const-string p0, "<<"

    goto :goto_1

    :cond_1
    const-string p0, ">>"

    :goto_1
    aput-object p0, v1, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v1, v3

    const/4 p0, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, p0

    const/4 p0, 0x3

    aput-object v0, v1, p0

    const/4 p0, 0x4

    aput-object p3, v1, p0

    invoke-static {p4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
