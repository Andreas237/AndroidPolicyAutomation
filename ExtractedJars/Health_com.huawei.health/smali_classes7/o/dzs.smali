.class public Lo/dzs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 32
    const/16 v0, 0x13

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "A5"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "A10"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "A20"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "A40"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "A100"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "B7"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "B21"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "B100"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "A2_10"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "A2_50"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "A2_100"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "C10000"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "C100000"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "C300000"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "C1000000"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "C3000000"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "C5000000"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "C10000000"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "C15000000"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sput-object v0, Lo/dzs;->a:[Ljava/lang/String;

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achievemedalpng"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dzs;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .line 353
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 354
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "getBitmapFromPath: file not exists"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    const/4 v0, 0x0

    return-object v0

    .line 357
    :cond_0
    const/4 v2, 0x0

    .line 359
    :try_start_0
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 362
    goto :goto_0

    .line 360
    :catch_0
    move-exception v3

    .line 361
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "getBitmapFromPath:OutOfMemoryError"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    :goto_0
    if-nez v2, :cond_1

    .line 365
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, " bitmap is null"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    :cond_1
    return-object v2
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 283
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 284
    :cond_0
    const-string v0, ""

    return-object v0

    .line 286
    :cond_1
    invoke-static {p0}, Lo/dzs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 287
    invoke-static {p0, p1}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 288
    invoke-static {v2}, Lo/dzs;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 289
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 290
    return-object v5
.end method

.method public static a(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 185
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 186
    return-void

    .line 189
    :cond_0
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_5km_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_10km_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_half_mal_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_one_mal_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_super_mal_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_7day_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_21day_silver_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_100day_gold_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_10km_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_50km_silver_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_100km_gold_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_1mstep_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10mstep_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_30mstep_copper_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_100mstep_silver_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_300mstep_silver_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_500mstep_silver_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_1000mstep_gold_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_1500mstep_gold_gray:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    return-void
.end method

.method public static a(I)Z
    .locals 1

    .line 571
    const/16 v0, 0x103

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5

    .line 294
    const/4 v2, 0x0

    .line 295
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 296
    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 297
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 298
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 299
    const/4 v0, 0x2

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 300
    const/4 v0, 0x0

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 302
    :try_start_0
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 305
    goto :goto_0

    .line 303
    :catch_0
    move-exception v4

    .line 304
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "getSmallBitmap:OutOfMemoryError"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    :goto_0
    return-object v2
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 323
    const-string v2, ""

    .line 324
    invoke-static {p0}, Lo/dzs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 325
    invoke-static {p0, p1}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 326
    invoke-static {v3}, Lo/dzs;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 328
    return-object v2
.end method

.method public static b(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 224
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 225
    return-void

    .line 228
    :cond_0
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_run_5km_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_run_10km_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_run_half_mal_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_run_one_mal_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_run_super_mal_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_7day_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_21day_silver_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_100day_gold_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_ride_10km_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_ride_50km_silver_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_ride_100km_gold_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_1mstep_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_10mstep_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_30mstep_copper_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_100mstep_silver_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_300mstep_silver_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_500mstep_silver_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_1000mstep_gold_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->gray_ic_walk_1500mstep_gold_white:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    return-void
.end method

.method public static b(Ljava/lang/String;I)Z
    .locals 9

    .line 401
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xf731400

    sub-long v4, v0, v2

    .line 403
    if-gtz p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 404
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 406
    :cond_1
    const-wide/16 v6, 0x0

    .line 408
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v6, v0

    .line 411
    goto :goto_0

    .line 409
    :catch_0
    move-exception v8

    .line 410
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "isNeedShow NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    :goto_0
    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    .line 413
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "isNeedShow =false"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    const/4 v0, 0x0

    return v0

    .line 417
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)J
    .locals 3

    .line 479
    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-direct {v2, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 480
    invoke-virtual {v2, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 481
    :catch_0
    move-exception v2

    .line 482
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "date2TimeStamp Exception"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 309
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 310
    const/4 v0, 0x0

    return-object v0

    .line 312
    :cond_0
    const/4 v2, 0x0

    .line 313
    const-string v3, ""

    .line 314
    invoke-static {p0}, Lo/dzs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 315
    const-string v0, "shareImageUrl"

    invoke-static {p0, v0}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 316
    invoke-static {v4}, Lo/dzs;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 317
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 318
    invoke-static {v3}, Lo/dzs;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 319
    return-object v2
.end method

.method public static c(Ljava/lang/String;ZZ)Landroid/graphics/Bitmap;
    .locals 3

    .line 263
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 264
    const/4 v0, 0x0

    return-object v0

    .line 266
    :cond_0
    const/4 v1, 0x0

    .line 267
    const-string v2, ""

    .line 268
    if-eqz p1, :cond_1

    .line 269
    const-string v0, "lightDetailStyle"

    invoke-static {p0, v0}, Lo/dzs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 271
    :cond_1
    const-string v0, "grayDetailStyle"

    invoke-static {p0, v0}, Lo/dzs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 273
    :goto_0
    if-nez p2, :cond_2

    .line 274
    invoke-static {v2}, Lo/dzs;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_1

    .line 276
    :cond_2
    const-string v0, "lightListStyle"

    invoke-static {p0, v0}, Lo/dzs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 277
    invoke-static {v2}, Lo/dzs;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 279
    :goto_1
    return-object v1
.end method

.method public static c(I)Ljava/lang/String;
    .locals 1

    .line 545
    invoke-static {p0}, Lo/dzs;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 546
    const-string v0, "A"

    return-object v0

    .line 547
    :cond_0
    invoke-static {p0}, Lo/dzs;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    const-string v0, "A2"

    return-object v0

    .line 550
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public static c(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 111
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 112
    return-void

    .line 115
    :cond_0
    const-string v0, "1"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_5km_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    const-string v0, "2"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_10km_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    const-string v0, "3"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    const-string v0, "4"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    const-string v0, "5"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    const-string v0, "6"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_7day_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    const-string v0, "7"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_21day_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    const-string v0, "8"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_100day_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    const-string v0, "9"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    const-string v0, "10"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_100000_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    const-string v0, "11"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_300000_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    const-string v0, "12"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_1000000_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    const-string v0, "13"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_3000000_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    const-string v0, "14"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_5000000_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    const-string v0, "15"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000000_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    const-string v0, "16"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_15000000_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    const-string v0, "17"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_10km_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v0, "18"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_50km_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const-string v0, "19"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_100km_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    return-void
.end method

.method public static d(DI)Ljava/lang/String;
    .locals 6

    .line 511
    const-string v0, "PLGACHIEVE_MedalUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "value = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "num = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    const/4 v0, 0x3

    invoke-static {p0, p1, v0}, Lo/cxh;->a(DI)D

    move-result-wide v3

    .line 514
    const-string v5, ""

    .line 515
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 516
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v3, v4, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 517
    :cond_0
    const/4 v0, 0x4

    if-ne v0, p2, :cond_1

    .line 518
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {v3, v4, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 519
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p2, :cond_2

    .line 520
    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-static {v3, v4, v0, v1}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 522
    :cond_2
    :goto_0
    const-string v0, "PLGACHIEVE_MedalUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "transferEnglishUnit():valueMile ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",valueMileStr = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    return-object v5
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 347
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lo/dzs;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 348
    return-object v2
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 338
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 339
    const-string p0, ""

    .line 341
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 73
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 74
    return-void

    .line 77
    :cond_0
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_5km_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_10km_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_7day_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_21day_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_100day_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x8

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_10km_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_50km_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xa

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_100km_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xb

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xc

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_100000_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xd

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_300000_copper_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xe

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_1000000_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0xf

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_3000000_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x10

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_5000000_silver_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x11

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000000_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v0, Lo/dzs;->a:[Ljava/lang/String;

    const/16 v1, 0x12

    aget-object v0, v0, v1

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_15000000_gold_obtain:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    return-void
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 332
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "medal"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 148
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 149
    return-void

    .line 152
    :cond_0
    const-string v0, "1"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_5km_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    const-string v0, "2"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_10km_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    const-string v0, "3"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    const-string v0, "4"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_silver_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    const-string v0, "5"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_run_mls_gold_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    const-string v0, "6"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_7day_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "7"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_21day_silver_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    const-string v0, "8"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000_100day_gold_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    const-string v0, "9"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v0, "10"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_100000_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    const-string v0, "11"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_300000_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    const-string v0, "12"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_1000000_silver_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const-string v0, "13"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_3000000_silver_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "14"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_5000000_silver_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    const-string v0, "15"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_10000000_gold_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v0, "16"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_walk_15000000_gold_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const-string v0, "17"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_10km_copper_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const-string v0, "18"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_50km_silver_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    const-string v0, "19"

    sget v1, Lcom/huawei/pluginachievement/R$mipmap;->ic_ride_100km_gold_obtain_sm:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    return-void
.end method

.method public static e(I)Z
    .locals 1

    .line 561
    const/16 v0, 0x102

    if-eq v0, p0, :cond_0

    const/16 v0, 0x108

    if-ne v0, p0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 441
    const-string v2, ""

    .line 442
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 443
    return-object v2

    .line 445
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    .line 446
    const/4 v0, 0x0

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 447
    const-string v0, "..."

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 449
    :cond_1
    move-object v2, p0

    .line 451
    :goto_0
    return-object v2
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 488
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 489
    const/4 v0, 0x0

    return-object v0

    .line 492
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 493
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 494
    const/16 v0, 0x14

    invoke-static {v4, v0}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 495
    return-object v5

    .line 496
    :catch_0
    move-exception v2

    .line 497
    const-string v0, "PLGACHIEVE_MedalUtil"

    const-string v1, "setGainTime NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    const/4 v0, 0x0

    return-object v0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 4

    .line 371
    const-string v0, "MedalUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fileIsExists path="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 373
    const/4 v0, 0x0

    return v0

    .line 375
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 376
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 377
    const-string v0, "MedalUtil"

    const-string v1, "file Is not Exists "

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    const/4 v0, 0x0

    return v0

    .line 380
    :cond_1
    const-string v0, "MedalUtil"

    const-string v1, "file Is  Exists "

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    const/4 v0, 0x1

    return v0
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 1

    .line 456
    const-string v0, "AAA"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "BBB"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 457
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 459
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 1

    .line 464
    invoke-static {p0}, Lo/dzs;->i(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "GGG"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 465
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 467
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static n(Ljava/lang/String;)I
    .locals 4

    .line 527
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 528
    const/4 v0, 0x0

    return v0

    .line 531
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 532
    :catch_0
    move-exception v3

    .line 533
    const-string v0, "PLGACHIEVE_MedalUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "string2Int e="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    const/4 v0, 0x0

    return v0
.end method
