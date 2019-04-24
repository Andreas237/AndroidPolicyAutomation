.class abstract Lo/afq$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/afq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Runnable;Ljava/lang/Comparable<Lo/afq$c;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/afq;

.field private e:I


# direct methods
.method public constructor <init>(Lo/afq;I)V
    .locals 1

    .line 664
    iput-object p1, p0, Lo/afq$c;->d:Lo/afq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 665
    if-gez p2, :cond_0

    .line 666
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 668
    :cond_0
    iput p2, p0, Lo/afq$c;->e:I

    .line 669
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 685
    iget v0, p0, Lo/afq$c;->e:I

    return v0
.end method

.method public a(Lo/afq$c;)I
    .locals 3

    .line 673
    invoke-virtual {p0}, Lo/afq$c;->a()I

    move-result v1

    .line 674
    invoke-virtual {p1}, Lo/afq$c;->a()I

    move-result v2

    .line 675
    if-ge v1, v2, :cond_0

    .line 676
    const/4 v0, 0x1

    return v0

    .line 678
    :cond_0
    if-le v1, v2, :cond_1

    .line 679
    const/4 v0, -0x1

    return v0

    .line 681
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 660
    move-object v0, p1

    check-cast v0, Lo/afq$c;

    invoke-virtual {p0, v0}, Lo/afq$c;->a(Lo/afq$c;)I

    move-result v0

    return v0
.end method
