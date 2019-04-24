.class public Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;
.super Ljava/lang/Object;
.source "CustomerSocialHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/social/CustomerSocialHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private isTypeAMatch(Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/api/model/customer/CustomerSocial;)Z
    .locals 1

    if-nez p1, :cond_0

    .line 24
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/CustomerSocial;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p1, :cond_2

    .line 25
    invoke-virtual {p2}, Lcom/ibotta/api/model/customer/CustomerSocial;->getTypeEnum()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/auth/AuthType;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$findByType$0(Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/api/model/customer/CustomerSocial;)Z
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;->isTypeAMatch(Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/api/model/customer/CustomerSocial;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public findByType(Ljava/util/List;Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/customer/CustomerSocial;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSocial;",
            ">;",
            "Lcom/ibotta/api/model/auth/AuthType;",
            ")",
            "Lcom/ibotta/api/model/customer/CustomerSocial;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 17
    :cond_0
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v1, Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;

    invoke-direct {v1, p0, p2}, Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;-><init>(Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;Lcom/ibotta/api/model/auth/AuthType;)V

    .line 18
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    .line 20
    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerSocial;

    return-object p1
.end method
