.class Lo/dea$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dea;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dea;


# direct methods
.method constructor <init>(Lo/dea;)V
    .locals 0

    .line 551
    iput-object p1, p0, Lo/dea$5;->d:Lo/dea;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 5

    .line 555
    const/16 v0, 0x64

    if-le p2, v0, :cond_0

    .line 556
    const/16 p2, 0x64

    .line 558
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOTAResultCallback---onFileTransferState percentage------"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 559
    iget-object v0, p0, Lo/dea$5;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->c(Lo/dea;)Lo/yc;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/yc;->a(Ljava/lang/String;I)V

    .line 561
    const/16 v0, 0x64

    if-ne v0, p2, :cond_1

    .line 562
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ddz;->c(Ljava/lang/String;Z)V

    .line 564
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 5

    .line 577
    iget-object v0, p0, Lo/dea$5;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->c(Lo/dea;)Lo/yc;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/yc;->b(Ljava/lang/String;I)V

    .line 578
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOTAResultCallback---onFileRespond checkResult------"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 580
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ddz;->c(Ljava/lang/String;Z)V

    .line 581
    return-void
.end method

.method public b(Ljava/lang/String;ILjava/lang/String;)V
    .locals 5

    .line 568
    iget-object v0, p0, Lo/dea$5;->d:Lo/dea;

    invoke-static {v0}, Lo/dea;->c(Lo/dea;)Lo/yc;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 569
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOTAResultCallback---onUpgradeFailed errorCode-------"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 570
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IOTAResultCallback---onUpgradeFailed errorMessage----"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 572
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ddz;->c(Ljava/lang/String;Z)V

    .line 573
    return-void
.end method
