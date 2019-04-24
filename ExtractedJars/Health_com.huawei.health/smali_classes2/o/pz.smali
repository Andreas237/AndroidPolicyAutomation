.class public final Lo/pz;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 31
    sget-object v0, Lo/ps;->b:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 32
    iput-object p1, p0, Lo/pz;->a:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lo/pz;->b:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/pz;->a:Ljava/lang/String;

    return-object v0
.end method
