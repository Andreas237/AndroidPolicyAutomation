.class final Lo/ajb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ajb;->c(Lo/ail;Lo/aiq$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ail;

.field final synthetic c:Lo/aiq$d;


# direct methods
.method constructor <init>(Lo/ail;Lo/aiq$d;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lo/ajb$3;->a:Lo/ail;

    iput-object p2, p0, Lo/ajb$3;->c:Lo/aiq$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 296
    const/4 v4, 0x0

    .line 297
    iget-object v0, p0, Lo/ajb$3;->a:Lo/ail;

    invoke-static {v0}, Lo/ajb;->b(Lo/ail;)V

    .line 298
    invoke-static {}, Lo/ajb;->b()Lo/ajg;

    move-result-object v0

    iget-object v1, p0, Lo/ajb$3;->a:Lo/ail;

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Lo/ajg;->a(Lo/ail;I)Lo/aji;

    move-result-object v5

    .line 299
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 301
    const-string v0, "CoapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "post: getResponseText "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lo/aji;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget-object v0, p0, Lo/ajb$3;->a:Lo/ail;

    invoke-virtual {v5}, Lo/aji;->c()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ail;->a([B)Lo/air;

    move-result-object v4

    goto :goto_0

    .line 314
    :cond_0
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "post: response is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 315
    const/4 v4, 0x0

    .line 318
    :goto_0
    iget-object v0, p0, Lo/ajb$3;->c:Lo/aiq$d;

    invoke-interface {v0, v4}, Lo/aiq$d;->c(Lo/air;)V

    .line 319
    return-void
.end method
