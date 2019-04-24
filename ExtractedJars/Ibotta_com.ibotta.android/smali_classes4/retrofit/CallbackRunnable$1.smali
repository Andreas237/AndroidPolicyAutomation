.class Lretrofit/CallbackRunnable$1;
.super Ljava/lang/Object;
.source "CallbackRunnable.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/CallbackRunnable;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lretrofit/CallbackRunnable;

.field final synthetic val$wrapper:Lretrofit/ResponseWrapper;


# direct methods
.method constructor <init>(Lretrofit/CallbackRunnable;Lretrofit/ResponseWrapper;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lretrofit/CallbackRunnable$1;->this$0:Lretrofit/CallbackRunnable;

    iput-object p2, p0, Lretrofit/CallbackRunnable$1;->val$wrapper:Lretrofit/ResponseWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 45
    iget-object v0, p0, Lretrofit/CallbackRunnable$1;->this$0:Lretrofit/CallbackRunnable;

    invoke-static {v0}, Lretrofit/CallbackRunnable;->access$000(Lretrofit/CallbackRunnable;)Lretrofit/Callback;

    move-result-object v0

    iget-object v1, p0, Lretrofit/CallbackRunnable$1;->val$wrapper:Lretrofit/ResponseWrapper;

    iget-object v1, v1, Lretrofit/ResponseWrapper;->responseBody:Ljava/lang/Object;

    iget-object v2, p0, Lretrofit/CallbackRunnable$1;->val$wrapper:Lretrofit/ResponseWrapper;

    iget-object v2, v2, Lretrofit/ResponseWrapper;->response:Lretrofit/client/Response;

    invoke-interface {v0, v1, v2}, Lretrofit/Callback;->success(Ljava/lang/Object;Lretrofit/client/Response;)V

    return-void
.end method
