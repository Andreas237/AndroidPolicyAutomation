.class Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4$1;->a:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 73
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bt reconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4$1;->a:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;->b:Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;

    invoke-static {v0}, Lo/ecw;->a(Landroid/content/Context;)V

    .line 75
    return-void
.end method
