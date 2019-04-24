.class Lcom/huawei/health/suggestion/data/DataSyncService$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/data/DataSyncService;->a(Lcom/huawei/health/suggestion/model/DataSync;)V
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
.field final synthetic c:Lcom/huawei/health/suggestion/data/DataSyncService;

.field final synthetic d:Lcom/huawei/health/suggestion/model/DataSync;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c:Lcom/huawei/health/suggestion/data/DataSyncService;

    iput-object p2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->d:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 228
    const-string v0, "DataSyncService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u7528\u6237\u4e0b\u8f7d/\u4f7f\u7528\u953b\u70bc\u89c6\u9891\u4fe1\u606f\u4e0a\u62a5\u5931\u8d25:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->d:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/DataSync;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    const/16 v0, 0x63

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_1

    .line 232
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 233
    :cond_1
    const/16 v0, 0x270f

    if-eq p1, v0, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 234
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->d:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-interface {v0, v1}, Lo/bsp;->d(Lcom/huawei/health/suggestion/model/DataSync;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 235
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 237
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c:Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService;->d(ILjava/lang/String;)V

    goto :goto_0

    .line 240
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c:Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService;->d(ILjava/lang/String;)V

    .line 242
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 246
    const-string v0, "DataSyncService"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6570\u636e\u540c\u6b65 \u7528\u6237\u4e0b\u8f7d/\u4f7f\u7528\u953b\u70bc\u89c6\u9891\u4fe1\u606f\u4e0a\u62a5:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->d:Lcom/huawei/health/suggestion/model/DataSync;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-->\u7528\u6237\u4e0b\u8f7d/\u4f7f\u7528\u953b\u70bc\u89c6\u9891\u4fe1\u606f\u6210\u529f"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c:Lcom/huawei/health/suggestion/data/DataSyncService;

    iget-object v1, p0, Lcom/huawei/health/suggestion/data/DataSyncService$2;->d:Lcom/huawei/health/suggestion/model/DataSync;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/data/DataSyncService;->b(Lcom/huawei/health/suggestion/data/DataSyncService;Lcom/huawei/health/suggestion/model/DataSync;)V

    .line 248
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 225
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$2;->c(Ljava/lang/String;)V

    return-void
.end method
