.class public Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerSocialsReferralPostResponse.java"


# instance fields
.field private ids:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;->ids:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 27
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 28
    instance-of v0, p1, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;

    if-eqz v0, :cond_1

    .line 29
    check-cast p1, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;->ids:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;->setIds(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getIds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;->ids:Ljava/util/List;

    return-object v0
.end method

.method public setIds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsReferralPostResponse;->ids:Ljava/util/List;

    return-void
.end method
