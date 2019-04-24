.class public abstract Lo/eza;
.super Lo/ezd;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/ezd;-><init>(Landroid/app/Activity;)V

    .line 26
    return-void
.end method


# virtual methods
.method protected e()Lo/eyy;
    .locals 2

    .line 41
    new-instance v0, Lo/eyw;

    invoke-virtual {p0}, Lo/eza;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eyw;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
