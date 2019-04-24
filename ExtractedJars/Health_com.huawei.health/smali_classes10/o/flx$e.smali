.class public Lo/flx$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private a:Lo/fov;

.field private b:Lo/fom;

.field private c:Lo/fmw;

.field private d:Ljava/net/InetSocketAddress;

.field private e:Z

.field private f:Lo/fml;

.field private i:Lo/fmx;

.field private k:Lo/foz;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1079
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1029
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flx$e;->c:Lo/fmw;

    .line 1037
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flx$e;->d:Ljava/net/InetSocketAddress;

    .line 1045
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/flx$e;->e:Z

    .line 1052
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flx$e;->a:Lo/fov;

    .line 1058
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flx$e;->b:Lo/fom;

    .line 1064
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flx$e;->f:Lo/fml;

    .line 1070
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flx$e;->k:Lo/foz;

    .line 1080
    return-void
.end method


# virtual methods
.method public e()Lo/flx;
    .locals 8

    .line 1278
    iget-object v0, p0, Lo/flx$e;->c:Lo/fmw;

    if-nez v0, :cond_0

    .line 1279
    invoke-static {}, Lo/fmw;->a()Lo/fmw;

    move-result-object v0

    iput-object v0, p0, Lo/flx$e;->c:Lo/fmw;

    .line 1281
    :cond_0
    iget-object v0, p0, Lo/flx$e;->a:Lo/fov;

    if-nez v0, :cond_2

    .line 1282
    iget-object v0, p0, Lo/flx$e;->d:Ljava/net/InetSocketAddress;

    if-nez v0, :cond_1

    .line 1283
    new-instance v0, Ljava/net/InetSocketAddress;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/net/InetSocketAddress;-><init>(I)V

    iput-object v0, p0, Lo/flx$e;->d:Ljava/net/InetSocketAddress;

    .line 1285
    :cond_1
    new-instance v0, Lo/fpj;

    iget-object v1, p0, Lo/flx$e;->d:Ljava/net/InetSocketAddress;

    invoke-direct {v0, v1}, Lo/fpj;-><init>(Ljava/net/InetSocketAddress;)V

    iput-object v0, p0, Lo/flx$e;->a:Lo/fov;

    .line 1287
    :cond_2
    iget-object v0, p0, Lo/flx$e;->i:Lo/fmx;

    if-nez v0, :cond_3

    .line 1288
    new-instance v0, Lo/fmr;

    iget-object v1, p0, Lo/flx$e;->c:Lo/fmw;

    invoke-direct {v0, v1}, Lo/fmr;-><init>(Lo/fmw;)V

    iput-object v0, p0, Lo/flx$e;->i:Lo/fmx;

    .line 1290
    :cond_3
    iget-object v0, p0, Lo/flx$e;->b:Lo/fom;

    if-nez v0, :cond_4

    .line 1291
    new-instance v0, Lo/fon;

    invoke-direct {v0}, Lo/fon;-><init>()V

    iput-object v0, p0, Lo/flx$e;->b:Lo/fom;

    .line 1293
    :cond_4
    iget-object v0, p0, Lo/flx$e;->f:Lo/fml;

    if-nez v0, :cond_5

    .line 1294
    new-instance v0, Lo/fmj;

    iget-object v1, p0, Lo/flx$e;->c:Lo/fmw;

    iget-object v2, p0, Lo/flx$e;->i:Lo/fmx;

    invoke-direct {v0, v1, v2}, Lo/fmj;-><init>(Lo/fmw;Lo/fmx;)V

    iput-object v0, p0, Lo/flx$e;->f:Lo/fml;

    .line 1296
    :cond_5
    iget-object v0, p0, Lo/flx$e;->k:Lo/foz;

    if-nez v0, :cond_6

    .line 1297
    iget-object v0, p0, Lo/flx$e;->a:Lo/fov;

    iget-object v1, p0, Lo/flx$e;->c:Lo/fmw;

    invoke-static {v0, v1}, Lo/fme;->d(Lo/fov;Lo/fmw;)Lo/foz;

    move-result-object v0

    iput-object v0, p0, Lo/flx$e;->k:Lo/foz;

    .line 1299
    :cond_6
    new-instance v0, Lo/flx;

    iget-object v1, p0, Lo/flx$e;->a:Lo/fov;

    iget-boolean v2, p0, Lo/flx$e;->e:Z

    iget-object v3, p0, Lo/flx$e;->c:Lo/fmw;

    iget-object v4, p0, Lo/flx$e;->i:Lo/fmx;

    iget-object v5, p0, Lo/flx$e;->b:Lo/fom;

    iget-object v6, p0, Lo/flx$e;->f:Lo/fml;

    iget-object v7, p0, Lo/flx$e;->k:Lo/foz;

    invoke-direct/range {v0 .. v7}, Lo/flx;-><init>(Lo/fov;ZLo/fmw;Lo/fmx;Lo/fom;Lo/fml;Lo/foz;)V

    return-object v0
.end method
