.class Lo/cym$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cym;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lo/cym;


# direct methods
.method constructor <init>(Lo/cym;)V
    .locals 0

    .line 1013
    iput-object p1, p0, Lo/cym$b;->e:Lo/cym;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1017
    :goto_0
    iget-object v0, p0, Lo/cym$b;->e:Lo/cym;

    invoke-static {v0}, Lo/cym;->d(Lo/cym;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 1018
    iget-object v0, p0, Lo/cym$b;->e:Lo/cym;

    invoke-static {v0}, Lo/cym;->c(Lo/cym;)Ljava/util/Collection;

    move-result-object v5

    .line 1019
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 1021
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StateThread watch names.size() = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1023
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 1024
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceAWService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " StateThread no watch in iterator"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1025
    const v0, 0xf4dfa

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 1026
    iget-object v0, p0, Lo/cym$b;->e:Lo/cym;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/cym;->c(Lo/cym;I)V

    .line 1027
    goto :goto_1

    .line 1030
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1031
    iget-object v0, p0, Lo/cym$b;->e:Lo/cym;

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/wearable/Node;

    invoke-static {v0, v1}, Lo/cym;->c(Lo/cym;Lcom/google/android/gms/wearable/Node;)Lcom/google/android/gms/wearable/Node;

    .line 1032
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StateThread found watch\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cym$b;->e:Lo/cym;

    invoke-static {v4}, Lo/cym;->e(Lo/cym;)Lcom/google/android/gms/wearable/Node;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/wearable/Node;->getDisplayName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1034
    iget-object v0, p0, Lo/cym$b;->e:Lo/cym;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cym;->c(Lo/cym;I)V

    .line 1035
    goto :goto_1

    .line 1037
    :cond_1
    goto/16 :goto_0

    .line 1038
    :cond_2
    :goto_1
    const-string v0, "01"

    const-string v1, "BTDeviceAWService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "StateThread search iterator finish"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    iget-object v0, p0, Lo/cym$b;->e:Lo/cym;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cym;->e(Lo/cym;Lo/cym$b;)Lo/cym$b;

    .line 1040
    return-void
.end method
