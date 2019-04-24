.class public Lo/exs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/emb;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/ChildService;>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Lo/exa;

.field private f:Lo/fil;

.field private g:Landroid/view/View;

.field private h:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

.field private i:Ljava/util/concurrent/ExecutorService;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/FrameLayout;

.field private q:Landroid/os/Handler;

.field private r:Landroid/widget/TextView;

.field private t:Landroid/content/Context;

.field private u:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exs;->f:Lo/fil;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/exs;->k:Ljava/util/List;

    .line 355
    new-instance v0, Lo/exs$5;

    invoke-direct {v0, p0}, Lo/exs$5;-><init>(Lo/exs;)V

    iput-object v0, p0, Lo/exs;->q:Landroid/os/Handler;

    .line 83
    iput-object p1, p0, Lo/exs;->t:Landroid/content/Context;

    .line 84
    return-void
.end method

.method static synthetic a(Lo/exs;)Lo/fil;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->f:Lo/fil;

    return-object v0
.end method

.method private a(Landroid/app/Activity;)V
    .locals 6

    .line 110
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_walk_info_view_divider:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/exs;->g:Landroid/view/View;

    .line 111
    sget v0, Lcom/huawei/ui/main/R$id;->fl_step_detail_operation_and_walk_info:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lo/exs;->p:Landroid/widget/FrameLayout;

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_walk_info_view:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/exs;->m:Landroid/widget/RelativeLayout;

    .line 114
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_operation_info_view:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/exs;->n:Landroid/widget/ImageView;

    .line 116
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_walk_info_view_title:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/exs;->l:Landroid/widget/TextView;

    .line 117
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_walk_info_view_time:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/exs;->r:Landroid/widget/TextView;

    .line 118
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_walk_info_view_img:I

    invoke-static {p1, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/exs;->o:Landroid/widget/ImageView;

    .line 121
    iget-object v0, p0, Lo/exs;->t:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_STEP"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 122
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOperationAndWalkInfo activity1 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, ""

    :try_start_0
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 126
    invoke-static {v5}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v0

    iput-object v0, p0, Lo/exs;->f:Lo/fil;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    :cond_0
    goto :goto_0

    .line 128
    :catch_0
    move-exception v5

    .line 129
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_0
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOperationAndWalkInfo mOperationObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/exs;->f:Lo/fil;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/exs;->f:Lo/fil;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/exs;->f:Lo/fil;

    invoke-virtual {v0}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/exs;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 135
    iget-object v0, p0, Lo/exs;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lo/exs;->p:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lo/exs;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 138
    iget-object v0, p0, Lo/exs;->n:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    iget-object v0, p0, Lo/exs;->f:Lo/fil;

    invoke-virtual {v0}, Lo/fil;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/exs;->n:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v1}, Lo/exs;->b(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 140
    iget-object v0, p0, Lo/exs;->n:Landroid/widget/ImageView;

    new-instance v1, Lo/exs$2;

    invoke-direct {v1, p0}, Lo/exs$2;-><init>(Lo/exs;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 168
    :cond_1
    iget-object v0, p0, Lo/exs;->i:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_2

    .line 169
    iget-object v0, p0, Lo/exs;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/exs$4;

    invoke-direct {v1, p0}, Lo/exs$4;-><init>(Lo/exs;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 189
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/exs;)Landroid/os/Handler;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->q:Landroid/os/Handler;

    return-object v0
.end method

.method private b(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 4

    .line 287
    new-instance v2, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v2}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 288
    iget-object v0, p0, Lo/exs;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 289
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V

    .line 290
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 291
    iget-object v0, p0, Lo/exs;->h:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 293
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 294
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 295
    const-string v0, "title"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 297
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 298
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 299
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 300
    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 301
    return-void
.end method

.method private b(Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 1

    .line 206
    const/4 v0, 0x4

    invoke-static {p1, p2, v0}, Lo/cam;->c(Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 218
    return-void
.end method

.method static synthetic c(Lo/exs;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lo/exs;->d()V

    return-void
.end method

.method static synthetic c(Lo/exs;Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/exs;->e(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    return-void
.end method

.method static synthetic d(Lo/exs;)Ljava/util/List;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->k:Ljava/util/List;

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 195
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lo/exs;->t:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lo/exs;->t:Landroid/content/Context;

    .line 196
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_update_app_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_user_permission_know:I

    sget v2, Lcom/huawei/ui/main/R$color;->common_text_red_color:I

    new-instance v3, Lo/exs$1;

    invoke-direct {v3, p0}, Lo/exs$1;-><init>(Lo/exs;)V

    .line 197
    invoke-virtual {v0, v1, v2, v3}, Lo/egy$b;->c(IILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 202
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 203
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 204
    return-void
.end method

.method static synthetic e(Lo/exs;)Landroid/content/Context;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->t:Landroid/content/Context;

    return-object v0
.end method

.method private e(Landroid/app/Activity;)V
    .locals 5

    .line 325
    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/exs;->b:Ljava/lang/String;

    .line 326
    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iput-object v0, p0, Lo/exs;->h:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 327
    sget v0, Lcom/huawei/ui/main/R$id;->step_detail_services:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RelativeLayout;

    .line 328
    sget v0, Lcom/huawei/ui/main/R$id;->step_service_recycleview:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emb;

    iput-object v0, p0, Lo/exs;->a:Lo/emb;

    .line 329
    iget-object v0, p0, Lo/exs;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 330
    iget-object v0, p0, Lo/exs;->h:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    const-string v1, "STEP"

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByLocation(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/exs;->c:Ljava/util/List;

    .line 331
    iget-object v0, p0, Lo/exs;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/exs;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 332
    new-instance v0, Lo/exa;

    iget-object v1, p0, Lo/exs;->t:Landroid/content/Context;

    iget-object v2, p0, Lo/exs;->c:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/exa;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lo/exs;->e:Lo/exa;

    .line 333
    iget-object v0, p0, Lo/exs;->e:Lo/exa;

    new-instance v1, Lo/exs$3;

    invoke-direct {v1, p0}, Lo/exs$3;-><init>(Lo/exs;)V

    invoke-virtual {v0, v1}, Lo/exa;->a(Lo/exa$e;)V

    .line 339
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 340
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 341
    iget-object v0, p0, Lo/exs;->a:Lo/emb;

    invoke-virtual {v0, v4}, Lo/emb;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 342
    iget-object v0, p0, Lo/exs;->a:Lo/emb;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emb;->setHasFixedSize(Z)V

    .line 343
    iget-object v0, p0, Lo/exs;->a:Lo/emb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emb;->setNestedScrollingEnabled(Z)V

    .line 344
    iget-object v0, p0, Lo/exs;->a:Lo/emb;

    iget-object v1, p0, Lo/exs;->e:Lo/exa;

    invoke-virtual {v0, v1}, Lo/emb;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 345
    goto :goto_0

    .line 346
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->step_serives_sp:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 347
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 348
    iget-object v0, p0, Lo/exs;->a:Lo/emb;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emb;->setVisibility(I)V

    .line 353
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/ui/openservice/db/model/ChildService;)V
    .locals 5

    .line 305
    iget-object v0, p0, Lo/exs;->h:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    iget-object v1, p0, Lo/exs;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v3

    .line 306
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 307
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 308
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 309
    const-string v0, "title"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 310
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 311
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getServiceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 312
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 313
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 314
    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-virtual {v0, v4}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 315
    goto :goto_0

    .line 316
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ChildService;->getHmsAuth()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 319
    :cond_1
    invoke-direct {p0, p1}, Lo/exs;->b(Lcom/huawei/ui/openservice/db/model/ChildService;)V

    .line 322
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/exs;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1, p2}, Lo/exs;->b(Ljava/lang/String;Landroid/widget/ImageView;)V

    return-void
.end method

.method static synthetic f(Lo/exs;)Ljava/util/List;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lo/exs;)Landroid/widget/ImageView;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->n:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic h(Lo/exs;)Landroid/view/View;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->g:Landroid/view/View;

    return-object v0
.end method

.method static synthetic i(Lo/exs;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->m:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic k(Lo/exs;)Landroid/widget/FrameLayout;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->p:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic l(Lo/exs;)Landroid/widget/ImageView;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->o:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic o(Lo/exs;)Landroid/widget/TextView;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->l:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic p(Lo/exs;)Landroid/widget/TextView;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/exs;->r:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 100
    iget-object v0, p0, Lo/exs;->q:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/exs;->q:Landroid/os/Handler;

    const/16 v1, 0x271a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 103
    :cond_0
    iget-object v0, p0, Lo/exs;->i:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 104
    iget-object v0, p0, Lo/exs;->i:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/exs;->i:Ljava/util/concurrent/ExecutorService;

    .line 107
    :cond_1
    return-void
.end method

.method public a(Ljava/lang/String;Lo/fil;)V
    .locals 6

    .line 225
    if-nez p2, :cond_0

    .line 226
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoOperationActivityDetail operationObject == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-void

    .line 229
    :cond_0
    invoke-static {p1, p2}, Lo/fic;->c(Ljava/lang/String;Lo/fil;)Ljava/lang/String;

    move-result-object v4

    .line 230
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 231
    const-string v0, "url"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 232
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p2}, Lo/fil;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 233
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p2}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 234
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ACT"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 235
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-virtual {v0, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 237
    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 9

    .line 264
    if-nez p1, :cond_0

    .line 265
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOperationActivityOver dateString == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    const/4 v0, 0x1

    return v0

    .line 268
    :cond_0
    const/4 v4, 0x0

    .line 269
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 270
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 272
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 273
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    .line 274
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOperationActivityOver activityEndTime ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "System.currentTimeMillis()="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    cmp-long v0, v7, v0

    if-lez v0, :cond_1

    .line 276
    const/4 v4, 0x0

    goto :goto_0

    .line 278
    :cond_1
    const/4 v4, 0x1

    .line 282
    :goto_0
    goto :goto_1

    .line 280
    :catch_0
    move-exception v6

    .line 281
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isOperationActivityOver ParseException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    :goto_1
    return v4
.end method

.method public c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 7

    .line 241
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 242
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoWalkInfoActivityDetail messageObject == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    return-void

    .line 245
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v4

    .line 246
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v5

    .line 247
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 248
    :cond_1
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Information messageId||detailUrl is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    return-void

    .line 251
    :cond_2
    new-instance v6, Landroid/content/Intent;

    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v6, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 252
    const-string v0, "url"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 253
    const-string v0, "type"

    const-string v1, "RecommendInfo"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 254
    const-string v0, "title"

    iget-object v1, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_social_information:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "INFO"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 258
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 259
    iget-object v0, p0, Lo/exs;->u:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 260
    return-void
.end method

.method public e(Landroid/app/Activity;Z)V
    .locals 2

    .line 87
    iput-object p1, p0, Lo/exs;->u:Landroid/app/Activity;

    .line 88
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    iput-boolean v0, p0, Lo/exs;->d:Z

    .line 89
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/exs;->i:Ljava/util/concurrent/ExecutorService;

    .line 90
    iget-boolean v0, p0, Lo/exs;->d:Z

    if-nez v0, :cond_0

    .line 91
    if-eqz p2, :cond_0

    .line 92
    sget v0, Lcom/huawei/ui/main/R$id;->extension:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    invoke-direct {p0, p1}, Lo/exs;->a(Landroid/app/Activity;)V

    .line 94
    invoke-direct {p0, p1}, Lo/exs;->e(Landroid/app/Activity;)V

    .line 97
    :cond_0
    return-void
.end method
