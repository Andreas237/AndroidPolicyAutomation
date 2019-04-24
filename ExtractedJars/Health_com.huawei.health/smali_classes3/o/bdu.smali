.class public Lo/bdu;
.super Landroid/widget/ListView;
.source "SourceFile"


# instance fields
.field private a:Lo/bec;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    return-void
.end method


# virtual methods
.method protected onOverScrolled(IIZZ)V
    .locals 2

    .line 24
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ListView;->onOverScrolled(IIZZ)V

    .line 25
    iget-object v0, p0, Lo/bdu;->a:Lo/bec;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 27
    iget-object v0, p0, Lo/bdu;->a:Lo/bec;

    invoke-interface {v0, p1, p2}, Lo/bec;->c(II)V

    .line 29
    :cond_0
    return-void
.end method

.method public setOnOverScrollListener(Lo/bec;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lo/bdu;->a:Lo/bec;

    .line 19
    return-void
.end method
