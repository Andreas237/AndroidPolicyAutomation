.class final Lcom/huawei/pay/ui/util/UiUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pay/ui/util/UiUtil;->setViewMargin(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$act:Landroid/app/Activity;

.field final synthetic val$percent:F

.field final synthetic val$rect:Landroid/graphics/Rect;

.field final synthetic val$root:Landroid/view/View;

.field final synthetic val$v:Landroid/view/View;

.field final synthetic val$vto:Landroid/view/ViewTreeObserver;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/graphics/Rect;Landroid/app/Activity;Landroid/view/View;FLandroid/view/ViewTreeObserver;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$root:Landroid/view/View;

    iput-object p2, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$rect:Landroid/graphics/Rect;

    iput-object p3, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$act:Landroid/app/Activity;

    iput-object p4, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$v:Landroid/view/View;

    iput p5, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$percent:F

    iput-object p6, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$vto:Landroid/view/ViewTreeObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 4

    .line 101
    iget-object v0, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$root:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$root:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$rect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 103
    iget-object v0, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$rect:Landroid/graphics/Rect;

    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 104
    if-lez v3, :cond_0

    .line 105
    iget-object v0, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$act:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$v:Landroid/view/View;

    iget v2, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$percent:F

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/pay/ui/util/UiUtil;->access$000(Landroid/app/Activity;Landroid/view/View;FI)V

    .line 106
    iget-object v0, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$vto:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/huawei/pay/ui/util/UiUtil$1;->val$vto:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 112
    :cond_0
    return-void
.end method
