.class Lo/akj$3;
.super Lo/aka;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akj;


# direct methods
.method constructor <init>(Lo/akj;JJ)V
    .locals 0

    .line 288
    iput-object p1, p0, Lo/akj$3;->a:Lo/akj;

    invoke-direct {p0, p2, p3, p4, p5}, Lo/aka;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 300
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScanDeviceWifiStatusTimer: onFinish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 301
    iget-object v0, p0, Lo/akj$3;->a:Lo/akj;

    invoke-static {v0}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lo/akj$3;->a:Lo/akj;

    invoke-static {v0}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    invoke-interface {v0}, Lo/ajn;->onDeviceDiscoveryFinished()V

    .line 304
    :cond_0
    return-void
.end method

.method public c(J)V
    .locals 5

    .line 291
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScanDeviceWifiStatusTimer: onTick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 292
    iget-object v0, p0, Lo/akj$3;->a:Lo/akj;

    invoke-static {v0}, Lo/akj;->c(Lo/akj;)Lo/aia;

    move-result-object v0

    iget-object v1, p0, Lo/akj$3;->a:Lo/akj;

    invoke-virtual {v1}, Lo/akj;->e()Lo/ajd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aia;->c(Lo/ajd;)Ljava/lang/String;

    move-result-object v4

    .line 293
    iget-object v0, p0, Lo/akj$3;->a:Lo/akj;

    invoke-static {v0}, Lo/akj;->k(Lo/akj;)Lo/ajm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 294
    iget-object v0, p0, Lo/akj$3;->a:Lo/akj;

    invoke-static {v0}, Lo/akj;->k(Lo/akj;)Lo/ajm;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V

    .line 296
    :cond_0
    return-void
.end method
