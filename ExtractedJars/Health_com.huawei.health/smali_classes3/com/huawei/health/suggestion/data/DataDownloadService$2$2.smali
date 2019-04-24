.class Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/suggestion/model/fitness/IResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/data/DataDownloadService$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/data/DataDownloadService$2;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/data/DataDownloadService$2;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;->b:Lcom/huawei/health/suggestion/data/DataDownloadService$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 46
    const-string v0, "Suggestion_DataDownloadService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadFitnessData resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " object "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;->b:Lcom/huawei/health/suggestion/data/DataDownloadService$2;

    iget-object v0, v0, Lcom/huawei/health/suggestion/data/DataDownloadService$2;->a:Lcom/huawei/health/suggestion/data/DataDownloadService;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/data/DataDownloadService;->d(Lcom/huawei/health/suggestion/data/DataDownloadService;Z)Z

    .line 48
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    invoke-virtual {v0}, Lo/btj;->a()Ljava/util/ArrayList;

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;->b:Lcom/huawei/health/suggestion/data/DataDownloadService$2;

    iget-object v0, v0, Lcom/huawei/health/suggestion/data/DataDownloadService$2;->a:Lcom/huawei/health/suggestion/data/DataDownloadService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/data/DataDownloadService;->b(Lcom/huawei/health/suggestion/data/DataDownloadService;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;->b:Lcom/huawei/health/suggestion/data/DataDownloadService$2;

    iget-object v0, v0, Lcom/huawei/health/suggestion/data/DataDownloadService$2;->a:Lcom/huawei/health/suggestion/data/DataDownloadService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/data/DataDownloadService;->a(Lcom/huawei/health/suggestion/data/DataDownloadService;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;->b:Lcom/huawei/health/suggestion/data/DataDownloadService$2;

    iget-object v0, v0, Lcom/huawei/health/suggestion/data/DataDownloadService$2;->a:Lcom/huawei/health/suggestion/data/DataDownloadService;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DataDownloadService;->stopSelf()V

    .line 52
    :cond_0
    return-void
.end method
