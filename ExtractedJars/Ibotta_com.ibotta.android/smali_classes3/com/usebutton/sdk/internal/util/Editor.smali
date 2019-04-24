.class public final Lcom/usebutton/sdk/internal/util/Editor;
.super Ljava/lang/Object;
.source "Editor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;
    }
.end annotation


# instance fields
.field private final cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

.field protected final entry:Lcom/usebutton/sdk/internal/util/Entry;

.field private hasErrors:Z


# direct methods
.method protected constructor <init>(Lcom/usebutton/sdk/internal/util/Entry;Lcom/usebutton/sdk/internal/util/DiskLruCache;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    .line 38
    iput-object p2, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    return-void
.end method

.method static synthetic access$102(Lcom/usebutton/sdk/internal/util/Editor;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/util/Editor;->hasErrors:Z

    return p1
.end method


# virtual methods
.method public abort()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->completeEdit(Lcom/usebutton/sdk/internal/util/Editor;Z)V

    return-void
.end method

.method public commit()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 100
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->hasErrors:Z

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->completeEdit(Lcom/usebutton/sdk/internal/util/Editor;Z)V

    .line 102
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/util/Entry;->key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->remove(Ljava/lang/String;)Z

    goto :goto_0

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->completeEdit(Lcom/usebutton/sdk/internal/util/Editor;Z)V

    :goto_0
    return-void
.end method

.method public getString(I)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 62
    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/Editor;->newInputStream(I)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 63
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->inputStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public newInputStream(I)Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    if-ne v1, p0, :cond_1

    .line 50
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    iget-boolean v1, v1, Lcom/usebutton/sdk/internal/util/Entry;->readable:Z

    if-nez v1, :cond_0

    const/4 p1, 0x0

    .line 51
    monitor-exit v0

    return-object p1

    .line 53
    :cond_0
    new-instance v1, Ljava/io/FileInputStream;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    invoke-virtual {v2, p1}, Lcom/usebutton/sdk/internal/util/Entry;->getCleanFile(I)Ljava/io/File;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    monitor-exit v0

    return-object v1

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 54
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public newOutputStream(I)Ljava/io/OutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/Editor;->cache:Lcom/usebutton/sdk/internal/util/DiskLruCache;

    monitor-enter v0

    .line 75
    :try_start_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/util/Entry;->currentEditor:Lcom/usebutton/sdk/internal/util/Editor;

    if-ne v1, p0, :cond_0

    .line 78
    new-instance v1, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/util/Editor;->entry:Lcom/usebutton/sdk/internal/util/Entry;

    invoke-virtual {v3, p1}, Lcom/usebutton/sdk/internal/util/Entry;->getDirtyFile(I)Ljava/io/File;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/4 p1, 0x0

    invoke-direct {v1, p0, v2, p1}, Lcom/usebutton/sdk/internal/util/Editor$FaultHidingOutputStream;-><init>(Lcom/usebutton/sdk/internal/util/Editor;Ljava/io/OutputStream;Lcom/usebutton/sdk/internal/util/Editor$1;)V

    monitor-exit v0

    return-object v1

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 79
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public set(ILjava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 88
    :try_start_0
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/util/Editor;->newOutputStream(I)Ljava/io/OutputStream;

    move-result-object p1

    sget-object v2, Lcom/usebutton/sdk/internal/util/DiskLruCache;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    :try_start_1
    invoke-virtual {v1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v0, v1

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/DiskLruCache;->closeQuietly(Ljava/io/Closeable;)V

    throw p1
.end method
