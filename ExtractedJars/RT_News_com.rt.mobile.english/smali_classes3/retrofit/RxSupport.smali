.class final Lretrofit/RxSupport;
.super Ljava/lang/Object;
.source "RxSupport.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RxSupport$Invoker;
    }
.end annotation


# instance fields
.field private final errorHandler:Lretrofit/ErrorHandler;

.field private final executor:Ljava/util/concurrent/Executor;

.field private final requestInterceptor:Lretrofit/RequestInterceptor;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Lretrofit/ErrorHandler;Lretrofit/RequestInterceptor;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lretrofit/RxSupport;->executor:Ljava/util/concurrent/Executor;

    .line 27
    iput-object p2, p0, Lretrofit/RxSupport;->errorHandler:Lretrofit/ErrorHandler;

    .line 28
    iput-object p3, p0, Lretrofit/RxSupport;->requestInterceptor:Lretrofit/RequestInterceptor;

    return-void
.end method

.method static synthetic access$000(Lretrofit/RxSupport;)Lretrofit/RequestInterceptor;
    .locals 0

    .line 14
    iget-object p0, p0, Lretrofit/RxSupport;->requestInterceptor:Lretrofit/RequestInterceptor;

    return-object p0
.end method

.method static synthetic access$100(Lretrofit/RxSupport;Lrx/Subscriber;Lretrofit/RxSupport$Invoker;Lretrofit/RequestInterceptorTape;)Ljava/lang/Runnable;
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lretrofit/RxSupport;->getRunnable(Lrx/Subscriber;Lretrofit/RxSupport$Invoker;Lretrofit/RequestInterceptorTape;)Ljava/lang/Runnable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lretrofit/RxSupport;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 14
    iget-object p0, p0, Lretrofit/RxSupport;->executor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic access$300(Lretrofit/RxSupport;)Lretrofit/ErrorHandler;
    .locals 0

    .line 14
    iget-object p0, p0, Lretrofit/RxSupport;->errorHandler:Lretrofit/ErrorHandler;

    return-object p0
.end method

.method private getRunnable(Lrx/Subscriber;Lretrofit/RxSupport$Invoker;Lretrofit/RequestInterceptorTape;)Ljava/lang/Runnable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx/Subscriber<",
            "-",
            "Ljava/lang/Object;",
            ">;",
            "Lretrofit/RxSupport$Invoker;",
            "Lretrofit/RequestInterceptorTape;",
            ")",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    .line 49
    new-instance v0, Lretrofit/RxSupport$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lretrofit/RxSupport$2;-><init>(Lretrofit/RxSupport;Lrx/Subscriber;Lretrofit/RxSupport$Invoker;Lretrofit/RequestInterceptorTape;)V

    return-object v0
.end method


# virtual methods
.method createRequestObservable(Lretrofit/RxSupport$Invoker;)Lrx/Observable;
    .locals 1

    .line 32
    new-instance v0, Lretrofit/RxSupport$1;

    invoke-direct {v0, p0, p1}, Lretrofit/RxSupport$1;-><init>(Lretrofit/RxSupport;Lretrofit/RxSupport$Invoker;)V

    invoke-static {v0}, Lrx/Observable;->create(Lrx/Observable$OnSubscribe;)Lrx/Observable;

    move-result-object p1

    return-object p1
.end method
