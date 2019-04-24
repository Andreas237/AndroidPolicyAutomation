.class public Lcom/huawei/openalliance/ad/utils/o;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/utils/o$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/utils/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/o;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;I)I
    .locals 7

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/16 v3, 0x64

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "47494638"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const/4 v3, 0x2

    :cond_1
    :goto_0
    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catch_0
    move-exception v5

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/o;->a:Ljava/lang/String;

    const-string v1, "resId is not found"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_1

    :catchall_0
    move-exception v6

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_1
    return v3
.end method

.method static synthetic a(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/utils/o;->d(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Landroid/graphics/Rect;
    .locals 6

    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Rect;

    iget v1, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v2, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/o;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/openalliance/ad/utils/o$a;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/utils/o$1;

    invoke-direct {v0, p1, p0, p2}, Lcom/huawei/openalliance/ad/utils/o$1;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/openalliance/ad/utils/o$a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/utils/o;->c(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private static c(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 7

    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    const/4 v0, 0x0

    invoke-static {v3, v0, p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catch_0
    move-exception v5

    :try_start_1
    sget-object v0, Lcom/huawei/openalliance/ad/utils/o;->a:Ljava/lang/String;

    const-string v1, "loadAssetImg IOException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    throw v6

    :goto_0
    return-object v4
.end method

.method private static d(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 5

    const/4 v2, 0x0

    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->RES:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v4, p0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/o;->a:Ljava/lang/String;

    const-string v1, "loadImage NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/o;->a:Ljava/lang/String;

    const-string v1, "loadImage NotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method
