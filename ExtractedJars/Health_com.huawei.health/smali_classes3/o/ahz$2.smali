.class Lo/ahz$2;
.super Lo/aka;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ahz;


# direct methods
.method constructor <init>(Lo/ahz;JJ)V
    .locals 0

    .line 217
    iput-object p1, p0, Lo/ahz$2;->d:Lo/ahz;

    invoke-direct {p0, p2, p3, p4, p5}, Lo/aka;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 226
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScanCoapDevicesTimer: onFinish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 227
    return-void
.end method

.method public c(J)V
    .locals 4

    .line 220
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mScanCoapDevicesTimer: onTick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lo/ahz$2;->d:Lo/ahz;

    iget-object v1, p0, Lo/ahz$2;->d:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->e(Lo/ahz;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ahz$2;->d:Lo/ahz;

    invoke-static {v2}, Lo/ahz;->c(Lo/ahz;)Lo/ace;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/ahz;->b(Lo/ahz;Ljava/lang/String;Lo/ace;)V

    .line 222
    return-void
.end method
