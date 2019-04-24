.class final Lo/asu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asu;->d(Lo/asu;Ljava/util/ArrayList;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/asu;

.field final synthetic d:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lo/asu;Ljava/util/ArrayList;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lo/asu$5;->c:Lo/asu;

    iput-object p2, p0, Lo/asu$5;->d:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 176
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/asu$5;->c:Lo/asu;

    iget-object v2, p0, Lo/asu$5;->d:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lo/asu;->a(Lo/asu;Ljava/util/ArrayList;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 177
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 182
    iget-object v0, p0, Lo/asu$5;->c:Lo/asu;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/asu;->c(Lo/asu;III)V

    .line 183
    const-string v0, "CreateGroupTask"

    const-string v1, "requestCreateNormalGroup onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    return-void
.end method
