.class Lretrofit/CallbackRunnable$2;
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

.field final synthetic val$handled:Lretrofit/RetrofitError;


# direct methods
.method constructor <init>(Lretrofit/CallbackRunnable;Lretrofit/RetrofitError;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lretrofit/CallbackRunnable$2;->this$0:Lretrofit/CallbackRunnable;

    iput-object p2, p0, Lretrofit/CallbackRunnable$2;->val$handled:Lretrofit/RetrofitError;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 53
    iget-object v0, p0, Lretrofit/CallbackRunnable$2;->this$0:Lretrofit/CallbackRunnable;

    invoke-static {v0}, Lretrofit/CallbackRunnable;->access$000(Lretrofit/CallbackRunnable;)Lretrofit/Callback;

    move-result-object v0

    iget-object v1, p0, Lretrofit/CallbackRunnable$2;->val$handled:Lretrofit/RetrofitError;

    invoke-interface {v0, v1}, Lretrofit/Callback;->failure(Lretrofit/RetrofitError;)V

    return-void
.end method
