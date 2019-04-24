.class public final Lcom/huawei/hms/api/HuaweiApiClient$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/api/HuaweiApiClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/Scope;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/auth/PermissionInfo;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lcom/huawei/hms/api/Api<*>;Lcom/huawei/hms/api/Api$ApiOptions;>;"
        }
    .end annotation
.end field

.field private e:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

.field private f:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NullPointerException;
        }
    .end annotation

    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->b:Ljava/util/List;

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->c:Ljava/util/List;

    .line 176
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->d:Ljava/util/Map;

    .line 189
    const-string v0, "context must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->a:Landroid/content/Context;

    .line 192
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hms/c/h;->a(Landroid/content/Context;)V

    .line 194
    invoke-static {}, Lo/cjz;->e()Z

    move-result v3

    .line 195
    const-string v0, "HMS BI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Builder->biInitFlag :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    invoke-static {p1}, Lcom/huawei/hms/c/j;->d(Landroid/content/Context;)Z

    move-result v4

    .line 198
    const-string v0, "HMS BI"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Builder->biSetting :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    if-nez v3, :cond_0

    if-nez v4, :cond_0

    .line 201
    new-instance v5, Lo/cjy$b;

    invoke-direct {v5, p1}, Lo/cjy$b;-><init>(Landroid/content/Context;)V

    .line 202
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cjy$b;->c(Z)Lo/cjy$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->b(Z)Lo/cjy$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cjy$b;->e(Z)Lo/cjy$b;

    move-result-object v0

    const-string v1, "https://metrics1.data.hicloud.com:6447"

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cjy$b;->c(ILjava/lang/String;)Lo/cjy$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/cjy$b;->c()V

    .line 204
    :cond_0
    return-void
.end method


# virtual methods
.method public addApi(Lcom/huawei/hms/api/Api;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/Api<+Lcom/huawei/hms/api/Api$ApiOptions$NotRequiredOptions;>;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;"
        }
    .end annotation

    .line 275
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->d:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    const-string v0, "HuaweiGame.API"

    invoke-virtual {p1}, Lcom/huawei/hms/api/Api;->getApiName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    invoke-static {}, Lcom/huawei/hms/support/b/a;->a()Lcom/huawei/hms/support/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "15060106"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hms/support/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    :cond_0
    return-object p0
.end method

.method public addApi(Lcom/huawei/hms/api/Api;Lcom/huawei/hms/api/Api$ApiOptions$HasOptions;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O::Lcom/huawei/hms/api/Api$ApiOptions$HasOptions;>(Lcom/huawei/hms/api/Api<TO;>;TO;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;"
        }
    .end annotation

    .line 293
    const-string v0, "Api must not be null"

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 294
    const-string v0, "Null options are not permitted for this Api"

    invoke-static {p2, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 295
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->d:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    invoke-virtual {p1}, Lcom/huawei/hms/api/Api;->getOptions()Lcom/huawei/hms/api/Api$Options;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 297
    invoke-virtual {p1}, Lcom/huawei/hms/api/Api;->getOptions()Lcom/huawei/hms/api/Api$Options;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hms/api/Api$Options;->getScopeList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 298
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 299
    invoke-virtual {p1}, Lcom/huawei/hms/api/Api;->getOptions()Lcom/huawei/hms/api/Api$Options;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/hms/api/Api$Options;->getPermissionInfoList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 300
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 302
    :cond_0
    return-object p0
.end method

.method public addConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;
    .locals 1

    .line 231
    const-string v0, "listener must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 233
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->f:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    .line 235
    return-object p0
.end method

.method public addOnConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;
    .locals 1

    .line 246
    const-string v0, "listener must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 248
    iput-object p1, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->e:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    .line 250
    return-object p0
.end method

.method public addScope(Lcom/huawei/hms/support/api/entity/auth/Scope;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;
    .locals 1

    .line 261
    const-string v0, "scope must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 263
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    return-object p0
.end method

.method public build()Lcom/huawei/hms/api/HuaweiApiClient;
    .locals 3

    .line 212
    new-instance v0, Lcom/huawei/hms/api/Api;

    const-string v1, "Core.API"

    invoke-direct {v0, v1}, Lcom/huawei/hms/api/Api;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->addApi(Lcom/huawei/hms/api/Api;)Lcom/huawei/hms/api/HuaweiApiClient$Builder;

    .line 213
    new-instance v2, Lcom/huawei/hms/api/HuaweiApiClientImpl;

    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->a:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;-><init>(Landroid/content/Context;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->b:Ljava/util/List;

    invoke-virtual {v2, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->setScopes(Ljava/util/List;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->c:Ljava/util/List;

    invoke-virtual {v2, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->setPermissionInfos(Ljava/util/List;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->d:Ljava/util/Map;

    invoke-virtual {v2, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->setApiMap(Ljava/util/Map;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->f:Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;

    invoke-virtual {v2, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->setConnectionCallbacks(Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/hms/api/HuaweiApiClient$Builder;->e:Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    invoke-virtual {v2, v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->setConnectionFailedListener(Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V

    .line 220
    return-object v2
.end method
