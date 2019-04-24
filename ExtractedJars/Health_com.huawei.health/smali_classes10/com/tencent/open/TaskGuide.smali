.class public Lcom/tencent/open/TaskGuide;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/TaskGuide$4;,
        Lcom/tencent/open/TaskGuide$d;,
        Lcom/tencent/open/TaskGuide$a;,
        Lcom/tencent/open/TaskGuide$j;,
        Lcom/tencent/open/TaskGuide$g;,
        Lcom/tencent/open/TaskGuide$h;,
        Lcom/tencent/open/TaskGuide$b;,
        Lcom/tencent/open/TaskGuide$c;,
        Lcom/tencent/open/TaskGuide$e;,
        Lcom/tencent/open/TaskGuide$i;,
        Lcom/tencent/open/TaskGuide$f;,
        Lcom/tencent/open/TaskGuide$k;
    }
.end annotation


# static fields
.field private static L:I

.field static b:J

.field private static k:Landroid/graphics/drawable/Drawable;

.field private static l:Landroid/graphics/drawable/Drawable;

.field private static m:Landroid/graphics/drawable/Drawable;

.field private static n:I

.field private static o:I

.field private static p:I

.field private static q:I

.field private static r:I

.field private static s:I

.field private static t:I

.field private static u:I

.field private static v:I

.field private static w:I

.field private static x:I

.field private static y:I

.field private static z:I


# instance fields
.field private A:I

.field private B:I

.field private C:F

.field private D:Landroid/view/animation/Interpolator;

.field private E:Z

.field private F:Landroid/content/Context;

.field private G:Z

.field private H:Z

.field private I:J

.field private J:I

.field private K:I

.field private M:Ljava/lang/Runnable;

.field private N:Ljava/lang/Runnable;

.field a:Z

.field c:Lcom/tencent/tauth/IUiListener;

.field private d:Landroid/view/WindowManager$LayoutParams;

.field private e:Landroid/view/ViewGroup;

.field private f:Landroid/view/WindowManager;

.field private g:Landroid/os/Handler;

.field private h:Lcom/tencent/open/TaskGuide$h;

.field private i:Lcom/tencent/open/TaskGuide$k;

.field private j:Lcom/tencent/open/TaskGuide$k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 79
    const/16 v0, 0x4b

    sput v0, Lcom/tencent/open/TaskGuide;->n:I

    .line 80
    const/16 v0, 0x11c

    sput v0, Lcom/tencent/open/TaskGuide;->o:I

    .line 82
    const/16 v0, 0x4b

    sput v0, Lcom/tencent/open/TaskGuide;->p:I

    .line 83
    const/16 v0, 0x1e

    sput v0, Lcom/tencent/open/TaskGuide;->q:I

    .line 84
    const/16 v0, 0x1d

    sput v0, Lcom/tencent/open/TaskGuide;->r:I

    .line 85
    const/4 v0, 0x5

    sput v0, Lcom/tencent/open/TaskGuide;->s:I

    .line 87
    const/16 v0, 0x4a

    sput v0, Lcom/tencent/open/TaskGuide;->t:I

    .line 88
    const/4 v0, 0x0

    sput v0, Lcom/tencent/open/TaskGuide;->u:I

    .line 89
    const/4 v0, 0x6

    sput v0, Lcom/tencent/open/TaskGuide;->v:I

    .line 93
    const/16 v0, 0x99

    sput v0, Lcom/tencent/open/TaskGuide;->w:I

    .line 94
    const/16 v0, 0x1e

    sput v0, Lcom/tencent/open/TaskGuide;->x:I

    .line 96
    const/4 v0, 0x6

    sput v0, Lcom/tencent/open/TaskGuide;->y:I

    .line 97
    const/4 v0, 0x3

    sput v0, Lcom/tencent/open/TaskGuide;->z:I

    .line 574
    const-wide/16 v0, 0x1388

    sput-wide v0, Lcom/tencent/open/TaskGuide;->b:J

    .line 577
    const/16 v0, 0xbb8

    sput v0, Lcom/tencent/open/TaskGuide;->L:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
    .locals 2

    .line 116
    invoke-direct {p0, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    .line 68
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    .line 71
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->a:Lcom/tencent/open/TaskGuide$k;

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    .line 72
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->a:Lcom/tencent/open/TaskGuide$k;

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide;->A:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide;->B:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide;->C:F

    .line 102
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->D:Landroid/view/animation/Interpolator;

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->E:Z

    .line 522
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->a:Z

    .line 571
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    .line 572
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->H:Z

    .line 578
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    .line 579
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    .line 117
    iput-object p1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    .line 118
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    .line 120
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->c()V

    .line 121
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
    .locals 2

    .line 108
    invoke-direct {p0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    .line 68
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    .line 71
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->a:Lcom/tencent/open/TaskGuide$k;

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    .line 72
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->a:Lcom/tencent/open/TaskGuide$k;

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    .line 99
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide;->A:I

    .line 100
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide;->B:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/open/TaskGuide;->C:F

    .line 102
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->D:Landroid/view/animation/Interpolator;

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->E:Z

    .line 522
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->a:Z

    .line 571
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    .line 572
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->H:Z

    .line 578
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    .line 579
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    .line 109
    iput-object p1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    .line 110
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    .line 111
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->c()V

    .line 112
    return-void
.end method

.method static synthetic a()I
    .locals 1

    .line 60
    sget v0, Lcom/tencent/open/TaskGuide;->p:I

    return v0
.end method

.method private a(I)I
    .locals 2

    .line 175
    int-to-float v0, p1

    iget v1, p0, Lcom/tencent/open/TaskGuide;->C:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 678
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    .line 679
    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    .line 681
    const/4 v3, 0x0

    .line 683
    :try_start_0
    invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 684
    if-nez v4, :cond_0

    .line 685
    const/4 v0, 0x0

    return-object v0

    .line 687
    :cond_0
    const-string v0, ".9.png"

    :try_start_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    if-eqz v0, :cond_2

    .line 688
    const/4 v5, 0x0

    .line 690
    :try_start_2
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v5

    .line 694
    goto :goto_0

    .line 691
    :catch_0
    move-exception v6

    .line 692
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 693
    const/4 v5, 0x0

    .line 695
    :goto_0
    if-eqz v5, :cond_1

    .line 696
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B

    move-result-object v6

    .line 697
    invoke-static {v6}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z

    move-result v7

    .line 698
    new-instance v8, Landroid/graphics/drawable/NinePatchDrawable;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x0

    invoke-direct {v8, v5, v6, v0, v1}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 699
    move-object v3, v8

    .line 700
    goto :goto_1

    .line 701
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 703
    :goto_1
    goto :goto_2

    .line 704
    :cond_2
    :try_start_4
    invoke-static {v4, p1}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    .line 705
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 712
    :goto_2
    goto :goto_3

    .line 709
    :catch_1
    move-exception v4

    .line 711
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 713
    :goto_3
    return-object v3
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;Landroid/content/Context;)Landroid/view/ViewGroup;
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->b(Landroid/content/Context;)Landroid/view/ViewGroup;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    return-object p1
.end method

.method private a(Landroid/content/Context;)Landroid/view/WindowManager$LayoutParams;
    .locals 5

    .line 134
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v2}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 136
    const/16 v0, 0x31

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 141
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v3

    .line 142
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v4

    .line 144
    sget v0, Lcom/tencent/open/TaskGuide;->o:I

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->a(I)I

    move-result v0

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 146
    sget v0, Lcom/tencent/open/TaskGuide;->n:I

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->a(I)I

    move-result v0

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 148
    const v0, 0x1030002

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 149
    const/4 v0, 0x1

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 154
    iget v0, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit16 v0, v0, 0x208

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 155
    const/4 v0, 0x2

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 157
    iput-object v2, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    .line 158
    return-object v2
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;Landroid/view/WindowManager$LayoutParams;)Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    return-object p1
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$h;)Lcom/tencent/open/TaskGuide$h;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/tencent/open/TaskGuide;->h:Lcom/tencent/open/TaskGuide$h;

    return-object p1
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;I)Lcom/tencent/open/TaskGuide$k;
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->c(I)Lcom/tencent/open/TaskGuide$k;

    move-result-object v0

    return-object v0
.end method

.method private a(ILcom/tencent/open/TaskGuide$k;)V
    .locals 1

    .line 281
    if-nez p1, :cond_0

    .line 282
    iput-object p2, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    goto :goto_0

    .line 283
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 284
    iput-object p2, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    goto :goto_0

    .line 286
    :cond_1
    iput-object p2, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    .line 287
    iput-object p2, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    .line 290
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;ILcom/tencent/open/TaskGuide$k;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2}, Lcom/tencent/open/TaskGuide;->a(ILcom/tencent/open/TaskGuide$k;)V

    return-void
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;Ljava/lang/String;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .line 924
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/open/TaskGuide$3;

    invoke-direct {v1, p0, p1}, Lcom/tencent/open/TaskGuide$3;-><init>(Lcom/tencent/open/TaskGuide;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 933
    return-void
.end method

.method private a(Z)V
    .locals 3

    .line 623
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/open/TaskGuide;->I:J

    .line 625
    if-eqz p1, :cond_0

    .line 626
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    goto :goto_0

    .line 628
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->H:Z

    .line 630
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    iput v0, p0, Lcom/tencent/open/TaskGuide;->J:I

    .line 631
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iput v0, p0, Lcom/tencent/open/TaskGuide;->K:I

    .line 633
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/lit8 v1, v1, 0x10

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 634
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 636
    return-void
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;)Z
    .locals 1

    .line 60
    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->E:Z

    return v0
.end method

.method static synthetic a(Lcom/tencent/open/TaskGuide;Z)Z
    .locals 0

    .line 60
    iput-boolean p1, p0, Lcom/tencent/open/TaskGuide;->E:Z

    return p1
.end method

.method static synthetic b()I
    .locals 1

    .line 60
    sget v0, Lcom/tencent/open/TaskGuide;->q:I

    return v0
.end method

.method private b(Landroid/content/Context;)Landroid/view/ViewGroup;
    .locals 10

    .line 185
    new-instance v4, Lcom/tencent/open/TaskGuide$e;

    invoke-direct {v4, p0, p1}, Lcom/tencent/open/TaskGuide$e;-><init>(Lcom/tencent/open/TaskGuide;Landroid/content/Context;)V

    .line 186
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->h:Lcom/tencent/open/TaskGuide$h;

    iget-object v5, v0, Lcom/tencent/open/TaskGuide$h;->c:[Lcom/tencent/open/TaskGuide$g;

    .line 187
    array-length v0, v5

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 188
    new-instance v6, Lcom/tencent/open/TaskGuide$i;

    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-direct {v6, p0, p1, v0}, Lcom/tencent/open/TaskGuide$i;-><init>(Lcom/tencent/open/TaskGuide;Landroid/content/Context;Lcom/tencent/open/TaskGuide$g;)V

    .line 189
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/tencent/open/TaskGuide$i;->setId(I)V

    .line 190
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v7, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 191
    const/16 v0, 0xf

    invoke-virtual {v7, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 192
    invoke-virtual {v4, v6, v7}, Lcom/tencent/open/TaskGuide$e;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 193
    goto/16 :goto_0

    .line 194
    :cond_0
    new-instance v6, Lcom/tencent/open/TaskGuide$i;

    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-direct {v6, p0, p1, v0}, Lcom/tencent/open/TaskGuide$i;-><init>(Lcom/tencent/open/TaskGuide;Landroid/content/Context;Lcom/tencent/open/TaskGuide$g;)V

    .line 195
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/tencent/open/TaskGuide$i;->setId(I)V

    .line 196
    new-instance v7, Lcom/tencent/open/TaskGuide$i;

    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-direct {v7, p0, p1, v0}, Lcom/tencent/open/TaskGuide$i;-><init>(Lcom/tencent/open/TaskGuide;Landroid/content/Context;Lcom/tencent/open/TaskGuide$g;)V

    .line 197
    const/4 v0, 0x2

    invoke-virtual {v7, v0}, Lcom/tencent/open/TaskGuide$i;->setId(I)V

    .line 198
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v8, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 199
    const/16 v0, 0xe

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 200
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->a(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 203
    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v9, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 204
    const/16 v0, 0xe

    invoke-virtual {v9, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 205
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->a(I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v9, v1, v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 206
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 207
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 209
    invoke-virtual {v4, v6, v8}, Lcom/tencent/open/TaskGuide$e;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    invoke-virtual {v4, v7, v9}, Lcom/tencent/open/TaskGuide$e;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 212
    :goto_0
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 213
    invoke-virtual {v4, v6}, Lcom/tencent/open/TaskGuide$e;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 214
    return-object v4
.end method

.method static synthetic b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic b(Lcom/tencent/open/TaskGuide;Landroid/content/Context;)Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->a(Landroid/content/Context;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    return-object v0
.end method

.method private b(I)V
    .locals 2

    .line 242
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/open/TaskGuide$1;

    invoke-direct {v1, p0, p1}, Lcom/tencent/open/TaskGuide$1;-><init>(Lcom/tencent/open/TaskGuide;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 267
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/tencent/open/TaskGuide;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->e(I)V

    return-void
.end method

.method private c(I)Lcom/tencent/open/TaskGuide$k;
    .locals 1

    .line 314
    if-nez p1, :cond_0

    .line 315
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    return-object v0

    .line 316
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 317
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    return-object v0

    .line 319
    :cond_1
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->a:Lcom/tencent/open/TaskGuide$k;

    return-object v0
.end method

.method static synthetic c(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    return-object v0
.end method

.method private c()V
    .locals 2

    .line 125
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 126
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 127
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/tencent/open/TaskGuide;->A:I

    .line 128
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/tencent/open/TaskGuide;->B:I

    .line 129
    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    iput v0, p0, Lcom/tencent/open/TaskGuide;->C:F

    .line 130
    return-void
.end method

.method static synthetic c(Lcom/tencent/open/TaskGuide;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/tencent/open/TaskGuide;I)I
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->a(I)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$k;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 162
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    neg-int v1, v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 165
    :cond_0
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 594
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->h()V

    .line 595
    new-instance v0, Lcom/tencent/open/TaskGuide$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tencent/open/TaskGuide$b;-><init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    .line 596
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 597
    return-void
.end method

.method private e()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 221
    sget-object v0, Lcom/tencent/open/TaskGuide;->k:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 222
    const-string v0, "background.9.png"

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/tencent/open/TaskGuide;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/TaskGuide;->k:Landroid/graphics/drawable/Drawable;

    .line 224
    :cond_0
    sget-object v0, Lcom/tencent/open/TaskGuide;->k:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method private e(I)V
    .locals 8

    .line 1059
    invoke-virtual {p0}, Lcom/tencent/open/TaskGuide;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 1060
    const-string v0, "action"

    const-string v1, "get_gift"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1061
    const-string v0, "task_id"

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->h:Lcom/tencent/open/TaskGuide$h;

    iget-object v1, v1, Lcom/tencent/open/TaskGuide$h;->a:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1062
    const-string v0, "step_no"

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1063
    const-string v0, "appid"

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1065
    new-instance v7, Lcom/tencent/open/TaskGuide$d;

    invoke-direct {v7, p0, p1}, Lcom/tencent/open/TaskGuide$d;-><init>(Lcom/tencent/open/TaskGuide;I)V

    .line 1066
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->mToken:Lcom/tencent/connect/auth/QQToken;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    const-string v2, "http://appact.qzone.qq.com/appstore_activity_task_pcpush_sdk"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 1069
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->c:Lcom/tencent/open/TaskGuide$k;

    invoke-direct {p0, p1, v0}, Lcom/tencent/open/TaskGuide;->a(ILcom/tencent/open/TaskGuide$k;)V

    .line 1070
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->mToken:Lcom/tencent/connect/auth/QQToken;

    const-string v2, "TaskApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "getGift"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 1071
    return-void
.end method

.method static synthetic e(Lcom/tencent/open/TaskGuide;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->h()V

    return-void
.end method

.method static synthetic e(Lcom/tencent/open/TaskGuide;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/tencent/open/TaskGuide;->d(I)V

    return-void
.end method

.method static synthetic f(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    return-object v0
.end method

.method private f()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 228
    sget-object v0, Lcom/tencent/open/TaskGuide;->l:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 229
    const-string v0, "button_green.9.png"

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/tencent/open/TaskGuide;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/TaskGuide;->l:Landroid/graphics/drawable/Drawable;

    .line 231
    :cond_0
    sget-object v0, Lcom/tencent/open/TaskGuide;->l:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method private g()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 235
    sget-object v0, Lcom/tencent/open/TaskGuide;->m:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 236
    const-string v0, "button_red.9.png"

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/tencent/open/TaskGuide;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/TaskGuide;->m:Landroid/graphics/drawable/Drawable;

    .line 238
    :cond_0
    sget-object v0, Lcom/tencent/open/TaskGuide;->m:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic g(Lcom/tencent/open/TaskGuide;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->d()V

    return-void
.end method

.method static synthetic h(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 600
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 601
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 602
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 604
    :cond_0
    return-void
.end method

.method private i()V
    .locals 3

    .line 607
    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    if-eqz v0, :cond_0

    .line 608
    const/16 v0, 0xbb8

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->d(I)V

    goto :goto_0

    .line 610
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/open/TaskGuide;->removeWindow()V

    .line 613
    :goto_0
    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    if-eqz v0, :cond_1

    .line 614
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit8 v1, v1, -0x11

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 615
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    iget-object v2, p0, Lcom/tencent/open/TaskGuide;->d:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 617
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    .line 618
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->H:Z

    .line 620
    return-void
.end method

.method static synthetic i(Lcom/tencent/open/TaskGuide;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->k()V

    return-void
.end method

.method static synthetic j(Lcom/tencent/open/TaskGuide;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private j()Z
    .locals 1

    .line 639
    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->G:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->H:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic k(Lcom/tencent/open/TaskGuide;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->g()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 643
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 644
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 645
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 646
    new-instance v0, Lcom/tencent/open/TaskGuide$c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/tencent/open/TaskGuide$c;-><init>(Lcom/tencent/open/TaskGuide;Z)V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    .line 647
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->a(Z)V

    .line 648
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 651
    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    .line 657
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 658
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->N:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 659
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 660
    new-instance v0, Lcom/tencent/open/TaskGuide$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/tencent/open/TaskGuide$c;-><init>(Lcom/tencent/open/TaskGuide;Z)V

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    .line 661
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/tencent/open/TaskGuide;->a(Z)V

    .line 662
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 665
    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/tencent/open/TaskGuide;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->l()V

    return-void
.end method

.method static synthetic m(Lcom/tencent/open/TaskGuide;)Landroid/view/animation/Interpolator;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->D:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method static synthetic n(Lcom/tencent/open/TaskGuide;)I
    .locals 1

    .line 60
    iget v0, p0, Lcom/tencent/open/TaskGuide;->J:I

    return v0
.end method

.method static synthetic o(Lcom/tencent/open/TaskGuide;)I
    .locals 1

    .line 60
    iget v0, p0, Lcom/tencent/open/TaskGuide;->K:I

    return v0
.end method

.method static synthetic p(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    return-object v0
.end method

.method static synthetic q(Lcom/tencent/open/TaskGuide;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/tencent/open/TaskGuide;->i()V

    return-void
.end method

.method static synthetic r(Lcom/tencent/open/TaskGuide;)Ljava/lang/Runnable;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->M:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic s(Lcom/tencent/open/TaskGuide;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic t(Lcom/tencent/open/TaskGuide;)Lcom/tencent/open/TaskGuide$h;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->h:Lcom/tencent/open/TaskGuide$h;

    return-object v0
.end method


# virtual methods
.method public removeWindow()V
    .locals 2

    .line 670
    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->E:Z

    if-eqz v0, :cond_0

    .line 671
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->f:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->e:Landroid/view/ViewGroup;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 672
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/TaskGuide;->E:Z

    .line 674
    :cond_0
    return-void
.end method

.method public showTaskGuideWindow(Landroid/app/Activity;Landroid/os/Bundle;Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 1026
    iput-object p1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    .line 1027
    iput-object p3, p0, Lcom/tencent/open/TaskGuide;->c:Lcom/tencent/tauth/IUiListener;

    .line 1029
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->i:Lcom/tencent/open/TaskGuide$k;

    sget-object v1, Lcom/tencent/open/TaskGuide$k;->b:Lcom/tencent/open/TaskGuide$k;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->j:Lcom/tencent/open/TaskGuide$k;

    sget-object v1, Lcom/tencent/open/TaskGuide$k;->b:Lcom/tencent/open/TaskGuide$k;

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/tencent/open/TaskGuide;->E:Z

    if-eqz v0, :cond_1

    .line 1030
    :cond_0
    return-void

    .line 1033
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/TaskGuide;->h:Lcom/tencent/open/TaskGuide$h;

    .line 1037
    if-eqz p2, :cond_2

    .line 1038
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1039
    invoke-virtual {p0}, Lcom/tencent/open/TaskGuide;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    goto :goto_0

    .line 1042
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/open/TaskGuide;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 1045
    :goto_0
    new-instance v7, Lcom/tencent/open/TaskGuide$j;

    const/4 v0, 0x0

    invoke-direct {v7, p0, v0}, Lcom/tencent/open/TaskGuide$j;-><init>(Lcom/tencent/open/TaskGuide;Lcom/tencent/open/TaskGuide$1;)V

    .line 1046
    const-string v0, "action"

    const-string v1, "task_list"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1047
    const-string v0, "auth"

    const-string v1, "mobile"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1049
    const-string v0, "appid"

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v1}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1051
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->mToken:Lcom/tencent/connect/auth/QQToken;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    const-string v2, "http://appact.qzone.qq.com/appstore_activity_task_pcpush_sdk"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 1054
    sget-object v0, Lcom/tencent/open/TaskGuide$k;->b:Lcom/tencent/open/TaskGuide$k;

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Lcom/tencent/open/TaskGuide;->a(ILcom/tencent/open/TaskGuide$k;)V

    .line 1055
    return-void
.end method

.method public showWindow()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor"
        }
    .end annotation

    .line 329
    new-instance v6, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 331
    new-instance v0, Lcom/tencent/open/TaskGuide$2;

    invoke-direct {v0, p0}, Lcom/tencent/open/TaskGuide$2;-><init>(Lcom/tencent/open/TaskGuide;)V

    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 361
    iget-object v0, p0, Lcom/tencent/open/TaskGuide;->F:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide;->mToken:Lcom/tencent/connect/auth/QQToken;

    const-string v2, "TaskApi"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "showTaskWindow"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 363
    return-void
.end method
