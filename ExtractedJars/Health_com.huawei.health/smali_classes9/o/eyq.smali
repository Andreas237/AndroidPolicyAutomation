.class public abstract Lo/eyq;
.super Lo/eym;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lo/eym;-><init>(Landroid/app/Activity;)V

    .line 15
    return-void
.end method


# virtual methods
.method protected e()Lo/eyy;
    .locals 2

    .line 27
    new-instance v0, Lo/ezb;

    invoke-virtual {p0}, Lo/eyq;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ezb;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
