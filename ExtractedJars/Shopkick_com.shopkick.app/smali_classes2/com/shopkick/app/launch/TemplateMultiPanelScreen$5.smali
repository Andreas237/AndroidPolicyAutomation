.class Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;
.super Ljava/lang/Object;
.source "TemplateMultiPanelScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelInLeft()V
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

    .line 405
    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 415
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$410(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I

    .line 416
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$702(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;Z)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 408
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$400(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 409
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$5;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$1000(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    :cond_0
    return-void
.end method
