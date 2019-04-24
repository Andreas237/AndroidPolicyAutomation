.class public Lcom/usebutton/sdk/action/ActionQuery;
.super Lcom/usebutton/sdk/internal/models/BaseEntity;
.source "ActionQuery.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field private static final BLACKLISTED_KEYS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/action/ActionQuery;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ActionQuery"


# instance fields
.field private mKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 79
    new-instance v0, Ljava/util/HashSet;

    const-string/jumbo v1, "user_local_time"

    const-string/jumbo v2, "user_location"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/usebutton/sdk/action/ActionQuery;->BLACKLISTED_KEYS:Ljava/util/Set;

    .line 81
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/action/ActionQuery;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 102
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 107
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 112
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method private static collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONArray;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/json/JSONArray;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 265
    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 266
    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 269
    :cond_0
    instance-of v2, v1, Lorg/json/JSONArray;

    if-eqz v2, :cond_1

    .line 270
    check-cast v1, Lorg/json/JSONArray;

    invoke-static {p0, p1, v1}, Lcom/usebutton/sdk/action/ActionQuery;->collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONArray;)V

    goto :goto_1

    .line 271
    :cond_1
    instance-of v2, v1, Lorg/json/JSONObject;

    if-eqz v2, :cond_2

    .line 272
    check-cast v1, Lorg/json/JSONObject;

    invoke-static {p0, p1, v1}, Lcom/usebutton/sdk/action/ActionQuery;->collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;)V

    goto :goto_1

    .line 274
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private static collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/json/JSONObject;",
            ")V"
        }
    .end annotation

    .line 240
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 242
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 243
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 244
    invoke-static {v1}, Lcom/usebutton/sdk/action/ActionQuery;->shouldIgnoreKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 247
    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v2, :cond_1

    goto :goto_0

    .line 250
    :cond_1
    instance-of v1, v2, Lorg/json/JSONObject;

    if-eqz v1, :cond_2

    .line 251
    check-cast v2, Lorg/json/JSONObject;

    invoke-static {p0, p1, v2}, Lcom/usebutton/sdk/action/ActionQuery;->collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;)V

    goto :goto_0

    .line 252
    :cond_2
    instance-of v1, v2, Lorg/json/JSONArray;

    if-eqz v1, :cond_3

    .line 253
    check-cast v2, Lorg/json/JSONArray;

    invoke-static {p0, p1, v2}, Lcom/usebutton/sdk/action/ActionQuery;->collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONArray;)V

    goto :goto_0

    .line 255
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-void
.end method

.method public static deepCopy(Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 6
    .param p0    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 179
    :cond_0
    :try_start_0
    new-instance v1, Lcom/usebutton/sdk/action/ActionQuery;

    new-instance v2, Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/usebutton/sdk/action/ActionQuery;->getData()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/action/ActionQuery;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    const-string v2, "ActionQuery"

    const-string v3, "Couldn\'t copy context: %s\n%s"

    const/4 v4, 0x2

    .line 181
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v1, 0x1

    invoke-virtual {p0}, Lcom/usebutton/sdk/action/ActionQuery;->getData()Lorg/json/JSONObject;

    move-result-object p0

    aput-object p0, v4, v1

    invoke-static {v2, v3, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method private static orderedJson(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 224
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 225
    invoke-static {v0, v1, p0}, Lcom/usebutton/sdk/action/ActionQuery;->collect(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;)V

    .line 226
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 227
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 228
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/16 v3, 0x2c

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 230
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/16 v0, 0xa

    .line 232
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 234
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 236
    :cond_1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static shouldIgnoreKey(Ljava/lang/String;)Z
    .locals 1

    .line 261
    sget-object v0, Lcom/usebutton/sdk/action/ActionQuery;->BLACKLISTED_KEYS:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static withArtist(Lcom/usebutton/sdk/context/MusicArtist;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p0    # Lcom/usebutton/sdk/context/MusicArtist;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 147
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/action/ActionQuery;->setArtist(Lcom/usebutton/sdk/context/MusicArtist;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method

.method public static withDate(Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p0    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 140
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/action/ActionQuery;->setDate(Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method

.method public static withDateRange(Ljava/util/Date;Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p0    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 133
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setDateRange(Ljava/util/Date;Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method

.method public static withEvent(Lcom/usebutton/sdk/context/Event;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1

    .line 161
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/action/ActionQuery;->setEvent(Lcom/usebutton/sdk/context/Event;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method

.method public static withJourney(Lcom/usebutton/sdk/context/Journey;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p0    # Lcom/usebutton/sdk/context/Journey;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 154
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/action/ActionQuery;->setJourney(Lcom/usebutton/sdk/context/Journey;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method

.method public static withSubjectLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p0    # Lcom/usebutton/sdk/context/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 126
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/action/ActionQuery;->setSubjectLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method

.method public static withUserLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p0    # Lcom/usebutton/sdk/context/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 119
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery;

    invoke-direct {v0}, Lcom/usebutton/sdk/action/ActionQuery;-><init>()V

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/action/ActionQuery;->setUserLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public addItem(Lcom/usebutton/sdk/context/Item;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1

    const-string v0, "items"

    .line 351
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->accumulateArray(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected getType()Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    return-object v0
.end method

.method public declared-synchronized key()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 206
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/action/ActionQuery;->mKey:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 207
    invoke-virtual {p0}, Lcom/usebutton/sdk/action/ActionQuery;->getData()Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/action/ActionQuery;->orderedJson(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->md5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/action/ActionQuery;->mKey:Ljava/lang/String;

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/action/ActionQuery;->mKey:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public setArtist(Lcom/usebutton/sdk/context/MusicArtist;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1

    const-string v0, "artist"

    .line 340
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setDate(Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p1    # Ljava/util/Date;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "applicable_date"

    .line 329
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setDateRange(Ljava/util/Date;Ljava/util/Date;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1

    .line 307
    new-instance v0, Lcom/usebutton/sdk/action/ActionQuery$2;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/action/ActionQuery$2;-><init>(Lcom/usebutton/sdk/action/ActionQuery;Ljava/util/Date;)V

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/util/Do;->ifNotNull(Ljava/lang/Object;Ljava/lang/Runnable;)V

    .line 313
    new-instance p1, Lcom/usebutton/sdk/action/ActionQuery$3;

    invoke-direct {p1, p0, p2}, Lcom/usebutton/sdk/action/ActionQuery$3;-><init>(Lcom/usebutton/sdk/action/ActionQuery;Ljava/util/Date;)V

    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/util/Do;->ifNotNull(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public setEvent(Lcom/usebutton/sdk/context/Event;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1

    const-string v0, "event"

    .line 373
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setJourney(Lcom/usebutton/sdk/context/Journey;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1

    const-string v0, "journey"

    .line 362
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setSubjectLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p1    # Lcom/usebutton/sdk/context/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string/jumbo v0, "subject_location"

    .line 298
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public setURL(Landroid/net/Uri;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string/jumbo v0, "url"

    .line 384
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public setUserLocation(Lcom/usebutton/sdk/context/Location;)Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .param p1    # Lcom/usebutton/sdk/context/Location;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string/jumbo v0, "user_location"

    .line 286
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/action/ActionQuery;->setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V

    return-object p0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 201
    invoke-virtual {p0}, Lcom/usebutton/sdk/action/ActionQuery;->getData()Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
