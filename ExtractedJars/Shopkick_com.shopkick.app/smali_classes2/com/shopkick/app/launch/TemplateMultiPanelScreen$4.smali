.class Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;
.super Ljava/lang/Object;
.source "TemplateMultiPanelScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelOutRight()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 373
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$400(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 374
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$800(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;Z)V

    .line 376
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$4;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$900(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
