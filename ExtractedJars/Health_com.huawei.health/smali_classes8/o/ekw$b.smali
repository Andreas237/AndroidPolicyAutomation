.class Lo/ekw$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ekw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 696
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/ekw$3;)V
    .locals 0

    .line 696
    invoke-direct {p0}, Lo/ekw$b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 4

    .line 699
    new-instance v2, Ljava/text/DecimalFormat;

    const-string v0, "#"

    invoke-direct {v2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 701
    float-to-int v0, p1

    div-int/lit8 v3, v0, 0x3c

    .line 702
    int-to-long v0, v3

    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
