.class Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "BrandedLookbookRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->setupFling()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;


# direct methods
.method constructor <init>(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 1

    const/4 p1, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 41
    :pswitch_0
    iget-object p2, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    invoke-static {p2, p1}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->access$002(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;Z)Z

    goto :goto_0

    .line 44
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->access$002(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;Z)Z

    goto :goto_0

    .line 34
    :pswitch_2
    iget-object p2, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    invoke-virtual {p2}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->findFirstVisibleItemPosition()I

    move-result p2

    .line 35
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    invoke-static {v0}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->access$000(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    if-le p2, v0, :cond_0

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->smoothScrollToPosition(I)V

    .line 38
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView$1;->this$0:Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;

    invoke-static {p2, p1}, Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;->access$002(Lcom/shopkick/app/view/SKRecyclerView/BrandedLookbookRecyclerView;Z)Z

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
