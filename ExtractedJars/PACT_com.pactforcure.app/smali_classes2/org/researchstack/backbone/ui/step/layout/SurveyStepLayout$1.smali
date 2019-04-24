.class Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;
.super Lorg/researchstack/backbone/ui/step/layout/TextViewLinkHandler;
.source "SurveyStepLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->initStepLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    .prologue
    .line 177
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/TextViewLinkHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public onLinkClick(Ljava/lang/String;)V
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 181
    invoke-static {}, Lorg/researchstack/backbone/ResourcePathManager;->getInstance()Lorg/researchstack/backbone/ResourcePathManager;

    move-result-object v2

    const/4 v3, 0x0

    .line 182
    invoke-virtual {v2, v3, p1}, Lorg/researchstack/backbone/ResourcePathManager;->generateAbsolutePath(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 183
    .local v1, "path":Ljava/lang/String;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    .line 184
    invoke-static {v3}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->access$000(Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;)Lorg/researchstack/backbone/step/QuestionStep;

    move-result-object v3

    invoke-virtual {v3}, Lorg/researchstack/backbone/step/QuestionStep;->getTitle()Ljava/lang/String;

    move-result-object v3

    .line 183
    invoke-static {v2, v3, v1}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntentForPath(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 186
    .local v0, "intent":Landroid/content/Intent;
    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout$1;->this$0:Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/step/layout/SurveyStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 187
    return-void
.end method
