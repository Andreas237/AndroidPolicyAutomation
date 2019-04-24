.class final Lo/baq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 39
    iget v0, p0, Lo/baq;->c:I

    .line 40
    return v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lo/baq;->d:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/baq;->d:Ljava/lang/String;

    .line 51
    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 45
    iput p1, p0, Lo/baq;->c:I

    .line 46
    return-void
.end method
