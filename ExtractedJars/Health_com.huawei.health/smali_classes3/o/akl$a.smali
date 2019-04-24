.class final Lo/akl$a;
.super Lo/ajf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ajf<Lo/akl;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akl;)V
    .locals 0

    .line 377
    invoke-direct {p0, p1}, Lo/ajf;-><init>(Ljava/lang/Object;)V

    .line 378
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;I)V
    .locals 1

    .line 374
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$a;->a(Lo/akl;I)V

    return-void
.end method

.method public a(Lo/akl;I)V
    .locals 4

    .line 394
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " SoftApDeviceCallback onFailure:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 395
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p1}, Lo/akl;->e(Lo/akl;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 396
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 397
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 398
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 400
    :cond_0
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;I)V
    .locals 1

    .line 374
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$a;->e(Lo/akl;I)V

    return-void
.end method

.method public synthetic c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 374
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$a;->e(Lo/akl;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lo/akl;I)V
    .locals 0

    .line 404
    return-void
.end method

.method public e(Lo/akl;Ljava/lang/Object;)V
    .locals 4

    .line 382
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " SoftApDeviceCallback onSuccess:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 383
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-static {p1}, Lo/akl;->e(Lo/akl;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 385
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 386
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 387
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/akl$c;->removeMessages(I)V

    .line 388
    invoke-static {p1}, Lo/akl;->d(Lo/akl;)Lo/akl$c;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/akl$c;->sendEmptyMessage(I)Z

    .line 390
    :cond_0
    return-void
.end method
