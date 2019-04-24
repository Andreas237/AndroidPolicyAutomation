.class Lcom/microblink/AmazonManager$3;
.super Landroid/os/CountDownTimer;


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonManager;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$3;->this$0:Lcom/microblink/AmazonManager;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/AmazonManager$3;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v0}, Lcom/microblink/AmazonManager;->access$200(Lcom/microblink/AmazonManager;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "AmazonManager"

    const-string v1, "Timeout hit, login has not yet succeeded, so will return to client"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/microblink/AmazonManager$3;->this$0:Lcom/microblink/AmazonManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/microblink/AmazonManager;->access$302(Lcom/microblink/AmazonManager;Z)Z

    iget-object v0, p0, Lcom/microblink/AmazonManager$3;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v0}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/AmazonManager$3;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v0}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object v0

    sget-object v1, Lcom/microblink/AmazonException;->LOGIN_TIMEOUT:Lcom/microblink/AmazonException;

    invoke-interface {v0, v1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 0

    return-void
.end method
