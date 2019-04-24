.class Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;
.super Landroid/os/AsyncTask;
.source "OfflineDataStore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/offline/OfflineDataStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MultiDeleteFromDiskTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private dataCategory:Ljava/lang/Integer;

.field private dataStoreRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/OfflineDataStore;",
            ">;"
        }
    .end annotation
.end field

.field private entityKeysToDelete:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/offline/OfflineDataStore;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Ljava/util/Set;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/offline/OfflineDataStore;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    .line 918
    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 919
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    .line 920
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->entityKeysToDelete:Ljava/util/ArrayList;

    .line 921
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->entityKeysToDelete:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 922
    iput-object p4, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->dataCategory:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 911
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    .line 927
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/offline/OfflineDataStore;

    if-eqz p1, :cond_1

    .line 929
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->entityKeysToDelete:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 930
    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v3, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->dataCategory:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v1, v3}, Lcom/shopkick/app/offline/OfflineDataStore;->access$100(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 931
    invoke-static {p1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->access$700(Lcom/shopkick/app/offline/OfflineDataStore;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 933
    iget-object v2, p0, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-static {v2}, Lcom/shopkick/app/offline/OfflineDataStore;->access$300(Lcom/shopkick/app/offline/OfflineDataStore;)Landroid/support/v4/util/LruCache;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 911
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$MultiDeleteFromDiskTask;->onPostExecute(Ljava/lang/Void;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method
