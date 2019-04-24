.class Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$9;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V
    .locals 0

    .line 663
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$9;->b:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 666
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 667
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 669
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$9;->b:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->b(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;Ljava/util/List;)V

    .line 670
    goto :goto_0

    .line 675
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$9;->b:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->d(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 676
    .line 680
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1e -> :sswitch_0
        0x1f -> :sswitch_1
    .end sparse-switch
.end method
