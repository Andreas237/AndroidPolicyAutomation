.class public Lo/acw;
.super Lo/afx;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lo/afx;-><init>()V

    .line 15
    return-void
.end method


# virtual methods
.method public b()Lo/acl$a;
    .locals 1

    .line 19
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 24
    const-string v0, "DnurseGlucose"

    return-object v0
.end method

.method public e()Lo/afv;
    .locals 1

    .line 29
    new-instance v0, Lo/acx;

    invoke-direct {v0}, Lo/acx;-><init>()V

    return-object v0
.end method
