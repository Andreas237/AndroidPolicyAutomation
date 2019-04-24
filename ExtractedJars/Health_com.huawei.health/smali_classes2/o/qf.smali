.class public final Lo/qf;
.super Lo/pr;
.source "SourceFile"


# static fields
.field private static final d:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-string v0, ":/*([^/@]+)@[^/]+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lo/qf;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 32
    sget-object v0, Lo/ps;->c:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 33
    invoke-static {p1}, Lo/qf;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/qf;->a:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lo/qf;->e:Ljava/lang/String;

    .line 35
    return-void
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 70
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 71
    const/16 v0, 0x3a

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 72
    if-ltz v2, :cond_0

    invoke-static {p0, v2}, Lo/qf;->c(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 77
    :cond_1
    return-object p0
.end method

.method private static c(Ljava/lang/String;I)Z
    .locals 3

    .line 81
    add-int/lit8 v1, p1, 0x1

    .line 82
    const/16 v0, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 83
    if-gez v2, :cond_0

    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 86
    :cond_0
    sub-int v0, v2, v1

    invoke-static {p0, v1, v0}, Lo/pw;->a(Ljava/lang/CharSequence;II)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x1e

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 60
    iget-object v0, p0, Lo/qf;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/qf;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 61
    iget-object v0, p0, Lo/qf;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/qf;->c(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
