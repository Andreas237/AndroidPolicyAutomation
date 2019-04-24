.class final Lcom/google/c/a/g;
.super Ljava/lang/Object;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/c/a/g$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field private static final b:Lcom/google/c/a/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const-class v0, Lcom/google/c/a/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/c/a/g;->a:Ljava/util/logging/Logger;

    .line 34
    invoke-static {}, Lcom/google/c/a/g;->a()Lcom/google/c/a/f;

    move-result-object v0

    sput-object v0, Lcom/google/c/a/g;->b:Lcom/google/c/a/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Lcom/google/c/a/f;
    .locals 2

    .line 77
    new-instance v0, Lcom/google/c/a/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/c/a/g$a;-><init>(Lcom/google/c/a/g$1;)V

    return-object v0
.end method

.method static a(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

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
