.class public Lo/aco;
.super Lo/acp;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lo/acp;-><init>()V

    .line 19
    iput-object p1, p0, Lo/aco;->e:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lo/aco;->b:Ljava/lang/String;

    .line 21
    iput p3, p0, Lo/aco;->d:I

    .line 22
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/aco;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lo/aby;)Z
    .locals 1

    .line 26
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/aco;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Z
    .locals 1

    .line 41
    const/4 v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 1

    .line 31
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    .line 66
    iget v0, p0, Lo/aco;->d:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/aco;->b:Ljava/lang/String;

    return-object v0
.end method
