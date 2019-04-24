.class Lcom/huawei/sim/esim/view/EsimProfileAcitvity$9;
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
.field final synthetic a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$9;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 337
    const-string v0, "EsimProfileAcitvity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showUnbindDialog ok click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$9;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 339
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileAcitvity$9;->a:Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;->c(Lcom/huawei/sim/esim/view/EsimProfileAcitvity;Lo/egv;)Lo/egv;

    .line 340
    return-void
.end method
