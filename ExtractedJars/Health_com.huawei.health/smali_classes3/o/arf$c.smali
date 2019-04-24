.class Lo/arf$c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/arf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Landroid/net/Uri;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 42
    iput-object p1, p0, Lo/arf$c;->a:Landroid/widget/ImageView;

    .line 43
    iput-object p2, p0, Lo/arf$c;->b:Landroid/net/Uri;

    .line 44
    return-void
.end method


# virtual methods
.method protected varargs d([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 3

    .line 49
    iget-object v0, p0, Lo/arf$c;->b:Landroid/net/Uri;

    const/16 v1, 0x1f4

    invoke-static {v0, v1}, Lo/aqr;->e(Landroid/net/Uri;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 50
    return-object v2
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 34
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/arf$c;->d([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected e(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 56
    iget-object v0, p0, Lo/arf$c;->a:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 58
    if-eqz p1, :cond_0

    .line 60
    iget-object v0, p0, Lo/arf$c;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, Lo/arf$c;->a:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_default_pic:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 67
    :cond_1
    :goto_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 34
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lo/arf$c;->e(Landroid/graphics/Bitmap;)V

    return-void
.end method
