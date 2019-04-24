.class public interface abstract Lcom/ibotta/api/helper/social/CustomerSocialHelper;
.super Ljava/lang/Object;
.source "CustomerSocialHelper.java"


# virtual methods
.method public abstract findByType(Ljava/util/List;Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/customer/CustomerSocial;
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/auth/AuthType;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
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

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
