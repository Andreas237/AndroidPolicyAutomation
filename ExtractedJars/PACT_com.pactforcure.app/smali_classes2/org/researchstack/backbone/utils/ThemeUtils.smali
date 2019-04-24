.class public Lorg/researchstack/backbone/utils/ThemeUtils;
.super Ljava/lang/Object;
.source "ThemeUtils.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAccentColor(Landroid/content/Context;)I
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v6, 0x0

    .line 28
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 29
    .local v2, "typedValue":Landroid/util/TypedValue;
    iget v3, v2, Landroid/util/TypedValue;->data:I

    const/4 v4, 0x1

    new-array v4, v4, [I

    sget v5, Lorg/researchstack/backbone/R$attr;->colorAccent:I

    aput v5, v4, v6

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 31
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    .line 32
    .local v1, "color":I
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 33
    return v1
.end method

.method public static getPassCodeTheme(Landroid/content/Context;)I
    .locals 7
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v6, 0x0

    .line 38
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 39
    .local v2, "typedValue":Landroid/util/TypedValue;
    iget v3, v2, Landroid/util/TypedValue;->data:I

    const/4 v4, 0x1

    new-array v4, v4, [I

    sget v5, Lorg/researchstack/backbone/R$attr;->passcodeTheme:I

    aput v5, v4, v6

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 41
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v6, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 42
    .local v1, "themeResId":I
    if-nez v1, :cond_0

    .line 44
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Theme must define attribute passCodeTheme or extend from @style/Base.Theme.Backbone"

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 47
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 48
    return v1
.end method

.method public static getTextColorPrimary(Landroid/content/Context;)I
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v5, 0x0

    .line 18
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 19
    .local v3, "typedValue":Landroid/util/TypedValue;
    const/4 v4, 0x1

    new-array v1, v4, [I

    const v4, 0x1010036

    aput v4, v1, v5

    .line 20
    .local v1, "attribute":[I
    iget v4, v3, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {p0, v4, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 21
    .local v0, "array":Landroid/content/res/TypedArray;
    const/high16 v4, -0x1000000

    invoke-virtual {v0, v5, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 22
    .local v2, "color":I
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    return v2
.end method

.method public static getTheme(Landroid/content/Context;)I
    .locals 6
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v4, 0x0

    .line 61
    :try_start_0
    const-class v2, Landroid/content/Context;

    .line 62
    .local v2, "wrapper":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v3, "getThemeResId"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 63
    .local v1, "method":Ljava/lang/reflect/Method;
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 64
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    .line 70
    .end local v1    # "method":Ljava/lang/reflect/Method;
    .end local v2    # "wrapper":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    return v3

    .line 66
    :catch_0
    move-exception v0

    .line 68
    .local v0, "e":Ljava/lang/Exception;
    const-class v3, Lorg/researchstack/backbone/utils/ThemeUtils;

    invoke-static {v3, v0}, Lorg/researchstack/backbone/utils/LogExt;->e(Ljava/lang/Class;Ljava/lang/Throwable;)V

    move v3, v4

    .line 70
    goto :goto_0
.end method
