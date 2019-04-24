.class final Lcom/google/c/a/a$b;
.super Lcom/google/c/a/a$m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1385
    new-instance v0, Lcom/google/c/a/a$b;

    invoke-direct {v0}, Lcom/google/c/a/a$b;-><init>()V

    sput-object v0, Lcom/google/c/a/a$b;->o:Lcom/google/c/a/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.ascii()"

    .line 1388
    invoke-direct {p0, v0}, Lcom/google/c/a/a$m;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 1

    const/16 v0, 0x7f

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
