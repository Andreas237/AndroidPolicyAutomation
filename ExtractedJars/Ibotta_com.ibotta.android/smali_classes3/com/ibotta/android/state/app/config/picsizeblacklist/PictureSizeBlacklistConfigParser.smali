.class public Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;
.super Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.source "PictureSizeBlacklistConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/AbstractConfigParser<",
        "Ljava/util/List<",
        "Landroid/util/Pair<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroid/content/SharedPreferences;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;",
            "Landroid/content/SharedPreferences;",
            ")V"
        }
    .end annotation

    .line 25
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method

.method private parseList(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_7

    const-string v1, "="

    .line 68
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 70
    array-length v1, p1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_7

    const/4 v1, 0x0

    .line 71
    aget-object v3, p1, v1

    const/4 v4, 0x1

    .line 72
    aget-object p1, p1, v4

    const/16 v5, 0x2b

    .line 74
    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/16 v6, 0x2d

    .line 75
    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const/4 v7, -0x1

    if-ne v5, v7, :cond_0

    if-ne v6, v7, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    if-le v5, v7, :cond_1

    const-string v9, "+"

    const-string v10, ""

    .line 79
    invoke-virtual {v3, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    :cond_1
    if-le v6, v7, :cond_2

    const-string v9, "-"

    const-string v10, ""

    .line 82
    invoke-virtual {v3, v9, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 85
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-le v5, v7, :cond_3

    .line 87
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    if-le v6, v7, :cond_4

    .line 89
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v5, v3, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    if-eqz v8, :cond_5

    .line 91
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v5, v3, :cond_5

    const/4 v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_7

    const-string v3, ","

    .line 96
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 97
    array-length v3, p1

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v3, :cond_7

    aget-object v6, p1, v5

    const-string v7, "x"

    .line 98
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 100
    array-length v7, v6

    if-lt v7, v2, :cond_6

    .line 101
    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 102
    aget-object v6, v6, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const-string v8, "Adding to picture size blacklist: w=%1$d, h=%2$d"

    .line 103
    new-array v9, v2, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v9, v4

    invoke-static {v8, v9}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    new-instance v8, Landroid/util/Pair;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v8, v7, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    return-object v0
.end method

.method private parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 50
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->parseList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->trackException(Ljava/lang/Exception;)V

    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_0

    .line 56
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    return-object p1
.end method

.method private trackException(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Failed to parse picture size blacklist."

    const/4 v1, 0x0

    .line 115
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic getPrefsValue()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getPrefsValue()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getPrefsValue()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    .line 34
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic parseAppConfigValueIntoType()Ljava/lang/Object;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->parseAppConfigValueIntoType()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected parseAppConfigValueIntoType()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 18
    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/util/List;)V

    return-void
.end method

.method protected putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences$Editor;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;)V"
        }
    .end annotation

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/picsizeblacklist/PictureSizeBlacklistConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
