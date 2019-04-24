.class public Lcom/scandit/base/system/SbSystemUtils;
.super Ljava/lang/Object;
.source "SbSystemUtils.java"


# static fields
.field private static displayDensity:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static byteArrayToHexStr([B)Ljava/lang/String;
    .locals 6

    .line 47
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 48
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 49
    aget-byte v2, p0, v1

    and-int/lit16 v3, v2, 0xf0

    shr-int/lit8 v3, v3, 0x4

    and-int/lit8 v2, v2, 0xf

    mul-int/lit8 v4, v1, 0x2

    const/16 v5, 0xa

    if-ge v3, v5, :cond_0

    add-int/lit8 v3, v3, 0x30

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x61

    sub-int/2addr v3, v5

    :goto_1
    int-to-char v3, v3

    .line 52
    aput-char v3, v0, v4

    add-int/lit8 v4, v4, 0x1

    if-ge v2, v5, :cond_1

    add-int/lit8 v2, v2, 0x30

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x61

    sub-int/2addr v2, v5

    :goto_2
    int-to-char v2, v2

    .line 53
    aput-char v2, v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 55
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static getAvailableSpaceInBytes(Ljava/io/File;)J
    .locals 5

    .line 63
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v3, p0

    mul-long v1, v1, v3

    return-wide v1
.end method

.method public static getAvailableSpaceInGB(Ljava/io/File;)J
    .locals 5

    .line 99
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v3, p0

    mul-long v1, v1, v3

    const-wide/32 v3, 0x40000000

    .line 101
    div-long/2addr v1, v3

    return-wide v1
.end method

.method public static getAvailableSpaceInKB(Ljava/io/File;)J
    .locals 5

    .line 76
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v3, p0

    mul-long v1, v1, v3

    const-wide/16 v3, 0x400

    .line 78
    div-long/2addr v1, v3

    return-wide v1
.end method

.method public static getAvailableSpaceInMB(Ljava/io/File;)J
    .locals 5

    .line 87
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result p0

    int-to-long v3, p0

    mul-long v1, v1, v3

    const-wide/32 v3, 0x100000

    .line 89
    div-long/2addr v1, v3

    return-wide v1
.end method

.method public static getDeviceDefaultOrientation(Landroid/content/Context;)I
    .locals 4

    const-string v0, "window"

    .line 152
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 154
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    .line 156
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    if-ne v0, v1, :cond_1

    .line 158
    :cond_0
    iget v2, p0, Landroid/content/res/Configuration;->orientation:I

    if-eq v2, v1, :cond_4

    :cond_1
    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x3

    if-ne v0, v3, :cond_3

    :cond_2
    iget p0, p0, Landroid/content/res/Configuration;->orientation:I

    if-ne p0, v2, :cond_3

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_0
    return v1
.end method

.method public static getDisplayRotation(Landroid/content/Context;)I
    .locals 6

    const/16 v0, 0x5a

    if-eqz p0, :cond_4

    const-string v1, "window"

    .line 112
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 113
    invoke-static {p0}, Lcom/scandit/base/system/SbSystemUtils;->getDeviceDefaultOrientation(Landroid/content/Context;)I

    move-result p0

    .line 114
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    const/16 v2, 0xb4

    const/16 v3, 0x10e

    const/4 v4, 0x0

    const/4 v5, 0x2

    packed-switch v1, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    if-ne p0, v5, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0xb4

    :goto_0
    return v0

    :pswitch_1
    if-ne p0, v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v2, 0x10e

    :goto_1
    return v2

    :pswitch_2
    if-ne p0, v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    return v3

    :pswitch_3
    if-ne p0, v5, :cond_3

    const/4 v0, 0x0

    :cond_3
    return v0

    :cond_4
    :goto_3
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getDisplaySize(Landroid/content/Context;)Landroid/graphics/Point;
    .locals 2

    const-string v0, "window"

    .line 174
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowManager;

    .line 175
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p0

    .line 177
    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {p0}, Landroid/view/Display;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/Display;->getHeight()I

    move-result p0

    invoke-direct {v0, v1, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method public static isDisplayLandscape(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_2

    .line 137
    invoke-static {p0}, Lcom/scandit/base/system/SbSystemUtils;->getDisplayRotation(Landroid/content/Context;)I

    move-result p0

    if-eqz p0, :cond_1

    const/16 v1, 0xb4

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0

    :cond_2
    return v0
.end method

.method public static pxFromDp(Landroid/content/Context;I)I
    .locals 1

    .line 34
    sget-object v0, Lcom/scandit/base/system/SbSystemUtils;->displayDensity:Ljava/lang/Float;

    if-nez v0, :cond_0

    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    sput-object p0, Lcom/scandit/base/system/SbSystemUtils;->displayDensity:Ljava/lang/Float;

    :cond_0
    int-to-float p0, p1

    .line 37
    sget-object p1, Lcom/scandit/base/system/SbSystemUtils;->displayDensity:Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    mul-float p0, p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method
