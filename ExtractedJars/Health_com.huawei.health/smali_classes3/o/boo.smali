.class public final Lo/boo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a([B)Ljava/lang/String;
    .locals 7

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    if-eqz p0, :cond_1

    .line 31
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-byte v5, v2, v4

    .line 33
    and-int/lit16 v6, v5, 0xff

    .line 34
    const/16 v0, 0x10

    if-ge v6, v0, :cond_0

    .line 36
    const/16 v0, 0x30

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
