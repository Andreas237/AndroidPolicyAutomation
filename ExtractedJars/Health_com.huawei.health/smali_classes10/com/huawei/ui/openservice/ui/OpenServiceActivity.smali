.class public Lcom/huawei/ui/openservice/ui/OpenServiceActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;
    }
.end annotation


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Opera_OpenServiceActivity"

.field private static final MSG_INIT_DATA:I = 0x1

.field private static final MSG_NOT_AUTH:I = 0x4

.field private static final MSG_NO_DATA_AND_NO_NET:I = 0x5

.field private static final MSG_NO_DATA_AND_SERVICE_ERROR:I = 0x6


# instance fields
.field private adapter:Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;

.field private animationDrawable:Landroid/graphics/drawable/AnimationDrawable;

.field private exceptionLayout:Landroid/widget/LinearLayout;

.field private gridView:Lcom/huawei/ui/openservice/ui/ScrollGridView;

.field private huid:Ljava/lang/String;

.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenService;>;"
        }
    .end annotation
.end field

.field private loadIncludeLayout:Landroid/widget/RelativeLayout;

.field private loadTextView:Landroid/widget/TextView;

.field private loadingImageView:Landroid/widget/ImageView;

.field private mContext:Landroid/content/Context;

.field private mExecutorService:Ljava/util/concurrent/ExecutorService;

.field private mHandler:Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

.field private mainIncludeLayout:Landroid/widget/RelativeLayout;

.field private netSettingBtn:Landroid/widget/Button;

.field private serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Landroid/content/Context;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Ljava/util/List;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->items:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->saveAuthStatus(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showMainLayout()V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showDialog(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showNoDataAnNoServiceLayout()V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showNoDataAndNoNetLayout()V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->dealItemClick(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->initData()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Z
    .locals 1

    .line 51
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->isDataExist()Z

    move-result v0

    return v0
.end method

.method static synthetic access$500(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->sendMsg(I)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->huid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;ILjava/lang/Object;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->sendMsg(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    return-void
.end method

.method private dealItemClick(Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 4

    .line 214
    sget-object v0, Lo/dae;->hm:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "OpenService"

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->doBI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$4;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 226
    return-void
.end method

.method private doBI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 173
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 174
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    const-string v0, "id"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    const-string v0, "name"

    invoke-interface {v3, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    const-string v0, "entrance"

    invoke-interface {v3, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 179
    return-void
.end method

.method private init()V
    .locals 3

    .line 88
    sget v0, Lcom/huawei/ui/openservice/R$id;->open_service_main:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mainIncludeLayout:Landroid/widget/RelativeLayout;

    .line 89
    sget v0, Lcom/huawei/ui/openservice/R$id;->open_service_load:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadIncludeLayout:Landroid/widget/RelativeLayout;

    .line 90
    sget v0, Lcom/huawei/ui/openservice/R$id;->net_setting_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->netSettingBtn:Landroid/widget/Button;

    .line 91
    sget v0, Lcom/huawei/ui/openservice/R$id;->open_service_grid_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/ui/ScrollGridView;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->gridView:Lcom/huawei/ui/openservice/ui/ScrollGridView;

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->gridView:Lcom/huawei/ui/openservice/ui/ScrollGridView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/ScrollGridView;->setNumColumns(I)V

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->gridView:Lcom/huawei/ui/openservice/ui/ScrollGridView;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/ScrollGridView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->netSettingBtn:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$1;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    sget v0, Lcom/huawei/ui/openservice/R$id;->center_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadTextView:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/ui/openservice/R$id;->open_service_ex_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->exceptionLayout:Landroid/widget/LinearLayout;

    .line 104
    sget v0, Lcom/huawei/ui/openservice/R$id;->open_service_loading_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadingImageView:Landroid/widget/ImageView;

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadingImageView:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadingImageView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->animationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->animationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 108
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->initItems()V

    .line 109
    return-void
.end method

.method private initAdapter()V
    .locals 4

    .line 135
    new-instance v0, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    new-instance v3, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$2;

    invoke-direct {v3, p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$2;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;-><init>(Ljava/util/List;Landroid/content/Context;Landroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->adapter:Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->gridView:Lcom/huawei/ui/openservice/ui/ScrollGridView;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->adapter:Lcom/huawei/ui/openservice/ui/adapter/OpenServiceGridAdapter;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/ScrollGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 146
    return-void
.end method

.method private initData()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->huid:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->huid:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->huid:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryAllService()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->items:Ljava/util/List;

    .line 169
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->items:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->orderOpenService(Ljava/util/List;)V

    .line 170
    return-void
.end method

.method private initItems()V
    .locals 2

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$3;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 164
    return-void
.end method

.method private isDataExist()Z
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->items:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/model/OpenService;->isEmpty(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private saveAuthStatus(Ljava/lang/String;)V
    .locals 5

    .line 230
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$5;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    goto :goto_0

    .line 240
    :catch_0
    move-exception v4

    .line 241
    const-string v0, "Opera_OpenServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openServiceActivity saveAuthStatus() RejectedExecutionException ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :goto_0
    return-void
.end method

.method private sendMsg(I)V
    .locals 4

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mHandler:Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 183
    iput p1, v3, Landroid/os/Message;->what:I

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mHandler:Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 185
    return-void
.end method

.method private sendMsg(ILjava/lang/Object;)V
    .locals 4

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mHandler:Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 189
    iput p1, v3, Landroid/os/Message;->what:I

    .line 190
    iput-object p2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mHandler:Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 192
    return-void
.end method

.method private showDialog(Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 4

    .line 247
    const-string v0, "Opera_OpenServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openServiceActivity showDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getHmsAuth()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 249
    const-string v0, "Opera_OpenServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this is health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showServiceAuthDialog(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    goto :goto_0

    .line 252
    :cond_0
    const-string v0, "Opera_OpenServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this is HMS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 254
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->saveAuthStatus(Ljava/lang/String;)V

    .line 256
    :goto_0
    return-void
.end method

.method private showMainLayout()V
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->animationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadIncludeLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mainIncludeLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->initAdapter()V

    .line 116
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->showNoDataLayout()V

    .line 117
    return-void
.end method

.method private showNoDataAnNoServiceLayout()V
    .locals 3

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->animationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadingImageView:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->exceptionLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_no_services:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    return-void
.end method

.method private showNoDataAndNoNetLayout()V
    .locals 3

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->animationDrawable:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadingImageView:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->exceptionLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->loadTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/openservice/R$string;->IDS_hwh_open_service_no_network:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->netSettingBtn:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 125
    return-void
.end method

.method private showNoDataLayout()V
    .locals 0

    .line 199
    return-void
.end method

.method private showServiceAuthDialog(Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 4

    .line 260
    new-instance v3, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 261
    invoke-virtual {v3, p1}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->setService(Lcom/huawei/ui/openservice/db/model/OpenService;)Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$6;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;Lcom/huawei/ui/openservice/db/model/OpenService;)V

    .line 262
    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->setPositiveButton(Landroid/view/View$OnClickListener;)Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    .line 269
    invoke-virtual {v3}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->create()Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    move-result-object v2

    .line 270
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->setCancelable(Z)V

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    invoke-virtual {v2}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->show()V

    .line 274
    :cond_0
    return-void
.end method

.method private startService(Lcom/huawei/ui/openservice/db/model/OpenService;)V
    .locals 5

    .line 203
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 204
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    const-string v0, "EXTRA_BI_ID"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 206
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 207
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "OpenService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 208
    const-string v0, "type"

    const-string v1, "OPEN_SERVICE_TYPE"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 210
    sget-object v0, Lo/dae;->hj:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "OpenService"

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->doBI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 284
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 285
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 76
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 77
    iput-object p0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    .line 78
    new-instance v0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

    invoke-direct {v0, p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;-><init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mHandler:Lcom/huawei/ui/openservice/ui/OpenServiceActivity$OpenServiceHandler;

    .line 79
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->items:Ljava/util/List;

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->serviceControl:Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    .line 82
    sget v0, Lcom/huawei/ui/openservice/R$layout;->activity_open_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->setContentView(I)V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->huid:Ljava/lang/String;

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->init()V

    .line 85
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 278
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->mExecutorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 280
    :cond_0
    return-void
.end method
