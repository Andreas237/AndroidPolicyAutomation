.class Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V
    .locals 1

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 165
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 166
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 170
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    .line 171
    if-nez v4, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->l()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a:Ljava/util/ArrayList;

    .line 175
    iget-object v0, v4, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a:Ljava/util/ArrayList;

    invoke-static {v4, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 176
    invoke-static {v4}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-static {v4}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 177
    :cond_1
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nonFriendsNum null or 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 179
    const/16 v0, 0x3e8

    iput v0, v5, Landroid/os/Message;->what:I

    .line 180
    invoke-static {v4}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 181
    return-void

    .line 183
    :cond_2
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nonFriendsNum size"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "nonFriendsNum "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void
.end method

.method public b()V
    .locals 0

    .line 202
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 207
    return-void
.end method

.method public e()V
    .locals 6

    .line 188
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    .line 189
    if-nez v4, :cond_0

    .line 190
    return-void

    .line 192
    :cond_0
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-static {}, Lo/wr;->d()Lo/wr;

    move-result-object v0

    invoke-virtual {v0}, Lo/wr;->l()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a:Ljava/util/ArrayList;

    .line 194
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 195
    const/16 v0, 0x3e8

    iput v0, v5, Landroid/os/Message;->what:I

    .line 196
    invoke-static {v4}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 197
    return-void
.end method
