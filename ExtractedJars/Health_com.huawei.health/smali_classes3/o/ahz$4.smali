.class Lo/ahz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aiq$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahz;->c(Ljava/lang/String;Lo/ace;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic e:Lo/ahz;


# direct methods
.method constructor <init>(Lo/ahz;Ljava/lang/String;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lo/ahz$4;->e:Lo/ahz;

    iput-object p2, p0, Lo/ahz$4;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/air;)V
    .locals 8

    .line 241
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 244
    const/4 v4, 0x0

    .line 245
    instance-of v0, p1, Lo/aiv;

    if-eqz v0, :cond_0

    .line 246
    move-object v4, p1

    check-cast v4, Lo/aiv;

    .line 247
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: response "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/aiv;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :cond_0
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "configMode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v2}, Lo/ahz;->b(Lo/ahz;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->b(Lo/ahz;)I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 252
    iget-object v5, v4, Lo/aiv;->c:Lo/aiv$e;

    .line 253
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 254
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScanDeviceCoap deviceinfo.prodId"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v5, Lo/aiv$e;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coapFindFlag:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v3}, Lo/ahz;->d(Lo/ahz;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 255
    iget-object v0, v5, Lo/aiv$e;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->c(Lo/ahz;)Lo/ace;

    move-result-object v0

    iget-object v1, v5, Lo/aiv$e;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/ace;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->d(Lo/ahz;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 256
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ahz;->d(Lo/ahz;Z)Z

    .line 257
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->a(Lo/ahz;)Lo/aka;

    move-result-object v0

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 258
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 259
    const/16 v0, 0x89f

    iput v0, v6, Landroid/os/Message;->what:I

    .line 260
    iget-object v0, v4, Lo/aiv;->a:Ljava/lang/String;

    iget-object v1, v4, Lo/aiv;->a:Ljava/lang/String;

    const-string v2, "//"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    iget-object v2, v4, Lo/aiv;->a:Ljava/lang/String;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 261
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScanDeviceCoap str:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 262
    iput-object v7, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 263
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->k(Lo/ahz;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 266
    :cond_1
    goto/16 :goto_0

    .line 267
    :cond_2
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->g(Lo/ahz;)Lo/aia;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/aia;->d(Lo/aiv;)Lo/ajd;

    move-result-object v5

    .line 269
    invoke-virtual {v5}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    invoke-virtual {v5}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 270
    const-string v0, "CombinationTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: device has been registered, deviceId is \uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 271
    invoke-virtual {v5}, Lo/ajd;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",Scan device info is"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    .line 270
    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 275
    :cond_3
    invoke-virtual {v5}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 276
    return-void

    .line 278
    :cond_4
    const-string v0, "CombinationTask"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baseurl  is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/ajd;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "SN "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahz$4;->a:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " info.getDeviceSn() "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lo/ahz$4;->a:Ljava/lang/String;

    invoke-virtual {v5}, Lo/ajd;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->d(Lo/ahz;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 280
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ahz;->d(Lo/ahz;Z)Z

    .line 281
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->a(Lo/ahz;)Lo/aka;

    move-result-object v0

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 282
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v6

    .line 283
    const/16 v0, 0x89f

    iput v0, v6, Landroid/os/Message;->what:I

    .line 284
    invoke-virtual {v5}, Lo/ajd;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lo/ajd;->i()Ljava/lang/String;

    move-result-object v1

    const-string v2, "//"

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v5}, Lo/ajd;->i()Ljava/lang/String;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 285
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startScanDeviceCoap str:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 286
    iput-object v7, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 287
    iget-object v0, p0, Lo/ahz$4;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->k(Lo/ahz;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 290
    :cond_5
    :goto_0
    goto :goto_1

    .line 291
    :cond_6
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startScanDeviceCoap: response is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 293
    :goto_1
    return-void
.end method
