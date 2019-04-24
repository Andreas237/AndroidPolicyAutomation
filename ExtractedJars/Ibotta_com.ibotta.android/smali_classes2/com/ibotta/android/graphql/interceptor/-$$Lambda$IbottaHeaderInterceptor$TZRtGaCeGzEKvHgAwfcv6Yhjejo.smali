.class public final synthetic Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Lokhttp3/Request$Builder;

.field private final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/Request$Builder;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;->f$0:Lokhttp3/Request$Builder;

    iput-object p2, p0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;->f$0:Lokhttp3/Request$Builder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/interceptor/-$$Lambda$IbottaHeaderInterceptor$TZRtGaCeGzEKvHgAwfcv6Yhjejo;->f$1:Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/graphql/interceptor/IbottaHeaderInterceptor;->lambda$addHeaderIfNonNull$0(Lokhttp3/Request$Builder;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
