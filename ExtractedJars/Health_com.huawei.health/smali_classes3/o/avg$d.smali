.class Lo/avg$d;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/avg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lo/auy;Ljava/lang/Void;Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/avg;

.field private final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private c:Lo/auy;


# direct methods
.method public constructor <init>(Lo/avg;Landroid/widget/ImageView;)V
    .locals 1

    .line 246
    iput-object p1, p0, Lo/avg$d;->a:Lo/avg;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 233
    const/4 v0, 0x0

    iput-object v0, p0, Lo/avg$d;->c:Lo/auy;

    .line 247
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/avg$d;->b:Ljava/lang/ref/WeakReference;

    .line 248
    return-void
.end method

.method static synthetic a(Lo/avg$d;)Lo/auy;
    .locals 1

    .line 228
    iget-object v0, p0, Lo/avg$d;->c:Lo/auy;

    return-object v0
.end method

.method private d()Landroid/widget/ImageView;
    .locals 3

    .line 326
    iget-object v0, p0, Lo/avg$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 327
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    invoke-static {v0, v1}, Lo/avg;->d(Lo/avg;Landroid/widget/ImageView;)Lo/avg$d;

    move-result-object v2

    .line 328
    if-ne p0, v2, :cond_0

    .line 330
    return-object v1

    .line 332
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method protected varargs a([Lo/auy;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 256
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/avg$d;->c:Lo/auy;

    .line 258
    iget-object v0, p0, Lo/avg$d;->c:Lo/auy;

    invoke-virtual {v0}, Lo/auy;->d()Ljava/lang/String;

    move-result-object v2

    .line 260
    const/4 v3, 0x0

    .line 261
    const/4 v4, 0x0

    .line 264
    invoke-virtual {p0}, Lo/avg$d;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/avg$d;->d()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    iget-object v1, p0, Lo/avg$d;->c:Lo/auy;

    invoke-virtual {v0, v1}, Lo/avg;->d(Lo/auy;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 270
    :cond_0
    if-nez v3, :cond_1

    .line 272
    return-object v4

    .line 274
    :cond_1
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    iget-object v0, v0, Lo/avg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 275
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    invoke-static {v0}, Lo/avg;->e(Lo/avg;)Lo/bbj;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 277
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    invoke-static {v0}, Lo/avg;->e(Lo/avg;)Lo/bbj;

    move-result-object v0

    invoke-virtual {v0, v2, v4}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 279
    :cond_2
    return-object v4
.end method

.method protected d(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 290
    invoke-virtual {p0}, Lo/avg$d;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    const/4 p1, 0x0

    .line 295
    :cond_0
    invoke-direct {p0}, Lo/avg$d;->d()Landroid/widget/ImageView;

    move-result-object v3

    .line 296
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 298
    return-void

    .line 301
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 304
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    iget-object v1, p0, Lo/avg$d;->a:Lo/avg;

    iget-object v1, v1, Lo/avg;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Lo/avg;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lo/avg;->a(Lo/avg;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 305
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    iget-object v0, v0, Lo/avg;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->album_list_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 307
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    .line 311
    :cond_2
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    invoke-static {v0, v3, p1}, Lo/avg;->a(Lo/avg;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 312
    iget-object v0, p0, Lo/avg$d;->c:Lo/auy;

    invoke-virtual {v0}, Lo/auy;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 314
    iget-object v0, p0, Lo/avg$d;->a:Lo/avg;

    invoke-static {v0, v3, p1}, Lo/avg;->e(Lo/avg;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 317
    :cond_3
    :goto_0
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 228
    move-object v0, p1

    check-cast v0, [Lo/auy;

    invoke-virtual {p0, v0}, Lo/avg$d;->a([Lo/auy;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected e(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 338
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onCancelled(Ljava/lang/Object;)V

    .line 339
    return-void
.end method

.method protected synthetic onCancelled(Ljava/lang/Object;)V
    .locals 1

    .line 228
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/avg$d;->e(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 228
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/avg$d;->d(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
