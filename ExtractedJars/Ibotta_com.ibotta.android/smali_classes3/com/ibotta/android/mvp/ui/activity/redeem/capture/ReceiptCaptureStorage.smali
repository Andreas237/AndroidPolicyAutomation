.class public Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;
.super Ljava/lang/Object;
.source "ReceiptCaptureStorage.java"


# instance fields
.field private storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private workingReceiptImage:Ljava/io/File;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clean()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/disk/StorageSilo;->clean(Z)V

    :cond_0
    return-void
.end method

.method public getReceiptImage(Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/disk/StorageSilo;->file(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getReceiptImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-nez v0, :cond_0

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 61
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/commons/disk/StorageSilo;->listFiles()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getWorkingReceiptImage()Ljava/io/File;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->workingReceiptImage:Ljava/io/File;

    return-object v0
.end method

.method public prepareForRetake()V
    .locals 4

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->workingReceiptImage:Ljava/io/File;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x1

    .line 48
    :try_start_0
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/commons/disk/StorageSilo;->deleteFile(Ljava/io/File;Z)V
    :try_end_0
    .catch Lcom/ibotta/android/commons/disk/StorageException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 50
    new-instance v1, Lcom/ibotta/android/commons/disk/StorageException;

    invoke-virtual {v0}, Lcom/ibotta/android/commons/disk/StorageException;->getStorageIssue()Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;

    move-result-object v2

    const-string v3, "Failed to delete working file."

    invoke-direct {v1, v2, v3, v0}, Lcom/ibotta/android/commons/disk/StorageException;-><init>(Lcom/ibotta/android/commons/disk/StorageException$StorageIssue;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    invoke-static {v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;)V

    .line 52
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :cond_1
    :goto_1
    return-void
.end method

.method public setStorageSilo(Lcom/ibotta/android/commons/disk/StorageSilo;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/commons/disk/StorageSilo;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    return-void
.end method

.method public startNewWorkingFile(Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "New working file: %1$s"

    const/4 v1, 0x1

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->storageSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/commons/disk/StorageSilo;->file(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->workingReceiptImage:Ljava/io/File;

    .line 72
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/capture/ReceiptCaptureStorage;->workingReceiptImage:Ljava/io/File;

    return-object p1
.end method
