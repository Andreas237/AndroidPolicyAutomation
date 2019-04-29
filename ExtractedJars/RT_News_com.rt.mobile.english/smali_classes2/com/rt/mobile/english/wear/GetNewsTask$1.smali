.class Lcom/rt/mobile/english/wear/GetNewsTask$1;
.super Ljava/lang/Object;
.source "GetNewsTask.java"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/wear/GetNewsTask;->execute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit/Callback<",
        "Lcom/rt/mobile/english/data/Message<",
        "Ljava/util/List<",
        "Lcom/rt/mobile/english/data/articles/Article;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/wear/GetNewsTask;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/wear/GetNewsTask;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/rt/mobile/english/wear/GetNewsTask$1;->this$0:Lcom/rt/mobile/english/wear/GetNewsTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lretrofit/RetrofitError;)V
    .locals 0

    .line 51
    iget-object p1, p0, Lcom/rt/mobile/english/wear/GetNewsTask$1;->this$0:Lcom/rt/mobile/english/wear/GetNewsTask;

    invoke-static {p1}, Lcom/rt/mobile/english/wear/GetNewsTask;->access$000(Lcom/rt/mobile/english/wear/GetNewsTask;)Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 52
    iget-object p1, p0, Lcom/rt/mobile/english/wear/GetNewsTask$1;->this$0:Lcom/rt/mobile/english/wear/GetNewsTask;

    invoke-static {p1}, Lcom/rt/mobile/english/wear/GetNewsTask;->access$000(Lcom/rt/mobile/english/wear/GetNewsTask;)Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;

    move-result-object p1

    invoke-interface {p1}, Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;->onNetworkError()V

    :cond_0
    return-void
.end method

.method public success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/rt/mobile/english/data/Message<",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;>;",
            "Lretrofit/client/Response;",
            ")V"
        }
    .end annotation

    .line 45
    iget-object p2, p0, Lcom/rt/mobile/english/wear/GetNewsTask$1;->this$0:Lcom/rt/mobile/english/wear/GetNewsTask;

    invoke-static {p2}, Lcom/rt/mobile/english/wear/GetNewsTask;->access$000(Lcom/rt/mobile/english/wear/GetNewsTask;)Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;

    move-result-object p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 46
    iget-object p2, p0, Lcom/rt/mobile/english/wear/GetNewsTask$1;->this$0:Lcom/rt/mobile/english/wear/GetNewsTask;

    invoke-static {p2}, Lcom/rt/mobile/english/wear/GetNewsTask;->access$000(Lcom/rt/mobile/english/wear/GetNewsTask;)Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;

    move-result-object p2

    invoke-virtual {p1}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p2, p1}, Lcom/rt/mobile/english/wear/GetNewsTask$GetNewsTaskCallBack;->onNewsReceived(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 0

    .line 42
    check-cast p1, Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/wear/GetNewsTask$1;->success(Lcom/rt/mobile/english/data/Message;Lretrofit/client/Response;)V

    return-void
.end method
