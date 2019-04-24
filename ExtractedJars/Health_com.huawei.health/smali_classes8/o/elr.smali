.class public Lo/elr;
.super Lo/fle;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lo/fle;-><init>(Landroid/content/Context;)V

    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1, p2}, Lo/fle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    return-void
.end method


# virtual methods
.method public dispatchWindowFocusChanged(Z)V
    .locals 0

    .line 23
    invoke-super {p0, p1}, Lo/fle;->dispatchWindowFocusChanged(Z)V

    .line 24
    invoke-virtual {p0, p1}, Lo/elr;->setScrollTopEnable(Z)V

    .line 25
    return-void
.end method
