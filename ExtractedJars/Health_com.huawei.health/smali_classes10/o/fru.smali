.class public Lo/fru;
.super Lo/fqf;
.source "SourceFile"


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 36
    sget-object v0, Lo/frf$b;->x:Lo/frf$b;

    invoke-direct {p0, v0, p1}, Lo/fqf;-><init>(Lo/frf$b;Z)V

    .line 37
    return-void
.end method

.method public static e([B)Lo/fru;
    .locals 3

    .line 65
    new-instance v2, Lo/fru;

    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {v2, v0}, Lo/fru;-><init>(Z)V

    .line 66
    invoke-virtual {v2, p0}, Lo/fru;->d([B)V

    .line 67
    return-object v2
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-super {p0}, Lo/fqf;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lo/fru;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/fqf$e;

    .line 58
    const-string v0, "\t\t\t\tServer certificate type: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
