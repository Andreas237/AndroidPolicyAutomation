.class public Lnet/toddm/comm/DefaultConfigurationProvider;
.super Lnet/toddm/comm/MapConfigurationProvider;
.source "DefaultConfigurationProvider.java"


# static fields
.field public static final KeyConnectTimeoutMilliseconds:Ljava/lang/String; = "connect_timeout_milliseconds"

.field public static final KeyDisableSSLCertChecking:Ljava/lang/String; = "disable_ssl_cert_checking"

.field public static final KeyMaxSimultaneousRequests:Ljava/lang/String; = "max_simultaneous_requests"

.field public static final KeyReadTimeoutMilliseconds:Ljava/lang/String; = "read_timeout_milliseconds"

.field public static final KeyRedirectLimit:Ljava/lang/String; = "redirect_limit"

.field public static final KeyUseBuiltInHttpURLConnectionRedirectionSupport:Ljava/lang/String; = "use_built_in_http_url_connection_redirection_support"

.field public static final ValueConnectTimeoutMilliseconds:I = 0x7530

.field public static final ValueDisableSSLCertChecking:Z = false

.field public static final ValueMaxSimultaneousRequests:I = 0x2

.field public static final ValueReadTimeoutMilliseconds:I = 0x7530

.field public static final ValueRedirectLimit:I = 0x3

.field public static final ValueUseBuiltInHttpURLConnectionRedirectionSupport:Z = false

.field private static final _DefaultConfig:Ljava/util/Map;
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

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    .line 68
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    const-string v1, "redirect_limit"

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    const-string v1, "max_simultaneous_requests"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    const-string v1, "connect_timeout_milliseconds"

    const/16 v2, 0x7530

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    const-string v1, "read_timeout_milliseconds"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    const-string v1, "disable_ssl_cert_checking"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    const-string v1, "use_built_in_http_url_connection_redirection_support"

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 77
    sget-object v0, Lnet/toddm/comm/DefaultConfigurationProvider;->_DefaultConfig:Ljava/util/Map;

    invoke-direct {p0, v0}, Lnet/toddm/comm/MapConfigurationProvider;-><init>(Ljava/util/Map;)V

    return-void
.end method
