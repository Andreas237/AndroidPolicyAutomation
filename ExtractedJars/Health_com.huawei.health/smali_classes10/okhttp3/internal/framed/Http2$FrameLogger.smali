.class final Lokhttp3/internal/framed/Http2$FrameLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/framed/Http2;
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

    .line 704
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "DATA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "HEADERS"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "PRIORITY"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "RST_STREAM"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "SETTINGS"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "PUSH_PROMISE"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "PING"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "GOAWAY"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "WINDOW_UPDATE"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "CONTINUATION"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->TYPES:[Ljava/lang/String;

    .line 721
    const/16 v0, 0x40

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    .line 722
    const/16 v0, 0x100

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    .line 725
    const/4 v5, 0x0

    :goto_0
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    array-length v0, v0

    if-ge v5, v0, :cond_0

    .line 726
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    const-string v1, "%8s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x20

    const/16 v3, 0x30

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    .line 725
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 729
    :cond_0
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, ""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 730
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, "END_STREAM"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 732
    const/4 v5, 0x1

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 734
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, "PADDED"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 735
    move-object v6, v5

    array-length v7, v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    aget v9, v6, v8

    .line 736
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int/lit8 v1, v9, 0x8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v3, v3, v9

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|PADDED"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 735
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 739
    :cond_1
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, "END_HEADERS"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 740
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, "PRIORITY"

    const/16 v2, 0x20

    aput-object v1, v0, v2

    .line 741
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    const-string v1, "END_HEADERS|PRIORITY"

    const/16 v2, 0x24

    aput-object v1, v0, v2

    .line 742
    const/4 v6, 0x3

    new-array v6, v6, [I

    fill-array-data v6, :array_1

    .line 745
    move-object v7, v6

    array-length v8, v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_3

    aget v10, v7, v9

    .line 746
    move-object v11, v5

    array-length v12, v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v12, :cond_2

    aget v14, v11, v13

    .line 747
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int v1, v14, v10

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v3, v3, v14

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x7c

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v3, v3, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 748
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    or-int v1, v14, v10

    or-int/lit8 v1, v1, 0x8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v3, v3, v14

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x7c

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v3, v3, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|PADDED"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 746
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 745
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 753
    :cond_3
    const/4 v7, 0x0

    :goto_4
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    array-length v0, v0

    if-ge v7, v0, :cond_5

    .line 754
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v0, v0, v7

    if-nez v0, :cond_4

    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    sget-object v1, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v1, v1, v7

    aput-object v1, v0, v7

    .line 753
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 756
    :cond_5
    return-void

    nop

    :array_0
    .array-data 4
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x4
        0x20
        0x24
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    .line 667
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static formatFlags(BB)Ljava/lang/String;
    .locals 3

    .line 682
    if-nez p1, :cond_0

    const-string v0, ""

    return-object v0

    .line 683
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto :goto_1

    .line 686
    :pswitch_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const-string v0, "ACK"

    goto :goto_0

    :cond_1
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v0, v0, p1

    :goto_0
    return-object v0

    .line 691
    :pswitch_1
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0

    .line 693
    :goto_1
    :pswitch_2
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    array-length v0, v0

    if-ge p1, v0, :cond_2

    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->FLAGS:[Ljava/lang/String;

    aget-object v2, v0, p1

    goto :goto_2

    :cond_2
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->BINARY:[Ljava/lang/String;

    aget-object v2, v0, p1

    .line 695
    :goto_2
    const/4 v0, 0x5

    if-ne p0, v0, :cond_3

    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_3

    .line 696
    const-string v0, "HEADERS"

    const-string v1, "PUSH_PROMISE"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 697
    :cond_3
    if-nez p0, :cond_4

    and-int/lit8 v0, p1, 0x20

    if-eqz v0, :cond_4

    .line 698
    const-string v0, "PRIORITY"

    const-string v1, "COMPRESSED"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 700
    :cond_4
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method static formatHeader(ZIIBB)Ljava/lang/String;
    .locals 6

    .line 670
    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->TYPES:[Ljava/lang/String;

    array-length v0, v0

    if-ge p3, v0, :cond_0

    sget-object v0, Lokhttp3/internal/framed/Http2$FrameLogger;->TYPES:[Ljava/lang/String;

    aget-object v4, v0, p3

    goto :goto_0

    :cond_0
    const-string v0, "0x%02x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 671
    :goto_0
    invoke-static {p3, p4}, Lokhttp3/internal/framed/Http2$FrameLogger;->formatFlags(BB)Ljava/lang/String;

    move-result-object v5

    .line 672
    const-string v0, "%s 0x%08x %5d %-13s %s"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    if-eqz p0, :cond_1

    const-string v2, "<<"

    goto :goto_1

    :cond_1
    const-string v2, ">>"

    :goto_1
    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    const/4 v2, 0x4

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
