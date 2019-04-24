.class Lcom/microblink/internal/services/amazon/AmazonRepository$2$1;
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
.field final synthetic this$1:Lcom/microblink/internal/services/amazon/AmazonRepository$2;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/amazon/AmazonRepository$2;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$2$1;->this$1:Lcom/microblink/internal/services/amazon/AmazonRepository$2;

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

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/amazon/AmazonRepository$2$1;->onComplete(Ljava/lang/String;)V

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/amazon/AmazonRepository$2$1;->this$1:Lcom/microblink/internal/services/amazon/AmazonRepository$2;

    iget-object v0, v0, Lcom/microblink/internal/services/amazon/AmazonRepository$2;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
