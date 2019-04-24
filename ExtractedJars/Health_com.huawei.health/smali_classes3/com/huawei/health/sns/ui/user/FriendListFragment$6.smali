.class final Lcom/huawei/health/sns/ui/user/FriendListFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/FriendListFragment;->n()Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Integer;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 653
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 653
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/FriendListFragment$6;->d(Lo/bra;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Integer;
    .locals 1

    .line 659
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v0}, Lo/atf;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
