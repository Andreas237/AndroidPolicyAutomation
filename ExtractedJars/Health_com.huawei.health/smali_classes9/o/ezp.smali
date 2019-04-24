.class public abstract Lo/ezp;
.super Lo/ezo;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lo/ezo;-><init>(Landroid/app/Activity;)V

    .line 16
    return-void
.end method


# virtual methods
.method protected e()Lo/eyy;
    .locals 2

    .line 31
    new-instance v0, Lo/eyx;

    invoke-virtual {p0}, Lo/ezp;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyx;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
