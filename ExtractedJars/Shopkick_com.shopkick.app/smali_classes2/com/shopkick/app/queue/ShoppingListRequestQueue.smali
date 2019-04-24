.class public Lcom/shopkick/app/queue/ShoppingListRequestQueue;
.super Lcom/shopkick/app/queue/SKPersistentQueue;
.source "ShoppingListRequestQueue.java"


# static fields
.field private static final FILENAME_PREFIX:Ljava/lang/String; = "shopping_list_"

.field private static final FILENAME_SEPARATOR:Ljava/lang/String; = "_"

.field private static final FILENAME_SURFIX:Ljava/lang/String; = "_request_file.dat"

.field private static final UUID_PREFIX:Ljava/lang/String; = "sl_uuid"

.field private static final UUID_SEPARATOR:Ljava/lang/String; = "|"


# instance fields
.field private MAX_MODIFICATION_COUNT_AT_ONE_REQUEST:I

.field private idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

.field private requestObjects:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;",
            ">;"
        }
    .end annotation
.end field

.field private shoppingListId:Ljava/lang/String;

.field private shoppingListVersion:Ljava/lang/String;

.field private tempToCanonicalMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "shopping_list_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_request_file.dat"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V

    const/16 p1, 0x64

    .line 22
    iput p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->MAX_MODIFICATION_COUNT_AT_ONE_REQUEST:I

    .line 34
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 45
    iput-object p2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->userId:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->shoppingListId:Ljava/lang/String;

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    .line 48
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    .line 50
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    return-void
.end method

.method private convertStringToShoppingListModification(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;
    .locals 1

    const/4 v0, 0x0

    .line 234
    :try_start_0
    invoke-static {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private createUuid()Ljava/lang/String;
    .locals 3

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "sl_uuid|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isQueueExists(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 54
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "queued_directory"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 57
    :cond_0
    new-instance p0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "shopping_list_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_request_file.dat"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method private declared-synchronized writeQueueToFile(Z)V
    .locals 6

    monitor-enter p0

    if-nez p1, :cond_4

    .line 249
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    move v1, p1

    move p1, v0

    .line 250
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_3

    .line 251
    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 254
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    move v1, v4

    goto :goto_1

    .line 259
    :cond_0
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v3, :cond_1

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 260
    iget-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v3, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iput-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;->parentShoppingListEntryId:Ljava/lang/String;

    move v1, v4

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    if-eqz v4, :cond_2

    .line 267
    iget-object v3, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    move p1, v1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    .line 273
    invoke-super {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeQueueToFile()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    monitor-exit p0

    throw p1

    .line 275
    :cond_5
    :goto_4
    monitor-exit p0

    return-void
.end method


# virtual methods
.method public declared-synchronized addToQueue(Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;)V
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    .line 82
    monitor-exit p0

    return-void

    .line 84
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->createUuid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->uuid:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->addToQueue(Ljava/lang/Object;)V

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public clear()V
    .locals 1

    .line 91
    invoke-super {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->clear()V

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public declared-synchronized getCanonicalRequest()Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;
    .locals 5

    monitor-enter p0

    .line 139
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    .line 142
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->writeQueueToFile()V

    .line 145
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;-><init>()V

    .line 146
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->shoppingListId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->shoppingListId:Ljava/lang/String;

    .line 147
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->shoppingListVersion:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->shoppingListVersion:Ljava/lang/String;

    .line 148
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    .line 154
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 155
    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 156
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-nez v4, :cond_3

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    if-nez v4, :cond_3

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    if-nez v4, :cond_3

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 158
    invoke-static {v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isCanonicalEntryId(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 164
    :cond_2
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-static {v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isCanonicalEntryId(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 165
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 166
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 159
    :cond_3
    :goto_0
    iget-object v4, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 161
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 169
    :cond_4
    :goto_1
    iget-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget v4, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->MAX_MODIFICATION_COUNT_AT_ONE_REQUEST:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-lt v3, v4, :cond_1

    .line 172
    :cond_5
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized maybeRemoveInvalidModifications()Z
    .locals 5

    monitor-enter p0

    .line 176
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 177
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 179
    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 180
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->entryToAdd:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListEntry;

    if-eqz v4, :cond_1

    .line 182
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 183
    :cond_1
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->deleteModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListDeleteModification;

    if-nez v4, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->nameModification:Lcom/shopkick/app/fetchers/api/skapi/ShoppingListNameModification;

    if-nez v4, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 184
    invoke-static {v4}, Lcom/shopkick/app/shoppinglists/ShoppingListDataSource;->isCanonicalEntryId(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    .line 185
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 188
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 191
    :cond_2
    invoke-virtual {p0, v1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeModifications(Ljava/util/List;)V

    .line 192
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 v0, v0, 0x1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected readQueueFromFile()V
    .locals 3

    .line 63
    invoke-super {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->readQueueFromFile()V

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    .line 68
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    .line 74
    invoke-static {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 76
    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public declared-synchronized removeModifications(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    .line 202
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 203
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 204
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 205
    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->uuid:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v3, 0x1

    sub-int/2addr p1, v3

    :goto_1
    if-ltz p1, :cond_2

    .line 209
    iget-object v4, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->uuid:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 210
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    .line 214
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 215
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 216
    iget-object v1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v0, v3

    goto :goto_2

    .line 220
    :cond_3
    invoke-direct {p0, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->writeQueueToFile(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 221
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public removeRequest(Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;)V
    .locals 0

    .line 196
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ModifyShoppingListRequest;->modifications:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->removeModifications(Ljava/util/List;)V

    return-void
.end method

.method public declared-synchronized removeRequestsWithEntryId(Ljava/lang/String;)V
    .locals 5

    monitor-enter p0

    const/4 v0, 0x0

    .line 121
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 123
    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;

    .line 125
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    if-eqz v4, :cond_0

    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->shoppingListEntryId:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 126
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v3}, Lcom/shopkick/app/fetchers/api/skapi/ShoppingListModification;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 127
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_0

    .line 133
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->requestObjects:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 135
    invoke-direct {p0, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->writeQueueToFile(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public updateEntryId(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->tempToCanonicalMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    invoke-virtual {p0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->writeQueueToFile()V

    return-void
.end method

.method public updateShoppingListId(Ljava/lang/String;)V
    .locals 3

    .line 96
    iput-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->shoppingListId:Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 101
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "shopping_list_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->userId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_request_file.dat"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->fileName:Ljava/lang/String;

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 104
    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 105
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method public updateShoppingListVersion(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->shoppingListVersion:Ljava/lang/String;

    return-void
.end method

.method protected writeQueueToFile()V
    .locals 1

    const/4 v0, 0x0

    .line 242
    invoke-direct {p0, v0}, Lcom/shopkick/app/queue/ShoppingListRequestQueue;->writeQueueToFile(Z)V

    return-void
.end method
