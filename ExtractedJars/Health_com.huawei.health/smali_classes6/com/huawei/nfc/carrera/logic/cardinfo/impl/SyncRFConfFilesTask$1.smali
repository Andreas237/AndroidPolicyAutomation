.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalRFConfCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public refreshPicResult(I)V
    .locals 4

    .line 80
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " refreshRFConfFile result. refreshResultCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void
.end method

.method public refreshPicResult(Ljava/lang/String;I)V
    .locals 5

    .line 86
    const-string v0, "SyncRFConfFilesTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " refreshRFConfFile result. issuerId : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " refreshResultCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    const/4 v4, 0x1

    .line 88
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 90
    const/4 v4, 0x1

    goto :goto_0

    .line 92
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 94
    const/4 v4, 0x0

    goto :goto_0

    .line 98
    :cond_1
    const/4 v4, 0x3

    .line 100
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/SyncRFConfFilesTask;)Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;

    move-result-object v1

    invoke-virtual {v0, v4, p1, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleSyncRFConfFileResult(ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;)V

    .line 104
    :cond_2
    return-void
.end method
