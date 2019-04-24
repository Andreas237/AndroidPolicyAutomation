.class Lo/fkh$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lo/fkh;


# direct methods
.method private constructor <init>(Lo/fkh;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lo/fkh$e;->e:Lo/fkh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/fkh;Lo/fkh$5;)V
    .locals 0

    .line 163
    invoke-direct {p0, p1}, Lo/fkh$e;-><init>(Lo/fkh;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 166
    iget-object v0, p0, Lo/fkh$e;->e:Lo/fkh;

    invoke-static {v0}, Lo/fkh;->b(Lo/fkh;)Lo/cmj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lo/fkh$e;->e:Lo/fkh;

    invoke-static {v0}, Lo/fkh;->b(Lo/fkh;)Lo/cmj;

    move-result-object v0

    iget-object v1, p0, Lo/fkh$e;->e:Lo/fkh;

    invoke-static {v1}, Lo/fkh;->d(Lo/fkh;)Lo/cmo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cmj;->b(Lo/cmo;)Z

    .line 169
    :cond_0
    return-void
.end method
