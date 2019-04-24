.class public Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/bmj$e;


# instance fields
.field protected f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

.field protected g:Lcom/huawei/health/sns/model/user/User;

.field protected h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;"
        }
    .end annotation
.end field

.field protected k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

.field private l:Z

.field protected m:Ljava/lang/String;

.field protected o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

.field protected p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->l:Z

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/Bundle;)V
    .locals 2

    .line 86
    const-string v0, "msgType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 87
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->c:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 90
    const-string v0, "msgItems"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->h:Ljava/util/ArrayList;

    goto/16 :goto_0

    .line 92
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 95
    const-string v0, "systemShareMsg"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    goto :goto_0

    .line 97
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->b:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 100
    const-string v0, "vCardUser"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->g:Lcom/huawei/health/sns/model/user/User;

    goto :goto_0

    .line 102
    :cond_2
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 104
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->a:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 105
    const-string v0, "msgLink"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 106
    const-string v0, "webImageStatus"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 108
    invoke-static {}, Lo/bmj;->a()Lo/bmj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bmj;->b(Lo/bmj$e;)V

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->l:Z

    goto :goto_0

    .line 112
    :cond_3
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 114
    sget-object v0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;->e:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->o:Lcom/huawei/health/sns/ui/selector/TransmitListFragment$e;

    .line 115
    const-string v0, "photoLink"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->p:Ljava/lang/String;

    .line 117
    :cond_4
    :goto_0
    return-void
.end method

.method protected b(JLjava/lang/String;)Z
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->k:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-static {p1, p2, p3, v0}, Lo/bjk;->a(JLjava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Z

    move-result v0

    return v0
.end method

.method protected b(Landroid/os/Bundle;)Z
    .locals 1

    .line 127
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->m:Ljava/lang/String;

    .line 150
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    if-eqz p2, :cond_0

    .line 184
    const-string v0, "setShareWebImageUpdateListener"

    const-string v1, "update linkMessage Image"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->f:Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    .line 188
    :cond_0
    return-void
.end method

.method protected d(J)V
    .locals 7

    .line 161
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    move-object v1, p0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    move-wide v4, p1

    iget-object v6, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->m:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lo/aow;->c(Landroid/content/Context;JJLjava/lang/String;)V

    .line 163
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 193
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/selector/BaseSelectorActivity;->l:Z

    if-eqz v0, :cond_0

    .line 195
    invoke-static {}, Lo/bmj;->a()Lo/bmj;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/bmj;->d(Lo/bmj$e;)V

    .line 197
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onDestroy()V

    .line 198
    return-void
.end method
