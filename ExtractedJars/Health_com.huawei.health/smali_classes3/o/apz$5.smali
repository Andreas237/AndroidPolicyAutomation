.class Lo/apz$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apz;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/apz;


# direct methods
.method constructor <init>(Lo/apz;Landroid/os/Looper;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/apz$5;->b:Lo/apz;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 125
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 127
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/health/sns/model/chat/MessageItem;

    if-eqz v0, :cond_0

    .line 129
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 130
    iget-object v0, p0, Lo/apz$5;->b:Lo/apz;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-static {v0, v1, v2}, Lo/apz;->c(Lo/apz;ILcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 132
    :cond_0
    return-void
.end method
