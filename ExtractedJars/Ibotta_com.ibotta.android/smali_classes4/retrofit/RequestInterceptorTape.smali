.class final Lretrofit/RequestInterceptorTape;
.super Ljava/lang/Object;
.source "RequestInterceptorTape.java"

# interfaces
.implements Lretrofit/RequestInterceptor;
.implements Lretrofit/RequestInterceptor$RequestFacade;


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
            "Ljava/util/List<",
            "Lretrofit/RequestInterceptorTape$CommandWithParams;",
            ">;"
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

    return-void
.end method

.method public intercept(Lretrofit/RequestInterceptor$RequestFacade;)V
    .locals 4

    .line 35
    iget-object v0, p0, Lretrofit/RequestInterceptorTape;->tape:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lretrofit/RequestInterceptorTape$CommandWithParams;

    .line 36
    iget-object v2, v1, Lretrofit/RequestInterceptorTape$CommandWithParams;->command:Lretrofit/RequestInterceptorTape$Command;

    iget-object v3, v1, Lretrofit/RequestInterceptorTape$CommandWithParams;->name:Ljava/lang/String;

    iget-object v1, v1, Lretrofit/RequestInterceptorTape$CommandWithParams;->value:Ljava/lang/String;

    invoke-virtual {v2, p1, v3, v1}, Lretrofit/RequestInterceptorTape$Command;->intercept(Lretrofit/RequestInterceptor$RequestFacade;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method
