.class public Lcom/huawei/qrcode/server/query/QueryThread;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;
    }
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private mQueryProduceCodeListener:Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;

.field private mUrl:Ljava/lang/String;

.field private queryResultHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mQueryProduceCodeListener:Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;

    new-instance v0, Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;-><init>(Landroid/os/Looper;Lcom/huawei/qrcode/server/query/QueryThread;)V

    iput-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->queryResultHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/server/query/QueryThread;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/server/query/QueryThread;->handlerMesg(Landroid/os/Message;)V

    return-void
.end method

.method private handlerMesg(Landroid/os/Message;)V
    .locals 4

    iget v2, p1, Landroid/os/Message;->what:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryThread what ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0x64

    if-ne v0, v2, :cond_1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mQueryProduceCodeListener:Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mQueryProduceCodeListener:Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;

    invoke-interface {v0, v3}, Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;->onQuerySuccessCallBack(Ljava/lang/String;)V

    :cond_0
    goto :goto_0

    :cond_1
    const/16 v0, -0x64

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mQueryProduceCodeListener:Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mQueryProduceCodeListener:Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/logic/IQueryProduceCodeListener;->onQueryFailCallBack(I)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v2, Lcom/huawei/qrcode/server/query/HttpConnTask;

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/qrcode/server/query/QueryThread;->mUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/qrcode/server/query/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/huawei/qrcode/server/query/HttpConnTask;->processTask()Lcom/huawei/qrcode/server/query/ReturnInfo;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->queryResultHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    invoke-virtual {v3}, Lcom/huawei/qrcode/server/query/ReturnInfo;->getCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    const/16 v0, 0x64

    iput v0, v4, Landroid/os/Message;->what:I

    invoke-virtual {v3}, Lcom/huawei/qrcode/server/query/ReturnInfo;->getResult()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/16 v0, -0x64

    iput v0, v4, Landroid/os/Message;->what:I

    invoke-virtual {v3}, Lcom/huawei/qrcode/server/query/ReturnInfo;->getCode()I

    move-result v0

    iput v0, v4, Landroid/os/Message;->arg1:I

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread;->queryResultHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
