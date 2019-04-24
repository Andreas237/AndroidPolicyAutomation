.class final Lo/axc$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axc;->e(Lo/axc;J)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic e:Lo/axc;


# direct methods
.method constructor <init>(Lo/axc;J)V
    .locals 0

    .line 399
    iput-object p1, p0, Lo/axc$5;->e:Lo/axc;

    iput-wide p2, p0, Lo/axc$5;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 403
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/axc$5;->e:Lo/axc;

    iget-wide v2, p0, Lo/axc$5;->a:J

    invoke-static {v1, v2, v3}, Lo/axc;->a(Lo/axc;J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 404
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 409
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "getUserSettingLoginListener onLoginError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    return-void
.end method
