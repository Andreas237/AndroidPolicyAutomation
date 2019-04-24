.class Lo/evi$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/evi;->b(Lo/evl;Lokhttp3/OkHttpClient$Builder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/evl;

.field final synthetic e:Lo/evi;


# direct methods
.method constructor <init>(Lo/evi;Lo/evl;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lo/evi$1;->e:Lo/evi;

    iput-object p2, p0, Lo/evi$1;->a:Lo/evl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 332
    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object v2

    .line 333
    new-instance v3, Lo/evm;

    invoke-virtual {v2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    new-instance v1, Lo/evi$1$2;

    invoke-direct {v1, p0}, Lo/evi$1$2;-><init>(Lo/evi$1;)V

    invoke-direct {v3, v0, v1}, Lo/evm;-><init>(Lokhttp3/ResponseBody;Lo/evk;)V

    .line 339
    invoke-virtual {v2}, Lokhttp3/Response;->newBuilder()Lokhttp3/Response$Builder;

    move-result-object v0

    .line 340
    invoke-virtual {v0, v3}, Lokhttp3/Response$Builder;->body(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 341
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->build()Lokhttp3/Response;

    move-result-object v0

    .line 339
    return-object v0
.end method
