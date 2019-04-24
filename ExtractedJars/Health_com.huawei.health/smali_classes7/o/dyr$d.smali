.class Lo/dyr$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dyr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private b:[Landroid/graphics/Bitmap;

.field final synthetic c:Lo/dyr;

.field private d:Landroid/graphics/Path;


# direct methods
.method private constructor <init>(Lo/dyr;)V
    .locals 1

    .line 227
    iput-object p1, p0, Lo/dyr$d;->c:Lo/dyr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lo/dyr$d;->d:Landroid/graphics/Path;

    .line 229
    return-void
.end method

.method synthetic constructor <init>(Lo/dyr;Lo/dyr$4;)V
    .locals 0

    .line 223
    invoke-direct {p0, p1}, Lo/dyr$d;-><init>(Lo/dyr;)V

    return-void
.end method


# virtual methods
.method protected a(Lo/na;)Z
    .locals 3

    .line 232
    invoke-interface {p1}, Lo/na;->N()I

    move-result v1

    .line 233
    const/4 v2, 0x0

    .line 234
    iget-object v0, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 235
    new-array v0, v1, [Landroid/graphics/Bitmap;

    iput-object v0, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    .line 236
    const/4 v2, 0x1

    goto :goto_0

    .line 237
    :cond_0
    iget-object v0, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    array-length v0, v0

    if-eq v0, v1, :cond_1

    .line 238
    new-array v0, v1, [Landroid/graphics/Bitmap;

    iput-object v0, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    .line 239
    const/4 v2, 0x1

    .line 242
    :cond_1
    :goto_0
    return v2
.end method

.method protected d(I)Landroid/graphics/Bitmap;
    .locals 2

    .line 272
    iget-object v0, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    array-length v1, v1

    rem-int v1, p1, v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method protected d(Lo/na;ZZ)V
    .locals 12

    .line 246
    invoke-interface {p1}, Lo/na;->N()I

    move-result v5

    .line 247
    invoke-interface {p1}, Lo/na;->e()F

    move-result v6

    .line 248
    invoke-interface {p1}, Lo/na;->b()F

    move-result v7

    .line 250
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v5, :cond_2

    .line 251
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 252
    float-to-double v0, v6

    const-wide v2, 0x4000cccccccccccdL    # 2.1

    mul-double/2addr v0, v2

    double-to-int v0, v0

    float-to-double v1, v6

    const-wide v3, 0x4000cccccccccccdL    # 2.1

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-static {v0, v1, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 253
    new-instance v11, Landroid/graphics/Canvas;

    invoke-direct {v11, v10}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 254
    iget-object v0, p0, Lo/dyr$d;->b:[Landroid/graphics/Bitmap;

    aput-object v10, v0, v8

    .line 255
    iget-object v0, p0, Lo/dyr$d;->c:Lo/dyr;

    invoke-static {v0}, Lo/dyr;->d(Lo/dyr;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-interface {p1, v8}, Lo/na;->k(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 256
    if-eqz p3, :cond_0

    .line 257
    iget-object v0, p0, Lo/dyr$d;->d:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 258
    iget-object v0, p0, Lo/dyr$d;->d:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v6, v6, v6, v1}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 259
    iget-object v0, p0, Lo/dyr$d;->d:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v6, v6, v7, v1}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 260
    iget-object v0, p0, Lo/dyr$d;->d:Landroid/graphics/Path;

    iget-object v1, p0, Lo/dyr$d;->c:Lo/dyr;

    invoke-static {v1}, Lo/dyr;->c(Lo/dyr;)Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_1

    .line 262
    :cond_0
    iget-object v0, p0, Lo/dyr$d;->c:Lo/dyr;

    invoke-static {v0}, Lo/dyr;->a(Lo/dyr;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v11, v6, v6, v6, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 263
    if-eqz p2, :cond_1

    .line 264
    iget-object v0, p0, Lo/dyr$d;->c:Lo/dyr;

    invoke-static {v0}, Lo/dyr;->b(Lo/dyr;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v11, v6, v6, v7, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 250
    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 269
    :cond_2
    return-void
.end method
