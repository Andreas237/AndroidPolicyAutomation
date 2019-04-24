.class public abstract Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;
.super Ljava/lang/Object;
.source "AbstractTimeLimitPersistentMap.java"

# interfaces
.implements Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field protected static final SEPARATOR:Ljava/lang/String; = "--"


# instance fields
.field private persistedMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->getQueueFileName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2, p0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;)V

    iput-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    :cond_0
    const-string p1, "UserAccountIdChangedEvent"

    const/4 p2, 0x1

    .line 40
    invoke-virtual {p3, p0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method private pruneMap()V
    .locals 7

    .line 190
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 191
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->getTimestampToPrune()J

    move-result-wide v1

    .line 193
    iget-object v3, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 194
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p0, v5}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->getTimestampFromEntry(Ljava/lang/String;)J

    move-result-wide v5

    cmp-long v5, v5, v1

    if-gez v5, :cond_0

    .line 195
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 198
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 199
    iget-object v2, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    return-void
.end method

.method private readMap()V
    .locals 3

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    if-nez v0, :cond_0

    return-void

    .line 169
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->popString()Ljava/lang/String;

    move-result-object v0

    .line 171
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 172
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    return-void

    .line 177
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/ObjectInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-static {v0}, Lorg/bouncycastle/util/encoders/Base64;->decode(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 178
    invoke-virtual {v1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 183
    :catch_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    .line 186
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->writeMap()V

    return-void
.end method


# virtual methods
.method protected createEntry(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected destroyQueue()V
    .locals 1
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->destroyQueue()V

    :cond_0
    return-void
.end method

.method public getKeys()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 81
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getMapSize()I
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method protected abstract getQueueFileName()Ljava/lang/String;
.end method

.method protected getTimestampFromEntry(Ljava/lang/String;)J
    .locals 2

    const-string v0, "--"

    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p1}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method protected abstract getTimestampToPrune()J
.end method

.method public getValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 86
    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->isKeyAvailable(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->getValueFromEntry(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected getValueFromEntry(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "--"

    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 60
    array-length v0, p1

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    aget-object p1, p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected isKeyAvailable(Ljava/lang/String;)Z
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->getTimestampFromEntry(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->getTimestampToPrune()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "UserAccountIdChangedEvent"

    .line 218
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 219
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->destroyQueue()V

    :cond_0
    return-void
.end method

.method public putKey(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 72
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->putKeyValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public putKeyValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->createEntry(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->writeMap()V

    return-void
.end method

.method public putKeyValues(Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 113
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 114
    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 115
    iget-object v1, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->createEntry(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->writeMap()V

    :cond_2
    return-void
.end method

.method public putKeys(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 99
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 100
    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 107
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->writeMap()V

    :cond_2
    return-void
.end method

.method public queueUpdatedFromDisk()V
    .locals 0

    .line 209
    invoke-direct {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->readMap()V

    return-void
.end method

.method public removeKey(Ljava/lang/String;)V
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 91
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->writeMap()V

    :cond_0
    return-void
.end method

.method public removeKeys(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 127
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 128
    iget-object v2, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 134
    invoke-virtual {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->writeMap()V

    :cond_2
    return-void
.end method

.method protected writeMap()V
    .locals 4

    .line 143
    invoke-direct {p0}, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->pruneMap()V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    if-nez v0, :cond_0

    return-void

    .line 146
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->popString()Ljava/lang/String;

    move-result-object v0

    .line 148
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 149
    new-instance v2, Ljava/io/ObjectOutputStream;

    invoke-direct {v2, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 150
    iget-object v3, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->persistedMap:Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 151
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->flush()V

    .line 152
    invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V

    .line 153
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([B)V

    .line 154
    iget-object v1, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->addString(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    if-eqz v0, :cond_1

    .line 161
    iget-object v1, p0, Lcom/shopkick/app/util/AbstractTimeLimitPersistentMap;->queue:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->addString(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
