.class public final Lokhttp3/internal/http/HeaderParser;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    return-void
.end method

.method public static parseSeconds(Ljava/lang/String;I)I
    .locals 4

    .line 52
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    .line 53
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 54
    const v0, 0x7fffffff

    return v0

    .line 55
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_1

    .line 56
    const/4 v0, 0x0

    return v0

    .line 58
    :cond_1
    long-to-int v0, v2

    return v0

    .line 60
    :catch_0
    move-exception v2

    .line 61
    return p1
.end method

.method public static skipUntil(Ljava/lang/String;ILjava/lang/String;)I
    .locals 2

    .line 24
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 26
    goto :goto_1

    .line 24
    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 29
    :cond_1
    :goto_1
    return p1
.end method

.method public static skipWhitespace(Ljava/lang/String;I)I
    .locals 2

    .line 37
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 39
    const/16 v0, 0x20

    if-eq v1, v0, :cond_0

    const/16 v0, 0x9

    if-eq v1, v0, :cond_0

    .line 40
    goto :goto_1

    .line 37
    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    return p1
.end method
