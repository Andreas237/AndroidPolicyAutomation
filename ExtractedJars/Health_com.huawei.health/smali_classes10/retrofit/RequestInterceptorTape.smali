.class final Lretrofit/RequestInterceptorTape;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/RequestInterceptor$RequestFacade;
.implements Lretrofit/RequestInterceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/RequestInterceptorTape$CommandWithParams;,
        Lretrofit/RequestInterceptorTape$Command;
    }
.end annotation


# instance fields
.field private final tape:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lretrofit/RequestInterceptorTape$CommandWithParams;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    .line 75
    return-void
.end method


# virtual methods
.method public addEncodedPathParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 23
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    new-instance v1, Lretrofit/RequestInterceptorTape$CommandWithParams;

    sget-object v2, Lretrofit/RequestInterceptorTape$Command;->ADD_ENCODED_PATH_PARAM:Lretrofit/RequestInterceptorTape$Command;

    invoke-direct {v1, v2, p1, p2}, Lretrofit/RequestInterceptorTape$CommandWithParams;-><init>(Lretrofit/RequestInterceptorTape$Command;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    return-void
.end method

.method public addEncodedQueryParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 31
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    new-instance v1, Lretrofit/RequestInterceptorTape$CommandWithParams;

    sget-object v2, Lretrofit/RequestInterceptorTape$Command;->ADD_ENCODED_QUERY_PARAM:Lretrofit/RequestInterceptorTape$Command;

    invoke-direct {v1, v2, p1, p2}, Lretrofit/RequestInterceptorTape$CommandWithParams;-><init>(Lretrofit/RequestInterceptorTape$Command;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    return-void
.end method

.method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 15
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    new-instance v1, Lretrofit/RequestInterceptorTape$CommandWithParams;

    sget-object v2, Lretrofit/RequestInterceptorTape$Command;->ADD_HEADER:Lretrofit/RequestInterceptorTape$Command;

    invoke-direct {v1, v2, p1, p2}, Lretrofit/RequestInterceptorTape$CommandWithParams;-><init>(Lretrofit/RequestInterceptorTape$Command;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    return-void
.end method

.method public addPathParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 19
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    new-instance v1, Lretrofit/RequestInterceptorTape$CommandWithParams;

    sget-object v2, Lretrofit/RequestInterceptorTape$Command;->ADD_PATH_PARAM:Lretrofit/RequestInterceptorTape$Command;

    invoke-direct {v1, v2, p1, p2}, Lretrofit/RequestInterceptorTape$CommandWithParams;-><init>(Lretrofit/RequestInterceptorTape$Command;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    return-void
.end method

.method public addQueryParam(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 27
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    new-instance v1, Lretrofit/RequestInterceptorTape$CommandWithParams;

    sget-object v2, Lretrofit/RequestInterceptorTape$Command;->ADD_QUERY_PARAM:Lretrofit/RequestInterceptorTape$Command;

    invoke-direct {v1, v2, p1, p2}, Lretrofit/RequestInterceptorTape$CommandWithParams;-><init>(Lretrofit/RequestInterceptorTape$Command;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    return-void
.end method

.method public intercept(Lretrofit/RequestInterceptor$RequestFacade;)V
    .locals 5

    .line 35
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lretrofit/RequestInterceptorTape$CommandWithParams;

    .line 36
    iget-object v0, v4, Lretrofit/RequestInterceptorTape$CommandWithParams;->command:Lretrofit/RequestInterceptorTape$Command;

    iget-object v1, v4, Lretrofit/RequestInterceptorTape$CommandWithParams;->name:Ljava/lang/String;

    iget-object v2, v4, Lretrofit/RequestInterceptorTape$CommandWithParams;->value:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Lretrofit/RequestInterceptorTape$Command;->intercept(Lretrofit/RequestInterceptor$RequestFacade;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-void
.end method
