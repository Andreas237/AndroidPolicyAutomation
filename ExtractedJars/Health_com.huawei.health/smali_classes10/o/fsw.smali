.class public Lo/fsw;
.super Ljava/lang/Object;


# instance fields
.field private e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 5

    invoke-direct {p0}, Lo/fsw;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-static {p1, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    iget-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lo/fsv;

    const-string v1, "JSONArray initial value should be a string or collection or array."

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lo/ftd;

    invoke-direct {v0, p1}, Lo/ftd;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lo/fsw;-><init>(Lo/ftd;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    iput-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Lo/ftd;)V
    .locals 4

    invoke-direct {p0}, Lo/fsw;-><init>()V

    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    move v2, v0

    const/16 v1, 0x5b

    if-ne v0, v1, :cond_0

    const/16 v3, 0x5d

    goto :goto_0

    :cond_0
    const/16 v0, 0x28

    if-ne v2, v0, :cond_1

    const/16 v3, 0x29

    goto :goto_0

    :cond_1
    const-string v0, "A JSONArray text must start with \'[\'"

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :goto_0
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    const/16 v1, 0x5d

    if-ne v0, v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Lo/ftd;->d()V

    :goto_1
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    const/16 v1, 0x2c

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lo/ftd;->d()V

    iget-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lo/ftd;->d()V

    iget-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lo/ftd;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    move v2, v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    const/16 v1, 0x5d

    if-ne v0, v1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1}, Lo/ftd;->d()V

    goto :goto_1

    :sswitch_1
    if-eq v3, v2, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected a \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/Character;

    invoke-direct {v1, v3}, Ljava/lang/Character;-><init>(C)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :cond_5
    return-void

    :goto_3
    const-string v0, "Expected a \',\' or \']\'"

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x29 -> :sswitch_1
        0x2c -> :sswitch_0
        0x3b -> :sswitch_0
        0x5d -> :sswitch_1
    .end sparse-switch
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    if-lez v3, :cond_0

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    iget-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/fsu;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget-object v0, p0, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 4

    move-object v3, p0

    if-ltz p1, :cond_0

    iget-object v0, v3, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, v3, Lo/fsw;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_2

    new-instance v0, Lo/fsv;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONArray["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] not found."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ","

    invoke-direct {p0, v1}, Lo/fsw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
