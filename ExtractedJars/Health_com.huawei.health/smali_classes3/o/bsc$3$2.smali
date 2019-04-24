.class Lo/bsc$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bsg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsc$3;->intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bsc$3;


# direct methods
.method constructor <init>(Lo/bsc$3;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lo/bsc$3$2;->d:Lo/bsc$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(JJZ)V
    .locals 7

    .line 461
    iget-object v0, p0, Lo/bsc$3$2;->d:Lo/bsc$3;

    iget-object v0, v0, Lo/bsc$3;->b:Lo/bsc;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    iget-object v6, p0, Lo/bsc$3$2;->d:Lo/bsc$3;

    iget-object v6, v6, Lo/bsc$3;->a:Lo/bsf;

    invoke-static/range {v0 .. v6}, Lo/bsc;->a(Lo/bsc;JJZLo/bsf;)V

    .line 462
    return-void
.end method
