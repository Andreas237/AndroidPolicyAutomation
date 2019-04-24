.class public Lo/eup;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 46
    iget v0, p0, Lo/eup;->e:I

    return v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/eup;->c:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/eup;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/eup;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lo/eup;->a:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/eup;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 50
    iput p1, p0, Lo/eup;->e:I

    .line 51
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lo/eup;->d:Ljava/lang/String;

    .line 35
    return-void
.end method
