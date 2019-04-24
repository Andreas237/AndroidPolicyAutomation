.class final Lo/tj;
.super Lo/tg;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final e:Z


# direct methods
.method constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/tg;-><init>(I)V

    .line 41
    iput-object p2, p0, Lo/tj;->a:Ljava/lang/String;

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/tj;->e:Z

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/tj;->b:I

    .line 44
    return-void
.end method

.method constructor <init>(ILjava/lang/String;I)V
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lo/tg;-><init>(I)V

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/tj;->e:Z

    .line 49
    iput p3, p0, Lo/tj;->b:I

    .line 50
    iput-object p2, p0, Lo/tj;->a:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method b()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lo/tj;->e:Z

    return v0
.end method

.method c()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/tj;->a:Ljava/lang/String;

    return-object v0
.end method

.method e()I
    .locals 1

    .line 62
    iget v0, p0, Lo/tj;->b:I

    return v0
.end method
