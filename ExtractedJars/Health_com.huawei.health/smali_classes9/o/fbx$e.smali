.class Lo/fbx$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fbx$2;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Lo/fbx$e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 6

    .line 105
    new-instance v3, Ljava/text/DecimalFormat;

    const-string v0, "00"

    invoke-direct {v3, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 107
    float-to-int v0, p1

    div-int/lit8 v4, v0, 0x3c

    .line 108
    float-to-int v0, p1

    mul-int/lit8 v1, v4, 0x3c

    sub-int v5, v0, v1

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v4

    invoke-virtual {v3, v1, v2}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    int-to-long v1, v5

    invoke-virtual {v3, v1, v2}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
