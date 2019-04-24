.class Lo/dnq$e;
.super Lo/dok;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dnq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lo/dnq;


# direct methods
.method private constructor <init>(Lo/dnq;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-direct {p0}, Lo/dok;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dnq;Lo/dnq$5;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lo/dnq$e;-><init>(Lo/dnq;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 56
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    new-instance v1, Lo/dnt;

    invoke-direct {v1}, Lo/dnt;-><init>()V

    invoke-static {v0, v1}, Lo/dnq;->e(Lo/dnq;Lo/dnr;)Lo/dnr;

    .line 57
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->d(Lo/dnq;)Lo/dnr;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v1}, Lo/dnq;->e(Lo/dnq;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dnr;->a(Landroid/content/Context;)V

    .line 58
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    new-instance v1, Lo/dnw;

    invoke-direct {v1}, Lo/dnw;-><init>()V

    invoke-static {v0, v1}, Lo/dnq;->b(Lo/dnq;Lo/dny;)Lo/dny;

    .line 59
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->c(Lo/dnq;)Lo/dny;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v1}, Lo/dnq;->e(Lo/dnq;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dny;->d(Landroid/content/Context;)V

    .line 60
    return-void
.end method

.method protected c()V
    .locals 5

    .line 73
    :try_start_0
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->d(Lo/dnq;)Lo/dnr;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v1}, Lo/dnq;->e(Lo/dnq;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dnr;->b(Landroid/content/Context;)V

    .line 74
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    new-instance v1, Lo/dns;

    invoke-direct {v1}, Lo/dns;-><init>()V

    invoke-static {v0, v1}, Lo/dnq;->e(Lo/dnq;Lo/dnr;)Lo/dnr;

    .line 75
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->c(Lo/dnq;)Lo/dny;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v1}, Lo/dnq;->e(Lo/dnq;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dny;->b(Landroid/content/Context;)V

    .line 76
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    new-instance v1, Lo/dnz;

    invoke-direct {v1}, Lo/dnz;-><init>()V

    invoke-static {v0, v1}, Lo/dnq;->b(Lo/dnq;Lo/dny;)Lo/dny;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    goto :goto_0

    .line 77
    :catch_0
    move-exception v4

    .line 78
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_0
    return-void
.end method

.method protected d()V
    .locals 2

    .line 84
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    new-instance v1, Lo/dnu;

    invoke-direct {v1}, Lo/dnu;-><init>()V

    invoke-static {v0, v1}, Lo/dnq;->e(Lo/dnq;Lo/dnr;)Lo/dnr;

    .line 85
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->d(Lo/dnq;)Lo/dnr;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v1}, Lo/dnq;->e(Lo/dnq;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dnr;->a(Landroid/content/Context;)V

    .line 86
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    new-instance v1, Lo/dnw;

    invoke-direct {v1}, Lo/dnw;-><init>()V

    invoke-static {v0, v1}, Lo/dnq;->b(Lo/dnq;Lo/dny;)Lo/dny;

    .line 87
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->c(Lo/dnq;)Lo/dny;

    move-result-object v0

    iget-object v1, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v1}, Lo/dnq;->e(Lo/dnq;)Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dny;->d(Landroid/content/Context;)V

    .line 88
    return-void
.end method

.method protected e()V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->d(Lo/dnq;)Lo/dnr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 66
    iget-object v0, p0, Lo/dnq$e;->c:Lo/dnq;

    invoke-static {v0}, Lo/dnq;->d(Lo/dnq;)Lo/dnr;

    move-result-object v0

    invoke-interface {v0}, Lo/dnr;->a()V

    .line 68
    :cond_0
    return-void
.end method
