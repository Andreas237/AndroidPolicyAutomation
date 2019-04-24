.class public Lo/cqm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqm$b;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private c:Lo/cpb;

.field private final e:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cqm;->e:Ljava/lang/Object;

    .line 28
    sget-object v0, Lo/cqm;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpb;->e(Landroid/content/Context;)Lo/cpb;

    move-result-object v0

    iput-object v0, p0, Lo/cqm;->c:Lo/cpb;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Lo/cqm$5;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/cqm;-><init>()V

    return-void
.end method

.method private b(Lo/cnz;)I
    .locals 8

    .line 67
    invoke-static {p1}, Lo/cpi;->b(Lo/cnz;)Landroid/content/ContentValues;

    move-result-object v6

    .line 68
    iget-object v0, p0, Lo/cqm;->c:Lo/cpb;

    invoke-direct {p0}, Lo/cqm;->e()Ljava/lang/String;

    move-result-object v1

    .line 69
    invoke-virtual {p1}, Lo/cnz;->e()I

    move-result v2

    invoke-virtual {p1}, Lo/cnz;->a()J

    move-result-wide v3

    invoke-virtual {p1}, Lo/cnz;->b()I

    move-result v5

    invoke-direct {p0, v2, v3, v4, v5}, Lo/cqm;->e(IJI)[Ljava/lang/String;

    move-result-object v2

    .line 68
    invoke-virtual {v0, v6, v1, v2}, Lo/cpb;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    .line 70
    const-string v0, "Debug_SyncAnchorManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateClientData() update  update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    return v7
.end method

.method private d(Lo/cnz;)J
    .locals 5

    .line 61
    const-string v0, "Debug_SyncAnchorManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSyncAnchor()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {p1}, Lo/cpi;->b(Lo/cnz;)Landroid/content/ContentValues;

    move-result-object v4

    .line 63
    iget-object v0, p0, Lo/cqm;->c:Lo/cpb;

    invoke-virtual {v0, v4}, Lo/cpb;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 110
    const-string v0, "main_user_id =? and cloud_code =? and sync_data_type =? "

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/cqm;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqm;->d:Landroid/content/Context;

    .line 41
    sget-object v0, Lo/cqm$b;->a:Lo/cqm;

    return-object v0
.end method

.method private e(IJI)[Ljava/lang/String;
    .locals 3

    .line 116
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method


# virtual methods
.method public a(IJI)Lo/cnz;
    .locals 7

    .line 51
    iget-object v0, p0, Lo/cqm;->c:Lo/cpb;

    invoke-direct {p0}, Lo/cqm;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2, p3, p4}, Lo/cqm;->e(IJI)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpb;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 52
    invoke-static {v6}, Lo/cph;->w(Landroid/database/Cursor;)Lo/cnz;

    move-result-object v0

    return-object v0
.end method

.method public b(IIJJ)Z
    .locals 5

    .line 90
    new-instance v4, Lo/cnz;

    invoke-direct {v4}, Lo/cnz;-><init>()V

    .line 91
    invoke-virtual {v4, p3, p4}, Lo/cnz;->c(J)V

    .line 92
    invoke-virtual {v4, p1}, Lo/cnz;->e(I)V

    .line 93
    invoke-virtual {v4, p2}, Lo/cnz;->a(I)V

    .line 94
    invoke-virtual {v4, p5, p6}, Lo/cnz;->a(J)V

    .line 95
    const-string v0, "Debug_SyncAnchorManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveVersionToDB syncAnchorTable is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    invoke-virtual {p0, v4}, Lo/cqm;->e(Lo/cnz;)Z

    move-result v0

    return v0
.end method

.method public c(IJI)Lo/cnz;
    .locals 7

    .line 56
    iget-object v0, p0, Lo/cqm;->c:Lo/cpb;

    invoke-direct {p0}, Lo/cqm;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2, p3, p4}, Lo/cqm;->e(IJI)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpb;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 57
    invoke-static {v6}, Lo/cph;->y(Landroid/database/Cursor;)Lo/cnz;

    move-result-object v0

    return-object v0
.end method

.method public d(IJI)Z
    .locals 7

    .line 46
    iget-object v0, p0, Lo/cqm;->c:Lo/cpb;

    invoke-direct {p0}, Lo/cqm;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2, p3, p4}, Lo/cqm;->e(IJI)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpb;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 47
    invoke-static {v6}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method

.method public e(IIIJ)Z
    .locals 5

    .line 100
    new-instance v4, Lo/cnz;

    invoke-direct {v4}, Lo/cnz;-><init>()V

    .line 101
    invoke-virtual {v4, p3}, Lo/cnz;->c(I)V

    .line 102
    invoke-virtual {v4, p1}, Lo/cnz;->e(I)V

    .line 103
    invoke-virtual {v4, p2}, Lo/cnz;->a(I)V

    .line 104
    invoke-virtual {v4, p4, p5}, Lo/cnz;->a(J)V

    .line 105
    const-string v0, "Debug_SyncAnchorManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSyncTimeToDB syncAnchorTable is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-virtual {p0, v4}, Lo/cqm;->e(Lo/cnz;)Z

    move-result v0

    return v0
.end method

.method public e(Lo/cnz;)Z
    .locals 8

    .line 76
    iget-object v4, p0, Lo/cqm;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 78
    const-string v0, "Debug_SyncAnchorManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveVersionToDB syncAnchorTable is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-virtual {p1}, Lo/cnz;->e()I

    move-result v0

    invoke-virtual {p1}, Lo/cnz;->a()J

    move-result-wide v1

    invoke-virtual {p1}, Lo/cnz;->b()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/cqm;->d(IJI)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    invoke-direct {p0, p1}, Lo/cqm;->b(Lo/cnz;)I

    move-result v0

    int-to-long v5, v0

    goto :goto_0

    .line 82
    :cond_0
    const-string v0, "Debug_SyncAnchorManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!!saveVersionToDB syncAnchorTable is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-direct {p0, p1}, Lo/cqm;->d(Lo/cnz;)J

    move-result-wide v5

    .line 85
    :goto_0
    invoke-static {v5, v6}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v4

    return v0

    .line 86
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method
