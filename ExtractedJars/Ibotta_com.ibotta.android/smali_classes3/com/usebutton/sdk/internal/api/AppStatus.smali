.class public Lcom/usebutton/sdk/internal/api/AppStatus;
.super Ljava/lang/Object;
.source "AppStatus.java"


# instance fields
.field private final availableApps:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final unavailableApps:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/AppStatus;->availableApps:Ljava/util/Set;

    .line 11
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/AppStatus;->unavailableApps:Ljava/util/Set;

    return-void
.end method

.method public static create(Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/util/PackageObserver;)Lcom/usebutton/sdk/internal/api/AppStatus;
    .locals 3

    .line 33
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/core/Storage;->getDetectableApplications()Ljava/util/Set;

    move-result-object p0

    .line 34
    new-instance v0, Lcom/usebutton/sdk/internal/api/AppStatus;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/api/AppStatus;-><init>()V

    .line 35
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 36
    invoke-virtual {p1, v1}, Lcom/usebutton/sdk/internal/util/PackageObserver;->isInstalled(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/usebutton/sdk/internal/api/AppStatus;->add(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public add(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 15
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/AppStatus;->availableApps:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 17
    :cond_0
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/AppStatus;->unavailableApps:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public getAvailableApps()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppStatus;->availableApps:Ljava/util/Set;

    return-object v0
.end method

.method public getUnavailableApps()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/AppStatus;->unavailableApps:Ljava/util/Set;

    return-object v0
.end method
