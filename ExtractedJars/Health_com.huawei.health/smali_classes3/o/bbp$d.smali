.class Lo/bbp$d;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bbp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lo/bbf;Ljava/lang/Void;Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field final synthetic b:Lo/bbp;

.field private c:Landroid/widget/ImageView;

.field private d:Lo/bbf;

.field private e:Lo/bbp;


# direct methods
.method public constructor <init>(Lo/bbp;Lo/bbp;Landroid/content/Context;Landroid/widget/ImageView;)V
    .locals 1

    .line 388
    iput-object p1, p0, Lo/bbp$d;->b:Lo/bbp;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 379
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    .line 389
    iput-object p2, p0, Lo/bbp$d;->e:Lo/bbp;

    .line 390
    iput-object p3, p0, Lo/bbp$d;->a:Landroid/content/Context;

    .line 391
    iput-object p4, p0, Lo/bbp$d;->c:Landroid/widget/ImageView;

    .line 392
    return-void
.end method

.method private b(Lo/bbf;)Z
    .locals 3

    .line 481
    invoke-virtual {p1}, Lo/bbf;->b()Ljava/lang/String;

    move-result-object v1

    .line 482
    invoke-virtual {p1}, Lo/bbf;->d()Ljava/lang/String;

    move-result-object v2

    .line 484
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 486
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 488
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected varargs b([Lo/bbf;)Landroid/graphics/drawable/Drawable;
    .locals 7

    .line 406
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    .line 407
    const/4 v3, 0x0

    .line 408
    const/4 v4, 0x0

    .line 411
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    invoke-virtual {v0}, Lo/bbf;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    iget-object v0, p0, Lo/bbp$d;->b:Lo/bbp;

    invoke-virtual {v0}, Lo/bbp;->b()Lo/bbj;

    move-result-object v5

    .line 414
    if-eqz v5, :cond_0

    .line 416
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    invoke-virtual {v0}, Lo/bbf;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 420
    :cond_0
    if-nez v3, :cond_1

    .line 423
    invoke-virtual {p0}, Lo/bbp$d;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 425
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    invoke-virtual {v0}, Lo/bbf;->b()Ljava/lang/String;

    move-result-object v5

    .line 426
    iget-object v0, p0, Lo/bbp$d;->e:Lo/bbp;

    iget-object v1, p0, Lo/bbp$d;->d:Lo/bbf;

    invoke-static {v5}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bbp;->c(Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 428
    iget-object v0, p0, Lo/bbp$d;->e:Lo/bbp;

    invoke-virtual {v0}, Lo/bbp;->b()Lo/bbj;

    move-result-object v6

    .line 429
    if-eqz v4, :cond_1

    if-eqz v6, :cond_1

    .line 432
    iget-object v0, p0, Lo/bbp$d;->a:Landroid/content/Context;

    invoke-static {v4, v0}, Lo/bbp;->a(Landroid/graphics/Bitmap;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 433
    invoke-virtual {v6, v5, v3}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 437
    :cond_1
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bbf;->a(Z)V

    .line 438
    return-object v3
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 377
    move-object v0, p1

    check-cast v0, [Lo/bbf;

    invoke-virtual {p0, v0}, Lo/bbp$d;->b([Lo/bbf;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected e(Landroid/graphics/drawable/Drawable;)V
    .locals 8

    .line 445
    iget-object v0, p0, Lo/bbp$d;->b:Lo/bbp;

    invoke-virtual {v0}, Lo/bbp;->e()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 447
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    invoke-direct {p0, v0}, Lo/bbp$d;->b(Lo/bbf;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    invoke-virtual {v0}, Lo/bbf;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 449
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 451
    invoke-static {p1}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 453
    if-nez v5, :cond_2

    .line 455
    iget-object v0, p0, Lo/bbp$d;->e:Lo/bbp;

    iget-object v1, p0, Lo/bbp$d;->c:Landroid/widget/ImageView;

    invoke-static {v0, v1, p1}, Lo/bbp;->c(Lo/bbp;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 456
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    instance-of v0, v0, Lo/bbt;

    if-eqz v0, :cond_2

    .line 458
    iget-object v0, p0, Lo/bbp$d;->d:Lo/bbf;

    check-cast v0, Lo/bbt;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bbt;->e(Z)V

    .line 459
    const/16 v0, 0xb

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 464
    :cond_2
    if-eqz v5, :cond_3

    .line 466
    new-instance v6, Lo/bbp$c;

    iget-object v0, p0, Lo/bbp$d;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bbp$d;->e:Lo/bbp;

    iget-object v2, p0, Lo/bbp$d;->a:Landroid/content/Context;

    invoke-direct {v6, v0, v1, v2}, Lo/bbp$c;-><init>(Landroid/widget/ImageView;Lo/bbp;Landroid/content/Context;)V

    .line 467
    new-instance v7, Lo/bbp$a;

    iget-object v0, p0, Lo/bbp$d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v7, v0, v4, v6}, Lo/bbp$a;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lo/bbp$c;)V

    .line 468
    iget-object v0, p0, Lo/bbp$d;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 469
    sget-object v0, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/bbi;

    iget-object v2, p0, Lo/bbp$d;->d:Lo/bbf;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6, v0, v1}, Lo/bbp$c;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 471
    :cond_3
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 377
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/bbp$d;->e(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .line 397
    iget-object v0, p0, Lo/bbp$d;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 399
    iget-object v0, p0, Lo/bbp$d;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bbp$d;->b:Lo/bbp;

    invoke-virtual {v1}, Lo/bbp;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 401
    :cond_0
    return-void
.end method
