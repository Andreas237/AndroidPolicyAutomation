.class Lcom/shopkick/app/launch/TemplateMultiPanelScreen$3;
.super Ljava/lang/Object;
.source "TemplateMultiPanelScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->slidePanelInRight()V
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

    .line 341
    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$3;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 349
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$3;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$408(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)I

    .line 350
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$3;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$702(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;Z)Z

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
