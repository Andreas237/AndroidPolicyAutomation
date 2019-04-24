.class Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 342
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;->d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 345
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoginFail cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;->d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 347
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;->d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;Lo/egv;)Lo/egv;

    .line 348
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;->d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->b(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/ecx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;->d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->a(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$5;->d:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->finish()V

    .line 350
    return-void
.end method
