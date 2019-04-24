.class Lo/fid$4;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fid;->b(Ljava/lang/String;Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/request/target/SimpleTarget<Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Landroid/os/Handler;

.field final synthetic e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

.field final synthetic f:Lo/fid;


# direct methods
.method constructor <init>(Lo/fid;Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/fid$4;->f:Lo/fid;

    iput-object p2, p0, Lo/fid$4;->c:Landroid/widget/ImageView;

    iput-object p3, p0, Lo/fid$4;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    iput-object p4, p0, Lo/fid$4;->a:Landroid/graphics/Bitmap;

    iput-object p5, p0, Lo/fid$4;->b:Ljava/lang/String;

    iput-object p6, p0, Lo/fid$4;->d:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition<-Landroid/graphics/drawable/Drawable;>;)V"
        }
    .end annotation

    .line 78
    new-instance v4, Lo/fid$d;

    invoke-direct {v4}, Lo/fid$d;-><init>()V

    .line 79
    iget-object v0, p0, Lo/fid$4;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 80
    const-string v0, "2"

    iget-object v1, p0, Lo/fid$4;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    const-string v0, "UIDV_SocialFragmentHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getModule is ad"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/fid$4;->c:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v5

    .line 83
    iget-object v0, p0, Lo/fid$4;->a:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/fid$4;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/fid$4;->f:Lo/fid;

    invoke-static {v2}, Lo/fid;->e(Lo/fid;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v5, v0, v1, v2}, Lo/fis;->c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 84
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 85
    iget-object v0, p0, Lo/fid$4;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 88
    :cond_0
    iget-object v0, p0, Lo/fid$4;->c:Landroid/widget/ImageView;

    iput-object v0, v4, Lo/fid$d;->c:Landroid/widget/ImageView;

    .line 89
    iget-object v0, p0, Lo/fid$4;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    iput-object v0, v4, Lo/fid$d;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 90
    iget-object v0, p0, Lo/fid$4;->d:Landroid/os/Handler;

    const/16 v1, 0x17

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 91
    iget-object v0, p0, Lo/fid$4;->d:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 92
    return-void
.end method

.method public onLoadFailed(Landroid/graphics/drawable/Drawable;)V
    .locals 4
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 96
    invoke-super {p0, p1}, Lcom/bumptech/glide/request/target/SimpleTarget;->onLoadFailed(Landroid/graphics/drawable/Drawable;)V

    .line 97
    const-string v0, "UIDV_SocialFragmentHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "picture download failture\uff0cmsgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/fid$4;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void
.end method

.method public synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 1

    .line 75
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0, p2}, Lo/fid$4;->b(Landroid/graphics/drawable/Drawable;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
