.class public Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# static fields
.field private static final DETAIL_URI:Ljava/lang/String; = "detailUri"

.field private static final HTTP:Ljava/lang/String; = "http"

.field private static final HTTPS:Ljava/lang/String; = "https"

.field private static final MSG_ID:Ljava/lang/String; = "msgId"

.field private static final NO_MESSAGE:I = 0x1

.field private static final REFRESH_MESSAGE:I = 0x0

.field private static final REFRESH_MESSAGE_TIMEOUT_DURATION:I = 0x7530

.field private static final SHOW_LOADING_DIALOG_TIMEOUT_DISMISS:I = 0x2

.field private static final TAG:Ljava/lang/String; = "UIDV_MessageCenterActivity"


# instance fields
.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private listView:Landroid/widget/ListView;

.field private loadingLayout:Landroid/widget/LinearLayout;

.field private mLoadingProgressBar:Lhuawei/widget/HwProgressBar;

.field private messageCenterAdapter:Lo/fhc;

.field private messageCenterHandler:Landroid/os/Handler;

.field private messageCenterRunnable:Ljava/lang/Runnable;

.field private noMessageLayout:Landroid/widget/RelativeLayout;

.field private pausedFlag:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->pausedFlag:Z

    .line 202
    new-instance v0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$3;-><init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterRunnable:Ljava/lang/Runnable;

    .line 224
    new-instance v0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$2;-><init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)Landroid/os/Handler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;Ljava/util/List;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->processNotificationMsg(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;Ljava/util/List;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->showMessageCenterList(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->dismissLoading()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->showNoMessages()V

    return-void
.end method

.method private dismissLoading()V
    .locals 2

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->loadingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->mLoadingProgressBar:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 200
    return-void
.end method

.method private processNotificationMsg(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 322
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    return-void

    .line 325
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 326
    invoke-direct {p0, v2}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->showNotificationMsg(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 327
    goto :goto_0

    .line 328
    :cond_1
    return-void
.end method

.method private showLoading()V
    .locals 2

    .line 188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->listView:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->noMessageLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 190
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->loadingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->mLoadingProgressBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 192
    return-void
.end method

.method private showMessageCenterList(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 256
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showMessageCenterList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->listView:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->noMessageLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterAdapter:Lo/fhc;

    invoke-virtual {v0, p1}, Lo/fhc;->b(Ljava/util/List;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterAdapter:Lo/fhc;

    invoke-virtual {v0}, Lo/fhc;->notifyDataSetChanged()V

    .line 261
    return-void
.end method

.method private showNoMessages()V
    .locals 4

    .line 250
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoMessages"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->listView:Landroid/widget/ListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->noMessageLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 253
    return-void
.end method

.method private showNotificationMsg(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 1

    .line 335
    new-instance v0, Lo/fhd;

    invoke-direct {v0, p0, p1}, Lo/fhd;-><init>(Landroid/content/Context;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 336
    invoke-virtual {v0}, Lo/fhd;->d()V

    .line 337
    return-void
.end method

.method private updateMessageList()V
    .locals 4

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 275
    :cond_0
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executorService is shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$4;-><init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 294
    return-void
.end method

.method private updateMessageListForOverSea()V
    .locals 4

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 299
    :cond_0
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executorService is shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 302
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$5;-><init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 318
    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;)V
    .locals 4

    .line 265
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter onChange() flag: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->updateMessageList()V

    .line 270
    :cond_0
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave onChange() flag: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 71
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_message_center_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->setContentView(I)V

    .line 75
    sget v0, Lcom/huawei/ui/main/R$id;->items_listView1:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->listView:Landroid/widget/ListView;

    .line 76
    sget v0, Lcom/huawei/ui/main/R$id;->hw_messagecenter_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->loadingLayout:Landroid/widget/LinearLayout;

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->loadingLayout:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_messagecenter_loading_hpb:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->mLoadingProgressBar:Lhuawei/widget/HwProgressBar;

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->mLoadingProgressBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 79
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    invoke-static {p0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 83
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->messageCenter_layout_no_message:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->noMessageLayout:Landroid/widget/RelativeLayout;

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->listView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity$1;-><init>(Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->pausedFlag:Z

    .line 165
    new-instance v0, Lo/fhc;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, p0, v1}, Lo/fhc;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterAdapter:Lo/fhc;

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->listView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterAdapter:Lo/fhc;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 169
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->showLoading()V

    .line 171
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterRunnable:Ljava/lang/Runnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 173
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 176
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 181
    :cond_2
    const-string v0, "UIDV_MessageCenterActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave onCreate!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 365
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 366
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 367
    invoke-static {p0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 369
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->messageCenterHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 370
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->dismissLoading()V

    .line 371
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 359
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 360
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->pausedFlag:Z

    .line 361
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 346
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 348
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->pausedFlag:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 349
    invoke-static {p0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->k()V

    .line 352
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 353
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/MessageCenterActivity;->updateMessageListForOverSea()V

    .line 355
    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 341
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 342
    return-void
.end method
