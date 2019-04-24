.class public Lcom/huawei/openalliance/ad/views/a/c;
.super Landroid/view/View;


# instance fields
.field private a:Lcom/huawei/openalliance/ad/e/a/e;

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Lcom/huawei/openalliance/ad/views/a/b;

.field private e:I

.field private f:I

.field private g:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Rect;

.field private i:Landroid/graphics/Rect;

.field private j:Landroid/graphics/Rect;

.field private k:Landroid/graphics/Canvas;

.field private l:J

.field private m:Lcom/huawei/openalliance/ad/views/a/a;

.field private n:I

.field private o:Landroid/widget/ImageView$ScaleType;

.field private p:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private final q:Ljava/lang/String;

.field private r:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/huawei/openalliance/ad/views/a/b;>;"
        }
    .end annotation
.end field

.field private s:Lcom/huawei/openalliance/ad/views/a/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->b:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->e:I

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->i:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->j:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->k:Landroid/graphics/Canvas;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->l:J

    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->o:Landroid/widget/ImageView$ScaleType;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "render_frame"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->q:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->r:Ljava/util/Queue;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->c()V

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .locals 11

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GifPlayView"

    const-string v1, "image pool size: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    invoke-interface {v3}, Ljava/util/Queue;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/Bitmap;

    if-nez v5, :cond_6

    const-string v0, "GifPlayView"

    const-string v1, "cache bitmap null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    if-ge v6, v7, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_3

    const/16 v0, 0x280

    if-le v6, v0, :cond_2

    const/16 v9, 0x280

    goto :goto_1

    :cond_2
    move v9, v6

    goto :goto_1

    :cond_3
    const/16 v0, 0x3c0

    if-le v6, v0, :cond_4

    const/16 v9, 0x3c0

    goto :goto_1

    :cond_4
    move v9, v6

    :goto_1
    mul-int v0, v9, v7

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v6

    div-float/2addr v0, v1

    float-to-int v10, v0

    const-string v0, "GifPlayView"

    const-string v1, "reduce image size to w: %d, h: %d src w: %d, h: %d"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v9, v10, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_6
    :goto_2
    invoke-direct {p0, p1, v5}, Lcom/huawei/openalliance/ad/views/a/c;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-object v5
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/a/c;Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/a/c;->a(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/a/c;)Lcom/huawei/openalliance/ad/views/a/d;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->s:Lcom/huawei/openalliance/ad/views/a/d;

    return-object v0
.end method

.method private a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 5

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->k:Landroid/graphics/Canvas;

    invoke-virtual {v0, p2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->k:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->i:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->j:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->k:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->i:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/a/c;->j:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getWidth()I

    move-result v6

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getHeight()I

    move-result v7

    if-lez v4, :cond_2

    if-lez v5, :cond_2

    if-lez v6, :cond_2

    if-gtz v7, :cond_3

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    mul-int v8, v5, v6

    mul-int v9, v4, v7

    if-lt v8, v9, :cond_4

    int-to-float v0, v9

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v6

    div-float v10, v0, v1

    int-to-float v0, v5

    sub-float/2addr v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v11, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    sub-int v1, v5, v11

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v11, v4, v1}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_4
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v7

    div-float v10, v0, v1

    int-to-float v0, v4

    sub-float/2addr v0, v10

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v11, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    sub-int v1, v4, v11

    const/4 v2, 0x0

    invoke-virtual {v0, v11, v2, v1, v5}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/views/a/b;)V
    .locals 12

    const-string v0, "GifPlayView"

    const-string v1, "onFrameDecoded index: %d isstop: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p1, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->j()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->l:J

    sub-long v7, v5, v0

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "GifPlayView"

    const-string v1, "onFrameDecoded decodeInterval: %d currentFrameDuration: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/huawei/openalliance/ad/views/a/c;->n:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget v0, p1, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->g()V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/b;)V

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->n:I

    int-to-long v0, v0

    cmp-long v0, v7, v0

    if-gez v0, :cond_3

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->n:I

    int-to-long v0, v0

    sub-long v9, v0, v7

    :try_start_0
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v11

    const-string v0, "GifPlayView"

    const-string v1, "sleep InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/b;)V

    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/b;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/a/c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/views/a/b;J)Z
    .locals 13

    iget-object v0, p1, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_0

    const/4 v5, 0x2

    goto :goto_0

    :cond_0
    const/4 v5, 0x4

    :goto_0
    iget-object v0, p1, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p1, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v0, v2

    int-to-long v2, v5

    mul-long v6, v0, v2

    const/4 v8, 0x1

    iget v0, p1, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_2

    move-wide v0, p2

    long-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget v2, p1, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v8, v0

    const/4 v0, 0x5

    if-le v8, v0, :cond_1

    const/4 v0, 0x5

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    move v8, v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    int-to-long v0, v8

    mul-long v9, v6, v0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->b()J

    move-result-wide v11

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "GifPlayView"

    const-string v1, "max frame mem: %d unused memory: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    cmp-long v0, v9, v11

    if-ltz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/b;J)Z
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/a/c;->a(Lcom/huawei/openalliance/ad/views/a/b;J)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/a/c;)Ljava/util/Queue;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->r:Ljava/util/Queue;

    return-object v0
.end method

.method private b(Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v2, v2, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/views/a/b;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/c;->c(Lcom/huawei/openalliance/ad/views/a/b;)V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget v0, p1, Lcom/huawei/openalliance/ad/views/a/b;->c:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->n:I

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/a/c$7;-><init>(Lcom/huawei/openalliance/ad/views/a/c;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->q:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->l:J

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/views/a/c$1;-><init>(Lcom/huawei/openalliance/ad/views/a/c;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method private c()V
    .locals 5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GifPlayView"

    const-string v1, "render task id: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/a/c;->q:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 15

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getWidth()I

    move-result v7

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getHeight()I

    move-result v8

    if-lez v5, :cond_2

    if-lez v6, :cond_2

    if-lez v7, :cond_2

    if-gtz v8, :cond_3

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    int-to-float v0, v5

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v6

    div-float v9, v0, v1

    int-to-float v0, v7

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v8

    div-float v10, v0, v1

    cmpl-float v0, v9, v10

    if-ltz v0, :cond_4

    int-to-float v11, v7

    div-float v12, v11, v9

    goto :goto_0

    :cond_4
    int-to-float v12, v8

    mul-float v11, v12, v9

    :goto_0
    int-to-float v0, v7

    sub-float/2addr v0, v11

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v13, v0

    int-to-float v0, v8

    sub-float/2addr v0, v12

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v14, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    float-to-int v1, v11

    float-to-int v2, v12

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    int-to-float v0, v13

    int-to-float v1, v14

    move-object/from16 v2, p1

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->g:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/a/c;->h:Landroid/graphics/Rect;

    move-object/from16 v3, p1

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method private c(Lcom/huawei/openalliance/ad/views/a/b;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    :cond_0
    const-string v0, "GifPlayView"

    const-string v1, "drop frame"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    iget-object v1, p1, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Ljava/util/Queue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    iget-object v1, p1, Lcom/huawei/openalliance/ad/views/a/b;->b:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "GifPlayView"

    const-string v1, "fail to release frame to pool"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->h()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->e()V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->f(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->RES:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->e(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->d(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    :try_start_0
    new-instance v0, Lcom/huawei/openalliance/ad/views/a/a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/e/a/e;->o()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/huawei/openalliance/ad/views/a/a;-><init>(Ljava/io/InputStream;I)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->m:Lcom/huawei/openalliance/ad/views/a/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "GifPlayView"

    const-string v1, "exception in creating gif decoder"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->f()V

    return-void

    :goto_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->h()V

    :cond_3
    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/a/c;)J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->l:J

    return-wide v0
.end method

.method private d(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 5

    const/4 v2, 0x0

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "GifPlayView"

    const-string v1, "loadFile FileNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method private d()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/c;->setStop(Z)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->f:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/a/c;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->n:I

    return v0
.end method

.method private e(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

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

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "GifPlayView"

    const-string v1, "loadFile NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v0, "GifPlayView"

    const-string v1, "loadFile NotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->m:Lcom/huawei/openalliance/ad/views/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->m:Lcom/huawei/openalliance/ad/views/a/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/a;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->m:Lcom/huawei/openalliance/ad/views/a/a;

    :cond_0
    return-void
.end method

.method private f(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 5

    const/4 v2, 0x0

    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "GifPlayView"

    const-string v1, "loadFile IOException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v2
.end method

.method private f()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/a/c$2;-><init>(Lcom/huawei/openalliance/ad/views/a/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->i()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/openalliance/ad/views/a/c;)I
    .locals 2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->f:I

    return v0
.end method

.method private g()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/a/c$3;-><init>(Lcom/huawei/openalliance/ad/views/a/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic h(Lcom/huawei/openalliance/ad/views/a/c;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->e:I

    return v0
.end method

.method private h()V
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->m:Lcom/huawei/openalliance/ad/views/a/a;

    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->f()V

    return-void

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$4;

    invoke-direct {v0, p0, v1}, Lcom/huawei/openalliance/ad/views/a/c$4;-><init>(Lcom/huawei/openalliance/ad/views/a/c;Lcom/huawei/openalliance/ad/views/a/a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic i(Lcom/huawei/openalliance/ad/views/a/c;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->f:I

    return v0
.end method

.method private i()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/a/c$5;-><init>(Lcom/huawei/openalliance/ad/views/a/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic j(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->k()V

    return-void
.end method

.method private declared-synchronized j()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private k()V
    .locals 2

    const-string v0, "GifPlayView"

    const-string v1, "replay"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic k(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->m()V

    return-void
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->p:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->e()V

    return-void
.end method

.method private m()V
    .locals 2

    const-string v0, "GifPlayView"

    const-string v1, "on play end"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->l()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->s:Lcom/huawei/openalliance/ad/views/a/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->s:Lcom/huawei/openalliance/ad/views/a/d;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/a/d;->c()V

    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/openalliance/ad/views/a/c;)Z
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->j()Z

    move-result v0

    return v0
.end method

.method private declared-synchronized setStop(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/a/c;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->c:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->b()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->d()V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "GifPlayView"

    const-string v1, "stop play"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->q:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/c;->setStop(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->r:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->clear()V

    new-instance v0, Lcom/huawei/openalliance/ad/views/a/c$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/a/c$6;-><init>(Lcom/huawei/openalliance/ad/views/a/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/c;->b()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/c;->l()V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    if-eqz v0, :cond_0

    const-string v0, "GifPlayView"

    const-string v1, "draw frame: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/a/c;->d:Lcom/huawei/openalliance/ad/views/a/b;

    iget v3, v3, Lcom/huawei/openalliance/ad/views/a/b;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/views/a/c$8;->a:[I

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c;->o:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Landroid/widget/ImageView$ScaleType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->c(Landroid/graphics/Canvas;)V

    goto :goto_1

    :sswitch_1
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->a(Landroid/graphics/Canvas;)V

    goto :goto_1

    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/a/c;->b(Landroid/graphics/Canvas;)V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public setFilePath(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->c:Ljava/lang/String;

    return-void
.end method

.method public setPlayTimes(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->e:I

    return-void
.end method

.method public setPlayerCallback(Lcom/huawei/openalliance/ad/views/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->s:Lcom/huawei/openalliance/ad/views/a/d;

    return-void
.end method

.method public setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c;->o:Landroid/widget/ImageView$ScaleType;

    return-void
.end method
