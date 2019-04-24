.class public abstract Lo/aqw;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aqw$b;,
        Lo/aqw$a;
    }
.end annotation


# static fields
.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private a:Lo/bbj;

.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 47
    new-instance v0, Lo/aqw$3;

    invoke-direct {v0}, Lo/aqw$3;-><init>()V

    sput-object v0, Lo/aqw;->e:Ljava/util/concurrent/ThreadFactory;

    .line 61
    sget-object v0, Lo/aqw;->e:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/aqw;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lo/aqw;->c:Landroid/content/Context;

    .line 71
    return-void
.end method

.method static synthetic a(Lo/aqw;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lo/aqw;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private a(Lo/ard;Landroid/widget/ImageView;)Z
    .locals 3

    .line 205
    invoke-direct {p0, p2}, Lo/aqw;->d(Landroid/widget/ImageView;)Lo/aqw$a;

    move-result-object v1

    .line 207
    if-eqz v1, :cond_2

    .line 209
    invoke-static {v1}, Lo/aqw$a;->b(Lo/aqw$a;)Lo/ard;

    move-result-object v2

    .line 210
    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Lo/ard;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 212
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/aqw$a;->cancel(Z)Z

    goto :goto_0

    .line 216
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 219
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lo/aqw;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/aqw;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/aqw;)Lo/bbj;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    return-object v0
.end method

.method private d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 2

    .line 128
    const/4 v1, 0x0

    .line 129
    if-eqz p1, :cond_1

    .line 131
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 133
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 137
    :cond_0
    invoke-static {p1}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 140
    :cond_1
    :goto_0
    return-object v1
.end method

.method private d(Landroid/widget/ImageView;)Lo/aqw$a;
    .locals 3

    .line 230
    if-eqz p1, :cond_0

    .line 232
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 233
    instance-of v0, v1, Lo/aqw$b;

    if-eqz v0, :cond_0

    .line 235
    move-object v2, v1

    check-cast v2, Lo/aqw$b;

    .line 236
    invoke-virtual {v2}, Lo/aqw$b;->d()Lo/aqw$a;

    move-result-object v0

    return-object v0

    .line 239
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lo/aqw;Landroid/widget/ImageView;)Lo/aqw$a;
    .locals 1

    .line 32
    invoke-direct {p0, p1}, Lo/aqw;->d(Landroid/widget/ImageView;)Lo/aqw$a;

    move-result-object v0

    return-object v0
.end method

.method private e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 348
    if-nez p1, :cond_0

    .line 350
    return-void

    .line 353
    :cond_0
    instance-of v0, p1, Lo/bmx;

    if-eqz v0, :cond_1

    .line 355
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 359
    :cond_1
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 362
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 167
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 169
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lo/aqw;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 171
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    invoke-virtual {v0, p1, v1}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 176
    :cond_0
    return-void
.end method

.method public c(Lo/bbj;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lo/aqw;->a:Lo/bbj;

    .line 194
    return-void
.end method

.method protected abstract e(Lo/ard;)Landroid/graphics/Bitmap;
.end method

.method public e(Landroid/widget/ImageView;Lo/ard;)V
    .locals 7

    .line 81
    if-nez p2, :cond_0

    .line 83
    return-void

    .line 86
    :cond_0
    const/4 v3, 0x0

    .line 89
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    if-eqz v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    invoke-virtual {p2}, Lo/ard;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 94
    :cond_1
    if-eqz v3, :cond_2

    .line 96
    invoke-direct {p0, p1, v3}, Lo/aqw;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 101
    :cond_2
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Lo/ard;->h()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p2}, Lo/ard;->k()I

    move-result v0

    if-gtz v0, :cond_4

    .line 103
    :cond_3
    iget-object v0, p0, Lo/aqw;->a:Lo/bbj;

    invoke-virtual {p2}, Lo/ard;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 105
    :cond_4
    invoke-direct {p0, p2, p1}, Lo/aqw;->a(Lo/ard;Landroid/widget/ImageView;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 108
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 110
    new-instance v4, Lo/aqw$a;

    invoke-direct {v4, p0, p1}, Lo/aqw$a;-><init>(Lo/aqw;Landroid/widget/ImageView;)V

    .line 112
    invoke-direct {p0, v3}, Lo/aqw;->d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 113
    new-instance v6, Lo/aqw$b;

    iget-object v0, p0, Lo/aqw;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v6, v0, v5, v4}, Lo/aqw$b;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lo/aqw$a;)V

    .line 114
    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 115
    sget-object v0, Lo/aqw;->d:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/ard;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-virtual {v4, v0, v1}, Lo/aqw$a;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 119
    :cond_5
    :goto_0
    return-void
.end method
