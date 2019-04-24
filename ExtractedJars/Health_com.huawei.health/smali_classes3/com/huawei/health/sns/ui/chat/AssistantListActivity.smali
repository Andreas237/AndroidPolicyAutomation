.class public Lcom/huawei/health/sns/ui/chat/AssistantListActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/AssistantListActivity$a;,
        Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;,
        Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;
    }
.end annotation


# instance fields
.field private f:Lo/bdq;

.field private g:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

.field private h:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

.field private k:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 66
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->g:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->g:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 100
    sget v0, Lcom/huawei/android/sns/R$id;->sns_assistant_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->k:Landroid/widget/ListView;

    .line 101
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->c:Landroid/widget/LinearLayout;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 105
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->b()V

    .line 106
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->h:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 126
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->h:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->h:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 128
    return-void
.end method

.method private c()V
    .locals 2

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->k:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 152
    return-void
.end method

.method private e()V
    .locals 4

    .line 159
    new-instance v0, Lo/bdq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->g:Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

    invoke-direct {v0, v1}, Lo/bdq;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->f:Lo/bdq;

    .line 160
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$p;->c:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->f:Lo/bdq;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 161
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->h()V

    return-void
.end method

.method private g()V
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->f:Lo/bdq;

    if-eqz v0, :cond_0

    .line 170
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->f:Lo/bdq;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 172
    :cond_0
    return-void
.end method

.method private h()V
    .locals 3

    .line 179
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->k()Lo/brd;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 196
    return-void
.end method

.method private static k()Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
        }
    .end annotation

    .line 200
    new-instance v0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$5;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$5;-><init>()V

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 111
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->d:Landroid/view/View;

    .line 112
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 117
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->c:Landroid/widget/LinearLayout;

    invoke-static {v0, p0}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 119
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 81
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 82
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 85
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 88
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_assistant_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->setContentView(I)V

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->a()V

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->h()V

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->c()V

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->e()V

    .line 93
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 352
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 353
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->g()V

    .line 354
    return-void
.end method
