.class public Lo/dkb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 31
    iget v0, p0, Lo/dkb;->d:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/dkb;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 35
    iput p1, p0, Lo/dkb;->d:I

    .line 36
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lo/dkb;->e:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/dkb;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lo/dkb;->c:Ljava/lang/String;

    .line 20
    return-void
.end method
