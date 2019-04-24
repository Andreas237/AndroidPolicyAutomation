.class public final Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;
.super Ljava/util/HashMap;
.source "BgcBrandAssetHelper.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "com/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1",
        "Ljava/util/HashMap;",
        "",
        "",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "American Express"

    .line 16
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_amex:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Diners Club"

    .line 17
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_diners:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Discover"

    .line 18
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_discover:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "JCB"

    .line 19
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_jcb:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "MasterCard"

    .line 20
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_mastercard:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Visa"

    .line 21
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_visa:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Unknown"

    .line 22
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icon_unknown:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 14
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->containsKey(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge containsKey(Ljava/lang/String;)Z
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge containsValue(Ljava/lang/Integer;)Z
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 14
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->containsValue(Ljava/lang/Integer;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->getEntries()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge get(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 14
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->get(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge getEntries()Ljava/util/Set;
    .locals 1

    .line 14
    invoke-super {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKeys()Ljava/util/Set;
    .locals 1

    .line 14
    invoke-super {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge getOrDefault(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 14
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 14
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->getOrDefault(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public bridge getSize()I
    .locals 1

    .line 14
    invoke-super {p0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public bridge getValues()Ljava/util/Collection;
    .locals 1

    .line 14
    invoke-super {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final bridge keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->getKeys()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge remove(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    .line 14
    invoke-super {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 14
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->remove(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 14
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->remove(Ljava/lang/String;Ljava/lang/Integer;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge remove(Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 0

    .line 14
    invoke-super {p0, p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge size()I
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->getSize()I

    move-result v0

    return v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper$BRAND_RESOURCE_MAP$1;->getValues()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
