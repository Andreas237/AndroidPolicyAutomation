.class Lcom/usebutton/sdk/internal/RestrictedDomainManager;
.super Ljava/lang/Object;
.source "RestrictedDomainManager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "RestrictedDomainManager"


# instance fields
.field private final cookieManager:Landroid/webkit/CookieManager;

.field private restrictedDomains:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Landroid/webkit/CookieManager;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ".linksynergy.com"

    .line 21
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->restrictedDomains:Ljava/util/List;

    .line 28
    iput-object p1, p0, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->cookieManager:Landroid/webkit/CookieManager;

    return-void
.end method


# virtual methods
.method clearCookies(Ljava/util/Set;)V
    .locals 8
    .param p1    # Ljava/util/Set;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->restrictedDomains:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_0

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 39
    iget-object v1, p0, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->cookieManager:Landroid/webkit/CookieManager;

    invoke-virtual {v1, v0}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 43
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->parseCookies(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1
    :try_end_0
    .catch Lcom/usebutton/sdk/internal/util/InvalidCookieException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 52
    sget-object v5, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->TAG:Ljava/lang/String;

    const-string v6, "Deleting Cookie: %s"

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v4, v7, v3

    invoke-static {v5, v6, v7}, Lcom/usebutton/sdk/internal/util/ButtonLog;->verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget-object v5, p0, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->cookieManager:Landroid/webkit/CookieManager;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "=;expires=Tue, 1 Jun 1993 00:00:00 UTC;"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 53
    invoke-virtual {v5, v0, v4}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v4

    .line 45
    sget-object v5, Lcom/usebutton/sdk/internal/RestrictedDomainManager;->TAG:Ljava/lang/String;

    const-string v6, "Invalid CookieString: %s Domain: %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v1, v7, v3

    aput-object v0, v7, v2

    .line 46
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-static {v5, v0, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method parseCookies(Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/util/InvalidCookieException;
        }
    .end annotation

    .line 63
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_3

    .line 64
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ";"

    .line 65
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    .line 67
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_3

    .line 68
    aget-object v3, p1, v2

    const-string v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 70
    array-length v4, v3

    rem-int/lit8 v4, v4, 0x2

    if-nez v4, :cond_2

    .line 74
    array-length v4, v3

    if-lez v4, :cond_0

    aget-object v4, v3, v1

    goto :goto_1

    :cond_0
    const-string v4, ""

    .line 75
    :goto_1
    array-length v5, v3

    const/4 v6, 0x1

    if-le v5, v6, :cond_1

    aget-object v3, v3, v6

    goto :goto_2

    :cond_1
    const-string v3, ""

    .line 77
    :goto_2
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    :cond_2
    new-instance p1, Lcom/usebutton/sdk/internal/util/InvalidCookieException;

    invoke-direct {p1}, Lcom/usebutton/sdk/internal/util/InvalidCookieException;-><init>()V

    throw p1

    :cond_3
    return-object v0
.end method
