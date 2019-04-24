.class public Lo/ach;
.super Lo/acp;
.source "SourceFile"


# instance fields
.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lo/acp;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ach;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 57
    const-string v0, "DnurseGlucose"

    return-object v0
.end method

.method public a(Lo/aby;)Z
    .locals 1

    .line 26
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lo/aby;->onStateChanged(I)V

    .line 27
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 52
    const-string v0, "DnurseGlucose"

    return-object v0
.end method

.method public b(I)Z
    .locals 1

    .line 42
    const/4 v0, 0x1

    return v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/ach;->c:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public c()Z
    .locals 1

    .line 32
    const/4 v0, 0x0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/ach;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 62
    const-string v0, "DnurseGlucose"

    return-object v0
.end method
