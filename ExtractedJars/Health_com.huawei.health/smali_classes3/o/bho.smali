.class public Lo/bho;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bho$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bho$e;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:I

.field private d:Landroid/view/LayoutInflater;

.field private e:I

.field private f:Z

.field private g:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;J)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/bho;->c:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/bho;->e:I

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bho;->f:Z

    .line 43
    iput-object p1, p0, Lo/bho;->b:Landroid/content/Context;

    .line 44
    iput-object p2, p0, Lo/bho;->a:Ljava/util/List;

    .line 45
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bho;->d:Landroid/view/LayoutInflater;

    .line 46
    iput-wide p3, p0, Lo/bho;->g:J

    .line 47
    return-void
.end method

.method static synthetic b(Lo/bho;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/bho;->b:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 168
    const-string v0, "HealthGroupMembRcyAdatp"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupQR groupid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/bho;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bho;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 170
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 171
    const-string v0, "bundleKeyGroupId"

    iget-wide v1, p0, Lo/bho;->g:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 172
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 173
    iget-object v0, p0, Lo/bho;->b:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 174
    return-void
.end method

.method static synthetic c(Lo/bho;)J
    .locals 2

    .line 26
    iget-wide v0, p0, Lo/bho;->g:J

    return-wide v0
.end method

.method static synthetic e(Lo/bho;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/bho;->b()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/bho$e;
    .locals 4

    .line 51
    new-instance v0, Lo/bho$e;

    iget-object v1, p0, Lo/bho;->d:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_memb:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bho$e;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public a(Lo/bho$e;I)V
    .locals 8

    .line 57
    iget v0, p0, Lo/bho;->e:I

    if-gtz v0, :cond_0

    .line 58
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/bho$e;->setIsRecyclable(Z)V

    .line 62
    iget v0, p0, Lo/bho;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 63
    if-nez p2, :cond_2

    .line 64
    iget-object v0, p0, Lo/bho;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 65
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v7

    .line 67
    if-nez v7, :cond_1

    .line 68
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v7

    .line 70
    :cond_1
    invoke-static {p1}, Lo/bho$e;->d(Lo/bho$e;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 71
    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    .line 72
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_ic_addition_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 73
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lo/bho$3;

    invoke-direct {v1, p0}, Lo/bho$3;-><init>(Lo/bho;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 80
    :cond_3
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 81
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 83
    :cond_4
    iget-boolean v0, p0, Lo/bho;->f:Z

    if-eqz v0, :cond_8

    .line 84
    iget v0, p0, Lo/bho;->e:I

    if-ge p2, v0, :cond_6

    .line 85
    iget-object v0, p0, Lo/bho;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 86
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v7

    .line 88
    if-nez v7, :cond_5

    .line 89
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v7

    .line 91
    :cond_5
    invoke-static {p1}, Lo/bho$e;->d(Lo/bho$e;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 92
    goto/16 :goto_0

    .line 93
    :cond_6
    iget v0, p0, Lo/bho;->e:I

    if-ne p2, v0, :cond_7

    .line 94
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_ic_addition_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 95
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lo/bho$2;

    invoke-direct {v1, p0}, Lo/bho$2;-><init>(Lo/bho;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 101
    :cond_7
    iget v0, p0, Lo/bho;->e:I

    add-int/lit8 v0, v0, 0x1

    if-ne p2, v0, :cond_c

    .line 102
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_ic_delete_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 103
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lo/bho$1;

    invoke-direct {v1, p0}, Lo/bho$1;-><init>(Lo/bho;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 115
    :cond_8
    iget v0, p0, Lo/bho;->e:I

    if-ge p2, v0, :cond_a

    .line 116
    iget-object v0, p0, Lo/bho;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 117
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v7

    .line 119
    if-nez v7, :cond_9

    .line 120
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v7

    .line 122
    :cond_9
    invoke-static {p1}, Lo/bho$e;->d(Lo/bho$e;)Lo/egb;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 123
    goto :goto_0

    .line 124
    :cond_a
    iget v0, p0, Lo/bho;->e:I

    if-ne p2, v0, :cond_b

    .line 125
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_ic_addition_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 126
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lo/bho$4;

    invoke-direct {v1, p0}, Lo/bho$4;-><init>(Lo/bho;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 132
    :cond_b
    iget v0, p0, Lo/bho;->e:I

    add-int/lit8 v0, v0, 0x1

    if-ne p2, v0, :cond_c

    .line 133
    invoke-static {p1}, Lo/bho$e;->e(Lo/bho$e;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 138
    :cond_c
    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lo/bho;->f:Z

    .line 37
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 143
    iget-object v0, p0, Lo/bho;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 144
    const/4 v0, 0x4

    iput v0, p0, Lo/bho;->e:I

    .line 145
    const/4 v0, 0x6

    iput v0, p0, Lo/bho;->c:I

    goto :goto_0

    .line 147
    :cond_0
    iget-object v0, p0, Lo/bho;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bho;->e:I

    .line 148
    iget-object v0, p0, Lo/bho;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/bho;->c:I

    .line 150
    :goto_0
    iget v0, p0, Lo/bho;->c:I

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 26
    move-object v0, p1

    check-cast v0, Lo/bho$e;

    invoke-virtual {p0, v0, p2}, Lo/bho;->a(Lo/bho$e;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 26
    invoke-virtual {p0, p1, p2}, Lo/bho;->a(Landroid/view/ViewGroup;I)Lo/bho$e;

    move-result-object v0

    return-object v0
.end method
