.class final Lcom/huawei/health/sns/ui/conversation/ConversationFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Lo/bgd;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bgd;


# direct methods
.method constructor <init>(Lo/bgd;)V
    .locals 0

    .line 518
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$2;->a:Lo/bgd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 523
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$2;->a:Lo/bgd;

    if-eqz v0, :cond_0

    .line 525
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    invoke-virtual {v0}, Lo/ast;->a()[I

    move-result-object v0

    const/4 v1, 0x1

    aget v2, v0, v1

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$2;->a:Lo/bgd;

    invoke-interface {v0, v2}, Lo/bgd;->d(I)V

    .line 529
    :cond_0
    return-void
.end method
