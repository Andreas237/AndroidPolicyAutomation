.class final Lcom/huawei/health/sns/ui/user/UserNotifyFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/UserNotifyFragment;->p()Lo/brd;
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

    .line 612
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 612
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/UserNotifyFragment$6;->d(Lo/bra;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/List<Lcom/huawei/health/sns/model/user/UserNotify;>;"
        }
    .end annotation

    .line 618
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axi;->c(Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
