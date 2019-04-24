.class Lo/aqa$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqa;->d(Ljava/lang/String;Ljava/lang/String;JI)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:J

.field final synthetic e:Lo/aqa;


# direct methods
.method constructor <init>(Lo/aqa;Ljava/lang/String;JILjava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lo/aqa$4;->e:Lo/aqa;

    iput-object p2, p0, Lo/aqa$4;->a:Ljava/lang/String;

    iput-wide p3, p0, Lo/aqa$4;->d:J

    iput p5, p0, Lo/aqa$4;->c:I

    iput-object p6, p0, Lo/aqa$4;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 191
    invoke-virtual {p0, p1}, Lo/aqa$4;->c(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Void;
    .locals 11

    .line 196
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 197
    new-instance v7, Ljava/io/File;

    iget-object v0, p0, Lo/aqa$4;->a:Ljava/lang/String;

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 198
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/aqa$4;->a:Ljava/lang/String;

    iget-wide v1, p0, Lo/aqa$4;->d:J

    .line 201
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    .line 200
    invoke-static {v0, v1}, Lo/aqr;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 202
    if-eqz v8, :cond_0

    .line 204
    new-instance v0, Lo/apt;

    invoke-direct {v0}, Lo/apt;-><init>()V

    iget v1, p0, Lo/aqa$4;->c:I

    invoke-virtual {v0, v1}, Lo/apt;->c(I)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v9

    .line 205
    invoke-virtual {v9, v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbnail(Ljava/lang/String;)V

    .line 206
    invoke-virtual {v9, v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 207
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 208
    iget-wide v0, p0, Lo/aqa$4;->d:J

    invoke-virtual {v9, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 209
    iget-wide v0, p0, Lo/aqa$4;->d:J

    invoke-virtual {v9, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 211
    new-instance v10, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v10}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 213
    const/4 v0, 0x1

    iput-boolean v0, v10, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 214
    invoke-static {v8, v10}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 215
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

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 216
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSysChat(Z)V

    .line 217
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    :cond_0
    new-instance v0, Lo/aqi;

    iget-object v1, p0, Lo/aqa$4;->e:Lo/aqa;

    invoke-static {v1}, Lo/aqa;->d(Lo/aqa;)Lo/apo;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/aqi;-><init>(Lo/apo;)V

    iget-wide v1, p0, Lo/aqa$4;->d:J

    iget v3, p0, Lo/aqa$4;->c:I

    invoke-virtual {v0, v1, v2, v3, v6}, Lo/aqi;->c(JILjava/util/List;)V

    .line 224
    const/4 v8, 0x1

    .line 225
    iget v0, p0, Lo/aqa$4;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 227
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/aqa$4;->d:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->g(J)Z

    move-result v8

    .line 229
    :cond_1
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-wide v1, p0, Lo/aqa$4;->d:J

    iget v3, p0, Lo/aqa$4;->c:I

    iget-object v4, p0, Lo/aqa$4;->b:Ljava/lang/String;

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Lo/apz;->b(JILjava/lang/String;Z)V

    .line 230
    const/4 v0, 0x0

    return-object v0
.end method
