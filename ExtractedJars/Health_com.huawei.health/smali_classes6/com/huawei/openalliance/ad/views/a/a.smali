.class public Lcom/huawei/openalliance/ad/views/a/a;
.super Ljava/lang/Object;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private A:[I

.field private B:[I

.field private C:[I

.field private D:I

.field private E:I

.field private F:Landroid/graphics/Bitmap;

.field private G:[I

.field private H:I

.field private I:I

.field private J:I

.field private K:I

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private R:[I

.field public a:I

.field public b:I

.field private final d:I

.field private e:Ljava/io/InputStream;

.field private final f:Ljava/lang/Object;

.field private final g:Ljava/lang/Object;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:[S

.field private o:[B

.field private p:[B

.field private q:[B

.field private r:[B

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->f:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->g:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->i:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->j:Z

    const/16 v0, 0x200

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->p:[B

    const/16 v0, 0x64

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->t:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->u:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->A:[I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->B:[I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->E:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->H:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/a;->e:Ljava/io/InputStream;

    iput p2, p0, Lcom/huawei/openalliance/ad/views/a/a;->d:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->c()V

    return-void
.end method

.method private a([IIILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    if-nez p4, :cond_2

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->b()J

    move-result-wide v0

    const-wide/32 v2, 0x3c00000

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    sget-object v8, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "create image with config %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-static {p2, p3, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p4

    :cond_2
    move-object v0, p4

    move-object v1, p1

    move v3, p2

    move v6, p2

    move v7, p3

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    return-object p4
.end method

.method private a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/a/a;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_0
    return-void
.end method

.method private a(I)[I
    .locals 12

    const/16 v0, 0x100

    new-array v3, v0, [I

    mul-int/lit8 v4, p1, 0x3

    new-array v5, v4, [B

    const/4 v6, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->e:Ljava/io/InputStream;

    invoke-virtual {v0, v5}, Ljava/io/InputStream;->read([B)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    goto :goto_0

    :catch_0
    move-exception v7

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "read color table fail"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-ge v6, v4, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    goto :goto_2

    :cond_0
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v7, p1, :cond_1

    move v0, v8

    add-int/lit8 v8, v8, 0x1

    aget-byte v0, v5, v0

    and-int/lit16 v9, v0, 0xff

    move v0, v8

    add-int/lit8 v8, v8, 0x1

    aget-byte v0, v5, v0

    and-int/lit16 v10, v0, 0xff

    move v0, v8

    add-int/lit8 v8, v8, 0x1

    aget-byte v0, v5, v0

    and-int/lit16 v11, v0, 0xff

    move v0, v7

    add-int/lit8 v7, v7, 0x1

    shl-int/lit8 v1, v9, 0x10

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    shl-int/lit8 v2, v10, 0x8

    or-int/2addr v1, v2

    or-int/2addr v1, v11

    aput v1, v3, v0

    goto :goto_1

    :cond_1
    :goto_2
    return-object v3
.end method

.method private b(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->r:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->r:[B

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    new-array v0, p1, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->r:[B

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->n:[S

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    const/16 v0, 0x1000

    new-array v0, v0, [S

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->n:[S

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    const/16 v0, 0x1001

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    :cond_4
    return-void
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->e:Ljava/io/InputStream;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(Z)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->d()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(Z)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/a;->b()V

    :cond_1
    return-void
.end method

.method private d()V
    .locals 4

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v3, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v0

    int-to-char v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GIF"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->f()V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->k:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->w:I

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(I)[I

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->A:[I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->A:[I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->y:I

    aget v0, v0, v1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->z:I

    :cond_2
    return-void
.end method

.method private e()I
    .locals 3

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->e:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v2

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    :goto_0
    return v1
.end method

.method private f()V
    .locals 5

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->b:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v4

    and-int/lit16 v0, v4, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->k:Z

    and-int/lit8 v0, v4, 0x7

    add-int/lit8 v0, v0, 0x1

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->w:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->y:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    return-void
.end method

.method private g()I
    .locals 4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v2

    shl-int/lit8 v0, v2, 0x8

    or-int v3, v1, v0

    return v3
.end method

.method private h()Z
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private i()Lcom/huawei/openalliance/ad/views/a/b;
    .locals 5

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->j()I

    move-result v4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->k()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->m()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->n()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->F:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->H:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->H:I

    new-instance v3, Lcom/huawei/openalliance/ad/views/a/b;

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->H:I

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->F:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/huawei/openalliance/ad/views/a/a;->t:I

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/openalliance/ad/views/a/b;-><init>(ILandroid/graphics/Bitmap;I)V

    :cond_3
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->D:I

    aput v4, v0, v1

    :cond_4
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->p()V

    return-object v3
.end method

.method private j()I
    .locals 6

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->I:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->J:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->K:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->L:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v4

    and-int/lit16 v0, v4, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->l:Z

    and-int/lit8 v0, v4, 0x40

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->m:Z

    and-int/lit8 v0, v4, 0x7

    add-int/lit8 v0, v0, 0x1

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->x:I

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->l:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->x:I

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(I)[I

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->B:[I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->B:[I

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->A:[I

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->y:I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->D:I

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->z:I

    :cond_3
    :goto_2
    const/4 v5, 0x0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    array-length v0, v0

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    array-length v0, v0

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->D:I

    if-le v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->D:I

    aget v5, v0, v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->D:I

    const/4 v2, 0x0

    aput v2, v0, v1

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    :cond_5
    return v5
.end method

.method private k()V
    .locals 24

    const/4 v3, -0x1

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->K:I

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/openalliance/ad/views/a/a;->L:I

    mul-int v4, v0, v1

    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/huawei/openalliance/ad/views/a/a;->b(I)V

    invoke-direct/range {p0 .. p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v13

    const/4 v0, 0x1

    shl-int v6, v0, v13

    add-int/lit8 v9, v6, 0x1

    add-int/lit8 v5, v6, 0x2

    const/4 v11, -0x1

    add-int/lit8 v8, v13, 0x1

    const/4 v0, 0x1

    shl-int/2addr v0, v8

    add-int/lit8 v7, v0, -0x1

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v6, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->n:[S

    const/4 v1, 0x0

    aput-short v1, v0, v12

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    int-to-byte v1, v12

    aput-byte v1, v0, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v20, 0x0

    :goto_1
    move/from16 v0, v20

    if-ge v0, v4, :cond_f

    if-nez v17, :cond_e

    if-ge v14, v8, :cond_3

    if-nez v15, :cond_2

    invoke-direct/range {p0 .. p0}, Lcom/huawei/openalliance/ad/views/a/a;->q()I

    move-result v15

    if-gtz v15, :cond_1

    goto/16 :goto_5

    :cond_1
    const/16 v18, 0x0

    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->p:[B

    aget-byte v0, v0, v18

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v14

    add-int v21, v21, v0

    add-int/lit8 v14, v14, 0x8

    add-int/lit8 v18, v18, 0x1

    add-int/lit8 v15, v15, -0x1

    goto :goto_1

    :cond_3
    and-int v12, v21, v7

    shr-int v21, v21, v8

    sub-int/2addr v14, v8

    if-gt v12, v5, :cond_4

    if-ne v12, v9, :cond_5

    :cond_4
    const/16 v22, 0x1

    goto :goto_2

    :cond_5
    const/16 v22, 0x0

    :goto_2
    if-eqz v22, :cond_6

    goto/16 :goto_5

    :cond_6
    if-ne v12, v6, :cond_7

    add-int/lit8 v8, v13, 0x1

    const/4 v0, 0x1

    shl-int/2addr v0, v8

    add-int/lit8 v7, v0, -0x1

    add-int/lit8 v5, v6, 0x2

    const/4 v11, -0x1

    goto/16 :goto_1

    :cond_7
    if-ne v11, v3, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    aget-byte v2, v2, v12

    aput-byte v2, v0, v1

    move v11, v12

    move/from16 v16, v12

    goto/16 :goto_1

    :cond_8
    move v10, v12

    if-ne v12, v5, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    move/from16 v2, v16

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    move v12, v11

    :cond_9
    :goto_3
    if-le v12, v6, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    aget-byte v2, v2, v12

    aput-byte v2, v0, v1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->n:[S

    aget-short v12, v0, v12

    goto :goto_3

    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    aget-byte v0, v0, v12

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    const/16 v0, 0x1000

    if-lt v5, v0, :cond_b

    goto :goto_5

    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    move/from16 v1, v17

    add-int/lit8 v17, v17, 0x1

    move/from16 v2, v16

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->n:[S

    int-to-short v1, v11

    aput-short v1, v0, v5

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->o:[B

    move/from16 v1, v16

    int-to-byte v1, v1

    aput-byte v1, v0, v5

    add-int/lit8 v5, v5, 0x1

    and-int v0, v5, v7

    if-nez v0, :cond_c

    const/16 v0, 0x1000

    if-ge v5, v0, :cond_c

    const/16 v23, 0x1

    goto :goto_4

    :cond_c
    const/16 v23, 0x0

    :goto_4
    if-eqz v23, :cond_d

    add-int/lit8 v8, v8, 0x1

    add-int/2addr v7, v5

    :cond_d
    move v11, v10

    :cond_e
    add-int/lit8 v17, v17, -0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->r:[B

    move/from16 v1, v19

    add-int/lit8 v19, v19, 0x1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/openalliance/ad/views/a/a;->q:[B

    aget-byte v2, v2, v17

    aput-byte v2, v0, v1

    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_1

    :cond_f
    :goto_5
    move/from16 v20, v19

    :goto_6
    move/from16 v0, v20

    if-ge v0, v4, :cond_10

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->r:[B

    const/4 v1, 0x0

    aput-byte v1, v0, v20

    add-int/lit8 v20, v20, 0x1

    goto :goto_6

    :cond_10
    return-void
.end method

.method private l()V
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v2

    and-int/lit8 v0, v2, 0x1c

    shr-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->u:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->u:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->u:I

    :cond_0
    and-int/lit8 v0, v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->j:Z

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->g()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->t:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->d:I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->t:I

    if-le v0, v1, :cond_2

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->d:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->t:I

    :cond_2
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->D:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    return-void
.end method

.method private m()V
    .locals 1

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->q()I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    if-lez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method private n()V
    .locals 16

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/huawei/openalliance/ad/views/a/a;->r()V

    const/4 v5, 0x1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->L:I

    if-ge v8, v0, :cond_5

    move v9, v8

    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->m:Z

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->L:I

    if-lt v7, v0, :cond_0

    add-int/lit8 v5, v5, 0x1

    packed-switch v5, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v7, 0x4

    goto :goto_1

    :pswitch_1
    const/4 v7, 0x2

    const/4 v6, 0x4

    goto :goto_1

    :pswitch_2
    const/4 v7, 0x1

    const/4 v6, 0x2

    :cond_0
    :goto_1
    move v9, v7

    add-int/2addr v7, v6

    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->J:I

    add-int/2addr v9, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->b:I

    if-ge v9, v0, :cond_4

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    mul-int v10, v9, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->I:I

    add-int v11, v10, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->K:I

    add-int v12, v11, v0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    add-int/2addr v0, v10

    if-ge v0, v12, :cond_2

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    add-int v12, v10, v0

    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->K:I

    mul-int v13, v8, v0

    :goto_2
    if-ge v11, v12, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->r:[B

    move v1, v13

    add-int/lit8 v13, v13, 0x1

    aget-byte v0, v0, v1

    and-int/lit16 v14, v0, 0xff

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->C:[I

    aget v15, v0, v14

    if-eqz v15, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    aput v15, v0, v11

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/openalliance/ad/views/a/a;->b:I

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/openalliance/ad/views/a/a;->F:Landroid/graphics/Bitmap;

    move-object/from16 v4, p0

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/views/a/a;->a([IIILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/openalliance/ad/views/a/a;->F:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_3

    :catch_0
    move-exception v5

    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "run out of memory"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/huawei/openalliance/ad/views/a/a;->o()V

    goto :goto_3

    :catch_1
    move-exception v5

    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "set pixel error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :catch_2
    move-exception v5

    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "set pixel error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private o()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    return-void
.end method

.method private p()V
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->u:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->E:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->I:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->M:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->J:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->N:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->K:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->O:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->L:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->P:I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->z:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->s:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->G:[I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->j:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->u:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->B:[I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->d:I

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->t:I

    return-void
.end method

.method private q()I
    .locals 5

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    const/4 v3, 0x0

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    if-lez v0, :cond_2

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    if-ge v3, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->e:Ljava/io/InputStream;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->p:[B

    iget v2, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    sub-int/2addr v2, v3

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/InputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int v0, v3, v4

    move v3, v0

    goto :goto_0

    :cond_1
    :goto_1
    goto :goto_2

    :catch_0
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "read block IOException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/views/a/a;->c:Ljava/lang/String;

    const-string v1, "read block fail"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->Q:I

    if-ge v3, v0, :cond_2

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    :cond_2
    return v3
.end method

.method private r()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->b:I

    mul-int/2addr v0, v1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->E:I

    if-lez v0, :cond_4

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->E:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->G:[I

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->G:[I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->G:[I

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->E:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->j:Z

    if-nez v0, :cond_2

    iget v2, p0, Lcom/huawei/openalliance/ad/views/a/a;->s:I

    :cond_2
    const/4 v3, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->P:I

    if-ge v3, v0, :cond_4

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->N:I

    add-int/2addr v0, v3

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->a:I

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->M:I

    add-int v4, v0, v1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->O:I

    add-int v5, v4, v0

    move v6, v4

    :goto_1
    if-ge v6, v5, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->R:[I

    aput v2, v0, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private s()Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->g:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private t()Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/views/a/b;
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->s()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(Z)V

    goto :goto_3

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->i()Lcom/huawei/openalliance/ad/views/a/b;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    return-object v2

    :sswitch_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->e()I

    move-result v1

    const/16 v0, 0xf9

    if-ne v0, v1, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->l()V

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->m()V

    goto :goto_2

    :sswitch_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/a/a;->a(Z)V

    goto :goto_2

    :sswitch_3
    goto :goto_2

    :goto_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->v:I

    :cond_3
    :goto_2
    goto :goto_0

    :cond_4
    :goto_3
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/a/a;->s()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/a/a;->b()V

    :cond_5
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_3
        0x21 -> :sswitch_1
        0x2c -> :sswitch_0
        0x3b -> :sswitch_2
    .end sparse-switch
.end method

.method public b()V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/a;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->h:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/a;->e:Ljava/io/InputStream;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method
