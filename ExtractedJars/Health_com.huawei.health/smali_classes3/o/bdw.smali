.class public Lo/bdw;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bdw$d;,
        Lo/bdw$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/bdw$a;

.field private c:I

.field private d:Lcom/huawei/health/sns/model/chat/Album;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/Album;ZLo/bdw$a;I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bdw;->e:Z

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bdw;->b:Lo/bdw$a;

    .line 37
    iput-object p1, p0, Lo/bdw;->a:Landroid/content/Context;

    .line 38
    iput-object p2, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    .line 39
    iput-boolean p3, p0, Lo/bdw;->e:Z

    .line 40
    iput-object p4, p0, Lo/bdw;->b:Lo/bdw$a;

    .line 41
    iput p5, p0, Lo/bdw;->c:I

    .line 42
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/model/chat/Album;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    .line 52
    invoke-virtual {p0}, Lo/bdw;->notifyDataSetChanged()V

    .line 53
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 73
    const/4 v1, 0x0

    .line 74
    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 78
    :cond_0
    return v1
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 84
    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 88
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 94
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 101
    if-nez p2, :cond_0

    .line 103
    new-instance v3, Lo/bdw$d;

    iget-object v0, p0, Lo/bdw;->a:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/bdw$d;-><init>(Landroid/content/Context;)V

    .line 104
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Lo/bdw$d;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 108
    :cond_0
    instance-of v0, p2, Lo/bdw$d;

    if-eqz v0, :cond_1

    .line 109
    move-object v3, p2

    check-cast v3, Lo/bdw$d;

    goto :goto_0

    .line 111
    :cond_1
    new-instance v3, Lo/bdw$d;

    iget-object v0, p0, Lo/bdw;->a:Landroid/content/Context;

    invoke-direct {v3, v0}, Lo/bdw$d;-><init>(Landroid/content/Context;)V

    .line 112
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v0}, Lo/bdw$d;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    :goto_0
    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_4

    .line 117
    invoke-static {v3}, Lo/bdw$d;->c(Lo/bdw$d;)Landroid/view/View;

    move-result-object v4

    .line 118
    if-eqz v4, :cond_3

    .line 120
    iget v0, p0, Lo/bdw;->c:I

    if-ge p1, v0, :cond_2

    .line 122
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 126
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 129
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/bdw;->d:Lcom/huawei/health/sns/model/chat/Album;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Album;->getPhotoIdList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 131
    invoke-static {v3}, Lo/bdw$d;->b(Lo/bdw$d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {v0, v5}, Lo/aux;->e(Landroid/widget/ImageView;I)V

    .line 133
    iget-object v0, p0, Lo/bdw;->b:Lo/bdw$a;

    if-eqz v0, :cond_4

    .line 135
    iget-object v0, p0, Lo/bdw;->b:Lo/bdw$a;

    invoke-interface {v0, v3, v5}, Lo/bdw$a;->b(Lo/bdw$d;I)V

    .line 136
    iget-object v0, p0, Lo/bdw;->b:Lo/bdw$a;

    invoke-interface {v0, v3, v5}, Lo/bdw$a;->d(Lo/bdw$d;I)V

    .line 140
    :cond_4
    iget-boolean v0, p0, Lo/bdw;->e:Z

    if-eqz v0, :cond_5

    .line 142
    invoke-static {v3}, Lo/bdw$d;->e(Lo/bdw$d;)Landroid/widget/CheckBox;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 144
    invoke-static {v3}, Lo/bdw$d;->e(Lo/bdw$d;)Landroid/widget/CheckBox;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 148
    :cond_5
    return-object v3
.end method
