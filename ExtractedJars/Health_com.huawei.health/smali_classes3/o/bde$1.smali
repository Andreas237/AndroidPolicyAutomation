.class final Lo/bde$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bde;->b(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Landroid/os/Handler;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/bde$1;->b:Ljava/util/ArrayList;

    iput-object p2, p0, Lo/bde$1;->e:Landroid/os/Handler;

    iput-wide p3, p0, Lo/bde$1;->a:J

    iput-boolean p5, p0, Lo/bde$1;->c:Z

    iput-boolean p6, p0, Lo/bde$1;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 146
    invoke-virtual {p0, p1}, Lo/bde$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 11

    .line 150
    const-string v0, "ChatCommonLogic"

    const-string v1, "getResultData() use thread to execute"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    iget-object v0, p0, Lo/bde$1;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 153
    iget-object v0, p0, Lo/bde$1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 155
    invoke-static {v4}, Lo/are;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 156
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lo/bde$1;->e:Landroid/os/Handler;

    if-eqz v0, :cond_4

    .line 160
    iget-object v0, p0, Lo/bde$1;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/bde$1;->e:Landroid/os/Handler;

    const v2, 0x310dd

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_2

    .line 165
    :cond_0
    iget-wide v0, p0, Lo/bde$1;->a:J

    .line 166
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-static {v5, v0}, Lo/aqr;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 168
    invoke-static {}, Lo/bde;->c()Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v7

    .line 170
    iget-boolean v0, p0, Lo/bde$1;->c:Z

    if-eqz v0, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x2

    .line 171
    :goto_1
    invoke-virtual {v7, v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 173
    invoke-virtual {v7, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbnail(Ljava/lang/String;)V

    .line 174
    move-object v9, v6

    .line 176
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 177
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 179
    :cond_2
    invoke-virtual {v7, v9}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 180
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 181
    iget-wide v0, p0, Lo/bde$1;->a:J

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 182
    iget-wide v0, p0, Lo/bde$1;->a:J

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 184
    new-instance v10, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v10}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 186
    const/4 v0, 0x1

    iput-boolean v0, v10, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 187
    invoke-static {v6, v10}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, v10, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v10, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 190
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 191
    iget-boolean v0, p0, Lo/bde$1;->d:Z

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSysChat(Z)V

    .line 193
    iget-object v0, p0, Lo/bde$1;->e:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 195
    iget-object v0, p0, Lo/bde$1;->e:Landroid/os/Handler;

    iget-object v1, p0, Lo/bde$1;->e:Landroid/os/Handler;

    const v2, 0x310dc

    invoke-virtual {v1, v2, v7}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 197
    :cond_3
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/aus;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 199
    :cond_4
    :goto_2
    goto/16 :goto_0

    .line 201
    :cond_5
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
