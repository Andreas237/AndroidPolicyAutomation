.class public Lo/bhn;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhn$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bhn$c;>;"
    }
.end annotation


# instance fields
.field private c:Landroid/content/Context;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 30
    iput-object p1, p0, Lo/bhn;->c:Landroid/content/Context;

    .line 31
    invoke-direct {p0}, Lo/bhn;->d()V

    .line 32
    return-void
.end method

.method private d()V
    .locals 4

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    .line 36
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    new-instance v1, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;

    const-string v2, "\u7fa4\u4e3b\u9875:"

    const-string v3, "\u6392\u540d\u89c4\u5219:\n\u6839\u636e\u4e0d\u540c\u7fa4\u7ec4\u7c7b\u578b\uff0c\u57fa\u4e8e\u201c\u65e5/\u5468/\u6708\u201d\u7684\u65f6\u95f4\u7ef4\u5ea6\uff0c\u5bf9\u4e0d\u540c\u7c7b\u578b\u7684\u7d2f\u79ef\u6570\u636e\u6309\u7167\u7531\u9ad8\u5230\u4f4e\u6392\u5e8f\uff1b\u82e5\u7fa4\u7ec4\u521b\u5efa\u4e0d\u8db3\u4e00\u5468/\u6708\uff0c\u5219\u5468/\u6708\u6392\u540d\u6570\u636e\u4e3a\u4ece\u521b\u5efa\u65e5\u5f00\u59cb\u5230\u5f53\u524d\u67e5\u770b\u65e5\u671f\u7ed3\u7b97\u7684\u6570\u636e\uff1b\u82e5\u7fa4\u7ec4\u521b\u5efa\u8d85\u8fc7\u4e00\u5468/\u6708\uff0c\u5219\u5468/\u6708\u6392\u540d\u6570\u636e\u8ba1\u7b97\u4ece\u5f53\u5468/\u6708\u9996\u65e5\u5f00\u59cb\u5230\u5f53\u524d\u67e5\u770b\u65e5\u671f\u7ed3\u7b97\u7684\u6570\u636e\uff1b\n\u6b65\u884c\u7fa4\uff08\u6b65\u6570\uff09\n\u8dd1\u6b65\u7fa4\uff08\u7d2f\u8ba1\u8dd1\u6b65\u8ddd\u79bb\uff0f\u6b65\u6570\uff09\n\u9a91\u884c\u7fa4\uff08\u7d2f\u8ba1\u9a91\u884c\u8ddd\u79bb\uff0f\u6b65\u6570\uff09\n\u5065\u8eab\u7fa4\uff08\u7d2f\u8ba1\u5065\u8eab\u65f6\u95f4\uff0f\u6b65\u6570\uff09\n\u6e38\u6cf3\u7fa4\uff08\u7d2f\u8ba1\u6e38\u6cf3\u8ddd\u79bb\uff0f\u6b65\u6570\uff09\n\u5176\u4ed6\uff08\u6b65\u6570\uff09\n\n\u7fa4\u4e3b\u9875\u6392\u540d\u6570\u636e\u6765\u6e90:\n\u9664\u6b65\u6570\u6392\u540d\u5916\uff0c\u7fa4\u7ec4\u5185\u6240\u6709\u53c2\u4e0e\u6392\u540d\u7684\u8fd0\u52a8\u6570\u636e\u5747\u662f\u5355\u6b21\u8fd0\u52a8\u4ea7\u751f\u7684\u6570\u636e\u3002 \u5355\u6b21\u8fd0\u52a8\u662f\u6307\u7528\u6237\u8fdb\u5165\u201c\u8fd0\u52a8\u201d\u5f00\u542f\u201c\u8dd1\u6b65\u201d\u3001\u201c\u6b65\u884c\u201d\u3001\u201c\u9a91\u884c\u201d\u6216\u201c\u8bad\u7ec3\u201d\uff0c\u6216\u501f\u52a9\u652f\u6301\u6e38\u6cf3\u8f68\u8ff9\u3001\u9a91\u884c\u7684\u53ef\u7a7f\u6234\u8bbe\u5907\u8fdb\u884c\u6e38\u6cf3\u3001\u6237\u5916\u9a91\u884c\uff0c\u6240\u4ea7\u751f\u7684\u8fd0\u52a8\u8bb0\u5f55\u3002"

    invoke-direct {v1, v2, v3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    new-instance v1, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;

    const-string v2, "\u7fa4\u6d3b\u52a8:"

    const-string v3, "\u4ee5\u201c\u5355\u6b21\u6311\u6218\u6210\u7ee9\u201d\u8fdb\u884c\u6392\u540d\u7684\u6d3b\u52a8\u89c4\u5219:\n\u7528\u6237\u5728\u6d3b\u52a8\u671f\u95f4\u5185\uff0c\u53c2\u52a0\u4e86\u540e\uff0c\u5355\u6b21\u8fd0\u52a8\u4e4b\u540e\u4ea7\u751f\u7684\u6570\u636e\u7684\u6700\u4f18\u503c\uff08\u5b8c\u6210\u65f6\u95f4\uff09\u3002\u5982\u5355\u6b21\u6311\u6218\u7c7b\u7fa4\u6d3b\u52a8\u5b9e\u9645\u8dd1\u6b65\u8ddd\u79bb\u8d85\u51fa\u7fa4\u6d3b\u52a8\u8bbe\u7f6e\u7684\u76ee\u6807\u503c\uff0c\u5219\u6309\u7167\u76ee\u6807\u503c\u7684\u5b8c\u6210\u65f6\u95f4\u7edf\u8ba1\u5230\u6392\u540d\u4e2d\uff0c\u6bd4\u5982\u8bbe\u7f6e\u4e865\u516c\u91cc\uff0c\u5b9e\u9645\u5b8c\u6210\u4e866\u516c\u91cc\uff0c\u5219\u5c06\u524d5\u516c\u91cc\u7684\u6570\u636e\u7edf\u8ba1\u5230\u6392\u540d\u4e2d\uff1b\u5982\u679c\u5b9e\u9645\u5b8c\u6210\u4e0d\u8db35\u516c\u91cc\uff0c\u5219\u4ea7\u751f\u7684\u6570\u636e\u4e0d\u4f1a\u88ab\u7edf\u8ba1\u5230\u6392\u540d\u4e2d\u3002\n\n\u4ee5\u201c\u7d2f\u8ba1\u8fd0\u52a8\u6210\u7ee9\u201d\u8fdb\u884c\u6392\u540d\u7684\u6d3b\u52a8\u89c4\u5219:\n\u6d3b\u52a8\u5468\u671f\u5185\uff0c\u6240\u6709\u5355\u6b21\u8fd0\u52a8\u4e4b\u540e\u4ea7\u751f\u7684\u6570\u636e\u7684\u7d2f\u8ba1\u503c\uff08\u7d2f\u8ba1\u8ddd\u79bb/\u7d2f\u8ba1\u65f6\u95f4\uff09\uff0c\u4f1a\u7edf\u8ba1\u5230\u6d3b\u52a8\u6392\u540d\u4e2d\u3002\u7528\u6237\u9700\u81f3\u5c11\u8fdb\u884c\u4e00\u6b21\u5355\u6b21\u8fd0\u52a8\uff0c\u624d\u4f1a\u53c2\u4e0e\u6d3b\u52a8\u6392\u540d\u3002\n\n\u6570\u636e\u6765\u6e90:\n\u7528\u6237\u8fdb\u5165\u201c\u8fd0\u52a8\u201d\u5f00\u542f\u201c\u8dd1\u6b65\u201d\u3001\u201c\u6b65\u884c\u201d\u3001\u201c\u9a91\u884c\u201d\u6216\u201c\u8bad\u7ec3\u201d\uff0c\u6216\u501f\u52a9\u652f\u6301\u6e38\u6cf3\u8f68\u8ff9\u3001\u9a91\u884c\u7684\u53ef\u7a7f\u6234\u8bbe\u5907\u8fdb\u884c\u6e38\u6cf3\u3001\u6237\u5916\u9a91\u884c\uff0c\u6240\u4ea7\u751f\u7684\u8fd0\u52a8\u8bb0\u5f55\u3002"

    invoke-direct {v1, v2, v3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;I)Lo/bhn$c;
    .locals 4

    .line 58
    iget-object v0, p0, Lo/bhn;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->item_group_help:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 59
    new-instance v0, Lo/bhn$c;

    invoke-direct {v0, p0, v3}, Lo/bhn$c;-><init>(Lo/bhn;Landroid/view/View;)V

    return-object v0
.end method

.method public d(Lo/bhn$c;I)V
    .locals 6

    .line 65
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 66
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;

    .line 67
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 68
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {p1}, Lo/bhn$c;->b(Lo/bhn$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    iget-object v0, p0, Lo/bhn;->c:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lo/bhn;->c:Landroid/content/Context;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v0, v3, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 70
    invoke-static {p1}, Lo/bhn$c;->b(Lo/bhn$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    :cond_0
    invoke-static {p1}, Lo/bhn$c;->d(Lo/bhn$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    invoke-static {p1}, Lo/bhn$c;->b(Lo/bhn$c;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthHelpBean;->getContext()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    :cond_1
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 79
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/bhn;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 82
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lo/bhn$c;

    invoke-virtual {p0, v0, p2}, Lo/bhn;->d(Lo/bhn$c;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 21
    invoke-virtual {p0, p1, p2}, Lo/bhn;->b(Landroid/view/ViewGroup;I)Lo/bhn$c;

    move-result-object v0

    return-object v0
.end method
