.class Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;
.super Ljava/lang/Object;
.source "TemplateMultiPanelScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelOutLeft()V
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

    .line 302
    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 310
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$400(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I

    move-result p1

    if-nez p1, :cond_0

    .line 311
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$500(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

    .line 314
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$2;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$600(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)V

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
