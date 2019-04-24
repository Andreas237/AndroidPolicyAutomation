.class public Lo/fgq;
.super Lo/fgt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Lo/fgt<TT;>;"
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/fgt;-><init>()V

    .line 32
    iput-object p1, p0, Lo/fgq;->b:Landroid/content/Context;

    .line 33
    return-void
.end method


# virtual methods
.method public a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 37
    if-nez p2, :cond_0

    .line 38
    new-instance p2, Lo/fgz;

    iget-object v0, p0, Lo/fgq;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lo/fgz;-><init>(Landroid/content/Context;)V

    .line 40
    :cond_0
    move-object v1, p2

    check-cast v1, Lo/fgz;

    .line 41
    invoke-virtual {p0, p1}, Lo/fgq;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    instance-of v0, v1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    .line 44
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v1, v0}, Lo/fgz;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/fgz;->setText(Ljava/lang/CharSequence;)V

    .line 50
    :cond_2
    :goto_0
    return-object p2
.end method
