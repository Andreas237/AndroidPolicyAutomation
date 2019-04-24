.class Lcom/shopkick/app/fetchers/image/SKDiskCache$InitDiskCacheTask;
.super Landroid/os/AsyncTask;
.source "SKDiskCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/fetchers/image/SKDiskCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "InitDiskCacheTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/io/File;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;


# direct methods
.method constructor <init>(Lcom/shopkick/app/fetchers/image/SKDiskCache;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$InitDiskCacheTask;->this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 180
    check-cast p1, [Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/image/SKDiskCache$InitDiskCacheTask;->doInBackground([Ljava/io/File;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/io/File;)Ljava/lang/Void;
    .locals 4

    const/4 v0, 0x0

    .line 184
    :try_start_0
    aget-object p1, p1, v0

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$InitDiskCacheTask;->this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/image/SKDiskCache$InitDiskCacheTask;->this$0:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    invoke-static {v1}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->access$100(Lcom/shopkick/app/fetchers/image/SKDiskCache;)J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {p1, v3, v3, v1, v2}, Lcom/jakewharton/disklrucache/DiskLruCache;->open(Ljava/io/File;IIJ)Lcom/jakewharton/disklrucache/DiskLruCache;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->access$002(Lcom/shopkick/app/fetchers/image/SKDiskCache;Lcom/jakewharton/disklrucache/DiskLruCache;)Lcom/jakewharton/disklrucache/DiskLruCache;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 189
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
