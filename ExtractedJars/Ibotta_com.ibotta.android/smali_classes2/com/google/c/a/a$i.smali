.class final Lcom/google/c/a/a$i;
.super Lcom/google/c/a/a;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1481
    new-instance v0, Lcom/google/c/a/a$i;

    invoke-direct {v0}, Lcom/google/c/a/a$i;-><init>()V

    sput-object v0, Lcom/google/c/a/a$i;->o:Lcom/google/c/a/a$i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1479
    invoke-direct {p0}, Lcom/google/c/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 0

    .line 1485
    invoke-static {p1}, Ljava/lang/Character;->isLetter(C)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CharMatcher.javaLetter()"

    return-object v0
.end method
