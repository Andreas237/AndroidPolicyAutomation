.class public Lo/emi;
.super Lo/ekw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/emi$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lo/ekw;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-direct {p0}, Lo/emi;->D()V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lo/ekw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    invoke-direct {p0}, Lo/emi;->D()V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2, p3}, Lo/ekw;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    invoke-direct {p0}, Lo/emi;->D()V

    .line 27
    return-void
.end method

.method private D()V
    .locals 2

    .line 30
    new-instance v0, Lo/emi$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/emi$b;-><init>(Lo/emi$5;)V

    invoke-virtual {p0, v0}, Lo/emi;->a(Lo/ekw$e;)V

    .line 31
    invoke-virtual {p0}, Lo/emi;->getLegend()Lo/lm;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/lm;->d(Z)V

    .line 32
    return-void
.end method
