.class Lo/fib$c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/picasso/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fib$c;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lo/fib$c;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/fib$c;Landroid/widget/ImageView;Landroid/graphics/Bitmap;Ljava/lang/String;)V
    .locals 0

    .line 415
    iput-object p1, p0, Lo/fib$c$3;->b:Lo/fib$c;

    iput-object p2, p0, Lo/fib$c$3;->c:Landroid/widget/ImageView;

    iput-object p3, p0, Lo/fib$c$3;->a:Landroid/graphics/Bitmap;

    iput-object p4, p0, Lo/fib$c$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 4

    .line 428
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Picasso load onError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    return-void
.end method

.method public onSuccess()V
    .locals 6

    .line 418
    iget-object v0, p0, Lo/fib$c$3;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 419
    iget-object v0, p0, Lo/fib$c$3;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/fib$c$3;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/fib$c$3;->b:Lo/fib$c;

    invoke-static {v2}, Lo/fib$c;->a(Lo/fib$c;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v4, v0, v1, v2}, Lo/fis;->e(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 420
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 421
    iget-object v0, p0, Lo/fib$c$3;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 423
    :cond_0
    const-string v0, "CustomRecommendtDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Picasso load onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    return-void
.end method
