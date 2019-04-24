.class Lo/beo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beo;->k(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/beo;

.field final synthetic e:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/beo;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lo/beo$4;->d:Lo/beo;

    iput-object p2, p0, Lo/beo$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 235
    iget-object v0, p0, Lo/beo$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/beo$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 237
    iget-object v0, p0, Lo/beo$4;->d:Lo/beo;

    iget-object v1, p0, Lo/beo$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    iget-object v3, p0, Lo/beo$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/beo;->d(Lo/beo;JJ)V

    .line 238
    const/4 v0, 0x1

    return v0

    .line 240
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
