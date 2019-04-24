.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "DebugEngagementsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;

.field protected rvRecycler:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903db
    .end annotation
.end field

.field protected sType:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903eb
    .end annotation
.end field

.field private spinnerAdapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->spinnerAdapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->onRowClicked(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V

    return-void
.end method

.method private initAdapter()V
    .locals 2

    .line 90
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->setListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private initRecycler()V
    .locals 4

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 104
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 105
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 106
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 107
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initSpinner()V
    .locals 2

    .line 75
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->spinnerAdapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->sType:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->spinnerAdapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsSpinnerAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->sType:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 46
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private onRowClicked(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;->onRowClicked(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V

    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 42
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 28
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;
    .locals 1

    .line 51
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;

    move-result-object v0

    .line 52
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;)V

    .line 53
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->debugEngagementsModule(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsModule;)Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;

    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DaggerDebugEngagementsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;)V
    .locals 0

    .line 59
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c002b

    .line 66
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->setContentView(I)V

    .line 67
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->initSpinner()V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->initAdapter()V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->initRecycler()V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;",
            ">;)V"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method
