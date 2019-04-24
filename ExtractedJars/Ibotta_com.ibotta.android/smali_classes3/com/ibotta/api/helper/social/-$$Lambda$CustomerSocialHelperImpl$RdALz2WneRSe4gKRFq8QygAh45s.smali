.class public final synthetic Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Predicate;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;

.field private final synthetic f$1:Lcom/ibotta/api/model/auth/AuthType;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;Lcom/ibotta/api/model/auth/AuthType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;->f$0:Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;

    iput-object p2, p0, Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;->f$1:Lcom/ibotta/api/model/auth/AuthType;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$and(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava9/util/function/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/function/Predicate$-CC;->$default$negate(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$or(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;->f$0:Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;

    iget-object v1, p0, Lcom/ibotta/api/helper/social/-$$Lambda$CustomerSocialHelperImpl$RdALz2WneRSe4gKRFq8QygAh45s;->f$1:Lcom/ibotta/api/model/auth/AuthType;

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerSocial;

    invoke-static {v0, v1, p1}, Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;->lambda$findByType$0(Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/api/model/customer/CustomerSocial;)Z

    move-result p1

    return p1
.end method
