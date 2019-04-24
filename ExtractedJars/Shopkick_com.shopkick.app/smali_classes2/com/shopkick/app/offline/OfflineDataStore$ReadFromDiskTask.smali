.class Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;
.super Landroid/os/AsyncTask;
.source "OfflineDataStore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/offline/OfflineDataStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReadFromDiskTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
        ">;"
    }
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;",
            ">;"
        }
    .end annotation
.end field

.field private dataCategory:I

.field private dataStoreRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/OfflineDataStore;",
            ">;"
        }
    .end annotation
.end field

.field private entityKey:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/offline/OfflineDataStore;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;Ljava/lang/String;I)V
    .locals 0

    .line 782
    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 783
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    .line 784
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 785
    iput-object p4, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->entityKey:Ljava/lang/String;

    .line 786
    iput p5, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataCategory:I

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 3

    .line 791
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/offline/OfflineDataStore;

    if-eqz p1, :cond_1

    .line 793
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->entityKey:Ljava/lang/String;

    iget v2, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataCategory:I

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->access$100(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 794
    invoke-static {p1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->access$200(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 796
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-static {v0}, Lcom/shopkick/app/offline/OfflineDataStore;->access$300(Lcom/shopkick/app/offline/OfflineDataStore;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 773
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->doInBackground([Ljava/lang/Void;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 3

    .line 805
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/offline/OfflineDataStore;

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 808
    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->entityKey:Ljava/lang/String;

    iget v2, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataCategory:I

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->didFailReadFromDisk(Ljava/lang/String;I)V

    .line 811
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 814
    invoke-interface {v0, p1}, Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;->onOfflineDataEntityReadFromDisk(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_0

    .line 816
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->entityKey:Ljava/lang/String;

    iget v1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->dataCategory:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/shopkick/app/offline/IReadOfflineDataEntityFromDiskCallback;->onOfflineDataEntityReadFailed(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 773
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadFromDiskTask;->onPostExecute(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    return-void
.end method
