.class Lcom/huawei/health/suggestion/data/DataSyncService$9;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/data/DataSyncService;->g(Lcom/huawei/health/suggestion/model/DataSync;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/model/DataSync;

.field final synthetic e:Lcom/huawei/health/suggestion/data/DataSyncService;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 0

    .line 335
    iput-object p1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->e:Lcom/huawei/health/suggestion/data/DataSyncService;

    iput-object p2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 338
    const-string v0, "DataSyncService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u5355\u52a8\u4f5c\u6700\u4f73\u8bb0\u5f55\u5931\u8d25:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c:Lcom/huawei/health/suggestion/model/DataSync;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    const/16 v0, 0x63

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3e9

    if-eq p1, v0, :cond_0

    const v0, 0x30d53

    if-ne p1, v0, :cond_1

    .line 343
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 344
    :cond_1
    const/16 v0, 0x270f

    if-eq p1, v0, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 345
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-interface {v0, v1}, Lo/bsp;->d(Lcom/huawei/health/suggestion/model/DataSync;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 346
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 348
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->e:Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 351
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->e:Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService;->d(ILjava/lang/String;)V

    .line 353
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 357
    const-string v0, "DataSyncService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u4e0a\u4f20\u5355\u52a8\u4f5c\u6700\u4f73\u8bb0\u5f55:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c:Lcom/huawei/health/suggestion/model/DataSync;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-->\u4e0a\u4f20\u6700\u4f73\u8bb0\u5f55\u6210\u529f"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->e:Lcom/huawei/health/suggestion/data/DataSyncService;

    iget-object v1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/data/DataSyncService;->b(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 359
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 335
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$9;->c(Ljava/lang/String;)V

    return-void
.end method
