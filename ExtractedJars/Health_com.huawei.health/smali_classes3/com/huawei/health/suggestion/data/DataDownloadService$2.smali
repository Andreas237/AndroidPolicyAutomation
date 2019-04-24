.class Lcom/huawei/health/suggestion/data/DataDownloadService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/data/DataDownloadService;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/data/DataDownloadService;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/data/DataDownloadService;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/health/suggestion/data/DataDownloadService$2;->a:Lcom/huawei/health/suggestion/data/DataDownloadService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 43
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/data/DataDownloadService$2$2;-><init>(Lcom/huawei/health/suggestion/data/DataDownloadService$2;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadFitnessRecordFromCloud(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 54
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/data/DataDownloadService$2$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/data/DataDownloadService$2$1;-><init>(Lcom/huawei/health/suggestion/data/DataDownloadService$2;)V

    invoke-virtual {v0, v1}, Lo/btj;->b(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 65
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/data/DataDownloadService$2$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/data/DataDownloadService$2$5;-><init>(Lcom/huawei/health/suggestion/data/DataDownloadService$2;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lo/brt;->e(ILo/bui;)V

    .line 76
    return-void
.end method
