.class public final Luk/co/chrisjenx/calligraphy/TypefaceUtils;
.super Ljava/lang/Object;
.source "TypefaceUtils.java"


# static fields
.field private static final sCachedFonts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field private static final sCachedSpans:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/graphics/Typeface;",
            "Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedSpans:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    return-void
.end method

.method public static getSpan(Landroid/graphics/Typeface;)Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;
    .locals 3
    .param p0, "typeface"    # Landroid/graphics/Typeface;

    .prologue
    .line 55
    if-nez p0, :cond_0

    const/4 v0, 0x0

    .line 62
    :goto_0
    return-object v0

    .line 56
    :cond_0
    sget-object v2, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedSpans:Ljava/util/Map;

    monitor-enter v2

    .line 57
    :try_start_0
    sget-object v1, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedSpans:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 58
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;

    invoke-direct {v0, p0}, Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;-><init>(Landroid/graphics/Typeface;)V

    .line 59
    .local v0, "span":Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;
    sget-object v1, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedSpans:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    monitor-exit v2

    goto :goto_0

    .line 63
    .end local v0    # "span":Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;
    :catchall_0
    move-exception v1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 62
    :cond_1
    :try_start_1
    sget-object v1, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedSpans:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v1

    goto :goto_0
.end method

.method public static isLoaded(Landroid/graphics/Typeface;)Z
    .locals 1
    .param p0, "typeface"    # Landroid/graphics/Typeface;

    .prologue
    .line 73
    if-eqz p0, :cond_0

    sget-object v0, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 7
    .param p0, "assetManager"    # Landroid/content/res/AssetManager;
    .param p1, "filePath"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x0

    .line 32
    sget-object v3, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    monitor-enter v3

    .line 34
    :try_start_0
    sget-object v4, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    invoke-interface {v4, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 35
    invoke-static {p0, p1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 36
    .local v1, "typeface":Landroid/graphics/Typeface;
    sget-object v4, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    invoke-interface {v4, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :try_start_1
    monitor-exit v3

    .line 44
    .end local v1    # "typeface":Landroid/graphics/Typeface;
    :goto_0
    return-object v1

    .line 39
    :catch_0
    move-exception v0

    .line 40
    .local v0, "e":Ljava/lang/Exception;
    const-string v4, "Calligraphy"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Can\'t create asset from "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ". Make sure you have passed in the correct path and file name."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 41
    sget-object v4, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    const/4 v5, 0x0

    invoke-interface {v4, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    monitor-exit v3

    move-object v1, v2

    goto :goto_0

    .line 44
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_0
    sget-object v2, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->sCachedFonts:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Typeface;

    monitor-exit v3

    move-object v1, v2

    goto :goto_0

    .line 45
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2
.end method
