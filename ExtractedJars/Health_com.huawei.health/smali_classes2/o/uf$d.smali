.class final Lo/uf$d;
.super Lo/uf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/uf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 125
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/uf;-><init>(Lo/uf$2;)V

    return-void
.end method

.method synthetic constructor <init>(Lo/uf$2;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Lo/uf$d;-><init>()V

    return-void
.end method


# virtual methods
.method c(II)Z
    .locals 2

    .line 128
    div-int/lit8 v0, p1, 0x2

    div-int/lit8 v1, p2, 0x3

    add-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method