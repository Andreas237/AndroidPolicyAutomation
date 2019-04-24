.class public Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;
.super Ljava/lang/Object;
.source "QuestView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

.field private view7f090087:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/quests/QuestView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    const-string v0, "field \'tvQuestTitle\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090587

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvQuestTitle:Landroid/widget/TextView;

    const-string v0, "field \'tvQuestDescription\'"

    .line 34
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090515

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvQuestDescription:Landroid/widget/TextView;

    const-string v0, "field \'tvAmount\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904fe

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvAmount:Landroid/widget/TextView;

    const-string v0, "field \'bEnterQuest\' and method \'questButtonClick\'"

    const v1, 0x7f090087

    .line 36
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bEnterQuest\'"

    .line 37
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bEnterQuest:Landroid/widget/Button;

    .line 38
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;->view7f090087:Landroid/view/View;

    .line 39
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/quests/QuestView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f0901f5

    const-string v1, "field \'flQuestImageContainer\'"

    .line 45
    const-class v2, Landroid/widget/FrameLayout;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->flQuestImageContainer:Landroid/widget/FrameLayout;

    const v0, 0x7f090298

    const-string v1, "field \'ivBonusBackground\'"

    .line 46
    const-class v2, Landroid/widget/ImageView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->ivBonusBackground:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 54
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/quests/QuestView;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvQuestTitle:Landroid/widget/TextView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvQuestDescription:Landroid/widget/TextView;

    .line 58
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->tvAmount:Landroid/widget/TextView;

    .line 59
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->bEnterQuest:Landroid/widget/Button;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->flQuestImageContainer:Landroid/widget/FrameLayout;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView;->ivBonusBackground:Landroid/widget/ImageView;

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;->view7f090087:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 64
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/quests/QuestView_ViewBinding;->view7f090087:Landroid/view/View;

    return-void

    .line 53
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
