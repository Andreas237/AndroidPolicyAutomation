.class public final Lnet/toddm/comm/CommManager$Builder;
.super Ljava/lang/Object;
.source "CommManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/CommManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private _cacheProvider:Lnet/toddm/cache/CacheProvider;

.field private _configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

.field private _loggingProvider:Lnet/toddm/cache/LoggingProvider;

.field private _name:Ljava/lang/String;

.field private _priorityManagementProvider:Lnet/toddm/comm/PriorityManagementProvider;

.field private _retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "default"

    .line 1173
    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_name:Ljava/lang/String;

    const/4 v0, 0x0

    .line 1174
    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 1175
    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_priorityManagementProvider:Lnet/toddm/comm/PriorityManagementProvider;

    .line 1176
    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    .line 1177
    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    .line 1178
    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_loggingProvider:Lnet/toddm/cache/LoggingProvider;

    .line 1183
    new-instance v0, Lnet/toddm/comm/DefaultConfigurationProvider;

    invoke-direct {v0}, Lnet/toddm/comm/DefaultConfigurationProvider;-><init>()V

    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    return-void
.end method


# virtual methods
.method public create()Lnet/toddm/comm/CommManager;
    .locals 10

    .line 1261
    iget-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_priorityManagementProvider:Lnet/toddm/comm/PriorityManagementProvider;

    if-nez v0, :cond_0

    .line 1262
    new-instance v0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;

    iget-object v1, p0, Lnet/toddm/comm/CommManager$Builder;->_loggingProvider:Lnet/toddm/cache/LoggingProvider;

    invoke-direct {v0, v1}, Lnet/toddm/comm/DefaultPriorityManagmentProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_priorityManagementProvider:Lnet/toddm/comm/PriorityManagementProvider;

    .line 1264
    :cond_0
    iget-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    if-nez v0, :cond_1

    .line 1265
    new-instance v0, Lnet/toddm/comm/DefaultRetryPolicyProvider;

    iget-object v1, p0, Lnet/toddm/comm/CommManager$Builder;->_loggingProvider:Lnet/toddm/cache/LoggingProvider;

    invoke-direct {v0, v1}, Lnet/toddm/comm/DefaultRetryPolicyProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    iput-object v0, p0, Lnet/toddm/comm/CommManager$Builder;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    .line 1269
    :cond_1
    new-instance v0, Lnet/toddm/comm/CommManager;

    .line 1270
    iget-object v3, p0, Lnet/toddm/comm/CommManager$Builder;->_name:Ljava/lang/String;

    .line 1271
    iget-object v4, p0, Lnet/toddm/comm/CommManager$Builder;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    .line 1272
    iget-object v5, p0, Lnet/toddm/comm/CommManager$Builder;->_priorityManagementProvider:Lnet/toddm/comm/PriorityManagementProvider;

    .line 1273
    iget-object v6, p0, Lnet/toddm/comm/CommManager$Builder;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    .line 1274
    iget-object v7, p0, Lnet/toddm/comm/CommManager$Builder;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    .line 1275
    iget-object v8, p0, Lnet/toddm/comm/CommManager$Builder;->_loggingProvider:Lnet/toddm/cache/LoggingProvider;

    const/4 v9, 0x0

    move-object v2, v0

    .line 1269
    invoke-direct/range {v2 .. v9}, Lnet/toddm/comm/CommManager;-><init>(Ljava/lang/String;Lnet/toddm/cache/CacheProvider;Lnet/toddm/comm/PriorityManagementProvider;Lnet/toddm/comm/RetryPolicyProvider;Lnet/toddm/comm/ConfigurationProvider;Lnet/toddm/cache/LoggingProvider;Lnet/toddm/comm/CommManager;)V

    return-object v0
.end method

.method public setCacheProvider(Lnet/toddm/cache/CacheProvider;)Lnet/toddm/comm/CommManager$Builder;
    .locals 0

    .line 1202
    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_cacheProvider:Lnet/toddm/cache/CacheProvider;

    return-object p0
.end method

.method public setConfigurationProvider(Lnet/toddm/comm/ConfigurationProvider;)Lnet/toddm/comm/CommManager$Builder;
    .locals 0

    if-nez p1, :cond_0

    .line 1235
    new-instance p1, Lnet/toddm/comm/DefaultConfigurationProvider;

    invoke-direct {p1}, Lnet/toddm/comm/DefaultConfigurationProvider;-><init>()V

    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    goto :goto_0

    .line 1237
    :cond_0
    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_configurationProvider:Lnet/toddm/comm/ConfigurationProvider;

    :goto_0
    return-object p0
.end method

.method public setLoggingProvider(Lnet/toddm/cache/LoggingProvider;)Lnet/toddm/comm/CommManager$Builder;
    .locals 0

    .line 1249
    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_loggingProvider:Lnet/toddm/cache/LoggingProvider;

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lnet/toddm/comm/CommManager$Builder;
    .locals 0

    .line 1191
    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_name:Ljava/lang/String;

    return-object p0
.end method

.method public setPriorityManagmentProvider(Lnet/toddm/comm/PriorityManagementProvider;)Lnet/toddm/comm/CommManager$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 1213
    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_priorityManagementProvider:Lnet/toddm/comm/PriorityManagementProvider;

    return-object p0

    .line 1212
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'priorityManagmentProvider\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setRetryPolicyProvider(Lnet/toddm/comm/RetryPolicyProvider;)Lnet/toddm/comm/CommManager$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 1224
    iput-object p1, p0, Lnet/toddm/comm/CommManager$Builder;->_retryPolicyProvider:Lnet/toddm/comm/RetryPolicyProvider;

    return-object p0

    .line 1223
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'retryPolicyProvider\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
