.class Lo/evg$d;
.super Lo/evj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/evg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Lo/evj;


# direct methods
.method public constructor <init>(Lo/evj;)V
    .locals 0

    .line 236
    invoke-direct {p0}, Lo/evj;-><init>()V

    .line 237
    iput-object p1, p0, Lo/evg$d;->a:Lo/evj;

    .line 238
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    .line 256
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/evj;->a(JJ)V

    .line 259
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 249
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 250
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0, p1}, Lo/evj;->a(Ljava/lang/Object;)V

    .line 252
    :cond_0
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 1

    .line 242
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0, p1, p2}, Lo/evj;->b(ILjava/lang/String;)V

    .line 245
    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 263
    iget-object v0, p0, Lo/evg$d;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    return v0
.end method
