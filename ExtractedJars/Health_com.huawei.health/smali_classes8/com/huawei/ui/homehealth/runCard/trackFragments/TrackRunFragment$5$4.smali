.class Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->onGlobalLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;F)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    iput p2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 108
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 111
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;F)F

    .line 113
    goto :goto_0

    .line 115
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;F)F

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)F

    move-result v0

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->a:F

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V

    goto :goto_0

    .line 121
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V

    .line 122
    .line 126
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
