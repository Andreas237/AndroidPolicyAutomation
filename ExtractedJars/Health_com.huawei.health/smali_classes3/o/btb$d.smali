.class Lo/btb$d;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/btb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private d:Lo/bui;


# direct methods
.method public constructor <init>(Lo/bui;)V
    .locals 0

    .line 213
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 214
    iput-object p1, p0, Lo/btb$d;->d:Lo/bui;

    .line 215
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 1

    .line 219
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0}, Lo/bui;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 220
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 222
    :cond_0
    return-void
.end method

.method public c(JJ)V
    .locals 1

    .line 233
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0}, Lo/bui;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/bui;->c(JJ)V

    .line 236
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1

    .line 226
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0}, Lo/bui;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0, p1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 229
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    .line 240
    iget-object v0, p0, Lo/btb$d;->d:Lo/bui;

    invoke-virtual {v0}, Lo/bui;->e()Z

    move-result v0

    return v0
.end method
