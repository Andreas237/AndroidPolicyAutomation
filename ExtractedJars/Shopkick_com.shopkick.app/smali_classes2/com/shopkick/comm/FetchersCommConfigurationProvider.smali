.class public Lcom/shopkick/comm/FetchersCommConfigurationProvider;
.super Lnet/toddm/comm/MapConfigurationProvider;
.source "FetchersCommConfigurationProvider.java"


# static fields
.field private static final CpuCount:I

.field private static final MaxSimultaneousRequests:I

.field private static final _ConfigMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 15
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->CpuCount:I

    .line 18
    sget v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->CpuCount:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->MaxSimultaneousRequests:I

    .line 20
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    .line 23
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    const-string v1, "redirect_limit"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    const-string v1, "max_simultaneous_requests"

    sget v2, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->MaxSimultaneousRequests:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    const-string v1, "connect_timeout_milliseconds"

    const/16 v2, 0x1388

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    const-string v1, "read_timeout_milliseconds"

    const/16 v2, 0x7530

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    const-string v1, "disable_ssl_cert_checking"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    const-string/jumbo v1, "use_built_in_http_url_connection_redirection_support"

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 32
    sget-object v0, Lcom/shopkick/comm/FetchersCommConfigurationProvider;->_ConfigMap:Ljava/util/Map;

    invoke-direct {p0, v0}, Lnet/toddm/comm/MapConfigurationProvider;-><init>(Ljava/util/Map;)V

    return-void
.end method
