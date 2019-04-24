.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 996
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 999
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getLocalDeviceInfo  onResponse errCode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    if-nez p1, :cond_2

    if-eqz p2, :cond_2

    instance-of v0, p2, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    if-eqz v0, :cond_2

    .line 1001
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    move-object v1, p2

    check-cast v1, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-static {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    .line 1002
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getLocalDeviceInfo  mDeviceInfo  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->i(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1004
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)I

    .line 1006
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isGBAAUTH=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-boolean v3, v3, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-boolean v0, v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->j:Z

    if-nez v0, :cond_0

    .line 1008
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->g(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    goto :goto_0

    .line 1010
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->m(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    goto :goto_0

    .line 1013
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1016
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$11;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessage(I)Z

    .line 1019
    :goto_0
    return-void
.end method
