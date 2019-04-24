.class public Lo/cwz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONTENT_KEY:Ljava/lang/String; = "content"

.field private static final TAG:Ljava/lang/String; = "HWBaseManager"

.field private static sModuleIdSet:Ljava/util/Set; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static sModuleInstancesSet:Ljava/util/Set; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/cwz;>;"
        }
    .end annotation
.end field


# instance fields
.field private mContext:Landroid/content/Context;

.field private mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lo/cwz;->sModuleIdSet:Ljava/util/Set;

    .line 51
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lo/cwz;->sModuleInstancesSet:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lo/cwz;->mContext:Landroid/content/Context;

    .line 70
    invoke-direct {p0}, Lo/cwz;->init()V

    .line 71
    return-void
.end method

.method public static finishAll()V
    .locals 6

    .line 406
    invoke-static {}, Lo/cwz;->getModuleInstancesSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 408
    :goto_0
    :try_start_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cwz;

    .line 410
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 411
    invoke-virtual {v5}, Lo/cwz;->onDestroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    goto :goto_0

    .line 415
    :cond_0
    goto :goto_1

    .line 413
    :catch_0
    move-exception v5

    .line 414
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "finishAll() Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    :goto_1
    invoke-static {}, Lo/cwz;->getModuleInstancesSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 417
    return-void
.end method

.method private getDataForBroadcast(Ljava/lang/String;)Ljava/io/Serializable;
    .locals 1

    .line 99
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getModuleIdSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 54
    sget-object v0, Lo/cwz;->sModuleIdSet:Ljava/util/Set;

    return-object v0
.end method

.method public static getModuleInstancesSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Lo/cwz;>;"
        }
    .end annotation

    .line 58
    sget-object v0, Lo/cwz;->sModuleInstancesSet:Ljava/util/Set;

    return-object v0
.end method

.method private init()V
    .locals 4

    .line 122
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AvailableBroadcastSet is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lo/cwz;->getAvailableBroadcastSet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 124
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The module id is empty! you must implements getModuleId method first."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The module id is empty! you must implements getModuleId method first."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 127
    :cond_0
    invoke-static {}, Lo/cwz;->getModuleIdSet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The module id is duplicated!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 130
    :cond_1
    invoke-static {}, Lo/cwz;->getModuleIdSet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 132
    invoke-static {}, Lo/cwz;->getModuleInstancesSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 135
    :goto_0
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    .line 136
    return-void
.end method


# virtual methods
.method public createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I
    .locals 2

    .line 254
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p2, p3}, Lo/dck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public deleteSharedPreference(Ljava/lang/String;)I
    .locals 2

    .line 232
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I
    .locals 2

    .line 359
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p2, p3}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 375
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected getAvailableBroadcastSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 88
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public getDataForBroadcastFromOtherManager(Ljava/lang/String;)Ljava/io/Serializable;
    .locals 3

    .line 108
    invoke-static {}, Lo/cwz;->getModuleInstancesSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cwz;

    .line 109
    invoke-virtual {v2}, Lo/cwz;->getAvailableBroadcastSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    invoke-direct {v2, p1}, Lo/cwz;->getDataForBroadcast(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    return-object v0

    .line 113
    :cond_0
    goto :goto_0

    .line 114
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getExistingKeys()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 214
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 79
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSharedPreference(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 223
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTableFullName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 397
    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lo/dck;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J
    .locals 2

    .line 329
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p2, p3}, Lo/dck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public insertStorageDataWithOnConfict(Ljava/lang/String;ILandroid/content/ContentValues;I)J
    .locals 6

    .line 346
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lo/dck;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILandroid/content/ContentValues;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public onDataMigrate()Z
    .locals 1

    .line 422
    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .line 144
    invoke-static {}, Lo/cwz;->getModuleIdSet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 145
    return-void
.end method

.method public queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 268
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p2, p3}, Lo/dck;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public queryStorageDataToOrder(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 6

    .line 284
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/dck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 2

    .line 388
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p2, p3}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public registerBroadcast(Landroid/content/BroadcastReceiver;Ljava/lang/String;)V
    .locals 5

    .line 156
    iget-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 157
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBroadcast, but mLocalBR is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    return-void

    .line 160
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4, p2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, p1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 162
    return-void
.end method

.method public resetSharedPreference()I
    .locals 2

    .line 240
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public sendBroadcast(Ljava/lang/String;)Z
    .locals 5

    .line 182
    invoke-virtual {p0}, Lo/cwz;->getAvailableBroadcastSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this broadcast is invalid!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const/4 v0, 0x0

    return v0

    .line 186
    :cond_0
    iget-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 187
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendBroadcast, but mLocalBR is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    const/4 v0, 0x0

    return v0

    .line 190
    :cond_1
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 191
    const-string v0, "content"

    invoke-direct {p0, p1}, Lo/cwz;->getDataForBroadcast(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 192
    iget-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 193
    const/4 v0, 0x1

    return v0
.end method

.method public setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    .locals 2

    .line 205
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    .line 206
    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 205
    invoke-static {v0, v1, p1, p2, p3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    return v0
.end method

.method public unregisterBroadcast(Landroid/content/BroadcastReceiver;)V
    .locals 4

    .line 169
    iget-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 170
    const-string v0, "HWBaseManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterBroadcast, but mLocalBR is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    return-void

    .line 173
    :cond_0
    iget-object v0, p0, Lo/cwz;->mLocalBR:Landroid/support/v4/content/LocalBroadcastManager;

    invoke-virtual {v0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 174
    return-void
.end method

.method public updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I
    .locals 6

    .line 298
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lo/dck;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 7

    .line 313
    iget-object v0, p0, Lo/cwz;->mContext:Landroid/content/Context;

    invoke-virtual {p0}, Lo/cwz;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lo/dck;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
