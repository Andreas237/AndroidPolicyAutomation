.class public Lo/fex;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private a:Lo/few;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method


# virtual methods
.method public getAdapter()Lo/few;
    .locals 1

    .line 14
    iget-object v0, p0, Lo/fex;->a:Lo/few;

    return-object v0
.end method

.method public setAdapter(Lo/few;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lo/fex;->a:Lo/few;

    .line 19
    invoke-virtual {p1}, Lo/few;->a()V

    .line 20
    return-void
.end method
