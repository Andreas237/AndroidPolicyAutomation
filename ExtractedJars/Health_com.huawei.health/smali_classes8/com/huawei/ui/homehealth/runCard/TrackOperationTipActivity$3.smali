.class Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 32
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 35
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;F)F

    .line 37
    goto :goto_0

    .line 39
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->e(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;F)F

    .line 41
    goto :goto_0

    .line 43
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->a(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->c(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;)F

    move-result v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    const/high16 v2, 0x42000000    # 32.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x0

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 45
    const-string v0, "Track_TrackOperationTipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate() scroll to destroy."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->finish()V

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;->d:Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;

    sget v1, Lcom/huawei/ui/homehealth/R$anim;->track_op_tip_close:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->overridePendingTransition(II)V

    .line 54
    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
