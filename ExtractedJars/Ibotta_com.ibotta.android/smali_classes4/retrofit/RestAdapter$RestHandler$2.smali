.class Lretrofit/RestAdapter$RestHandler$2;
.super Lretrofit/CallbackRunnable;
.source "RestAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/RestAdapter$RestHandler;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lretrofit/RestAdapter$RestHandler;

.field final synthetic val$args:[Ljava/lang/Object;

.field final synthetic val$interceptorTape:Lretrofit/RequestInterceptorTape;

.field final synthetic val$methodInfo:Lretrofit/RestMethodInfo;


# direct methods
.method constructor <init>(Lretrofit/RestAdapter$RestHandler;Lretrofit/Callback;Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;Lretrofit/RequestInterceptorTape;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lretrofit/RestAdapter$RestHandler$2;->this$1:Lretrofit/RestAdapter$RestHandler;

    iput-object p5, p0, Lretrofit/RestAdapter$RestHandler$2;->val$interceptorTape:Lretrofit/RequestInterceptorTape;

    iput-object p6, p0, Lretrofit/RestAdapter$RestHandler$2;->val$methodInfo:Lretrofit/RestMethodInfo;

    iput-object p7, p0, Lretrofit/RestAdapter$RestHandler$2;->val$args:[Ljava/lang/Object;

    invoke-direct {p0, p2, p3, p4}, Lretrofit/CallbackRunnable;-><init>(Lretrofit/Callback;Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;)V

    return-void
.end method


# virtual methods
.method public obtainResponse()Lretrofit/ResponseWrapper;
    .locals 4

    .line 278
    iget-object v0, p0, Lretrofit/RestAdapter$RestHandler$2;->this$1:Lretrofit/RestAdapter$RestHandler;

    iget-object v1, p0, Lretrofit/RestAdapter$RestHandler$2;->val$interceptorTape:Lretrofit/RequestInterceptorTape;

    iget-object v2, p0, Lretrofit/RestAdapter$RestHandler$2;->val$methodInfo:Lretrofit/RestMethodInfo;

    iget-object v3, p0, Lretrofit/RestAdapter$RestHandler$2;->val$args:[Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lretrofit/RestAdapter$RestHandler;->access$100(Lretrofit/RestAdapter$RestHandler;Lretrofit/RequestInterceptor;Lretrofit/RestMethodInfo;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lretrofit/ResponseWrapper;

    return-object v0
.end method
