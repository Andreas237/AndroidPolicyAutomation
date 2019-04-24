.class public Lo/aei;
.super Lo/afz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aei$a;
    }
.end annotation


# instance fields
.field private a:Lo/aei$a;

.field private c:Lo/aed;

.field private d:Lo/aeg;

.field private e:Lo/aee;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lo/afz;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/aee;)V
    .locals 1

    .line 35
    sget-object v0, Lo/aei$a;->c:Lo/aei$a;

    iput-object v0, p0, Lo/aei;->a:Lo/aei$a;

    .line 36
    iput-object p1, p0, Lo/aei;->e:Lo/aee;

    .line 37
    return-void
.end method

.method public a(Lo/aeg;)V
    .locals 1

    .line 44
    sget-object v0, Lo/aei$a;->d:Lo/aei$a;

    iput-object v0, p0, Lo/aei;->a:Lo/aei$a;

    .line 45
    iput-object p1, p0, Lo/aei;->d:Lo/aeg;

    .line 46
    return-void
.end method

.method public b(Lo/aed;)V
    .locals 1

    .line 53
    sget-object v0, Lo/aei$a;->a:Lo/aei$a;

    iput-object v0, p0, Lo/aei;->a:Lo/aei$a;

    .line 54
    iput-object p1, p0, Lo/aei;->c:Lo/aed;

    .line 55
    return-void
.end method
