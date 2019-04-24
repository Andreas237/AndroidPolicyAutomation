.class public Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;
.super Landroid/os/AsyncTask;
.source "UriImageHelpers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/UriImageHelpers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BitmapWorkerTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Landroid/net/Uri;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private final imageViewReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private photoUri:Landroid/net/Uri;

.field final synthetic this$0:Lcom/shopkick/app/util/UriImageHelpers;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/UriImageHelpers;Landroid/widget/ImageView;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->this$0:Lcom/shopkick/app/util/UriImageHelpers;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    .line 79
    iput-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->photoUri:Landroid/net/Uri;

    .line 83
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->imageViewReference:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;)Landroid/net/Uri;
    .locals 0

    .line 77
    iget-object p0, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->photoUri:Landroid/net/Uri;

    return-object p0
.end method


# virtual methods
.method protected varargs doInBackground([Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 2

    const/4 v0, 0x0

    .line 89
    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->photoUri:Landroid/net/Uri;

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->photoUri:Landroid/net/Uri;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 93
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->this$0:Lcom/shopkick/app/util/UriImageHelpers;

    invoke-static {p1}, Lcom/shopkick/app/util/UriImageHelpers;->access$100(Lcom/shopkick/app/util/UriImageHelpers;)Landroid/content/ContentResolver;

    move-result-object p1

    iget-object v1, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->photoUri:Landroid/net/Uri;

    invoke-static {p1, v1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-object v0

    :catch_1
    return-object v0

    :cond_0
    :goto_0
    return-object v0
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 77
    check-cast p1, [Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->doInBackground([Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->imageViewReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 107
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 77
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/UriImageHelpers$BitmapWorkerTask;->onPostExecute(Landroid/graphics/Bitmap;)V

    return-void
.end method
