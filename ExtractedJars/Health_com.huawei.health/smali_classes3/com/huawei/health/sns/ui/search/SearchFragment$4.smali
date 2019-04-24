.class Lcom/huawei/health/sns/ui/search/SearchFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/search/SearchFragment;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/search/SearchFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/search/SearchFragment;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lcom/huawei/health/sns/ui/search/SearchFragment$4;->a:Lcom/huawei/health/sns/ui/search/SearchFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 214
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .line 219
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 223
    :pswitch_0
    goto :goto_0

    .line 225
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/search/SearchFragment$4;->a:Lcom/huawei/health/sns/ui/search/SearchFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/search/SearchFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/bmn;->a(Landroid/app/Activity;)V

    .line 226
    nop

    .line 228
    .line 232
    :goto_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
