.class Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 178
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "err_code "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;->e(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5$1;-><init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$5;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 211
    return-void
.end method
