.class Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 3

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getY()F

    move-result v2

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment;->c:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5$4;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/TrackRunFragment$5;F)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 131
    return-void
.end method
