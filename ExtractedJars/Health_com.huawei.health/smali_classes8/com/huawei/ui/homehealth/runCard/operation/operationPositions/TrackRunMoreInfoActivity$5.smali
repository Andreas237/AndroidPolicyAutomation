.class Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$5;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$5;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->finish()V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity$5;->c:Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;

    sget v1, Lcom/huawei/ui/homehealth/R$anim;->track_run_more_info_close:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/ui/homehealth/runCard/operation/operationPositions/TrackRunMoreInfoActivity;->overridePendingTransition(II)V

    .line 236
    return-void
.end method
