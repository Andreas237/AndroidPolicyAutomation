.class public Lo/aqy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;I)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lo/aqy;->e:I

    .line 58
    iput-object p1, p0, Lo/aqy;->b:Ljava/lang/String;

    .line 59
    iput-wide p2, p0, Lo/aqy;->f:J

    .line 60
    iput-object p4, p0, Lo/aqy;->c:Ljava/lang/String;

    .line 61
    iput p5, p0, Lo/aqy;->a:I

    .line 62
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lo/aqy;->c:Ljava/lang/String;

    .line 99
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lo/aqy;->d:Ljava/lang/String;

    .line 93
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 86
    iget v0, p0, Lo/aqy;->e:I

    .line 87
    return v0
.end method

.method public d()J
    .locals 2

    .line 104
    iget-wide v0, p0, Lo/aqy;->f:J

    .line 105
    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/aqy;->b:Ljava/lang/String;

    .line 81
    return-object v0
.end method

.method public e(Ljava/lang/String;I)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/aqy;->d:Ljava/lang/String;

    .line 75
    iput p2, p0, Lo/aqy;->e:I

    .line 76
    return-void
.end method
