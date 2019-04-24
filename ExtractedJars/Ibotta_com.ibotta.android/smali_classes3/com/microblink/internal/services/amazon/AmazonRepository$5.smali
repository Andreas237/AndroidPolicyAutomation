.class Lcom/microblink/internal/services/amazon/AmazonRepository$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Lcom/microblink/internal/services/amazon/AmazonJavaScript;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

.field final synthetic val$listener:Lcom/microblink/OnCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/microblink/internal/services/amazon/AmazonJavaScript;)V
    .locals 3
    .param p1    # Lcom/microblink/internal/services/amazon/AmazonJavaScript;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->noUpdatedNeeded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-virtual {p1, v0}, Lcom/microblink/internal/services/amazon/AmazonRepository;->javaScriptFromDisk(Lcom/microblink/OnCompleteListener;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-static {v0}, Lcom/microblink/internal/services/amazon/AmazonRepository;->access$000(Lcom/microblink/internal/services/amazon/AmazonRepository;)Lcom/microblink/internal/services/amazon/AmazonPreferences;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->modTime()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/microblink/internal/services/amazon/AmazonPreferences;->applyModTime(I)V

    invoke-virtual {p1}, Lcom/microblink/internal/services/amazon/AmazonJavaScript;->js()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/microblink/internal/services/io/AssetManagerRepository;

    iget-object v1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v1}, Lcom/microblink/internal/services/amazon/AmazonRepository;->context()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/io/AssetManagerRepository;-><init>(Landroid/content/Context;)V

    const-string v1, "amazon-scrape.js"

    new-instance v2, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;

    invoke-direct {v2, p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository$5;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/microblink/internal/services/io/AssetManagerRepository;->enqueueWriteFileToOutput(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void

    :cond_1
    new-instance p1, Lcom/microblink/internal/services/io/AssetManagerRepository;

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonRepository;->context()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/microblink/internal/services/io/AssetManagerRepository;-><init>(Landroid/content/Context;)V

    const-string v0, "microblink/amazon-scrape.js"

    new-instance v1, Lcom/microblink/internal/services/amazon/AmazonRepository$5$2;

    invoke-direct {v1, p0}, Lcom/microblink/internal/services/amazon/AmazonRepository$5$2;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository$5;)V

    invoke-virtual {p1, v0, v1}, Lcom/microblink/internal/services/io/AssetManagerRepository;->enqueueReadFileFromAssets(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AmazonRepository"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->val$listener:Lcom/microblink/OnCompleteListener;

    const-string v0, ""

    invoke-interface {p1, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/amazon/AmazonJavaScript;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->onComplete(Lcom/microblink/internal/services/amazon/AmazonJavaScript;)V

    return-void
.end method
