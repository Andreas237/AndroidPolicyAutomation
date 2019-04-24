.class public final Lo/po;
.super Lo/pr;
.source "SourceFile"


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 27
    sget-object v0, Lo/ps;->l:Lo/ps;

    invoke-direct {p0, v0}, Lo/pr;-><init>(Lo/ps;)V

    .line 28
    iput-object p1, p0, Lo/po;->e:Ljava/lang/String;

    .line 29
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/po;->e:Ljava/lang/String;

    return-object v0
.end method
