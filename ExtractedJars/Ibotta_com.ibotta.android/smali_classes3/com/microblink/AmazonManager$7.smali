.class Lcom/microblink/AmazonManager$7;
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
.field final synthetic this$0:Lcom/microblink/AmazonManager;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

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

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonManager$7;->onComplete(Ljava/lang/String;)V

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v0, p1}, Lcom/microblink/AmazonManager;->access$002(Lcom/microblink/AmazonManager;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/microblink/AmazonManager;->access$1102(Lcom/microblink/AmazonManager;Z)Z

    iget-object p1, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1200(Lcom/microblink/AmazonManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1, v0}, Lcom/microblink/AmazonManager;->access$1202(Lcom/microblink/AmazonManager;Z)Z

    iget-object p1, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1300(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/microblink/AmazonManager$7;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1300(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/microblink/AmazonManager;->access$1400(Lcom/microblink/AmazonManager;Lcom/microblink/AmazonCallback;)V

    :cond_0
    return-void
.end method
