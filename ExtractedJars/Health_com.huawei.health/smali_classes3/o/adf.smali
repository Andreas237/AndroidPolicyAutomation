.class public Lo/adf;
.super Lo/afx;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/afx;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public b()Lo/acl$a;
    .locals 1

    .line 31
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 40
    const-string v0, "74e12d04-cf14-4ce8-9e42-7a085f79b708"

    return-object v0
.end method

.method public e()Lo/afv;
    .locals 1

    .line 56
    new-instance v0, Lo/adg;

    invoke-direct {v0}, Lo/adg;-><init>()V

    return-object v0
.end method
