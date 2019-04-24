.class public abstract Lo/ezc;
.super Lo/ezd;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lo/ezd;-><init>(Landroid/app/Activity;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected e()Lo/eyy;
    .locals 2

    .line 32
    new-instance v0, Lo/eyx;

    invoke-virtual {p0}, Lo/ezc;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyx;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
