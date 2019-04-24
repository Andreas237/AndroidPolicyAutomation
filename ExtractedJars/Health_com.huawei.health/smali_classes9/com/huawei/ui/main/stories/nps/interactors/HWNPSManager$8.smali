.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->responseListener()Lcom/android/volley/Response$Listener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/android/volley/Response$Listener<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 0

    .line 783
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 1

    .line 783
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->onResponse(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 4

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps responseListener get question successfull:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 789
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps responseListener response is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 790
    return-void

    .line 793
    :cond_0
    new-instance v0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8$1;-><init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$8;Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/interactors/util/TaskUtils;->executeAsyncTask(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 817
    return-void
.end method
