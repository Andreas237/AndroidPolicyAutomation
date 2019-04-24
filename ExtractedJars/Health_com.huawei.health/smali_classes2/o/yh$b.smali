.class Lo/yh$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/yh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field final synthetic c:Lo/yh;


# direct methods
.method public constructor <init>(Lo/yh;Landroid/content/Context;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lo/yh$b;->c:Lo/yh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p2, p0, Lo/yh$b;->b:Landroid/content/Context;

    .line 65
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 70
    iget-object v0, p0, Lo/yh$b;->c:Lo/yh;

    invoke-static {v0}, Lo/yh;->c(Lo/yh;)Lo/dct;

    iget-object v0, p0, Lo/yh$b;->b:Landroid/content/Context;

    const-string v1, "TimestampListener"

    const-string v2, "timestamp"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 71
    return-void
.end method
