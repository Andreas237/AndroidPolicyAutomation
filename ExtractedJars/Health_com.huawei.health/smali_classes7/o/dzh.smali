.class public Lo/dzh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:D

.field private c:J

.field private d:D

.field private e:D

.field private f:D

.field private h:I

.field private i:Ljava/lang/String;

.field private k:I


# direct methods
.method public constructor <init>(Lo/dwd;)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Lo/dwd;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->a:J

    .line 26
    invoke-virtual {p1}, Lo/dwd;->n()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->c:J

    .line 27
    invoke-virtual {p1}, Lo/dwd;->d()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->e:D

    .line 28
    invoke-virtual {p1}, Lo/dwd;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->d:D

    .line 29
    invoke-virtual {p1}, Lo/dwd;->e()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->b:D

    .line 30
    invoke-virtual {p1}, Lo/dwd;->b()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->f:D

    .line 31
    invoke-virtual {p1}, Lo/dwd;->k()I

    move-result v0

    iput v0, p0, Lo/dzh;->k:I

    .line 32
    invoke-virtual {p1}, Lo/dwd;->g()I

    move-result v0

    iput v0, p0, Lo/dzh;->h:I

    .line 33
    invoke-virtual {p1}, Lo/dwd;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dzh;->i:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public constructor <init>(Lo/dwh;)V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Lo/dwh;->o()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->a:J

    .line 38
    invoke-virtual {p1}, Lo/dwh;->l()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->c:J

    .line 39
    invoke-virtual {p1}, Lo/dwh;->a()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->e:D

    .line 40
    invoke-virtual {p1}, Lo/dwh;->c()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->d:D

    .line 41
    invoke-virtual {p1}, Lo/dwh;->h()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->b:D

    .line 42
    invoke-virtual {p1}, Lo/dwh;->d()D

    move-result-wide v0

    iput-wide v0, p0, Lo/dzh;->f:D

    .line 43
    invoke-virtual {p1}, Lo/dwh;->e()I

    move-result v0

    iput v0, p0, Lo/dzh;->k:I

    .line 44
    invoke-virtual {p1}, Lo/dwh;->k()I

    move-result v0

    iput v0, p0, Lo/dzh;->h:I

    .line 45
    invoke-virtual {p1}, Lo/dwh;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dzh;->i:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lo/dzh;->i:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 85
    iget v0, p0, Lo/dzh;->k:I

    return v0
.end method
