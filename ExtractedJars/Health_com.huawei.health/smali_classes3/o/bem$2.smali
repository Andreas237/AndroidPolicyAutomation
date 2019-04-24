.class Lo/bem$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bem;->b(Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bem;


# direct methods
.method constructor <init>(Lo/bem;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lo/bem$2;->e:Lo/bem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lo/bem$2;->e:Lo/bem;

    iget-object v0, v0, Lo/bem;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    instance-of v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    if-eqz v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/bem$2;->e:Lo/bem;

    iget-object v0, v0, Lo/bem;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    check-cast v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e()V

    .line 143
    :cond_0
    return-void
.end method
