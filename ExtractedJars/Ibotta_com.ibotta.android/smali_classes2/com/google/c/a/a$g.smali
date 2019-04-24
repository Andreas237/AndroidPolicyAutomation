.class final Lcom/google/c/a/a$g;
.super Lcom/google/c/a/a;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1465
    new-instance v0, Lcom/google/c/a/a$g;

    invoke-direct {v0}, Lcom/google/c/a/a$g;-><init>()V

    sput-object v0, Lcom/google/c/a/a$g;->o:Lcom/google/c/a/a$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1463
    invoke-direct {p0}, Lcom/google/c/a/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 0

    .line 1469
    invoke-static {p1}, Ljava/lang/Character;->isDigit(C)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "CharMatcher.javaDigit()"

    return-object v0
.end method
