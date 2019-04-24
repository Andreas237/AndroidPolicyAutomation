.class Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;
.super Lorg/researchstack/backbone/ui/step/layout/TextViewLinkHandler;
.source "InstructionStepLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->initializeStep()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    .prologue
    .line 113
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/TextViewLinkHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public onLinkClick(Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 117
    invoke-static {}, Lorg/researchstack/backbone/ResourcePathManager;->getInstance()Lorg/researchstack/backbone/ResourcePathManager;

    move-result-object v2

    const/4 v3, 0x0

    .line 118
    invoke-virtual {v2, v3, p1}, Lorg/researchstack/backbone/ResourcePathManager;->generateAbsolutePath(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 119
    .local v1, "path":Ljava/lang/String;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    .line 120
    invoke-static {v3}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->access$000(Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;)Lorg/researchstack/backbone/step/Step;

    move-result-object v3

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/Step;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 119
    invoke-static {v2, v3, v1}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntentForPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 122
    .local v0, "intent":Landroid/content/Intent;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 123
    return-void
.end method
