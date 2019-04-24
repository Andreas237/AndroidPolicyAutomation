.class public Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;
.super Lcom/ibotta/android/state/app/config/AbstractConfigParser;
.source "ReceiptFocusBlacklistConfigParser.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/state/app/config/AbstractConfigParser<",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;>;"
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
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/SharedPreferences;",
            ")V"
        }
    .end annotation

    .line 24
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/state/app/config/AbstractConfigParser;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Landroid/content/SharedPreferences;)V

    return-void
.end method

.method private parseList(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "="

    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 68
    array-length v1, p1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_6

    const/4 v1, 0x0

    .line 69
    aget-object v2, p1, v1

    const/4 v3, 0x1

    .line 70
    aget-object p1, p1, v3

    const/16 v4, 0x2b

    .line 72
    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/16 v5, 0x2d

    .line 73
    invoke-virtual {v2, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-ne v4, v6, :cond_0

    if-ne v5, v6, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    if-le v4, v6, :cond_1

    const-string v8, "+"

    const-string v9, ""

    .line 77
    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-le v5, v6, :cond_2

    const-string v8, "-"

    const-string v9, ""

    .line 80
    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    .line 83
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-le v4, v6, :cond_3

    .line 85
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    if-le v5, v6, :cond_4

    .line 87
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v4, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_1

    :cond_4
    if-eqz v7, :cond_5

    .line 89
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne v4, v2, :cond_5

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_6

    const-string v2, ","

    .line 94
    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 95
    array-length v2, p1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v2, :cond_6

    aget-object v5, p1, v4

    const-string v6, "Adding to receipt focus type blacklist: %1$s"

    .line 96
    new-array v7, v3, [Ljava/lang/Object;

    aput-object v5, v7, v1

    invoke-static {v6, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
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
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 49
    :try_start_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->parseList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 51
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->trackException(Ljava/lang/Exception;)V

    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_0

    .line 55
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    return-object p1
.end method

.method private trackException(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Failed to parse receipt focus blacklist."

    const/4 v1, 0x0

    .line 106
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic getPrefsValue()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getPrefsValue()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getPrefsValue()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0

    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic parseAppConfigValueIntoType()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->parseAppConfigValueIntoType()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected parseAppConfigValueIntoType()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->parseListAndHandleException(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/util/List;)V

    return-void
.end method

.method protected putPrefsValue(Landroid/content/SharedPreferences$Editor;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/SharedPreferences$Editor;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getPrefsKey()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/ibotta/android/state/app/config/receiptfocusblacklist/ReceiptFocusBlacklistConfigParser;->getAppConfigValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method
