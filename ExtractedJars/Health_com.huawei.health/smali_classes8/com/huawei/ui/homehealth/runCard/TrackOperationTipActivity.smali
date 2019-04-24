.class public Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private a:F

.field private c:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;)F
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->c:F

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;)F
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->a:F

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;F)F
    .locals 0

    .line 18
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->a:F

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;F)F
    .locals 0

    .line 18
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->c:F

    return p1
.end method


# virtual methods
.method public onBackPressed()V
    .locals 4

    .line 64
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 65
    const-string v0, "Track_TrackOperationTipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 25
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    const-string v0, "Track_TrackOperationTipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate() show sport tips activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->layout_activity_sport_entrance_change_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->setContentView(I)V

    .line 28
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_track_sport_change_op:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 29
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity$3;-><init>(Lcom/huawei/ui/homehealth/runCard/TrackOperationTipActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 58
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 59
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 60
    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 72
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 73
    const-string v0, "Track_TrackOperationTipActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    return-void
.end method
