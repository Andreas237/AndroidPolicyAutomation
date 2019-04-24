.class public Lo/aem;
.super Lo/afx;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lo/afx;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lo/acl$a;
    .locals 1

    .line 18
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 23
    const-string v0, "8ca2c3a7-0db5-4b42-908b-922f157d8c87"

    return-object v0
.end method

.method public e()Lo/afv;
    .locals 1

    .line 34
    new-instance v0, Lo/ael;

    invoke-direct {v0}, Lo/ael;-><init>()V

    return-object v0
.end method
