.class final Lo/akg$e;
.super Lo/ajf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ajf<Lo/akg;>;"
    }
.end annotation


# instance fields
.field d:I


# direct methods
.method public constructor <init>(Lo/akg;)V
    .locals 1

    .line 642
    invoke-direct {p0, p1}, Lo/ajf;-><init>(Ljava/lang/Object;)V

    .line 635
    const/4 v0, 0x0

    iput v0, p0, Lo/akg$e;->d:I

    .line 643
    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;I)V
    .locals 1

    .line 633
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$e;->b(Lo/akg;I)V

    return-void
.end method

.method public a(Lo/akg;Ljava/lang/Object;)V
    .locals 4

    .line 647
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ScanSelectDeviceCallback: onSuccess status"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 648
    if-nez p1, :cond_0

    .line 649
    return-void

    .line 651
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/akg;->a(Lo/akg;Ljava/lang/String;)V

    .line 652
    iget v0, p0, Lo/akg$e;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/akg$e;->d:I

    .line 653
    iget v0, p0, Lo/akg$e;->d:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_1

    .line 654
    return-void

    .line 656
    :cond_1
    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 657
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScanSelectDeviceCallback: The specified WiFi is not scanned"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 660
    :cond_2
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScanSelectDeviceCallback: Scan to specified WiFi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 661
    invoke-virtual {p0}, Lo/akg$e;->d()V

    .line 662
    invoke-static {p1}, Lo/akg;->b(Lo/akg;)V

    .line 663
    invoke-virtual {p1}, Lo/akg;->c()V

    .line 664
    const/16 v0, 0x842

    invoke-static {p1, v0}, Lo/akg;->b(Lo/akg;I)V

    .line 666
    :goto_0
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;I)V
    .locals 1

    .line 633
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$e;->e(Lo/akg;I)V

    return-void
.end method

.method public b(Lo/akg;I)V
    .locals 4

    .line 670
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScanSelectDeviceCallback: onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 671
    return-void
.end method

.method public synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 633
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$e;->a(Lo/akg;Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 1

    .line 638
    const/4 v0, 0x0

    iput v0, p0, Lo/akg$e;->d:I

    .line 639
    return-void
.end method

.method public e(Lo/akg;I)V
    .locals 0

    .line 675
    return-void
.end method
