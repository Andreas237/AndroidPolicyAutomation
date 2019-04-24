.class Lcom/microblink/AmazonManager$6$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/microblink/AmazonManager$6;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager$6;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$6$1;->this$1:Lcom/microblink/AmazonManager$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonManager$6$1;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "null"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "AmazonManager"

    const-string v0, "function returned a null response"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/microblink/AmazonManager$6$1;->this$1:Lcom/microblink/AmazonManager$6;

    iget-object p1, p1, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$800(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/microblink/AmazonManager$6$1;->this$1:Lcom/microblink/AmazonManager$6;

    iget-object p1, p1, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$900(Lcom/microblink/AmazonManager;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/microblink/AmazonManager$6$1;->this$1:Lcom/microblink/AmazonManager$6;

    iget-object p1, p1, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1000(Lcom/microblink/AmazonManager;)V

    :cond_2
    return-void
.end method
