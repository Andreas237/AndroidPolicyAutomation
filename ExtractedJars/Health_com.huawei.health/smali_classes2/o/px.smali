.class public final Lo/px;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final b:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 32
    sget-object v0, Lo/ps;->a:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 33
    iput-object p1, p0, Lo/px;->e:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lo/px;->b:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/px;->e:Ljava/lang/String;

    return-object v0
.end method
