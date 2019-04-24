.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 499
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 11

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getWidth()I

    move-result v0

    iput v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 505
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getHeight()I

    move-result v0

    iput v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 506
    const/4 v0, 0x2

    new-array v7, v0, [I

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->a(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/widget/ImageButton;->getLocationInWindow([I)V

    .line 508
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->h(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 509
    const/4 v0, 0x1

    aget v0, v7, v0

    const/4 v1, 0x0

    aget v1, v7, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v0, v1, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 511
    :cond_0
    const/4 v0, 0x0

    aget v0, v7, v0

    const/4 v1, 0x1

    aget v1, v7, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 513
    :goto_0
    iget v0, v6, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double v8, v0, v2

    .line 514
    const/4 v0, 0x0

    aget v0, v7, v0

    int-to-double v0, v0

    add-double/2addr v0, v8

    const/4 v2, 0x0

    aget v2, v7, v2

    int-to-double v2, v2

    add-double/2addr v2, v8

    mul-double/2addr v0, v2

    const/4 v2, 0x1

    aget v2, v7, v2

    int-to-double v2, v2

    add-double/2addr v2, v8

    const/4 v4, 0x1

    aget v4, v7, v4

    int-to-double v4, v4

    add-double/2addr v4, v8

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    div-double/2addr v0, v8

    double-to-int v0, v0

    add-int/lit8 v10, v0, 0x1

    .line 515
    int-to-float v0, v10

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->k(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 516
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    int-to-float v1, v10

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->e(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;F)F

    .line 518
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 519
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$12;->e:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->f(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V

    .line 520
    return-void
.end method
