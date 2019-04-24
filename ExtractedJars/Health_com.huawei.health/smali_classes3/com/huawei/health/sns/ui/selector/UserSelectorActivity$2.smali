.class Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bjw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->c(Lo/axv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

.field final synthetic c:Lo/axv;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;Lo/axv;)V
    .locals 0

    .line 795
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->c:Lo/axv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 842
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;)V

    .line 843
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 10

    .line 799
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->c:Lo/axv;

    invoke-virtual {v0}, Lo/axv;->b()J

    move-result-wide v6

    .line 800
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->c:Lo/axv;

    invoke-virtual {v0}, Lo/axv;->f()I

    move-result v8

    .line 801
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_3

    .line 803
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v0, v6, v7, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->b(JLjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 805
    return-void

    .line 807
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-static {v0, v6, v7, v8, p1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;JILjava/lang/String;)V

    .line 808
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 809
    const-string v0, "is_share_msg"

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 810
    const/4 v0, 0x2

    if-ne v8, v0, :cond_1

    .line 812
    const-string v0, "groupId"

    invoke-virtual {v9, v0, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_0

    .line 816
    :cond_1
    const-string v0, "userId"

    invoke-virtual {v9, v0, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 818
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v9}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 820
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->m:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 822
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v0, v6, v7}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->d(J)V

    .line 824
    :cond_2
    goto :goto_1

    .line 825
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_4

    .line 827
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-object v1, p1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v2, v2, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->h:Ljava/util/ArrayList;

    .line 828
    invoke-static {v2}, Lo/bfg;->e(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object v2

    move-wide v3, v6

    move v5, v8

    .line 827
    invoke-virtual/range {v0 .. v5}, Lo/apz;->d(Ljava/lang/String;[Ljava/lang/String;JI)V

    .line 829
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(I)V

    goto :goto_1

    .line 831
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    sget-object v1, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    if-ne v0, v1, :cond_5

    .line 833
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    move-object v1, p1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    iget-object v2, v2, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->p:Ljava/lang/String;

    move-wide v3, v6

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Lo/apz;->d(Ljava/lang/String;Ljava/lang/String;JI)V

    .line 834
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->setResult(I)V

    .line 836
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity$2;->b:Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;->finish()V

    .line 837
    return-void
.end method
