.class public final Lkotlin/ULong;
.super Ljava/lang/Object;
.source "ULong.kt"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/ULong$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lkotlin/ULong;",
        ">;"
    }
.end annotation

.annotation build Lkotlin/ExperimentalUnsignedTypes;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0005\n\u0002\u0008\u0008\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0087@\u0018\u0000 e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001eB\u0014\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001b\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\u000c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u000c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001b\u0010\u000c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0097\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001b\u0010\u000c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u0005J\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008 \u0010\u000bJ\u001b\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008!\u0010\"J\u0013\u0010#\u001a\u00020$2\u0008\u0010\t\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\'\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010\u0005J\u0013\u0010)\u001a\u00020\u0000H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008*\u0010\u0005J\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010\u001dJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008-\u0010\u001fJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008.\u0010\u000bJ\u001b\u0010+\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u0010\"J\u001b\u00100\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u0010\u000bJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u0010\u001dJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u0010\u001fJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u0010\u000bJ\u001b\u00102\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u0010\"J\u001b\u00107\u001a\u0002082\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u00089\u0010:J\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010\u001dJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010\u001fJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008>\u0010\u000bJ\u001b\u0010;\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008?\u0010\"J\u001b\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\rH\u0087\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008B\u0010\u001fJ\u001b\u0010C\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\rH\u0087\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010\u001fJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000eH\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008F\u0010\u001dJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0011H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008G\u0010\u001fJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008H\u0010\u000bJ\u001b\u0010E\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0016H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008I\u0010\"J\u0010\u0010J\u001a\u00020KH\u0087\u0008\u00a2\u0006\u0004\u0008L\u0010MJ\u0010\u0010N\u001a\u00020\rH\u0087\u0008\u00a2\u0006\u0004\u0008O\u0010PJ\u0010\u0010Q\u001a\u00020\u0003H\u0087\u0008\u00a2\u0006\u0004\u0008R\u0010\u0005J\u0010\u0010S\u001a\u00020TH\u0087\u0008\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020XH\u0016\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0013\u0010[\u001a\u00020\u000eH\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\\\u0010MJ\u0013\u0010]\u001a\u00020\u0011H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008^\u0010PJ\u0013\u0010_\u001a\u00020\u0000H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008`\u0010\u0005J\u0013\u0010a\u001a\u00020\u0016H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008b\u0010VJ\u001b\u0010c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0087\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008d\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006f"
    }
    d2 = {
        "Lkotlin/ULong;",
        "",
        "data",
        "",
        "constructor-impl",
        "(J)J",
        "data$annotations",
        "()V",
        "and",
        "other",
        "and-VKZWuLQ",
        "(JJ)J",
        "compareTo",
        "",
        "Lkotlin/UByte;",
        "compareTo-7apg3OU",
        "(JB)I",
        "Lkotlin/UInt;",
        "compareTo-WZ4Q5Ns",
        "(JI)I",
        "compareTo-VKZWuLQ",
        "(JJ)I",
        "Lkotlin/UShort;",
        "compareTo-xj2QHRw",
        "(JS)I",
        "dec",
        "dec-impl",
        "div",
        "div-7apg3OU",
        "(JB)J",
        "div-WZ4Q5Ns",
        "(JI)J",
        "div-VKZWuLQ",
        "div-xj2QHRw",
        "(JS)J",
        "equals",
        "",
        "",
        "hashCode",
        "inc",
        "inc-impl",
        "inv",
        "inv-impl",
        "minus",
        "minus-7apg3OU",
        "minus-WZ4Q5Ns",
        "minus-VKZWuLQ",
        "minus-xj2QHRw",
        "or",
        "or-VKZWuLQ",
        "plus",
        "plus-7apg3OU",
        "plus-WZ4Q5Ns",
        "plus-VKZWuLQ",
        "plus-xj2QHRw",
        "rangeTo",
        "Lkotlin/ranges/ULongRange;",
        "rangeTo-VKZWuLQ",
        "(JJ)Lkotlin/ranges/ULongRange;",
        "rem",
        "rem-7apg3OU",
        "rem-WZ4Q5Ns",
        "rem-VKZWuLQ",
        "rem-xj2QHRw",
        "shl",
        "bitCount",
        "shl-impl",
        "shr",
        "shr-impl",
        "times",
        "times-7apg3OU",
        "times-WZ4Q5Ns",
        "times-VKZWuLQ",
        "times-xj2QHRw",
        "toByte",
        "",
        "toByte-impl",
        "(J)B",
        "toInt",
        "toInt-impl",
        "(J)I",
        "toLong",
        "toLong-impl",
        "toShort",
        "",
        "toShort-impl",
        "(J)S",
        "toString",
        "",
        "toString-impl",
        "(J)Ljava/lang/String;",
        "toUByte",
        "toUByte-impl",
        "toUInt",
        "toUInt-impl",
        "toULong",
        "toULong-impl",
        "toUShort",
        "toUShort-impl",
        "xor",
        "xor-VKZWuLQ",
        "Companion",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation

.annotation build Lkotlin/SinceKotlin;
    version = "1.3"
.end annotation


# static fields
.field public static final Companion:Lkotlin/ULong$Companion;

.field public static final MAX_VALUE:J = -0x1L

.field public static final MIN_VALUE:J = 0x0L

.field public static final SIZE_BITS:I = 0x40

.field public static final SIZE_BYTES:I = 0x8


# instance fields
.field private final data:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/ULong$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/ULong$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/ULong;->Companion:Lkotlin/ULong$Companion;

    return-void
.end method

.method private synthetic constructor <init>(J)V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lkotlin/ULong;->data:J

    return-void
.end method

.method private static final and-VKZWuLQ(JJ)J
    .locals 2
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    and-long v0, p0, p2

    .line 156
    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic box-impl(J)Lkotlin/ULong;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lkotlin/ULong;

    invoke-direct {v0, p0, p1}, Lkotlin/ULong;-><init>(J)V

    return-object v0
.end method

.method private static final compareTo-7apg3OU(JB)I
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long v4, v0, v2

    .line 45
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongCompare(JJ)I

    move-result p0

    return p0
.end method

.method private compareTo-VKZWuLQ(J)I
    .locals 2
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .line 1
    iget-wide v0, p0, Lkotlin/ULong;->data:J

    invoke-static {v0, v1, p1, p2}, Lkotlin/ULong;->compareTo-VKZWuLQ(JJ)I

    move-result p1

    return p1
.end method

.method private static compareTo-VKZWuLQ(JJ)I
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .line 70
    invoke-static {p0, p1, p2, p3}, Lkotlin/UnsignedKt;->ulongCompare(JJ)I

    move-result p0

    return p0
.end method

.method private static final compareTo-WZ4Q5Ns(JI)I
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 61
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongCompare(JJ)I

    move-result p0

    return p0
.end method

.method private static final compareTo-xj2QHRw(JS)I
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long v4, v0, v2

    .line 53
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongCompare(JJ)I

    move-result p0

    return p0
.end method

.method public static constructor-impl(J)J
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-wide p0
.end method

.method public static synthetic data$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method private static final dec-impl(J)J
    .locals 4
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    const-wide/16 v0, -0x1

    add-long v2, p0, v0

    .line 142
    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final div-7apg3OU(JB)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long v4, v0, v2

    .line 113
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongDivide-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final div-VKZWuLQ(JJ)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .line 122
    invoke-static {p0, p1, p2, p3}, Lkotlin/UnsignedKt;->ulongDivide-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final div-WZ4Q5Ns(JI)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 119
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongDivide-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final div-xj2QHRw(JS)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long v4, v0, v2

    .line 116
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongDivide-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static equals-impl(JLjava/lang/Object;)Z
    .locals 4
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    instance-of v0, p2, Lkotlin/ULong;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lkotlin/ULong;

    invoke-virtual {p2}, Lkotlin/ULong;->unbox-impl()J

    move-result-wide v2

    cmp-long p2, p0, v2

    const/4 p0, 0x1

    if-nez p2, :cond_0

    move p1, p0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    return p0

    :cond_1
    return v1
.end method

.method public static final equals-impl0(JJ)Z
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static hashCode-impl(J)I
    .locals 4

    const/16 v0, 0x20

    ushr-long v0, p0, v0

    xor-long v2, p0, v0

    long-to-int p0, v2

    return p0
.end method

.method private static final inc-impl(J)J
    .locals 4
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    const-wide/16 v0, 0x1

    add-long v2, p0, v0

    .line 139
    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final inv-impl(J)J
    .locals 4
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    const-wide/16 v0, -0x1

    xor-long v2, p0, v0

    .line 165
    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final minus-7apg3OU(JB)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long v4, v0, v2

    .line 87
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    sub-long v2, p0, v0

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final minus-VKZWuLQ(JJ)J
    .locals 2
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    sub-long v0, p0, p2

    .line 96
    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final minus-WZ4Q5Ns(JI)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 93
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    sub-long v2, p0, v0

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final minus-xj2QHRw(JS)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long v4, v0, v2

    .line 90
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    sub-long v2, p0, v0

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final or-VKZWuLQ(JJ)J
    .locals 2
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    or-long v0, p0, p2

    .line 159
    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final plus-7apg3OU(JB)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long v4, v0, v2

    .line 74
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    add-long v2, p0, v0

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final plus-VKZWuLQ(JJ)J
    .locals 2
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    add-long v0, p0, p2

    .line 83
    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final plus-WZ4Q5Ns(JI)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 80
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    add-long v2, p0, v0

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final plus-xj2QHRw(JS)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long v4, v0, v2

    .line 77
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    add-long v2, p0, v0

    invoke-static {v2, v3}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final rangeTo-VKZWuLQ(JJ)Lkotlin/ranges/ULongRange;
    .locals 7
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .line 146
    new-instance v6, Lkotlin/ranges/ULongRange;

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p0

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, Lkotlin/ranges/ULongRange;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method private static final rem-7apg3OU(JB)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long v4, v0, v2

    .line 126
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongRemainder-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final rem-VKZWuLQ(JJ)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    .line 135
    invoke-static {p0, p1, p2, p3}, Lkotlin/UnsignedKt;->ulongRemainder-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final rem-WZ4Q5Ns(JI)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 132
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongRemainder-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final rem-xj2QHRw(JS)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long v4, v0, v2

    .line 129
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/UnsignedKt;->ulongRemainder-eb3DHEI(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final shl-impl(JI)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    shl-long/2addr p0, p2

    .line 150
    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final shr-impl(JI)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    ushr-long/2addr p0, p2

    .line 153
    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final times-7apg3OU(JB)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long v4, v0, v2

    .line 100
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    mul-long/2addr p0, v0

    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final times-VKZWuLQ(JJ)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    mul-long/2addr p0, p2

    .line 109
    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final times-WZ4Q5Ns(JI)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long v4, v0, v2

    .line 106
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    mul-long/2addr p0, v0

    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final times-xj2QHRw(JS)J
    .locals 6
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long v4, v0, v2

    .line 103
    invoke-static {v4, v5}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide v0

    mul-long/2addr p0, v0

    invoke-static {p0, p1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final toByte-impl(J)B
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    long-to-int p0, p0

    int-to-byte p0, p0

    return p0
.end method

.method private static final toInt-impl(J)I
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    long-to-int p0, p0

    return p0
.end method

.method private static final toLong-impl(J)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    return-wide p0
.end method

.method private static final toShort-impl(J)S
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    long-to-int p0, p0

    int-to-short p0, p0

    return p0
.end method

.method public static toString-impl(J)Ljava/lang/String;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 185
    invoke-static {p0, p1}, Lkotlin/UnsignedKt;->ulongToString(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final toUByte-impl(J)B
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    long-to-int p0, p0

    int-to-byte p0, p0

    .line 177
    invoke-static {p0}, Lkotlin/UByte;->constructor-impl(B)B

    move-result p0

    return p0
.end method

.method private static final toUInt-impl(J)I
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    long-to-int p0, p0

    .line 181
    invoke-static {p0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result p0

    return p0
.end method

.method private static final toULong-impl(J)J
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    return-wide p0
.end method

.method private static final toUShort-impl(J)S
    .locals 0
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    long-to-int p0, p0

    int-to-short p0, p0

    .line 179
    invoke-static {p0}, Lkotlin/UShort;->constructor-impl(S)S

    move-result p0

    return p0
.end method

.method private static final xor-VKZWuLQ(JJ)J
    .locals 2
    .annotation build Lkotlin/internal/InlineOnly;
    .end annotation

    xor-long v0, p0, p2

    .line 162
    invoke-static {v0, v1}, Lkotlin/ULong;->constructor-impl(J)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 15
    check-cast p1, Lkotlin/ULong;

    invoke-virtual {p1}, Lkotlin/ULong;->unbox-impl()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lkotlin/ULong;->compareTo-VKZWuLQ(J)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lkotlin/ULong;->data:J

    invoke-static {v0, v1, p1}, Lkotlin/ULong;->equals-impl(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lkotlin/ULong;->data:J

    invoke-static {v0, v1}, Lkotlin/ULong;->hashCode-impl(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-wide v0, p0, Lkotlin/ULong;->data:J

    invoke-static {v0, v1}, Lkotlin/ULong;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unbox-impl()J
    .locals 2

    iget-wide v0, p0, Lkotlin/ULong;->data:J

    return-wide v0
.end method
