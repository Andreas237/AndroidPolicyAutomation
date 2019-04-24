.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 265
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 267
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F

    .line 268
    goto :goto_0

    .line 270
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F

    .line 271
    goto :goto_0

    .line 273
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;F)F

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)F

    move-result v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 276
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V

    goto :goto_0

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$4;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->a(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Landroid/view/View;)V

    .line 282
    .line 286
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
