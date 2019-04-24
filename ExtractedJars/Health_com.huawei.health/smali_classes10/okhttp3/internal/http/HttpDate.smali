.class public final Lokhttp3/internal/http/HttpDate;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

.field private static final BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

.field public static final MAX_DATE:J = 0xe677d21fdbffL

.field private static final STANDARD_DATE_FORMAT:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<Ljava/text/DateFormat;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    new-instance v0, Lokhttp3/internal/http/HttpDate$1;

    invoke-direct {v0}, Lokhttp3/internal/http/HttpDate$1;-><init>()V

    sput-object v0, Lokhttp3/internal/http/HttpDate;->STANDARD_DATE_FORMAT:Ljava/lang/ThreadLocal;

    .line 49
    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "EEE, dd MMM yyyy HH:mm:ss zzz"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "EEEE, dd-MMM-yy HH:mm:ss zzz"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "EEE MMM d HH:mm:ss yyyy"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "EEE, dd-MMM-yyyy HH:mm:ss z"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "EEE, dd-MMM-yyyy HH-mm-ss z"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "EEE, dd MMM yy HH:mm:ss z"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "EEE dd-MMM-yyyy HH:mm:ss z"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "EEE dd MMM yyyy HH:mm:ss z"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "EEE dd-MMM-yyyy HH-mm-ss z"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "EEE dd-MMM-yy HH:mm:ss z"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "EEE dd MMM yy HH:mm:ss z"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "EEE,dd-MMM-yy HH:mm:ss z"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "EEE,dd-MMM-yyyy HH:mm:ss z"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "EEE, dd-MM-yyyy HH:mm:ss z"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "EEE MMM d yyyy HH:mm:ss z"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sput-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    .line 71
    sget-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Ljava/text/DateFormat;

    sput-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    return-void
.end method

.method public static format(Ljava/util/Date;)Ljava/lang/String;
    .locals 1

    .line 114
    sget-object v0, Lokhttp3/internal/http/HttpDate;->STANDARD_DATE_FORMAT:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static parse(Ljava/lang/String;)Ljava/util/Date;
    .locals 9

    .line 76
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 77
    const/4 v0, 0x0

    return-object v0

    .line 80
    :cond_0
    new-instance v2, Ljava/text/ParsePosition;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Ljava/text/ParsePosition;-><init>(I)V

    .line 81
    sget-object v0, Lokhttp3/internal/http/HttpDate;->STANDARD_DATE_FORMAT:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, p0, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v3

    .line 82
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 85
    return-object v3

    .line 87
    :cond_1
    sget-object v4, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    monitor-enter v4

    .line 88
    const/4 v5, 0x0

    :try_start_0
    sget-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    array-length v6, v0

    :goto_0
    if-ge v5, v6, :cond_4

    .line 89
    sget-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

    aget-object v7, v0, v5

    .line 90
    if-nez v7, :cond_2

    .line 91
    new-instance v7, Ljava/text/SimpleDateFormat;

    sget-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMAT_STRINGS:[Ljava/lang/String;

    aget-object v0, v0, v5

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v7, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 94
    sget-object v0, Lokhttp3/internal/Util;->UTC:Ljava/util/TimeZone;

    invoke-virtual {v7, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 95
    sget-object v0, Lokhttp3/internal/http/HttpDate;->BROWSER_COMPATIBLE_DATE_FORMATS:[Ljava/text/DateFormat;

    aput-object v7, v0, v5

    .line 97
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 98
    invoke-virtual {v7, p0, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object v3

    .line 99
    invoke-virtual {v2}, Ljava/text/ParsePosition;->getIndex()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 105
    monitor-exit v4

    return-object v3

    .line 88
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 108
    :cond_4
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8

    .line 109
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method
