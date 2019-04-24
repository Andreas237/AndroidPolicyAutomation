.class public final Lo/bcm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static f:Lo/bcm;


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:[Ljava/lang/String;

.field private e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 95
    new-instance v0, Lo/bcm;

    invoke-direct {v0}, Lo/bcm;-><init>()V

    sput-object v0, Lo/bcm;->f:Lo/bcm;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    const-wide/32 v0, 0x18000

    iput-wide v0, p0, Lo/bcm;->c:J

    .line 55
    const/high16 v0, 0x3e800000    # 0.25f

    iput v0, p0, Lo/bcm;->e:F

    .line 102
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 5

    .line 391
    const/4 v3, 0x0

    .line 394
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 395
    if-eqz v4, :cond_0

    .line 397
    invoke-virtual {v4}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v3

    .line 400
    :cond_0
    if-eqz v3, :cond_1

    .line 402
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object v3, v0, v1

    iput-object v0, p0, Lo/bcm;->d:[Ljava/lang/String;

    goto :goto_0

    .line 406
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/bcm;->d:[Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    :goto_0
    goto :goto_1

    .line 409
    :catch_0
    move-exception v4

    .line 411
    const-string v0, "ParamManager"

    const-string v1, "initNoNeedGrantPermissionPath meet a exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    :goto_1
    return-void
.end method

.method public static e()Lo/bcm;
    .locals 1

    .line 106
    sget-object v0, Lo/bcm;->f:Lo/bcm;

    return-object v0
.end method

.method private q()I
    .locals 2

    .line 304
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x44200000    # 640.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method

.method private r()I
    .locals 2

    .line 294
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x43b40000    # 360.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    return v0
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 226
    invoke-direct {p0}, Lo/bcm;->r()I

    move-result v1

    .line 227
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 228
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 230
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 231
    iget v1, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 233
    :cond_0
    return v1
.end method

.method public a(I)V
    .locals 0

    .line 348
    iput p1, p0, Lo/bcm;->a:I

    .line 349
    return-void
.end method

.method public b()I
    .locals 1

    .line 204
    invoke-virtual {p0}, Lo/bcm;->a()I

    move-result v0

    .line 205
    return v0
.end method

.method public c()J
    .locals 2

    .line 193
    iget-wide v0, p0, Lo/bcm;->c:J

    .line 194
    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .line 338
    iput p1, p0, Lo/bcm;->b:I

    .line 339
    return-void
.end method

.method public d()F
    .locals 1

    .line 215
    iget v0, p0, Lo/bcm;->e:F

    .line 216
    return v0
.end method

.method public f()F
    .locals 4

    .line 315
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 317
    invoke-virtual {p0}, Lo/bcm;->g()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lo/bcm;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v2, v0, v1

    goto :goto_0

    .line 321
    :cond_0
    invoke-virtual {p0}, Lo/bcm;->g()I

    move-result v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bmo;->a(Landroid/content/Context;)I

    move-result v1

    sub-int/2addr v0, v1

    .line 322
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bmo;->e(Landroid/content/Context;)I

    move-result v1

    sub-int v3, v0, v1

    .line 323
    int-to-float v0, v3

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lo/bcm;->a()I

    move-result v1

    int-to-float v1, v1

    div-float v2, v0, v1

    .line 326
    :goto_0
    move v3, v2

    .line 327
    return v3
.end method

.method public g()I
    .locals 4

    .line 243
    invoke-direct {p0}, Lo/bcm;->r()I

    move-result v1

    .line 244
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 245
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 247
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 248
    iget v1, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 250
    :cond_0
    return v1
.end method

.method public h()I
    .locals 3

    .line 261
    invoke-virtual {p0}, Lo/bcm;->a()I

    move-result v0

    invoke-virtual {p0}, Lo/bcm;->g()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 262
    if-gtz v2, :cond_0

    .line 265
    invoke-direct {p0}, Lo/bcm;->r()I

    move-result v2

    .line 267
    :cond_0
    return v2
.end method

.method public i()I
    .locals 3

    .line 278
    invoke-virtual {p0}, Lo/bcm;->a()I

    move-result v0

    invoke-virtual {p0}, Lo/bcm;->g()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 279
    if-gtz v2, :cond_0

    .line 282
    invoke-direct {p0}, Lo/bcm;->q()I

    move-result v2

    .line 284
    :cond_0
    return v2
.end method

.method public k()I
    .locals 1

    .line 332
    iget v0, p0, Lo/bcm;->b:I

    .line 333
    return v0
.end method

.method public l()I
    .locals 1

    .line 358
    iget v0, p0, Lo/bcm;->a:I

    .line 359
    return v0
.end method

.method public m()I
    .locals 3

    .line 380
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42f00000    # 120.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    .line 381
    return v2
.end method

.method public n()I
    .locals 4

    .line 438
    invoke-virtual {p0}, Lo/bcm;->a()I

    move-result v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x42000000    # 32.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int v3, v0, v1

    .line 439
    if-gtz v3, :cond_0

    .line 442
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x43b40000    # 360.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v3

    .line 444
    :cond_0
    return v3
.end method

.method public o()I
    .locals 3

    .line 369
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42fa0000    # 125.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    .line 370
    return v2
.end method

.method public p()[Ljava/lang/String;
    .locals 2

    .line 422
    iget-object v0, p0, Lo/bcm;->d:[Ljava/lang/String;

    if-nez v0, :cond_0

    .line 424
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bcm;->a(Landroid/content/Context;)V

    .line 426
    :cond_0
    iget-object v1, p0, Lo/bcm;->d:[Ljava/lang/String;

    .line 427
    return-object v1
.end method
