.class public abstract Lo/eyn;
.super Lo/eym;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lo/eym;-><init>(Landroid/app/Activity;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected e()Lo/eyy;
    .locals 2

    .line 28
    new-instance v0, Lo/eyw;

    invoke-virtual {p0}, Lo/eyn;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyw;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
