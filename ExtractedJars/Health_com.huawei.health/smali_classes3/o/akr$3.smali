.class Lo/akr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/afg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akr;


# direct methods
.method constructor <init>(Lo/akr;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/akr$3;->a:Lo/akr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/acl;)V
    .locals 4

    .line 62
    if-nez p1, :cond_0

    .line 63
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IHeartRateDeviceSelectedCallback device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    return-void

    .line 66
    :cond_0
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IHeartRateDeviceSelectedCallback "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lo/akr$3;->a:Lo/akr;

    invoke-static {v0, p1}, Lo/akr;->c(Lo/akr;Lo/acl;)Lo/acl;

    .line 72
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->g()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 73
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IHeartRateDeviceSelectedCallback failed to open heartrate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    iget-object v1, p0, Lo/akr$3;->a:Lo/akr;

    invoke-static {v1}, Lo/akr;->e(Lo/akr;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/akt;->c(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)I

    .line 77
    :cond_1
    return-void
.end method
