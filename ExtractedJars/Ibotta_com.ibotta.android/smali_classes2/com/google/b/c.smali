.class public Lcom/google/b/c;
.super Ljava/lang/Object;
.source "IMASDK"

# interfaces
.implements Lcom/google/ads/interactivemedia/v3/b/x;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/ads/interactivemedia/v3/b/f;Lcom/google/ads/interactivemedia/v3/b/c/a;)Lcom/google/ads/interactivemedia/v3/b/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/ads/interactivemedia/v3/b/f;",
            "Lcom/google/ads/interactivemedia/v3/b/c/a<",
            "TT;>;)",
            "Lcom/google/ads/interactivemedia/v3/b/w<",
            "TT;>;"
        }
    .end annotation

    .line 16
    invoke-virtual {p2}, Lcom/google/ads/interactivemedia/v3/b/c/a;->a()Ljava/lang/Class;

    move-result-object p2

    .line 18
    const-class v0, Lcom/google/b/a;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/google/b/a;

    if-eqz v0, :cond_1

    .line 20
    invoke-interface {v0}, Lcom/google/b/a;->a()Ljava/lang/Class;

    move-result-object v1

    if-ne p2, v1, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0}, Lcom/google/b/a;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/ads/interactivemedia/v3/b/f;->a(Ljava/lang/Class;)Lcom/google/ads/interactivemedia/v3/b/w;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
