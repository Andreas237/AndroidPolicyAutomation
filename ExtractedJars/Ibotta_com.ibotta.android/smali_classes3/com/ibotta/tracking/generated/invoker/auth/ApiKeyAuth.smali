.class public Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;
.super Ljava/lang/Object;
.source "ApiKeyAuth.java"

# interfaces
.implements Lcom/ibotta/tracking/generated/invoker/auth/Authentication;


# instance fields
.field private apiKey:Ljava/lang/String;

.field private apiKeyPrefix:Ljava/lang/String;

.field private final location:Ljava/lang/String;

.field private final paramName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->location:Ljava/lang/String;

    .line 31
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->paramName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public applyToParams(Ljava/util/List;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/tracking/generated/invoker/Pair;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKey:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 64
    :cond_0
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKeyPrefix:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKeyPrefix:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    const-string v1, "query"

    .line 69
    iget-object v2, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->location:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 70
    new-instance p2, Lcom/ibotta/tracking/generated/invoker/Pair;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->paramName:Ljava/lang/String;

    invoke-direct {p2, v1, v0}, Lcom/ibotta/tracking/generated/invoker/Pair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    const-string p1, "header"

    .line 71
    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->location:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 72
    iget-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->paramName:Ljava/lang/String;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_0
    return-void
.end method

.method public getApiKey()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public getApiKeyPrefix()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKeyPrefix:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getParamName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->paramName:Ljava/lang/String;

    return-object v0
.end method

.method public setApiKey(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKey:Ljava/lang/String;

    return-void
.end method

.method public setApiKeyPrefix(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/auth/ApiKeyAuth;->apiKeyPrefix:Ljava/lang/String;

    return-void
.end method
