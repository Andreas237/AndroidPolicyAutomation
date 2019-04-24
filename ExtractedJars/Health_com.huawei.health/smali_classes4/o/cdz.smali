.class public Lo/cdz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 4

    .line 23
    if-nez p0, :cond_0

    .line 24
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shotScreen view is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 25
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    instance-of v0, p0, Landroid/widget/ScrollView;

    if-eqz v0, :cond_1

    .line 29
    move-object v0, p0

    check-cast v0, Landroid/widget/ScrollView;

    invoke-static {v0}, Lo/cdz;->e(Landroid/widget/ScrollView;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 31
    :cond_1
    invoke-static {p0}, Lo/cdz;->d(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static d(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 6

    .line 130
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 131
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmapByView 2 view.height == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/4 v0, 0x0

    return-object v0

    .line 134
    :cond_0
    const/4 v4, 0x0

    .line 138
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 142
    goto :goto_0

    .line 140
    :catch_0
    move-exception v5

    .line 141
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    :goto_0
    if-nez v4, :cond_1

    .line 145
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmapByView view No enough memory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_1
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 150
    invoke-virtual {p0, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 151
    return-object v4
.end method

.method private static e(Landroid/widget/ScrollView;)Landroid/graphics/Bitmap;
    .locals 7

    .line 58
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 59
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmapByView scrollView.height == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x0

    .line 65
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getChildCount()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 66
    invoke-virtual {p0, v6}, Landroid/widget/ScrollView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v4, v0

    .line 65
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 71
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/ScrollView;->getWidth()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v4, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 75
    goto :goto_1

    .line 73
    :catch_0
    move-exception v6

    .line 74
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/OutOfMemoryError;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    :goto_1
    if-nez v5, :cond_2

    .line 78
    const-string v0, "Track_ScreenShotUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBitmapByView 1 No enough memory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_2
    new-instance v6, Landroid/graphics/Canvas;

    invoke-direct {v6, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 83
    invoke-virtual {p0, v6}, Landroid/widget/ScrollView;->draw(Landroid/graphics/Canvas;)V

    .line 84
    return-object v5
.end method
