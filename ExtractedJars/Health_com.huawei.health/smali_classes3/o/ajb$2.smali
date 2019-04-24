.class final Lo/ajb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ajb;->e(Lo/ail;Lo/aiq$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ail;

.field final synthetic c:Lo/aiq$d;


# direct methods
.method constructor <init>(Lo/ail;Lo/aiq$d;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lo/ajb$2;->b:Lo/ail;

    iput-object p2, p0, Lo/ajb$2;->c:Lo/aiq$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 263
    const/4 v4, 0x0

    .line 264
    iget-object v0, p0, Lo/ajb$2;->b:Lo/ail;

    invoke-static {v0}, Lo/ajb;->b(Lo/ail;)V

    .line 266
    :try_start_0
    invoke-static {}, Lo/ajb;->b()Lo/ajg;

    move-result-object v0

    iget-object v1, p0, Lo/ajb$2;->b:Lo/ail;

    invoke-virtual {v1}, Lo/ail;->d()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x32

    invoke-virtual {v0, v1, v2}, Lo/ajg;->d(Ljava/lang/String;I)Lo/flk;

    move-result-object v5

    .line 267
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 268
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Lo/fli;->b(Lo/flk;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lo/ajb$2;->b:Lo/ail;

    invoke-virtual {v5}, Lo/flk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ail;->e(Ljava/lang/String;)Lo/air;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 273
    :cond_0
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "post: response is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    const/4 v4, 0x0

    .line 278
    :goto_0
    goto :goto_1

    .line 276
    :catch_0
    move-exception v5

    .line 277
    const-string v0, "CoapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 280
    :goto_1
    iget-object v0, p0, Lo/ajb$2;->c:Lo/aiq$d;

    invoke-interface {v0, v4}, Lo/aiq$d;->c(Lo/air;)V

    .line 281
    return-void
.end method
