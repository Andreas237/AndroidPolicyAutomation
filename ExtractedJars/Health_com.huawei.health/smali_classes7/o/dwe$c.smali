.class public Lo/dwe$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dwe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:D

.field private e:I

.field private g:Ljava/lang/String;

.field private i:I

.field private k:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lo/dwe$c;
    .locals 0

    .line 129
    iput p1, p0, Lo/dwe$c;->e:I

    .line 130
    return-object p0
.end method

.method public b(I)Lo/dwe$c;
    .locals 0

    .line 134
    iput p1, p0, Lo/dwe$c;->i:I

    .line 135
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/dwe$c;
    .locals 0

    .line 139
    iput-object p1, p0, Lo/dwe$c;->g:Ljava/lang/String;

    .line 140
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/dwe$c;
    .locals 0

    .line 144
    iput-object p1, p0, Lo/dwe$c;->a:Ljava/lang/String;

    .line 145
    return-object p0
.end method

.method public d(D)Lo/dwe$c;
    .locals 0

    .line 124
    iput-wide p1, p0, Lo/dwe$c;->k:D

    .line 125
    return-object p0
.end method

.method public d(I)Lo/dwe$c;
    .locals 0

    .line 114
    iput p1, p0, Lo/dwe$c;->c:I

    .line 115
    return-object p0
.end method

.method public e(D)Lo/dwe$c;
    .locals 0

    .line 119
    iput-wide p1, p0, Lo/dwe$c;->d:D

    .line 120
    return-object p0
.end method

.method public e(I)Lo/dwe$c;
    .locals 0

    .line 109
    iput p1, p0, Lo/dwe$c;->b:I

    .line 110
    return-object p0
.end method

.method public e()Lo/dwe;
    .locals 3

    .line 149
    new-instance v2, Lo/dwe;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/dwe;-><init>(Lo/dwe$4;)V

    .line 150
    iget-object v0, p0, Lo/dwe$c;->g:Ljava/lang/String;

    invoke-static {v2, v0}, Lo/dwe;->e(Lo/dwe;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    iget v0, p0, Lo/dwe$c;->b:I

    invoke-static {v2, v0}, Lo/dwe;->d(Lo/dwe;I)I

    .line 152
    iget-object v0, p0, Lo/dwe$c;->a:Ljava/lang/String;

    invoke-static {v2, v0}, Lo/dwe;->a(Lo/dwe;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    iget-wide v0, p0, Lo/dwe$c;->k:D

    invoke-static {v2, v0, v1}, Lo/dwe;->c(Lo/dwe;D)D

    .line 154
    iget v0, p0, Lo/dwe$c;->i:I

    invoke-static {v2, v0}, Lo/dwe;->e(Lo/dwe;I)I

    .line 155
    iget v0, p0, Lo/dwe$c;->c:I

    invoke-static {v2, v0}, Lo/dwe;->c(Lo/dwe;I)I

    .line 156
    iget-wide v0, p0, Lo/dwe$c;->d:D

    invoke-static {v2, v0, v1}, Lo/dwe;->d(Lo/dwe;D)D

    .line 157
    iget v0, p0, Lo/dwe$c;->e:I

    invoke-static {v2, v0}, Lo/dwe;->a(Lo/dwe;I)I

    .line 158
    return-object v2
.end method
