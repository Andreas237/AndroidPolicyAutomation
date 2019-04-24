.class public Lo/bin;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bin$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bin$c;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/util/Map<Ljava/lang/Long;Landroid/graphics/Bitmap;>;>;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Landroid/view/LayoutInflater;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;J)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lo/bin;->e:I

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/bin;->b:I

    .line 40
    iput-object p2, p0, Lo/bin;->d:Ljava/util/List;

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bin;->c:Landroid/view/LayoutInflater;

    .line 42
    invoke-static {p1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bin;->a:Ljava/util/List;

    .line 43
    return-void
.end method


# virtual methods
.method public a(Lo/bin$c;I)V
    .locals 5

    .line 53
    iget v0, p0, Lo/bin;->b:I

    if-gtz v0, :cond_0

    .line 54
    return-void

    .line 56
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/bin$c;->setIsRecyclable(Z)V

    .line 58
    iget-object v0, p0, Lo/bin;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 59
    invoke-static {p1}, Lo/bin$c;->e(Lo/bin$c;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lo/bin;->a:Ljava/util/List;

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

    .line 60
    invoke-static {p1}, Lo/bin$c;->a(Lo/bin$c;)Lo/egb;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 61
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lo/bin$c;
    .locals 4

    .line 47
    new-instance v0, Lo/bin$c;

    iget-object v1, p0, Lo/bin;->c:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_memb:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bin$c;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public getItemCount()I
    .locals 2

    .line 66
    iget-object v0, p0, Lo/bin;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    .line 67
    const/4 v0, 0x6

    iput v0, p0, Lo/bin;->b:I

    .line 68
    const/4 v0, 0x6

    iput v0, p0, Lo/bin;->e:I

    goto :goto_0

    .line 70
    :cond_0
    iget-object v0, p0, Lo/bin;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bin;->b:I

    .line 71
    iget-object v0, p0, Lo/bin;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/bin;->e:I

    .line 73
    :goto_0
    iget v0, p0, Lo/bin;->e:I

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/bin$c;

    invoke-virtual {p0, v0, p2}, Lo/bin;->a(Lo/bin$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 29
    invoke-virtual {p0, p1, p2}, Lo/bin;->d(Landroid/view/ViewGroup;I)Lo/bin$c;

    move-result-object v0

    return-object v0
.end method
