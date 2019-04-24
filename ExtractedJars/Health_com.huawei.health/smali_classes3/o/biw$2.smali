.class Lo/biw$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/biw;->b(Ljava/lang/String;IILandroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/widget/ImageView;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lo/biw;


# direct methods
.method constructor <init>(Lo/biw;Ljava/lang/String;IILandroid/widget/ImageView;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/biw$2;->e:Lo/biw;

    iput-object p2, p0, Lo/biw$2;->a:Ljava/lang/String;

    iput p3, p0, Lo/biw$2;->c:I

    iput p4, p0, Lo/biw$2;->d:I

    iput-object p5, p0, Lo/biw$2;->b:Landroid/widget/ImageView;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 5

    .line 60
    iget-object v0, p0, Lo/biw$2;->e:Lo/biw;

    iget-object v1, p0, Lo/biw$2;->a:Ljava/lang/String;

    iget v2, p0, Lo/biw$2;->c:I

    iget v3, p0, Lo/biw$2;->d:I

    invoke-static {v0, v1, v2, v3}, Lo/biw;->c(Lo/biw;Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 61
    return-object v4
.end method

.method protected b(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/biw$2;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 68
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 56
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/biw$2;->a([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 56
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lo/biw$2;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method
