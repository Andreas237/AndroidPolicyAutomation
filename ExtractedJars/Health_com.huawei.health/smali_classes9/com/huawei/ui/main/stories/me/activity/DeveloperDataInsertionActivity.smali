.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$c;,
        Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/EditText;

.field private b:Landroid/widget/EditText;

.field private c:Landroid/widget/Button;

.field private d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private e:Landroid/widget/EditText;

.field private f:Landroid/os/Handler;

.field private g:Landroid/widget/EditText;

.field private h:Landroid/content/Context;

.field private i:Ljava/util/concurrent/ExecutorService;

.field private k:Ljava/lang/String;

.field private l:Landroid/app/ProgressDialog;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Lo/fdi;

.field private q:I

.field private r:I

.field private s:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 94
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->s:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;I)I
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->r:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->b:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->m:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 2

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 91
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->a:Landroid/widget/EditText;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 78
    sget v0, Lcom/huawei/ui/main/R$id;->me_develop_bulk_data_insertion_weight_edit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->e:Landroid/widget/EditText;

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->me_develop_bulk_data_insertion_bloodpresure_edit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->b:Landroid/widget/EditText;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->me_develop_bulk_data_insertion_bloodsugar_edit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->a:Landroid/widget/EditText;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->me_develop_bulk_data_insertion_sleep_edit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->g:Landroid/widget/EditText;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->me_develop_bulk_data_insertion_confirm:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->c:Landroid/widget/Button;

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->c:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->e:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->n:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;I)I
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/widget/EditText;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->g:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->o:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->k:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/content/Context;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Lo/fdi;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->p:Lo/fdi;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I
    .locals 2

    .line 31
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->r:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->r:I

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->a()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q:I

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I
    .locals 2

    .line 31
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->q:I

    return v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->r:I

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/os/Handler;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->c:Landroid/widget/Button;

    if-ne p1, v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->s:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 134
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 54
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_bulk_data_insertion:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->setContentView(I)V

    .line 56
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->b()V

    .line 57
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h:Landroid/content/Context;

    .line 58
    invoke-static {}, Lo/fdi;->c()Lo/fdi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->p:Lo/fdi;

    .line 59
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->f:Landroid/os/Handler;

    .line 60
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 61
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i:Ljava/util/concurrent/ExecutorService;

    .line 62
    new-instance v0, Landroid/app/ProgressDialog;

    invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    .line 63
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 64
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_inserting:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 66
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->i:Ljava/util/concurrent/ExecutorService;

    .line 74
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 75
    return-void
.end method
