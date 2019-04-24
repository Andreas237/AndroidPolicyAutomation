.class public Lorg/apache/commons/lang3/EnumUtils;
.super Ljava/lang/Object;
.source "EnumUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    return-void
.end method

.method public static getEnum(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    .locals 2
    .param p1, "enumName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum",
            "<TE;>;>(",
            "Ljava/lang/Class",
            "<TE;>;",
            "Ljava/lang/String;",
            ")TE;"
        }
    .end annotation

    .prologue
    .local p0, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<TE;>;"
    const/4 v1, 0x0

    .line 107
    if-nez p1, :cond_0

    .line 113
    :goto_0
    return-object v1

    .line 111
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 112
    :catch_0
    move-exception v0

    .line 113
    .local v0, "ex":Ljava/lang/IllegalArgumentException;
    goto :goto_0
.end method

.method public static getEnumList(Ljava/lang/Class;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum",
            "<TE;>;>(",
            "Ljava/lang/Class",
            "<TE;>;)",
            "Ljava/util/List",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 69
    .local p0, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<TE;>;"
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static getEnumMap(Ljava/lang/Class;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum",
            "<TE;>;>(",
            "Ljava/lang/Class",
            "<TE;>;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "TE;>;"
        }
    .end annotation

    .prologue
    .line 52
    .local p0, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<TE;>;"
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 53
    .local v4, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;TE;>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Enum;

    .local v0, "arr$":[Ljava/lang/Enum;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 54
    .local v1, "e":Ljava/lang/Enum;, "TE;"
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    .end local v1    # "e":Ljava/lang/Enum;, "TE;"
    :cond_0
    return-object v4
.end method

.method public static isValidEnum(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 2
    .param p1, "enumName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Enum",
            "<TE;>;>(",
            "Ljava/lang/Class",
            "<TE;>;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .prologue
    .local p0, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<TE;>;"
    const/4 v1, 0x0

    .line 84
    if-nez p1, :cond_0

    .line 91
    :goto_0
    return v1

    .line 88
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    const/4 v1, 0x1

    goto :goto_0

    .line 90
    :catch_0
    move-exception v0

    .line 91
    .local v0, "ex":Ljava/lang/IllegalArgumentException;
    goto :goto_0
.end method
