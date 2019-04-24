.class Lcom/microblink/AmazonManager$11;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/AmazonCallback;


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonManager;

.field final synthetic val$callback:Lcom/microblink/AmazonCallback;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$11;->this$0:Lcom/microblink/AmazonManager;

    iput-object p2, p0, Lcom/microblink/AmazonManager$11;->val$callback:Lcom/microblink/AmazonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/util/List;)V
    .locals 1
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

    iget-object v0, p0, Lcom/microblink/AmazonManager$11;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v0}, Lcom/microblink/AmazonManager;->access$1800(Lcom/microblink/AmazonManager;)V

    iget-object v0, p0, Lcom/microblink/AmazonManager$11;->val$callback:Lcom/microblink/AmazonCallback;

    invoke-interface {v0, p1}, Lcom/microblink/AmazonCallback;->onComplete(Ljava/util/List;)V

    return-void
.end method

.method public onException(Lcom/microblink/AmazonException;)V
    .locals 1
    .param p1    # Lcom/microblink/AmazonException;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/AmazonManager$11;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v0}, Lcom/microblink/AmazonManager;->access$1800(Lcom/microblink/AmazonManager;)V

    iget-object v0, p0, Lcom/microblink/AmazonManager$11;->val$callback:Lcom/microblink/AmazonCallback;

    invoke-interface {v0, p1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    return-void
.end method
