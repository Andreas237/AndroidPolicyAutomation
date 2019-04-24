.class Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V
    .locals 1

    .line 173
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 174
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$c;->e:Ljava/lang/ref/WeakReference;

    .line 175
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 180
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;

    .line 183
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    :cond_0
    return-void

    .line 187
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 191
    :pswitch_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    .line 192
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v3

    .line 193
    if-eqz v3, :cond_2

    .line 195
    const/4 v4, 0x0

    .line 196
    const-string v0, "bundleKeyComplainCategory"

    .line 197
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 198
    invoke-static {v2, v4}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;Ljava/util/ArrayList;)V

    .line 199
    goto :goto_0

    .line 204
    :pswitch_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    .line 205
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->e(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 206
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 207
    goto :goto_0

    .line 211
    :pswitch_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->a(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    .line 212
    invoke-static {v2}, Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;->b(Lcom/huawei/health/sns/ui/complain/ComplainCategoryActivity;)V

    .line 213
    .line 218
    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb01
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
