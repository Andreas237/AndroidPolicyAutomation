.class public Lo/ehe$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ehe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field c:Lo/eic;

.field d:Z

.field e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ehe$a;->d:Z

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ehe$a;->e:Z

    .line 55
    sget-object v0, Lo/eic;->a:Lo/eic;

    iput-object v0, p0, Lo/ehe$a;->c:Lo/eic;

    .line 57
    const-string v0, "default"

    iput-object v0, p0, Lo/ehe$a;->b:Ljava/lang/String;

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/ehe$a;->a:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lo/ehe$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lo/ehe$a;
    .locals 0

    .line 102
    iput-object p1, p0, Lo/ehe$a;->b:Ljava/lang/String;

    .line 103
    return-object p0
.end method

.method public c(I)Lo/ehe$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 93
    iput p1, p0, Lo/ehe$a;->a:I

    .line 94
    return-object p0
.end method

.method public c(Lo/eic;)Lo/ehe$a;
    .locals 0

    .line 82
    iput-object p1, p0, Lo/ehe$a;->c:Lo/eic;

    .line 83
    return-object p0
.end method

.method public d()Lo/eic;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/ehe$a;->c:Lo/eic;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 98
    iget v0, p0, Lo/ehe$a;->a:I

    return v0
.end method
