.class public Lo/ere;
.super Landroid/widget/TextView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 12
    return-void
.end method


# virtual methods
.method public getBaseline()I
    .locals 4

    .line 20
    invoke-virtual {p0}, Lo/ere;->getLayout()Landroid/text/Layout;

    move-result-object v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    invoke-super {p0}, Landroid/widget/TextView;->getBaseline()I

    move-result v0

    return v0

    .line 24
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->getBaseline()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result v1

    sub-int v3, v0, v1

    .line 25
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineBaseline(I)I

    move-result v0

    add-int/2addr v0, v3

    return v0
.end method
