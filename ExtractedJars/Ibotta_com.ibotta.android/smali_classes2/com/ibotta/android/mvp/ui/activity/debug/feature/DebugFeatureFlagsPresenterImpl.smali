.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "DebugFeatureFlagsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenter;"
    }
.end annotation


# instance fields
.field private final configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

.field private final ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

.field private final rowViewStateList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

.field private final testConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/features/TestConfig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 27
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->rowViewStateList:Ljava/util/List;

    .line 28
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-void
.end method

.method static synthetic lambda$onStart$0(Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;)I
    .locals 0

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->getTestName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;->getTestName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public onRowTapped(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/TestConfig;

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;

    invoke-virtual {p1}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;->showDebugFeatureFlagDetail(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 10

    .line 44
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onStart()V

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

    invoke-interface {v1}, Lcom/ibotta/android/features/registry/ConfigRegistry;->getTestConfigs()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 48
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 51
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/features/TestConfig;

    .line 52
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-virtual {v4}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    move-result-object v5

    if-nez v5, :cond_0

    .line 54
    new-instance v5, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    invoke-direct {v5}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;-><init>()V

    const-string v6, "control"

    .line 55
    invoke-virtual {v5, v6}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->setVariantName(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v5, v2}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->setEnabled(Z)V

    .line 57
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-virtual {v4}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->saveFeatureFlagState(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagState;)V

    .line 60
    :cond_0
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 61
    invoke-virtual {v4}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$CvIyKImceD5-Yc3xQPg63C7uB18;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$CvIyKImceD5-Yc3xQPg63C7uB18;

    .line 60
    invoke-interface {v6, v7, v8, v9}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagFieldOrDefault(Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 62
    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->ffRespUtil:Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    .line 63
    invoke-virtual {v4}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v4

    const-string v8, ""

    sget-object v9, Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$PFn0ZzI9ISFehgTMR61R0ETiLTg;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$PFn0ZzI9ISFehgTMR61R0ETiLTg;

    .line 62
    invoke-interface {v7, v4, v8, v9}, Lcom/ibotta/android/features/FeatureFlagResponseUtil;->getFeatureFlagFieldOrDefault(Ljava/lang/String;Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 65
    new-instance v7, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    invoke-direct {v7}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;-><init>()V

    add-int/lit8 v8, v3, 0x1

    .line 66
    invoke-virtual {v7, v3}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->rowIndex(I)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    move-result-object v3

    .line 67
    invoke-virtual {v5}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->isEnabled()Z

    move-result v5

    invoke-virtual {v3, v5}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->isDebugVisible(Z)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    move-result-object v3

    .line 68
    invoke-virtual {v3, v6}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testName(Ljava/lang/String;)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    move-result-object v3

    .line 69
    invoke-virtual {v3, v4}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->testDescription(Ljava/lang/String;)Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;

    move-result-object v3

    .line 70
    invoke-virtual {v3}, Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState$Builder;->build()Lcom/ibotta/android/views/debug/DebugFeatureFlagRowViewState;

    move-result-object v3

    .line 65
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v8

    goto :goto_0

    .line 73
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->rowViewStateList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->rowViewStateList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 75
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/debug/feature/-$$Lambda$DebugFeatureFlagsPresenterImpl$vd8adtmwysDi2ZZdTUjCl_9hb18;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 78
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->testConfigs:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 79
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;->setDebugFeatureFlagItems(Ljava/util/List;)V

    goto :goto_1

    .line 81
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;->showNoFeatureFlagsAvailable()V

    :goto_1
    return-void
.end method
