.class public Lo/fsu;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fsu$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Object;


# instance fields
.field private b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/fsu$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fsu$e;-><init>(B)V

    sput-object v0, Lo/fsu;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/fsu;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lo/ftd;

    invoke-direct {v0, p1}, Lo/ftd;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lo/fsu;-><init>(Lo/ftd;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lo/fsu;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lo/ftd;)V
    .locals 5

    invoke-direct {p0}, Lo/fsu;-><init>()V

    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    const/16 v1, 0x7b

    if-eq v0, v1, :cond_0

    const-string v0, "A JSONObject text must begin with \'{\'"

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :cond_0
    :goto_0
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "A JSONObject text must end with \'}\'"

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :sswitch_1
    return-void

    :goto_1
    invoke-virtual {p1}, Lo/ftd;->d()V

    invoke-virtual {p1}, Lo/ftd;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    move v2, v0

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lo/ftd;->b()C

    move-result v0

    const/16 v1, 0x3e

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lo/ftd;->d()V

    goto :goto_2

    :cond_1
    const/16 v0, 0x3a

    if-eq v2, v0, :cond_2

    const-string v0, "Expected a \':\' after a key"

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :cond_2
    :goto_2
    invoke-virtual {p1}, Lo/ftd;->a()Ljava/lang/Object;

    move-result-object v4

    move-object v2, p0

    if-nez v3, :cond_3

    new-instance v0, Lo/fsv;

    const-string v1, "Null key."

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    if-eqz v4, :cond_4

    invoke-static {v4}, Lo/fsu;->e(Ljava/lang/Object;)V

    iget-object v0, v2, Lo/fsu;->b:Ljava/util/Map;

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    iget-object v0, v2, Lo/fsu;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_4

    :sswitch_2
    invoke-virtual {p1}, Lo/ftd;->c()C

    move-result v0

    const/16 v1, 0x7d

    if-ne v0, v1, :cond_5

    return-void

    :cond_5
    invoke-virtual {p1}, Lo/ftd;->d()V

    goto/16 :goto_0

    :sswitch_3
    return-void

    :goto_4
    const-string v0, "Expected a \',\' or \'}\'"

    invoke-virtual {p1, v0}, Lo/ftd;->c(Ljava/lang/String;)Lo/fsv;

    move-result-object v0

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x7d -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_2
        0x3b -> :sswitch_2
        0x7d -> :sswitch_3
    .end sparse-switch
.end method

.method static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "null"

    return-object v0

    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/lang/Number;

    if-nez p0, :cond_2

    new-instance v0, Lo/fsv;

    const-string v1, "Null pointer"

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p0}, Lo/fsu;->e(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_4

    const/16 v0, 0x65

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_4

    const/16 v0, 0x45

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_4

    :goto_0
    const-string v0, "0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const-string v0, "."

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_4
    return-object p0

    :cond_5
    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_6

    instance-of v0, p0, Lo/fsu;

    if-nez v0, :cond_6

    instance-of v0, p0, Lo/fsw;

    if-eqz v0, :cond_7

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_7
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_8

    new-instance v0, Lo/fsu;

    move-object v1, p0

    check-cast v1, Ljava/util/Map;

    invoke-direct {v0, v1}, Lo/fsu;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Lo/fsu;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_9

    new-instance v0, Lo/fsw;

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Lo/fsw;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Lo/fsw;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Lo/fsw;

    invoke-direct {v0, p0}, Lo/fsw;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lo/fsw;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fsu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "\"\""

    return-object v0

    :cond_1
    const/4 v4, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuffer;

    add-int/lit8 v0, v6, 0x4

    invoke-direct {v7, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    const/16 v0, 0x22

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v6, :cond_6

    move v3, v4

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move v4, v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const/16 v0, 0x5c

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    :sswitch_1
    const/16 v0, 0x3c

    if-ne v3, v0, :cond_2

    const/16 v0, 0x5c

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_2
    invoke-virtual {v7, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    :sswitch_2
    const-string v0, "\\b"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    :sswitch_3
    const-string v0, "\\t"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto/16 :goto_2

    :sswitch_4
    const-string v0, "\\n"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :sswitch_5
    const-string v0, "\\f"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :sswitch_6
    const-string v0, "\\r"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :goto_1
    const/16 v0, 0x20

    if-lt v4, v0, :cond_4

    const/16 v0, 0x80

    if-lt v4, v0, :cond_3

    const/16 v0, 0xa0

    if-lt v4, v0, :cond_4

    :cond_3
    const/16 v0, 0x2000

    if-lt v4, v0, :cond_5

    const/16 v0, 0x2100

    if-ge v4, v0, :cond_5

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "000"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\\u"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    invoke-virtual {v3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    :cond_5
    invoke-virtual {v7, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_6
    const/16 v0, 0x22

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0x9 -> :sswitch_3
        0xa -> :sswitch_4
        0xc -> :sswitch_5
        0xd -> :sswitch_6
        0x22 -> :sswitch_0
        0x2f -> :sswitch_1
        0x5c -> :sswitch_0
    .end sparse-switch
.end method

.method private static e(Ljava/lang/Object;)V
    .locals 2

    if-eqz p0, :cond_3

    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->isInfinite()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->isNaN()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    new-instance v0, Lo/fsv;

    const-string v1, "JSON does not allow non-finite numbers."

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->isInfinite()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->isNaN()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    new-instance v0, Lo/fsv;

    const-string v1, "JSON does not allow non-finite numbers."

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lo/fsu;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lo/fsu;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    move-object v4, p1

    move-object v3, p0

    if-nez v4, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v3, Lo/fsu;->b:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :goto_0
    if-nez v3, :cond_1

    new-instance v0, Lo/fsv;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lo/fsu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] not found."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fsv;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v3
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Lo/fsu;->c()Ljava/util/Iterator;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const/16 v0, 0x2c

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fsu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v0, 0x3a

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lo/fsu;->b:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/fsu;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    :cond_1
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
