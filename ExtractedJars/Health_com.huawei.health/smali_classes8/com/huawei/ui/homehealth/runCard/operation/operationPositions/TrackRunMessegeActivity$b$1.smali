.class Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;

.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;Ljava/util/List;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->d:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;

    iput-object p2, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;

    iput-object p3, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->a(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->a(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b$1;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)Lo/erl;

    move-result-object v0

    invoke-virtual {v0}, Lo/erl;->notifyDataSetChanged()V

    .line 90
    return-void
.end method
