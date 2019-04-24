.class public Lo/eio;
.super Lo/ln;
.source "SourceFile"


# instance fields
.field private E:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lo/ln;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eio;->E:Z

    .line 12
    const/4 v0, 0x0

    invoke-static {v0}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/eio;->z:F

    .line 13
    return-void
.end method


# virtual methods
.method public F()Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/eio;->E:Z

    return v0
.end method

.method public k(Z)V
    .locals 0

    .line 18
    iput-boolean p1, p0, Lo/eio;->E:Z

    .line 19
    return-void
.end method
