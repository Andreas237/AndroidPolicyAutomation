.class public Lo/bpk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lo/bpk;


# instance fields
.field private c:J

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lo/bpk;->b:Lo/bpk;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bpk;->c:J

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bpk;->d:Z

    return-void
.end method

.method public static declared-synchronized b()Lo/bpk;
    .locals 3

    const-class v1, Lo/bpk;

    monitor-enter v1

    .line 55
    :try_start_0
    sget-object v0, Lo/bpk;->b:Lo/bpk;

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Lo/bpk;

    invoke-direct {v0}, Lo/bpk;-><init>()V

    sput-object v0, Lo/bpk;->b:Lo/bpk;

    .line 59
    :cond_0
    sget-object v0, Lo/bpk;->b:Lo/bpk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d()Z
    .locals 7

    .line 67
    const/4 v4, 0x1

    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 69
    iget-wide v0, p0, Lo/bpk;->c:J

    sub-long v0, v5, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 71
    const/4 v4, 0x0

    goto :goto_0

    .line 75
    :cond_0
    iput-wide v5, p0, Lo/bpk;->c:J

    .line 76
    const/4 v4, 0x1

    .line 78
    :goto_0
    return v4
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 4

    .line 122
    const/4 v1, 0x1

    .line 123
    if-eqz p1, :cond_2

    .line 125
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->p()[Ljava/lang/String;

    move-result-object v2

    .line 126
    if-nez v2, :cond_0

    .line 127
    return v1

    .line 129
    :cond_0
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_2

    .line 131
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {p1, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object p1

    .line 132
    aget-object v0, v2, v3

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    const/4 v1, 0x0

    .line 135
    goto :goto_1

    .line 129
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 139
    :cond_2
    :goto_1
    return v1
.end method

.method public c()V
    .locals 2

    .line 180
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bpk;->c:J

    .line 181
    return-void
.end method

.method public c(Landroid/content/Context;)Z
    .locals 5

    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-direct {p0}, Lo/bpk;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 98
    invoke-static {p1, v3}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 100
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 102
    const/4 v2, 0x0

    .line 105
    :cond_0
    iput-boolean v2, p0, Lo/bpk;->d:Z

    goto :goto_0

    .line 109
    :cond_1
    iget-boolean v2, p0, Lo/bpk;->d:Z

    .line 111
    :goto_0
    return v2
.end method

.method public d(Landroid/content/Context;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 163
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 164
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 168
    invoke-static {p1, v3}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 170
    :cond_0
    return-object v2
.end method

.method public d(Ljava/lang/String;)Z
    .locals 1

    .line 150
    invoke-virtual {p0, p1}, Lo/bpk;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
