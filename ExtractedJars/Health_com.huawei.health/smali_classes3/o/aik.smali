.class public Lo/aik;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/ail;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aik;->a:Lo/ail;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;Lo/aiy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lo/aiq$d;)V
    .locals 5

    .line 92
    new-instance v4, Lo/aio;

    invoke-direct {v4, p2, p3, p4}, Lo/aio;-><init>(Lo/aiy;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-static {p1}, Lo/ajb;->e(Ljava/lang/String;)V

    .line 94
    iput-object v4, p0, Lo/aik;->a:Lo/ail;

    .line 95
    const-string v0, "CoapsDeviceApi"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeAdvancedIdentifyCode: ip = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "; body = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aik;->a:Lo/ail;

    invoke-virtual {v2}, Lo/ail;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/aik;->a:Lo/ail;

    invoke-virtual {v4}, Lo/aio;->c()Lo/ain;

    move-result-object v1

    invoke-static {v0, p5, v1, p6}, Lo/ajb;->d(Lo/ail;Ljava/lang/Integer;Lo/ain;Lo/aiq$d;)V

    .line 97
    return-void
.end method

.method public c(Ljava/lang/String;Lo/aiy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ILo/aiq$d;)V
    .locals 7

    .line 75
    new-instance v0, Lo/ait;

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move v6, p7

    invoke-direct/range {v0 .. v6}, Lo/ait;-><init>(Lo/aiy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)V

    iput-object v0, p0, Lo/aik;->a:Lo/ail;

    .line 76
    invoke-static {p1}, Lo/ajb;->e(Ljava/lang/String;)V

    .line 77
    const-string v0, "CoapsDeviceApi"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeIdentifyCode: ip = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "; body = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aik;->a:Lo/ail;

    invoke-virtual {v2}, Lo/ail;->b()[B

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 78
    iget-object v0, p0, Lo/aik;->a:Lo/ail;

    invoke-static {v0, p8}, Lo/ajb;->c(Lo/ail;Lo/aiq$d;)V

    .line 79
    return-void
.end method

.method public c(Lo/ais;Lo/aiq$d;)V
    .locals 4

    .line 34
    new-instance v0, Lo/aim;

    invoke-direct {v0, p1}, Lo/aim;-><init>(Lo/ais;)V

    iput-object v0, p0, Lo/aik;->a:Lo/ail;

    .line 35
    const-string v0, "238.238.238.238"

    invoke-static {v0}, Lo/ajb;->e(Ljava/lang/String;)V

    .line 36
    const-string v0, "CoapsDeviceApi"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createSessionInterface: body = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aik;->a:Lo/ail;

    invoke-virtual {v2}, Lo/ail;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lo/aik;->a:Lo/ail;

    invoke-static {v0, p2}, Lo/ajb;->d(Lo/ail;Lo/aiq$d;)V

    .line 38
    return-void
.end method

.method public d(Ljava/lang/String;Lo/aiw;Lo/aiq$d;)V
    .locals 4

    .line 59
    new-instance v0, Lo/aip;

    invoke-direct {v0, p2}, Lo/aip;-><init>(Lo/aiw;)V

    iput-object v0, p0, Lo/aik;->a:Lo/ail;

    .line 60
    invoke-static {p1}, Lo/ajb;->e(Ljava/lang/String;)V

    .line 61
    const-string v0, "CoapsDeviceApi"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createSessionInterface: ip = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, "; body = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aik;->a:Lo/ail;

    invoke-virtual {v2}, Lo/ail;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lo/aik;->a:Lo/ail;

    invoke-static {v0, p3}, Lo/ajb;->e(Lo/ail;Lo/aiq$d;)V

    .line 63
    return-void
.end method
