.class final Lo/uf$f;
.super Lo/uf;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/uf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 146
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/uf;-><init>(Lo/uf$2;)V

    return-void
.end method

.method synthetic constructor <init>(Lo/uf$2;)V
    .locals 0

    .line 146
    invoke-direct {p0}, Lo/uf$f;-><init>()V

    return-void
.end method


# virtual methods
.method c(II)Z
    .locals 3

    .line 149
    mul-int v2, p1, p2

    .line 150
    and-int/lit8 v0, v2, 0x1

    rem-int/lit8 v1, v2, 0x3

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
