.class Lo/bpz$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/net/CookiePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bpz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 87
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "/AccountServer/"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/bpz$c;->c:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bpz$4;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lo/bpz$c;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldAccept(Ljava/net/URI;Ljava/net/HttpCookie;)Z
    .locals 7

    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-virtual {p1}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v2

    .line 97
    if-eqz v2, :cond_1

    .line 99
    sget-object v3, Lo/bpz$c;->c:[Ljava/lang/String;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    .line 101
    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    const/4 v1, 0x1

    .line 104
    goto :goto_1

    .line 99
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 112
    :cond_1
    :goto_1
    if-nez v1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0
.end method
