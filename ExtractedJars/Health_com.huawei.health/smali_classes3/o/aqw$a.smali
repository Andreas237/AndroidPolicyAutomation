.class Lo/aqw$a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aqw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lo/ard;Ljava/lang/Void;Landroid/graphics/drawable/Drawable;>;"
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

.field final synthetic c:Lo/aqw;

.field private e:Lo/ard;


# direct methods
.method public constructor <init>(Lo/aqw;Landroid/widget/ImageView;)V
    .locals 1

    .line 268
    iput-object p1, p0, Lo/aqw$a;->c:Lo/aqw;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 269
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aqw$a;->b:Ljava/lang/ref/WeakReference;

    .line 270
    return-void
.end method

.method static synthetic b(Lo/aqw$a;)Lo/ard;
    .locals 1

    .line 250
    iget-object v0, p0, Lo/aqw$a;->e:Lo/ard;

    return-object v0
.end method

.method private d()Landroid/widget/ImageView;
    .locals 3

    .line 307
    iget-object v0, p0, Lo/aqw$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 308
    iget-object v0, p0, Lo/aqw$a;->c:Lo/aqw;

    invoke-static {v0, v1}, Lo/aqw;->e(Lo/aqw;Landroid/widget/ImageView;)Lo/aqw$a;

    move-result-object v2

    .line 309
    if-ne p0, v2, :cond_0

    .line 311
    return-object v1

    .line 313
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method protected varargs c([Lo/ard;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 278
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/aqw$a;->e:Lo/ard;

    .line 280
    iget-object v0, p0, Lo/aqw$a;->e:Lo/ard;

    invoke-virtual {v0}, Lo/ard;->l()Ljava/lang/String;

    move-result-object v2

    .line 282
    const/4 v3, 0x0

    .line 283
    const/4 v4, 0x0

    .line 286
    invoke-virtual {p0}, Lo/aqw$a;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/aqw$a;->d()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 288
    iget-object v0, p0, Lo/aqw$a;->c:Lo/aqw;

    iget-object v1, p0, Lo/aqw$a;->e:Lo/ard;

    invoke-virtual {v0, v1}, Lo/aqw;->e(Lo/ard;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 292
    :cond_0
    if-eqz v3, :cond_1

    iget-object v0, p0, Lo/aqw$a;->e:Lo/ard;

    invoke-virtual {v0}, Lo/ard;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lo/aqw$a;->c:Lo/aqw;

    invoke-static {v0}, Lo/aqw;->b(Lo/aqw;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 296
    iget-object v0, p0, Lo/aqw$a;->c:Lo/aqw;

    invoke-static {v0}, Lo/aqw;->c(Lo/aqw;)Lo/bbj;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 298
    iget-object v0, p0, Lo/aqw$a;->c:Lo/aqw;

    invoke-static {v0}, Lo/aqw;->c(Lo/aqw;)Lo/bbj;

    move-result-object v0

    invoke-virtual {v0, v2, v4}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 302
    :cond_1
    return-object v4
.end method

.method protected c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 334
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    .line 335
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 250
    move-object v0, p1

    check-cast v0, [Lo/ard;

    invoke-virtual {p0, v0}, Lo/aqw$a;->c([Lo/ard;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected e(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 319
    invoke-virtual {p0}, Lo/aqw$a;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    const/4 p1, 0x0

    .line 324
    :cond_0
    invoke-direct {p0}, Lo/aqw$a;->d()Landroid/widget/ImageView;

    move-result-object v1

    .line 325
    if-eqz v1, :cond_1

    .line 327
    iget-object v0, p0, Lo/aqw$a;->c:Lo/aqw;

    invoke-static {v0, v1, p1}, Lo/aqw;->a(Lo/aqw;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 329
    :cond_1
    return-void
.end method

.method protected synthetic onCancelled(Ljava/lang/Object;)V
    .locals 1

    .line 250
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/aqw$a;->c(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 250
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/aqw$a;->e(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
