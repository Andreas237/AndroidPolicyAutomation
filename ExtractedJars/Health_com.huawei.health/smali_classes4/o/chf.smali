.class public Lo/chf;
.super Lo/emd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/chf$d;
    }
.end annotation


# instance fields
.field private a:Lo/chf$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lo/emd;-><init>(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lo/emd;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lo/emd;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 6

    .line 31
    invoke-super {p0, p1, p2, p3, p4}, Lo/emd;->onScrollChanged(IIII)V

    .line 32
    iget-object v0, p0, Lo/chf;->a:Lo/chf$d;

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lo/chf;->a:Lo/chf$d;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lo/chf$d;->d(Landroid/widget/ScrollView;IIII)V

    .line 35
    :cond_0
    return-void
.end method

.method public setOnScrollChangedListener(Lo/chf$d;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/chf;->a:Lo/chf$d;

    .line 39
    return-void
.end method
