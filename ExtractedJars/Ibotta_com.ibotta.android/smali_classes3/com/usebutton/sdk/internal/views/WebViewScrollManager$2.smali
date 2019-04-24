.class Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;
.super Landroid/view/animation/Animation;
.source "WebViewScrollManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->animateMargins(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;->this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 1

    .line 184
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;->this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-static {p2}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->access$200(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/ViewGroup$MarginLayoutParams;

    move-result-object p2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;->this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->access$300(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    mul-float v0, v0, p1

    float-to-int p1, v0

    iput p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 185
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;->this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->access$300(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;->this$0:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-static {p2}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->access$200(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/ViewGroup$MarginLayoutParams;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
