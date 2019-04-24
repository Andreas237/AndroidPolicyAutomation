.class public Lo/ckj;
.super Ljava/lang/Object;

# interfaces
.implements Lo/ckn;


# instance fields
.field private a:Lo/cke;


# direct methods
.method public constructor <init>(Lo/cke;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/ckj;->a:Lo/cke;

    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 1

    iget-object v0, p0, Lo/ckj;->a:Lo/cke;

    invoke-virtual {v0}, Lo/cke;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lo/cjn;->d(Ljava/lang/String;J)Z

    move-result v0

    return v0
.end method

.method public d(Ljava/lang/String;)Lo/cke;
    .locals 2

    new-instance v1, Lo/cke;

    invoke-direct {v1}, Lo/cke;-><init>()V

    iget-object v0, p0, Lo/ckj;->a:Lo/cke;

    invoke-virtual {v0, v1}, Lo/cke;->b(Lo/ckc;)V

    return-object v1
.end method
