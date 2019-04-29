.class public Lcom/mopub/mobileads/AdRequestStatusMapping;
.super Ljava/lang/Object;
.source "AdRequestStatusMapping.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;,
        Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;
    }
.end annotation


# instance fields
.field private final mAdUnitToAdRequestStatus:Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method canPlay(Ljava/lang/String;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 52
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    if-eqz p1, :cond_0

    .line 53
    sget-object v0, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->LOADED:Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    invoke-static {p1}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$100(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;)Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method clearClickUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 96
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$600(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method clearImpressionUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 90
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$500(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method getClickTrackerUrlString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    invoke-static {p1}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$400(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method getFailoverUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    invoke-static {p1}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$200(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method getImpressionTrackerUrlString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    invoke-static {p1}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$300(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method isLoading(Ljava/lang/String;)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 58
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    invoke-static {p1}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$100(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;)Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    move-result-object p1

    sget-object v0, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->LOADING:Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method markFail(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method markLoaded(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 34
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    new-instance v1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    sget-object v2, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->LOADED:Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    invoke-direct {v1, v2, p2, p3, p4}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;-><init>(Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method markLoading(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    new-instance v1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    sget-object v2, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->LOADING:Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    invoke-direct {v1, v2}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;-><init>(Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method markPlayed(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    .line 45
    sget-object v0, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->PLAYED:Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    invoke-static {p1, v0}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;->access$000(Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;)V

    goto :goto_0

    .line 47
    :cond_0
    iget-object v0, p0, Lcom/mopub/mobileads/AdRequestStatusMapping;->mAdUnitToAdRequestStatus:Ljava/util/Map;

    new-instance v1, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;

    sget-object v2, Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;->PLAYED:Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;

    invoke-direct {v1, v2}, Lcom/mopub/mobileads/AdRequestStatusMapping$AdRequestStatus;-><init>(Lcom/mopub/mobileads/AdRequestStatusMapping$LoadingStatus;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method
