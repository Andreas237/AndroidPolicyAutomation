.class public Lo/bnk;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bnk$d;
    }
.end annotation


# instance fields
.field private d:Lo/bnk$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method


# virtual methods
.method protected onSizeChanged(IIII)V
    .locals 1

    .line 42
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/RelativeLayout;->onSizeChanged(IIII)V

    .line 44
    iget-object v0, p0, Lo/bnk;->d:Lo/bnk$d;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lo/bnk;->d:Lo/bnk$d;

    invoke-interface {v0, p1, p2, p3, p4}, Lo/bnk$d;->c(IIII)V

    .line 48
    :cond_0
    return-void
.end method

.method public setOnResizeListener(Lo/bnk$d;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/bnk;->d:Lo/bnk$d;

    .line 32
    return-void
.end method
