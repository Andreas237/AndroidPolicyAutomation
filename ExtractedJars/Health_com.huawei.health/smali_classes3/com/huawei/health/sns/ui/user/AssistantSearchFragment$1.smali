.class Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)V
    .locals 0

    .line 267
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 307
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 3

    .line 273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->c(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Lo/bfm;

    move-result-object v0

    if-nez v0, :cond_0

    .line 275
    return-void

    .line 278
    :cond_0
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 283
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->f()V

    .line 284
    goto :goto_0

    .line 288
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->g(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Lo/bfm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bfm;->getCount()I

    move-result v2

    .line 290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->f(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)I

    move-result v0

    add-int/lit8 v1, v2, -0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->k(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->i(Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getLastVisiblePosition()I

    move-result v0

    if-gt v2, v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment$1;->d:Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/AssistantSearchFragment;->b()V

    .line 302
    :cond_1
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
