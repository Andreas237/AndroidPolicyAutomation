.class public Lo/bpr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lo/bpr;->c:I

    .line 16
    iput-object p2, p0, Lo/bpr;->a:Ljava/lang/String;

    .line 17
    iput-object p3, p0, Lo/bpr;->d:Ljava/lang/String;

    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bpr;->d:Ljava/lang/String;

    .line 65
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/bpr;->a:Ljava/lang/String;

    .line 54
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/bpr;->d:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public e()I
    .locals 1

    .line 42
    iget v0, p0, Lo/bpr;->c:I

    .line 43
    return v0
.end method

.method e(I)V
    .locals 0

    .line 48
    iput p1, p0, Lo/bpr;->c:I

    .line 49
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/bpr;->a:Ljava/lang/String;

    .line 60
    return-void
.end method
