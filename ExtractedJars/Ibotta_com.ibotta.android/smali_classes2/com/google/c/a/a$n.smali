.class final Lcom/google/c/a/a$n;
.super Lcom/google/c/a/a$m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "n"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1216
    new-instance v0, Lcom/google/c/a/a$n;

    invoke-direct {v0}, Lcom/google/c/a/a$n;-><init>()V

    sput-object v0, Lcom/google/c/a/a$n;->o:Lcom/google/c/a/a$n;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.none()"

    .line 1219
    invoke-direct {p0, v0}, Lcom/google/c/a/a$m;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1248
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
