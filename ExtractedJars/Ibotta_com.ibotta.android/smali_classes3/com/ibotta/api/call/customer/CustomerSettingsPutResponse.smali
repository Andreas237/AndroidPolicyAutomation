.class public Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerSettingsPutResponse.java"


# instance fields
.field private groups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSettingsGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 30
    instance-of v0, p1, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    if-eqz v0, :cond_1

    .line 31
    check-cast p1, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;->groups:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;->setGroups(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSettingsGroup;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;->groups:Ljava/util/List;

    return-object v0
.end method

.method public setGroups(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerSettingsGroup;",
            ">;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerSettingsPutResponse;->groups:Ljava/util/List;

    return-void
.end method
