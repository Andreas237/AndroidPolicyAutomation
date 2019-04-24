.class Lo/bbp$c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bbp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lo/bbi;Ljava/lang/Void;Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Lo/bbp;

.field private e:Lo/bbi;


# direct methods
.method constructor <init>(Landroid/widget/ImageView;Lo/bbp;Landroid/content/Context;)V
    .locals 1

    .line 505
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 496
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    .line 506
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bbp$c;->b:Ljava/lang/ref/WeakReference;

    .line 507
    iput-object p2, p0, Lo/bbp$c;->d:Lo/bbp;

    .line 508
    iput-object p3, p0, Lo/bbp$c;->c:Landroid/content/Context;

    .line 509
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/graphics/Bitmap;Z)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 565
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    iget-object v1, p0, Lo/bbp$c;->d:Lo/bbp;

    iget-object v2, p0, Lo/bbp$c;->c:Landroid/content/Context;

    invoke-static {v0, v1, v2, p3}, Lo/bbo;->a(Lo/bbi;Lo/bbp;Landroid/content/Context;Z)Z

    move-result v3

    .line 566
    if-nez v3, :cond_0

    .line 568
    const/4 v0, 0x0

    return-object v0

    .line 571
    :cond_0
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lo/bbp$c;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v4, v0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 573
    iget-object v0, p0, Lo/bbp$c;->d:Lo/bbp;

    invoke-virtual {v0}, Lo/bbp;->b()Lo/bbj;

    move-result-object v5

    .line 574
    if-eqz v5, :cond_1

    .line 576
    invoke-virtual {v5, p1, v4}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 578
    :cond_1
    return-object v4
.end method

.method private a()Landroid/widget/ImageView;
    .locals 3

    .line 603
    iget-object v0, p0, Lo/bbp$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 604
    invoke-static {v1}, Lo/bbs;->b(Landroid/widget/ImageView;)Lo/bbp$c;

    move-result-object v2

    .line 606
    if-ne p0, v2, :cond_0

    .line 608
    return-object v1

    .line 611
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lo/bbp$c;)Lo/bbi;
    .locals 1

    .line 494
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    return-object v0
.end method


# virtual methods
.method protected b(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 584
    invoke-virtual {p0}, Lo/bbp$c;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 586
    const/4 p1, 0x0

    .line 589
    :cond_0
    invoke-direct {p0}, Lo/bbp$c;->a()Landroid/widget/ImageView;

    move-result-object v2

    .line 590
    if-eqz p1, :cond_1

    if-eqz v2, :cond_1

    .line 592
    iget-object v0, p0, Lo/bbp$c;->d:Lo/bbp;

    invoke-static {v0, v2, p1}, Lo/bbp;->c(Lo/bbp;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 593
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    instance-of v0, v0, Lo/bbt;

    if-eqz v0, :cond_1

    .line 595
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    check-cast v0, Lo/bbt;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bbt;->e(Z)V

    .line 596
    const/16 v0, 0xb

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lo/apf;->d(II)V

    .line 599
    :cond_1
    return-void
.end method

.method protected c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 617
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    .line 618
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 494
    move-object v0, p1

    check-cast v0, [Lo/bbi;

    invoke-virtual {p0, v0}, Lo/bbp$c;->e([Lo/bbi;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected varargs e([Lo/bbi;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 517
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    .line 518
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    invoke-static {v0}, Lo/bbs;->c(Lo/bbi;)Ljava/lang/String;

    move-result-object v3

    .line 519
    move-object v4, v3

    .line 520
    const/4 v5, 0x0

    .line 521
    const/4 v6, 0x0

    .line 523
    invoke-virtual {p0}, Lo/bbp$c;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/bbp$c;->a()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 525
    iget-object v0, p0, Lo/bbp$c;->d:Lo/bbp;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v0, v1}, Lo/bbp;->e(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 528
    :cond_0
    const/4 v7, 0x0

    .line 530
    if-nez v5, :cond_1

    invoke-virtual {p0}, Lo/bbp$c;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lo/bbp$c;->a()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 532
    iget-object v0, p0, Lo/bbp$c;->d:Lo/bbp;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v0, v1}, Lo/bbp;->d(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 533
    const/4 v7, 0x1

    .line 536
    :cond_1
    if-eqz v5, :cond_3

    .line 539
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    instance-of v0, v0, Lo/bbd;

    if-eqz v0, :cond_2

    .line 541
    iget-object v0, p0, Lo/bbp$c;->e:Lo/bbi;

    move-object v8, v0

    check-cast v8, Lo/bbd;

    .line 542
    invoke-virtual {v8}, Lo/bbd;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 544
    iget v0, v8, Lo/bbd;->d:I

    iget v1, v8, Lo/bbd;->a:I

    const/4 v2, 0x2

    invoke-static {v5, v0, v1, v2}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 549
    :cond_2
    invoke-direct {p0, v4, v5, v7}, Lo/bbp$c;->a(Ljava/lang/String;Landroid/graphics/Bitmap;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 552
    :cond_3
    return-object v6
.end method

.method protected synthetic onCancelled(Ljava/lang/Object;)V
    .locals 1

    .line 494
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/bbp$c;->c(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 494
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/bbp$c;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
