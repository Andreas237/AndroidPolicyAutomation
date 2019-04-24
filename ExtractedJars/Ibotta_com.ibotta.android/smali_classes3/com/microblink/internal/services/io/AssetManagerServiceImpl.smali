.class public final Lcom/microblink/internal/services/io/AssetManagerServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/io/AssetManagerService;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final EMPTY:Ljava/lang/String; = ""

.field private static final TAG:Ljava/lang/String; = "AssetManagerServiceImpl"


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private readerFromAssets:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/String;",
            "Ljava/lang/Void;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private readerOutPut:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/String;",
            "Ljava/lang/Void;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private writerOutPut:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/String;",
            "Ljava/lang/Void;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Landroid/os/AsyncTask;

    iget-object v1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerFromAssets:Landroid/os/AsyncTask;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->writerOutPut:Landroid/os/AsyncTask;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerOutPut:Landroid/os/AsyncTask;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    return-void
.end method

.method public final enqueueReadFileFromAssets(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    new-array v2, v0, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerFromAssets:Landroid/os/AsyncTask;

    aput-object v3, v2, v1

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    new-instance v2, Lcom/microblink/internal/services/io/ReadFromAssetsTask;

    iget-object v3, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->context:Landroid/content/Context;

    new-instance v4, Lcom/microblink/internal/services/io/AssetManagerServiceImpl$1;

    invoke-direct {v4, p0, p2}, Lcom/microblink/internal/services/io/AssetManagerServiceImpl$1;-><init>(Lcom/microblink/internal/services/io/AssetManagerServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-direct {v2, v3, v4}, Lcom/microblink/internal/services/io/ReadFromAssetsTask;-><init>(Landroid/content/Context;Lcom/microblink/OnCompleteListener;)V

    new-array v0, v0, [Ljava/lang/String;

    aput-object p1, v0, v1

    instance-of p1, v2, Landroid/os/AsyncTask;

    if-nez p1, :cond_0

    invoke-virtual {v2, v0}, Lcom/microblink/internal/services/io/ReadFromAssetsTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v2, Landroid/os/AsyncTask;

    invoke-static {v2, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerFromAssets:Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AssetManagerServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, ""

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final enqueueReadFileFromInput(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    new-array v2, v0, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerOutPut:Landroid/os/AsyncTask;

    aput-object v3, v2, v1

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    new-instance v2, Lcom/microblink/internal/services/io/ReadFromFileInputTask;

    iget-object v3, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->context:Landroid/content/Context;

    new-instance v4, Lcom/microblink/internal/services/io/AssetManagerServiceImpl$3;

    invoke-direct {v4, p0, p2}, Lcom/microblink/internal/services/io/AssetManagerServiceImpl$3;-><init>(Lcom/microblink/internal/services/io/AssetManagerServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-direct {v2, v3, v4}, Lcom/microblink/internal/services/io/ReadFromFileInputTask;-><init>(Landroid/content/Context;Lcom/microblink/OnCompleteListener;)V

    new-array v0, v0, [Ljava/lang/String;

    aput-object p1, v0, v1

    instance-of p1, v2, Landroid/os/AsyncTask;

    if-nez p1, :cond_0

    invoke-virtual {v2, v0}, Lcom/microblink/internal/services/io/ReadFromFileInputTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v2, Landroid/os/AsyncTask;

    invoke-static {v2, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerOutPut:Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "AssetManagerServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, ""

    invoke-interface {p2, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final enqueueWriteFileToOutput(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    new-array v2, v0, [Landroid/os/AsyncTask;

    iget-object v3, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->writerOutPut:Landroid/os/AsyncTask;

    aput-object v3, v2, v1

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    new-instance v2, Lcom/microblink/internal/services/io/WriteToFileOutPutTask;

    iget-object v3, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->context:Landroid/content/Context;

    new-instance v4, Lcom/microblink/internal/services/io/AssetManagerServiceImpl$2;

    invoke-direct {v4, p0, p3}, Lcom/microblink/internal/services/io/AssetManagerServiceImpl$2;-><init>(Lcom/microblink/internal/services/io/AssetManagerServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-direct {v2, v3, p1, v4}, Lcom/microblink/internal/services/io/WriteToFileOutPutTask;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    new-array p1, v0, [Ljava/lang/String;

    aput-object p2, p1, v1

    instance-of p2, v2, Landroid/os/AsyncTask;

    if-nez p2, :cond_0

    invoke-virtual {v2, p1}, Lcom/microblink/internal/services/io/WriteToFileOutPutTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v2, Landroid/os/AsyncTask;

    invoke-static {v2, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->writerOutPut:Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "AssetManagerServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final executeReadFileFromAssets(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/os/AsyncTask;

    iget-object v1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->readerFromAssets:Landroid/os/AsyncTask;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel([Landroid/os/AsyncTask;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->tryReadFile(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, ""
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->closeable(Ljava/io/Closeable;)V

    return-object p1

    :cond_0
    invoke-static {v0}, Lcom/microblink/internal/Utility;->closeable(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "AssetManagerServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->closeable(Ljava/io/Closeable;)V

    const-string p1, ""

    return-object p1

    :goto_0
    invoke-static {v0}, Lcom/microblink/internal/Utility;->closeable(Ljava/io/Closeable;)V

    throw p1
.end method
