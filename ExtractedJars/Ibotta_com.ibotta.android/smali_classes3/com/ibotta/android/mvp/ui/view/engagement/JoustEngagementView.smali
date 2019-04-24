.class public Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;
.super Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;
.source "JoustEngagementView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method protected initOptions()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OptionModel;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;

    move-result-object v0

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getOptions()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    new-instance v0, Lcom/ibotta/android/fragment/game/question/GameQuestionOptionWeightComparator;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionOptionWeightComparator;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 49
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 52
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;-><init>(Landroid/content/Context;)V

    .line 53
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/JoustEngagementView;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 55
    invoke-virtual {v2, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->setListener(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView$JoustEngagementTableListener;)V

    .line 56
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->setOptions(Ljava/util/List;)V

    .line 58
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->getOptionsMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V
    .locals 0

    .line 63
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V

    return-void
.end method
