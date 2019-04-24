.class public Lo/akp;
.super Lo/akn;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akp$c;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lo/akn;-><init>()V

    .line 14
    new-instance v0, Lo/akp$2;

    invoke-direct {v0, p0}, Lo/akp$2;-><init>(Lo/akp;)V

    iput-object v0, p0, Lo/akp;->e:Lo/cxb;

    .line 25
    return-void
.end method

.method synthetic constructor <init>(Lo/akp$2;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lo/akp;-><init>()V

    return-void
.end method

.method public static final d()Lo/akp;
    .locals 1

    .line 28
    invoke-static {}, Lo/akp$c;->b()Lo/akp;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 33
    invoke-super {p0}, Lo/akn;->c()V

    .line 34
    const-string v0, "HWhealthLinkage_PSInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterStatusListener enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-void
.end method

.method public e()V
    .locals 4

    .line 39
    const-string v0, "HWhealthLinkage_PSInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerStatusListener enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/akp;->e:Lo/cxb;

    invoke-virtual {v0, v1}, Lo/brt;->e(Lo/cxb;)V

    .line 41
    return-void
.end method
