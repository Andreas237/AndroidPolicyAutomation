.class Lcom/huawei/hwid/core/d/b/d$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/d/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/huawei/hwid/core/d/b/d$a;->a:Landroid/content/Context;

    .line 45
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 48
    const-string v3, ""

    .line 50
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/d$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/b$a;->a(Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v3

    .line 58
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/d$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/b$a;->c(Landroid/content/Context;)V

    .line 59
    goto :goto_0

    .line 51
    :catch_0
    move-exception v4

    .line 52
    const-string v0, "hwid"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ArrayIndexOutOfBoundsException"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/d$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/b$a;->c(Landroid/content/Context;)V

    .line 53
    return-void

    .line 54
    :catch_1
    move-exception v4

    .line 55
    const-string v0, "hwid"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/d$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/b$a;->c(Landroid/content/Context;)V

    .line 56
    return-void

    .line 58
    :catchall_0
    move-exception v5

    iget-object v0, p0, Lcom/huawei/hwid/core/d/b/d$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/b$a;->c(Landroid/content/Context;)V

    throw v5

    .line 61
    :goto_0
    const-string v0, "hwid"

    const-string v1, "deleteLogFile"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    invoke-static {v3}, Lcom/huawei/hwid/core/d/b/d;->a(Ljava/lang/String;)V

    .line 64
    invoke-static {}, Lcom/huawei/hwid/core/d/b/d;->a()Lcom/huawei/hwid/core/d/b/a;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    const-string v2, "hwid_advanced_log.txt"

    invoke-direct {v1, v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/d/b/a;->a(Ljava/io/File;)V

    .line 65
    invoke-static {}, Lcom/huawei/hwid/core/d/b/d;->a()Lcom/huawei/hwid/core/d/b/a;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b/c;->a(Lcom/huawei/hwid/core/d/b/c$a;)V

    .line 66
    return-void
.end method
