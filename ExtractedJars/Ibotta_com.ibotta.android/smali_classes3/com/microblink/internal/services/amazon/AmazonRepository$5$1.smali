.class Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnCompleteListener<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/microblink/internal/services/amazon/AmazonRepository$5;

.field final synthetic val$data:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/amazon/AmazonRepository$5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;->this$1:Lcom/microblink/internal/services/amazon/AmazonRepository$5;

    iput-object p2, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;->val$data:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Ljava/lang/Boolean;)V
    .locals 1
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;->this$1:Lcom/microblink/internal/services/amazon/AmazonRepository$5;

    iget-object p1, p1, Lcom/microblink/internal/services/amazon/AmazonRepository$5;->val$listener:Lcom/microblink/OnCompleteListener;

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;->val$data:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$5$1;->onComplete(Ljava/lang/Boolean;)V

    return-void
.end method
