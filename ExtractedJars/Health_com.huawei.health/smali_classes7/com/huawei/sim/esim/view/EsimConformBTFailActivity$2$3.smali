.class Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2$3;->d:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 86
    const-string v0, "ConformReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bt reconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2$3;->d:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;

    iget-object v0, v0, Lcom/huawei/sim/esim/view/EsimConformBTFailActivity$2;->a:Lcom/huawei/sim/esim/view/EsimConformBTFailActivity;

    invoke-static {v0}, Lo/ecw;->a(Landroid/content/Context;)V

    .line 88
    return-void
.end method
