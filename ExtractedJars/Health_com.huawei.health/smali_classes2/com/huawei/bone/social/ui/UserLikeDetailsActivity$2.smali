.class Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;->d:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 125
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 126
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 128
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;->d:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;->d:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    iget-object v1, v1, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a(Ljava/util/ArrayList;)V

    .line 129
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "likeDetailsTable1111"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;->d:Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;

    invoke-virtual {v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e()V

    .line 132
    .line 136
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method
