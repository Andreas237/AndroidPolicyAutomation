.class Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;
.super Lcom/microblink/internal/PriorityRunnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

.field final synthetic val$bitmaps:Ljava/util/List;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;Lcom/microblink/internal/Priority;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;->this$0:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

    iput-object p3, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;->val$url:Ljava/lang/String;

    iput-object p4, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;->val$bitmaps:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/microblink/internal/PriorityRunnable;-><init>(Lcom/microblink/internal/Priority;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    invoke-super {p0}, Lcom/microblink/internal/PriorityRunnable;->run()V

    new-instance v0, Lcom/microblink/internal/services/io/BitmapServiceCallable;

    iget-object v1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;->val$url:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/io/BitmapServiceCallable;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0}, Lcom/microblink/internal/services/io/BitmapServiceCallable;->call()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask$1;->val$bitmaps:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "BitmapServiceImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
