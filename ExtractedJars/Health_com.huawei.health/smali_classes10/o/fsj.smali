.class public final Lo/fsj;
.super Lo/frf;
.source "SourceFile"


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 56
    sget-object v0, Lo/frf$b;->n:Lo/frf$b;

    invoke-direct {p0, v0}, Lo/frf;-><init>(Lo/frf$b;)V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    .line 58
    return-void
.end method

.method public constructor <init>([Lo/fsi$d;)V
    .locals 6

    .line 67
    sget-object v0, Lo/frf$b;->n:Lo/frf$b;

    invoke-direct {p0, v0}, Lo/frf;-><init>(Lo/frf$b;)V

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    .line 69
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 70
    iget-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-virtual {v5}, Lo/fsi$d;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 72
    :cond_0
    return-void
.end method

.method public static c([B)Lo/frf;
    .locals 5

    .line 88
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 90
    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 92
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 93
    :goto_0
    if-lez v2, :cond_0

    .line 94
    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v4

    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    add-int/lit8 v2, v2, -0x2

    .line 98
    goto :goto_0

    .line 100
    :cond_0
    new-instance v0, Lo/fsj;

    invoke-direct {v0, v3}, Lo/fsj;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 2

    .line 109
    iget-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x6

    return v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 134
    iget-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected e(Lo/fpp;)V
    .locals 5

    .line 78
    iget-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v2, v0, 0x2

    .line 79
    add-int/lit8 v0, v2, 0x2

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 80
    const/16 v0, 0x10

    invoke-virtual {p1, v2, v0}, Lo/fpp;->c(II)V

    .line 82
    iget-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 83
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/frf;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    const-string v0, "\t\t\t\tLength: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fsj;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\t\tElliptic Curves Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fsj;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x6

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\t\tElliptic Curves ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " curves):"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    iget-object v0, p0, Lo/fsj;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Integer;

    .line 120
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/fsi$d;->c(I)Lo/fsi$d;

    move-result-object v6

    .line 121
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\t\t\t\t\tElliptic Curve: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    if-eqz v6, :cond_0

    .line 123
    invoke-virtual {v6}, Lo/fsi$d;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 125
    :cond_0
    const-string v0, "unknown"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    :goto_1
    const-string v0, " ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    goto :goto_0

    .line 130
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
