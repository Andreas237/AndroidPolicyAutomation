.class public Lo/bil;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bil$d;,
        Lo/bil$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bil$c;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/CheckBox;>;"
        }
    .end annotation
.end field

.field private b:Landroid/view/LayoutInflater;

.field private c:Z

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private f:I

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map<Ljava/lang/Long;Landroid/graphics/Bitmap;>;>;"
        }
    .end annotation
.end field

.field private i:Lo/bil$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;I)V"
        }
    .end annotation

    .line 55
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bil;->c:Z

    .line 57
    iput-object p2, p0, Lo/bil;->d:Ljava/util/List;

    .line 58
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bil;->b:Landroid/view/LayoutInflater;

    .line 59
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bil;->e:Ljava/util/ArrayList;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bil;->a:Ljava/util/ArrayList;

    .line 61
    iput p3, p0, Lo/bil;->f:I

    .line 62
    invoke-static {p1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bil;->g:Ljava/util/List;

    .line 63
    return-void
.end method

.method static synthetic a(Lo/bil;)Ljava/util/ArrayList;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bil;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/GroupMember;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Lcom/huawei/health/sns/model/group/GroupMember;)Z"
        }
    .end annotation

    .line 184
    const/4 v4, 0x0

    .line 185
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 186
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

    .line 187
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 188
    const/4 v4, 0x1

    .line 189
    goto :goto_1

    .line 191
    :cond_0
    goto :goto_0

    .line 193
    :cond_1
    :goto_1
    return v4
.end method

.method static synthetic c(Lo/bil;)Ljava/util/ArrayList;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bil;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c(Lo/bil$c;ILcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 4

    .line 146
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 147
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    const-wide v2, 0x5d471fdcb4e9480L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 148
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 151
    :cond_0
    iget-object v0, p0, Lo/bil;->e:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p3}, Lo/bil;->b(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 154
    :cond_1
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 156
    :goto_0
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lo/bil$5;

    invoke-direct {v1, p0, p3}, Lo/bil$5;-><init>(Lo/bil;Lcom/huawei/health/sns/model/group/GroupMember;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 176
    return-void
.end method

.method private d(Lo/bil$c;ILcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 4

    .line 99
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lo/bil;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p2, :cond_0

    .line 101
    iget-object v0, p0, Lo/bil;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    iget-object v0, p0, Lo/bil;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 104
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    const-wide v2, 0x5d471fdcb4e9480L

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 105
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 108
    :cond_1
    iget-object v0, p0, Lo/bil;->e:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p3}, Lo/bil;->b(Ljava/util/ArrayList;Lcom/huawei/health/sns/model/group/GroupMember;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 109
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 111
    :cond_2
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 113
    :goto_0
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lo/bil$2;

    invoke-direct {v1, p0, p1, p3}, Lo/bil$2;-><init>(Lo/bil;Lo/bil$c;Lcom/huawei/health/sns/model/group/GroupMember;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 138
    return-void
.end method

.method static synthetic e(Lo/bil;)Lo/bil$d;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bil;->i:Lo/bil$d;

    return-object v0
.end method


# virtual methods
.method public c(Lo/bil$d;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lo/bil;->i:Lo/bil$d;

    .line 218
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lo/bil$c;
    .locals 4

    .line 69
    new-instance v0, Lo/bil$c;

    iget-object v1, p0, Lo/bil;->b:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_memb_list:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bil$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lo/bil;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method public e(Lo/bil$c;I)V
    .locals 5

    .line 75
    iget-object v0, p0, Lo/bil;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 76
    invoke-static {p1}, Lo/bil$c;->c(Lo/bil$c;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/bil;->g:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 77
    iget-object v0, p0, Lo/bil;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 78
    invoke-static {p1}, Lo/bil$c;->a(Lo/bil$c;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 80
    :cond_0
    invoke-static {p1}, Lo/bil$c;->a(Lo/bil$c;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 82
    :goto_0
    invoke-static {p1}, Lo/bil$c;->b(Lo/bil$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget v0, p0, Lo/bil;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 84
    invoke-direct {p0, p1, p2, v4}, Lo/bil;->c(Lo/bil$c;ILcom/huawei/health/sns/model/group/GroupMember;)V

    goto :goto_1

    .line 85
    :cond_1
    iget v0, p0, Lo/bil;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 86
    invoke-static {p1}, Lo/bil$c;->d(Lo/bil$c;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    goto :goto_1

    .line 87
    :cond_2
    iget v0, p0, Lo/bil;->f:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 88
    invoke-direct {p0, p1, p2, v4}, Lo/bil;->d(Lo/bil$c;ILcom/huawei/health/sns/model/group/GroupMember;)V

    .line 90
    :cond_3
    :goto_1
    return-void
.end method

.method public getItemCount()I
    .locals 2

    .line 198
    iget-object v0, p0, Lo/bil;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lo/bil;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 199
    iget-object v0, p0, Lo/bil;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 28
    move-object v0, p1

    check-cast v0, Lo/bil$c;

    invoke-virtual {p0, v0, p2}, Lo/bil;->e(Lo/bil$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 28
    invoke-virtual {p0, p1, p2}, Lo/bil;->d(Landroid/view/ViewGroup;I)Lo/bil$c;

    move-result-object v0

    return-object v0
.end method
