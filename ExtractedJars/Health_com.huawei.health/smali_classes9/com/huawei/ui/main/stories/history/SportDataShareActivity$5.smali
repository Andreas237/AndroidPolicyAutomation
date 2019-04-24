.class Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;->b:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;->b:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;->b:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;->b:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->b(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataShareActivity$5;->b:Lcom/huawei/ui/main/stories/history/SportDataShareActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataShareActivity;->k(Lcom/huawei/ui/main/stories/history/SportDataShareActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 218
    return-void
.end method
