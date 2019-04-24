.class public final Lokhttp3/internal/DiskLruCache$Editor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/DiskLruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Editor"
.end annotation


# instance fields
.field private committed:Z

.field private final entry:Lokhttp3/internal/DiskLruCache$Entry;

.field private hasErrors:Z

.field final synthetic this$0:Lokhttp3/internal/DiskLruCache;

.field private final written:[Z


# direct methods
.method private constructor <init>(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;)V
    .locals 1

    .line 837
    iput-object p1, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 838
    iput-object p2, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    .line 839
    invoke-static {p2}, Lokhttp3/internal/DiskLruCache$Entry;->access$900(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lokhttp3/internal/DiskLruCache;->access$2400(Lokhttp3/internal/DiskLruCache;)I

    move-result v0

    new-array v0, v0, [Z

    :goto_0
    iput-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->written:[Z

    .line 840
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;Lokhttp3/internal/DiskLruCache$1;)V
    .locals 0

    .line 831
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/DiskLruCache$Editor;-><init>(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;)V

    return-void
.end method

.method static synthetic access$1800(Lokhttp3/internal/DiskLruCache$Editor;)Lokhttp3/internal/DiskLruCache$Entry;
    .locals 1

    .line 831
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    return-object v0
.end method

.method static synthetic access$1900(Lokhttp3/internal/DiskLruCache$Editor;)[Z
    .locals 1

    .line 831
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->written:[Z

    return-object v0
.end method

.method static synthetic access$2002(Lokhttp3/internal/DiskLruCache$Editor;Z)Z
    .locals 0

    .line 831
    iput-boolean p1, p0, Lokhttp3/internal/DiskLruCache$Editor;->hasErrors:Z

    return p1
.end method


# virtual methods
.method public abort()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 913
    iget-object v2, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 914
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lokhttp3/internal/DiskLruCache;->access$2700(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Editor;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 915
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 916
    :goto_0
    return-void
.end method

.method public abortUnlessCommitted()V
    .locals 5

    .line 919
    iget-object v2, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 920
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->committed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 922
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lokhttp3/internal/DiskLruCache;->access$2700(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Editor;Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 924
    goto :goto_0

    .line 923
    :catch_0
    move-exception v3

    .line 926
    :cond_0
    :goto_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 927
    :goto_1
    return-void
.end method

.method public commit()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 897
    iget-object v2, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 898
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->hasErrors:Z

    if-eqz v0, :cond_0

    .line 899
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lokhttp3/internal/DiskLruCache;->access$2700(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Editor;Z)V

    .line 900
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v0, v1}, Lokhttp3/internal/DiskLruCache;->access$2800(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Entry;)Z

    goto :goto_0

    .line 902
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lokhttp3/internal/DiskLruCache;->access$2700(Lokhttp3/internal/DiskLruCache;Lokhttp3/internal/DiskLruCache$Editor;Z)V

    .line 904
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->committed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 905
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 906
    :goto_1
    return-void
.end method

.method public newSink(I)Lokio/Sink;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 868
    iget-object v2, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 869
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 870
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 872
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$900(Lokhttp3/internal/DiskLruCache$Entry;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 873
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->written:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, p1

    .line 875
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1500(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v0

    aget-object v3, v0, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 878
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$2500(Lokhttp3/internal/DiskLruCache;)Lokhttp3/internal/io/FileSystem;

    move-result-object v0

    invoke-interface {v0, v3}, Lokhttp3/internal/io/FileSystem;->sink(Ljava/io/File;)Lokio/Sink;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 881
    goto :goto_0

    .line 879
    :catch_0
    move-exception v5

    .line 880
    :try_start_2
    invoke-static {}, Lokhttp3/internal/DiskLruCache;->access$2600()Lokio/Sink;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 882
    :goto_0
    :try_start_3
    new-instance v0, Lokhttp3/internal/DiskLruCache$Editor$1;

    invoke-direct {v0, p0, v4}, Lokhttp3/internal/DiskLruCache$Editor$1;-><init>(Lokhttp3/internal/DiskLruCache$Editor;Lokio/Sink;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v2

    return-object v0

    .line 889
    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6
.end method

.method public newSource(I)Lokio/Source;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 847
    iget-object v2, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    monitor-enter v2

    .line 848
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$1000(Lokhttp3/internal/DiskLruCache$Entry;)Lokhttp3/internal/DiskLruCache$Editor;

    move-result-object v0

    if-eq v0, p0, :cond_0

    .line 849
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 851
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache$Entry;->access$900(Lokhttp3/internal/DiskLruCache$Entry;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 852
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 855
    :cond_1
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/DiskLruCache$Editor;->this$0:Lokhttp3/internal/DiskLruCache;

    invoke-static {v0}, Lokhttp3/internal/DiskLruCache;->access$2500(Lokhttp3/internal/DiskLruCache;)Lokhttp3/internal/io/FileSystem;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/DiskLruCache$Editor;->entry:Lokhttp3/internal/DiskLruCache$Entry;

    invoke-static {v1}, Lokhttp3/internal/DiskLruCache$Entry;->access$1400(Lokhttp3/internal/DiskLruCache$Entry;)[Ljava/io/File;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-interface {v0, v1}, Lokhttp3/internal/io/FileSystem;->source(Ljava/io/File;)Lokio/Source;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v2

    return-object v0

    .line 856
    :catch_0
    move-exception v3

    .line 857
    monitor-exit v2

    const/4 v0, 0x0

    return-object v0

    .line 859
    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method
