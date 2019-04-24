.class final Lcom/google/c/a/a$h;
.super Lcom/google/c/a/a$m;
.source "IMASDK"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/c/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "h"
.end annotation


# static fields
.field static final o:Lcom/google/c/a/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1545
    new-instance v0, Lcom/google/c/a/a$h;

    invoke-direct {v0}, Lcom/google/c/a/a$h;-><init>()V

    sput-object v0, Lcom/google/c/a/a$h;->o:Lcom/google/c/a/a$h;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const-string v0, "CharMatcher.javaIsoControl()"

    .line 1548
    invoke-direct {p0, v0}, Lcom/google/c/a/a$m;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(C)Z
    .locals 1

    const/16 v0, 0x1f

    if-le p1, v0, :cond_1

    const/16 v0, 0x7f

    if-lt p1, v0, :cond_0

    const/16 v0, 0x9f

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
