.class public Lcom/huawei/updatesdk/service/deamon/download/b;
.super Lcom/huawei/updatesdk/sdk/service/download/c;


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/updatesdk/support/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".DownloadDiskSpacePolicy"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/service/deamon/download/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)Lcom/huawei/updatesdk/sdk/service/download/c$a;
    .locals 9

    new-instance v6, Lcom/huawei/updatesdk/sdk/service/download/c$a;

    invoke-direct {v6}, Lcom/huawei/updatesdk/sdk/service/download/c$a;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(Z)V

    invoke-static {}, Lcom/huawei/updatesdk/support/b/c;->a()Lcom/huawei/updatesdk/support/b/b;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual {v7}, Lcom/huawei/updatesdk/support/b/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/updatesdk/support/b/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/huawei/updatesdk/support/b/b;->b()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(J)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, v6

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/updatesdk/service/deamon/download/b;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Lcom/huawei/updatesdk/sdk/service/download/c$a;JZ)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(Z)V

    :cond_0
    invoke-virtual {v6}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, v6}, Lcom/huawei/updatesdk/service/deamon/download/b;->a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Lcom/huawei/updatesdk/sdk/service/download/c$a;)V

    :cond_1
    return-object v6
.end method

.method public a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Lcom/huawei/updatesdk/sdk/service/download/c$a;)V
    .locals 2

    const-string v0, "DownloadDiskSpacePolicy"

    const-string v1, "onSpaceNotEnough"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Ljava/lang/String;)V
    .locals 2

    const-string v0, "DownloadDiskSpacePolicy"

    const-string v1, "onWriteEnd"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected a(JJ)Z
    .locals 2

    const-wide/32 v0, 0x500000

    add-long/2addr v0, p1

    cmp-long v0, v0, p3

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Lcom/huawei/updatesdk/sdk/service/download/c$a;JZ)Z
    .locals 7

    invoke-virtual {p2}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->b()J

    move-result-wide v0

    add-long v4, v0, p3

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->t()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p0, v0, v1, v4, v5}, Lcom/huawei/updatesdk/service/deamon/download/b;->a(JJ)Z

    move-result v6

    return v6
.end method
