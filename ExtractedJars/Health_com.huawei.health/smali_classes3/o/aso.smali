.class public Lo/aso;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 1

    .line 51
    invoke-static {p1}, Lo/boh;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/aso;->d:Ljava/lang/String;

    .line 52
    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 59
    iget-wide v0, p0, Lo/aso;->a:J

    .line 60
    return-wide v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/aso;->c:Ljava/lang/String;

    .line 46
    invoke-direct {p0, p1}, Lo/aso;->e(Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method public c()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lo/aso;->b:J

    .line 30
    return-wide v0
.end method

.method public d(J)V
    .locals 0

    .line 35
    iput-wide p1, p0, Lo/aso;->b:J

    .line 36
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Lo/aso;->d:Ljava/lang/String;

    .line 78
    return-object v0
.end method

.method public e(J)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lo/aso;->a:J

    .line 41
    return-void
.end method
