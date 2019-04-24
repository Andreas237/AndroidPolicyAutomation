.class public final Luk/co/chrisjenx/calligraphy/CalligraphyUtils;
.super Ljava/lang/Object;
.source "CalligraphyUtils.java"


# static fields
.field public static final ANDROID_ATTR_TEXT_APPEARANCE:[I

.field private static sAppCompatViewCheck:Ljava/lang/Boolean;

.field private static sToolbarCheck:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 25
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010034

    aput v2, v0, v1

    sput-object v0, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->ANDROID_ATTR_TEXT_APPEARANCE:[I

    .line 315
    sput-object v3, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sToolbarCheck:Ljava/lang/Boolean;

    .line 316
    sput-object v3, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sAppCompatViewCheck:Ljava/lang/Boolean;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 352
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 353
    return-void
.end method

.method static applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "config"    # Luk/co/chrisjenx/calligraphy/CalligraphyConfig;

    .prologue
    .line 119
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Z)V

    .line 120
    return-void
.end method

.method public static applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Ljava/lang/String;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "config"    # Luk/co/chrisjenx/calligraphy/CalligraphyConfig;
    .param p3, "textViewFont"    # Ljava/lang/String;

    .prologue
    .line 138
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Ljava/lang/String;Z)V

    .line 139
    return-void
.end method

.method static applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Ljava/lang/String;Z)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "config"    # Luk/co/chrisjenx/calligraphy/CalligraphyConfig;
    .param p3, "textViewFont"    # Ljava/lang/String;
    .param p4, "deferred"    # Z

    .prologue
    .line 142
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 147
    :cond_0
    :goto_0
    return-void

    .line 143
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0, p1, p3, p4}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 146
    :cond_2
    invoke-static {p0, p1, p2, p4}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Z)V

    goto :goto_0
.end method

.method static applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Luk/co/chrisjenx/calligraphy/CalligraphyConfig;Z)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "config"    # Luk/co/chrisjenx/calligraphy/CalligraphyConfig;
    .param p3, "deferred"    # Z

    .prologue
    .line 123
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-void

    .line 124
    :cond_1
    invoke-virtual {p2}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->isFontSet()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {p2}, Luk/co/chrisjenx/calligraphy/CalligraphyConfig;->getFontPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Ljava/lang/String;Z)Z

    goto :goto_0
.end method

.method public static applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Ljava/lang/String;)Z
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "filePath"    # Ljava/lang/String;

    .prologue
    .line 108
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method static applyFontToTextView(Landroid/content/Context;Landroid/widget/TextView;Ljava/lang/String;Z)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "filePath"    # Ljava/lang/String;
    .param p3, "deferred"    # Z

    .prologue
    .line 112
    if-eqz p1, :cond_0

    if-nez p0, :cond_1

    :cond_0
    const/4 v2, 0x0

    .line 115
    :goto_0
    return v2

    .line 113
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 114
    .local v0, "assetManager":Landroid/content/res/AssetManager;
    invoke-static {v0, p2}, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->load(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    .line 115
    .local v1, "typeface":Landroid/graphics/Typeface;
    invoke-static {p1, v1, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/widget/TextView;Landroid/graphics/Typeface;Z)Z

    move-result v2

    goto :goto_0
.end method

.method public static applyFontToTextView(Landroid/widget/TextView;Landroid/graphics/Typeface;)Z
    .locals 1
    .param p0, "textView"    # Landroid/widget/TextView;
    .param p1, "typeface"    # Landroid/graphics/Typeface;

    .prologue
    .line 56
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyFontToTextView(Landroid/widget/TextView;Landroid/graphics/Typeface;Z)Z

    move-result v0

    return v0
.end method

.method public static applyFontToTextView(Landroid/widget/TextView;Landroid/graphics/Typeface;Z)Z
    .locals 2
    .param p0, "textView"    # Landroid/widget/TextView;
    .param p1, "typeface"    # Landroid/graphics/Typeface;
    .param p2, "deferred"    # Z

    .prologue
    .line 75
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 95
    :goto_0
    return v0

    .line 76
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    or-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 77
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 78
    if-eqz p2, :cond_2

    .line 79
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, p1}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->applyTypefaceSpan(Ljava/lang/CharSequence;Landroid/graphics/Typeface;)Ljava/lang/CharSequence;

    move-result-object v0

    sget-object v1, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p0, v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 80
    new-instance v0, Luk/co/chrisjenx/calligraphy/CalligraphyUtils$1;

    invoke-direct {v0, p1}, Luk/co/chrisjenx/calligraphy/CalligraphyUtils$1;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 95
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static applyTypefaceSpan(Ljava/lang/CharSequence;Landroid/graphics/Typeface;)Ljava/lang/CharSequence;
    .locals 6
    .param p0, "s"    # Ljava/lang/CharSequence;
    .param p1, "typeface"    # Landroid/graphics/Typeface;

    .prologue
    .line 35
    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 36
    instance-of v1, p0, Landroid/text/Spannable;

    if-nez v1, :cond_0

    .line 37
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .end local p0    # "s":Ljava/lang/CharSequence;
    .local v0, "s":Ljava/lang/CharSequence;
    move-object p0, v0

    .end local v0    # "s":Ljava/lang/CharSequence;
    .restart local p0    # "s":Ljava/lang/CharSequence;
    :cond_0
    move-object v1, p0

    .line 39
    check-cast v1, Landroid/text/Spannable;

    invoke-static {p1}, Luk/co/chrisjenx/calligraphy/TypefaceUtils;->getSpan(Landroid/graphics/Typeface;)Luk/co/chrisjenx/calligraphy/CalligraphyTypefaceSpan;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-interface {v1, v2, v3, v4, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 41
    :cond_1
    return-object p0
.end method

.method static canAddV7AppCompatViews()Z
    .locals 2

    .prologue
    .line 341
    sget-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sAppCompatViewCheck:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 343
    :try_start_0
    const-string v1, "android.support.v7.widget.AppCompatTextView"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 344
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sAppCompatViewCheck:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    :cond_0
    :goto_0
    sget-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sAppCompatViewCheck:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1

    .line 345
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :catch_0
    move-exception v0

    .line 346
    .restart local v0    # "e":Ljava/lang/ClassNotFoundException;
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sAppCompatViewCheck:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method static canCheckForV7Toolbar()Z
    .locals 2

    .prologue
    .line 324
    sget-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sToolbarCheck:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 326
    :try_start_0
    const-string v1, "android.support.v7.widget.Toolbar"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 327
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sToolbarCheck:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 332
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    :cond_0
    :goto_0
    sget-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sToolbarCheck:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1

    .line 328
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :catch_0
    move-exception v0

    .line 329
    .restart local v0    # "e":Ljava/lang/ClassNotFoundException;
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v1, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->sToolbarCheck:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method static pullFontPathFromStyle(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;
    .locals 4
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "attributeId"    # [I

    .prologue
    const/4 v2, 0x0

    .line 185
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move-object v0, v2

    .line 201
    :goto_0
    return-object v0

    .line 187
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 188
    .local v1, "typedArray":Landroid/content/res/TypedArray;
    if-eqz v1, :cond_3

    .line 191
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 192
    .local v0, "fontFromAttribute":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    if-nez v3, :cond_2

    .line 198
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .end local v0    # "fontFromAttribute":Ljava/lang/String;
    :cond_3
    :goto_1
    move-object v0, v2

    .line 201
    goto :goto_0

    .line 195
    :catch_0
    move-exception v3

    .line 198
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw v2
.end method

.method static pullFontPathFromTextAppearance(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;
    .locals 8
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "attributeId"    # [I

    .prologue
    const/4 v5, 0x0

    .line 213
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 241
    :cond_0
    :goto_0
    return-object v5

    .line 217
    :cond_1
    const/4 v3, -0x1

    .line 218
    .local v3, "textAppearanceId":I
    sget-object v6, Luk/co/chrisjenx/calligraphy/CalligraphyUtils;->ANDROID_ATTR_TEXT_APPEARANCE:[I

    invoke-virtual {p0, p1, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v4

    .line 219
    .local v4, "typedArrayAttr":Landroid/content/res/TypedArray;
    if-eqz v4, :cond_2

    .line 221
    const/4 v6, 0x0

    const/4 v7, -0x1

    :try_start_0
    invoke-virtual {v4, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    .line 226
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 230
    :cond_2
    invoke-virtual {p0, v3, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v2

    .line 231
    .local v2, "textAppearanceAttrs":Landroid/content/res/TypedArray;
    if-eqz v2, :cond_0

    .line 233
    const/4 v6, 0x0

    :try_start_1
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v5

    .line 238
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 222
    .end local v2    # "textAppearanceAttrs":Landroid/content/res/TypedArray;
    :catch_0
    move-exception v1

    .line 226
    .local v1, "ignored":Ljava/lang/Exception;
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .end local v1    # "ignored":Ljava/lang/Exception;
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    throw v5

    .line 234
    .restart local v2    # "textAppearanceAttrs":Landroid/content/res/TypedArray;
    :catch_1
    move-exception v0

    .line 238
    .local v0, "ignore":Ljava/lang/Exception;
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .end local v0    # "ignore":Ljava/lang/Exception;
    :catchall_1
    move-exception v5

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw v5
.end method

.method static pullFontPathFromTheme(Landroid/content/Context;II[I)Ljava/lang/String;
    .locals 11
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "styleAttrId"    # I
    .param p2, "subStyleAttrId"    # I
    .param p3, "attributeId"    # [I

    .prologue
    const/4 v8, 0x1

    const/4 v10, 0x0

    const/4 v9, -0x1

    const/4 v6, 0x0

    .line 282
    if-eq p1, v9, :cond_0

    if-nez p3, :cond_1

    .line 312
    :cond_0
    :goto_0
    return-object v6

    .line 285
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 286
    .local v4, "theme":Landroid/content/res/Resources$Theme;
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 288
    .local v5, "value":Landroid/util/TypedValue;
    invoke-virtual {v4, p1, v5, v8}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 289
    const/4 v2, -0x1

    .line 290
    .local v2, "subStyleResId":I
    iget v7, v5, Landroid/util/TypedValue;->resourceId:I

    new-array v8, v8, [I

    aput p2, v8, v10

    invoke-virtual {v4, v7, v8}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 292
    .local v1, "parentTypedArray":Landroid/content/res/TypedArray;
    const/4 v7, 0x0

    const/4 v8, -0x1

    :try_start_0
    invoke-virtual {v1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    .line 297
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 300
    if-eq v2, v9, :cond_0

    .line 301
    invoke-virtual {p0, v2, p3}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 302
    .local v3, "subTypedArray":Landroid/content/res/TypedArray;
    if-eqz v3, :cond_0

    .line 304
    const/4 v7, 0x0

    :try_start_1
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v6

    .line 309
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 293
    .end local v3    # "subTypedArray":Landroid/content/res/TypedArray;
    :catch_0
    move-exception v0

    .line 297
    .local v0, "ignore":Ljava/lang/Exception;
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .end local v0    # "ignore":Ljava/lang/Exception;
    :catchall_0
    move-exception v6

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw v6

    .line 305
    .restart local v3    # "subTypedArray":Landroid/content/res/TypedArray;
    :catch_1
    move-exception v0

    .line 309
    .restart local v0    # "ignore":Ljava/lang/Exception;
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .end local v0    # "ignore":Ljava/lang/Exception;
    :catchall_1
    move-exception v6

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    throw v6
.end method

.method static pullFontPathFromTheme(Landroid/content/Context;I[I)Ljava/lang/String;
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "styleAttrId"    # I
    .param p2, "attributeId"    # [I

    .prologue
    const/4 v0, 0x0

    .line 253
    const/4 v5, -0x1

    if-eq p1, v5, :cond_0

    if-nez p2, :cond_1

    .line 268
    :cond_0
    :goto_0
    return-object v0

    .line 256
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    .line 257
    .local v2, "theme":Landroid/content/res/Resources$Theme;
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 259
    .local v4, "value":Landroid/util/TypedValue;
    const/4 v5, 0x1

    invoke-virtual {v2, p1, v4, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 260
    iget v5, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v2, v5, p2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 262
    .local v3, "typedArray":Landroid/content/res/TypedArray;
    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v3, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 268
    .local v0, "font":Ljava/lang/String;
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 264
    .end local v0    # "font":Ljava/lang/String;
    :catch_0
    move-exception v1

    .line 268
    .local v1, "ignore":Ljava/lang/Exception;
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .end local v1    # "ignore":Ljava/lang/Exception;
    :catchall_0
    move-exception v5

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    throw v5
.end method

.method static pullFontPathFromView(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ljava/lang/String;
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "attrs"    # Landroid/util/AttributeSet;
    .param p2, "attributeId"    # [I

    .prologue
    const/4 v3, 0x0

    .line 158
    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    .line 172
    :cond_0
    :goto_0
    return-object v3

    .line 163
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/4 v5, 0x0

    aget v5, p2, v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 169
    .local v0, "attributeName":Ljava/lang/String;
    const/4 v4, -0x1

    invoke-interface {p1, v3, v0, v4}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v2

    .line 170
    .local v2, "stringResourceId":I
    if-lez v2, :cond_2

    .line 171
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 164
    .end local v0    # "attributeName":Ljava/lang/String;
    .end local v2    # "stringResourceId":I
    :catch_0
    move-exception v1

    .line 166
    .local v1, "e":Landroid/content/res/Resources$NotFoundException;
    goto :goto_0

    .line 172
    .end local v1    # "e":Landroid/content/res/Resources$NotFoundException;
    .restart local v0    # "attributeName":Ljava/lang/String;
    .restart local v2    # "stringResourceId":I
    :cond_2
    invoke-interface {p1, v3, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0
.end method
