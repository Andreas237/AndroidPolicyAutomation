.class public Lcom/sina/weibo/sdk/utils/ResourceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DRAWABLE:Ljava/lang/String; = "drawable"

.field private static final DRAWABLE_HDPI:Ljava/lang/String; = "drawable-hdpi"

.field private static final DRAWABLE_LDPI:Ljava/lang/String; = "drawable-ldpi"

.field private static final DRAWABLE_MDPI:Ljava/lang/String; = "drawable-mdpi"

.field private static final DRAWABLE_XHDPI:Ljava/lang/String; = "drawable-xhdpi"

.field private static final DRAWABLE_XXHDPI:Ljava/lang/String; = "drawable-xxhdpi"

.field private static final PRE_INSTALL_DRAWBLE_PATHS:[Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    const-class v0, Lcom/sina/weibo/sdk/utils/ResourceManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    .line 61
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "drawable-xxhdpi"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "drawable-xhdpi"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "drawable-hdpi"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "drawable-mdpi"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "drawable-ldpi"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "drawable"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->PRE_INSTALL_DRAWBLE_PATHS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createColorStateList(II)Landroid/content/res/ColorStateList;
    .locals 4

    .line 335
    const/4 v0, 0x4

    new-array v2, v0, [I

    const/4 v0, 0x0

    aput p1, v2, v0

    const/4 v0, 0x1

    aput p1, v2, v0

    const/4 v0, 0x2

    aput p1, v2, v0

    const/4 v0, 0x3

    aput p0, v2, v0

    .line 336
    const/4 v0, 0x4

    new-array v3, v0, [[I

    .line 337
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 338
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 339
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 340
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 341
    new-instance v0, Landroid/content/res/ColorStateList;

    invoke-direct {v0, v3, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v0

    :array_0
    .array-data 4
        0x10100a7
    .end array-data

    :array_1
    .array-data 4
        0x10100a1
    .end array-data

    :array_2
    .array-data 4
        0x101009c
    .end array-data
.end method

.method public static createStateListDrawable(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/StateListDrawable;
    .locals 5

    .line 345
    const/4 v2, 0x0

    .line 346
    const-string v0, ".9"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 347
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getNinePatchDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    .line 349
    :cond_0
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 351
    :goto_0
    const/4 v3, 0x0

    .line 352
    const-string v0, ".9"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    .line 353
    invoke-static {p0, p2}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getNinePatchDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_1

    .line 355
    :cond_1
    invoke-static {p0, p2}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 357
    :goto_1
    new-instance v4, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 358
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v4, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 359
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    invoke-virtual {v4, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 360
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    invoke-virtual {v4, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 361
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {v4, v0, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 362
    return-object v4

    :array_0
    .array-data 4
        0x10100a7
    .end array-data

    :array_1
    .array-data 4
        0x10100a1
    .end array-data

    :array_2
    .array-data 4
        0x101009c
    .end array-data
.end method

.method public static createStateListDrawable(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/StateListDrawable;
    .locals 6

    .line 367
    const/4 v2, 0x0

    .line 368
    const-string v0, ".9"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    .line 369
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getNinePatchDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    .line 371
    :cond_0
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 373
    :goto_0
    const/4 v3, 0x0

    .line 374
    const-string v0, ".9"

    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_1

    .line 375
    invoke-static {p0, p3}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getNinePatchDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_1

    .line 377
    :cond_1
    invoke-static {p0, p3}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 379
    :goto_1
    const/4 v4, 0x0

    .line 380
    const-string v0, ".9"

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_2

    .line 381
    invoke-static {p0, p2}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getNinePatchDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_2

    .line 383
    :cond_2
    invoke-static {p0, p2}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 385
    :goto_2
    new-instance v5, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 386
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v5, v0, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 387
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    invoke-virtual {v5, v0, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 388
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    invoke-virtual {v5, v0, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 389
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    invoke-virtual {v5, v0, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 390
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {v5, v0, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 391
    return-object v5

    :array_0
    .array-data 4
        0x10100a7
    .end array-data

    :array_1
    .array-data 4
        0x10100a1
    .end array-data

    :array_2
    .array-data 4
        0x101009c
    .end array-data

    :array_3
    .array-data 4
        0x101000e
    .end array-data
.end method

.method public static dp2px(Landroid/content/Context;I)I
    .locals 6

    .line 329
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 330
    int-to-float v0, p1

    iget v1, v4, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-double v0, v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v2

    double-to-int v5, v0

    .line 331
    return v5
.end method

.method private static extractDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 310
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 311
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 312
    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 314
    iget v0, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v0, v3, Landroid/util/TypedValue;->density:I

    .line 316
    .line 317
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 316
    invoke-static {v0, v3, v1, p1}, Landroid/graphics/drawable/Drawable;->createFromResourceStream(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 318
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 319
    return-object v4
.end method

.method private static extractView(Landroid/content/Context;Ljava/lang/String;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 302
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->openXmlResourceParser(Ljava/lang/String;)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    .line 303
    const-string v0, "layout_inflater"

    .line 304
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 305
    invoke-virtual {v2, v1, p2}, Landroid/view/LayoutInflater;->inflate(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private static getAppropriatePathOfDrawable(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 144
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    const-string v1, "id is NOT correct!"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_0
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getCurrentDpiFolder(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 151
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    const-string v1, "find Appropriate path..."

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const/4 v3, -0x1

    .line 154
    const/4 v4, -0x1

    .line 155
    const/4 v5, -0x1

    .line 156
    const/4 v6, 0x0

    :goto_0
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->PRE_INSTALL_DRAWBLE_PATHS:[Ljava/lang/String;

    array-length v0, v0

    if-ge v6, v0, :cond_5

    .line 157
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->PRE_INSTALL_DRAWBLE_PATHS:[Ljava/lang/String;

    aget-object v0, v0, v6

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    move v4, v6

    .line 160
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/sina/weibo/sdk/utils/ResourceManager;->PRE_INSTALL_DRAWBLE_PATHS:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 161
    invoke-static {p0, v7}, Lcom/sina/weibo/sdk/utils/ResourceManager;->isFileExisted(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 162
    if-ne v4, v6, :cond_2

    .line 163
    return-object v7

    .line 164
    :cond_2
    if-gez v4, :cond_3

    .line 165
    move v3, v6

    goto :goto_1

    .line 167
    :cond_3
    move v5, v6

    .line 168
    goto :goto_2

    .line 156
    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 173
    :cond_5
    :goto_2
    const/4 v6, -0x1

    .line 174
    if-lez v3, :cond_7

    if-lez v5, :cond_7

    .line 175
    sub-int v0, v4, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int v1, v4, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-gt v0, v1, :cond_6

    move v6, v5

    goto :goto_3

    :cond_6
    move v6, v3

    :goto_3
    goto :goto_4

    .line 176
    :cond_7
    if-lez v3, :cond_8

    if-gez v5, :cond_8

    .line 177
    move v6, v3

    goto :goto_4

    .line 178
    :cond_8
    if-gez v3, :cond_9

    if-lez v5, :cond_9

    .line 179
    move v6, v5

    goto :goto_4

    .line 181
    :cond_9
    const/4 v6, -0x1

    .line 182
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    const-string v1, "Not find the appropriate path for drawable"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :goto_4
    if-gez v6, :cond_a

    .line 187
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    const-string v1, "Not find the appropriate path for drawable"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const/4 v0, 0x0

    return-object v0

    .line 190
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/sina/weibo/sdk/utils/ResourceManager;->PRE_INSTALL_DRAWBLE_PATHS:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getCurrentDpiFolder(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 284
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 285
    iget v2, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 286
    const/16 v0, 0x78

    if-gt v2, v0, :cond_0

    .line 287
    const-string v0, "drawable-ldpi"

    return-object v0

    .line 288
    :cond_0
    const/16 v0, 0x78

    if-le v2, v0, :cond_1

    const/16 v0, 0xa0

    if-gt v2, v0, :cond_1

    .line 289
    const-string v0, "drawable-mdpi"

    return-object v0

    .line 290
    :cond_1
    const/16 v0, 0xa0

    if-le v2, v0, :cond_2

    const/16 v0, 0xf0

    if-gt v2, v0, :cond_2

    .line 291
    const-string v0, "drawable-hdpi"

    return-object v0

    .line 292
    :cond_2
    const/16 v0, 0xf0

    if-le v2, v0, :cond_3

    const/16 v0, 0x140

    if-gt v2, v0, :cond_3

    .line 293
    const-string v0, "drawable-xhdpi"

    return-object v0

    .line 295
    :cond_3
    const-string v0, "drawable-xxhdpi"

    return-object v0
.end method

.method public static getDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 99
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getAppropriatePathOfDrawable(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 100
    const/4 v0, 0x0

    invoke-static {p0, v1, v0}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawableFromAssert(Landroid/content/Context;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private static getDrawableFromAssert(Landroid/content/Context;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;
    .locals 16

    .line 206
    const/4 v7, 0x0

    .line 207
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v8

    .line 208
    const/4 v9, 0x0

    .line 210
    move-object/from16 v0, p1

    :try_start_0
    invoke-virtual {v8, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v9, v0

    .line 211
    if-eqz v9, :cond_1

    .line 212
    invoke-static {v9}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 213
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    .line 214
    if-eqz p2, :cond_0

    .line 215
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v12

    .line 216
    new-instance v0, Landroid/content/res/Resources;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    move-object v2, v11

    move-object v3, v12

    invoke-direct {v0, v1, v2, v3}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    move-object v13, v0

    .line 217
    new-instance v0, Landroid/graphics/drawable/NinePatchDrawable;

    .line 218
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v3

    new-instance v4, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v4, v1, v2, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v1, v13

    move-object v2, v10

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V

    move-object v7, v0

    .line 219
    goto :goto_0

    .line 220
    :cond_0
    iget v0, v11, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v10, v0}, Landroid/graphics/Bitmap;->setDensity(I)V

    .line 221
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, v10}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v7, v0

    .line 227
    :cond_1
    :goto_0
    if-eqz v9, :cond_3

    .line 229
    :try_start_1
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 232
    goto :goto_1

    .line 230
    :catch_0
    move-exception v10

    .line 231
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 234
    :goto_1
    const/4 v9, 0x0

    goto :goto_4

    .line 224
    :catch_1
    move-exception v10

    .line 225
    :try_start_2
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 227
    if-eqz v9, :cond_3

    .line 229
    :try_start_3
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 232
    goto :goto_2

    .line 230
    :catch_2
    move-exception v10

    .line 231
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 234
    :goto_2
    const/4 v9, 0x0

    goto :goto_4

    .line 227
    :catchall_0
    move-exception v14

    if-eqz v9, :cond_2

    .line 229
    :try_start_4
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 232
    goto :goto_3

    .line 230
    :catch_3
    move-exception v15

    .line 231
    invoke-virtual {v15}, Ljava/io/IOException;->printStackTrace()V

    .line 234
    :goto_3
    const/4 v9, 0x0

    :cond_2
    throw v14

    .line 238
    :cond_3
    :goto_4
    return-object v7
.end method

.method public static getLanguage()Ljava/util/Locale;
    .locals 3

    .line 123
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 124
    sget-object v0, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    .line 125
    invoke-virtual {v0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "zh"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    :cond_0
    return-object v2

    .line 129
    :cond_1
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    return-object v0
.end method

.method public static getNinePatchDrawable(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 112
    invoke-static {p0, p1}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getAppropriatePathOfDrawable(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 113
    const/4 v0, 0x1

    invoke-static {p0, v1, v0}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getDrawableFromAssert(Landroid/content/Context;Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static getString(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 80
    invoke-static {}, Lcom/sina/weibo/sdk/utils/ResourceManager;->getLanguage()Ljava/util/Locale;

    move-result-object v2

    .line 81
    sget-object v0, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "zh"

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    :cond_0
    return-object p2

    .line 83
    :cond_1
    sget-object v0, Ljava/util/Locale;->TRADITIONAL_CHINESE:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "zh"

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TW"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 84
    :cond_2
    return-object p3

    .line 86
    :cond_3
    return-object p1
.end method

.method private static isFileExisted(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 9

    .line 249
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 253
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    .line 254
    const/4 v4, 0x0

    .line 256
    :try_start_0
    invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 257
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] existed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    const/4 v5, 0x1

    .line 264
    if-eqz v4, :cond_2

    .line 265
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 270
    :cond_2
    goto :goto_0

    .line 267
    :catch_0
    move-exception v6

    .line 268
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    .line 269
    const/4 v4, 0x0

    .line 270
    :goto_0
    return v5

    .line 259
    :catch_1
    move-exception v5

    .line 261
    :try_start_2
    sget-object v0, Lcom/sina/weibo/sdk/utils/ResourceManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] NOT existed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 264
    if-eqz v4, :cond_3

    .line 265
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 270
    :cond_3
    goto :goto_2

    .line 267
    :catch_2
    move-exception v5

    .line 268
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 269
    const/4 v4, 0x0

    .line 271
    goto :goto_2

    .line 263
    :catchall_0
    move-exception v7

    .line 264
    if-eqz v4, :cond_4

    .line 265
    :try_start_4
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 270
    :cond_4
    goto :goto_1

    .line 267
    :catch_3
    move-exception v8

    .line 268
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 269
    const/4 v4, 0x0

    .line 270
    :goto_1
    throw v7

    .line 273
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public static readCountryFromAsset(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 395
    const-string v2, ""

    .line 397
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 398
    if-eqz v3, :cond_0

    .line 399
    new-instance v4, Ljava/io/DataInputStream;

    invoke-direct {v4, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 400
    invoke-virtual {v4}, Ljava/io/DataInputStream;->available()I

    move-result v5

    .line 401
    new-array v6, v5, [B

    .line 402
    invoke-virtual {v4, v6}, Ljava/io/DataInputStream;->read([B)I

    .line 404
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v2, v0

    .line 405
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 409
    :cond_0
    goto :goto_0

    .line 407
    :catch_0
    move-exception v3

    .line 408
    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    .line 410
    :goto_0
    return-object v2
.end method
