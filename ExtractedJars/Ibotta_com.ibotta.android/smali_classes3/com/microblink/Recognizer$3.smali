.class Lcom/microblink/Recognizer$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/BitmapResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/Recognizer;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/microblink/Recognizer;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/Recognizer$3;->this$0:Lcom/microblink/Recognizer;

    iput-object p2, p0, Lcom/microblink/Recognizer$3;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/BitmapResult;)V
    .locals 6
    .param p1    # Lcom/microblink/BitmapResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/microblink/BitmapResult;->bitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/microblink/internal/BitmapUtils;->copy(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/Recognizer$3;->this$0:Lcom/microblink/Recognizer;

    invoke-static {v1}, Lcom/microblink/Recognizer;->access$100(Lcom/microblink/Recognizer;)Lcom/microblink/ScanOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v1

    iget-object v2, p0, Lcom/microblink/Recognizer$3;->val$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/microblink/Recognizer$3;->this$0:Lcom/microblink/Recognizer;

    invoke-static {v3}, Lcom/microblink/Recognizer;->access$200(Lcom/microblink/Recognizer;)Lcom/microblink/Receipt;

    move-result-object v3

    invoke-virtual {v3}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-static {v3, v4, v5, v1}, Lcom/microblink/internal/DiskUtils;->directFilename(Ljava/lang/String;IILcom/microblink/FrameCharacteristics;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, p1, v1}, Lcom/microblink/internal/DiskUtils;->writeToDiskAsync(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/microblink/FrameCharacteristics;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "Recognizer"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/BitmapResult;

    invoke-virtual {p0, p1}, Lcom/microblink/Recognizer$3;->onComplete(Lcom/microblink/BitmapResult;)V

    return-void
.end method
