.class public abstract Lo/amg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amg$c;
    }
.end annotation


# instance fields
.field protected a:Landroid/content/Context;

.field protected c:Z

.field protected d:Lo/amg$c;

.field private final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amg;->a:Landroid/content/Context;

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amg;->c:Z

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/amg;->e:Ljava/lang/Object;

    .line 27
    iget-object v3, p0, Lo/amg;->e:Ljava/lang/Object;

    monitor-enter v3

    .line 29
    :try_start_0
    new-instance v0, Lo/amg$c;

    invoke-direct {v0}, Lo/amg$c;-><init>()V

    iput-object v0, p0, Lo/amg;->d:Lo/amg$c;

    .line 30
    iget-object v0, p0, Lo/amg;->d:Lo/amg$c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/amg$c;->e(J)V

    .line 32
    iput-object p1, p0, Lo/amg;->a:Landroid/content/Context;

    .line 33
    iget-object v0, p0, Lo/amg;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->b(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lo/amg;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 35
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 54
    iget-object v4, p0, Lo/amg;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 55
    const-string v0, "Step_SingleDayBaseManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reduceClass"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amg;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 58
    :goto_0
    return-void
.end method

.method protected b(JJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 39
    invoke-static {p1, p2, p3, p4}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 40
    const-string v0, "Step_SingleDayBaseManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataConsistency not today timeStampBase="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " timeStampArg="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 41
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 40
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "not today record"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    invoke-static {p3, p4}, Lo/amz;->c(J)J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-eqz v0, :cond_1

    .line 46
    const-string v0, "Step_SingleDayBaseManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkDataConsistency is same day,but timeZone changed!!! timeStampBase="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " timeStampArg="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 48
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    .line 46
    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "same day,but timeZone changed!!!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 51
    :cond_1
    return-void
.end method
