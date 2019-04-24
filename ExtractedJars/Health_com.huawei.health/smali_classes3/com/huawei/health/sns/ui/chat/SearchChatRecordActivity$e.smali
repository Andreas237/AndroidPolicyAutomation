.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Lcom/huawei/health/sns/model/user/User;>;"
    }
.end annotation


# instance fields
.field private a:J

.field private c:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

.field private d:J


# direct methods
.method public constructor <init>(JJLcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)V
    .locals 0

    .line 548
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 549
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->d:J

    .line 550
    iput-wide p3, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->a:J

    .line 551
    iput-object p5, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->c:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    .line 552
    return-void
.end method


# virtual methods
.method protected varargs c([Ljava/lang/Void;)Lcom/huawei/health/sns/model/user/User;
    .locals 7

    .line 559
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->d:J

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v6

    .line 560
    if-eqz v6, :cond_0

    .line 562
    new-instance v5, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 563
    invoke-virtual {v6, v5}, Lcom/huawei/health/sns/model/group/GroupMember;->updateToUser(Lcom/huawei/health/sns/model/user/User;)V

    goto :goto_0

    .line 568
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v5

    .line 570
    :goto_0
    return-object v5
.end method

.method protected d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 6

    .line 575
    if-eqz p1, :cond_1

    .line 577
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->c:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 578
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 577
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->c:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->c:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 586
    :cond_0
    const-string v0, "SearchChatRecordActivity"

    const-string v1, "SearchChatRecordActivity setGroupMemberHeadAndName set name error,holder.name is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 591
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->c:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$b;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {}, Lo/bbq;->d()I

    move-result v1

    invoke-static {v0, v1}, Lo/bbq;->a(Landroid/widget/ImageView;I)V

    .line 592
    const-string v0, "SearchChatRecordActivity"

    const-string v1, "SearchChatRecordActivity setGroupMemberHeadAndName error,groupMember is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    :goto_0
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 539
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->c([Ljava/lang/Void;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 539
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$e;->d(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method
