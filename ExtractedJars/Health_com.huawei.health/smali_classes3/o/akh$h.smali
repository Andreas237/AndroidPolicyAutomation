.class Lo/akh$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aiq$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field private b:Lo/aix;

.field private c:I

.field final synthetic d:Lo/akh;


# direct methods
.method public constructor <init>(Lo/akh;ILo/aix;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lo/akh$h;->d:Lo/akh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 411
    iput p2, p0, Lo/akh$h;->c:I

    .line 412
    iput-object p3, p0, Lo/akh$h;->b:Lo/aix;

    .line 413
    return-void
.end method


# virtual methods
.method public c(Lo/air;)V
    .locals 5

    .line 416
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WriteVerifyCodeCallBack: onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 417
    if-eqz p1, :cond_2

    .line 418
    iget v0, p1, Lo/air;->d:I

    if-nez v0, :cond_1

    .line 419
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WriteVerifyCodeCallBack: success write"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lo/akh$h;->d:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 422
    iget-object v0, p0, Lo/akh$h;->d:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    iget-object v1, p0, Lo/akh$h;->b:Lo/aix;

    invoke-virtual {v1}, Lo/aix;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/akh$h;->b:Lo/aix;

    invoke-virtual {v2}, Lo/aix;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lo/akh$e;->e(Lo/air;Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    :cond_0
    return-void

    .line 426
    :cond_1
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WriteVerifyCodeCallBack errorCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lo/air;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 429
    :cond_2
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WriteVerifyCodeCallBack: response is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 432
    :goto_0
    iget v0, p0, Lo/akh$h;->c:I

    add-int/lit8 v4, v0, -0x1

    .line 433
    if-lez v4, :cond_3

    iget-object v0, p0, Lo/akh$h;->d:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 434
    iget-object v0, p0, Lo/akh$h;->d:Lo/akh;

    iget-object v1, p0, Lo/akh$h;->b:Lo/aix;

    invoke-virtual {v0, v1, v4}, Lo/akh;->e(Lo/aix;I)V

    goto :goto_1

    .line 436
    :cond_3
    iget-object v0, p0, Lo/akh$h;->d:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 437
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WriteVerifyCodeCallBack Write verify code fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v0, p0, Lo/akh$h;->d:Lo/akh;

    invoke-static {v0}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    iget-object v1, p0, Lo/akh$h;->b:Lo/aix;

    invoke-virtual {v1}, Lo/aix;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/akh$h;->b:Lo/aix;

    invoke-virtual {v2}, Lo/aix;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lo/akh$e;->e(Lo/air;Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    :cond_4
    :goto_1
    return-void
.end method
