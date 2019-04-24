.class public Lo/ada;
.super Lo/afx;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/afx;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lo/acl$a;
    .locals 1

    .line 21
    sget-object v0, Lo/acl$a;->d:Lo/acl$a;

    return-object v0
.end method

.method public c()Lo/afv;
    .locals 1

    .line 41
    new-instance v0, Lo/add;

    invoke-direct {v0}, Lo/add;-><init>()V

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 26
    const-string v0, "bb11c776-c510-415d-ae3d-9a20207bd617"

    return-object v0
.end method

.method public e()Lo/afv;
    .locals 1

    .line 36
    new-instance v0, Lo/add;

    invoke-direct {v0}, Lo/add;-><init>()V

    return-object v0
.end method
