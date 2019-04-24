.class final Lcom/google/c/a/a$a;
.super Lcom/google/c/a/a$m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1119
    new-instance v0, Lcom/google/c/a/a$a;

    invoke-direct {v0}, Lcom/google/c/a/a$a;-><init>()V

    sput-object v0, Lcom/google/c/a/a$a;->o:Lcom/google/c/a/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.any()"

    .line 1122
    invoke-direct {p0, v0}, Lcom/google/c/a/a$m;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public a(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 1149
    invoke-static {p1}, Lcom/google/c/a/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method
