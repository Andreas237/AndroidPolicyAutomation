.class Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$4;->d:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$4;->d:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    .line 291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$4;->d:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    .line 292
    return-void
.end method
