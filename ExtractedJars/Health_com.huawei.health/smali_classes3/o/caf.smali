.class public final Lo/caf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static d([B)Ljava/lang/String;
    .locals 5

    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 29
    if-eqz p0, :cond_1

    .line 31
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_1

    .line 33
    aget-byte v0, p0, v3

    and-int/lit16 v4, v0, 0xff

    .line 34
    const/16 v0, 0x10

    if-ge v4, v0, :cond_0

    .line 36
    const/16 v0, 0x30

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    :cond_0
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
