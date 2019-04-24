.class public Lo/bdh;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private e:Lo/bla;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 62
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdh;->c:Z

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdh;->e:Lo/bla;

    .line 63
    invoke-direct {p0, p2}, Lo/bdh;->d(Ljava/util/ArrayList;)V

    .line 64
    iput-object p1, p0, Lo/bdh;->b:Landroid/content/Context;

    .line 65
    iput-object p2, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    .line 66
    return-void
.end method

.method private b(I)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 1

    .line 191
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 193
    const/4 v0, 0x0

    return-object v0

    .line 195
    :cond_0
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/GroupMember;

    return-object v0
.end method

.method private c(I)Lcom/huawei/health/sns/model/search/SNSSearchBean;
    .locals 1

    .line 182
    iget-object v0, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 184
    const/4 v0, 0x0

    return-object v0

    .line 186
    :cond_0
    iget-object v0, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    return-object v0
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 236
    if-eqz p1, :cond_2

    .line 238
    const/4 v4, 0x0

    .line 239
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 241
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 242
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 243
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 245
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 249
    :cond_2
    return-void
.end method


# virtual methods
.method public a(I)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 8

    .line 156
    iget-boolean v0, p0, Lo/bdh;->c:Z

    if-eqz v0, :cond_3

    .line 158
    invoke-direct {p0, p1}, Lo/bdh;->c(I)Lcom/huawei/health/sns/model/search/SNSSearchBean;

    move-result-object v4

    .line 159
    if-nez v4, :cond_0

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    const/4 v5, 0x0

    .line 164
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 166
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 168
    move-object v5, v7

    .line 169
    goto :goto_1

    .line 171
    :cond_1
    goto :goto_0

    .line 172
    :cond_2
    :goto_1
    return-object v5

    .line 176
    :cond_3
    invoke-direct {p0, p1}, Lo/bdh;->b(I)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 223
    invoke-virtual {p0, p1}, Lo/bdh;->e(Ljava/util/ArrayList;)V

    .line 224
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdh;->c:Z

    .line 225
    iput-object p1, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    .line 226
    invoke-virtual {p0}, Lo/bdh;->notifyDataSetChanged()V

    .line 227
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 211
    invoke-direct {p0, p1}, Lo/bdh;->d(Ljava/util/ArrayList;)V

    .line 212
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdh;->c:Z

    .line 213
    iput-object p1, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    .line 214
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 258
    if-eqz p1, :cond_2

    .line 260
    const/4 v4, 0x0

    .line 261
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 263
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 264
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 265
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 267
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 271
    :cond_2
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 123
    const/4 v1, 0x0

    .line 124
    iget-boolean v0, p0, Lo/bdh;->c:Z

    if-eqz v0, :cond_1

    .line 126
    iget-object v0, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    goto :goto_1

    .line 130
    :cond_1
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 132
    :goto_1
    return v1
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 138
    iget-boolean v0, p0, Lo/bdh;->c:Z

    if-eqz v0, :cond_0

    .line 140
    invoke-direct {p0, p1}, Lo/bdh;->c(I)Lcom/huawei/health/sns/model/search/SNSSearchBean;

    move-result-object v0

    return-object v0

    .line 144
    :cond_0
    invoke-direct {p0, p1}, Lo/bdh;->b(I)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 201
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 71
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    return-object p2

    .line 77
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 79
    iget-object v0, p0, Lo/bdh;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_group_member_delete_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 80
    new-instance v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;

    invoke-direct {v6}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;-><init>()V

    .line 81
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->a:Landroid/widget/ImageView;

    .line 82
    sget v0, Lcom/huawei/android/sns/R$id;->txt_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    .line 83
    sget v0, Lcom/huawei/android/sns/R$id;->txt_subtip:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/android/sns/R$id;->txt_extra:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    .line 85
    invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 89
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;

    .line 92
    :goto_0
    iget-boolean v0, p0, Lo/bdh;->c:Z

    if-eqz v0, :cond_3

    .line 94
    iget-object v0, p0, Lo/bdh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 95
    new-instance v0, Lo/bla;

    iget-object v1, p0, Lo/bdh;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v7}, Lo/bla;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    iput-object v0, p0, Lo/bdh;->e:Lo/bla;

    .line 97
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    iget-object v2, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->a:Landroid/widget/ImageView;

    .line 98
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 97
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    new-instance v8, Lo/bdn;

    invoke-direct {v8}, Lo/bdn;-><init>()V

    .line 101
    iget-object v0, p0, Lo/bdh;->e:Lo/bla;

    invoke-virtual {v8, v6, v7, v0}, Lo/bdn;->c(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V

    .line 102
    iget-object v0, p0, Lo/bdh;->e:Lo/bla;

    invoke-virtual {v8, v6, v7, v0}, Lo/bdn;->b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V

    .line 103
    goto :goto_1

    .line 106
    :cond_3
    iget-object v0, p0, Lo/bdh;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 108
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    iget-object v2, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->a:Landroid/widget/ImageView;

    .line 109
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 110
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    .line 108
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lo/bdh;->b:Landroid/content/Context;

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 113
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 115
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 117
    :goto_1
    return-object p2
.end method
