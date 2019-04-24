.class Lo/dnw$1$5;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw$1;->c(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dnw$1;


# direct methods
.method constructor <init>(Lo/dnw$1;Landroid/os/Handler;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lo/dnw$1$5;->e:Lo/dnw$1;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 177
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_SYNC_DATA actions FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 182
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_SYNC_DATA actions SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lo/dnw$1$5;->e:Lo/dnw$1;

    iget-object v0, v0, Lo/dnw$1;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->e(Lo/dnw;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-static {v0, v1}, Lo/dol;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 184
    return-void
.end method
