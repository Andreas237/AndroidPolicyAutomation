.class public Lo/bie;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bie$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bie$a;>;"
    }
.end annotation


# instance fields
.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;>;"
        }
    .end annotation
.end field

.field private e:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 31
    iput-object p2, p0, Lo/bie;->c:Ljava/util/List;

    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bie;->e:Landroid/view/LayoutInflater;

    .line 33
    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;I)Lo/bie$a;
    .locals 4

    .line 37
    new-instance v0, Lo/bie$a;

    iget-object v1, p0, Lo/bie;->e:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_memb:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bie$a;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public b(Lo/bie$a;I)V
    .locals 5

    .line 42
    iget-object v0, p0, Lo/bie;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    .line 43
    const-string v0, "Group_HealthEventMemberAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "url="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getPhoto()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    invoke-static {p1}, Lo/bie$a;->b(Lo/bie$a;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getPhoto()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 47
    invoke-static {p1}, Lo/bie$a;->c(Lo/bie$a;)Lo/egb;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 48
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 52
    iget-object v0, p0, Lo/bie;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 53
    iget-object v0, p0, Lo/bie;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 55
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 25
    move-object v0, p1

    check-cast v0, Lo/bie$a;

    invoke-virtual {p0, v0, p2}, Lo/bie;->b(Lo/bie$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 25
    invoke-virtual {p0, p1, p2}, Lo/bie;->b(Landroid/view/ViewGroup;I)Lo/bie$a;

    move-result-object v0

    return-object v0
.end method
