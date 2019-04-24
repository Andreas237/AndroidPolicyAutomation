.class Lcom/microblink/internal/services/amazon/AmazonRepository$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

.field final synthetic val$listener:Lcom/microblink/OnCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/amazon/AmazonRepository;Lcom/microblink/OnCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$2;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$2;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$2;->onComplete(Ljava/lang/String;)V

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/microblink/internal/services/io/AssetManagerRepository;

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$2;->this$0:Lcom/microblink/internal/services/amazon/AmazonRepository;

    invoke-virtual {v0}, Lcom/microblink/internal/services/amazon/AmazonRepository;->context()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/microblink/internal/services/io/AssetManagerRepository;-><init>(Landroid/content/Context;)V

    const-string v0, "microblink/amazon-scrape.js"

    new-instance v1, Lcom/microblink/internal/services/amazon/AmazonRepository$2$1;

    invoke-direct {v1, p0}, Lcom/microblink/internal/services/amazon/AmazonRepository$2$1;-><init>(Lcom/microblink/internal/services/amazon/AmazonRepository$2;)V

    invoke-virtual {p1, v0, v1}, Lcom/microblink/internal/services/io/AssetManagerRepository;->enqueueReadFileFromAssets(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$2;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
