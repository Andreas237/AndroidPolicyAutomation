.class public Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;
    }
.end annotation


# instance fields
.field private b:Lo/erg;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private d:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;

.field private e:Lo/erl;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->c:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)Ljava/util/List;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)Lo/erl;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->e:Lo/erl;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 38
    const-string v0, "Track_TrackRunMessegeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->activity_track_run_messeges:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->setContentView(I)V

    .line 42
    sget v0, Lcom/huawei/ui/homehealth/R$id;->listview_run_info_all:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/erg;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->b:Lo/erg;

    .line 43
    new-instance v0, Lo/erl;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->c:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lo/erl;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->e:Lo/erl;

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->b:Lo/erg;

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->e:Lo/erl;

    invoke-virtual {v0, v1}, Lo/erg;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 46
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;-><init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->d:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity;->d:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMessegeActivity$b;->sendEmptyMessage(I)Z

    .line 48
    return-void
.end method
