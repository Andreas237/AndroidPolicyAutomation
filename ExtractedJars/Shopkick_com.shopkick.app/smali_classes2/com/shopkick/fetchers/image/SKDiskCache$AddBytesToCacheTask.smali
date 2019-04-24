.class Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;
.super Landroid/os/AsyncTask;
.source "SKDiskCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/image/SKDiskCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AddBytesToCacheTask"
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
.field private bytes:[B

.field private key:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/fetchers/image/SKDiskCache;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/image/SKDiskCache;Ljava/lang/String;[B)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->this$0:Lcom/shopkick/fetchers/image/SKDiskCache;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 204
    iput-object p2, p0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->key:Ljava/lang/String;

    .line 205
    iput-object p3, p0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->bytes:[B

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 199
    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
    .locals 2

    .line 211
    iget-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->this$0:Lcom/shopkick/fetchers/image/SKDiskCache;

    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->key:Ljava/lang/String;

    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$AddBytesToCacheTask;->bytes:[B

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/fetchers/image/SKDiskCache;->addBytesToCacheInternal(Ljava/lang/String;[B)V

    const/4 p1, 0x0

    return-object p1
.end method
