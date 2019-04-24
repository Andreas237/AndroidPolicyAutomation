.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->b(Landroid/widget/AbsListView;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:I

.field final synthetic e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;I)V
    .locals 0

    .line 1170
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    iput p2, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1197
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .line 1174
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 1178
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 1180
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Z)Z

    .line 1181
    new-instance v0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;

    iget v1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;->d:I

    invoke-direct {v0, p1, v1}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$d;-><init>(Landroid/widget/AbsListView;I)V

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->post(Ljava/lang/Runnable;)Z

    .line 1182
    goto :goto_0

    .line 1184
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$6;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->k(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;)V

    .line 1185
    nop

    .line 1187
    .line 1191
    :goto_0
    :pswitch_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
