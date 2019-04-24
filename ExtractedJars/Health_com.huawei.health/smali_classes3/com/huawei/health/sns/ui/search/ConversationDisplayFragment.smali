.class public Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;
    }
.end annotation


# instance fields
.field protected a:Landroid/widget/ListView;

.field private b:Landroid/widget/LinearLayout;

.field protected c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

.field private d:Landroid/app/Activity;

.field protected e:Lo/bga;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d:Landroid/app/Activity;

    return-void
.end method

.method private a()V
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->a:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 113
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    .line 121
    sget v0, Lcom/huawei/android/sns/R$id;->hwmessagegroup_alllistview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->a:Landroid/widget/ListView;

    .line 122
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->b:Landroid/widget/LinearLayout;

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 124
    return-void
.end method

.method private c()V
    .locals 4

    .line 102
    new-instance v0, Lo/bga;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d:Landroid/app/Activity;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/bga;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->e:Lo/bga;

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->e:Lo/bga;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 104
    return-void
.end method

.method private d()V
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d:Landroid/app/Activity;

    invoke-static {v0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 241
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method


# virtual methods
.method protected b()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

    const/16 v1, 0x6a5

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->cancelOperation(I)V

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

    new-instance v1, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$5;-><init>(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;->post(Ljava/lang/Runnable;)Z

    .line 158
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 129
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 131
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 73
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 74
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d:Landroid/app/Activity;

    .line 75
    new-instance v0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;-><init>(Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->c:Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment$ThreadListQueryHandler;

    .line 76
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 89
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_conversation:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 90
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 91
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->a(Landroid/view/View;)V

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->c()V

    .line 93
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->a()V

    .line 94
    return-object v2
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 201
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 203
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/axv;

    if-nez v0, :cond_1

    .line 205
    :cond_0
    return-void

    .line 208
    :cond_1
    new-instance v0, Lo/bix;

    invoke-direct {v0}, Lo/bix;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d:Landroid/app/Activity;

    invoke-virtual {v0, v1, p2}, Lo/bix;->e(Landroid/app/Activity;Landroid/view/View;)V

    .line 209
    return-void
.end method

.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 214
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .line 219
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 223
    :pswitch_0
    goto :goto_0

    .line 225
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->d()V

    .line 226
    nop

    .line 228
    .line 233
    :goto_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onStart()V
    .locals 0

    .line 81
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    .line 82
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/search/ConversationDisplayFragment;->b()V

    .line 83
    return-void
.end method
