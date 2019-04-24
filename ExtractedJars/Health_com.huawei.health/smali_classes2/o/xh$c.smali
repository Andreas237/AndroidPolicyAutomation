.class public Lo/xh$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/xh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:D

.field private b:I

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:D

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lo/xh$c;
    .locals 0

    .line 100
    iput p1, p0, Lo/xh$c;->d:I

    .line 101
    return-object p0
.end method

.method public b(I)Lo/xh$c;
    .locals 0

    .line 120
    iput p1, p0, Lo/xh$c;->i:I

    .line 121
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/xh$c;
    .locals 0

    .line 130
    iput-object p1, p0, Lo/xh$c;->c:Ljava/lang/String;

    .line 131
    return-object p0
.end method

.method public c(I)Lo/xh$c;
    .locals 0

    .line 95
    iput p1, p0, Lo/xh$c;->e:I

    .line 96
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/xh$c;
    .locals 0

    .line 125
    iput-object p1, p0, Lo/xh$c;->f:Ljava/lang/String;

    .line 126
    return-object p0
.end method

.method public d()Lo/xh;
    .locals 3

    .line 135
    new-instance v2, Lo/xh;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/xh;-><init>(Lo/xh$2;)V

    .line 136
    iget-object v0, p0, Lo/xh$c;->f:Ljava/lang/String;

    invoke-static {v2, v0}, Lo/xh;->d(Lo/xh;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    iget v0, p0, Lo/xh$c;->e:I

    invoke-static {v2, v0}, Lo/xh;->b(Lo/xh;I)I

    .line 138
    iget-object v0, p0, Lo/xh$c;->c:Ljava/lang/String;

    invoke-static {v2, v0}, Lo/xh;->b(Lo/xh;Ljava/lang/String;)Ljava/lang/String;

    .line 139
    iget-wide v0, p0, Lo/xh$c;->g:D

    invoke-static {v2, v0, v1}, Lo/xh;->e(Lo/xh;D)D

    .line 140
    iget v0, p0, Lo/xh$c;->i:I

    invoke-static {v2, v0}, Lo/xh;->a(Lo/xh;I)I

    .line 141
    iget v0, p0, Lo/xh$c;->d:I

    invoke-static {v2, v0}, Lo/xh;->e(Lo/xh;I)I

    .line 142
    iget-wide v0, p0, Lo/xh$c;->a:D

    invoke-static {v2, v0, v1}, Lo/xh;->b(Lo/xh;D)D

    .line 143
    iget v0, p0, Lo/xh$c;->b:I

    invoke-static {v2, v0}, Lo/xh;->d(Lo/xh;I)I

    .line 144
    return-object v2
.end method

.method public e(D)Lo/xh$c;
    .locals 0

    .line 105
    iput-wide p1, p0, Lo/xh$c;->a:D

    .line 106
    return-object p0
.end method

.method public e(I)Lo/xh$c;
    .locals 0

    .line 115
    iput p1, p0, Lo/xh$c;->b:I

    .line 116
    return-object p0
.end method
