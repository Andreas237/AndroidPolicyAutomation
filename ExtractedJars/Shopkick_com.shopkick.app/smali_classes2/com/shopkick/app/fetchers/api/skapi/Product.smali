.class public Lcom/shopkick/app/fetchers/api/skapi/Product;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "Product.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public buyLink:Ljava/lang/String;

.field public chainId:Ljava/lang/String;

.field public chainImageUrl:Ljava/lang/String;

.field public currentPrice:Ljava/lang/String;

.field public dealHeading:Ljava/lang/String;

.field public dealId:Ljava/lang/String;

.field public dealSklink:Ljava/lang/String;

.field public descriptionHtml:Ljava/lang/String;

.field public displayTaxonomyNodeId:Ljava/lang/String;

.field public emailShareBody:Ljava/lang/String;

.field public emailShareSubject:Ljava/lang/String;

.field public images:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ProductImage;",
            ">;"
        }
    .end annotation
.end field

.field public isSaved:Ljava/lang/Boolean;

.field public name:Ljava/lang/String;

.field public originalPrice:Ljava/lang/String;

.field public productId:Ljava/lang/String;

.field public saveCount:Ljava/lang/Long;

.field public smsShareText:Ljava/lang/String;

.field public taxonomyNodeId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/Product;
    .locals 2

    .line 51
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/Product;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/Product;

    if-eqz p1, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/Product;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/Product;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Product;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Product;
    .locals 1

    .line 46
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/Product;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/Product;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/Product;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->images:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ProductImage;->postProcess()V

    goto :goto_0

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->isSaved:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Product;->isSaved:Ljava/lang/Boolean;

    :cond_1
    return-void
.end method
