.class public Lo/fsg;
.super Lo/frf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fsg$a;
    }
.end annotation


# instance fields
.field e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fsg$a;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fsg$a;>;)V"
        }
    .end annotation

    .line 50
    sget-object v0, Lo/frf$b;->o:Lo/frf$b;

    invoke-direct {p0, v0}, Lo/frf;-><init>(Lo/frf$b;)V

    .line 51
    iput-object p1, p0, Lo/fsg;->e:Ljava/util/List;

    .line 52
    return-void
.end method

.method public static d([B)Lo/frf;
    .locals 5

    .line 96
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 98
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 100
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 101
    :goto_0
    if-lez v2, :cond_0

    .line 102
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v0

    invoke-static {v0}, Lo/fsg$a;->b(I)Lo/fsg$a;

    move-result-object v4

    .line 103
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    add-int/lit8 v2, v2, -0x1

    .line 107
    goto :goto_0

    .line 109
    :cond_0
    new-instance v0, Lo/fsg;

    invoke-direct {v0, v3}, Lo/fsg;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 2

    .line 64
    iget-object v0, p0, Lo/fsg;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    return v0
.end method

.method protected e(Lo/fpp;)V
    .locals 5

    .line 85
    iget-object v0, p0, Lo/fsg;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 87
    add-int/lit8 v0, v2, 0x1

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 88
    const/16 v0, 0x8

    invoke-virtual {p1, v2, v0}, Lo/fpp;->c(II)V

    .line 90
    iget-object v0, p0, Lo/fsg;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fsg$a;

    .line 91
    invoke-virtual {v4}, Lo/fsg$a;->d()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/frf;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    const-string v0, "\t\t\t\tLength: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fsg;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\t\tEC point formats length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fsg;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x5

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\t\tElliptic Curves Point Formats ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fsg;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    iget-object v0, p0, Lo/fsg;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fsg$a;

    .line 75
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\t\t\tEC point format: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lo/fsg$a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
