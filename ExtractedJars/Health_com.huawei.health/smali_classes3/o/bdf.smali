.class public Lo/bdf;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private i:Lo/bla;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 72
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdf;->c:Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdf;->i:Lo/bla;

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    .line 73
    iput-object p1, p0, Lo/bdf;->e:Landroid/content/Context;

    .line 74
    iput-object p2, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    .line 75
    return-void
.end method


# virtual methods
.method public a(JZ)V
    .locals 2

    .line 267
    if-eqz p3, :cond_0

    .line 269
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 271
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 276
    :cond_0
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 278
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 281
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lo/bdf;->notifyDataSetChanged()V

    .line 282
    return-void
.end method

.method public b()I
    .locals 1

    .line 206
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 375
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdf;->c:Z

    .line 376
    iput-object p1, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    .line 377
    invoke-virtual {p0}, Lo/bdf;->notifyDataSetChanged()V

    .line 378
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;)V"
        }
    .end annotation

    .line 363
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bdf;->c:Z

    .line 364
    iput-object p1, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    .line 365
    invoke-virtual {p0}, Lo/bdf;->notifyDataSetChanged()V

    .line 366
    return-void
.end method

.method public d(I)J
    .locals 5

    .line 330
    const-wide/16 v2, 0x0

    .line 332
    iget-boolean v0, p0, Lo/bdf;->c:Z

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 335
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 336
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v2

    .line 337
    goto :goto_0

    .line 341
    :cond_0
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 342
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 343
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    .line 347
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public d()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 238
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 240
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 242
    return-object v4

    .line 244
    :cond_0
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Long;

    .line 247
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 249
    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 251
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    goto :goto_2

    .line 254
    :cond_1
    goto :goto_1

    .line 255
    :cond_2
    :goto_2
    goto :goto_0

    .line 256
    :cond_3
    return-object v4
.end method

.method public e([J)V
    .locals 7

    .line 216
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 218
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    .line 220
    :cond_0
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 222
    if-eqz p1, :cond_1

    .line 224
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-wide v5, v2, v4

    .line 226
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 229
    :cond_1
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 287
    const/4 v1, 0x0

    .line 288
    iget-boolean v0, p0, Lo/bdf;->c:Z

    if-eqz v0, :cond_1

    .line 290
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    goto :goto_1

    .line 294
    :cond_1
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 296
    :goto_1
    return v1
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 302
    iget-boolean v0, p0, Lo/bdf;->c:Z

    if-eqz v0, :cond_1

    .line 304
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 305
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 308
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 313
    :cond_1
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_2

    .line 314
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 317
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 353
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 80
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 82
    :cond_0
    return-object p2

    .line 86
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 88
    iget-object v0, p0, Lo/bdf;->e:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_group_member_delete_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 89
    new-instance v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;

    invoke-direct {v6}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;-><init>()V

    .line 90
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->a:Landroid/widget/ImageView;

    .line 91
    sget v0, Lcom/huawei/android/sns/R$id;->txt_subtip:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    .line 92
    sget v0, Lcom/huawei/android/sns/R$id;->txt_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/huawei/android/sns/R$id;->txt_extra:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    .line 94
    sget v0, Lcom/huawei/android/sns/R$id;->checkbox_status_btn:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    .line 95
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 96
    invoke-virtual {p2, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;

    .line 103
    :goto_0
    const-wide/16 v7, 0x0

    .line 105
    iget-boolean v0, p0, Lo/bdf;->c:Z

    if-eqz v0, :cond_3

    .line 106
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_4

    .line 107
    iget-object v0, p0, Lo/bdf;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 109
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v7

    .line 110
    new-instance v0, Lo/bla;

    iget-object v1, p0, Lo/bdf;->e:Landroid/content/Context;

    invoke-direct {v0, v1, v9}, Lo/bla;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    iput-object v0, p0, Lo/bdf;->i:Lo/bla;

    .line 112
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    iget-object v2, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->a:Landroid/widget/ImageView;

    .line 113
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 112
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    new-instance v10, Lo/bdn;

    invoke-direct {v10}, Lo/bdn;-><init>()V

    .line 116
    iget-object v0, p0, Lo/bdf;->i:Lo/bla;

    invoke-virtual {v10, v6, v9, v0}, Lo/bdn;->c(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V

    .line 117
    iget-object v0, p0, Lo/bdf;->i:Lo/bla;

    invoke-virtual {v10, v6, v9, v0}, Lo/bdn;->b(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;Lcom/huawei/health/sns/model/search/SNSSearchBean;Lo/bla;)V

    .line 118
    goto :goto_1

    .line 120
    :cond_3
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_4

    .line 121
    iget-object v0, p0, Lo/bdf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 122
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v7

    .line 124
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    iget-object v2, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->a:Landroid/widget/ImageView;

    .line 125
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 126
    invoke-virtual {v9}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    .line 124
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lo/bdf;->e:Landroid/content/Context;

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    .line 129
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 132
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->c:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 137
    :cond_4
    :goto_1
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    .line 139
    iget-object v0, p0, Lo/bdf;->d:Ljava/util/ArrayList;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 141
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_2

    .line 145
    :cond_5
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_2

    .line 150
    :cond_6
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 153
    :goto_2
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_8

    .line 155
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 157
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 158
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_3

    .line 162
    :cond_7
    iget-object v0, v6, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$a;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 165
    :cond_8
    :goto_3
    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 6

    .line 171
    const-wide/16 v2, 0x0

    .line 172
    invoke-virtual {p0, p1}, Lo/bdf;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    .line 173
    if-nez v4, :cond_0

    .line 175
    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result v0

    return v0

    .line 178
    :cond_0
    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_1

    .line 180
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 181
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    .line 182
    goto :goto_0

    .line 183
    :cond_1
    instance-of v0, v4, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_2

    .line 185
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 186
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v2

    .line 189
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 191
    iget-object v0, p0, Lo/bdf;->g:Ljava/util/ArrayList;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 193
    const/4 v0, 0x0

    return v0

    .line 196
    :cond_3
    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result v0

    return v0
.end method
