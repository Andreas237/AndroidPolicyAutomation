.class Lo/aly$c;
.super Lo/dqj$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/aly;


# direct methods
.method private constructor <init>(Lo/aly;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lo/aly$c;->d:Lo/aly;

    invoke-direct {p0}, Lo/dqj$e;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/aly;Lo/aly$3;)V
    .locals 0

    .line 168
    invoke-direct {p0, p1}, Lo/aly$c;-><init>(Lo/aly;)V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 191
    iget-object v0, p0, Lo/aly$c;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->c(Lo/aly;)Lo/abv;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lo/aly$c;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->c(Lo/aly;)Lo/abv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/abv;->e(I)V

    .line 194
    :cond_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 174
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/aly$c;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->e(Lo/aly;)Lo/abm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    const-string v0, "start_time"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 178
    const-string v0, "steps"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v9

    .line 179
    const-string v0, "floors"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v10

    .line 180
    const-string v0, "motions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v11

    .line 181
    iget-object v0, p0, Lo/aly$c;->d:Lo/aly;

    invoke-static {v0}, Lo/aly;->e(Lo/aly;)Lo/abm;

    move-result-object v0

    iget-object v1, p0, Lo/aly$c;->d:Lo/aly;

    invoke-static {v1}, Lo/aly;->a(Lo/aly;)Landroid/content/Context;

    move-result-object v1

    move-wide v2, v7

    move-object v4, v9

    move-object v5, v10

    move-object v6, v11

    invoke-virtual/range {v0 .. v6}, Lo/abm;->b(Landroid/content/Context;J[I[I[I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_0

    .line 182
    :catch_0
    move-exception v9

    .line 183
    const-string v0, "Step_Mock"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :cond_0
    :goto_0
    return-void
.end method
