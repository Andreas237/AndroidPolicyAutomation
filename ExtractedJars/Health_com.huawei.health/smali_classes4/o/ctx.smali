.class public Lo/ctx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ctx$e;
    }
.end annotation


# static fields
.field private static g:Landroid/content/Context;


# instance fields
.field private a:Lo/cqe;

.field private b:Lo/czg;

.field private c:I

.field private d:I

.field private e:Lo/cpw;

.field private k:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->d:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->c:I

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ctx;->k:Z

    .line 46
    sget-object v0, Lo/ctx;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cqe;->b(Landroid/content/Context;)Lo/cqe;

    move-result-object v0

    iput-object v0, p0, Lo/ctx;->a:Lo/cqe;

    .line 47
    sget-object v0, Lo/ctx;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    iput-object v0, p0, Lo/ctx;->e:Lo/cpw;

    .line 48
    sget-object v0, Lo/ctx;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/ctx;->b:Lo/czg;

    .line 49
    return-void
.end method

.method synthetic constructor <init>(Lo/ctx$2;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lo/ctx;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/ctx;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 59
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/ctx;->g:Landroid/content/Context;

    .line 60
    sget-object v0, Lo/ctx$e;->c:Lo/ctx;

    return-object v0
.end method

.method private a(ILcom/huawei/hihealth/HiSyncOption;ILo/csv;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 126
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/ctx;->d:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    .line 127
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 128
    invoke-static {v8, v9}, Lo/cnk;->d(J)J

    move-result-wide v10

    .line 129
    invoke-static {v8, v9}, Lo/cnk;->i(J)J

    move-result-wide v12

    .line 130
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ctx;->a:Lo/cqe;

    move/from16 v1, p1

    move-wide v4, v10

    move-wide v6, v12

    const/16 v2, 0x7531

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v7}, Lo/cqe;->b(IIIJJ)Ljava/util/List;

    move-result-object v14

    .line 132
    const/4 v0, 0x0

    if-eq v0, v14, :cond_4

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    goto :goto_2

    .line 137
    :cond_0
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 138
    invoke-interface {v15, v14}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 139
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    goto :goto_2

    .line 142
    :cond_1
    move-object/from16 v0, p0

    move-object v1, v15

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v4, p4

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/ctx;->d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 143
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lo/ctx;->d(Ljava/util/List;)V

    goto :goto_1

    .line 145
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodyTrackData failed , clientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    goto :goto_2

    .line 148
    :goto_1
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_3

    .line 149
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTodyTrackData the size is smaller than HiSyncUtil.UPLOAD_TRACK_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    goto :goto_2

    .line 152
    :cond_3
    goto/16 :goto_0

    .line 153
    :cond_4
    :goto_2
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/ctx;->d:I

    .line 154
    return-void
.end method

.method private a(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/hihealth/HiSyncOption;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 257
    iget v0, p0, Lo/ctx;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctx;->c:I

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    .line 258
    sget-object v0, Lo/ctx;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lo/cui;->d(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 259
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 260
    :cond_0
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delTrackDataOnce conditons is null or empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const/4 v0, 0x0

    return v0

    .line 263
    :cond_1
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;-><init>()V

    .line 264
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;->setDelMotionConditons(Ljava/util/List;)V

    .line 265
    :goto_0
    iget v0, p0, Lo/ctx;->d:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 266
    iget-object v0, p0, Lo/ctx;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/DelMotionPathRsp;

    move-result-object v6

    .line 267
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 268
    iget v0, p0, Lo/ctx;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctx;->d:I

    .line 269
    goto :goto_0

    .line 271
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrackDataOnce OK ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctx;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    const/4 v0, 0x1

    return v0

    .line 274
    :cond_3
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrackDataOnce failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctx;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    const/4 v0, 0x0

    return v0
.end method

.method private b(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lo/ctx;->a:Lo/cqe;

    const/16 v1, 0x7531

    const/4 v2, 0x0

    const/16 v3, 0xa

    invoke-virtual {v0, p1, v1, v2, v3}, Lo/cqe;->c(IIII)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 279
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 280
    :cond_0
    return-void

    .line 284
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 285
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v4

    .line 286
    iget-object v0, p0, Lo/ctx;->a:Lo/cqe;

    invoke-virtual {v0, v4, v5}, Lo/cqe;->b(J)I

    move-result v8

    .line 287
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delTrackDone sequenceID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " delete is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 288
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 287
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    goto :goto_0

    .line 290
    :cond_2
    return-void
.end method

.method private d(ILcom/huawei/hihealth/HiSyncOption;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 229
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delTrack userid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lo/ctx;->e:Lo/cpw;

    invoke-virtual {v0, p1}, Lo/cpw;->d(I)Ljava/util/List;

    move-result-object v4

    .line 231
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    :cond_0
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delTrack client is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    return-void

    .line 235
    :cond_1
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :goto_0
    iget v0, p0, Lo/ctx;->d:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_5

    .line 237
    iget-object v0, p0, Lo/ctx;->a:Lo/cqe;

    const/16 v1, 0x7531

    const/4 v2, 0x2

    const/16 v3, 0xa

    invoke-virtual {v0, v4, v1, v2, v3}, Lo/cqe;->e(Ljava/util/List;III)Ljava/util/List;

    move-result-object v5

    .line 239
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 240
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no track date should be delete!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    goto :goto_1

    .line 243
    :cond_3
    invoke-direct {p0, v5, p2}, Lo/ctx;->a(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 244
    invoke-direct {p0, v5}, Lo/ctx;->b(Ljava/util/List;)V

    .line 248
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_4

    .line 249
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delTrack the size is smaller than HiSyncUtil.UPLOAD_TRACK_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    goto :goto_1

    .line 252
    :cond_4
    goto :goto_0

    .line 253
    :cond_5
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->d:I

    .line 254
    return-void
.end method

.method private d(ILcom/huawei/hihealth/HiSyncOption;ILo/csv;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 100
    :goto_0
    iget v0, p0, Lo/ctx;->d:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 101
    invoke-direct {p0, p1}, Lo/ctx;->b(I)Ljava/util/List;

    move-result-object v6

    .line 102
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 106
    invoke-interface {v7, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 108
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    goto :goto_2

    .line 111
    :cond_0
    move-object v0, p0

    move-object v1, v7

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/ctx;->d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-direct {p0, v7}, Lo/ctx;->d(Ljava/util/List;)V

    goto :goto_1

    .line 114
    :cond_1
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrack failed , clientId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    goto :goto_2

    .line 117
    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    .line 118
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrack the size is smaller than HiSyncUtil.UPLOAD_TRACK_DATA_MAX, size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    goto :goto_2

    .line 121
    :cond_2
    goto/16 :goto_0

    .line 122
    :cond_3
    :goto_2
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->d:I

    .line 123
    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 206
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    :cond_0
    return-void

    .line 212
    :cond_1
    const/4 v9, 0x0

    .line 213
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 214
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getDataID()J

    move-result-wide v7

    .line 215
    const-string v0, "modified_time"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    .line 216
    iget-object v0, p0, Lo/ctx;->a:Lo/cqe;

    invoke-virtual {v0, v7, v8, v4, v5}, Lo/cqe;->c(JJ)Z

    move-result v6

    .line 217
    if-eqz v6, :cond_2

    .line 218
    iget-object v0, p0, Lo/ctx;->a:Lo/cqe;

    invoke-virtual {v0, v7, v8, v4, v5}, Lo/cqe;->d(JJ)I

    move-result v9

    .line 220
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrackDone sequenceID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " trackTime is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 221
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getCreateTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " modifiedTime is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 222
    invoke-static {v4, v5}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " update ans is "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 223
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 220
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    goto/16 :goto_0

    .line 225
    :cond_3
    return-void
.end method

.method private d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 93
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 94
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, p2, p3, p4}, Lo/ctx;->a(ILcom/huawei/hihealth/HiSyncOption;ILo/csv;)V

    .line 95
    goto :goto_0

    .line 96
    :cond_0
    return-void
.end method

.method private d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;Z)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;Z)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 176
    if-nez p5, :cond_0

    iget-boolean v0, p0, Lo/ctx;->k:Z

    if-nez v0, :cond_1

    .line 177
    :cond_0
    iget v0, p0, Lo/ctx;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctx;->c:I

    invoke-virtual {p2}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v1

    invoke-static {v0, v1}, Lo/cui;->a(II)V

    goto :goto_0

    .line 179
    :cond_1
    iget v0, p0, Lo/ctx;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctx;->c:I

    const/16 v1, 0xa

    if-ge v1, v0, :cond_2

    .line 180
    iget v0, p0, Lo/ctx;->d:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/ctx;->d:I

    .line 181
    const/4 v0, 0x0

    return v0

    .line 184
    :cond_2
    :goto_0
    invoke-virtual {p4, p1, p3}, Lo/csv;->a(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    .line 185
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 186
    :cond_3
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrackDataOnce cloudTrack is null or empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const/4 v0, 0x0

    return v0

    .line 189
    :cond_4
    new-instance v5, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;-><init>()V

    .line 190
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;->setDetailInfo(Ljava/util/List;)V

    .line 191
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;->setTimeZone(Ljava/lang/String;)V

    .line 192
    :goto_1
    iget v0, p0, Lo/ctx;->d:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_6

    .line 193
    iget-object v0, p0, Lo/ctx;->b:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathReq;)Lcom/huawei/hwcloudmodel/model/unite/AddMotionPathRsp;

    move-result-object v6

    .line 194
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 195
    iget v0, p0, Lo/ctx;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ctx;->d:I

    .line 196
    goto :goto_1

    .line 198
    :cond_5
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrackDataOnce OK ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctx;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", date size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v0, 0x1

    return v0

    .line 201
    :cond_6
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadTrackDataOnce failed ! uploadCount is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ctx;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", date size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public c(ILcom/huawei/hihealth/HiSyncOption;ILo/csv;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 64
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->d:I

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->c:I

    .line 67
    invoke-static {}, Lo/cui;->d()Z

    move-result v0

    iput-boolean v0, p0, Lo/ctx;->k:Z

    .line 68
    invoke-static {}, Lo/csk;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 69
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() dataPrivacy switch is closed ,can not pushData right now ,push end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-void

    .line 72
    :cond_0
    const-string v0, "SYNC_TRACK_UPLOAD_PERCENT_MAX"

    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    invoke-static {v1, v2, v0}, Lo/cuh;->a(DLjava/lang/String;)V

    .line 73
    iget-object v0, p0, Lo/ctx;->e:Lo/cpw;

    invoke-virtual {v0, p1}, Lo/cpw;->a(I)Ljava/util/List;

    move-result-object v7

    .line 74
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    :cond_1
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() no client get, maybe no data need to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 77
    :cond_2
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clientid list size ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-boolean v0, p0, Lo/ctx;->k:Z

    if-eqz v0, :cond_3

    .line 79
    invoke-direct {p0, v7, p2, p3, p4}, Lo/ctx;->d(Ljava/util/List;Lcom/huawei/hihealth/HiSyncOption;ILo/csv;)V

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/ctx;->c:I

    .line 82
    :cond_3
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Integer;

    .line 83
    sget-object v0, Lo/ctx;->g:Landroid/content/Context;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    int-to-double v1, v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    div-double/2addr v3, v1

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, 0x4014000000000000L    # 5.0

    invoke-static/range {v0 .. v6}, Lo/cuh;->a(Landroid/content/Context;DDD)V

    .line 84
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0, p2, p3, p4}, Lo/ctx;->d(ILcom/huawei/hihealth/HiSyncOption;ILo/csv;)V

    .line 85
    goto :goto_0

    .line 87
    :cond_4
    :goto_1
    invoke-direct {p0, p1, p2}, Lo/ctx;->d(ILcom/huawei/hihealth/HiSyncOption;)V

    .line 88
    sget-object v0, Lo/ctx;->g:Landroid/content/Context;

    invoke-static {v0}, Lo/cuh;->b(Landroid/content/Context;)V

    .line 89
    const-string v0, "HiH_HiSyncTrack"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    return-void
.end method
