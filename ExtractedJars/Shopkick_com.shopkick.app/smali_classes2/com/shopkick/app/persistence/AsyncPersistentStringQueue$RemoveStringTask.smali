.class Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;
.super Landroid/os/AsyncTask;
.source "AsyncPersistentStringQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RemoveStringTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private stringsToWrite:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;Ljava/util/Queue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 158
    iput-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 159
    iput-object p2, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->stringsToWrite:Ljava/util/Queue;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 154
    invoke-virtual {p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
    .locals 3

    .line 165
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$200(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/io/File;

    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 168
    new-instance v0, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->stringsToWrite:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 170
    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto :goto_0

    .line 172
    :cond_0
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 174
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 154
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 0

    .line 182
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$300(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)V

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$400(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$400(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallbackForTest;

    if-eqz p1, :cond_0

    .line 187
    iget-object p1, p0, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$RemoveStringTask;->this$0:Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;

    invoke-static {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;->access$400(Lcom/shopkick/app/persistence/AsyncPersistentStringQueue;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallbackForTest;

    invoke-interface {p1}, Lcom/shopkick/app/persistence/AsyncPersistentStringQueue$IAsyncPersistentQueueCallbackForTest;->stringRemoved()V

    :cond_0
    return-void
.end method
