.class Lo/bev$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bev;->c(Landroid/view/View;Lo/bev$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic d:Lo/bev$d;

.field final synthetic e:Lo/bev;


# direct methods
.method constructor <init>(Lo/bev;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bev$d;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/bev$1;->e:Lo/bev;

    iput-object p2, p0, Lo/bev$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bev$1;->d:Lo/bev$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 151
    iget-object v0, p0, Lo/bev$1;->e:Lo/bev;

    iget-object v0, v0, Lo/bev;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 152
    const-string v0, "ChatVoiceView"

    const-string v1, "onClick isSingleSelect"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    new-instance v0, Lo/brj;

    iget-object v1, p0, Lo/bev$1;->e:Lo/bev;

    iget-object v1, v1, Lo/bev;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    iget-object v2, p0, Lo/bev$1;->c:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v3, p0, Lo/bev$1;->d:Lo/bev$d;

    iget-object v3, v3, Lo/bev$d;->b:Landroid/widget/ImageView;

    invoke-direct {v0, v1, v2, v3}, Lo/brj;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/widget/ImageView;)V

    invoke-virtual {v0}, Lo/brj;->d()V

    goto :goto_0

    .line 157
    :cond_0
    const-string v0, "ChatVoiceView"

    const-string v1, "onClick isSingleSelect else"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    :goto_0
    return-void
.end method
