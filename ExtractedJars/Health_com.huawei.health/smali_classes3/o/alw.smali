.class public Lo/alw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/als;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/alw$d;
    }
.end annotation


# static fields
.field private static e:Ljava/util/concurrent/Executor;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/alw$d;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/alw;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/alw;->a:Ljava/util/List;

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "sdcard"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huawei"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 38
    const/4 v0, 0x5

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "log.0"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    const-string v0, "log.1"

    const/4 v1, 0x1

    aput-object v0, v5, v1

    const-string v0, "log.2"

    const/4 v1, 0x2

    aput-object v0, v5, v1

    const-string v0, "log.3"

    const/4 v1, 0x3

    aput-object v0, v5, v1

    const-string v0, "log.4"

    const/4 v1, 0x4

    aput-object v0, v5, v1

    .line 39
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    new-instance v1, Lo/alw$d;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v5}, Lo/alw$d;-><init>(Ljava/io/File;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "com.huawei.health_DaemonService"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 42
    const/4 v0, 0x5

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "log.0"

    const/4 v1, 0x0

    aput-object v0, v6, v1

    const-string v0, "log.1"

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const-string v0, "log.2"

    const/4 v1, 0x2

    aput-object v0, v6, v1

    const-string v0, "log.3"

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const-string v0, "log.4"

    const/4 v1, 0x4

    aput-object v0, v6, v1

    .line 43
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    new-instance v1, Lo/alw$d;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v6}, Lo/alw$d;-><init>(Ljava/io/File;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "com.huawei.health_leakcanary"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 46
    const/4 v0, 0x5

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "log.0"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "log.1"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const-string v0, "log.2"

    const/4 v1, 0x2

    aput-object v0, v7, v1

    const-string v0, "log.3"

    const/4 v1, 0x3

    aput-object v0, v7, v1

    const-string v0, "log.4"

    const/4 v1, 0x4

    aput-object v0, v7, v1

    .line 47
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    new-instance v1, Lo/alw$d;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v7}, Lo/alw$d;-><init>(Ljava/io/File;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "com.huawei.health_pushservice"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 50
    const/4 v0, 0x5

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "log.0"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    const-string v0, "log.1"

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const-string v0, "log.2"

    const/4 v1, 0x2

    aput-object v0, v8, v1

    const-string v0, "log.3"

    const/4 v1, 0x3

    aput-object v0, v8, v1

    const-string v0, "log.4"

    const/4 v1, 0x4

    aput-object v0, v8, v1

    .line 51
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    new-instance v1, Lo/alw$d;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v8}, Lo/alw$d;-><init>(Ljava/io/File;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    move-object v4, v3

    .line 54
    const/4 v0, 0x4

    new-array v9, v0, [Ljava/lang/String;

    const-string v0, "huawei_crashLog_0.txt"

    const/4 v1, 0x0

    aput-object v0, v9, v1

    const-string v0, "huawei_crashLog_1.txt"

    const/4 v1, 0x1

    aput-object v0, v9, v1

    const-string v0, "huawei_crashLog_2.txt"

    const/4 v1, 0x2

    aput-object v0, v9, v1

    const-string v0, "leak.txt"

    const/4 v1, 0x3

    aput-object v0, v9, v1

    .line 55
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    new-instance v1, Lo/alw$d;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v9}, Lo/alw$d;-><init>(Ljava/io/File;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    return-void
.end method

.method public static a()V
    .locals 2

    .line 72
    sget-object v0, Lo/alw;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lo/alw$5;

    invoke-direct {v1}, Lo/alw$5;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 82
    return-void
.end method

.method private c()V
    .locals 3

    .line 86
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 87
    iget-object v0, p0, Lo/alw;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/alw$d;

    .line 88
    invoke-direct {p0, v1}, Lo/alw;->e(Lo/alw$d;)V

    .line 86
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 90
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/alw;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lo/alw;->c()V

    return-void
.end method

.method private e(Lo/alw$d;)V
    .locals 6

    .line 94
    if-eqz p1, :cond_0

    iget-object v0, p1, Lo/alw$d;->d:Ljava/io/File;

    if-nez v0, :cond_1

    .line 95
    :cond_0
    return-void

    .line 98
    :cond_1
    const-string v0, "Step_Migration_V2_1_TO_V2_2"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p1, Lo/alw$d;->d:Ljava/io/File;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " check"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p1, Lo/alw$d;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 100
    return-void

    .line 102
    :cond_2
    const-string v0, "Step_Migration_V2_1_TO_V2_2"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p1, Lo/alw$d;->d:Ljava/io/File;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " exist"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p1, Lo/alw$d;->b:[Ljava/lang/String;

    array-length v0, v0

    if-ge v4, v0, :cond_4

    .line 104
    new-instance v5, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lo/alw$d;->d:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lo/alw$d;->b:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 106
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_3

    .line 107
    const-string v0, "Step_Migration_V2_1_TO_V2_2"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "file delte failed:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 112
    :cond_4
    iget-object v0, p1, Lo/alw$d;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v4

    .line 114
    if-nez v4, :cond_5

    .line 115
    const-string v0, "Step_Migration_V2_1_TO_V2_2"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileDeleteList.dir.list ret null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 119
    :cond_5
    const/4 v5, 0x0

    :goto_1
    array-length v0, v4

    if-ge v5, v0, :cond_6

    .line 120
    const-string v0, "Step_Migration_V2_1_TO_V2_2"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exist:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    aget-object v2, v4, v5

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 124
    :cond_6
    array-length v0, v4

    if-nez v0, :cond_7

    .line 125
    iget-object v0, p1, Lo/alw$d;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_7

    .line 126
    const-string v0, "Step_Migration_V2_1_TO_V2_2"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "file delte failed:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p1, Lo/alw$d;->d:Ljava/io/File;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    :cond_7
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 60
    const-string v0, "Athene2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    const/4 v0, 0x1

    return v0

    .line 63
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 68
    const-string v0, "Athene3"

    invoke-static {p1, v0}, Lo/amy;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    return-void
.end method
