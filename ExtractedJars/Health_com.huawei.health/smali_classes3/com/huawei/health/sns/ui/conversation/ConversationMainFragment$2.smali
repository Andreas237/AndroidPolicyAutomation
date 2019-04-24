.class Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;->b:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;->b:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    .line 385
    const/4 v3, 0x0

    .line 389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;->b:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v3, v2}, Lo/axj;->c(Landroid/app/Activity;IZLandroid/os/Handler;)V

    .line 393
    new-instance v4, Lo/atn;

    invoke-direct {v4}, Lo/atn;-><init>()V

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$2;->b:Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/atn;->b(Landroid/app/Activity;)V

    .line 395
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 400
    return-void
.end method
