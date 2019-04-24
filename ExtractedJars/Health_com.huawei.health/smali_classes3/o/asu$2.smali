.class final Lo/asu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asu;->b(Lo/asu;Landroid/content/Context;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lo/asu;


# direct methods
.method constructor <init>(Lo/asu;Landroid/content/Context;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/asu$2;->e:Lo/asu;

    iput-object p2, p0, Lo/asu$2;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 252
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/asu$2;->e:Lo/asu;

    iget-object v2, p0, Lo/asu$2;->c:Landroid/content/Context;

    invoke-static {v1, v2}, Lo/asu;->e(Lo/asu;Landroid/content/Context;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 253
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 258
    iget-object v0, p0, Lo/asu$2;->e:Lo/asu;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/asu;->c(Lo/asu;III)V

    .line 259
    const-string v0, "CreateGroupTask"

    const-string v1, "createFamilyGroup onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    return-void
.end method
