.class public Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;
.super Ljava/lang/Object;
.source "GroupUrlResolver.java"

# interfaces
.implements Lcom/ibotta/android/routing/urlresolver/UrlResolver;


# instance fields
.field protected final urlResolvers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/routing/urlresolver/UrlResolver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/routing/urlresolver/UrlResolver;",
            ">;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;->urlResolvers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method protected findUrlResolver(Ljava/lang/String;)Lcom/ibotta/android/routing/urlresolver/UrlResolver;
    .locals 3

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;->urlResolvers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    .line 37
    invoke-interface {v1, p1}, Lcom/ibotta/android/routing/urlresolver/UrlResolver;->isResolveable(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public isResolveable(Ljava/lang/String;)Z
    .locals 0

    .line 18
    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;->findUrlResolver(Ljava/lang/String;)Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public resolve(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
    .locals 1

    .line 23
    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/urlresolver/GroupUrlResolver;->findUrlResolver(Ljava/lang/String;)Lcom/ibotta/android/routing/urlresolver/UrlResolver;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 30
    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/routing/urlresolver/UrlResolver;->resolve(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V

    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No resolver found. Use isResolveable() to make sure a resolver exists before calling resolve()."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
