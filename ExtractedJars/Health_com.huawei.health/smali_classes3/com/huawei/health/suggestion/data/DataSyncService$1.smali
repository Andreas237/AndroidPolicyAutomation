.class Lcom/huawei/health/suggestion/data/DataSyncService$1;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/data/DataSyncService;->d(Lcom/huawei/health/suggestion/model/DataSync;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/data/DataSyncService;

.field final synthetic c:Lcom/huawei/health/suggestion/model/DataSync;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$1;->a:Lcom/huawei/health/suggestion/data/DataSyncService;

    iput-object p2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$1;->c:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 120
    const-string v0, "DataSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postDeleteRecordDelete onSuccess data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$1;->a:Lcom/huawei/health/suggestion/data/DataSyncService;

    iget-object v1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$1;->c:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/data/DataSyncService;->b(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 122
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 114
    const-string v0, "DataSyncService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postDeleteRecordDelete onFailure errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", errorInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$1;->a:Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService;->d(ILjava/lang/String;)V

    .line 116
    return-void
.end method
