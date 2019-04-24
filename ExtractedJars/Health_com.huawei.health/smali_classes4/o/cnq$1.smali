.class Lo/cnq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cnq;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cnq;


# direct methods
.method constructor <init>(Lo/cnq;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lo/cnq$1;->d:Lo/cnq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 171
    :try_start_0
    iget-object v0, p0, Lo/cnq$1;->d:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->h()I

    .line 172
    iget-object v0, p0, Lo/cnq$1;->d:Lo/cnq;

    invoke-static {v0}, Lo/cnq;->a(Lo/cnq;)Lo/cnw;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnw;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    goto :goto_0

    .line 173
    :catch_0
    move-exception v4

    .line 174
    const-string v0, "HiH_HiHealthBinder"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiHealthBinder() moveOldData e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_0
    return-void
.end method
