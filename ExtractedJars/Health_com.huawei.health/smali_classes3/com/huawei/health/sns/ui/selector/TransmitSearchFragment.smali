.class public Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;
.super Lcom/huawei/health/sns/ui/search/SearchFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/search/SearchFragment;-><init>()V

    return-void
.end method

.method public static b()Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;
    .locals 1

    .line 29
    new-instance v0, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;

    invoke-direct {v0}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;-><init>()V

    return-object v0
.end method


# virtual methods
.method public d(Lo/bfl;)V
    .locals 6

    .line 44
    invoke-virtual {p1}, Lo/bfl;->d()Lo/bfh;

    move-result-object v2

    .line 45
    instance-of v0, v2, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-nez v0, :cond_0

    .line 47
    const-string v0, "TransmitSearchFragment"

    const-string v1, "FriendSearchBean onClick , but data is not instanceof FriendSearchBean"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    return-void

    .line 50
    :cond_0
    move-object v3, v2

    check-cast v3, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 51
    invoke-virtual {v2}, Lo/bfh;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    invoke-virtual {v2}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->d:Lo/bfp$c;

    if-ne v0, v1, :cond_2

    .line 53
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    .line 54
    new-instance v5, Lo/axv;

    invoke-direct {v5}, Lo/axv;-><init>()V

    .line 55
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/axv;->d(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/axv;->d(J)V

    .line 57
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getRelation()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/axv;->a(I)V

    .line 58
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/axv;->e(I)V

    .line 59
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getOldImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/axv;->a(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/axv;->b(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/axv;->e(Ljava/lang/String;)V

    .line 62
    iget-object v0, v4, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(Lo/axv;)V

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_3

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->f:Lo/bfp$c;

    if-ne v0, v1, :cond_4

    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    .line 68
    new-instance v5, Lo/axv;

    invoke-direct {v5}, Lo/axv;-><init>()V

    .line 69
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/axv;->d(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lo/axv;->d(J)V

    .line 71
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/axv;->e(I)V

    .line 72
    iget-object v0, v4, Lcom/huawei/health/sns/ui/selector/TransmitActivity;->f:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->b(Lo/axv;)V

    .line 74
    :cond_4
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 35
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/search/SearchFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->b:Landroid/view/View;

    .line 37
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->a(I)V

    .line 38
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitSearchFragment;->b:Landroid/view/View;

    return-object v0
.end method
