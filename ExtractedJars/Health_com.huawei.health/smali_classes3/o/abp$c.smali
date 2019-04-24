.class Lo/abp$c;
.super Lo/akk$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/abp;


# direct methods
.method private constructor <init>(Lo/abp;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lo/abp$c;->c:Lo/abp;

    invoke-direct {p0}, Lo/akk$e;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/abp;Lo/abp$1;)V
    .locals 0

    .line 207
    invoke-direct {p0, p1}, Lo/abp$c;-><init>(Lo/abp;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 213
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 217
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 218
    iget-object v0, p0, Lo/abp$c;->c:Lo/abp;

    .line 219
    invoke-static {v0}, Lo/abp;->c(Lo/abp;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    invoke-virtual {v0}, Lo/alt;->c()Lo/aku;

    move-result-object v7

    .line 220
    if-eqz v7, :cond_0

    .line 221
    const-string v0, "total_steps"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    .line 222
    const/4 v0, 0x0

    invoke-interface {v7, v8, v0}, Lo/aku;->b(IZ)V

    .line 226
    :cond_0
    const-string v0, "start_time"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 227
    const-string v0, "steps"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v9

    .line 228
    const-string v0, "floors"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v10

    .line 229
    const-string v0, "motions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v11

    .line 230
    iget-object v0, p0, Lo/abp$c;->c:Lo/abp;

    iget-object v1, p0, Lo/abp$c;->c:Lo/abp;

    invoke-static {v1}, Lo/abp;->c(Lo/abp;)Landroid/content/Context;

    move-result-object v1

    move-wide v2, v7

    move-object v4, v9

    move-object v5, v10

    move-object v6, v11

    invoke-virtual/range {v0 .. v6}, Lo/abp;->b(Landroid/content/Context;J[I[I[I)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    goto :goto_0

    .line 231
    :catch_0
    move-exception v7

    .line 232
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :cond_1
    :goto_0
    return-void
.end method
