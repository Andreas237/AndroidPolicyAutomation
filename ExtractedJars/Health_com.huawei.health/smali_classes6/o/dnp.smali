.class public Lo/dnp;
.super Lo/dno;
.source "SourceFile"


# instance fields
.field private b:D

.field private c:Ljava/lang/String;

.field private e:D


# direct methods
.method constructor <init>(DDLjava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/dno;-><init>()V

    .line 17
    iput-wide p1, p0, Lo/dnp;->e:D

    .line 18
    iput-wide p3, p0, Lo/dnp;->b:D

    .line 19
    iput-object p5, p0, Lo/dnp;->c:Ljava/lang/String;

    .line 20
    return-void
.end method


# virtual methods
.method a(D)Ljava/lang/String;
    .locals 2

    .line 24
    iget-wide v0, p0, Lo/dnp;->e:D

    cmpg-double v0, v0, p1

    if-gez v0, :cond_0

    iget-wide v0, p0, Lo/dnp;->b:D

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lo/dnp;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
