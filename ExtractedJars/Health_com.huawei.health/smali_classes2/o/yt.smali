.class public Lo/yt;
.super Landroid/widget/EditText;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/yt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 37
    const v0, 0x101006e

    invoke-direct {p0, p1, p2, v0}, Lo/yt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    return-void
.end method


# virtual methods
.method public getError()Ljava/lang/CharSequence;
    .locals 1

    .line 62
    invoke-super {p0}, Landroid/widget/EditText;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 50
    invoke-super/range {p0 .. p5}, Landroid/widget/EditText;->onLayout(ZIIII)V

    .line 51
    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 0

    .line 56
    invoke-super {p0, p1}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    .line 57
    return-void
.end method
