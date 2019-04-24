.class public Lo/dmp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dmp$e;
    }
.end annotation


# static fields
.field private static final c:Lo/dmp;

.field private static final d:Ljava/lang/Object;

.field private static final h:Ljava/lang/Object;


# instance fields
.field private a:Lo/dmk;

.field private b:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dml;>;"
        }
    .end annotation
.end field

.field private f:Lo/dln;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Lo/dmp;

    invoke-direct {v0}, Lo/dmp;-><init>()V

    sput-object v0, Lo/dmp;->c:Lo/dmp;

    .line 48
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dmp;->d:Ljava/lang/Object;

    .line 58
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dmp;->h:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {}, Lo/dmk;->b()Lo/dmk;

    move-result-object v0

    iput-object v0, p0, Lo/dmp;->a:Lo/dmk;

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dmp;->e:Ljava/util/List;

    .line 68
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dmp;->b:Landroid/content/Context;

    .line 69
    iget-object v0, p0, Lo/dmp;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dmp;->f:Lo/dln;

    .line 70
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 105
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 106
    const-string p1, ""

    .line 108
    :cond_0
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/dmp;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lo/dmp;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 288
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter notifyUserLabelSmarter "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    sget-object v4, Lo/dmp;->h:Ljava/lang/Object;

    monitor-enter v4

    .line 290
    :try_start_0
    iget-object v0, p0, Lo/dmp;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dml;

    .line 291
    invoke-interface {v6, p1}, Lo/dml;->c(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    goto :goto_0

    .line 293
    :cond_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 294
    :goto_1
    return-void
.end method

.method private a(Lo/dmd;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dmd<Ljava/util/List<Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 131
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "to request server"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    new-instance v4, Lo/dmp$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lo/dmp$e;-><init>(Lo/dmp;Lo/dmp$3;)V

    .line 134
    iget-object v0, p0, Lo/dmp;->a:Lo/dmk;

    new-instance v1, Lo/dmm;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dmm;-><init>(I)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/dmk;->c(ILo/dmj;)V

    .line 135
    iget-object v0, p0, Lo/dmp;->a:Lo/dmk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4}, Lo/dmk;->e(ILo/dmi;)V

    .line 138
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 141
    iget-object v0, p0, Lo/dmp;->a:Lo/dmk;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v5, p1}, Lo/dmk;->c(ILjava/util/Map;Lo/dmd;)V

    .line 142
    return-void
.end method

.method static synthetic a(Lo/dmp;Ljava/util/Map;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Lo/dmp;->a(Ljava/util/Map;)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Lo/cwz;)I
    .locals 5

    .line 153
    invoke-direct {p0}, Lo/dmp;->e()Ljava/lang/String;

    move-result-object v4

    .line 154
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get huid failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    const/16 v0, -0x3ea

    return v0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lo/dcy;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lo/dcy;-><init>(I)V

    invoke-virtual {p3, v0, p2, v1}, Lo/cwz;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    return v0
.end method

.method private b(Ljava/util/List;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 219
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 220
    :cond_0
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userLabels none!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const-string v0, ""

    return-object v0

    .line 225
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 226
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 230
    :cond_2
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 233
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 235
    const/4 v5, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 236
    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 237
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 235
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 240
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/dmp;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/dmp;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lo/dmp;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Lo/dmp;->e(Ljava/util/List;Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/dmp;)Lo/dmk;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dmp;->a:Lo/dmk;

    return-object v0
.end method

.method public static b()Lo/dmp;
    .locals 1

    .line 73
    sget-object v0, Lo/dmp;->c:Lo/dmp;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/Object;
    .locals 1

    .line 31
    sget-object v0, Lo/dmp;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lo/dmp;)Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dmp;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lo/dmp;Ljava/lang/String;Lo/cwz;)Ljava/lang/String;
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Lo/dmp;->e(Ljava/lang/String;Lo/cwz;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/dmp;Ljava/util/List;)Ljava/lang/String;
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lo/dmp;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(JJ)Z
    .locals 4

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 120
    sub-long v0, v2, p1

    cmp-long v0, v0, p3

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic d(Lo/dmp;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dmp;->b:Landroid/content/Context;

    return-object v0
.end method

.method private d()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 89
    const-string v0, "_userLabel_key"

    iget-object v1, p0, Lo/dmp;->f:Lo/dln;

    invoke-direct {p0, v0, v1}, Lo/dmp;->e(Ljava/lang/String;Lo/cwz;)Ljava/lang/String;

    move-result-object v2

    .line 90
    invoke-direct {p0, v2}, Lo/dmp;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lo/dmp;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;Lo/cwz;)Ljava/lang/String;
    .locals 7

    .line 171
    sget-object v4, Lo/dmp;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 172
    :try_start_0
    invoke-direct {p0}, Lo/dmp;->e()Ljava/lang/String;

    move-result-object v5

    .line 173
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get huid failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/cwz;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    .line 179
    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6
.end method

.method static synthetic e(Lo/dmp;)Ljava/util/List;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dmp;->e:Ljava/util/List;

    return-object v0
.end method

.method private e(Ljava/util/List;Ljava/util/List;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 300
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter diff : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&&"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 302
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 303
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 305
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 307
    invoke-interface {p2, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 308
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    :cond_0
    goto :goto_0

    .line 311
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 312
    invoke-interface {p1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 313
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    :cond_2
    goto :goto_1

    .line 316
    :cond_3
    const/4 v7, 0x1

    .line 317
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 318
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    const/4 v7, 0x0

    .line 322
    :cond_4
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 323
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    if-nez v7, :cond_5

    .line 325
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    :cond_5
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    return-object v4
.end method

.method private e(Ljava/util/Map;Lo/cwz;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lo/cwz;)Z"
        }
    .end annotation

    .line 189
    sget-object v4, Lo/dmp;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 190
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 191
    :cond_0
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no values to cache!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 194
    :cond_1
    :try_start_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 195
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 196
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 197
    if-eqz v7, :cond_2

    if-eqz v8, :cond_2

    .line 198
    invoke-direct {p0, v7, v8, p2}, Lo/dmp;->b(Ljava/lang/String;Ljava/lang/String;Lo/cwz;)I

    move-result v9

    .line 199
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 200
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 201
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 204
    :cond_2
    goto :goto_0

    .line 206
    :cond_3
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 207
    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10
.end method

.method static synthetic e(Lo/dmp;Ljava/util/Map;Lo/cwz;)Z
    .locals 1

    .line 31
    invoke-direct {p0, p1, p2}, Lo/dmp;->e(Ljava/util/Map;Lo/cwz;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 94
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter doRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const-string v0, "_cacheTime_key"

    iget-object v1, p0, Lo/dmp;->f:Lo/dln;

    invoke-direct {p0, v0, v1}, Lo/dmp;->e(Ljava/lang/String;Lo/cwz;)Ljava/lang/String;

    move-result-object v4

    .line 96
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    invoke-direct {p0, v0, v1, v2, v3}, Lo/dmp;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    :cond_0
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "not cached yet! or cache expired! "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dmp;->a(Lo/dmd;)V

    goto :goto_0

    .line 100
    :cond_1
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cache not expired"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    :goto_0
    return-void
.end method

.method public c(Lo/dml;)V
    .locals 1

    .line 270
    new-instance v0, Lo/dmp$5;

    invoke-direct {v0, p0, p1}, Lo/dmp$5;-><init>(Lo/dmp;Lo/dml;)V

    .line 279
    invoke-virtual {v0}, Lo/dmp$5;->start()V

    .line 281
    return-void
.end method

.method public d(Lo/dml;)V
    .locals 1

    .line 255
    new-instance v0, Lo/dmp$3;

    invoke-direct {v0, p0, p1}, Lo/dmp$3;-><init>(Lo/dmp;Lo/dml;)V

    .line 265
    invoke-virtual {v0}, Lo/dmp$3;->start()V

    .line 267
    return-void
.end method

.method public e(Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 77
    invoke-direct {p0}, Lo/dmp;->d()Ljava/util/List;

    move-result-object v4

    .line 78
    const-string v0, "SMART_UserLabelPuller"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "all Label is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "&& "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 80
    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    const/4 v0, 0x1

    return v0

    .line 83
    :cond_0
    goto :goto_0

    .line 85
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
