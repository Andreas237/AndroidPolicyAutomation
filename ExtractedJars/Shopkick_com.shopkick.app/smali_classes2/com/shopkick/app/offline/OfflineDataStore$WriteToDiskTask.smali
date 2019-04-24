.class Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;
.super Landroid/os/AsyncTask;
.source "OfflineDataStore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/offline/OfflineDataStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WriteToDiskTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private dataStoreRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/offline/OfflineDataStore;",
            ">;"
        }
    .end annotation
.end field

.field private entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

.field final synthetic this$0:Lcom/shopkick/app/offline/OfflineDataStore;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V
    .locals 0

    .line 877
    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 878
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    .line 879
    iput-object p3, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;)Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;
    .locals 0

    .line 873
    iget-object p0, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    return-object p0
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 2

    .line 884
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/offline/OfflineDataStore;

    if-eqz p1, :cond_1

    .line 886
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-static {p1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->access$400(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 888
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->this$0:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-static {v0}, Lcom/shopkick/app/offline/OfflineDataStore;->access$300(Lcom/shopkick/app/offline/OfflineDataStore;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 890
    :cond_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    .line 892
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 873
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Ljava/lang/Boolean;)V
    .locals 1

    .line 897
    iget-object v0, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->dataStoreRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/offline/OfflineDataStore;

    if-eqz v0, :cond_1

    .line 899
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 900
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-static {v0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->access$500(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_0

    .line 902
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->entityToWrite:Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-static {v0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->access$600(Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 873
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore$WriteToDiskTask;->onPostExecute(Ljava/lang/Boolean;)V

    return-void
.end method
