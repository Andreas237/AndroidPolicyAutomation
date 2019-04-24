.class public Lo/wc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:J

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 46
    iget v0, p0, Lo/wc;->b:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 84
    iput p1, p0, Lo/wc;->k:I

    .line 85
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 22
    iput-wide p1, p0, Lo/wc;->c:J

    .line 23
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lo/wc;->a:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 65
    iput p1, p0, Lo/wc;->i:I

    .line 66
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/wc;->f:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public c()J
    .locals 2

    .line 26
    iget-wide v0, p0, Lo/wc;->c:J

    return-wide v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/wc;->d:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 57
    iput p1, p0, Lo/wc;->e:I

    .line 58
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 49
    iput p1, p0, Lo/wc;->b:I

    .line 50
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/wc;->h:Ljava/lang/String;

    .line 70
    return-void
.end method
