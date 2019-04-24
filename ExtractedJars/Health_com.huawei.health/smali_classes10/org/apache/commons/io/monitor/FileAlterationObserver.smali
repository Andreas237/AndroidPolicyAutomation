.class public Lorg/apache/commons/io/monitor/FileAlterationObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x107266629bcfe480L


# instance fields
.field private final comparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<Ljava/io/File;>;"
        }
    .end annotation
.end field

.field private final fileFilter:Ljava/io/FileFilter;

.field private final listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lorg/apache/commons/io/monitor/FileAlterationListener;>;"
        }
    .end annotation
.end field

.field private final rootEntry:Lorg/apache/commons/io/monitor/FileEntry;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .line 168
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;-><init>(Ljava/io/File;Ljava/io/FileFilter;)V

    .line 169
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/io/FileFilter;)V
    .locals 1

    .line 178
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;-><init>(Ljava/io/File;Ljava/io/FileFilter;Lorg/apache/commons/io/IOCase;)V

    .line 179
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/io/FileFilter;Lorg/apache/commons/io/IOCase;)V
    .locals 1

    .line 190
    new-instance v0, Lorg/apache/commons/io/monitor/FileEntry;

    invoke-direct {v0, p1}, Lorg/apache/commons/io/monitor/FileEntry;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v0, p2, p3}, Lorg/apache/commons/io/monitor/FileAlterationObserver;-><init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/FileFilter;Lorg/apache/commons/io/IOCase;)V

    .line 191
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 136
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;-><init>(Ljava/io/File;)V

    .line 137
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/FileFilter;)V
    .locals 1

    .line 146
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2}, Lorg/apache/commons/io/monitor/FileAlterationObserver;-><init>(Ljava/io/File;Ljava/io/FileFilter;)V

    .line 147
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/FileFilter;Lorg/apache/commons/io/IOCase;)V
    .locals 1

    .line 159
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p2, p3}, Lorg/apache/commons/io/monitor/FileAlterationObserver;-><init>(Ljava/io/File;Ljava/io/FileFilter;Lorg/apache/commons/io/IOCase;)V

    .line 160
    return-void
.end method

.method protected constructor <init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/FileFilter;Lorg/apache/commons/io/IOCase;)V
    .locals 2

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    .line 203
    if-nez p1, :cond_0

    .line 204
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Root entry is missing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 206
    :cond_0
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    .line 207
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Root directory is missing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :cond_1
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    .line 210
    iput-object p2, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->fileFilter:Ljava/io/FileFilter;

    .line 211
    if-eqz p3, :cond_2

    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-virtual {p3, v0}, Lorg/apache/commons/io/IOCase;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 212
    :cond_2
    sget-object v0, Lorg/apache/commons/io/comparator/NameFileComparator;->NAME_SYSTEM_COMPARATOR:Ljava/util/Comparator;

    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    goto :goto_0

    .line 213
    :cond_3
    sget-object v0, Lorg/apache/commons/io/IOCase;->INSENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-virtual {p3, v0}, Lorg/apache/commons/io/IOCase;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 214
    sget-object v0, Lorg/apache/commons/io/comparator/NameFileComparator;->NAME_INSENSITIVE_COMPARATOR:Ljava/util/Comparator;

    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    goto :goto_0

    .line 216
    :cond_4
    sget-object v0, Lorg/apache/commons/io/comparator/NameFileComparator;->NAME_COMPARATOR:Ljava/util/Comparator;

    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    .line 218
    :goto_0
    return-void
.end method

.method private checkAndNotify(Lorg/apache/commons/io/monitor/FileEntry;[Lorg/apache/commons/io/monitor/FileEntry;[Ljava/io/File;)V
    .locals 9

    .line 324
    const/4 v3, 0x0

    .line 325
    array-length v0, p3

    if-lez v0, :cond_0

    array-length v0, p3

    new-array v4, v0, [Lorg/apache/commons/io/monitor/FileEntry;

    goto :goto_0

    :cond_0
    sget-object v4, Lorg/apache/commons/io/monitor/FileEntry;->EMPTY_ENTRIES:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 326
    :goto_0
    move-object v5, p2

    array-length v6, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    .line 327
    :goto_2
    array-length v0, p3

    if-ge v3, v0, :cond_1

    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    invoke-virtual {v8}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v1

    aget-object v2, p3, v3

    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_1

    .line 328
    aget-object v0, p3, v3

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->createFileEntry(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v0

    aput-object v0, v4, v3

    .line 329
    aget-object v0, v4, v3

    invoke-direct {p0, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doCreate(Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 330
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 332
    :cond_1
    array-length v0, p3

    if-ge v3, v0, :cond_2

    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    invoke-virtual {v8}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v1

    aget-object v2, p3, v3

    invoke-interface {v0, v1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_2

    .line 333
    aget-object v0, p3, v3

    invoke-direct {p0, v8, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doMatch(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V

    .line 334
    invoke-virtual {v8}, Lorg/apache/commons/io/monitor/FileEntry;->getChildren()[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v0

    aget-object v1, p3, v3

    invoke-direct {p0, v1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listFiles(Ljava/io/File;)[Ljava/io/File;

    move-result-object v1

    invoke-direct {p0, v8, v0, v1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->checkAndNotify(Lorg/apache/commons/io/monitor/FileEntry;[Lorg/apache/commons/io/monitor/FileEntry;[Ljava/io/File;)V

    .line 335
    aput-object v8, v4, v3

    .line 336
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 338
    :cond_2
    invoke-virtual {v8}, Lorg/apache/commons/io/monitor/FileEntry;->getChildren()[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v0

    sget-object v1, Lorg/apache/commons/io/FileUtils;->EMPTY_FILE_ARRAY:[Ljava/io/File;

    invoke-direct {p0, v8, v0, v1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->checkAndNotify(Lorg/apache/commons/io/monitor/FileEntry;[Lorg/apache/commons/io/monitor/FileEntry;[Ljava/io/File;)V

    .line 339
    invoke-direct {p0, v8}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doDelete(Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 326
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 342
    :cond_3
    :goto_4
    array-length v0, p3

    if-ge v3, v0, :cond_4

    .line 343
    aget-object v0, p3, v3

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->createFileEntry(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v0

    aput-object v0, v4, v3

    .line 344
    aget-object v0, v4, v3

    invoke-direct {p0, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doCreate(Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 342
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 346
    :cond_4
    invoke-virtual {p1, v4}, Lorg/apache/commons/io/monitor/FileEntry;->setChildren([Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 347
    return-void
.end method

.method private createFileEntry(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;
    .locals 3

    .line 357
    invoke-virtual {p1, p2}, Lorg/apache/commons/io/monitor/FileEntry;->newChildInstance(Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v1

    .line 358
    invoke-virtual {v1, p2}, Lorg/apache/commons/io/monitor/FileEntry;->refresh(Ljava/io/File;)Z

    .line 359
    invoke-direct {p0, p2, v1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doListFiles(Ljava/io/File;Lorg/apache/commons/io/monitor/FileEntry;)[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v2

    .line 360
    invoke-virtual {v1, v2}, Lorg/apache/commons/io/monitor/FileEntry;->setChildren([Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 361
    return-object v1
.end method

.method private doCreate(Lorg/apache/commons/io/monitor/FileEntry;)V
    .locals 6

    .line 385
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/monitor/FileAlterationListener;

    .line 386
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 387
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onDirectoryCreate(Ljava/io/File;)V

    goto :goto_1

    .line 389
    :cond_0
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onFileCreate(Ljava/io/File;)V

    .line 391
    :goto_1
    goto :goto_0

    .line 392
    :cond_1
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->getChildren()[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v1

    .line 393
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 394
    invoke-direct {p0, v5}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doCreate(Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 393
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 396
    :cond_2
    return-void
.end method

.method private doDelete(Lorg/apache/commons/io/monitor/FileEntry;)V
    .locals 3

    .line 422
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/monitor/FileAlterationListener;

    .line 423
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onDirectoryDelete(Ljava/io/File;)V

    goto :goto_1

    .line 426
    :cond_0
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    invoke-interface {v2, v0}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onFileDelete(Ljava/io/File;)V

    .line 428
    :goto_1
    goto :goto_0

    .line 429
    :cond_1
    return-void
.end method

.method private doListFiles(Ljava/io/File;Lorg/apache/commons/io/monitor/FileEntry;)[Lorg/apache/commons/io/monitor/FileEntry;
    .locals 4

    .line 371
    invoke-direct {p0, p1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listFiles(Ljava/io/File;)[Ljava/io/File;

    move-result-object v1

    .line 372
    array-length v0, v1

    if-lez v0, :cond_0

    array-length v0, v1

    new-array v2, v0, [Lorg/apache/commons/io/monitor/FileEntry;

    goto :goto_0

    :cond_0
    sget-object v2, Lorg/apache/commons/io/monitor/FileEntry;->EMPTY_ENTRIES:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 373
    :goto_0
    const/4 v3, 0x0

    :goto_1
    array-length v0, v1

    if-ge v3, v0, :cond_1

    .line 374
    aget-object v0, v1, v3

    invoke-direct {p0, p2, v0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->createFileEntry(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v0

    aput-object v0, v2, v3

    .line 373
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 376
    :cond_1
    return-object v2
.end method

.method private doMatch(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V
    .locals 3

    .line 405
    invoke-virtual {p1, p2}, Lorg/apache/commons/io/monitor/FileEntry;->refresh(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 406
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lorg/apache/commons/io/monitor/FileAlterationListener;

    .line 407
    invoke-virtual {p1}, Lorg/apache/commons/io/monitor/FileEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 408
    invoke-interface {v2, p2}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onDirectoryChange(Ljava/io/File;)V

    goto :goto_1

    .line 410
    :cond_0
    invoke-interface {v2, p2}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onFileChange(Ljava/io/File;)V

    .line 412
    :goto_1
    goto :goto_0

    .line 414
    :cond_1
    return-void
.end method

.method private listFiles(Ljava/io/File;)[Ljava/io/File;
    .locals 3

    .line 439
    const/4 v2, 0x0

    .line 440
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 441
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->fileFilter:Ljava/io/FileFilter;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->fileFilter:Ljava/io/FileFilter;

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v2

    .line 443
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    .line 444
    sget-object v2, Lorg/apache/commons/io/FileUtils;->EMPTY_FILE_ARRAY:[Ljava/io/File;

    .line 446
    :cond_2
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    if-eqz v0, :cond_3

    array-length v0, v2

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 447
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->comparator:Ljava/util/Comparator;

    invoke-static {v2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 449
    :cond_3
    return-object v2
.end method


# virtual methods
.method public addListener(Lorg/apache/commons/io/monitor/FileAlterationListener;)V
    .locals 1

    .line 245
    if-eqz p1, :cond_0

    .line 246
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    :cond_0
    return-void
.end method

.method public checkAndNotify()V
    .locals 6

    .line 296
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lorg/apache/commons/io/monitor/FileAlterationListener;

    .line 297
    invoke-interface {v4, p0}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onStart(Lorg/apache/commons/io/monitor/FileAlterationObserver;)V

    .line 298
    goto :goto_0

    .line 301
    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v0}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v3

    .line 302
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 303
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    iget-object v1, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v1}, Lorg/apache/commons/io/monitor/FileEntry;->getChildren()[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v1

    invoke-direct {p0, v3}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listFiles(Ljava/io/File;)[Ljava/io/File;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->checkAndNotify(Lorg/apache/commons/io/monitor/FileEntry;[Lorg/apache/commons/io/monitor/FileEntry;[Ljava/io/File;)V

    goto :goto_1

    .line 304
    :cond_1
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v0}, Lorg/apache/commons/io/monitor/FileEntry;->isExists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 305
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    iget-object v1, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v1}, Lorg/apache/commons/io/monitor/FileEntry;->getChildren()[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v1

    sget-object v2, Lorg/apache/commons/io/FileUtils;->EMPTY_FILE_ARRAY:[Ljava/io/File;

    invoke-direct {p0, v0, v1, v2}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->checkAndNotify(Lorg/apache/commons/io/monitor/FileEntry;[Lorg/apache/commons/io/monitor/FileEntry;[Ljava/io/File;)V

    .line 311
    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/apache/commons/io/monitor/FileAlterationListener;

    .line 312
    invoke-interface {v5, p0}, Lorg/apache/commons/io/monitor/FileAlterationListener;->onStop(Lorg/apache/commons/io/monitor/FileAlterationObserver;)V

    .line 313
    goto :goto_2

    .line 314
    :cond_3
    return-void
.end method

.method public destroy()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 288
    return-void
.end method

.method public getDirectory()Ljava/io/File;
    .locals 1

    .line 226
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v0}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public getFileFilter()Ljava/io/FileFilter;
    .locals 1

    .line 236
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->fileFilter:Ljava/io/FileFilter;

    return-object v0
.end method

.method public getListeners()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/lang/Iterable<Lorg/apache/commons/io/monitor/FileAlterationListener;>;"
        }
    .end annotation

    .line 268
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    return-object v0
.end method

.method public initialize()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 277
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    iget-object v1, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v1}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/io/monitor/FileEntry;->refresh(Ljava/io/File;)Z

    .line 278
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v0}, Lorg/apache/commons/io/monitor/FileEntry;->getFile()Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->doListFiles(Ljava/io/File;Lorg/apache/commons/io/monitor/FileEntry;)[Lorg/apache/commons/io/monitor/FileEntry;

    move-result-object v2

    .line 279
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->rootEntry:Lorg/apache/commons/io/monitor/FileEntry;

    invoke-virtual {v0, v2}, Lorg/apache/commons/io/monitor/FileEntry;->setChildren([Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 280
    return-void
.end method

.method public removeListener(Lorg/apache/commons/io/monitor/FileAlterationListener;)V
    .locals 1

    .line 256
    if-eqz p1, :cond_0

    .line 257
    :goto_0
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 260
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 459
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 460
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    const-string v0, "[file=\'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    invoke-virtual {p0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->getDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    const/16 v0, 0x27

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 464
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->fileFilter:Ljava/io/FileFilter;

    if-eqz v0, :cond_0

    .line 465
    const-string v0, ", "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->fileFilter:Ljava/io/FileFilter;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    :cond_0
    const-string v0, ", listeners="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    iget-object v0, p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 470
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
