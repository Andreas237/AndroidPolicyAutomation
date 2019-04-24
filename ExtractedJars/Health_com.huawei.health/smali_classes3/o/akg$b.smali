.class final Lo/akg$b;
.super Lo/ajf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ajf<Lo/akg;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akg;)V
    .locals 0

    .line 568
    invoke-direct {p0, p1}, Lo/ajf;-><init>(Ljava/lang/Object;)V

    .line 569
    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;I)V
    .locals 1

    .line 565
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$b;->c(Lo/akg;I)V

    return-void
.end method

.method public synthetic b(Ljava/lang/Object;I)V
    .locals 1

    .line 565
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$b;->e(Lo/akg;I)V

    return-void
.end method

.method public synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 565
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$b;->d(Lo/akg;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Lo/akg;I)V
    .locals 4

    .line 587
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MultCastCallback: onFailure "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 588
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 590
    invoke-static {p1}, Lo/akg;->b(Lo/akg;)V

    .line 591
    const/16 v0, 0x843

    invoke-static {p1, v0}, Lo/akg;->b(Lo/akg;I)V

    .line 593
    :cond_0
    return-void
.end method

.method public d(Lo/akg;Ljava/lang/Object;)V
    .locals 4

    .line 573
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p1}, Lo/akg;->e(Lo/akg;)Lo/ajd;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 574
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MultCastCallback: onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 575
    invoke-static {p1}, Lo/akg;->e(Lo/akg;)Lo/ajd;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ajd;->k(Ljava/lang/String;)V

    .line 577
    invoke-static {p1}, Lo/akg;->b(Lo/akg;)V

    .line 578
    invoke-virtual {p1}, Lo/akg;->c()V

    .line 580
    const/16 v0, 0x8a4

    invoke-static {p1, v0}, Lo/akg;->c(Lo/akg;I)V

    .line 581
    invoke-static {p1}, Lo/akg;->d(Lo/akg;)Lo/akg$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    .line 583
    :cond_0
    return-void
.end method

.method public e(Lo/akg;I)V
    .locals 5

    .line 597
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MultCastCallback: onStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 598
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 599
    invoke-static {p1}, Lo/akg;->d(Lo/akg;)Lo/akg$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/akg$a;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 600
    const/16 v0, 0xd

    iput v0, v4, Landroid/os/Message;->what:I

    .line 601
    iput p2, v4, Landroid/os/Message;->arg1:I

    .line 602
    invoke-static {p1}, Lo/akg;->d(Lo/akg;)Lo/akg$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/akg$a;->sendMessage(Landroid/os/Message;)Z

    .line 603
    const/16 v0, 0x8a2

    if-ne p2, v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_0

    .line 604
    invoke-static {p1}, Lo/akg;->a(Lo/akg;)V

    .line 605
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MultCastCallback: onStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 606
    invoke-static {p1}, Lo/akg;->d(Lo/akg;)Lo/akg$a;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Lo/akg$a;->sendEmptyMessage(I)Z

    .line 609
    :cond_0
    return-void
.end method
