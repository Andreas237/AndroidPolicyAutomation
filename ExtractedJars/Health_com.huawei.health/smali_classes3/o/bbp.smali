.class public abstract Lo/bbp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bbp$a;,
        Lo/bbp$c;,
        Lo/bbp$d;
    }
.end annotation


# static fields
.field public static final b:Ljava/util/concurrent/Executor;

.field public static final c:Ljava/util/concurrent/Executor;

.field public static final e:Ljava/util/concurrent/Executor;

.field private static final h:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field protected a:Landroid/content/Context;

.field private d:Lo/bbj;

.field private f:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 34
    new-instance v0, Lo/bbp$4;

    invoke-direct {v0}, Lo/bbp$4;-><init>()V

    sput-object v0, Lo/bbp;->h:Ljava/util/concurrent/ThreadFactory;

    .line 48
    sget-object v0, Lo/bbp;->h:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/bbp;->b:Ljava/util/concurrent/Executor;

    .line 53
    sget-object v0, Lo/bbp;->h:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x3

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    .line 58
    sget-object v0, Lo/bbp;->h:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/bbp;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lo/bbp;->a:Landroid/content/Context;

    .line 63
    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 656
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method private b(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 640
    if-eqz p1, :cond_0

    .line 643
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 644
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 646
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/bbp;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lo/bbp;->b(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static c(Lo/bbi;Landroid/widget/ImageView;)Z
    .locals 3

    .line 356
    invoke-static {p1}, Lo/bbs;->b(Landroid/widget/ImageView;)Lo/bbp$c;

    move-result-object v1

    .line 358
    if-eqz v1, :cond_2

    .line 360
    invoke-static {v1}, Lo/bbp$c;->e(Lo/bbp$c;)Lo/bbi;

    move-result-object v2

    .line 361
    if-eqz v2, :cond_0

    invoke-virtual {v2, p0}, Lo/bbi;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 363
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/bbp$c;->cancel(Z)Z

    goto :goto_0

    .line 367
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 370
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lo/bbi;Landroid/widget/ImageView;)V
    .locals 6

    .line 117
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_0

    .line 119
    new-instance v4, Lo/bbp$d;

    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-direct {v4, p0, p0, v0, p2}, Lo/bbp$d;-><init>(Lo/bbp;Lo/bbp;Landroid/content/Context;Landroid/widget/ImageView;)V

    .line 120
    sget-object v0, Lo/bbp;->b:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/bbf;

    move-object v2, p1

    check-cast v2, Lo/bbf;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Lo/bbp$d;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 121
    goto/16 :goto_0

    .line 122
    :cond_0
    instance-of v0, p1, Lo/bbr;

    if-eqz v0, :cond_1

    .line 124
    new-instance v4, Lo/bbp$c;

    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-direct {v4, p2, p0, v0}, Lo/bbp$c;-><init>(Landroid/widget/ImageView;Lo/bbp;Landroid/content/Context;)V

    .line 125
    new-instance v5, Lo/bbp$a;

    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lo/bbr;

    invoke-virtual {v1}, Lo/bbr;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v5, v0, v1, v4}, Lo/bbp$a;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lo/bbp$c;)V

    .line 126
    invoke-virtual {p2, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 127
    sget-object v0, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/bbi;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v4, v0, v1}, Lo/bbp$c;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 128
    goto :goto_0

    .line 131
    :cond_1
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    new-instance v4, Lo/bbp$c;

    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-direct {v4, p2, p0, v0}, Lo/bbp$c;-><init>(Landroid/widget/ImageView;Lo/bbp;Landroid/content/Context;)V

    .line 134
    new-instance v5, Lo/bbp$a;

    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Lo/bbp;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v5, v0, v1, v4}, Lo/bbp$a;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lo/bbp$c;)V

    .line 135
    invoke-virtual {p2, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 136
    sget-object v0, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/bbi;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v4, v0, v1}, Lo/bbp$c;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 148
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 258
    if-nez p1, :cond_0

    .line 260
    const/4 v0, 0x0

    return-object v0

    .line 262
    :cond_0
    const/4 v1, 0x0

    .line 263
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    invoke-virtual {v0, p1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 267
    :cond_1
    return-object v1
.end method

.method protected abstract a(Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method public a(Lo/bbj;)V
    .locals 0

    .line 336
    iput-object p1, p0, Lo/bbp;->d:Lo/bbj;

    .line 337
    return-void
.end method

.method public b(Lo/bbi;Z)Landroid/graphics/Bitmap;
    .locals 5

    .line 204
    const/4 v2, 0x0

    .line 205
    if-nez p1, :cond_0

    .line 207
    const/4 v0, 0x0

    return-object v0

    .line 210
    :cond_0
    const/4 v3, 0x0

    .line 212
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_4

    .line 214
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_2

    .line 216
    move-object v4, p1

    check-cast v4, Lo/bbf;

    .line 217
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    .line 218
    invoke-virtual {v4}, Lo/bbf;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Lo/bbf;->f()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v1

    .line 217
    :goto_0
    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 219
    goto :goto_1

    .line 220
    :cond_2
    instance-of v0, p1, Lo/baw;

    if-eqz v0, :cond_3

    .line 222
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    move-object v1, p1

    check-cast v1, Lo/baw;

    invoke-virtual {v1}, Lo/baw;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_1

    .line 226
    :cond_3
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    iget-object v1, p1, Lo/bbi;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 230
    :cond_4
    :goto_1
    if-eqz v3, :cond_6

    .line 232
    instance-of v0, v3, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_5

    .line 234
    move-object v4, v3

    check-cast v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 235
    invoke-virtual {v4}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 236
    goto :goto_2

    .line 240
    :cond_5
    invoke-static {v3}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 242
    :goto_2
    return-object v2

    .line 245
    :cond_6
    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-static {p1, p2, p0, v0}, Lo/bbo;->b(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 247
    return-object v2
.end method

.method public b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 278
    const/4 v1, 0x0

    .line 279
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 281
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v1, v0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 283
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_0

    .line 285
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    invoke-virtual {v0, p1, v1}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 288
    :cond_0
    return-object v1
.end method

.method public b()Lo/bbj;
    .locals 1

    .line 341
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    return-object v0
.end method

.method protected abstract c(Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;
.end method

.method public c(Lo/bbi;Z)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 159
    const/4 v2, 0x0

    .line 160
    if-nez p1, :cond_0

    .line 162
    const/4 v0, 0x0

    return-object v0

    .line 165
    :cond_0
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_4

    .line 167
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_2

    .line 170
    move-object v3, p1

    check-cast v3, Lo/bbf;

    .line 171
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    .line 172
    invoke-virtual {v3}, Lo/bbf;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v3}, Lo/bbf;->f()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v1

    .line 171
    :goto_0
    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 174
    goto :goto_1

    .line 175
    :cond_2
    instance-of v0, p1, Lo/baw;

    if-eqz v0, :cond_3

    .line 177
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    move-object v1, p1

    check-cast v1, Lo/baw;

    invoke-virtual {v1}, Lo/baw;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_1

    .line 181
    :cond_3
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    iget-object v1, p1, Lo/bbi;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 185
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 187
    return-object v2

    .line 190
    :cond_5
    iget-object v0, p0, Lo/bbp;->a:Landroid/content/Context;

    invoke-static {p1, p2, p0, v0}, Lo/bbo;->d(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 192
    return-object v2
.end method

.method public c(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lo/bbp;->f:Landroid/graphics/Bitmap;

    .line 332
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 315
    if-eqz p1, :cond_0

    .line 317
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    invoke-virtual {v0, p1}, Lo/bbj;->a(Ljava/lang/String;)V

    .line 322
    :cond_0
    return-void
.end method

.method protected abstract d(Ljava/lang/Object;)Landroid/graphics/Bitmap;
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 326
    iget-object v0, p0, Lo/bbp;->f:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method protected abstract e(Ljava/lang/Object;)Landroid/graphics/Bitmap;
.end method

.method public e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 299
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 301
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    invoke-virtual {v0, p1, p2}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 306
    :cond_0
    return-void
.end method

.method protected abstract e(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public e(Lo/bbi;Landroid/widget/ImageView;)V
    .locals 4

    .line 68
    if-nez p1, :cond_0

    .line 70
    return-void

    .line 73
    :cond_0
    const/4 v2, 0x0

    .line 75
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    if-eqz v0, :cond_4

    .line 77
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_2

    .line 79
    move-object v3, p1

    check-cast v3, Lo/bbf;

    .line 81
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    .line 82
    invoke-virtual {v3}, Lo/bbf;->h()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v3}, Lo/bbf;->f()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v1

    .line 81
    :goto_0
    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    instance-of v0, p1, Lo/baw;

    if-eqz v0, :cond_3

    .line 86
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    move-object v1, p1

    check-cast v1, Lo/baw;

    invoke-virtual {v1}, Lo/baw;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_1

    .line 90
    :cond_3
    iget-object v0, p0, Lo/bbp;->d:Lo/bbj;

    iget-object v1, p1, Lo/bbi;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 94
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 96
    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    instance-of v0, p1, Lo/bbt;

    if-eqz v0, :cond_6

    .line 99
    move-object v0, p1

    check-cast v0, Lo/bbt;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bbt;->e(Z)V

    .line 100
    const/16 v0, 0xb

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    goto :goto_2

    .line 103
    :cond_5
    invoke-static {p1, p2}, Lo/bbp;->c(Lo/bbi;Landroid/widget/ImageView;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 106
    invoke-direct {p0, p1, p2}, Lo/bbp;->d(Lo/bbi;Landroid/widget/ImageView;)V

    .line 108
    :cond_6
    :goto_2
    return-void
.end method
