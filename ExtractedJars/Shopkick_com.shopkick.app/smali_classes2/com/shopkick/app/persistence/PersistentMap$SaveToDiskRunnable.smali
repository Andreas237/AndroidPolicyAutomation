.class Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;
.super Ljava/lang/Object;
.source "PersistentMap.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/persistence/PersistentMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SaveToDiskRunnable"
.end annotation


# instance fields
.field private final data:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final filePath:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/persistence/PersistentMap;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/persistence/PersistentMap;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 429
    iput-object p1, p0, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;->this$0:Lcom/shopkick/app/persistence/PersistentMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 430
    iput-object p2, p0, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;->filePath:Ljava/lang/String;

    .line 431
    invoke-virtual {p3}, Ljava/util/HashMap;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    iput-object p1, p0, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;->data:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 436
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;->filePath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 437
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 438
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 439
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 442
    :cond_0
    new-instance v1, Landroid/support/v4/util/AtomicFile;

    invoke-direct {v1, v0}, Landroid/support/v4/util/AtomicFile;-><init>(Ljava/io/File;)V

    const/4 v0, 0x0

    .line 445
    :try_start_0
    invoke-virtual {v1}, Landroid/support/v4/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 448
    :try_start_1
    new-instance v3, Ljava/io/ObjectOutputStream;

    invoke-direct {v3, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 449
    :try_start_2
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap$SaveToDiskRunnable;->data:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 450
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 453
    :try_start_3
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->close()V

    .line 456
    invoke-virtual {v1, v2}, Landroid/support/v4/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v3

    move-object v4, v3

    move-object v3, v0

    move-object v0, v4

    :goto_0
    if-eqz v3, :cond_1

    .line 453
    invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->close()V

    :cond_1
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v2

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    .line 458
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v2, :cond_2

    .line 460
    invoke-virtual {v1, v2}, Landroid/support/v4/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    :cond_2
    :goto_2
    return-void
.end method
