.class public Lo/aer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:[B

.field private e:Lo/aeo$a;


# direct methods
.method public constructor <init>(Lo/aeo$a;[B)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lo/aer;->e:Lo/aeo$a;

    .line 13
    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    iput-object v0, p0, Lo/aer;->a:[B

    .line 14
    return-void
.end method


# virtual methods
.method public b()Lo/aeo$a;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/aer;->e:Lo/aeo$a;

    return-object v0
.end method

.method public e()[B
    .locals 1

    .line 25
    iget-object v0, p0, Lo/aer;->a:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/aer;->a:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    return-object v0
.end method
