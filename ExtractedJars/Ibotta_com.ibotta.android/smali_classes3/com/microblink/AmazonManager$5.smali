.class Lcom/microblink/AmazonManager$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/AmazonCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonManager;

.field final synthetic val$callback:Lcom/microblink/AmazonCallback;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$5;->this$0:Lcom/microblink/AmazonManager;

    iput-object p2, p0, Lcom/microblink/AmazonManager$5;->val$callback:Lcom/microblink/AmazonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/ScanResults;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/AmazonManager$5;->this$0:Lcom/microblink/AmazonManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/microblink/AmazonManager;->access$502(Lcom/microblink/AmazonManager;Z)Z

    iget-object v0, p0, Lcom/microblink/AmazonManager$5;->val$callback:Lcom/microblink/AmazonCallback;

    invoke-interface {v0, p1}, Lcom/microblink/AmazonCallback;->onComplete(Ljava/util/List;)V

    return-void
.end method

.method public onException(Lcom/microblink/AmazonException;)V
    .locals 2
    .param p1    # Lcom/microblink/AmazonException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/AmazonManager$5;->this$0:Lcom/microblink/AmazonManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/microblink/AmazonManager;->access$502(Lcom/microblink/AmazonManager;Z)Z

    iget-object v0, p0, Lcom/microblink/AmazonManager$5;->val$callback:Lcom/microblink/AmazonCallback;

    invoke-interface {v0, p1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    return-void
.end method
