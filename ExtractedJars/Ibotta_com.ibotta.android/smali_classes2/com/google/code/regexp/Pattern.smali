.class public Lcom/google/code/regexp/Pattern;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final BACKREF_NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

.field public static final CANON_EQ:I = 0x80

.field public static final CASE_INSENSITIVE:I = 0x2

.field public static final COMMENTS:I = 0x4

.field public static final DOTALL:I = 0x20

.field private static final INDEX_GROUP_NAME:I = 0x1

.field public static final LITERAL:I = 0x10

.field public static final MULTILINE:I = 0x8

.field private static final NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

.field private static final NAME_PATTERN:Ljava/lang/String; = "[^!=].*?"

.field private static final PROPERTY_PATTERN:Ljava/util/regex/Pattern;

.field public static final UNICODE_CASE:I = 0x40

.field public static final UNIX_LINES:I = 0x1

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private groupInfo:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/code/regexp/GroupInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field private groupNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private namedPattern:Ljava/lang/String;

.field private pattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\\(\\?<([^!=].*?)>"

    const/16 v1, 0x20

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/code/regexp/Pattern;->NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

    const-string v0, "\\\\k<([^!=].*?)>"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/code/regexp/Pattern;->BACKREF_NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

    const-string v0, "\\$\\{([^!=].*?)\\}"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/code/regexp/Pattern;->PROPERTY_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/code/regexp/Pattern;->namedPattern:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/code/regexp/Pattern;->extractGroupInfo(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/google/code/regexp/Pattern;->buildStandardPattern(Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/regex/Pattern;

    move-result-object p1

    iput-object p1, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method private buildStandardPattern(Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/regex/Pattern;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/google/code/regexp/Pattern;->NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

    const-string v1, "("

    invoke-static {v0, p1, v1}, Lcom/google/code/regexp/Pattern;->replace(Ljava/lang/StringBuilder;Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    sget-object v0, Lcom/google/code/regexp/Pattern;->BACKREF_NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

    const-string v1, "\\"

    invoke-direct {p0, p1, v0, v1}, Lcom/google/code/regexp/Pattern;->replaceGroupNameWithIndex(Ljava/lang/StringBuilder;Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    return-object p1
.end method

.method public static compile(Ljava/lang/String;)Lcom/google/code/regexp/Pattern;
    .locals 2

    new-instance v0, Lcom/google/code/regexp/Pattern;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/code/regexp/Pattern;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static compile(Ljava/lang/String;I)Lcom/google/code/regexp/Pattern;
    .locals 1

    new-instance v0, Lcom/google/code/regexp/Pattern;

    invoke-direct {v0, p0, p1}, Lcom/google/code/regexp/Pattern;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method private static countOpenParens(Ljava/lang/String;I)I
    .locals 2

    const-string v0, "\\("

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    invoke-static {p0, v0}, Lcom/google/code/regexp/Pattern;->isInsideCharClass(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    invoke-static {p0, v0}, Lcom/google/code/regexp/Pattern;->isEscapedChar(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    invoke-static {p0, v0}, Lcom/google/code/regexp/Pattern;->isNoncapturingParen(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static extractGroupInfo(Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/code/regexp/GroupInfo;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v1, Lcom/google/code/regexp/Pattern;->NAMED_GROUP_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I

    move-result v2

    invoke-static {p0, v2}, Lcom/google/code/regexp/Pattern;->isEscapedChar(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v2}, Lcom/google/code/regexp/Pattern;->countOpenParens(Ljava/lang/String;I)I

    move-result v4

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    goto :goto_1

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    new-instance v6, Lcom/google/code/regexp/GroupInfo;

    invoke-direct {v6, v4, v2}, Lcom/google/code/regexp/GroupInfo;-><init>(II)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private groupInfoMatches(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/code/regexp/GroupInfo;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/code/regexp/GroupInfo;",
            ">;>;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v3

    if-ne v2, v3, :cond_6

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_4

    move v2, v4

    goto :goto_2

    :cond_4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_2

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :cond_7
    :goto_2
    return v2
.end method

.method private static isEscapedChar(Ljava/lang/String;I)Z
    .locals 1

    invoke-static {p0, p1}, Lcom/google/code/regexp/Pattern;->isSlashEscapedChar(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, Lcom/google/code/regexp/Pattern;->isQuoteEscapedChar(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static isInsideCharClass(Ljava/lang/String;I)Z
    .locals 6

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    move v2, p1

    :cond_0
    const/16 v3, 0x5b

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    invoke-static {v1, v2}, Lcom/google/code/regexp/Pattern;->isEscapedChar(Ljava/lang/String;I)Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p0, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/4 p1, -0x1

    :cond_2
    const/16 v2, 0x5d

    add-int/2addr p1, v4

    invoke-virtual {p0, v2, p1}, Ljava/lang/String;->indexOf(II)I

    move-result p1

    if-eq p1, v3, :cond_3

    invoke-static {p0, p1}, Lcom/google/code/regexp/Pattern;->isEscapedChar(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    :goto_1
    if-eqz v1, :cond_4

    if-nez p0, :cond_4

    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method private static isNoncapturingParen(Ljava/lang/String;I)Z
    .locals 5

    add-int/lit8 v0, p1, 0x4

    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(?<="

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    const-string v1, "(?<!"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    add-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x3f

    if-ne v1, v4, :cond_3

    if-nez v0, :cond_2

    add-int/lit8 p1, p1, 0x2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 p1, 0x3c

    if-eq p0, p1, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method private static isQuoteEscapedChar(Ljava/lang/String;I)Z
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_0
    const-string v1, "\\Q"

    const/4 v2, 0x1

    sub-int/2addr p1, v2

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    invoke-static {p0, p1}, Lcom/google/code/regexp/Pattern;->isSlashEscapedChar(Ljava/lang/String;I)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    const-string v4, "\\E"

    invoke-virtual {p0, v4, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    if-eq p0, v1, :cond_2

    const/4 p0, 0x1

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    if-eqz v3, :cond_3

    if-nez p0, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method private static isSlashEscapedChar(Ljava/lang/String;I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-lez p1, :cond_0

    add-int/lit8 v2, p1, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_0

    add-int/lit8 p1, p1, -0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private static replace(Ljava/lang/StringBuilder;Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 2

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/code/regexp/Pattern;->isEscapedChar(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    move-result v1

    invoke-virtual {p0, v0, v1, p2}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private replaceGroupNameWithIndex(Ljava/lang/StringBuilder;Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 4

    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    :goto_0
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/code/regexp/Pattern;->isEscapedChar(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/code/regexp/Pattern;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->start()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->end()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v2, v1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    goto :goto_0

    :cond_1
    new-instance p3, Ljava/util/regex/PatternSyntaxException;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->start(I)I

    move-result p2

    const-string v0, "unknown group name"

    invoke-direct {p3, v0, p1, p2}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw p3

    :cond_2
    return-object p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lcom/google/code/regexp/Pattern;

    if-nez v2, :cond_2

    return v1

    :cond_2
    check-cast p1, Lcom/google/code/regexp/Pattern;

    iget-object v2, p0, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    if-nez v2, :cond_3

    iget-object v2, p1, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    if-eqz v2, :cond_4

    :cond_3
    iget-object v2, p0, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    if-eqz v2, :cond_5

    iget-object v3, p1, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    invoke-static {v2, v3}, Ljava/util/Collections;->disjoint(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_5

    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_6

    iget-object v3, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    iget-object v4, p1, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    invoke-direct {p0, v3, v4}, Lcom/google/code/regexp/Pattern;->groupInfoMatches(Ljava/util/Map;Ljava/util/Map;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    goto :goto_1

    :cond_6
    const/4 v3, 0x0

    :goto_1
    if-eqz v2, :cond_7

    if-eqz v3, :cond_7

    iget-object v2, p0, Lcom/google/code/regexp/Pattern;->namedPattern:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/code/regexp/Pattern;->namedPattern:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v2}, Ljava/util/regex/Pattern;->flags()I

    move-result v2

    iget-object p1, p1, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {p1}, Ljava/util/regex/Pattern;->flags()I

    move-result p1

    if-ne v2, p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public flags()I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->flags()I

    move-result v0

    return v0
.end method

.method public groupInfo()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/code/regexp/GroupInfo;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public groupNames()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->namedPattern:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    :cond_0
    iget-object v1, p0, Lcom/google/code/regexp/Pattern;->groupNames:Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public indexOf(Ljava/lang/String;)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/code/regexp/Pattern;->indexOf(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public indexOf(Ljava/lang/String;I)I
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->groupInfo:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/code/regexp/GroupInfo;

    invoke-virtual {p1}, Lcom/google/code/regexp/GroupInfo;->groupIndex()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public matcher(Ljava/lang/CharSequence;)Lcom/google/code/regexp/Matcher;
    .locals 1

    new-instance v0, Lcom/google/code/regexp/Matcher;

    invoke-direct {v0, p0, p1}, Lcom/google/code/regexp/Matcher;-><init>(Lcom/google/code/regexp/Pattern;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public namedPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->namedPattern:Ljava/lang/String;

    return-object v0
.end method

.method public pattern()Ljava/util/regex/Pattern;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    return-object v0
.end method

.method public replaceProperties(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p1, Lcom/google/code/regexp/Pattern;->PROPERTY_PATTERN:Ljava/util/regex/Pattern;

    const-string v1, "$"

    invoke-direct {p0, v0, p1, v1}, Lcom/google/code/regexp/Pattern;->replaceGroupNameWithIndex(Ljava/lang/StringBuilder;Ljava/util/regex/Pattern;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public split(Ljava/lang/CharSequence;)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public split(Ljava/lang/CharSequence;I)[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1, p2}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;I)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public standardPattern()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/code/regexp/Pattern;->namedPattern:Ljava/lang/String;

    return-object v0
.end method
