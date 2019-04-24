.class Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;
.super Landroid/os/AsyncTask;
.source "OfflineDataStore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/offline/OfflineDataStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ReadCategoryFromDiskTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/ArrayList<",
        "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
        ">;>;"
    }
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;",
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

.field final synthetic this$0:Lcom/shopkick/app/offline/OfflineDataStore;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;I)V
    .locals 0

    .line 832
    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 833
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    .line 834
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 835
    iput p4, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->dataCategory:I

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 825
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->doInBackground([Ljava/lang/Void;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;"
        }
    .end annotation

    .line 840
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 841
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/offline/OfflineDataStore;

    if-eqz v0, :cond_2

    .line 843
    iget v1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->dataCategory:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeysForDataCategory(I)Ljava/util/ArrayList;

    move-result-object v1

    .line 844
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 845
    iget-object v3, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-static {v3}, Lcom/shopkick/app/offline/OfflineDataStore;->access$300(Lcom/shopkick/app/offline/OfflineDataStore;)Landroid/support/v4/util/LruCache;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    if-eqz v3, :cond_1

    .line 847
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 849
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    iget v4, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->dataCategory:I

    invoke-static {v3, v2, v4}, Lcom/shopkick/app/offline/OfflineDataStore;->access$100(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 850
    invoke-static {v0, v3}, Lcom/shopkick/app/offline/OfflineDataStore;->access$200(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 852
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 853
    iget-object v4, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-static {v4}, Lcom/shopkick/app/offline/OfflineDataStore;->access$300(Lcom/shopkick/app/offline/OfflineDataStore;)Landroid/support/v4/util/LruCache;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 825
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->onPostExecute(Ljava/util/ArrayList;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;)V"
        }
    .end annotation

    .line 863
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;

    if-eqz v0, :cond_0

    .line 865
    iget v1, p0, Lcom/shopkick/app/offline/OfflineDataStore$ReadCategoryFromDiskTask;->dataCategory:I

    invoke-interface {v0, v1, p1}, Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;->onCategoryReadFromDisk(ILjava/util/ArrayList;)V

    :cond_0
    return-void
.end method
