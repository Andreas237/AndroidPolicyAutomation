.class public Lo/aci;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;[BII)Z
    .locals 6

    .line 141
    invoke-static {p1, p2}, Lo/aci;->d([BI)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 142
    const/4 v0, 0x0

    return v0

    .line 144
    :cond_0
    const-string v0, "%04x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lo/aci;->d([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 145
    const/4 v0, 0x4

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 146
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--16--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static b([BLjava/util/UUID;)Z
    .locals 10

    .line 28
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 29
    :goto_0
    if-eqz p0, :cond_16

    .line 30
    const/4 v3, 0x0

    .line 31
    if-nez v2, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 33
    :goto_1
    array-length v7, p0

    .line 34
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_14

    .line 35
    aget-byte v5, p0, v8

    .line 36
    if-gtz v5, :cond_3

    .line 37
    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    const/4 v0, 0x1

    goto :goto_3

    :cond_2
    const/4 v0, 0x0

    :goto_3
    return v0

    .line 39
    :cond_3
    add-int/lit8 v8, v8, 0x1

    aget-byte v6, p0, v8

    .line 41
    if-eqz v2, :cond_11

    .line 42
    const/4 v0, 0x2

    if-eq v6, v0, :cond_4

    const/4 v0, 0x3

    if-ne v6, v0, :cond_8

    .line 43
    :cond_4
    add-int/lit8 v9, v8, 0x1

    :goto_4
    add-int v0, v8, v5

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_7

    .line 44
    if-nez v4, :cond_5

    const/4 v0, 0x2

    invoke-static {v2, p0, v9, v0}, Lo/aci;->a(Ljava/lang/String;[BII)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    .line 43
    :goto_5
    add-int/lit8 v9, v9, 0x2

    goto :goto_4

    :cond_7
    goto :goto_a

    .line 45
    :cond_8
    const/4 v0, 0x4

    if-eq v6, v0, :cond_9

    const/4 v0, 0x5

    if-ne v6, v0, :cond_d

    .line 46
    :cond_9
    add-int/lit8 v9, v8, 0x1

    :goto_6
    add-int v0, v8, v5

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_c

    .line 47
    if-nez v4, :cond_a

    const/4 v0, 0x4

    invoke-static {v2, p0, v9, v0}, Lo/aci;->c(Ljava/lang/String;[BII)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    const/4 v4, 0x1

    goto :goto_7

    :cond_b
    const/4 v4, 0x0

    .line 46
    :goto_7
    add-int/lit8 v9, v9, 0x4

    goto :goto_6

    :cond_c
    goto :goto_a

    .line 48
    :cond_d
    const/4 v0, 0x6

    if-eq v6, v0, :cond_e

    const/4 v0, 0x7

    if-ne v6, v0, :cond_11

    .line 49
    :cond_e
    add-int/lit8 v9, v8, 0x1

    :goto_8
    add-int v0, v8, v5

    add-int/lit8 v0, v0, -0x1

    if-ge v9, v0, :cond_11

    .line 50
    if-nez v4, :cond_f

    const/16 v0, 0x10

    invoke-static {v2, p0, v9, v0}, Lo/aci;->e(Ljava/lang/String;[BII)Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_f
    const/4 v4, 0x1

    goto :goto_9

    :cond_10
    const/4 v4, 0x0

    .line 49
    :goto_9
    add-int/lit8 v9, v9, 0x10

    goto :goto_8

    .line 53
    :cond_11
    :goto_a
    const/4 v0, 0x1

    if-ne v6, v0, :cond_13

    .line 54
    add-int/lit8 v0, v8, 0x1

    aget-byte v9, p0, v0

    .line 55
    and-int/lit8 v0, v9, 0x3

    if-lez v0, :cond_12

    const/4 v3, 0x1

    goto :goto_b

    :cond_12
    const/4 v3, 0x0

    .line 57
    :cond_13
    :goto_b
    add-int/lit8 v0, v5, -0x1

    add-int/2addr v8, v0

    .line 34
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_2

    .line 59
    :cond_14
    if-eqz v3, :cond_15

    if-eqz v4, :cond_15

    const/4 v0, 0x1

    goto :goto_c

    :cond_15
    const/4 v0, 0x0

    :goto_c
    return v0

    .line 61
    :cond_16
    const/4 v0, 0x0

    return v0
.end method

.method private static c(Ljava/lang/String;[BII)Z
    .locals 6

    .line 155
    add-int v0, p2, p3

    add-int/lit8 v0, v0, -0x4

    invoke-static {p1, v0}, Lo/aci;->d([BI)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 156
    const/4 v0, 0x0

    return v0

    .line 158
    :cond_0
    const-string v0, "%04x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    add-int v2, p2, p3

    add-int/lit8 v2, v2, -0x4

    invoke-static {p1, v2}, Lo/aci;->d([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 159
    const/4 v0, 0x4

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 160
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--32--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static d([BI)I
    .locals 6

    .line 179
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "decodeUuid16 data.length:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, p0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "decodeUuid16 start:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    array-length v0, p0

    add-int/lit8 v1, p1, 0x1

    if-le v0, v1, :cond_0

    .line 182
    aget-byte v0, p0, p1

    and-int/lit16 v4, v0, 0xff

    .line 183
    add-int/lit8 v0, p1, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v5, v0, 0xff

    .line 184
    shl-int/lit8 v0, v5, 0x8

    shl-int/lit8 v1, v4, 0x0

    or-int/2addr v0, v1

    return v0

    .line 186
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decodeUuid16 ArrayIndexOutOfBoundsException data.length <= start + 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, -0x1

    return v0
.end method

.method private static e(Ljava/lang/String;[BII)Z
    .locals 6

    .line 169
    add-int v0, p2, p3

    add-int/lit8 v0, v0, -0x4

    invoke-static {p1, v0}, Lo/aci;->d([BI)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 170
    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    const-string v0, "%04x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    add-int v2, p2, p3

    add-int/lit8 v2, v2, -0x4

    invoke-static {p1, v2}, Lo/aci;->d([BI)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 173
    const/4 v0, 0x4

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 175
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
