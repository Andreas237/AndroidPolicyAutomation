.class Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;
.super Ljava/lang/Object;
.source "TemplateMultiPanelScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->fadeSubtitle(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

.field final synthetic val$indexOfNewSubtitle:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;I)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    iput p2, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->val$indexOfNewSubtitle:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 283
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$300(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$200(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->val$indexOfNewSubtitle:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;

    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;->access$100(Lcom/shopkick/app/launch/TemplateMultiPanelScreen$PanelInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 284
    iget-object p1, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f01001e

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    const-wide/16 v0, 0x12c

    .line 285
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 286
    iget-object v0, p0, Lcom/shopkick/app/launch/TemplateMultiPanelScreen$1;->this$0:Lcom/shopkick/app/launch/TemplateMultiPanelScreen;

    invoke-static {v0}, Lcom/shopkick/app/launch/TemplateMultiPanelScreen;->access$300(Lcom/shopkick/app/launch/TemplateMultiPanelScreen;)Lcom/shopkick/app/widget/SKTextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKTextView;->startAnimation(Landroid/view/animation/Animation;)V

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
