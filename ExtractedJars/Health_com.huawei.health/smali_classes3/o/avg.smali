.class public abstract Lo/avg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/avg$a;,
        Lo/avg$d;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ThreadFactory;

.field private static final e:I

.field private static final f:Ljava/util/concurrent/Executor;


# instance fields
.field private b:Landroid/graphics/Bitmap;

.field private c:Lo/bbj;

.field protected d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_broken_white:I

    sput v0, Lo/avg;->e:I

    .line 52
    new-instance v0, Lo/avg$1;

    invoke-direct {v0}, Lo/avg$1;-><init>()V

    sput-object v0, Lo/avg;->a:Ljava/util/concurrent/ThreadFactory;

    .line 66
    sget-object v0, Lo/avg;->a:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/avg;->f:Ljava/util/concurrent/Executor;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Lo/avg;->d:Landroid/content/Context;

    .line 76
    return-void
.end method

.method static synthetic a(Lo/avg;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lo/avg;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private c(Landroid/widget/ImageView;)Lo/avg$d;
    .locals 3

    .line 207
    if-nez p1, :cond_0

    .line 209
    const/4 v0, 0x0

    return-object v0

    .line 211
    :cond_0
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 212
    instance-of v0, v1, Lo/avg$a;

    if-eqz v0, :cond_1

    .line 214
    move-object v2, v1

    check-cast v2, Lo/avg$a;

    .line 215
    invoke-virtual {v2}, Lo/avg$a;->d()Lo/avg$d;

    move-result-object v0

    return-object v0

    .line 217
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private c(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 124
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 125
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    .line 126
    int-to-float v0, v3

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v2

    div-float v4, v0, v1

    .line 127
    if-le v3, v2, :cond_0

    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->f()F

    move-result v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_0

    .line 129
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 131
    :cond_0
    return-void
.end method

.method static synthetic d()I
    .locals 1

    .line 30
    sget v0, Lo/avg;->e:I

    return v0
.end method

.method static synthetic d(Lo/avg;Landroid/widget/ImageView;)Lo/avg$d;
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Lo/avg;->c(Landroid/widget/ImageView;)Lo/avg$d;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/avg;)Lo/bbj;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/avg;->c:Lo/bbj;

    return-object v0
.end method

.method private e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 351
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 352
    return-void
.end method

.method static synthetic e(Lo/avg;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lo/avg;->c(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private e(Lo/auy;Landroid/widget/ImageView;)Z
    .locals 3

    .line 181
    invoke-direct {p0, p2}, Lo/avg;->c(Landroid/widget/ImageView;)Lo/avg$d;

    move-result-object v1

    .line 183
    if-nez v1, :cond_0

    .line 185
    const/4 v0, 0x1

    return v0

    .line 187
    :cond_0
    invoke-static {v1}, Lo/avg$d;->a(Lo/avg$d;)Lo/auy;

    move-result-object v2

    .line 188
    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Lo/auy;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 190
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/avg$d;->cancel(Z)Z

    .line 191
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 151
    iget-object v0, p0, Lo/avg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/avg;->b:Landroid/graphics/Bitmap;

    .line 152
    return-void
.end method

.method public a(Landroid/widget/ImageView;Lo/auy;)V
    .locals 6

    .line 86
    if-nez p2, :cond_0

    .line 88
    return-void

    .line 91
    :cond_0
    const/4 v3, 0x0

    .line 94
    iget-object v0, p0, Lo/avg;->c:Lo/bbj;

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lo/avg;->c:Lo/bbj;

    invoke-virtual {p2}, Lo/auy;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 99
    :cond_1
    if-eqz v3, :cond_2

    .line 101
    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    invoke-virtual {p2}, Lo/auy;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 104
    invoke-direct {p0, p1, v3}, Lo/avg;->c(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 107
    :cond_2
    invoke-direct {p0, p2, p1}, Lo/avg;->e(Lo/auy;Landroid/widget/ImageView;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 109
    new-instance v4, Lo/avg$d;

    invoke-direct {v4, p0, p1}, Lo/avg$d;-><init>(Lo/avg;Landroid/widget/ImageView;)V

    .line 110
    new-instance v5, Lo/avg$a;

    iget-object v0, p0, Lo/avg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lo/avg;->b:Landroid/graphics/Bitmap;

    invoke-direct {v5, v0, v1, v4}, Lo/avg$a;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lo/avg$d;)V

    .line 111
    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 112
    sget-object v0, Lo/avg;->f:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/auy;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {v4, v0, v1}, Lo/avg$d;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 114
    :cond_3
    :goto_0
    return-void
.end method

.method protected abstract d(Lo/auy;)Landroid/graphics/Bitmap;
.end method

.method public e(Lo/bbj;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lo/avg;->c:Lo/bbj;

    .line 170
    return-void
.end method
