.class public Lo/bhj;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhj$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bhj$a;>;"
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
    iput-object p2, p0, Lo/bhj;->c:Ljava/util/List;

    .line 32
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/bhj;->e:Landroid/view/LayoutInflater;

    .line 33
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;I)Lo/bhj$a;
    .locals 4

    .line 37
    new-instance v0, Lo/bhj$a;

    iget-object v1, p0, Lo/bhj;->e:Landroid/view/LayoutInflater;

    sget v2, Lcom/huawei/android/sns/R$layout;->item_health_group_memb:I

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bhj$a;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public e(Lo/bhj$a;I)V
    .locals 7

    .line 42
    iget-object v0, p0, Lo/bhj;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;

    .line 44
    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getHuid()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {p1}, Lo/bhj$a;->c(Lo/bhj$a;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getPhoto()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getPhoto()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getPhoto()Ljava/lang/String;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-static {p1}, Lo/bhj$a;->d(Lo/bhj$a;)Lo/egb;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/ui/group/healthbeans/UserInfoBean;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 46
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 50
    iget-object v0, p0, Lo/bhj;->c:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/bhj;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 53
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 25
    move-object v0, p1

    check-cast v0, Lo/bhj$a;

    invoke-virtual {p0, v0, p2}, Lo/bhj;->e(Lo/bhj$a;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 25
    invoke-virtual {p0, p1, p2}, Lo/bhj;->a(Landroid/view/ViewGroup;I)Lo/bhj$a;

    move-result-object v0

    return-object v0
.end method
