.class final Lo/oz$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/oz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field private final a:I

.field private final e:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 582
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 583
    iput p1, p0, Lo/oz$d;->e:I

    .line 584
    iput p2, p0, Lo/oz$d;->a:I

    .line 585
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 588
    iget v0, p0, Lo/oz$d;->e:I

    return v0
.end method

.method c()I
    .locals 1

    .line 592
    iget v0, p0, Lo/oz$d;->a:I

    return v0
.end method

.method d()Lo/ou;
    .locals 3

    .line 579
    new-instance v0, Lo/ou;

    invoke-virtual {p0}, Lo/oz$d;->a()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Lo/oz$d;->c()I

    move-result v2

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 597
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/oz$d;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/oz$d;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
