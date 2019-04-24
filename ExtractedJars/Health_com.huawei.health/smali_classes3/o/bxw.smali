.class public Lo/bxw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 29
    iput p1, p0, Lo/bxw;->e:I

    .line 30
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/bxw;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 21
    iput p1, p0, Lo/bxw;->b:I

    .line 22
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lo/bxw;->c:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public c()I
    .locals 1

    .line 17
    iget v0, p0, Lo/bxw;->b:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bxw;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 25
    iget v0, p0, Lo/bxw;->e:I

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/bxw;->d:Ljava/lang/String;

    .line 46
    return-void
.end method
