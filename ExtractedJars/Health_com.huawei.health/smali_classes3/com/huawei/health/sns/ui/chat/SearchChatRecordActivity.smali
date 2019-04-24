.class public Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SearchView$OnCloseListener;
.implements Landroid/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;,
        Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;,
        Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;,
        Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$c;
    }
.end annotation


# instance fields
.field private f:Landroid/widget/ListView;

.field private g:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

.field private h:Lcom/huawei/health/sns/model/user/User;

.field protected k:Landroid/widget/SearchView;

.field private l:Landroid/os/Handler;

.field private m:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

.field private n:Z

.field private o:J

.field private p:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->n:Z

    .line 127
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->l:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->m:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 215
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 234
    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 3

    .line 238
    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 239
    if-eqz v2, :cond_0

    .line 241
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    const-string v0, "SearchChatRecordActivity"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/os/Handler;)V
    .locals 2

    .line 401
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 403
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 407
    :cond_1
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;Ljava/lang/String;Landroid/os/Handler;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 418
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h:Lcom/huawei/health/sns/model/user/User;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 210
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->e()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->g:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    .line 211
    return-void
.end method

.method private c()V
    .locals 4

    .line 147
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 148
    if-eqz v2, :cond_2

    .line 150
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 151
    if-nez v3, :cond_0

    .line 153
    return-void

    .line 155
    :cond_0
    const-string v0, "user"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    const-string v0, "user"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h:Lcom/huawei/health/sns/model/user/User;

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->o:J

    .line 161
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->n:Z

    .line 164
    :cond_1
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 166
    const-string v0, "groupId"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->p:J

    .line 167
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->p:J

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->o:J

    .line 168
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->n:Z

    .line 171
    :cond_2
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Landroid/os/Handler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->l:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;Lcom/huawei/health/sns/model/user/User;)Lcom/huawei/health/sns/model/user/User;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h:Lcom/huawei/health/sns/model/user/User;

    return-object p1
.end method

.method private e()V
    .locals 3

    .line 175
    sget v0, Lcom/huawei/android/sns/R$id;->search_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SearchView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->onActionViewExpanded()V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_local_search:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setIconified(Z)V

    .line 180
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setSubmitButtonEnabled(Z)V

    .line 181
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/widget/SearchView;->setOnCloseListener(Landroid/widget/SearchView$OnCloseListener;)V

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/SearchView;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 195
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    invoke-virtual {v0}, Landroid/widget/SearchView;->clearFocus()V

    .line 197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k:Landroid/widget/SearchView;

    invoke-static {v0}, Lo/bmo;->b(Landroid/widget/SearchView;)V

    .line 199
    sget v0, Lcom/huawei/android/sns/R$id;->sns_record_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f:Landroid/widget/ListView;

    .line 200
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    .line 201
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_icon:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e:Landroid/widget/ImageView;

    .line 202
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 204
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->m:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    .line 205
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->m:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 206
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->h()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;Landroid/view/View;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Landroid/view/View;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)J
    .locals 2

    .line 61
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->o:J

    return-wide v0
.end method

.method private g()V
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 291
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->n:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->g:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 281
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 282
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)J
    .locals 2

    .line 61
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->p:J

    return-wide v0
.end method

.method private k()V
    .locals 2

    .line 312
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 325
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->p()V

    return-void
.end method

.method private p()V
    .locals 2

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->m:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->c()V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->m:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->notifyDataSetChanged()V

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->f:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 336
    return-void
.end method


# virtual methods
.method public c(JJLcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)V
    .locals 6

    .line 532
    new-instance v0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;-><init>(JJLcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)V

    sget-object v1, Lo/bbp;->e:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 533
    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 534
    return-void
.end method

.method public d()V
    .locals 1

    .line 251
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->d:Landroid/view/View;

    .line 252
    return-void
.end method

.method public onClose()Z
    .locals 1

    .line 271
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->p()V

    .line 272
    const/4 v0, 0x0

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 303
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e:Landroid/widget/ImageView;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2}, Lo/bph;->c(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/app/Activity;Z)V

    .line 305
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 132
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 133
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 134
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 138
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_search_chat_record:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->setContentView(I)V

    .line 139
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->c()V

    .line 140
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->b()V

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e()V

    .line 142
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a()V

    .line 143
    return-void
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->l:Landroid/os/Handler;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Ljava/lang/String;Landroid/os/Handler;)V

    .line 265
    const/4 v0, 0x0

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->l:Landroid/os/Handler;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Ljava/lang/String;Landroid/os/Handler;)V

    .line 258
    const/4 v0, 0x0

    return v0
.end method

.method public onResume()V
    .locals 0

    .line 296
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onResume()V

    .line 297
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->k()V

    .line 298
    return-void
.end method
