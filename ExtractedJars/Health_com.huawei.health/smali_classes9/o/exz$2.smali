.class final Lo/exz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exz;->b(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V
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

    .line 212
    iput-object p1, p0, Lo/exz$2;->a:Lo/ekr;

    iput-object p2, p0, Lo/exz$2;->d:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 219
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 221
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 222
    :cond_0
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackBarData onResult is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lo/exz$2;->a:Lo/ekr;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 224
    return-void

    .line 227
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 229
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 233
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 234
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 235
    invoke-virtual {v10, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 236
    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-virtual {v10, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 237
    const/4 v0, 0x5

    const/16 v1, 0x1e

    invoke-virtual {v10, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 238
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 239
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 240
    invoke-virtual {v10}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/ehz;

    iget-object v2, p0, Lo/exz$2;->d:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v7, v2}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Lo/exz;->a(D)F

    move-result v2

    invoke-direct {v1, v2}, Lo/ehz;-><init>(F)V

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    goto :goto_0

    .line 242
    :cond_2
    iget-object v0, p0, Lo/exz$2;->a:Lo/ekr;

    invoke-interface {v0, p2, v4}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 243
    return-void
.end method
