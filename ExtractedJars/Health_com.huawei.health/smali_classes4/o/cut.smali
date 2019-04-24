.class public Lo/cut;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cuu;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/clh;Landroid/content/Context;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    const-string v0, "old_huid"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDataUpdateOption;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 24
    const-string v0, "new_huid"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDataUpdateOption;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 25
    const-string v0, "copy_sync_status"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiDataUpdateOption;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 26
    invoke-static {p3, v2, v3, v4}, Lo/cns;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v5

    .line 27
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    if-eqz p2, :cond_0

    .line 29
    invoke-interface {p2, v5, v1}, Lo/clh;->b(ILjava/util/List;)V

    .line 31
    :cond_0
    return-void
.end method
