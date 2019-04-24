.class public abstract Lorg/apache/commons/io/DirectoryWalker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/DirectoryWalker$CancelException;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final depthLimit:I

.field private final filter:Ljava/io/FileFilter;


# direct methods
.method protected constructor <init>()V
    .locals 2

    .line 266
    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/io/DirectoryWalker;-><init>(Ljava/io/FileFilter;I)V

    .line 267
    return-void
.end method

.method protected constructor <init>(Ljava/io/FileFilter;I)V
    .locals 0

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 282
    iput-object p1, p0, Lorg/apache/commons/io/DirectoryWalker;->filter:Ljava/io/FileFilter;

    .line 283
    iput p2, p0, Lorg/apache/commons/io/DirectoryWalker;->depthLimit:I

    .line 284
    return-void
.end method

.method protected constructor <init>(Lorg/apache/commons/io/filefilter/IOFileFilter;Lorg/apache/commons/io/filefilter/IOFileFilter;I)V
    .locals 2

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 301
    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 302
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/io/DirectoryWalker;->filter:Ljava/io/FileFilter;

    goto :goto_2

    .line 304
    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lorg/apache/commons/io/filefilter/TrueFileFilter;->TRUE:Lorg/apache/commons/io/filefilter/IOFileFilter;

    .line 305
    :goto_0
    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    sget-object p2, Lorg/apache/commons/io/filefilter/TrueFileFilter;->TRUE:Lorg/apache/commons/io/filefilter/IOFileFilter;

    .line 306
    :goto_1
    invoke-static {p1}, Lorg/apache/commons/io/filefilter/FileFilterUtils;->makeDirectoryOnly(Lorg/apache/commons/io/filefilter/IOFileFilter;)Lorg/apache/commons/io/filefilter/IOFileFilter;

    move-result-object p1

    .line 307
    invoke-static {p2}, Lorg/apache/commons/io/filefilter/FileFilterUtils;->makeFileOnly(Lorg/apache/commons/io/filefilter/IOFileFilter;)Lorg/apache/commons/io/filefilter/IOFileFilter;

    move-result-object p2

    .line 308
    const/4 v0, 0x2

    new-array v0, v0, [Lorg/apache/commons/io/filefilter/IOFileFilter;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    invoke-static {v0}, Lorg/apache/commons/io/filefilter/FileFilterUtils;->or([Lorg/apache/commons/io/filefilter/IOFileFilter;)Lorg/apache/commons/io/filefilter/IOFileFilter;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/DirectoryWalker;->filter:Ljava/io/FileFilter;

    .line 310
    :goto_2
    iput p3, p0, Lorg/apache/commons/io/DirectoryWalker;->depthLimit:I

    .line 311
    return-void
.end method

.method private walk(Ljava/io/File;ILjava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 351
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->checkIfCancelled(Ljava/io/File;ILjava/util/Collection;)V

    .line 352
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->handleDirectory(Ljava/io/File;ILjava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 353
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->handleDirectoryStart(Ljava/io/File;ILjava/util/Collection;)V

    .line 354
    add-int/lit8 v1, p2, 0x1

    .line 355
    iget v0, p0, Lorg/apache/commons/io/DirectoryWalker;->depthLimit:I

    if-ltz v0, :cond_0

    iget v0, p0, Lorg/apache/commons/io/DirectoryWalker;->depthLimit:I

    if-gt v1, v0, :cond_4

    .line 356
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->checkIfCancelled(Ljava/io/File;ILjava/util/Collection;)V

    .line 357
    iget-object v0, p0, Lorg/apache/commons/io/DirectoryWalker;->filter:Ljava/io/FileFilter;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lorg/apache/commons/io/DirectoryWalker;->filter:Ljava/io/FileFilter;

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v2

    .line 358
    :goto_0
    invoke-virtual {p0, p1, p2, v2}, Lorg/apache/commons/io/DirectoryWalker;->filterDirectoryContents(Ljava/io/File;I[Ljava/io/File;)[Ljava/io/File;

    move-result-object v2

    .line 359
    if-nez v2, :cond_2

    .line 360
    invoke-virtual {p0, p1, v1, p3}, Lorg/apache/commons/io/DirectoryWalker;->handleRestricted(Ljava/io/File;ILjava/util/Collection;)V

    goto :goto_3

    .line 362
    :cond_2
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    aget-object v6, v3, v5

    .line 363
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 364
    invoke-direct {p0, v6, v1, p3}, Lorg/apache/commons/io/DirectoryWalker;->walk(Ljava/io/File;ILjava/util/Collection;)V

    goto :goto_2

    .line 366
    :cond_3
    invoke-virtual {p0, v6, v1, p3}, Lorg/apache/commons/io/DirectoryWalker;->checkIfCancelled(Ljava/io/File;ILjava/util/Collection;)V

    .line 367
    invoke-virtual {p0, v6, v1, p3}, Lorg/apache/commons/io/DirectoryWalker;->handleFile(Ljava/io/File;ILjava/util/Collection;)V

    .line 368
    invoke-virtual {p0, v6, v1, p3}, Lorg/apache/commons/io/DirectoryWalker;->checkIfCancelled(Ljava/io/File;ILjava/util/Collection;)V

    .line 362
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 373
    :cond_4
    :goto_3
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->handleDirectoryEnd(Ljava/io/File;ILjava/util/Collection;)V

    .line 375
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->checkIfCancelled(Ljava/io/File;ILjava/util/Collection;)V

    .line 376
    return-void
.end method


# virtual methods
.method protected final checkIfCancelled(Ljava/io/File;ILjava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 395
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/commons/io/DirectoryWalker;->handleIsCancelled(Ljava/io/File;ILjava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 396
    new-instance v0, Lorg/apache/commons/io/DirectoryWalker$CancelException;

    invoke-direct {v0, p1, p2}, Lorg/apache/commons/io/DirectoryWalker$CancelException;-><init>(Ljava/io/File;I)V

    throw v0

    .line 398
    :cond_0
    return-void
.end method

.method protected filterDirectoryContents(Ljava/io/File;I[Ljava/io/File;)[Ljava/io/File;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 524
    return-object p3
.end method

.method protected handleCancelled(Ljava/io/File;Ljava/util/Collection;Lorg/apache/commons/io/DirectoryWalker$CancelException;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;Ljava/util/Collection<TT;>;Lorg/apache/commons/io/DirectoryWalker$CancelException;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 457
    throw p3
.end method

.method protected handleDirectory(Ljava/io/File;ILjava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 492
    const/4 v0, 0x1

    return v0
.end method

.method protected handleDirectoryEnd(Ljava/io/File;ILjava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 569
    return-void
.end method

.method protected handleDirectoryStart(Ljava/io/File;ILjava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 508
    return-void
.end method

.method protected handleEnd(Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 581
    return-void
.end method

.method protected handleFile(Ljava/io/File;ILjava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 539
    return-void
.end method

.method protected handleIsCancelled(Ljava/io/File;ILjava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 438
    const/4 v0, 0x0

    return v0
.end method

.method protected handleRestricted(Ljava/io/File;ILjava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;ILjava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 554
    return-void
.end method

.method protected handleStart(Ljava/io/File;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;Ljava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 472
    return-void
.end method

.method protected final walk(Ljava/io/File;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/io/File;Ljava/util/Collection<TT;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 330
    if-nez p1, :cond_0

    .line 331
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Start Directory is null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 334
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/apache/commons/io/DirectoryWalker;->handleStart(Ljava/io/File;Ljava/util/Collection;)V

    .line 335
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lorg/apache/commons/io/DirectoryWalker;->walk(Ljava/io/File;ILjava/util/Collection;)V

    .line 336
    invoke-virtual {p0, p2}, Lorg/apache/commons/io/DirectoryWalker;->handleEnd(Ljava/util/Collection;)V
    :try_end_0
    .catch Lorg/apache/commons/io/DirectoryWalker$CancelException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    goto :goto_0

    .line 337
    :catch_0
    move-exception v2

    .line 338
    invoke-virtual {p0, p1, p2, v2}, Lorg/apache/commons/io/DirectoryWalker;->handleCancelled(Ljava/io/File;Ljava/util/Collection;Lorg/apache/commons/io/DirectoryWalker$CancelException;)V

    .line 340
    :goto_0
    return-void
.end method
