.class Lo/bev$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bev;->b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bev$d;

.field final synthetic b:Lo/bev;

.field final synthetic e:Lcom/huawei/health/sns/model/chat/MessageItem;


# direct methods
.method constructor <init>(Lo/bev;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bev$d;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/bev$4;->b:Lo/bev;

    iput-object p2, p0, Lo/bev$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/bev$4;->a:Lo/bev$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 122
    iget-object v0, p0, Lo/bev$4;->b:Lo/bev;

    iget-object v0, v0, Lo/bev;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 124
    new-instance v0, Lo/brj;

    iget-object v1, p0, Lo/bev$4;->b:Lo/bev;

    iget-object v1, v1, Lo/bev;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    iget-object v2, p0, Lo/bev$4;->e:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v3, p0, Lo/bev$4;->a:Lo/bev$d;

    iget-object v3, v3, Lo/bev$d;->b:Landroid/widget/ImageView;

    invoke-direct {v0, v1, v2, v3}, Lo/brj;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/widget/ImageView;)V

    invoke-virtual {v0}, Lo/brj;->d()V

    .line 129
    :cond_0
    return-void
.end method