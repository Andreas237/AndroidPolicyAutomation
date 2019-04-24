.class Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(Lo/axv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

.field final synthetic e:Lo/axv;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Lo/axv;)V
    .locals 0

    .line 912
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->e:Lo/axv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 8

    .line 917
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->e:Lo/axv;

    invoke-virtual {v1}, Lo/axv;->b()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->e:Lo/axv;

    .line 918
    invoke-virtual {v3}, Lo/axv;->c()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-static {v4}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-static {v5}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->e:Lo/axv;

    .line 919
    invoke-virtual {v6}, Lo/axv;->f()I

    move-result v6

    .line 917
    invoke-virtual/range {v0 .. v6}, Lo/apz;->c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 921
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 922
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->e:Lo/axv;

    invoke-virtual {v1}, Lo/axv;->b()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->e:Lo/axv;

    .line 923
    invoke-virtual {v3}, Lo/axv;->f()I

    move-result v3

    .line 922
    invoke-static {v0, v1, v2, v3, v7}, Lo/bjl;->c(Landroid/support/v4/app/Fragment;JILandroid/os/Bundle;)V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 925
    return-void
.end method

.method public d()V
    .locals 1

    .line 930
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$2;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 931
    return-void
.end method
