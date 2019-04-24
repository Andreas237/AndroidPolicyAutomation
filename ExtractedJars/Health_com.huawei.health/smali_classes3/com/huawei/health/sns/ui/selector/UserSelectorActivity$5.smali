.class final Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->e(Z)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    .line 441
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$5;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 441
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$5;->e(Lo/bra;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bra;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation

    .line 445
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0}, Lo/axa;->e()Ljava/util/ArrayList;

    move-result-object v2

    .line 446
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$5;->e:Z

    if-eqz v0, :cond_1

    .line 448
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->g()Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 449
    if-eqz v3, :cond_0

    .line 451
    const/4 v0, 0x0

    invoke-virtual {v2, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 455
    :cond_0
    const-string v0, "UserSelectorActivity"

    const-string v1, "getLocalData self is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    :cond_1
    :goto_0
    return-object v2
.end method
