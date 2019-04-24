.class public Lo/aef;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b([BII)Ljava/lang/String;
    .locals 6

    .line 9
    new-instance v3, Ljava/lang/StringBuffer;

    add-int v0, p2, p2

    add-int/lit8 v0, v0, 0x2

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 12
    const/4 v5, 0x0

    :goto_0
    if-ge v5, p2, :cond_1

    .line 13
    add-int v0, p1, v5

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    .line 15
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 16
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 19
    :cond_0
    const-string v0, "%S"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 12
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(BI)Z
    .locals 4

    .line 26
    const/16 v0, 0x8

    new-array v2, v0, [Z

    .line 27
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    const/16 v0, 0x8

    if-ge v3, v0, :cond_1

    .line 28
    and-int/lit8 v0, p0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    aput-boolean v0, v2, v3

    .line 29
    shr-int/lit8 v0, p0, 0x1

    int-to-byte p0, v0

    .line 27
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 31
    :cond_1
    aget-boolean v0, v2, p1

    return v0
.end method
