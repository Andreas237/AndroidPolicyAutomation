.class public Lo/dnk;
.super Lo/dno;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private d:D


# direct methods
.method constructor <init>(ILjava/lang/String;)V
    .locals 2

    .line 12
    invoke-direct {p0}, Lo/dno;-><init>()V

    .line 13
    int-to-double v0, p1

    iput-wide v0, p0, Lo/dnk;->d:D

    .line 14
    iput-object p2, p0, Lo/dnk;->a:Ljava/lang/String;

    .line 15
    return-void
.end method


# virtual methods
.method a(D)Ljava/lang/String;
    .locals 2

    .line 20
    iget-wide v0, p0, Lo/dnk;->d:D

    cmpl-double v0, p1, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/dnk;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
