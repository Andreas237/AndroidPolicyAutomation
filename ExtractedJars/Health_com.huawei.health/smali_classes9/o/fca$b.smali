.class Lo/fca$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lo/fca$b;>;"
    }
.end annotation


# instance fields
.field a:I

.field e:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 647
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 648
    iput p1, p0, Lo/fca$b;->e:I

    .line 649
    iput p2, p0, Lo/fca$b;->a:I

    .line 650
    return-void
.end method

.method private a()I
    .locals 1

    .line 660
    iget v0, p0, Lo/fca$b;->e:I

    return v0
.end method


# virtual methods
.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 644
    move-object v0, p1

    check-cast v0, Lo/fca$b;

    invoke-virtual {p0, v0}, Lo/fca$b;->e(Lo/fca$b;)I

    move-result v0

    return v0
.end method

.method public e(Lo/fca$b;)I
    .locals 2

    .line 654
    invoke-direct {p0}, Lo/fca$b;->a()I

    move-result v0

    invoke-direct {p1}, Lo/fca$b;->a()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 655
    :cond_0
    invoke-direct {p0}, Lo/fca$b;->a()I

    move-result v0

    invoke-direct {p1}, Lo/fca$b;->a()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 656
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 664
    if-nez p1, :cond_0

    .line 666
    const/4 v0, 0x0

    return v0

    .line 669
    :cond_0
    if-ne p0, p1, :cond_1

    .line 671
    const/4 v0, 0x1

    return v0

    .line 674
    :cond_1
    instance-of v0, p1, Lo/fca$b;

    if-nez v0, :cond_2

    .line 676
    const/4 v0, 0x0

    return v0

    .line 679
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fca$b;

    .line 680
    iget v0, p0, Lo/fca$b;->e:I

    iget v1, v2, Lo/fca$b;->e:I

    if-ne v0, v1, :cond_3

    .line 681
    const/4 v0, 0x1

    return v0

    .line 683
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 688
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
