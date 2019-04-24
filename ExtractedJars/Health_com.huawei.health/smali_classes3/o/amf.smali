.class public Lo/amf;
.super Lo/ami;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amf$c;,
        Lo/amf$e;,
        Lo/amf$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Lo/ana;

.field private d:I

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/amf$c;>;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Lo/ami;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amf;->a:Landroid/content/Context;

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lo/amf;->b:I

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lo/amf;->d:I

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/amf;->e:Ljava/util/List;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amf;->c:Lo/ana;

    .line 45
    const-string v0, "unKnown"

    iput-object v0, p0, Lo/amf;->g:Ljava/lang/String;

    .line 48
    invoke-direct {p0, p1}, Lo/amf;->e(Landroid/content/Context;)V

    .line 49
    return-void
.end method

.method static synthetic b(Lo/amf;)Ljava/util/List;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/amf;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lo/amf;)Landroid/content/Context;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/amf;->a:Landroid/content/Context;

    return-object v0
.end method

.method private d(Landroid/util/SparseArray;II)Lcom/huawei/hihealth/HiDataInsertOption;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Lo/amd;>;II)Lcom/huawei/hihealth/HiDataInsertOption;"
        }
    .end annotation

    .line 126
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 127
    :cond_0
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadOneMinuteDataToEngine(),oneMinuteData==null or datas.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_1
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 132
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 135
    iget-object v6, p0, Lo/amf;->g:Ljava/lang/String;

    .line 136
    move-object v7, p0

    monitor-enter v7

    .line 138
    const/4 v8, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v8, v0, :cond_6

    .line 140
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->b()J

    move-result-wide v0

    int-to-long v2, p2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_5

    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->b()J

    move-result-wide v0

    int-to-long v2, p3

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 141
    goto/16 :goto_1

    .line 143
    :cond_2
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 144
    goto/16 :goto_1

    .line 146
    :cond_3
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->b()J

    move-result-wide v0

    iget v2, p0, Lo/amf;->d:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_4

    .line 147
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadOneMinuteDataToEngine time="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/amd;

    invoke-virtual {v2}, Lo/amd;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    :cond_4
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->b()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    mul-long v9, v0, v2

    .line 153
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0, v6, v5}, Lo/amd;->b(Ljava/lang/String;Ljava/util/List;)V

    .line 156
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    iget-object v1, p0, Lo/amf;->c:Lo/ana;

    invoke-virtual {v0, v6, v1, v5}, Lo/amd;->b(Ljava/lang/String;Lo/ana;Ljava/util/List;)V

    .line 159
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    iget-object v1, p0, Lo/amf;->c:Lo/ana;

    invoke-virtual {v0, v6, v1, v5}, Lo/amd;->c(Ljava/lang/String;Lo/ana;Ljava/util/List;)V

    .line 163
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0, v6, v5}, Lo/amd;->e(Ljava/lang/String;Ljava/util/List;)V

    .line 166
    invoke-virtual {p1, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0, v6, v5}, Lo/amd;->d(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    :cond_5
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 168
    :cond_6
    monitor-exit v7

    goto :goto_2

    :catchall_0
    move-exception v11

    monitor-exit v7

    throw v11

    .line 170
    :goto_2
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 172
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 173
    return-object v4

    .line 175
    :cond_7
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lo/amf;I)I
    .locals 0

    .line 30
    iput p1, p0, Lo/amf;->b:I

    return p1
.end method

.method private e(Landroid/content/Context;)V
    .locals 3

    .line 58
    move-object v1, p0

    monitor-enter v1

    .line 59
    :try_start_0
    iput-object p1, p0, Lo/amf;->a:Landroid/content/Context;

    .line 60
    invoke-static {}, Lo/ana;->c()Lo/ana;

    move-result-object v0

    iput-object v0, p0, Lo/amf;->c:Lo/ana;

    .line 61
    iget-object v0, p0, Lo/amf;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->c(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lo/amf;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 63
    :goto_0
    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 8

    .line 283
    move-object v4, p0

    monitor-enter v4

    .line 285
    :try_start_0
    iget v0, p0, Lo/amf;->b:I

    if-ge p1, v0, :cond_0

    .line 286
    iput p1, p0, Lo/amf;->b:I

    .line 289
    :cond_0
    iget-object v0, p0, Lo/amf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 290
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 291
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/amf$c;

    .line 292
    iget v0, v6, Lo/amf$c;->d:I

    if-ge p1, v0, :cond_1

    .line 293
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insert conflict event timeBegin "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v6, Lo/amf$c;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " timeEnd "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v6, Lo/amf$c;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    :cond_1
    goto :goto_0

    .line 297
    :cond_2
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 298
    :goto_1
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lo/amf;->g:Ljava/lang/String;

    .line 181
    return-void
.end method

.method public c()V
    .locals 12

    .line 184
    move-object v4, p0

    monitor-enter v4

    .line 185
    :try_start_0
    invoke-virtual {p0}, Lo/amf;->e()Landroid/util/SparseArray;

    move-result-object v5

    .line 186
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/16 v1, 0x50

    if-le v0, v1, :cond_3

    .line 187
    move-object v6, p0

    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 189
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->c(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v7, v0

    .line 190
    iget v0, p0, Lo/amf;->b:I

    if-ge v0, v7, :cond_0

    .line 191
    iget v7, p0, Lo/amf;->b:I

    .line 194
    :cond_0
    add-int/lit8 v7, v7, -0x78

    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v9, 0x0

    :goto_0
    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 198
    invoke-virtual {v5, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->b()J

    move-result-wide v0

    int-to-long v2, v7

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 199
    add-int/lit8 v8, v8, 0x1

    .line 196
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 202
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v5, v0, v8}, Landroid/util/SparseArray;->removeAtRange(II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v6

    :try_start_2
    throw v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    :cond_3
    :goto_1
    monitor-exit v4

    goto :goto_2

    :catchall_1
    move-exception v11

    monitor-exit v4

    throw v11

    .line 206
    :goto_2
    return-void
.end method

.method public d(Lo/amf$e;)V
    .locals 12

    .line 67
    invoke-virtual {p0}, Lo/amf;->e()Landroid/util/SparseArray;

    move-result-object v4

    .line 69
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 70
    :cond_0
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeDataToDB(),datas==null or datas.size()== 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    if-eqz p1, :cond_1

    .line 72
    invoke-interface {p1}, Lo/amf$e;->e()V

    .line 74
    :cond_1
    return-void

    .line 77
    :cond_2
    const-string v0, "Step_FlushableStepDataCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeDataToDB size "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v5, 0x0

    .line 80
    move-object v6, p0

    monitor-enter v6

    .line 81
    :try_start_0
    iget v5, p0, Lo/amf;->b:I

    .line 82
    iget-object v0, p0, Lo/amf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/amf$c;

    .line 83
    iget v0, v8, Lo/amf$c;->d:I

    if-le v0, v5, :cond_3

    .line 84
    iget v5, v8, Lo/amf$c;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :cond_3
    goto :goto_0

    .line 87
    :cond_4
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v6

    throw v9

    .line 88
    :goto_1
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/amd;

    invoke-virtual {v0}, Lo/amd;->b()J

    move-result-wide v0

    long-to-int v6, v0

    .line 91
    new-instance v7, Lo/amf$c;

    const/4 v0, 0x0

    invoke-direct {v7, v0}, Lo/amf$c;-><init>(Lo/amf$4;)V

    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v7, Lo/amf$c;->e:J

    .line 93
    iput v5, v7, Lo/amf$c;->c:I

    .line 94
    iput v6, v7, Lo/amf$c;->d:I

    .line 96
    move-object v8, p0

    monitor-enter v8

    .line 98
    :try_start_1
    iget-object v0, p0, Lo/amf;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    monitor-exit v8

    goto :goto_2

    :catchall_1
    move-exception v10

    monitor-exit v8

    throw v10

    .line 101
    :goto_2
    invoke-direct {p0, v4, v5, v6}, Lo/amf;->d(Landroid/util/SparseArray;II)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v8

    .line 104
    if-eqz v8, :cond_5

    .line 106
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/amf$a;

    invoke-direct {v1, p0, v7, p1}, Lo/amf$a;-><init>(Lo/amf;Lo/amf$c;Lo/amf$e;)V

    invoke-interface {v0, v8, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    goto :goto_3

    .line 109
    :cond_5
    invoke-interface {p1}, Lo/amf$e;->e()V

    .line 110
    move-object v9, p0

    monitor-enter v9

    .line 112
    :try_start_2
    iget-object v0, p0, Lo/amf;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 113
    iget-object v0, p0, Lo/amf;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 115
    :cond_6
    monitor-exit v9

    goto :goto_3

    :catchall_2
    move-exception v11

    monitor-exit v9

    throw v11

    .line 117
    :goto_3
    return-void
.end method

.method public e(J)V
    .locals 3

    .line 52
    move-object v1, p0

    monitor-enter v1

    .line 53
    long-to-int v0, p1

    :try_start_0
    iput v0, p0, Lo/amf;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 55
    :goto_0
    return-void
.end method
