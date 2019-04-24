.class Lcom/huawei/logupload/b;
.super Lcom/huawei/logupload/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Lcom/huawei/logupload/ExternalOperService;


# direct methods
.method constructor <init>(Lcom/huawei/logupload/ExternalOperService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/huawei/logupload/b;->f:Lcom/huawei/logupload/ExternalOperService;

    .line 58
    invoke-direct {p0}, Lcom/huawei/logupload/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;
    .locals 5

    .line 124
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v1

    .line 125
    new-instance v2, Lcom/huawei/logupload/a/c;

    invoke-direct {v2, v1}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 126
    sget-object v3, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v3

    .line 128
    :try_start_0
    invoke-static {v2, p1}, Lcom/huawei/logupload/a/a;->b(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Lcom/huawei/logupload/LogUpload;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 129
    monitor-exit v3

    return-object v4

    .line 126
    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0
.end method

.method public a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/logupload/LogUpload;>;"
        }
    .end annotation

    .line 82
    const-string v0, "ExternalOperDataBases"

    const-string v1, "queryAllRecord"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    .line 84
    new-instance v3, Lcom/huawei/logupload/a/c;

    invoke-direct {v3, v2}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 86
    sget-object v4, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v4

    .line 88
    :try_start_0
    invoke-static {v3}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 89
    monitor-exit v4

    return-object v5

    .line 86
    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0
.end method

.method public a(Lcom/huawei/logupload/LogUpload;)Z
    .locals 6

    .line 63
    const-string v0, "ExternalOperDataBases"

    const-string v1, "updateStatus"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v3

    .line 65
    new-instance v4, Lcom/huawei/logupload/a/c;

    invoke-direct {v4, v3}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 66
    sget-object v5, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v5

    .line 68
    if-eqz p1, :cond_0

    .line 69
    const-string v0, "ExternalOperDataBases"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mLogUpload.getIsPause() :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    const/4 v0, 0x1

    invoke-static {v4, p1, v0}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    monitor-exit v5

    const/4 v0, 0x1

    return v0

    .line 73
    :cond_0
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 66
    :catchall_0
    move-exception v0

    monitor-exit v5

    throw v0
.end method

.method public b(Lcom/huawei/logupload/LogUpload;)Ljava/lang/String;
    .locals 7

    .line 96
    const-string v0, "ExternalOperDataBases"

    const-string v1, "getStatus"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v3

    .line 98
    new-instance v4, Lcom/huawei/logupload/a/c;

    invoke-direct {v4, v3}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 99
    const-string v5, ""

    .line 100
    sget-object v6, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v6

    .line 102
    if-eqz p1, :cond_0

    .line 103
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 106
    :cond_0
    const-string v0, "ExternalOperDataBases"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isPause: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    monitor-exit v6

    return-object v5

    .line 100
    :catchall_0
    move-exception v0

    monitor-exit v6

    throw v0
.end method

.method public c(Lcom/huawei/logupload/LogUpload;)V
    .locals 2

    .line 113
    const-string v0, "ExternalOperDataBases"

    const-string v1, "cancelTask"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    if-eqz p1, :cond_0

    .line 117
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/logupload/k;->a(Lcom/huawei/logupload/LogUpload;Z)V

    .line 119
    :cond_0
    return-void
.end method
