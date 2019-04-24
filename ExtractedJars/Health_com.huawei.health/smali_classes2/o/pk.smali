.class public final Lo/pk;
.super Lo/pc;
.source "SourceFile"


# static fields
.field private static final b:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const-string v0, "[a-zA-Z0-9@.!#$%&\'*+\\-/=?^_`{|}~]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/pk;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/pc;-><init>()V

    return-void
.end method

.method static d(Ljava/lang/String;)Z
    .locals 1

    .line 61
    if-eqz p0, :cond_0

    sget-object v0, Lo/pk;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x40

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public synthetic b(Lo/or;)Lo/pr;
    .locals 1

    .line 30
    invoke-virtual {p0, p1}, Lo/pk;->c(Lo/or;)Lo/pf;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/or;)Lo/pf;
    .locals 12

    .line 36
    invoke-static {p1}, Lo/pk;->i(Lo/or;)Ljava/lang/String;

    move-result-object v6

    .line 37
    const-string v0, "MATMSG:"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_0
    const-string v0, "TO:"

    const/4 v1, 0x1

    invoke-static {v0, v6, v1}, Lo/pk;->b(Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v7

    .line 41
    if-nez v7, :cond_1

    .line 42
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_1
    move-object v8, v7

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_3

    aget-object v11, v8, v10

    .line 45
    invoke-static {v11}, Lo/pk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 44
    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 49
    :cond_3
    const-string v0, "SUB:"

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lo/pk;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 50
    const-string v0, "BODY:"

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lo/pk;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v9

    .line 51
    new-instance v0, Lo/pf;

    move-object v1, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v8

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lo/pf;-><init>([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
