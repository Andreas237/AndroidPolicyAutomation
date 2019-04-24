.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SyncRFConfFilesCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)V
    .locals 0

    .line 729
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public syncRFConfFilesResult(Ljava/lang/String;I)V
    .locals 4

    .line 734
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$102(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Z)Z

    .line 736
    const-string v0, "CardListsLoader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CardListsLoader syncRFConfFilesResult : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " issuerid : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " hasSyncRFConf : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    .line 737
    invoke-static {v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "thread=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 736
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 738
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 740
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->access$200()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2$1;-><init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$2;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 757
    :cond_1
    return-void
.end method
