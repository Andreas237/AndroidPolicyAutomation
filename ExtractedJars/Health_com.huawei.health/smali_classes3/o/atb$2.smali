.class Lo/atb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atb;->d(IJZ)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo/atb;

.field final synthetic d:Z

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/atb;JIZ)V
    .locals 0

    .line 239
    iput-object p1, p0, Lo/atb$2;->b:Lo/atb;

    iput-wide p2, p0, Lo/atb$2;->a:J

    iput p4, p0, Lo/atb$2;->e:I

    iput-boolean p5, p0, Lo/atb$2;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 243
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/atb$2$5;

    invoke-direct {v1, p0}, Lo/atb$2$5;-><init>(Lo/atb$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 252
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 257
    if-eqz p1, :cond_0

    .line 259
    iget-object v0, p0, Lo/atb$2;->b:Lo/atb;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atb;->c(Lo/atb;III)V

    .line 261
    :cond_0
    return-void
.end method
