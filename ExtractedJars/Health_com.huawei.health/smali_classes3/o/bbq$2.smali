.class final Lo/bbq$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbq;->a(Landroid/widget/ImageView;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/ImageView;

.field final synthetic c:I


# direct methods
.method constructor <init>(ILandroid/widget/ImageView;)V
    .locals 0

    .line 50
    iput p1, p0, Lo/bbq$2;->c:I

    iput-object p2, p0, Lo/bbq$2;->a:Landroid/widget/ImageView;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs b([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 2

    .line 54
    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v0

    iget v1, p0, Lo/bbq$2;->c:I

    invoke-virtual {v0, v1}, Lo/bbe;->e(I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 50
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bbq$2;->b([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected e(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 59
    if-nez p1, :cond_0

    .line 61
    return-void

    .line 63
    :cond_0
    iget-object v0, p0, Lo/bbq$2;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 64
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 50
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lo/bbq$2;->e(Landroid/graphics/Bitmap;)V

    return-void
.end method
