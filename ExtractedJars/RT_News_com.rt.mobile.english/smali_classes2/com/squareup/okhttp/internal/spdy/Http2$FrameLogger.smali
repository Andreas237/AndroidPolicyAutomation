.class final Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;
.super Ljava/lang/Object;
.source "Http2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/Http2;
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

    const/16 v0, 0xa

    .line 707
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "DATA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "HEADERS"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "PRIORITY"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "RST_STREAM"

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const-string v1, "SETTINGS"

    const/4 v5, 0x4

    aput-object v1, v0, v5

    const-string v1, "PUSH_PROMISE"

    const/4 v6, 0x5

    aput-object v1, v0, v6

    const-string v1, "PING"

    const/4 v6, 0x6

    aput-object v1, v0, v6

    const-string v1, "GOAWAY"

    const/4 v6, 0x7

    aput-object v1, v0, v6

    const-string v1, "WINDOW_UPDATE"

    const/16 v6, 0x8

    aput-object v1, v0, v6

    const-string v1, "CONTINUATION"

    const/16 v7, 0x9

    aput-object v1, v0, v7

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->TYPES:[Ljava/lang/String;

    const/16 v0, 0x40

    .line 724
    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const/16 v0, 0x100

    .line 725
    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    move v0, v2

    .line 728
    :goto_0
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    const/16 v7, 0x20

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 729
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    const-string v8, "%8s"

    new-array v9, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v2

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x30

    invoke-virtual {v8, v7, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 732
    :cond_0
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v2

    .line 733
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, "END_STREAM"

    aput-object v1, v0, v3

    .line 735
    new-array v0, v3, [I

    aput v3, v0, v2

    .line 737
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v3, "PADDED"

    aput-object v3, v1, v6

    .line 738
    array-length v1, v0

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    aget v8, v0, v3

    .line 739
    sget-object v9, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int/lit8 v10, v8, 0x8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v8, v12, v8

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "|PADDED"

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v9, v10

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 742
    :cond_1
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v3, "END_HEADERS"

    aput-object v3, v1, v5

    .line 743
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v3, "PRIORITY"

    aput-object v3, v1, v7

    .line 744
    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const/16 v3, 0x24

    const-string v5, "END_HEADERS|PRIORITY"

    aput-object v5, v1, v3

    .line 745
    new-array v1, v4, [I

    fill-array-data v1, :array_0

    .line 748
    array-length v3, v1

    move v4, v2

    :goto_2
    if-ge v4, v3, :cond_3

    aget v5, v1, v4

    .line 749
    array-length v7, v0

    move v8, v2

    :goto_3
    if-ge v8, v7, :cond_2

    aget v9, v0, v8

    .line 750
    sget-object v10, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int v11, v9, v5

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v13, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v13, v13, v9

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v13, 0x7c

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v14, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v14, v14, v5

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v10, v11

    .line 751
    sget-object v10, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int/2addr v11, v6

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v14, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v9, v14, v9

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v9, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v9, v9, v5

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "|PADDED"

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v10, v11

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 756
    :cond_3
    :goto_4
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    array-length v0, v0

    if-ge v2, v0, :cond_5

    .line 757
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v0, v0, v2

    if-nez v0, :cond_4

    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    sget-object v1, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v1, v1, v2

    aput-object v1, v0, v2

    :cond_4
    add-int/lit8 v2, v2, 0x1

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

    .line 670
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

    .line 696
    :pswitch_0
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_2

    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v0, v0, p1

    goto :goto_1

    :pswitch_1
    const/4 p0, 0x1

    if-ne p1, p0, :cond_1

    const-string p0, "ACK"

    goto :goto_0

    .line 689
    :cond_1
    sget-object p0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object p0, p0, p1

    :goto_0
    return-object p0

    .line 694
    :pswitch_2
    sget-object p0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object p0, p0, p1

    return-object p0

    .line 696
    :cond_2
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v0, v0, p1

    :goto_1
    const/4 v1, 0x5

    if-ne p0, v1, :cond_3

    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_3

    const-string p0, "HEADERS"

    const-string p1, "PUSH_PROMISE"

    .line 699
    invoke-virtual {v0, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    if-nez p0, :cond_4

    and-int/lit8 p0, p1, 0x20

    if-eqz p0, :cond_4

    const-string p0, "PRIORITY"

    const-string p1, "COMPRESSED"

    .line 701
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

    .line 673
    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->TYPES:[Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    array-length v0, v0

    if-ge p3, v0, :cond_0

    sget-object v0, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->TYPES:[Ljava/lang/String;

    aget-object v0, v0, p3

    goto :goto_0

    :cond_0
    const-string v0, "0x%02x"

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 674
    :goto_0
    invoke-static {p3, p4}, Lcom/squareup/okhttp/internal/spdy/Http2$FrameLogger;->formatFlags(BB)Ljava/lang/String;

    move-result-object p3

    const-string p4, "%s 0x%08x %5d %-13s %s"

    const/4 v3, 0x5

    .line 675
    new-array v3, v3, [Ljava/lang/Object;

    if-eqz p0, :cond_1

    const-string p0, "<<"

    goto :goto_1

    :cond_1
    const-string p0, ">>"

    :goto_1
    aput-object p0, v3, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    aput-object p0, v3, v2

    const/4 p0, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, p0

    const/4 p0, 0x3

    aput-object v0, v3, p0

    const/4 p0, 0x4

    aput-object p3, v3, p0

    invoke-static {p4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
