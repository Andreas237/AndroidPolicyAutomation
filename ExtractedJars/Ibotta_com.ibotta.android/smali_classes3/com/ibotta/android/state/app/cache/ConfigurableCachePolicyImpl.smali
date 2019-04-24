.class public Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;
.super Ljava/lang/Object;
.source "ConfigurableCachePolicyImpl.java"

# interfaces
.implements Lcom/ibotta/api/CachePolicy;


# instance fields
.field private ageLimit:Ljava/lang/Long;

.field private defaultPolicy:Lcom/ibotta/api/CachePolicy;

.field private heavyCache:Ljava/lang/Boolean;

.field private keepAtMost:Ljava/lang/Integer;

.field private memcache:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public copy()Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;
    .locals 2

    .line 100
    new-instance v0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;-><init>()V

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->setDefaultPolicy(Lcom/ibotta/api/CachePolicy;)V

    .line 103
    iget-object v1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->ageLimit:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->setAgeLimit(Ljava/lang/Long;)V

    .line 104
    iget-object v1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->memcache:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->setMemcache(Ljava/lang/Boolean;)V

    .line 105
    iget-object v1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->heavyCache:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->setHeavyCache(Ljava/lang/Boolean;)V

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->keepAtMost:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->setKeepAtMost(Ljava/lang/Integer;)V

    return-object v0
.end method

.method public getAgeLimit()J
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->ageLimit:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    if-eqz v0, :cond_1

    .line 32
    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->getAgeLimit()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public getDefaultPolicy()Lcom/ibotta/api/CachePolicy;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    return-object v0
.end method

.method public getKeepAtMost()Ljava/lang/Integer;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->keepAtMost:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    if-eqz v0, :cond_1

    .line 89
    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->getKeepAtMost()Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public isHeavyCache()Z
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->heavyCache:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    if-eqz v0, :cond_1

    .line 70
    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->isHeavyCache()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMemcache()Z
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->memcache:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    if-eqz v0, :cond_1

    .line 51
    invoke-interface {v0}, Lcom/ibotta/api/CachePolicy;->isMemcache()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAgeLimit(Ljava/lang/Long;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->ageLimit:Ljava/lang/Long;

    return-void
.end method

.method public setDefaultPolicy(Lcom/ibotta/api/CachePolicy;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->defaultPolicy:Lcom/ibotta/api/CachePolicy;

    return-void
.end method

.method public setHeavyCache(Ljava/lang/Boolean;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->heavyCache:Ljava/lang/Boolean;

    return-void
.end method

.method public setKeepAtMost(Ljava/lang/Integer;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->keepAtMost:Ljava/lang/Integer;

    return-void
.end method

.method public setMemcache(Ljava/lang/Boolean;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->memcache:Ljava/lang/Boolean;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConfigurableCachePolicyImpl: ["

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "ageLimit: "

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->getAgeLimit()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "memcache: "

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->isMemcache()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "heavyCache: "

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->isHeavyCache()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", "

    .line 124
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "keepAtMost: "

    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/state/app/cache/ConfigurableCachePolicyImpl;->getKeepAtMost()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
