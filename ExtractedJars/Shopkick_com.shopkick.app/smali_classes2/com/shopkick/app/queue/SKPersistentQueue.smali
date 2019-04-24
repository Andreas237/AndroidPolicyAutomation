.class public Lcom/shopkick/app/queue/SKPersistentQueue;
.super Ljava/lang/Object;
.source "SKPersistentQueue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;
    }
.end annotation


# static fields
.field public static final DATA_VERSION_NUMBER:I = 0x1

.field protected static final QUEUED_DIRECTORY:Ljava/lang/String; = "queued_directory"

.field public static final REQUEST_QUEUE_FILENAME:Ljava/lang/String; = "queued_requests_file.dat"

.field public static final RESPONSE_QUEUE_FILENAME:Ljava/lang/String; = "queued_responses_file.dat"


# instance fields
.field protected apiPersistentQueue:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "*>;"
        }
    .end annotation
.end field

.field protected context:Landroid/content/Context;

.field protected fileName:Ljava/lang/String;

.field private fileVersion:I

.field protected queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->context:Landroid/content/Context;

    .line 41
    iput-object p2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    .line 43
    sget-object p1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne p3, p1, :cond_0

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    goto :goto_0

    .line 45
    :cond_0
    sget-object p1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne p3, p1, :cond_1

    .line 46
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    .line 48
    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->readQueueFromFile()V

    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p0, p2}, Lcom/shopkick/app/queue/SKPersistentQueue;->addHeader(Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method protected addHeader(Ljava/lang/String;)V
    .locals 3

    .line 210
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    .line 211
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 212
    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 213
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 215
    :catch_0
    const-class p1, Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "could not open and write to request queue file"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public addToQueue(Ljava/lang/Object;)V
    .locals 3

    .line 110
    instance-of v0, p1, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v1, p1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-nez v1, :cond_0

    return-void

    .line 113
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v2, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne v1, v2, :cond_1

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeToFile(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 116
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne v0, v1, :cond_2

    instance-of v0, p1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    if-eqz v0, :cond_2

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeToFile(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    check-cast p1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public clear()V
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->removeQueue()V

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->addHeader(Ljava/lang/String;)V

    return-void
.end method

.method public containsString(Ljava/lang/String;)Z
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne v0, v1, :cond_0

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public destroy()V
    .locals 0

    .line 57
    invoke-virtual {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeQueueToFile()V

    return-void
.end method

.method public getObjects()Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "*>;"
        }
    .end annotation

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne v0, v1, :cond_1

    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 156
    iget-object v1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 157
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne v0, v1, :cond_3

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    iget-object v1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 163
    check-cast v2, Lcom/shopkick/app/queue/ApiObjectWrapper;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method protected getQueueFile(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 240
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "queued_directory"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 241
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 242
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 244
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method public hasQueuedObjects()Z
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected readQueueFromFile()V
    .locals 4

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 74
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 75
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileVersion:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 78
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v0

    .line 79
    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v3, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne v2, v3, :cond_1

    .line 80
    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 81
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v3, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    if-ne v2, v3, :cond_0

    .line 83
    :try_start_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p0, v2}, Lcom/shopkick/app/queue/SKPersistentQueue;->toApiObjectWrapper(Lorg/json/JSONObject;)Lcom/shopkick/app/queue/ApiObjectWrapper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 86
    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_0

    .line 95
    :catch_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 97
    :catch_2
    const-class v0, Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "could not open and read from request queue file"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method

.method public removeObjectsInRange(II)V
    .locals 2

    .line 189
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, p2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 190
    iget-object p1, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 192
    invoke-virtual {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeQueueToFile()V

    return-void
.end method

.method public removeQueue()V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method public removeRequests(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/queue/ApiObjectWrapper;",
            ">;)V"
        }
    .end annotation

    .line 178
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 179
    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 184
    invoke-virtual {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeQueueToFile()V

    :cond_2
    return-void
.end method

.method public removeString(Ljava/lang/String;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 172
    invoke-virtual {p0}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeQueueToFile()V

    :cond_0
    return-void
.end method

.method public size()I
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method protected toApiObjectWrapper(Lorg/json/JSONObject;)Lcom/shopkick/app/queue/ApiObjectWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "class_name"

    .line 220
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 223
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/queue/ApiObjectWrapper;

    .line 226
    invoke-virtual {v0, p1}, Lcom/shopkick/app/queue/ApiObjectWrapper;->populateUsingJSONObject(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 233
    invoke-virtual {p1}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 231
    invoke-virtual {p1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception p1

    .line 229
    invoke-virtual {p1}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected writeQueueToFile()V
    .locals 4

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->fileName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".tmp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 144
    invoke-virtual {p0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->addHeader(Ljava/lang/String;)V

    .line 145
    iget-object v2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->apiPersistentQueue:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 146
    invoke-virtual {p0, v3, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->writeToFile(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 148
    :cond_0
    invoke-virtual {p0, v1}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 149
    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 150
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_1
    return-void
.end method

.method protected writeToFile(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    .line 125
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/shopkick/app/queue/SKPersistentQueue;->getQueueFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    .line 126
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 127
    iget-object p2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_STRING:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne p2, v1, :cond_0

    .line 128
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_0

    .line 129
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/queue/SKPersistentQueue;->queueType:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    sget-object v1, Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;->QUEUE_TYPE_API_WRAPPER_OBJECT:Lcom/shopkick/app/queue/SKPersistentQueue$PersistentQueueType;

    if-ne p2, v1, :cond_1

    .line 130
    check-cast p1, Lcom/shopkick/app/queue/ApiObjectWrapper;

    invoke-virtual {p1}, Lcom/shopkick/app/queue/ApiObjectWrapper;->toJSONObject()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 131
    invoke-virtual {v0, p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 133
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 137
    :catch_0
    const-class p1, Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "could not parse apiObject json"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 135
    :catch_1
    const-class p1, Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "could not open and write to request queue file"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method
