.class final Lo/atm$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atm;->d(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Lo/atm;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lo/atm$2;->d:Lo/atm;

    iput-object p2, p0, Lo/atm$2;->c:Ljava/util/ArrayList;

    iput-object p3, p0, Lo/atm$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 187
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/atm$2;->d:Lo/atm;

    iget-object v2, p0, Lo/atm$2;->c:Ljava/util/ArrayList;

    iget-object v3, p0, Lo/atm$2;->e:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lo/atm;->e(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 188
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 193
    iget-object v0, p0, Lo/atm$2;->d:Lo/atm;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atm;->d(Lo/atm;III)V

    .line 194
    const-string v0, "CreateGroupTask"

    const-string v1, "requestCreateNormalGroup onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    return-void
.end method
