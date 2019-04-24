.class public Lorg/apache/commons/lang3/time/FastDateFormat;
.super Ljava/text/Format;
.source "FastDateFormat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneDisplayKey;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNumberRule;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNameRule;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TwentyFourHourField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TwelveHourField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitMonthField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitYearField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitNumberField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$PaddedNumberField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$UnpaddedMonthField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$UnpaddedNumberField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$TextField;,
        Lorg/apache/commons/lang3/time/FastDateFormat$StringLiteral;,
        Lorg/apache/commons/lang3/time/FastDateFormat$CharacterLiteral;,
        Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;,
        Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    }
.end annotation


# static fields
.field public static final FULL:I = 0x0

.field public static final LONG:I = 0x1

.field public static final MEDIUM:I = 0x2

.field public static final SHORT:I = 0x3

.field private static cTimeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneDisplayKey;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final cache:Lorg/apache/commons/lang3/time/FormatCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/commons/lang3/time/FormatCache",
            "<",
            "Lorg/apache/commons/lang3/time/FastDateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final mLocale:Ljava/util/Locale;

.field private transient mMaxLengthEstimate:I

.field private final mPattern:Ljava/lang/String;

.field private transient mRules:[Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

.field private final mTimeZone:Ljava/util/TimeZone;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 107
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateFormat$1;

    invoke-direct {v0}, Lorg/apache/commons/lang3/time/FastDateFormat$1;-><init>()V

    sput-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    .line 114
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    sput-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cTimeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)V
    .locals 0
    .param p1, "pattern"    # Ljava/lang/String;
    .param p2, "timeZone"    # Ljava/util/TimeZone;
    .param p3, "locale"    # Ljava/util/Locale;

    .prologue
    .line 432
    invoke-direct {p0}, Ljava/text/Format;-><init>()V

    .line 433
    iput-object p1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    .line 434
    iput-object p2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    .line 435
    iput-object p3, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    .line 437
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDateFormat;->init()V

    .line 438
    return-void
.end method

.method public static getDateInstance(I)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I

    .prologue
    const/4 v2, 0x0

    .line 220
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v2, v2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getDateInstance(ILjava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    const/4 v2, 0x0

    .line 235
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v2, p1}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getDateInstance(ILjava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I
    .param p1, "timeZone"    # Ljava/util/TimeZone;

    .prologue
    const/4 v2, 0x0

    .line 251
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2, p1, v2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getDateInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I
    .param p1, "timeZone"    # Ljava/util/TimeZone;
    .param p2, "locale"    # Ljava/util/Locale;

    .prologue
    .line 267
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getDateTimeInstance(II)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 4
    .param p0, "dateStyle"    # I
    .param p1, "timeStyle"    # I

    .prologue
    const/4 v3, 0x0

    .line 345
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v3, v3}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getDateTimeInstance(IILjava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 4
    .param p0, "dateStyle"    # I
    .param p1, "timeStyle"    # I
    .param p2, "locale"    # Ljava/util/Locale;

    .prologue
    .line 361
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getDateTimeInstance(IILjava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1
    .param p0, "dateStyle"    # I
    .param p1, "timeStyle"    # I
    .param p2, "timeZone"    # Ljava/util/TimeZone;

    .prologue
    .line 378
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/time/FastDateFormat;->getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;

    move-result-object v0

    return-object v0
.end method

.method public static getDateTimeInstance(IILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "dateStyle"    # I
    .param p1, "timeStyle"    # I
    .param p2, "timeZone"    # Ljava/util/TimeZone;
    .param p3, "locale"    # Ljava/util/Locale;

    .prologue
    .line 395
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p2, p3}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getInstance()Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x3

    .line 146
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v3, v3}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getInstance(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2
    .param p0, "pattern"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 159
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0, p0, v1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getInstance(Ljava/lang/String;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2
    .param p0, "pattern"    # Ljava/lang/String;
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    .line 188
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getInstance(Ljava/lang/String;Ljava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 2
    .param p0, "pattern"    # Ljava/lang/String;
    .param p1, "timeZone"    # Ljava/util/TimeZone;

    .prologue
    .line 174
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 1
    .param p0, "pattern"    # Ljava/lang/String;
    .param p1, "timeZone"    # Ljava/util/TimeZone;
    .param p2, "locale"    # Ljava/util/Locale;

    .prologue
    .line 205
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-virtual {v0, p0, p1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getInstance(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getTimeInstance(I)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I

    .prologue
    const/4 v2, 0x0

    .line 282
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v2, v2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getTimeInstance(ILjava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I
    .param p1, "locale"    # Ljava/util/Locale;

    .prologue
    const/4 v2, 0x0

    .line 297
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v2, p1}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getTimeInstance(ILjava/util/TimeZone;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I
    .param p1, "timeZone"    # Ljava/util/TimeZone;

    .prologue
    const/4 v2, 0x0

    .line 313
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1, p1, v2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method public static getTimeInstance(ILjava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;
    .locals 3
    .param p0, "style"    # I
    .param p1, "timeZone"    # Ljava/util/TimeZone;
    .param p2, "locale"    # Ljava/util/Locale;

    .prologue
    .line 329
    sget-object v0, Lorg/apache/commons/lang3/time/FastDateFormat;->cache:Lorg/apache/commons/lang3/time/FormatCache;

    const/4 v1, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1, p2}, Lorg/apache/commons/lang3/time/FormatCache;->getDateTimeInstance(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/text/Format;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    return-object v0
.end method

.method static getTimeZoneDisplay(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;
    .locals 4
    .param p0, "tz"    # Ljava/util/TimeZone;
    .param p1, "daylight"    # Z
    .param p2, "style"    # I
    .param p3, "locale"    # Ljava/util/Locale;

    .prologue
    .line 409
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneDisplayKey;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneDisplayKey;-><init>(Ljava/util/TimeZone;ZILjava/util/Locale;)V

    .line 410
    .local v0, "key":Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneDisplayKey;
    sget-object v3, Lorg/apache/commons/lang3/time/FastDateFormat;->cTimeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v0}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 411
    .local v2, "value":Ljava/lang/String;
    if-nez v2, :cond_0

    .line 413
    invoke-virtual {p0, p1, p2, p3}, Ljava/util/TimeZone;->getDisplayName(ZILjava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 414
    sget-object v3, Lorg/apache/commons/lang3/time/FastDateFormat;->cTimeZoneDisplayCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v0, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 415
    .local v1, "prior":Ljava/lang/String;
    if-eqz v1, :cond_0

    .line 416
    move-object v2, v1

    .line 419
    .end local v1    # "prior":Ljava/lang/String;
    :cond_0
    return-object v2
.end method

.method private init()V
    .locals 4

    .prologue
    .line 444
    invoke-virtual {p0}, Lorg/apache/commons/lang3/time/FastDateFormat;->parsePattern()Ljava/util/List;

    move-result-object v2

    .line 445
    .local v2, "rulesList":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/lang3/time/FastDateFormat$Rule;>;"
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

    invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

    iput-object v3, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mRules:[Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

    .line 447
    const/4 v1, 0x0

    .line 448
    .local v1, "len":I
    iget-object v3, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mRules:[Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

    array-length v0, v3

    .local v0, "i":I
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 449
    iget-object v3, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mRules:[Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

    aget-object v3, v3, v0

    invoke-interface {v3}, Lorg/apache/commons/lang3/time/FastDateFormat$Rule;->estimateLength()I

    move-result v3

    add-int/2addr v1, v3

    goto :goto_0

    .line 452
    :cond_0
    iput v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mMaxLengthEstimate:I

    .line 453
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0
    .param p1, "in"    # Ljava/io/ObjectInputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 885
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 886
    invoke-direct {p0}, Lorg/apache/commons/lang3/time/FastDateFormat;->init()V

    .line 887
    return-void
.end method


# virtual methods
.method protected applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 4
    .param p1, "calendar"    # Ljava/util/Calendar;
    .param p2, "buf"    # Ljava/lang/StringBuffer;

    .prologue
    .line 769
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mRules:[Lorg/apache/commons/lang3/time/FastDateFormat$Rule;

    .local v0, "arr$":[Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    array-length v2, v0

    .local v2, "len$":I
    const/4 v1, 0x0

    .local v1, "i$":I
    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    .line 770
    .local v3, "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    invoke-interface {v3, p2, p1}, Lorg/apache/commons/lang3/time/FastDateFormat$Rule;->appendTo(Ljava/lang/StringBuffer;Ljava/util/Calendar;)V

    .line 769
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 772
    .end local v3    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_0
    return-object p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x0

    .line 845
    instance-of v2, p1, Lorg/apache/commons/lang3/time/FastDateFormat;

    if-nez v2, :cond_1

    .line 849
    :cond_0
    :goto_0
    return v1

    :cond_1
    move-object v0, p1

    .line 848
    check-cast v0, Lorg/apache/commons/lang3/time/FastDateFormat;

    .line 849
    .local v0, "other":Lorg/apache/commons/lang3/time/FastDateFormat;
    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    iget-object v3, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    iget-object v3, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    iget-object v3, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0
.end method

.method public format(J)Ljava/lang/String;
    .locals 1
    .param p1, "millis"    # J

    .prologue
    .line 696
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/time/FastDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public format(Ljava/util/Calendar;)Ljava/lang/String;
    .locals 2
    .param p1, "calendar"    # Ljava/util/Calendar;

    .prologue
    .line 718
    new-instance v0, Ljava/lang/StringBuffer;

    iget v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mMaxLengthEstimate:I

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Lorg/apache/commons/lang3/time/FastDateFormat;->format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public format(Ljava/util/Date;)Ljava/lang/String;
    .locals 3
    .param p1, "date"    # Ljava/util/Date;

    .prologue
    .line 706
    new-instance v0, Ljava/util/GregorianCalendar;

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    .line 707
    .local v0, "c":Ljava/util/Calendar;
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 708
    new-instance v1, Ljava/lang/StringBuffer;

    iget v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mMaxLengthEstimate:I

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Lorg/apache/commons/lang3/time/FastDateFormat;->applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public format(JLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1
    .param p1, "millis"    # J
    .param p3, "buf"    # Ljava/lang/StringBuffer;

    .prologue
    .line 731
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p0, v0, p3}, Lorg/apache/commons/lang3/time/FastDateFormat;->format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v0

    return-object v0
.end method

.method public format(Ljava/lang/Object;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
    .locals 3
    .param p1, "obj"    # Ljava/lang/Object;
    .param p2, "toAppendTo"    # Ljava/lang/StringBuffer;
    .param p3, "pos"    # Ljava/text/FieldPosition;

    .prologue
    .line 676
    instance-of v0, p1, Ljava/util/Date;

    if-eqz v0, :cond_0

    .line 677
    check-cast p1, Ljava/util/Date;

    .end local p1    # "obj":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateFormat;->format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 681
    :goto_0
    return-object v0

    .line 678
    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_0
    instance-of v0, p1, Ljava/util/Calendar;

    if-eqz v0, :cond_1

    .line 679
    check-cast p1, Ljava/util/Calendar;

    .end local p1    # "obj":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateFormat;->format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v0

    goto :goto_0

    .line 680
    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_2

    .line 681
    check-cast p1, Ljava/lang/Long;

    .end local p1    # "obj":Ljava/lang/Object;
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, Lorg/apache/commons/lang3/time/FastDateFormat;->format(JLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v0

    goto :goto_0

    .line 683
    .restart local p1    # "obj":Ljava/lang/Object;
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown class: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez p1, :cond_3

    const-string v0, "<null>"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public format(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 1
    .param p1, "calendar"    # Ljava/util/Calendar;
    .param p2, "buf"    # Ljava/lang/StringBuffer;

    .prologue
    .line 757
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateFormat;->applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v0

    return-object v0
.end method

.method public format(Ljava/util/Date;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
    .locals 3
    .param p1, "date"    # Ljava/util/Date;
    .param p2, "buf"    # Ljava/lang/StringBuffer;

    .prologue
    .line 743
    new-instance v0, Ljava/util/GregorianCalendar;

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V

    .line 744
    .local v0, "c":Ljava/util/Calendar;
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 745
    invoke-virtual {p0, v0, p2}, Lorg/apache/commons/lang3/time/FastDateFormat;->applyRules(Ljava/util/Calendar;Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object v1

    return-object v1
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .prologue
    .line 819
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    return-object v0
.end method

.method public getMaxLengthEstimate()I
    .locals 1

    .prologue
    .line 832
    iget v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mMaxLengthEstimate:I

    return v0
.end method

.method public getPattern()Ljava/lang/String;
    .locals 1

    .prologue
    .line 799
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeZone()Ljava/util/TimeZone;
    .locals 1

    .prologue
    .line 810
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    .line 861
    iget-object v0, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    iget-object v2, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    invoke-virtual {v2}, Ljava/util/Locale;->hashCode()I

    move-result v2

    mul-int/lit8 v2, v2, 0xd

    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0xd

    add-int/2addr v0, v1

    return v0
.end method

.method public parseObject(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/lang/Object;
    .locals 1
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "pos"    # Ljava/text/ParsePosition;

    .prologue
    const/4 v0, 0x0

    .line 786
    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setIndex(I)V

    .line 787
    invoke-virtual {p2, v0}, Ljava/text/ParsePosition;->setErrorIndex(I)V

    .line 788
    const/4 v0, 0x0

    return-object v0
.end method

.method protected parsePattern()Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lorg/apache/commons/lang3/time/FastDateFormat$Rule;",
            ">;"
        }
    .end annotation

    .prologue
    .line 464
    new-instance v15, Ljava/text/DateFormatSymbols;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-direct {v15, v0}, Ljava/text/DateFormatSymbols;-><init>(Ljava/util/Locale;)V

    .line 465
    .local v15, "symbols":Ljava/text/DateFormatSymbols;
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 467
    .local v11, "rules":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/lang3/time/FastDateFormat$Rule;>;"
    invoke-virtual {v15}, Ljava/text/DateFormatSymbols;->getEras()[Ljava/lang/String;

    move-result-object v4

    .line 468
    .local v4, "ERAs":[Ljava/lang/String;
    invoke-virtual {v15}, Ljava/text/DateFormatSymbols;->getMonths()[Ljava/lang/String;

    move-result-object v9

    .line 469
    .local v9, "months":[Ljava/lang/String;
    invoke-virtual {v15}, Ljava/text/DateFormatSymbols;->getShortMonths()[Ljava/lang/String;

    move-result-object v12

    .line 470
    .local v12, "shortMonths":[Ljava/lang/String;
    invoke-virtual {v15}, Ljava/text/DateFormatSymbols;->getWeekdays()[Ljava/lang/String;

    move-result-object v18

    .line 471
    .local v18, "weekdays":[Ljava/lang/String;
    invoke-virtual {v15}, Ljava/text/DateFormatSymbols;->getShortWeekdays()[Ljava/lang/String;

    move-result-object v13

    .line 472
    .local v13, "shortWeekdays":[Ljava/lang/String;
    invoke-virtual {v15}, Ljava/text/DateFormatSymbols;->getAmPmStrings()[Ljava/lang/String;

    move-result-object v3

    .line 474
    .local v3, "AmPmStrings":[Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v8

    .line 475
    .local v8, "length":I
    const/16 v19, 0x1

    move/from16 v0, v19

    new-array v7, v0, [I

    .line 477
    .local v7, "indexRef":[I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_0
    if-ge v6, v8, :cond_0

    .line 478
    const/16 v19, 0x0

    aput v6, v7, v19

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1, v7}, Lorg/apache/commons/lang3/time/FastDateFormat;->parseToken(Ljava/lang/String;[I)Ljava/lang/String;

    move-result-object v16

    .line 480
    .local v16, "token":Ljava/lang/String;
    const/16 v19, 0x0

    aget v6, v7, v19

    .line 482
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v17

    .line 483
    .local v17, "tokenLen":I
    if-nez v17, :cond_1

    .line 583
    .end local v16    # "token":Ljava/lang/String;
    .end local v17    # "tokenLen":I
    :cond_0
    return-object v11

    .line 488
    .restart local v16    # "token":Ljava/lang/String;
    .restart local v17    # "tokenLen":I
    :cond_1
    const/16 v19, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 490
    .local v5, "c":C
    sparse-switch v5, :sswitch_data_0

    .line 577
    new-instance v19, Ljava/lang/IllegalArgumentException;

    new-instance v20, Ljava/lang/StringBuilder;

    invoke-direct/range {v20 .. v20}, Ljava/lang/StringBuilder;-><init>()V

    const-string v21, "Illegal pattern component: "

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    move-object/from16 v0, v20

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 492
    :sswitch_0
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;

    const/16 v19, 0x0

    move/from16 v0, v19

    invoke-direct {v10, v0, v4}, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;-><init>(I[Ljava/lang/String;)V

    .line 580
    .end local v17    # "tokenLen":I
    .local v10, "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :goto_1
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 477
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 495
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    .restart local v17    # "tokenLen":I
    :sswitch_1
    const/16 v19, 0x2

    move/from16 v0, v17

    move/from16 v1, v19

    if-ne v0, v1, :cond_2

    .line 496
    sget-object v10, Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitYearField;->INSTANCE:Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitYearField;

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 498
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_2
    const/16 v19, 0x1

    const/16 v20, 0x4

    move/from16 v0, v17

    move/from16 v1, v20

    if-ge v0, v1, :cond_3

    const/16 v17, 0x4

    .end local v17    # "tokenLen":I
    :cond_3
    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 500
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 502
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    .restart local v17    # "tokenLen":I
    :sswitch_2
    const/16 v19, 0x4

    move/from16 v0, v17

    move/from16 v1, v19

    if-lt v0, v1, :cond_4

    .line 503
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;

    const/16 v19, 0x2

    move/from16 v0, v19

    invoke-direct {v10, v0, v9}, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;-><init>(I[Ljava/lang/String;)V

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 504
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_4
    const/16 v19, 0x3

    move/from16 v0, v17

    move/from16 v1, v19

    if-ne v0, v1, :cond_5

    .line 505
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;

    const/16 v19, 0x2

    move/from16 v0, v19

    invoke-direct {v10, v0, v12}, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;-><init>(I[Ljava/lang/String;)V

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 506
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_5
    const/16 v19, 0x2

    move/from16 v0, v17

    move/from16 v1, v19

    if-ne v0, v1, :cond_6

    .line 507
    sget-object v10, Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitMonthField;->INSTANCE:Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitMonthField;

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 509
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_6
    sget-object v10, Lorg/apache/commons/lang3/time/FastDateFormat$UnpaddedMonthField;->INSTANCE:Lorg/apache/commons/lang3/time/FastDateFormat$UnpaddedMonthField;

    .line 511
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 513
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_3
    const/16 v19, 0x5

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 514
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 516
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_4
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TwelveHourField;

    const/16 v19, 0xa

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-direct {v10, v0}, Lorg/apache/commons/lang3/time/FastDateFormat$TwelveHourField;-><init>(Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;)V

    .line 517
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto :goto_1

    .line 519
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_5
    const/16 v19, 0xb

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 520
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 522
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_6
    const/16 v19, 0xc

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 523
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 525
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_7
    const/16 v19, 0xd

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 526
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 528
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_8
    const/16 v19, 0xe

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 529
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 531
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_9
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;

    const/16 v20, 0x7

    const/16 v19, 0x4

    move/from16 v0, v17

    move/from16 v1, v19

    if-ge v0, v1, :cond_7

    move-object/from16 v19, v13

    :goto_2
    move/from16 v0, v20

    move-object/from16 v1, v19

    invoke-direct {v10, v0, v1}, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;-><init>(I[Ljava/lang/String;)V

    .line 532
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_7
    move-object/from16 v19, v18

    .line 531
    goto :goto_2

    .line 534
    :sswitch_a
    const/16 v19, 0x6

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 535
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 537
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_b
    const/16 v19, 0x8

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 538
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 540
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_c
    const/16 v19, 0x3

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 541
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 543
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_d
    const/16 v19, 0x4

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 544
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 546
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_e
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;

    const/16 v19, 0x9

    move/from16 v0, v19

    invoke-direct {v10, v0, v3}, Lorg/apache/commons/lang3/time/FastDateFormat$TextField;-><init>(I[Ljava/lang/String;)V

    .line 547
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 549
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_f
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TwentyFourHourField;

    const/16 v19, 0xb

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v19

    move-object/from16 v0, v19

    invoke-direct {v10, v0}, Lorg/apache/commons/lang3/time/FastDateFormat$TwentyFourHourField;-><init>(Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;)V

    .line 550
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 552
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_10
    const/16 v19, 0xa

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat;->selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;

    move-result-object v10

    .line 553
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 555
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_11
    const/16 v19, 0x4

    move/from16 v0, v17

    move/from16 v1, v19

    if-lt v0, v1, :cond_8

    .line 556
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNameRule;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    move-object/from16 v20, v0

    const/16 v21, 0x1

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    move/from16 v2, v21

    invoke-direct {v10, v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNameRule;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;I)V

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 558
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_8
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNameRule;

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mTimeZone:Ljava/util/TimeZone;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lorg/apache/commons/lang3/time/FastDateFormat;->mLocale:Ljava/util/Locale;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    move-object/from16 v0, v19

    move-object/from16 v1, v20

    move/from16 v2, v21

    invoke-direct {v10, v0, v1, v2}, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNameRule;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;I)V

    .line 560
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 562
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_12
    const/16 v19, 0x1

    move/from16 v0, v17

    move/from16 v1, v19

    if-ne v0, v1, :cond_9

    .line 563
    sget-object v10, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNumberRule;->INSTANCE_NO_COLON:Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNumberRule;

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 565
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_9
    sget-object v10, Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNumberRule;->INSTANCE_COLON:Lorg/apache/commons/lang3/time/FastDateFormat$TimeZoneNumberRule;

    .line 567
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 569
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :sswitch_13
    const/16 v19, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    .line 570
    .local v14, "sub":Ljava/lang/String;
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v19

    const/16 v20, 0x1

    move/from16 v0, v19

    move/from16 v1, v20

    if-ne v0, v1, :cond_a

    .line 571
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$CharacterLiteral;

    const/16 v19, 0x0

    move/from16 v0, v19

    invoke-virtual {v14, v0}, Ljava/lang/String;->charAt(I)C

    move-result v19

    move/from16 v0, v19

    invoke-direct {v10, v0}, Lorg/apache/commons/lang3/time/FastDateFormat$CharacterLiteral;-><init>(C)V

    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 573
    .end local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    :cond_a
    new-instance v10, Lorg/apache/commons/lang3/time/FastDateFormat$StringLiteral;

    invoke-direct {v10, v14}, Lorg/apache/commons/lang3/time/FastDateFormat$StringLiteral;-><init>(Ljava/lang/String;)V

    .line 575
    .restart local v10    # "rule":Lorg/apache/commons/lang3/time/FastDateFormat$Rule;
    goto/16 :goto_1

    .line 490
    :sswitch_data_0
    .sparse-switch
        0x27 -> :sswitch_13
        0x44 -> :sswitch_a
        0x45 -> :sswitch_9
        0x46 -> :sswitch_b
        0x47 -> :sswitch_0
        0x48 -> :sswitch_5
        0x4b -> :sswitch_10
        0x4d -> :sswitch_2
        0x53 -> :sswitch_8
        0x57 -> :sswitch_d
        0x5a -> :sswitch_12
        0x61 -> :sswitch_e
        0x64 -> :sswitch_3
        0x68 -> :sswitch_4
        0x6b -> :sswitch_f
        0x6d -> :sswitch_6
        0x73 -> :sswitch_7
        0x77 -> :sswitch_c
        0x79 -> :sswitch_1
        0x7a -> :sswitch_11
    .end sparse-switch
.end method

.method protected parseToken(Ljava/lang/String;[I)Ljava/lang/String;
    .locals 12
    .param p1, "pattern"    # Ljava/lang/String;
    .param p2, "indexRef"    # [I

    .prologue
    const/16 v11, 0x61

    const/16 v10, 0x5a

    const/16 v9, 0x41

    const/16 v8, 0x27

    const/4 v6, 0x0

    .line 594
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 596
    .local v0, "buf":Ljava/lang/StringBuilder;
    aget v2, p2, v6

    .line 597
    .local v2, "i":I
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 599
    .local v4, "length":I
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 600
    .local v1, "c":C
    if-lt v1, v9, :cond_0

    if-le v1, v10, :cond_1

    :cond_0
    if-lt v1, v11, :cond_2

    const/16 v7, 0x7a

    if-gt v1, v7, :cond_2

    .line 603
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 605
    :goto_0
    add-int/lit8 v7, v2, 0x1

    if-ge v7, v4, :cond_8

    .line 606
    add-int/lit8 v7, v2, 0x1

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 607
    .local v5, "peek":C
    if-ne v5, v1, :cond_8

    .line 608
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 609
    add-int/lit8 v2, v2, 0x1

    .line 613
    goto :goto_0

    .line 616
    .end local v5    # "peek":C
    :cond_2
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 618
    const/4 v3, 0x0

    .line 620
    .local v3, "inLiteral":Z
    :goto_1
    if-ge v2, v4, :cond_8

    .line 621
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 623
    if-ne v1, v8, :cond_5

    .line 624
    add-int/lit8 v7, v2, 0x1

    if-ge v7, v4, :cond_3

    add-int/lit8 v7, v2, 0x1

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v8, :cond_3

    .line 626
    add-int/lit8 v2, v2, 0x1

    .line 627
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 620
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 629
    :cond_3
    if-nez v3, :cond_4

    const/4 v3, 0x1

    :goto_3
    goto :goto_2

    :cond_4
    move v3, v6

    goto :goto_3

    .line 631
    :cond_5
    if-nez v3, :cond_9

    if-lt v1, v9, :cond_6

    if-le v1, v10, :cond_7

    :cond_6
    if-lt v1, v11, :cond_9

    const/16 v7, 0x7a

    if-gt v1, v7, :cond_9

    .line 633
    :cond_7
    add-int/lit8 v2, v2, -0x1

    .line 641
    .end local v3    # "inLiteral":Z
    :cond_8
    aput v2, p2, v6

    .line 642
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6

    .line 636
    .restart local v3    # "inLiteral":Z
    :cond_9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2
.end method

.method protected selectNumberRule(II)Lorg/apache/commons/lang3/time/FastDateFormat$NumberRule;
    .locals 1
    .param p1, "field"    # I
    .param p2, "padding"    # I

    .prologue
    .line 653
    packed-switch p2, :pswitch_data_0

    .line 659
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateFormat$PaddedNumberField;

    invoke-direct {v0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateFormat$PaddedNumberField;-><init>(II)V

    :goto_0
    return-object v0

    .line 655
    :pswitch_0
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateFormat$UnpaddedNumberField;

    invoke-direct {v0, p1}, Lorg/apache/commons/lang3/time/FastDateFormat$UnpaddedNumberField;-><init>(I)V

    goto :goto_0

    .line 657
    :pswitch_1
    new-instance v0, Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitNumberField;

    invoke-direct {v0, p1}, Lorg/apache/commons/lang3/time/FastDateFormat$TwoDigitNumberField;-><init>(I)V

    goto :goto_0

    .line 653
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 871
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FastDateFormat["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/commons/lang3/time/FastDateFormat;->mPattern:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
