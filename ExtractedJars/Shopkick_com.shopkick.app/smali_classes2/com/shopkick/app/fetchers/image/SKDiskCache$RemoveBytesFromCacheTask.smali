.class Lcom/shopkick/app/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;
.super Landroid/os/AsyncTask;
.source "SKDiskCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/fetchers/image/SKDiskCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RemoveBytesFromCacheTask"
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
.field private key:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/fetchers/image/SKDiskCache;Ljava/lang/String;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;->this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 250
    iput-object p2, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;->key:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 246
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Void;
    .locals 1

    .line 256
    iget-object p1, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;->this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    iget-object v0, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$RemoveBytesFromCacheTask;->key:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->access$200(Lcom/shopkick/app/fetchers/image/SKDiskCache;Ljava/lang/String;)Z

    const/4 p1, 0x0

    return-object p1
.end method
