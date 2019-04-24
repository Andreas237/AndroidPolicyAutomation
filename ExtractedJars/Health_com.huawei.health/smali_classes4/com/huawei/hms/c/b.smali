.class public abstract Lcom/huawei/hms/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hms/c/b;->a:Z

    .line 31
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/hms/c/b;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Ljava/lang/String;JI)V
    .locals 3

    .line 99
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    sget-boolean v0, Lcom/huawei/hms/c/b;->a:Z

    if-nez v0, :cond_1

    .line 103
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 107
    const-string v0, "FileUtil"

    const-string v1, "file delete failed."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/hms/c/b;->a:Z

    .line 113
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x2800

    invoke-static {p2, v0, v1, v2}, Lcom/huawei/hms/c/b;->a(Ljava/io/File;Ljava/lang/String;J)V

    .line 116
    :cond_2
    return-void
.end method

.method public static a(Ljava/io/File;Ljava/lang/String;J)V
    .locals 2

    .line 35
    sget-object v0, Lcom/huawei/hms/c/b;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/huawei/hms/c/c;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/huawei/hms/c/c;-><init>(Ljava/io/File;JLjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 85
    return-void
.end method
