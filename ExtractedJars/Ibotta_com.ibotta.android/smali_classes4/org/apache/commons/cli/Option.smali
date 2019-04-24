.class public Lorg/apache/commons/cli/Option;
.super Ljava/lang/Object;
.source "Option.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final UNINITIALIZED:I = -0x1

.field public static final UNLIMITED_VALUES:I = -0x2

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private argName:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private longOpt:Ljava/lang/String;

.field private numberOfArgs:I

.field private opt:Ljava/lang/String;

.field private optionalArg:Z

.field private required:Z

.field private type:Ljava/lang/Object;

.field private values:Ljava/util/List;

.field private valuesep:C


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 90
    invoke-direct {p0, p1, v0, v1, p2}, Lorg/apache/commons/cli/Option;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "arg"

    .line 56
    iput-object v0, p0, Lorg/apache/commons/cli/Option;->argName:Ljava/lang/String;

    const/4 v0, -0x1

    .line 68
    iput v0, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    .line 123
    invoke-static {p1}, Lorg/apache/commons/cli/OptionValidator;->validateOption(Ljava/lang/String;)V

    .line 125
    iput-object p1, p0, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    .line 126
    iput-object p2, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    .line 131
    iput p1, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    .line 134
    :cond_0
    iput-object p4, p0, Lorg/apache/commons/cli/Option;->description:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 105
    invoke-direct {p0, p1, v0, p2, p3}, Lorg/apache/commons/cli/Option;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method

.method private add(Ljava/lang/String;)V
    .locals 2

    .line 468
    iget v0, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    add-int/lit8 v1, v1, -0x1

    if-gt v0, v1, :cond_0

    goto :goto_0

    .line 470
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Cannot add value, list full."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 474
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private hasNoValues()Z
    .locals 1

    .line 590
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0
.end method

.method private processValue(Ljava/lang/String;)V
    .locals 4

    .line 425
    invoke-virtual {p0}, Lorg/apache/commons/cli/Option;->hasValueSeparator()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 428
    invoke-virtual {p0}, Lorg/apache/commons/cli/Option;->getValueSeparator()C

    move-result v0

    .line 431
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    .line 437
    iget-object v2, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    .line 443
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lorg/apache/commons/cli/Option;->add(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    .line 446
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 449
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    goto :goto_0

    .line 454
    :cond_1
    :goto_1
    invoke-direct {p0, p1}, Lorg/apache/commons/cli/Option;->add(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public addValue(Ljava/lang/String;)Z
    .locals 1

    .line 670
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. "

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method addValueForProcessing(Ljava/lang/String;)V
    .locals 2

    .line 401
    iget v0, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 407
    invoke-direct {p0, p1}, Lorg/apache/commons/cli/Option;->processValue(Ljava/lang/String;)V

    return-void

    .line 404
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "NO_ARGS_ALLOWED"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method clearValues()V
    .locals 1

    .line 659
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 4

    .line 641
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/cli/Option;

    .line 642
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 647
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "A CloneNotSupportedException was thrown: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 599
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 604
    :cond_1
    check-cast p1, Lorg/apache/commons/cli/Option;

    .line 607
    iget-object v2, p0, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    .line 611
    :cond_3
    iget-object v2, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object p1, p1, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    if-eqz p1, :cond_5

    :goto_1
    return v1

    :cond_5
    return v0

    :cond_6
    :goto_2
    return v1
.end method

.method public getArgName()Ljava/lang/String;
    .locals 1

    .line 317
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->argName:Ljava/lang/String;

    return-object v0
.end method

.method public getArgs()I
    .locals 1

    .line 391
    iget v0, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 266
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 2

    .line 146
    invoke-virtual {p0}, Lorg/apache/commons/cli/Option;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method getKey()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 159
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    return-object v0

    :cond_0
    return-object v0
.end method

.method public getLongOpt()Ljava/lang/String;
    .locals 1

    .line 207
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    return-object v0
.end method

.method public getOpt()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/Object;
    .locals 1

    .line 187
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->type:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 2

    .line 486
    invoke-direct {p0}, Lorg/apache/commons/cli/Option;->hasNoValues()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public getValue(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IndexOutOfBoundsException;
        }
    .end annotation

    .line 503
    invoke-direct {p0}, Lorg/apache/commons/cli/Option;->hasNoValues()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    return-object p1
.end method

.method public getValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 518
    invoke-virtual {p0}, Lorg/apache/commons/cli/Option;->getValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    return-object p1
.end method

.method public getValueSeparator()C
    .locals 1

    .line 370
    iget-char v0, p0, Lorg/apache/commons/cli/Option;->valuesep:C

    return v0
.end method

.method public getValues()[Ljava/lang/String;
    .locals 2

    .line 532
    invoke-direct {p0}, Lorg/apache/commons/cli/Option;->hasNoValues()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public getValuesList()Ljava/util/List;
    .locals 1

    .line 541
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->values:Ljava/util/List;

    return-object v0
.end method

.method public hasArg()Z
    .locals 2

    .line 256
    iget v0, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    if-gtz v0, :cond_1

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public hasArgName()Z
    .locals 1

    .line 329
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->argName:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasArgs()Z
    .locals 3

    .line 339
    iget v0, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    const/4 v2, -0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public hasLongOpt()Z
    .locals 1

    .line 246
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hasOptionalArg()Z
    .locals 1

    .line 236
    iget-boolean v0, p0, Lorg/apache/commons/cli/Option;->optionalArg:Z

    return v0
.end method

.method public hasValueSeparator()Z
    .locals 1

    .line 381
    iget-char v0, p0, Lorg/apache/commons/cli/Option;->valuesep:C

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 622
    iget-object v0, p0, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 623
    iget-object v2, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public isRequired()Z
    .locals 1

    .line 287
    iget-boolean v0, p0, Lorg/apache/commons/cli/Option;->required:Z

    return v0
.end method

.method public setArgName(Ljava/lang/String;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lorg/apache/commons/cli/Option;->argName:Ljava/lang/String;

    return-void
.end method

.method public setArgs(I)V
    .locals 0

    .line 349
    iput p1, p0, Lorg/apache/commons/cli/Option;->numberOfArgs:I

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lorg/apache/commons/cli/Option;->description:Ljava/lang/String;

    return-void
.end method

.method public setLongOpt(Ljava/lang/String;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    return-void
.end method

.method public setOptionalArg(Z)V
    .locals 0

    .line 228
    iput-boolean p1, p0, Lorg/apache/commons/cli/Option;->optionalArg:Z

    return-void
.end method

.method public setRequired(Z)V
    .locals 0

    .line 297
    iput-boolean p1, p0, Lorg/apache/commons/cli/Option;->required:Z

    return-void
.end method

.method public setType(Ljava/lang/Object;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lorg/apache/commons/cli/Option;->type:Ljava/lang/Object;

    return-void
.end method

.method public setValueSeparator(C)V
    .locals 0

    .line 360
    iput-char p1, p0, Lorg/apache/commons/cli/Option;->valuesep:C

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 551
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "[ option: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 553
    iget-object v1, p0, Lorg/apache/commons/cli/Option;->opt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 555
    iget-object v1, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, " "

    .line 557
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/commons/cli/Option;->longOpt:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    const-string v1, " "

    .line 560
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 562
    invoke-virtual {p0}, Lorg/apache/commons/cli/Option;->hasArgs()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "[ARG...]"

    .line 564
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 566
    :cond_1
    invoke-virtual {p0}, Lorg/apache/commons/cli/Option;->hasArg()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, " [ARG]"

    .line 568
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    :goto_0
    const-string v1, " :: "

    .line 571
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/commons/cli/Option;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 573
    iget-object v1, p0, Lorg/apache/commons/cli/Option;->type:Ljava/lang/Object;

    if-eqz v1, :cond_3

    const-string v1, " :: "

    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/commons/cli/Option;->type:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    :cond_3
    const-string v1, " ]"

    .line 578
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 580
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
