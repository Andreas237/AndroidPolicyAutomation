.class Lcom/usebutton/sdk/internal/views/WebControls$3;
.super Ljava/lang/Object;
.source "WebControls.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/Navigable$NavigationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/WebControls;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/WebControls;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/WebControls;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNavigation(Lcom/usebutton/sdk/internal/Navigable;)V
    .locals 3

    .line 64
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/WebControls;->access$300(Lcom/usebutton/sdk/internal/views/WebControls;)Landroid/widget/ImageButton;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/views/WebControls;->access$200(Lcom/usebutton/sdk/internal/views/WebControls;)Lcom/usebutton/sdk/internal/Navigable;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/Navigable;->canNavigateBack()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 65
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/WebControls;->access$300(Lcom/usebutton/sdk/internal/views/WebControls;)Landroid/widget/ImageButton;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/views/WebControls;->access$200(Lcom/usebutton/sdk/internal/views/WebControls;)Lcom/usebutton/sdk/internal/Navigable;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/Navigable;->canNavigateBack()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, 0x3e19999a    # 0.15f

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const v0, 0x3e19999a    # 0.15f

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setAlpha(F)V

    .line 66
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/WebControls;->access$400(Lcom/usebutton/sdk/internal/views/WebControls;)Landroid/widget/ImageButton;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/views/WebControls;->access$200(Lcom/usebutton/sdk/internal/views/WebControls;)Lcom/usebutton/sdk/internal/Navigable;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/Navigable;->canNavigateForward()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 67
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/WebControls;->access$400(Lcom/usebutton/sdk/internal/views/WebControls;)Landroid/widget/ImageButton;

    move-result-object p1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebControls$3;->this$0:Lcom/usebutton/sdk/internal/views/WebControls;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/views/WebControls;->access$200(Lcom/usebutton/sdk/internal/views/WebControls;)Lcom/usebutton/sdk/internal/Navigable;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/Navigable;->canNavigateForward()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const v1, 0x3e19999a    # 0.15f

    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setAlpha(F)V

    return-void
.end method
