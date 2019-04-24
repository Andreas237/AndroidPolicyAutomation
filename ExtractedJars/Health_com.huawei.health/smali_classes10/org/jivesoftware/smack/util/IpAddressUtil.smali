.class public Lorg/jivesoftware/smack/util/IpAddressUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final IPV4_PATTERN:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-string v0, "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/jivesoftware/smack/util/IpAddressUtil;->IPV4_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isIPv4LiteralAddress(Ljava/lang/String;)Z
    .locals 6

    .line 27
    sget-object v0, Lorg/jivesoftware/smack/util/IpAddressUtil;->IPV4_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    .line 29
    const/4 v0, 0x0

    return v0

    .line 32
    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v2, v0, :cond_2

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 36
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    .line 39
    goto :goto_1

    .line 37
    :catch_0
    move-exception v5

    .line 38
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v5}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 40
    :goto_1
    const/16 v0, 0xff

    if-le v4, v0, :cond_1

    .line 41
    const/4 v0, 0x0

    return v0

    .line 32
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static isIPv6LiteralAddress(Ljava/lang/String;)Z
    .locals 3

    .line 48
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 49
    array-length v0, v2

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 50
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static isIpAddress(Ljava/lang/String;)Z
    .locals 1

    .line 57
    invoke-static {p0}, Lorg/jivesoftware/smack/util/IpAddressUtil;->isIPv4LiteralAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lorg/jivesoftware/smack/util/IpAddressUtil;->isIPv6LiteralAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
