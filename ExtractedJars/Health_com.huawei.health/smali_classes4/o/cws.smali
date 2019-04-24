.class Lo/cws;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string v0, "context must not be null."

    invoke-static {p1, v0}, Lo/cwq;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    iput-object p1, p0, Lo/cws;->e:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)Z
    .locals 7

    .line 37
    if-nez p1, :cond_0

    .line 38
    const/4 v0, 0x0

    return v0

    .line 42
    :cond_0
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, ""

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 44
    if-eqz v2, :cond_2

    .line 45
    move-object v3, v2

    array-length v4, v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 46
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    const/4 v0, 0x1

    return v0

    .line 45
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 52
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
