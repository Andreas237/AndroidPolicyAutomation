.class Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/server/query/QueryThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "QueryResultHandler"
.end annotation


# instance fields
.field private mQueryThread:Lcom/huawei/qrcode/server/query/QueryThread;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/huawei/qrcode/server/query/QueryThread;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;->mQueryThread:Lcom/huawei/qrcode/server/query/QueryThread;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;->mQueryThread:Lcom/huawei/qrcode/server/query/QueryThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/server/query/QueryThread$QueryResultHandler;->mQueryThread:Lcom/huawei/qrcode/server/query/QueryThread;

    invoke-static {v0, p1}, Lcom/huawei/qrcode/server/query/QueryThread;->access$000(Lcom/huawei/qrcode/server/query/QueryThread;Landroid/os/Message;)V

    :cond_0
    return-void
.end method
