.class final Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->h()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 362
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$3;->e(Lo/bra;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 368
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0}, Lo/axi;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
