.class public Lcom/ibotta/android/state/xprocess/StorageSiloState;
.super Ljava/lang/Object;
.source "StorageSiloState.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# static fields
.field private static final RECEIPT_SILO_REGEX:Ljava/lang/String; = "^receipt_image.*"

.field private static final STORAGE_SILO_IMAGE_RESIZE:Ljava/lang/String; = "image_resize_silo"

.field private static final STORAGE_SILO_RECEIPT:Ljava/lang/String; = "receipt_silo"


# instance fields
.field private final context:Landroid/content/Context;

.field private imageResizeSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

.field private receiptSilo:Lcom/ibotta/android/commons/disk/StorageSilo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public destroyImageResizeSilo()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->context:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->getImageResizeSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 63
    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/disk/StorageSilo;->clean(Z)V

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->imageResizeSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    :cond_0
    return-void
.end method

.method public destroyReceiptSilo()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->context:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->getReceiptSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 46
    invoke-virtual {v0, v1}, Lcom/ibotta/android/commons/disk/StorageSilo;->clean(Z)V

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->receiptSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    :cond_0
    return-void
.end method

.method public destroyStorageSilos()V
    .locals 4

    const/4 v0, 0x0

    .line 70
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->destroyReceiptSilo()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to destroy receipt storage silo."

    .line 72
    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 76
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->destroyImageResizeSilo()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v2, "Failed to destroy image resize storage silo."

    .line 78
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public getImageResizeSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->imageResizeSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lcom/ibotta/android/commons/disk/StorageSilo;

    const-string v1, "image_resize_silo"

    sget-object v2, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-direct {v0, p1, v1, v2}, Lcom/ibotta/android/commons/disk/StorageSilo;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;)V

    iput-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->imageResizeSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    .line 57
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->imageResizeSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    return-object p1
.end method

.method public getReceiptSilo(Landroid/content/Context;)Lcom/ibotta/android/commons/disk/StorageSilo;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/commons/disk/StorageException;
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->receiptSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/ibotta/android/commons/disk/StorageSilo;

    const-string v1, "receipt_silo"

    sget-object v2, Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;->INTERNAL_STORAGE:Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;

    invoke-direct {v0, p1, v1, v2}, Lcom/ibotta/android/commons/disk/StorageSilo;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/android/commons/disk/StorageSilo$SiloType;)V

    iput-object v0, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->receiptSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    .line 37
    iget-object p1, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->receiptSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    const-string v0, "^receipt_image.*"

    invoke-virtual {p1, v0}, Lcom/ibotta/android/commons/disk/StorageSilo;->setListRegEx(Ljava/lang/String;)V

    .line 40
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/state/xprocess/StorageSiloState;->receiptSilo:Lcom/ibotta/android/commons/disk/StorageSilo;

    return-object p1
.end method
