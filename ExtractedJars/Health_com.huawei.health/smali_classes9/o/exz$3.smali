.class final Lo/exz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exz;->a(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ekr;

.field final synthetic d:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/ekr;[Ljava/lang/String;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lo/exz$3;->a:Lo/ekr;

    iput-object p2, p0, Lo/exz$3;->d:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 270
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 273
    const-wide/32 v5, 0x48190800

    .line 275
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 276
    :cond_0
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackBarData onResult is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iget-object v0, p0, Lo/exz$3;->a:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 278
    return-void

    .line 281
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 283
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 287
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v10

    .line 288
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    .line 289
    invoke-virtual {v12, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 290
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 291
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 292
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 294
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    add-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/ehz;

    iget-object v2, p0, Lo/exz$3;->d:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    .line 295
    invoke-virtual {v9, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/exz;->a(D)F

    move-result v2

    invoke-direct {v1, v2}, Lo/ehz;-><init>(F)V

    .line 294
    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    goto :goto_0

    .line 297
    :cond_2
    iget-object v0, p0, Lo/exz$3;->a:Lo/ekr;

    invoke-interface {v0, p2, v4}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 298
    return-void
.end method
