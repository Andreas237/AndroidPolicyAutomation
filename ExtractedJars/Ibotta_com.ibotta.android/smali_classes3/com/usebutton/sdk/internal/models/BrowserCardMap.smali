.class public Lcom/usebutton/sdk/internal/models/BrowserCardMap;
.super Ljava/lang/Object;
.source "BrowserCardMap.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardMap;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private internalInstallCardMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/models/InternalInstallCard;",
            ">;"
        }
    .end annotation
.end field

.field private internalRewardCardMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/models/InternalRewardCard;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/usebutton/sdk/internal/models/BrowserCardMap$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/BrowserCardMap$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalRewardCardMap:Ljava/util/Map;

    .line 19
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalInstallCardMap:Ljava/util/Map;

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalRewardCardMap:Ljava/util/Map;

    const-class v1, Lcom/usebutton/sdk/internal/models/InternalRewardCard;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    .line 29
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalInstallCardMap:Ljava/util/Map;

    const-class v1, Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readMap(Ljava/util/Map;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method constructor <init>(Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/models/InternalRewardCard;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/models/InternalInstallCard;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalRewardCardMap:Ljava/util/Map;

    .line 19
    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalInstallCardMap:Ljava/util/Map;

    .line 23
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalRewardCardMap:Ljava/util/Map;

    .line 24
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalInstallCardMap:Ljava/util/Map;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;)Lcom/usebutton/sdk/internal/models/BrowserCardMap;
    .locals 5
    .param p0    # Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 77
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 78
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 81
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->getInternalRewardCardDTOMap()Ljava/util/Map;

    move-result-object v2

    .line 83
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/models/BrowserCardMapDTO;->getInternalInstallCardDTOMap()Ljava/util/Map;

    move-result-object p0

    .line 85
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 86
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    .line 87
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;

    .line 89
    invoke-static {v3}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->fromDTO(Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;)Lcom/usebutton/sdk/internal/models/InternalRewardCard;

    move-result-object v3

    .line 91
    invoke-virtual {v4}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->getApiValue()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 94
    :cond_1
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 95
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    .line 96
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;

    .line 98
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->fromDTO(Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;)Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    move-result-object v2

    .line 100
    invoke-virtual {v3}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->getApiValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 103
    :cond_2
    new-instance p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;

    invoke-direct {p0, v0, v1}, Lcom/usebutton/sdk/internal/models/BrowserCardMap;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object p0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/usebutton/sdk/internal/models/BrowserCardType;",
            "Lcom/usebutton/sdk/internal/models/BrowserCard;",
            ">;"
        }
    .end annotation

    .line 56
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lcom/usebutton/sdk/internal/models/BrowserCardType;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 58
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalRewardCardMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->getCardType(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/BrowserCardType;

    move-result-object v3

    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 63
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalInstallCardMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 64
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/usebutton/sdk/internal/models/BrowserCardType;->getCardType(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/BrowserCardType;

    move-result-object v3

    .line 65
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 51
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalRewardCardMap:Ljava/util/Map;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    .line 52
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/BrowserCardMap;->internalInstallCardMap:Ljava/util/Map;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeMap(Ljava/util/Map;)V

    return-void
.end method
