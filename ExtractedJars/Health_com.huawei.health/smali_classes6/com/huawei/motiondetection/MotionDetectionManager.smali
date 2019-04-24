.class public Lcom/huawei/motiondetection/MotionDetectionManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MOTION_SERVICE_APK_ACTION:Ljava/lang/String; = "com.huawei.action.MOTION_SETTINGS"

.field private static final SERVICE_JUDGE_DELAY:I = 0x64

.field private static final TAG:Ljava/lang/String; = "MotionDetectionManager"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mMDListenerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/motiondetection/MotionDetectionListener;>;"
        }
    .end annotation
.end field

.field private mMotionAppsRegList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

.field private mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    .line 526
    new-instance v0, Lcom/huawei/motiondetection/MotionDetectionManager$1;

    invoke-direct {v0, p0}, Lcom/huawei/motiondetection/MotionDetectionManager$1;-><init>(Lcom/huawei/motiondetection/MotionDetectionManager;)V

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    .line 100
    iput-object p1, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    .line 102
    new-instance v0, Lcom/huawei/motiondetection/motionrelay/RelayManager;

    iget-object v1, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/motiondetection/motionrelay/RelayManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    .line 103
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    iget-object v1, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayListener:Lcom/huawei/motiondetection/motionrelay/RelayListener;

    invoke-virtual {v0, v1}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->setRelayListener(Lcom/huawei/motiondetection/motionrelay/RelayListener;)V

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    .line 107
    return-void
.end method

.method static synthetic access$0(Lcom/huawei/motiondetection/MotionDetectionManager;ILjava/lang/Object;)V
    .locals 0

    .line 369
    invoke-direct {p0, p1, p2}, Lcom/huawei/motiondetection/MotionDetectionManager;->processMotionRecoResult(ILjava/lang/Object;)V

    return-void
.end method

.method private getMotionsAppsByMotionReco(I)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 459
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 462
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 463
    const/4 v2, 0x0

    goto :goto_0

    .line 464
    :cond_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionTypeByMotionApps(I)I

    move-result v0

    if-ne v0, p1, :cond_1

    .line 467
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 463
    :cond_1
    add-int/lit8 v2, v2, 0x1

    :goto_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v2, v0, :cond_0

    .line 473
    :cond_2
    return-object v1
.end method

.method private getRecoMotionDirect(Landroid/content/Intent;)I
    .locals 2

    .line 509
    const-string v0, "motion_recognition_direction"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private getRecoMotionExtras(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1

    .line 519
    const-string v0, "motion_recognition_extras"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method private getRecoMotionResult(Landroid/content/Intent;)I
    .locals 2

    .line 494
    const-string v0, "motion_recognition_result"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private getRecoMotionType(Landroid/content/Intent;)I
    .locals 2

    .line 484
    const-string v0, "motion_type_recognition"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private getRecoResult(IIILandroid/os/Bundle;)Lcom/huawei/motiondetection/MotionRecoResult;
    .locals 1

    .line 442
    new-instance v0, Lcom/huawei/motiondetection/MotionRecoResult;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/huawei/motiondetection/MotionRecoResult;-><init>(IIILandroid/os/Bundle;)V

    return-object v0
.end method

.method public static isMotionRecoApkExist(Landroid/content/Context;)Z
    .locals 4

    .line 82
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.action.MOTION_SETTINGS"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 84
    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 83
    .line 85
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 86
    :cond_0
    const-string v0, "MotionRecoApkCheck"

    .line 87
    const-string v1, "Motion service not installed, it can not do motion recognize."

    .line 86
    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const/4 v0, 0x0

    return v0

    .line 90
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private isMotionStopValid(II)Z
    .locals 6

    .line 324
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 325
    const/4 v4, 0x0

    .line 329
    const/4 v5, 0x0

    goto :goto_0

    .line 331
    :cond_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 332
    invoke-static {v4}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionTypeByMotionApps(I)I

    move-result v0

    if-ne v0, p2, :cond_1

    .line 333
    if-eq v4, p1, :cond_1

    .line 334
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isMotionStopValid same motionReco running by other motionApps: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    const/4 v0, 0x0

    return v0

    .line 329
    :cond_1
    add-int/lit8 v5, v5, 0x1

    :goto_0
    if-lt v5, v3, :cond_0

    .line 340
    const/4 v0, 0x1

    return v0
.end method

.method private notifyMotionRecoResult(Landroid/content/Intent;)V
    .locals 12

    .line 401
    invoke-direct {p0, p1}, Lcom/huawei/motiondetection/MotionDetectionManager;->getRecoMotionType(Landroid/content/Intent;)I

    move-result v3

    .line 402
    invoke-direct {p0, p1}, Lcom/huawei/motiondetection/MotionDetectionManager;->getRecoMotionResult(Landroid/content/Intent;)I

    move-result v4

    .line 403
    invoke-direct {p0, p1}, Lcom/huawei/motiondetection/MotionDetectionManager;->getRecoMotionDirect(Landroid/content/Intent;)I

    move-result v5

    .line 404
    invoke-direct {p0, p1}, Lcom/huawei/motiondetection/MotionDetectionManager;->getRecoMotionExtras(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v6

    .line 408
    :try_start_0
    invoke-direct {p0, v3}, Lcom/huawei/motiondetection/MotionDetectionManager;->getMotionsAppsByMotionReco(I)Ljava/util/ArrayList;

    move-result-object v7

    .line 410
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "notifyMotionRecoResult motionTypeReco: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  recoRes: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 411
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " rDirect: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 410
    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "notifyMotionRecoResult mMPListenerList size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    const-string v0, "MotionDetectionManager"

    .line 414
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "notifyMotionRecoResult mMotionAppsRegList size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 413
    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    const/4 v8, 0x0

    .line 417
    const/4 v9, 0x0

    goto :goto_1

    .line 418
    :cond_0
    const/4 v10, 0x0

    goto :goto_0

    .line 419
    :cond_1
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Integer;

    .line 420
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, v4, v5, v6}, Lcom/huawei/motiondetection/MotionDetectionManager;->getRecoResult(IIILandroid/os/Bundle;)Lcom/huawei/motiondetection/MotionRecoResult;

    move-result-object v8

    .line 421
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/motiondetection/MotionDetectionListener;

    invoke-interface {v0, v8}, Lcom/huawei/motiondetection/MotionDetectionListener;->notifyMotionRecoResult(Lcom/huawei/motiondetection/MotionRecoResult;)V

    .line 418
    add-int/lit8 v10, v10, 0x1

    :goto_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v10, v0, :cond_1

    .line 417
    add-int/lit8 v9, v9, 0x1

    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-lt v9, v0, :cond_0

    goto :goto_2

    .line 424
    :catch_0
    move-exception v7

    .line 425
    const-string v0, "MotionDetectionManager"

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    :goto_2
    return-void
.end method

.method private processMotionRecoResult(ILjava/lang/Object;)V
    .locals 2

    .line 371
    const-string v0, "MotionDetectionManager"

    const-string v1, "processReceiverMsg ... "

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 373
    move-object v0, p2

    check-cast v0, Landroid/content/Intent;

    invoke-direct {p0, v0}, Lcom/huawei/motiondetection/MotionDetectionManager;->notifyMotionRecoResult(Landroid/content/Intent;)V

    .line 375
    :cond_0
    return-void
.end method

.method private resetMotionState(ILjava/lang/String;)I
    .locals 1

    .line 353
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 354
    const/4 p1, 0x1

    .line 355
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    invoke-static {v0, p2, p1}, Lcom/huawei/motiondetection/MRUtils;->setMotionEnableState(Landroid/content/Context;Ljava/lang/String;I)V

    .line 357
    :cond_0
    return p1
.end method

.method private stopAllMotionReco()V
    .locals 3

    .line 381
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 383
    const/4 v1, 0x0

    .line 384
    const/4 v2, 0x0

    goto :goto_0

    .line 385
    :cond_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/motiondetection/MotionDetectionManager;->stopMotionAppsReco(I)Z

    move-result v1

    .line 386
    if-eqz v1, :cond_1

    .line 387
    add-int/lit8 v2, v2, -0x1

    .line 384
    :cond_1
    add-int/lit8 v2, v2, 0x1

    :goto_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v2, v0, :cond_0

    .line 392
    :cond_2
    return-void
.end method


# virtual methods
.method public addMotionListener(Lcom/huawei/motiondetection/MotionDetectionListener;)V
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    :cond_0
    return-void
.end method

.method public destroy()V
    .locals 1

    .line 278
    invoke-direct {p0}, Lcom/huawei/motiondetection/MotionDetectionManager;->stopAllMotionReco()V

    .line 279
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 280
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    .line 282
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 283
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    .line 285
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->destroy()V

    .line 286
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    .line 288
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    .line 289
    return-void
.end method

.method public removeMotionListener(Lcom/huawei/motiondetection/MotionDetectionListener;)V
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMDListenerList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 311
    :cond_0
    return-void
.end method

.method public startMotionAppsReco(I)Z
    .locals 9

    .line 194
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionAppsReco motionApps: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionAppsReco repeat motionApps "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const/4 v0, 0x0

    return v0

    .line 200
    :cond_0
    invoke-static {p1}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionTypeByMotionApps(I)I

    move-result v3

    .line 201
    if-ne v3, p1, :cond_1

    .line 202
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionAppsReco motionApps "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not supported."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const/4 v0, 0x0

    return v0

    .line 207
    :cond_1
    invoke-static {v3}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionKeyByMotionApps(I)Ljava/lang/String;

    move-result-object v4

    .line 208
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/huawei/motiondetection/MRUtils;->getMotionEnableState(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    .line 209
    invoke-direct {p0, v5, v4}, Lcom/huawei/motiondetection/MotionDetectionManager;->resetMotionState(ILjava/lang/String;)I

    move-result v5

    .line 210
    const/4 v0, 0x1

    if-ne v5, v0, :cond_2

    const/4 v6, 0x1

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    .line 211
    :goto_0
    if-eqz v6, :cond_6

    .line 213
    invoke-static {p1}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionKeyByMotionApps(I)Ljava/lang/String;

    move-result-object v7

    .line 214
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    invoke-static {v0, v7}, Lcom/huawei/motiondetection/MRUtils;->getMotionEnableState(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    .line 215
    :goto_1
    if-eqz v8, :cond_5

    .line 216
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionAppsReco motionTypeReco: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.motionservice"

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRUtils;->isServiceRunning(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 218
    const-string v0, "MotionDetectionManager"

    const-string v1, "startMotionAppsReco call startMotionService "

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    invoke-virtual {p0}, Lcom/huawei/motiondetection/MotionDetectionManager;->startMotionService()V

    .line 221
    const-wide/16 v0, 0x64

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 223
    :cond_4
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0, v3}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->startMotionRecognition(I)V

    .line 224
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    const/4 v0, 0x1

    return v0

    .line 228
    :cond_5
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionAppsReco motionApps: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " disabled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 231
    :cond_6
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionAppsReco motionTypeReco: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " disabled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public startMotionRecoTutorial(I)V
    .locals 4

    .line 141
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionRecoTutorial motionApps: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionRecoTutorial repeat motionApps "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    return-void

    .line 147
    :cond_0
    invoke-static {p1}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionTypeByMotionApps(I)I

    move-result v3

    .line 148
    if-ne v3, p1, :cond_1

    .line 149
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startMotionRecoTutorial motionApps "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not supported."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    return-void

    .line 152
    :cond_1
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0, v3}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->startMotionRecognition(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    return-void
.end method

.method public startMotionService()V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.motionservice"

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRUtils;->isServiceRunning(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->startMotionService()V

    .line 118
    :cond_0
    return-void
.end method

.method public stopMotionAppsReco(I)Z
    .locals 5

    .line 250
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopMotionAppsReco motionApps: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    invoke-static {p1}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionTypeByMotionApps(I)I

    move-result v3

    .line 252
    if-eq v3, p1, :cond_0

    .line 253
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 254
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopMotionAppsReco not recognition motionApps "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const/4 v0, 0x0

    return v0

    .line 259
    :cond_0
    invoke-direct {p0, p1, v3}, Lcom/huawei/motiondetection/MotionDetectionManager;->isMotionStopValid(II)Z

    move-result v4

    .line 260
    if-eqz v4, :cond_1

    .line 261
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopMotionAppsReco motionTypeReco: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0, v3}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->stopMotionRecognition(I)V

    goto :goto_0

    .line 264
    :cond_1
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopMotionAppsReco can not stop motionReco: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    :goto_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 269
    const/4 v0, 0x1

    return v0
.end method

.method public stopMotionRecoTutorial(I)V
    .locals 4

    .line 167
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopMotionRecoTutorial motionApps: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    invoke-static {p1}, Lcom/huawei/motiondetection/MotionTypeApps;->getMotionTypeByMotionApps(I)I

    move-result v3

    .line 170
    if-eq v3, p1, :cond_0

    .line 171
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    const-string v0, "MotionDetectionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stopMotionRecoTutorial not recognition motionApps "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    return-void

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0, v3}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->stopMotionRecognition(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mMotionAppsRegList:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 180
    return-void
.end method

.method public stopMotionService()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.motionservice"

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRUtils;->isServiceRunning(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/motiondetection/MotionDetectionManager;->mRelayManager:Lcom/huawei/motiondetection/motionrelay/RelayManager;

    invoke-virtual {v0}, Lcom/huawei/motiondetection/motionrelay/RelayManager;->stopMotionService()V

    .line 129
    :cond_0
    return-void
.end method
