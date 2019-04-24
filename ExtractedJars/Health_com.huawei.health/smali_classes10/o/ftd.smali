.class public final Lo/ftd;
.super Ljava/lang/Object;


# instance fields
.field private a:Z

.field private b:Ljava/io/Reader;

.field private d:I

.field private e:C


# direct methods
.method private constructor <init>(Ljava/io/Reader;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/io/Reader;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    iput-object v0, p0, Lo/ftd;->b:Ljava/io/Reader;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ftd;->a:Z

    const/4 v0, 0x0

    iput v0, p0, Lo/ftd;->d:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lo/ftd;-><init>(Ljava/io/Reader;)V

    return-void
.end method

.method private c(I)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    new-array v2, p1, [C

    const/4 v3, 0x0

    iget-boolean v0, p0, Lo/ftd;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ftd;->a:Z

    iget-char v0, p0, Lo/ftd;->e:C

    const/4 v1, 0x0

    aput-char v0, v2, v1

    const/4 v3, 0x1

    :cond_1
    :goto_0
    if-ge v3, p1, :cond_2

    :try_start_0
    iget-object v0, p0, Lo/ftd;->b:Ljava/io/Reader;

    sub-int v1, p1, v3

    invoke-virtual {v0, v2, v3, v1}, Ljava/io/Reader;->read([CII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    add-int/2addr v3, v4

    goto :goto_0

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v4

    new-instance v0, Lo/fsv;

    invoke-direct {v0, v4}, Lo/fsv;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    iget v0, p0, Lo/ftd;->d:I

    add-int/2addr v0, v3

    iput v0, p0, Lo/ftd;->d:I

    if-ge v3, p1, :cond_3

    const-string v0, "Substring bounds error"

    invoke-virtual {p0, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :cond_3
    add-int/lit8 v0, p1, -0x1

    aget-char v0, v2, v0

    iput-char v0, p0, Lo/ftd;->e:C

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 7

    invoke-virtual {p0}, Lo/ftd;->c()C

    move-result v0

    move v3, v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    move v4, v3

    move-object v3, p0

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    :goto_0
    invoke-virtual {v3}, Lo/ftd;->b()C

    move-result v0

    move v5, v0

    sparse-switch v0, :sswitch_data_1

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "Unterminated string"

    invoke-virtual {v3, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :sswitch_2
    invoke-virtual {v3}, Lo/ftd;->b()C

    move-result v0

    move v5, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :pswitch_1
    const/16 v0, 0x9

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :pswitch_2
    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :pswitch_3
    const/16 v0, 0xc

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :pswitch_4
    const/16 v0, 0xd

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :pswitch_5
    const/4 v0, 0x4

    invoke-direct {v3, v0}, Lo/ftd;->c(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :pswitch_6
    const/4 v0, 0x2

    invoke-direct {v3, v0}, Lo/ftd;->c(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-char v0, v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :goto_1
    :pswitch_7
    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :goto_2
    if-ne v5, v4, :cond_0

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_0

    :sswitch_3
    invoke-virtual {p0}, Lo/ftd;->d()V

    new-instance v0, Lo/fsu;

    invoke-direct {v0, p0}, Lo/fsu;-><init>(Lo/ftd;)V

    return-object v0

    :sswitch_4
    invoke-virtual {p0}, Lo/ftd;->d()V

    new-instance v0, Lo/fsw;

    invoke-direct {v0, p0}, Lo/fsw;-><init>(Lo/ftd;)V

    return-object v0

    :goto_3
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    move v5, v3

    :goto_4
    const/16 v0, 0x20

    if-lt v3, v0, :cond_1

    const-string v0, ",:]}/\\\"[{;=#"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_1

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v3

    goto :goto_4

    :cond_1
    invoke-virtual {p0}, Lo/ftd;->d()V

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const-string v0, ""

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Missing value"

    invoke-virtual {p0, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :cond_2
    const-string v0, "true"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_3
    const-string v0, "false"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_4
    const-string v0, "null"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lo/fsu;->a:Ljava/lang/Object;

    return-object v0

    :cond_5
    const/16 v0, 0x30

    if-lt v5, v0, :cond_6

    const/16 v0, 0x39

    if-le v5, v0, :cond_7

    :cond_6
    const/16 v0, 0x2e

    if-eq v5, v0, :cond_7

    const/16 v0, 0x2d

    if-eq v5, v0, :cond_7

    const/16 v0, 0x2b

    if-ne v5, v0, :cond_b

    :cond_7
    const/16 v0, 0x30

    if-ne v5, v0, :cond_a

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_9

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x78

    if-eq v0, v1, :cond_8

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x58

    if-ne v0, v1, :cond_9

    :cond_8
    :try_start_0
    new-instance v0, Ljava/lang/Integer;

    const/4 v1, 0x2

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    goto :goto_5

    :cond_9
    :try_start_1
    new-instance v0, Ljava/lang/Integer;

    const/16 v1, 0x8

    invoke-static {v3, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    :cond_a
    :goto_5
    :try_start_2
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, v3}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    :try_start_3
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, v3}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    :catch_3
    :try_start_4
    new-instance v0, Ljava/lang/Double;

    invoke-direct {v0, v3}, Ljava/lang/Double;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    return-object v0

    :catch_4
    return-object v3

    :cond_b
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_0
        0x27 -> :sswitch_0
        0x28 -> :sswitch_4
        0x5b -> :sswitch_4
        0x7b -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_1
        0xa -> :sswitch_1
        0xd -> :sswitch_1
        0x5c -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x62
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_1
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public final b()C
    .locals 3

    iget-boolean v0, p0, Lo/ftd;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ftd;->a:Z

    iget-char v0, p0, Lo/ftd;->e:C

    if-eqz v0, :cond_0

    iget v0, p0, Lo/ftd;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ftd;->d:I

    :cond_0
    iget-char v0, p0, Lo/ftd;->e:C

    return v0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/ftd;->b:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->read()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    goto :goto_0

    :catch_0
    move-exception v2

    new-instance v0, Lo/fsv;

    invoke-direct {v0, v2}, Lo/fsv;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :goto_0
    if-gtz v2, :cond_2

    const/4 v0, 0x0

    iput-char v0, p0, Lo/ftd;->e:C

    const/4 v0, 0x0

    return v0

    :cond_2
    iget v0, p0, Lo/ftd;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ftd;->d:I

    int-to-char v0, v2

    iput-char v0, p0, Lo/ftd;->e:C

    iget-char v0, p0, Lo/ftd;->e:C

    return v0
.end method

.method public final c()C
    .locals 3

    :goto_0
    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v0

    move v2, v0

    const/16 v1, 0x2f

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    :cond_0
    :sswitch_0
    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v0

    move v2, v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_7

    const/16 v0, 0xd

    if-eq v2, v0, :cond_7

    if-nez v2, :cond_0

    goto :goto_0

    :cond_1
    :goto_1
    :sswitch_1
    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v0

    move v2, v0

    if-nez v0, :cond_2

    const-string v0, "Unclosed comment"

    invoke-virtual {p0, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :cond_2
    const/16 v0, 0x2a

    if-ne v2, v0, :cond_1

    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v0

    const/16 v1, 0x2f

    if-eq v0, v1, :cond_7

    invoke-virtual {p0}, Lo/ftd;->d()V

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lo/ftd;->d()V

    const/16 v0, 0x2f

    return v0

    :cond_3
    const/16 v0, 0x23

    if-ne v2, v0, :cond_5

    :cond_4
    invoke-virtual {p0}, Lo/ftd;->b()C

    move-result v0

    move v2, v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_7

    const/16 v0, 0xd

    if-eq v2, v0, :cond_7

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_5
    if-eqz v2, :cond_6

    const/16 v0, 0x20

    if-le v2, v0, :cond_7

    :cond_6
    return v2

    :cond_7
    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2a -> :sswitch_1
        0x2f -> :sswitch_0
    .end sparse-switch
.end method

.method public final c(Ljava/lang/String;)Lo/fsv;
    .locals 3

    new-instance v0, Lo/fsv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lo/ftd;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()V
    .locals 2

    iget-boolean v0, p0, Lo/ftd;->a:Z

    if-nez v0, :cond_0

    iget v0, p0, Lo/ftd;->d:I

    if-gtz v0, :cond_1

    :cond_0
    new-instance v0, Lo/fsv;

    const-string v1, "Stepping back two steps is not supported"

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lo/ftd;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/ftd;->d:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ftd;->a:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " at character "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lo/ftd;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
