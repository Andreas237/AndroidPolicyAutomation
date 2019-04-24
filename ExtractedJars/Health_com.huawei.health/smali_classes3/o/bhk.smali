.class public Lo/bhk;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhk$d;,
        Lo/bhk$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bhk$b;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private b:Z

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/CheckBox;>;"
        }
    .end annotation
.end field

.field private e:Landroid/view/LayoutInflater;

.field private i:I

.field private k:Lo/bhk$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;I)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bhk;->b:Z

    .line 54
    iput-object p2, p0, Lo/bhk;->c:Ljava/util/List;

    .line 55
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bhk;->e:Landroid/view/LayoutInflater;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bhk;->a:Ljava/util/ArrayList;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bhk;->d:Ljava/util/ArrayList;

    .line 58
    iput p3, p0, Lo/bhk;->i:I

    .line 59
    return-void
.end method

.method static synthetic a(Lo/bhk;)Ljava/util/ArrayList;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bhk;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic b(Lo/bhk;)Ljava/util/ArrayList;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bhk;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b(Lo/bhk$b;ILcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 4

    .line 143
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 144
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 145
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 148
    :cond_0
    iget-object v0, p0, Lo/bhk;->a:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p3}, Lo/bhk;->d(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 149
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 151
    :cond_1
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 153
    :goto_0
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lo/bhk$1;

    invoke-direct {v1, p0, p3}, Lo/bhk$1;-><init>(Lo/bhk;Lcom/huawei/health/sns/model/group/GroupMember;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 173
    return-void
.end method

.method static synthetic d(Lo/bhk;)Lo/bhk$d;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/bhk;->k:Lo/bhk$d;

    return-object v0
.end method

.method private d(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/GroupMember;)Z"
        }
    .end annotation

    .line 181
    const/4 v4, 0x0

    .line 182
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 183
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 184
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 185
    const/4 v4, 0x1

    .line 186
    goto :goto_1

    .line 188
    :cond_0
    goto :goto_0

    .line 190
    :cond_1
    :goto_1
    return v4
.end method

.method private e(Lo/bhk$b;ILcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 4

    .line 96
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 97
    iget-object v0, p0, Lo/bhk;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p2, :cond_0

    .line 98
    iget-object v0, p0, Lo/bhk;->d:Ljava/util/ArrayList;

    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v0, p0, Lo/bhk;->d:Ljava/util/ArrayList;

    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 102
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 105
    :cond_1
    iget-object v0, p0, Lo/bhk;->a:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p3}, Lo/bhk;->d(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 108
    :cond_2
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 110
    :goto_0
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lo/bhk$2;

    invoke-direct {v1, p0, p1, p3}, Lo/bhk$2;-><init>(Lo/bhk;Lo/bhk$b;Lcom/huawei/health/sns/model/group/GroupMember;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 135
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lo/bhk;->b:Z

    .line 38
    return-void
.end method

.method public b(Lo/bhk$b;I)V
    .locals 7

    .line 71
    iget-object v0, p0, Lo/bhk;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 72
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {p1}, Lo/bhk$b;->c(Lo/bhk$b;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lo/bhk;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 74
    invoke-static {p1}, Lo/bhk$b;->b(Lo/bhk$b;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 76
    :cond_0
    invoke-static {p1}, Lo/bhk$b;->b(Lo/bhk$b;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 79
    :goto_0
    invoke-static {p1}, Lo/bhk$b;->e(Lo/bhk$b;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    iget v0, p0, Lo/bhk;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 81
    invoke-direct {p0, p1, p2, v6}, Lo/bhk;->b(Lo/bhk$b;ILcom/huawei/health/sns/model/group/GroupMember;)V

    goto :goto_1

    .line 82
    :cond_1
    iget v0, p0, Lo/bhk;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 83
    invoke-static {p1}, Lo/bhk$b;->d(Lo/bhk$b;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto :goto_1

    .line 84
    :cond_2
    iget v0, p0, Lo/bhk;->i:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 85
    invoke-direct {p0, p1, p2, v6}, Lo/bhk;->e(Lo/bhk$b;ILcom/huawei/health/sns/model/group/GroupMember;)V

    .line 87
    :cond_3
    :goto_1
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo/bhk$b;
    .locals 4

    .line 65
    new-instance v0, Lo/bhk$b;

    iget-object v1, p0, Lo/bhk;->e:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_memb_list:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhk$b;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public c(Lo/bhk$d;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lo/bhk;->k:Lo/bhk$d;

    .line 215
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lo/bhk;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getItemCount()I
    .locals 2

    .line 195
    iget-object v0, p0, Lo/bhk;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/bhk;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 196
    iget-object v0, p0, Lo/bhk;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 25
    move-object v0, p1

    check-cast v0, Lo/bhk$b;

    invoke-virtual {p0, v0, p2}, Lo/bhk;->b(Lo/bhk$b;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 25
    invoke-virtual {p0, p1, p2}, Lo/bhk;->c(Landroid/view/ViewGroup;I)Lo/bhk$b;

    move-result-object v0

    return-object v0
.end method
