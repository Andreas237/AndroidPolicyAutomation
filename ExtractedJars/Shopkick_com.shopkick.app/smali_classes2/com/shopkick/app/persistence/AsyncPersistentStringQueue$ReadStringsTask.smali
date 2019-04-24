.class Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;
.super Landroid/os/AsyncTask;
.source "AsyncPersistentStringQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReadStringsTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/util/Queue<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/util/Queue<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$1;)V
    .locals 0

    .line 193
    invoke-direct {p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;-><init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 193
    invoke-virtual {p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->doInBackground([Ljava/lang/Object;)Ljava/util/Queue;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/util/Queue;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 196
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 198
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$200(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/io/File;

    move-result-object v0

    .line 199
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 202
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v0

    .line 203
    invoke-interface {p1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 208
    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 210
    :catch_1
    const-class v0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "could not open and read from request queue file"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 193
    check-cast p1, Ljava/util/Queue;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->onPostExecute(Ljava/util/Queue;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/Queue;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {v0}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$500(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/util/Queue;

    move-result-object v0

    .line 218
    iget-object v1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1, v2}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$502(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Ljava/util/Queue;)Ljava/util/Queue;

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$500(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/util/Queue;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Queue;->addAll(Ljava/util/Collection;)Z

    .line 221
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$300(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)V

    .line 223
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$ReadStringsTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$600(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;

    if-eqz p1, :cond_0

    .line 225
    invoke-interface {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallback;->queueUpdatedFromDisk()V

    :cond_0
    return-void
.end method
