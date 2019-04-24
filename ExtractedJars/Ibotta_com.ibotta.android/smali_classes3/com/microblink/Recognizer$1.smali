.class Lcom/microblink/Recognizer$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnNullableCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnNullableCompleteListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/Recognizer;

.field final synthetic val$callback:Lcom/microblink/RecognizerCallback;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/microblink/Recognizer;Lcom/microblink/RecognizerCallback;Landroid/net/Uri;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Recognizer$1;->this$0:Lcom/microblink/Recognizer;

    iput-object p2, p0, Lcom/microblink/Recognizer$1;->val$callback:Lcom/microblink/RecognizerCallback;

    iput-object p3, p0, Lcom/microblink/Recognizer$1;->val$uri:Landroid/net/Uri;

    iput-object p4, p0, Lcom/microblink/Recognizer$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/graphics/Bitmap;)V
    .locals 6
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/microblink/Recognizer$1;->val$callback:Lcom/microblink/RecognizerCallback;

    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to download bitmap: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/microblink/Recognizer$1;->val$uri:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/microblink/Recognizer$1;->this$0:Lcom/microblink/Recognizer;

    iget-object v2, p0, Lcom/microblink/Recognizer$1;->val$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/microblink/Recognizer$1;->val$callback:Lcom/microblink/RecognizerCallback;

    sget-object v4, Lcom/microblink/CameraOrientation;->ORIENTATION_PORTRAIT:Lcom/microblink/CameraOrientation;

    const/4 v5, 0x1

    new-array v5, v5, [Landroid/graphics/Bitmap;

    aput-object p1, v5, v0

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/microblink/Recognizer;->recognize(Landroid/content/Context;Lcom/microblink/RecognizerCallback;Lcom/microblink/CameraOrientation;[Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/Recognizer$1;->val$callback:Lcom/microblink/RecognizerCallback;

    invoke-interface {v0, p1}, Lcom/microblink/RecognizerCallback;->onRecognizerException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/microblink/Recognizer$1;->onComplete(Landroid/graphics/Bitmap;)V

    return-void
.end method
