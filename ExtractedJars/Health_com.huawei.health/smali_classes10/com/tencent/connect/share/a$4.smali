.class final Lcom/tencent/connect/share/a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/connect/share/a;->a(Landroid/content/Context;Ljava/util/ArrayList;Lcom/tencent/open/utils/AsynLoadImgBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Landroid/os/Handler;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/tencent/connect/share/a$4;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 147
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 148
    iget-object v0, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 149
    invoke-static {v3}, Lcom/tencent/open/utils/Util;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v3}, Lcom/tencent/open/utils/Util;->fileExists(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 154
    const/16 v0, 0x2710

    invoke-static {v3, v0}, Lcom/tencent/connect/share/a;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 155
    if-eqz v4, :cond_1

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/tmp/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 157
    invoke-static {v3}, Lcom/tencent/open/utils/Util;->encrypt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "share2qzone_temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 162
    const/16 v0, 0x280

    const/16 v1, 0x2710

    invoke-static {v3, v0, v1}, Lcom/tencent/connect/share/a;->a(Ljava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    const-string v0, "AsynScaleCompressImage"

    const-string v1, "not out of bound,not compress!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    move-object v8, v3

    goto :goto_1

    .line 167
    :cond_0
    const-string v0, "AsynScaleCompressImage"

    const-string v1, "out of bound, compress!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    invoke-static {v4, v5, v7}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 171
    :goto_1
    if-eqz v8, :cond_1

    .line 172
    iget-object v0, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 147
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 177
    :cond_2
    iget-object v0, p0, Lcom/tencent/connect/share/a$4;->b:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 178
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 179
    const-string v0, "images"

    iget-object v1, p0, Lcom/tencent/connect/share/a$4;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 180
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 181
    iget-object v0, p0, Lcom/tencent/connect/share/a$4;->b:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 182
    return-void
.end method
